package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAgeHasHouseCreditScore() {
        int expectedAge = 20;
        boolean expectedHasHouse = true;
        int expectedCreditScore = 650;
        Person person = new Person();

        person.setAge(expectedAge);
        person.setHasHouse(expectedHasHouse);
        person.setCreditScore(expectedCreditScore);

        int actualAge = person.getAge();
        boolean actualHasHouse = person.getHasHouse();
        int actualCreditScore = person.getCreditScore();
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertTrue(expectedHasHouse);
        Assert.assertEquals(expectedCreditScore, actualCreditScore);
    }

    @Test
    public void testConstructorSchool() {
        String expectedSchool = "University of California";

        Person person = new Person();

        person.setSchool(expectedSchool);

        String actualSchool = person.getSchool();
        Assert.assertEquals(expectedSchool, actualSchool);
    }

    @Test
    public void testConstuctorLikesChocolate() {
        boolean expectedLikesChocolate = true;

        Person person = new Person();

        person.setLikesChocolate(expectedLikesChocolate);

        boolean actualLikesChocolate = person.getLikesChocolate();
        Assert.assertTrue(expectedLikesChocolate);
    }

    @Test
    public void testSetHomeTown() {
        String expectedHometown = "Portland";

        Person person = new Person();

        person.setHomeTown(expectedHometown);

        String actualHomeTown = person.getHomeTown();
        Assert.assertEquals(expectedHometown, actualHomeTown);
    }
}
