package com.raj.nola.grades;

public class StudentGrade {

    String name;
    int    totalMarks;
    String status;

    public StudentGrade(String name, int totalMarks, String status) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                ", status='" + status + '\'' +
                '}';
    }
}
