package org.restful.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("org.restful.example.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
