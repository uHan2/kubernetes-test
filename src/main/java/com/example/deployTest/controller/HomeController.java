package com.example.deployTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HomeController {

    @GetMapping("/tmp")
    public int homeController() {
        return HttpServletResponse.SC_ACCEPTED;
    }

}
