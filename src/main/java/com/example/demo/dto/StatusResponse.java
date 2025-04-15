package com.example.demo.dto;

public class StatusResponse {
    private String serverUrl;
    private String status;
    private long timestamp;
    private int responseCode;

    // Конструкторы
    public StatusResponse() {
    }

    public StatusResponse(String serverUrl, String status, long timestamp, int responseCode) {
        this.serverUrl = serverUrl;
        this.status = status;
        this.timestamp = timestamp;
        this.responseCode = responseCode;
    }

    // Геттеры и сеттеры
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
}