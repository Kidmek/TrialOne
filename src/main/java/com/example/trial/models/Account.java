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
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(
            name = "customer_id" ,
            referencedColumnName = "id")
    @NotNull(message = "Customer Required")
    @JsonIgnoreProperties("{account}")
    private Customer customer;

    @Column(unique = true)
    @NotNull(message = "Account Number Required")
    private Integer accountNum;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Account Type Required")
    private AccountType accountType;

    @OneToMany
    private List<Transaction> transaction;

}
