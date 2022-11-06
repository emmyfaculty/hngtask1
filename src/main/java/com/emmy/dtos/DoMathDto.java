package com.emmy.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DoMathDto {
    private int x;
    private int y;
    private String operation_type;


}

