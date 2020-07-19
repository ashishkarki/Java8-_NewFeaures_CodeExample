package com.karkia.entities;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll() {
        var instructor1 = new Instructor("Sam", 10, "Software Dev", "M",
                true,
                Arrays.asList("Java", "Python", "Gython"));
        var instructor2 = new Instructor("Sanjay Mishra", 20, "Senior Architect", "M",
                false,
                Arrays.asList("Acting websites", "some more acting"));
        var instructor3 = new Instructor("Madhu Bala", 25, "Senior Actress", "F",
                true,
                Arrays.asList("How to look beautiful", "Acting sikho", "more dancing"));
        var instructor4 = new Instructor("Ratna kaji", 5, "Waiter", "F",
                true,
                Arrays.asList("How to Wait", "How to me courteous", "How are you greeting"));

        return Arrays.asList(instructor1, instructor2, instructor3, instructor4);
    }

}
