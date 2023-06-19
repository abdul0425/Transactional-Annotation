package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Data
@Entity
@Table(name = "APPOINTMENT")
public class AppointmentModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4666401426418986142L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;
    
    private Long patientId;

    private LocalDateTime appointmentDateTime;

}
