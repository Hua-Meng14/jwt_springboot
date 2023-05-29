package com.example.springsecurityjwt.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService  implements UserDetailsService {

    @Value("${myapp.username}")
    private String USERNAME;

    @Value("${myapp.password}")
    private String PASSWORD;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new User(USERNAME, PASSWORD, new ArrayList<>());
    }
}
