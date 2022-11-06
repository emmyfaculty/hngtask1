package com.emmy.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DoMathDto {
    private int num1;
    private int num2;
    private String operation_type;


}

