package com.example.trial.Service;

import com.example.trial.Respository.UserRepo;
import com.example.trial.Respository.UserRepo;
import com.example.trial.models.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends MainService<User> {

    public boolean checkPhone(String phone){
        Optional<User> byPhone = userRepo.findUserByPhoneNumber(phone);
        if(byPhone.isPresent()){
            throw new RuntimeException("Phone Number Already Registered");
        }
        return false;
    }

    private final UserRepo userRepo;
    public UserService(UserRepo userRepo) {
        super.data = "User";
        super.repo = userRepo;
        this.userRepo = userRepo;
    }

    public User add(User user){
        checkPhone(user.getPhoneNumber());
        return super.add(user);
    }
    public User delete(Integer id){
        return super.delete(id);
    }
    public User edit(Integer id,User user){
        user.setId(id);
        checkPhone(user.getPhoneNumber());
        return super.edit(id,user);
    }
    public User get(Integer id){
        return super.get(id);
    }
}
