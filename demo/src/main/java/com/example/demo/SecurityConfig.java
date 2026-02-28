
// package com.example.demo;

// import java.security.Security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.Customizer;
// import org.springframework.seccurity.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bycrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class SecurityConfig {
    
//     @Bean
//     SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http

//         .csrf(csrf -> csrf.disable());
// // 
//         .authorizeHTTPRequests(auth -> auth
//             .requestMatchers("/guest/**").permitAll()
//             .requestMatchers("/player/**").hasRole("PLAYER")
//             .requestMatchers("/admin/**").hasRole("ADMIN")
//             .anyRequest().authenticated()
//         ).httpBasic(Customizer.withDefaults());
//         return http.build();
//     }

// }
