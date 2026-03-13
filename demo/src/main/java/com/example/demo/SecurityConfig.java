package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .authorizeHttpRequests(auth -> {
                auth.requestMatchers("/home", "/profile", "/leaderboard").permitAll();
                auth.requestMatchers("/settings").hasRole("USER");
                auth.requestMatchers("/admin").hasRole("ADMIN");
                auth.anyRequest().hasAnyRole("ADMIN");
            }).formLogin(form -> form
                .defaultSuccessUrl("/home"))
            .build();
    };

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails Henry = User.withUsername("Henry")
        .password("{noop}password")
        .roles("USER")
        .build();

        UserDetails Mallory = User.withUsername("Mallory")
        .password("{noop}password")
        .roles("USER")
        .build();

        UserDetails Admin = User.withUsername("Admin")
        .password("{noop}password")
        .roles("ADMIN")
        .build();

        return new InMemoryUserDetailsManager(Henry, Mallory, Admin);
    }
}