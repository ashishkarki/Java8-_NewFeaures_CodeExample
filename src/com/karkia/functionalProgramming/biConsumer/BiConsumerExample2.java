package com.karkia.functionalProgramming.biConsumer;

import com.karkia.entities.Instructor;
import com.karkia.entities.Instructors;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // print out name and gender of instructors
        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println(name + ", gender: " + gender);
        instructors.forEach(instructor ->
                biConsumer.accept(instructor.getName(), instructor.getGender()));

        // print name and list of courses
        BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> System.out.println(name + ", courses: " + courses);
        instructors.forEach(instructor ->
                biConsumer1.accept(instructor.getName(), instructor.getCourses()));

        // print out name and gender of instructors who teaches online
        instructors.forEach(instructor -> {
            if(instructor.isOnlineCourses()) {
                biConsumer.accept(instructor.getName(), instructor.getGender());
            }
        });
    }
}
