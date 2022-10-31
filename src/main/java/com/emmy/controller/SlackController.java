package com.emmy.controller;

import com.emmy.dtos.SlackDetailsDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/slack-details")
@CrossOrigin(origins = "*")
public class SlackController {
    //pushing
    @GetMapping("/get")
    public SlackDetailsDTO getSlackDetails(){
        return new SlackDetailsDTO("emmyfaculty",
                 true,
                 25,
                "HNG 9.0 Backend developer");
    }
}
