package com.karkia.functionalProgramming.consumer;

import com.karkia.entities.Instructor;
import com.karkia.entities.Instructors;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // looping through all the instructors and printing out the
        // values of instructor
        Consumer<Instructor> consumer1 = (instructor -> System.out.println(instructor));

        instructors.forEach(consumer1);

        // loop through all the instructors and only print out their name
        System.out.println("***************************");
        Consumer<Instructor> consumer2 = (instructor) -> System.out.print(instructor.getName()+"-- ");

        instructors.forEach(consumer2);

        // loop through all instructors and print their names and courses
        System.out.println("***************************");
        Consumer<Instructor> consumer3 = (instructor) -> System.out.println(instructor.getCourses());

        instructors.forEach(consumer2.andThen(consumer3));

        // loop through instructors and print their name if years-of-experience > 10
        System.out.println("***************************");
        instructors.forEach(instructor -> {
            if(instructor.getYearsOfExperience() > 10) {
                consumer1.accept(instructor);
            }
        });

        // loop and print their name and years of experience if y-o-e > 5
        // teaches course online
        System.out.println("*************************** Last one");
        Consumer<Instructor> consumer4 = (instructor) -> System.out.println(instructor.getYearsOfExperience());
        instructors.forEach(instructor -> {
            if(instructor.getYearsOfExperience() > 5 && instructor.isOnlineCourses()) {
                consumer2.andThen(consumer4).accept(instructor);
            }
        });
    }
}
