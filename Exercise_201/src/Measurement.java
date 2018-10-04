import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Measurement {
    private LocalDate date;
    private LocalTime time;
    private String plate;
    private int measuredSpeed;
    private int maxSpeed;
    private int lawMisdemeanour;

    public Measurement(LocalDate date, LocalTime time, String plate, int measuredSpeed, int maxSpeed, int lawMisdemeanour) {
        this.date = date;
        this.time = time;
        this.plate = plate;
        this.measuredSpeed = measuredSpeed;
        this.maxSpeed = maxSpeed;
        this.lawMisdemeanour = lawMisdemeanour;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * @return the measuredSpeed
     */
    public int getMeasuredSpeed() {
        return measuredSpeed;
    }

    /**
     * @param measuredSpeed the measuredSpeed to set
     */
    public void setMeasuredSpeed(int measuredSpeed) {
        this.measuredSpeed = measuredSpeed;
    }

    /**
     * @return the maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @param maxSpeed the maxSpeed to set
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return the lawMisdemeanour
     */
    public int getLawMisdemeanour() {
        return lawMisdemeanour;
    }

    /**
     * @param lawMisdemeanour the lawMisdemeanour to set
     */
    public void setLawMisdemeanour(int lawMisdemeanour) {
        this.lawMisdemeanour = lawMisdemeanour;
    }

    /**
     * @return the time
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }
    
}
