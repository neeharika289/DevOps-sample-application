package com.rest.demo.customer.exception;

import java.util.Date;

public class ExceptionResponse {

    Date systemdate;
    String message;
    String description;

    ExceptionResponse(){}

    ExceptionResponse(Date systemdate, String message, String description)
    {
        this.systemdate=systemdate;
        this.message=message;
        this.description=description;
    }

    public Date getSystemdate() {
        return systemdate;
    }

    public void setSystemdate(Date systemdate) {
        this.systemdate = systemdate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}
