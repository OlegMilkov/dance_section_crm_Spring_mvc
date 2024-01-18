package com.example.project_for_nadya.configuration;


import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();

        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
        userDetailsManager.createUser(userBuilder.username("oleg").password("oleg").roles("EMPLOYEE").build());
        userDetailsManager.createUser(userBuilder.username("elena").password("elena").roles("HR").build());
        userDetailsManager.createUser(userBuilder.username("ivan").password("ivan").roles("MANAGER", "HR").build());

        return userDetailsManager;
    }


}


