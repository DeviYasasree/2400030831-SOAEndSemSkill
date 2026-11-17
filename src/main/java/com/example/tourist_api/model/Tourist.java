package com.example.tourist_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tourists")
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tourist_id")
    private Integer touristId;

    private String name;
    private String email;
    private String country;
    private Integer age;
    private String destination;

    public Tourist() {
    }

    public Integer getTouristId() {
        return touristId;
    }

    public void setTouristId(Integer touristId) {
        this.touristId = touristId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
