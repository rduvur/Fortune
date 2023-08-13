package com.example.fortune;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneController {

    private static final String template = "Hello user. Here is your fortune: %s ";
    private static fortuneList fortune = new fortuneList();

    @GetMapping("/fortune")
    public String fortune () {
        return String.format(template, fortune.getFortune());
    }
}
