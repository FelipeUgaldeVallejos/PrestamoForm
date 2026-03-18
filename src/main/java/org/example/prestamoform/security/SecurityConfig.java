package org.example.prestamoform.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(customizer -> customizer
                        .requestMatchers("/", "/presentation/prestamos/list",
                                "/presentation/prestamos/search",
                                "/css/**", "/images/**").permitAll()
                        .requestMatchers("/presentation/prestamos/show",
                                "/presentation/prestamos/create",
                                "/presentation/prestamos/edit/**",
                                "/presentation/prestamos/delete/**",
                                "/presentation/prestamos/update").hasAuthority("ADM")
                        .anyRequest().authenticated()
                ).formLogin(customizer -> customizer
                        .loginPage("/login")
                        .permitAll()
                        .defaultSuccessUrl("/presentation/prestamos/list")
                ).logout(customizer -> customizer
                        .permitAll()
                        .logoutSuccessUrl("/")
                ).exceptionHandling(customizer -> customizer
                        .accessDeniedPage("/notAuthorized")
                ).csrf( customizer -> customizer.disable());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder(); }
}
