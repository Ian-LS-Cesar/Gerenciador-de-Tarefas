package com.ilm.Gerenciador_de_Tarefas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())  // Disabling CSRF protection (if needed)
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/", "/cadastro", "/api/usuario/cadastro", "/api/usuario/login").permitAll()
                                .requestMatchers("/css/**", "/js/**").permitAll() 
                                .requestMatchers("/tarefas").authenticated()  
                                .anyRequest().authenticated()  
                )
                .formLogin(form -> form
                        .loginPage("/")
                        .loginProcessingUrl("/api/usuario/login")  
                        .permitAll()  
                )
                .logout(logout -> logout
                        .permitAll()
                );
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
