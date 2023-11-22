package jp.tfn.udemy.springintro.controller;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class InquiryForm {

    @Size(min = 1, max = 20, message = "Please input 20 characters or less")
    private String name;

    @NotNull
    @Email(message = "invalid email format")
    private String email;

    @NotNull
    private String contents;

}
