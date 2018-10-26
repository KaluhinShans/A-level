package models;

import constants.Gender;
import myProduction.Utils;

public class Student extends Person {
    public static final int MIN_GPA = 0;
    public static final int MAX_GPA = 5;
    private static final String REGEX = "[A-Z]{2,4}\\d{3,5}";
    private String idNumber;
    private double gpa;

    public String getIDNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        Utils.validate(gpa, MIN_GPA, MAX_GPA);
        this.gpa = gpa;
    }

    public Student(String name, int age, Gender gender, String idNumber, double gpa) {
        super(name, age, gender);
        Utils.validate(gpa, MIN_GPA, MAX_GPA);
        Utils.validateString(REGEX, idNumber);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "IDNumber='" + idNumber + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
