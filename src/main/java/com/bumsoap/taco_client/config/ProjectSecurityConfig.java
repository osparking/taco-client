package com.bumsoap.taco_client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)
            throws Exception {
        http.authorizeRequests(requests ->requests.anyRequest().authenticated())
            .oauth2Login(oauth2Login -> oauth2Login.loginPage(
                        "/oauth2/authorization/taco-admin-client"))
            .oauth2Client(Customizer.withDefaults());

        return http.build();
    }
}
