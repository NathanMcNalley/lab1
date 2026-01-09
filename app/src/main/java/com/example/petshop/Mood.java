package com.example.petshop;
import java.util.Date;

public abstract class Mood {
    private Date date;

    // Default constructor: sets date to "now"
    public Mood() {
        this.date = new Date();
    }

    // Constructor with date
    public Mood(Date date) {
        this.date = date;
    }

    // Getter / Setter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Must be implemented by each specific mood
    public abstract String getMoodString();
}