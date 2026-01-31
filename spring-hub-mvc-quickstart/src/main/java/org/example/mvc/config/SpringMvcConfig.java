package org.example.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("org.example.mvc.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
