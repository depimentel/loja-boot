package br.com.caelum.fj27.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by nando on 13/07/17.
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}
