package com.example.demo.model;

import com.example.demo.annotation.UniqueEmail;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @NotNull
    @NotNull(message = "{com.example.demo.username.notnull}")
    @Size(min = 3, max=10)
    private String username;

//    @NotNull
    @NotNull(message = "{com.example.demo.email.notnull}")
    @Email
    @UniqueEmail
    private String email;

//    @NotNull
    @NotNull(message = "{com.example.demo.password.notnull}")
    private String password;

}
