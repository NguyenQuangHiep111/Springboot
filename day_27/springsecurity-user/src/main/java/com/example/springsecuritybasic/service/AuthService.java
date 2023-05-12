package com.example.springsecuritybasic.service;

import com.example.springsecuritybasic.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class AuthService {
    @Autowired
    private AuthenticationManager authenticationManager;

    public String login(LoginRequest request , HttpSession session){
        // tạo đối tượng xác thực
        UsernamePasswordAuthenticationToken token =
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword());

        // tiến hành xác thực
        Authentication authentication = authenticationManager.authenticate(token);

        //
        SecurityContextHolder .getContext().setAuthentication(authentication);
        //
        session.setAttribute("MY_SESSION" , authentication.getName());

        return "Login succes";

    }
}
