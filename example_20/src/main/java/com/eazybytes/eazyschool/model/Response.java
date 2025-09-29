package com.eazybytes.eazyschool.model;

public class Response {

    private String statusCode;
    private String statusMSg;

    // No-args constructor
    public Response() {
    }

    // All-args constructor
    public Response(String statusCode, String statusMSg) {
        this.statusCode = statusCode;
        this.statusMSg = statusMSg;
    }

    // Getter and Setter for statusCode
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    // Getter and Setter for statusMSg
    public String getStatusMSg() {
        return statusMSg;
    }

    public void setStatusMSg(String statusMSg) {
        this.statusMSg = statusMSg;
    }
}


