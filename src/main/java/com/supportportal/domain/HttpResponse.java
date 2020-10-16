package com.supportportal.domain;
import org.springframework.http.HttpStatus;

public class HttpResponse {
    private int httpStatusCode; // 200,201: success; ;400:user error ; 500 :server error
    private HttpStatus httpStatus;
    private String reason; // reason of http status
    private String message;// return message to user

    public HttpResponse() {
    }

    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String message) {
        this.httpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.message = message;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getReason() {
        return reason;
    }

    public String getMessage() {
        return message;
    }
}
