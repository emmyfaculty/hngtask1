package com.emmy.controller;

import com.emmy.dtos.DoMathDto;
import com.emmy.dtos.MathResponseDto;
import com.emmy.dtos.SlackDetailsDTO;
import com.emmy.model.SocialDetailService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class SlackController {

//    @Autowired
    private final SocialDetailService socialDetailService;

    @GetMapping("/slack-details")
    public SlackDetailsDTO all_slack_details(){
        return socialDetailService.getAllSlackDetails();
    }


    @PostMapping("/math")
    public ResponseEntity<MathResponseDto> doMath (@RequestBody DoMathDto doMathDto){
        MathResponseDto mathResponseDto = socialDetailService.doMath(doMathDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        if (mathResponseDto != null)
            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(mathResponseDto);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
