package jp.tfn.udemy.springintro.codedef;

import java.util.Arrays;

import lombok.Getter;

@Getter
public enum TodoTypeEnum {

    EM("01", "緊急"),
    IM("02", "重要"),
    WT("03", "できれば"),
    ;

    private String todoTypeId;
    private String typeName;

    TodoTypeEnum(String todoTypeId, String typeName) {
        this.todoTypeId = todoTypeId;
        this.typeName = typeName;
        System.out.println("aaa");
    }

    public static TodoTypeEnum getEnum(String todoTypeId) {
        return Arrays.stream(TodoTypeEnum.values())
                .filter(t -> t.getTodoTypeId().equals(todoTypeId))
                .findFirst()
                .orElseThrow();
    }

}
