package com.telecom.spring_security_demo;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig_WIthout_Lambda {
    // @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        // http.csrf(customizer -> customizer.disable()); //disabel csrf
        // http.authorizeHttpRequests(request->request.anyRequest().authenticated()); //authenticate http request
        // // http.formLogin(Customizer.withDefaults());
        // http.httpBasic(Customizer.withDefaults());
        
         // http.csrf(customizer -> customizer.disable()); //disabel csrf
        Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {

            @Override
            public void customize(CsrfConfigurer<HttpSecurity> configurer) {
                configurer.disable();    
            }
            
        };
        http.csrf(custCsrf);

        // http.authorizeHttpRequests(request->request.anyRequest().authenticated()); //authenticate http request
        Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> custHttp = new Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry>() {

            @Override
            public void customize(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry registry) {
                registry.anyRequest().authenticated();
            }  
        };
        http.authorizeHttpRequests(custHttp);

        http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }
}
