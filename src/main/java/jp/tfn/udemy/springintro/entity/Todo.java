package jp.tfn.udemy.springintro.entity;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class Todo {

    private int id;
    private String userId;
    private TodoType todoType;
    private String title;
    private String detail;
    private OffsetDateTime deadline;

}
