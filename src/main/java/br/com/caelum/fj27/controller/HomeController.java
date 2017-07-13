package br.com.caelum.fj27.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by nando on 12/07/17.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }
}
