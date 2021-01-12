package com.raj.nola.grades;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class DataSet {

    ArrayList<StudentGrade> getStudentList() {

        ArrayList<StudentGrade> studentGradesList = new ArrayList<StudentGrade>();

        studentGradesList.add(new StudentGrade("Rubi", 350,""));
        studentGradesList.add(new StudentGrade("Alie", 212,""));
        studentGradesList.add(new StudentGrade("Denis", 125,""));
        studentGradesList.add(new StudentGrade("Pete", 125,""));
        studentGradesList.add(new StudentGrade("Mike", 100,""));

        studentGradesList.add(new StudentGrade("James", 90,""));
        studentGradesList.add(new StudentGrade("Kam", 212,""));
        studentGradesList.add(new StudentGrade("Brandon", 125,""));
        studentGradesList.add(new StudentGrade("Duke", 125,""));
        studentGradesList.add(new StudentGrade("Justin", 100,""));

        studentGradesList.add(new StudentGrade("Nitin", 90,""));
        studentGradesList.add(new StudentGrade("Rick", 312,""));
        studentGradesList.add(new StudentGrade("Nick", 425,""));
        studentGradesList.add(new StudentGrade("Jamie", 110,""));
        studentGradesList.add(new StudentGrade("Peggy", 80,""));

        studentGradesList.add(new StudentGrade("Dawn", 390,""));
        studentGradesList.add(new StudentGrade("Nikki", 272,""));
        studentGradesList.add(new StudentGrade("Gizel", 325,""));
        studentGradesList.add(new StudentGrade("Tammy", 425,""));
        studentGradesList.add(new StudentGrade("Archie", 400,""));

        return studentGradesList;

    }
}
