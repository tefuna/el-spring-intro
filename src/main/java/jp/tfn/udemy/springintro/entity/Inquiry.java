package jp.tfn.udemy.springintro.entity;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class Inquiry {

    private int id;
    private String name;
    private String email;
    private String contents;
    private OffsetDateTime created;

}
