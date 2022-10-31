package com.emmy.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class SlackDetailsDTO {
    private String slackUsername;
    private boolean backend;
    private Integer age;
    private String bio;
}
