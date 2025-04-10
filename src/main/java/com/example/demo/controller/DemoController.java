package com.example.demo.controller;

import com.example.demo.dto.RequestDTO;
import com.example.demo.dto.ResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class DemoController {

    @PostMapping("/valid")
    public ResponseEntity<ResponseDTO> validateRequest(@RequestBody @Valid RequestDTO request) {
        return ResponseEntity.ok(new ResponseDTO("Valid request Accepted", 200, LocalDateTime.now()));
    }
}
