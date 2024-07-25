package com.bezkoder.spring.security.postgresql.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class AnswerResponseDto {


    private Long id;
    private String content;
    private String username;
    private String createdAt;
    private String updatedAt;

    private List<String> votes;
    private List<String> favorites;
    private Long userId;


}
