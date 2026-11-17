package com.example.tourist_api.repository;

import com.example.tourist_api.model.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TouristRepository extends JpaRepository<Tourist, Integer> {
}
