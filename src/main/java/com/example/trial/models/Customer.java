package com.example.trial.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Name Must Be Given")
    private String name;

    @OneToOne
    @JoinColumn(name = "house", referencedColumnName = "houseNum")
    private Address address;

    @NotNull(message = "Age Must Be Given")
    private Integer age;

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST},
            orphanRemoval = true
    )
    @JsonIgnoreProperties({"customer"})
    private List<Account> account;
}
