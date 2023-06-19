package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AppointmentModel;

public interface AppointmentRepo extends JpaRepository<AppointmentModel, Long> {

}
