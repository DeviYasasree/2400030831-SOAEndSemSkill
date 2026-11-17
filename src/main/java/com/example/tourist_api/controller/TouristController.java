package com.example.tourist_api.controller;

import com.example.tourist_api.model.Tourist;
import com.example.tourist_api.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {

    private final TouristRepository touristRepository;
    private final String validToken;

    public TouristController(
            TouristRepository touristRepository,
            @Value("${app.security.token}") String validToken) {
        this.touristRepository = touristRepository;
        this.validToken = validToken;
    }

    @GetMapping
    public ResponseEntity<?> getAllTourists(
            @RequestHeader(value = "Token", required = false) String token) {

        if (token == null || token.isBlank()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "Token header is missing"));
        }

        if (!validToken.equals(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "Invalid token"));
        }

        List<Tourist> tourists = touristRepository.findAll();
        return ResponseEntity.ok(tourists);
    }
}
