package com.luiz.mlschool.dto;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class StudentDTO {
    @Size(min = 8, max = 50, message = "student name must be between 8 and 50")
    @Pattern(regexp="^[A-Za-z ]*$",message = "name must contains only letters")
    private String name;

    @Valid
    private List<SubjectDTO> subjects;

    public StudentDTO() { }

    public StudentDTO(String name, List<SubjectDTO> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectDTO> subjects) {
        this.subjects = subjects;
    }
}
