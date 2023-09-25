package com.example.demo.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("Default Name")
    public String defaultName;

    @Value("${mail.host}")
    public String host;

    @Value("${mail.email}")
    public String email;

    @Value("${mail.password}")
    public String password;

    @Value("${java.home}")
    private String javaHome;

    @Value("${Path}")
    private String pathVariable;

    public String getDefaultName() {
        return defaultName;
    }

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public String getPathVariable() {
        return pathVariable;
    }
}
