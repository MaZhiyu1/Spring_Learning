package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.beans")
@ComponentScan("com.example.service")
@ComponentScan("com.example.implement")
public class Config {

}
