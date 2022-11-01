package com.emmy.controller;

import com.emmy.dtos.SlackDetailsDTO;
import com.emmy.model.SocialDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SlackController {

    @Autowired
    private SocialDetailService socialDetailService;

    @GetMapping("/slack-details")
    public List<SlackDetailsDTO> all_slack_details(){
        return socialDetailService.getAllSlackDetails();
    }

//    //pushing
//    @GetMapping("/get")
//    public SlackDetailsDTO getSlackDetails(){
//        SlackDetailsDTO detailsDTO = new SlackDetailsDTO("emmyfaculty",
//                true,
//                25,
//                "HNG 9.0 Backend developer");
//        return detailsDTO;
//    }
}
