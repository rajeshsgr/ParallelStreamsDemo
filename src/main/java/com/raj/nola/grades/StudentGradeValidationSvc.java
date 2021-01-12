package com.raj.nola.grades;

import java.util.List;
import java.util.stream.Collectors;

public class StudentGradeValidationSvc {

    public static void main(String[] args) {

        DataSet dataSet = new DataSet();
        StudentGradeValidationSvc studentSvc = new StudentGradeValidationSvc();

        System.out.println(studentSvc.checkStudentGradeStatus(dataSet.getStudentList()));

    }

    List<StudentGrade> checkStudentGradeStatus(List<StudentGrade> studentGradeList) {

        List<StudentGrade> updatedStudentGradeList =
                studentGradeList.
                parallelStream().
                map(studentGradeItem -> {
                    if ((studentGradeItem.getTotalMarks() / 500) > 40) {
                        studentGradeItem.setStatus("Pass");
                    } else {
                        studentGradeItem.setStatus("Fail");
                    }
                    return studentGradeItem;
                }).
                collect(Collectors.toList());
        return updatedStudentGradeList;

    }

}
