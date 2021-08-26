package com.example.demo.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ApiError {

    private Integer status;
    private String message;
    private Long timestamp;
    private String path;
    private Map<String, String> validationErrors;

    public ApiError(Integer status, String message, String path) {
        super();
        this.timestamp = new Date().getTime();
        this.status = status;
        this.message = message;
        this.path = path;
    }

}
