package com.luiz.mlschool.controller;

import com.luiz.mlschool.dto.StudentAverageDTO;
import com.luiz.mlschool.dto.StudentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MainController {

    @PostMapping("/analyzeNotes")
    public ResponseEntity<?> analyzeNotes(@RequestBody @Valid StudentDTO studentDTO) {
        return ResponseEntity.ok(new StudentAverageDTO(studentDTO));
    }
}
