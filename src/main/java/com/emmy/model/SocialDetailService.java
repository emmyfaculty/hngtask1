package com.emmy.model;

import com.emmy.dtos.DoMathDto;
import com.emmy.dtos.MathResponseDto;
import com.emmy.dtos.SlackDetailsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SocialDetailService {

    public SlackDetailsDTO getAllSlackDetails(){
        SlackDetailsDTO slackDetailsDTOS = new SlackDetailsDTO("emmyfaculty",
                true,
                25,
                "HNG 9.0 Backend developer");
        return slackDetailsDTOS;
    }

    public MathResponseDto doMath(DoMathDto doMathDto) {
        String operation_type = doMathDto.getOperation_type();
        int xValue = doMathDto.getX();
        int yValue = doMathDto.getY();
        int result = 0;
        if (operation_type.equalsIgnoreCase("ADDITION")){
            result = xValue + yValue;
        } else if (operation_type.equalsIgnoreCase("SUBTRACTION")){
            result = xValue - yValue;
        } else if (operation_type.equalsIgnoreCase("MULTIPLICATION")){
            result = xValue * yValue;
        }
//
        return MathResponseDto
                .builder()
                .slackUsername("emmyfaculty")
                .operation_type(operation_type)
                .result(result)
                .build();
    }
}
