package com.example.apigeedemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("im")
public class PropertyConfig {

    private String request = "";
    private String host = "";
    private List<String> users = new ArrayList<>();

    public String getRequest() {
        return request;
    }

    public String getHost() {
        return host;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
