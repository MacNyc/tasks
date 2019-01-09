package com.crud.tasks.domain;

import lombok.*;

@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class TaskDto {
    private Long id;
    private String title;
    private String content;

    public TaskDto(){

    }

}
