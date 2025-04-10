package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;


public class ResponseDTO {
    @JsonProperty
    private String message;
    @JsonProperty
    private int status;
    @JsonProperty
    private LocalDateTime timestamp;

    public ResponseDTO(String message, int status, LocalDateTime timestamp) {
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
