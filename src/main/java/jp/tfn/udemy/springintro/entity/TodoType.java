package jp.tfn.udemy.springintro.entity;

import lombok.Data;

@Data
public class TodoType {

    private String todoTypeId;
    private String typeName;
    private String comment;

}
