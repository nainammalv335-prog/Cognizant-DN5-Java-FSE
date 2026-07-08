package com.cognizant;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@SpringBootApplication
@RestController
public class JwtAuthenticationApplication {

    private static final String SECRET_KEY = "mysecretkeymysecretkeymysecretkey";

    public static void main(String[] args) {
        SpringApplication.run(JwtAuthenticationApplication.class, args);
    }

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody AuthenticationRequest request) {

        if ("user".equals(request.getUsername()) &&
                "pwd".equals(request.getPassword())) {

            return generateToken(request.getUsername());
        }

        return "Invalid Username or Password";
    }

    public static String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    static class AuthenticationRequest {

        private String username;
        private String password;

        public AuthenticationRequest() {
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
