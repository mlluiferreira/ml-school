package com.luiz.mlschool.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = {"message", "average", "student"})
public class StudentAverageDTO {

    private StudentDTO student;

    public StudentAverageDTO() { }

    public StudentAverageDTO(StudentDTO student) {
        this.student = student;
    }

    public String getMessage() {
        return "Sua media foi " + getAverage();
    }

    public Double getAverage() {
        return student.getSubjects().stream().mapToDouble(SubjectDTO::getNote).average().orElse(0d);
    }

    public StudentDTO getStudent() {
        return student;
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }
}
