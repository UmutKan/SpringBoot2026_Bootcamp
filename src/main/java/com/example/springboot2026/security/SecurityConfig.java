package com.example.springboot2026.security;

/*
Basit Spring Security: JWT ve kullanıcı verştabanı yoktur
Swagger/OpenAI: http://localhost:5555/swagger-ui/index.html
H2DB: http://localhost:5555/h2-console
 */
/*
USERNAME:admin
PASSWORD:admin123
localhost:5555
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    /*
    @Value("${app.security.username}")
    String username;

    @Value("${app.security.password}")
    String password;
*/    
    /*
    application.properties ==> ortam değişkeninin ADMIM bilgilerini oluştur
     */
    
    @Bean
    public UserDetailsService userDetailsService(    
            @Value("${app.security.username:hamitmizrak@gmail.com}")
            String username,
            @Value("${app.security.password:root}")
            String password,
            PasswordEncoder passwordEncoder) {
        UserDetails userDetails = User.withUsername(username)
                .password(passwordEncoder.encode(password))
                .roles("ADMIN")
                .build();
        
        return new InMemoryUserDetailsManager(userDetails);
    }
    /*
     * Swagger ve H2-Console için anonim erişim sağlansın
     * CSRF sadece H2 Console için devre dışı, diğer entpoint'lerde korunsun
     * H2-Console iframe kullanığından SAMEORIGIN gerekir.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{

        //H2 Console
        return null;
    }
}// end UserDetailService
