package org.java.mpr.projekt.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity 
public class Things implements Serializable {
    
    @Id 
    @GeneratedValue
    private Long id; 
     
    private String name; 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date borrowTime;
    private int numberOfThings;
    
    protected Things() {
        
    }
    
    public Things(String name, String adress) {
        this.name = name;

    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public int getNumberOfThings() {
        return numberOfThings;
    }

    public void setNumberOfThings(int numberOfThings) {
        this.numberOfThings = numberOfThings;
    }
}
