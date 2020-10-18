package com.supportportal.domain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.util.Date;

public class HttpResponse {

    @JsonFormat(shape =JsonFormat.Shape.STRING,pattern = "MM-dd-yyyy hh:mm:ss",timezone="Asia/Ho_Chi_Minh")
    private Date timeStamp;
    private int httpStatusCode; // 200,201: success; ;400:user error ; 500 :server error
    private HttpStatus httpStatus;
    private String reason; // reason of http status
    private String message;// return message to user

    public HttpResponse() {
    }

    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String message) {
        this.timeStamp=new Date();
        this.httpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
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
