package com.example.trial.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @NotNull(message = "House Number Required")
    @Column(unique = true)
    private Integer houseNum;

    @NotNull(message = "Zip Code Required")
    private Integer zipcode;
    @NotBlank(message = "City Required")
    private String city;
    @NotBlank(message = "Country Required")
    private String country;
}
