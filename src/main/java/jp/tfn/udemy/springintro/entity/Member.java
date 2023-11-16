package jp.tfn.udemy.springintro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

    private int id;
    private String name;
    private String email;

}
