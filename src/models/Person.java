package models;

import constants.Gender;
import myProduction.Utils;

public class Person {

    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        Utils.validate(age, 0, 100);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Models.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

