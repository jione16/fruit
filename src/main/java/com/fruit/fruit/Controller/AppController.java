package com.fruit.fruit.Controller;

import com.fruit.fruit.devUtils.Dev;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class AppController {
    @GetMapping("/")
    public String index(Principal principal) {
        if (principal == null) {
            return "login";
        } else {
            Dev.print(principal);
            return "index";
        }

    }
}
