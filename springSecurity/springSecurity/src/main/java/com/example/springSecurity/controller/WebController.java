package com.example.springSecurity.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class WebController implements ErrorController {
    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    // Cần role USER (authenticated) mới có thể vào
    @GetMapping("/profile")
    public String getProfile(){
        return "profile";
    }

    @GetMapping ("/error")
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return "error/error-404";
            }
            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return "error/error-500";
            }
            else if(statusCode == HttpStatus.UNAUTHORIZED.value()) {
                return "error/error-401";
            }
            else if(statusCode == HttpStatus.FORBIDDEN.value()) {
                return "error/error-403";
            }
        }
        return "error/error";
    }
}
