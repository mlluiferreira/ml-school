package com.luiz.mlschool.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SubjectDTO {

    @Size(min = 8, max = 50, message = "name must be between 8 and 50")
    @Pattern(regexp="^[A-Za-z ]*$",message = "name must contains only letters")
    private String name;

    @Min(value = 0, message = "note should not be less than 0")
    @Max(value = 10, message = "note should not be greater than 10")
    private Double note;

    public SubjectDTO() { }

    public SubjectDTO(String name, Double note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }
}
