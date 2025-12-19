package com.telecom.spring_security_demo;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

// @Configuration
// @EnableWebSecurity
public class SecurityConfig_Default {
    // @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
        .formLogin(Customizer.withDefaults())
        .httpBasic(Customizer.withDefaults());
        // .exceptionHandling(ex -> ex
        //     .defaultAuthenticationEntryPointFor(
        //         new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED),
        //         new MediaTypeRequestMatcher(MediaType.APPLICATION_JSON)
        //     )
        // );

    return http.build();
    }
}
