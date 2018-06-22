package com.techclimber.EmailService.web;

import com.techclimber.EmailService.domain.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailController {

    @Autowired
    public EmailServiceImpl emailService;

    @RequestMapping(value="/email/{to}/{subject}/{text}", method=RequestMethod.GET)
    public @ResponseBody String email(@PathVariable(value="to")String to,
                                      @PathVariable(value="subject") String subject,
                                      @PathVariable(value="text") String text){
        emailService.sendSimpleMessage(to, subject, text);
        return "successful email";
    }
}
