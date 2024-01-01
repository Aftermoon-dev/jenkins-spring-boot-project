package dev.aftermoon.jenkins_practice_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsPracticeSpringBootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JenkinsPracticeSpringBootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsPracticeSpringBootApplication.class, args);
    }

}
