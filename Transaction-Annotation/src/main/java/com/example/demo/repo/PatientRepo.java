package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PatientModel;

public interface PatientRepo extends JpaRepository<PatientModel, Long> {

}
