package models;

import constants.Gender;
import constants.Subject;

import java.util.Arrays;

public class Teacher extends Person {
    private static final int MAX_SUBJECTS = 4;
    private double salary;
    private Subject[] subjects;
    private int subjectCount;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Subject[] getSubject() {
        return subjects;
    }

    public void setSubject(Subject[] subject) {
        this.subjects = subjects;
    }

    public Teacher(String name, int age, Gender gender, double salary, Subject... subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subjects = generateSubjectsArray(subject);
    }

    private Subject[] generateSubjectsArray(Subject... subjectSequence) {
        if (subjectSequence.length > 5) {
            throw new IllegalArgumentException("Many subjects");
        }
        subjectCount = subjectSequence.length - 1;
        Subject[] subjects = new Subject[5];
        for (int i = 0; i < subjectSequence.length; i++) {
            subjects[i] = subjectSequence[i];
        }
        return subjects;
    }

    public boolean addSubject(Subject subject) {
        if (subjectCount < 4) {
            subjects[++subjectCount] = subject;
            return true;
        }
        return false;
    }

    public boolean removeSuject(Subject subject) {
        int index = Arrays.binarySearch(subjects, subject);
        if (index < 0) {
            return false;
        }
        if (index != subjectCount) {
            subjects[index] = subjects[subjectCount];
        }
        subjects[subjectCount] = null;
        subjectCount--;
        return true;
    }
}
