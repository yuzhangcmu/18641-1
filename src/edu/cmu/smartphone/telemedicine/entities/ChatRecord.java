package edu.cmu.smartphone.telemedicine.entities;

import java.sql.Date;

public class ChatRecord {
    private String message;
    private Boolean status;
    private Date date;
    private int fromUserID;
    private int toUserID;
    private int messageType;
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public Boolean getStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Date getDate() {
        return date;
    }
    
    public int getFromUserID() {
        return fromUserID;
    }
    
    public int getToUserID() {
        return toUserID;
    }
    
    public int getMessageType() {
        return messageType;
    }
}
