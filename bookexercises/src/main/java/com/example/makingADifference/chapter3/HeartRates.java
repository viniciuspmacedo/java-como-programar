package com.example.makingADifference.chapter3;

public class HeartRates {
    String firstName;
    String lastName;
    int bornDay;
    int bornMonth;
    int bornYear;
    
    final int YEAR = 2024;

    public HeartRates(String firstName, String lastName, int bornDay, int bornMonth, int bornYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornDay = bornDay;
        this.bornMonth = bornMonth;
        this.bornYear = bornYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBornDay() {
        return bornDay;
    }

    public void setBornDay(int bornDay) {
        this.bornDay = bornDay;
    }

    public int getBornMonth() {
        return bornMonth;
    }

    public void setBornMonth(int bornMonth) {
        this.bornMonth = bornMonth;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public int getAge(){
        return YEAR - getBornYear();
    }

    public int getMaximumHeartRate(){
        return 220 - getAge();
    }

    public double minimumHeartRateTarget(){
        return  getMaximumHeartRate() * 0.5;
    }

    public double maximumHeartRateTarget(){
        return getMaximumHeartRate() * 0.85;
    }

    public void printStatus(){
        String message = String.format("\nName: %s %s \nAge: %d \nBatimento cardiáco máximo: %d \n" +
        "Batimento cardíaco alvo: entre %.0f bpm e %.0f bpm",
        firstName, lastName, getAge(), getMaximumHeartRate(), minimumHeartRateTarget(), maximumHeartRateTarget());
        System.out.println(message);
    }

}
