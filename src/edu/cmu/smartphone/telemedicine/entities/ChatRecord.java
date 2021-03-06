package edu.cmu.smartphone.telemedicine.entities;

import java.sql.Date;

public class ChatRecord {
    private String message;
    private Boolean status;
    private Date date;
    private String chatUserID;
    private Boolean direction;
    private int messageType;
    
    public String getMessage() {
        return message;
    }
    
    public boolean getDirection() {
        return direction;
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
    
    public String getChatUserID() {
        return chatUserID;
    }
    
    
    public int getMessageType() {
        return messageType;
    }
}
