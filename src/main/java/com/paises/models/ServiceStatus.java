package com.paises.models;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ServiceStatus {

    private String name;
    private String status;
    private HttpStatus httpStatus;

    public ServiceStatus(){}

    public ServiceStatus(String name, String status, HttpStatus httpStatus){
        this.name = name;
        this.status = status;
        this.httpStatus = httpStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
