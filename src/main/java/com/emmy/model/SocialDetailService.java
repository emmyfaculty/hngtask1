package com.emmy.model;

import com.emmy.dtos.SlackDetailsDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SocialDetailService {
    private List<SlackDetailsDTO> slackDetailsDTOS = new ArrayList<>(Arrays.asList(new SlackDetailsDTO("emmyfaculty",
            true,
            25,
            "HNG 9.0 Backend developer")));

    public List<SlackDetailsDTO> getAllSlackDetails(){
        return slackDetailsDTOS;
    }
}
