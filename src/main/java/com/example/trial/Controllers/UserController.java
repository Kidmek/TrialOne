package com.example.trial.Controllers;

import com.example.trial.Service.UserService;
import com.example.trial.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/users")
public class UserController extends Controller<User>{

    private final UserService userService;

    public UserController(UserService userService) {
        super.service = userService;
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity add(@Valid @RequestBody User user , BindingResult bindingResult){
        return super.add(user, bindingResult);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity edit(@Valid @RequestBody User user , @PathVariable("id") Integer id , BindingResult bindingResult){
        return super.edit(user, id,bindingResult);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity delete( @PathVariable("id") Integer id ){
        return super.delete(id);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity get(@PathVariable("id") Integer id ){
        return super.get(id);
    }
}
