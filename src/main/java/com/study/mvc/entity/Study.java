package com.study.mvc.entity;

import com.study.mvc.dto.DBStudySelectRespDto;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data

public class Study {
    private int id;
    private String name;
    private int age;
    private LocalDateTime createData;

    public DBStudySelectRespDto toDto() {
        return DBStudySelectRespDto.builder()
                .id(id)
                .name(name)
                .age(age)
                .build();
    }
}
