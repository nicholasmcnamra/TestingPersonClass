package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private boolean hasHouse;
    private boolean likesChocolate;
    private String homeTown;
    private int creditScore;
    private String school;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasHouse(boolean hasHouse) {
        this.hasHouse = hasHouse;
    }

    public void setLikesChocolate(boolean likesChocolate) {
        this.likesChocolate = likesChocolate;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean getHasHouse() {
        return hasHouse;
    }

    public boolean getLikesChocolate() {
        return likesChocolate;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public String getSchool() {
        return school;
    }
}
