package jp.tfn.udemy.springintro.controller;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TodoForm {

    @NotNull
    private String todoTypeId;

    @NotNull
    private String title;

    @NotNull
    private String detail;

    @NotNull
    private String deadline;

}
