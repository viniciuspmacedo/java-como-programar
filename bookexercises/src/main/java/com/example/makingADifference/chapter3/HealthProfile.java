package com.example.makingADifference.chapter3;

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthMonth;
    private int birthDay;
    private int birtYear;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, int birthMonth, int birthDay, int birtYear,
            double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birtYear = birtYear;
        this.height = height;
        this.weight = weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirtYear() {
        return birtYear;
    }

    public void setBirtYear(int birtYear) {
        this.birtYear = birtYear;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return LocalDate.of(getBirtYear(), getBirthMonth(), getBirthDay());
    }

    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    public double bmi(){
        return weight / Math.pow(height, 2);
    }

    public int getMaximumHeartRate(){
        return 220 - getAge();
    }

    public double minHeartRateTarget(){
        return getMaximumHeartRate() * 0.5;
    }

    public double maxHeartRateTarget(){
        return getMaximumHeartRate() * 0.85;
    }

    public String heartRateTargetInterval(){
        return String.format("Frequência cardíaca alvo entre: %.0f bpm e %.0f bpm", minHeartRateTarget(), maxHeartRateTarget());
    }

    String bmiTable = """
        -----------------------------------
                    VALORES IMC
        -----------------------------------
        Abaixo do peso:     menor que 18.5
        Normal:          entre 18.5 e 24.9
        Acima do peso:     entre 25 e 29.9
        Obeso:                  30 ou mais
        -----------------------------------
        """;

    public void printStatus(){
        System.out.println();
        System.out.printf("Nome: %s %s\n", firstName, lastName);
        System.out.printf("Idade: %d\n", getAge());
        System.out.printf("Frequência cardíaca máxima: %d\n", getMaximumHeartRate());
        System.out.println(heartRateTargetInterval());
        System.out.printf("IMC: %.1f\n", bmi());
        System.out.println(bmiTable);
    }

}
