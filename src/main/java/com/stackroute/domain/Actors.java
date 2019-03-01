package com.stackroute.domain;

public class Actors {
    private String name;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getGender() {
        return gender;
    }

//    public Actors(String name, String gender, int age) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
