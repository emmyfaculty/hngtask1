package com.emmy.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MathResponseDto {
    private String slackUsername;
    private  int result;
    private String operation_type;


}
