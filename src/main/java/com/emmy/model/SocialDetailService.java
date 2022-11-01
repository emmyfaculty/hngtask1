package com.emmy.model;

import com.emmy.dtos.SlackDetailsDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SocialDetailService {

    public SlackDetailsDTO getAllSlackDetails(){
        SlackDetailsDTO slackDetailsDTOS = new SlackDetailsDTO("emmyfaculty",
                true,
                25,
                "HNG 9.0 Backend developer");
        return slackDetailsDTOS;
    }
}
