package edu.cmu.smartphone.telemedicine.entities;

import java.sql.Date;

public class RecentChat {
    private int userID;
    private Date updateTime;
    
    public int getUserID() {
        return userID;
    }
    
    public Date getDate() {
        return updateTime;
    }
    
}
