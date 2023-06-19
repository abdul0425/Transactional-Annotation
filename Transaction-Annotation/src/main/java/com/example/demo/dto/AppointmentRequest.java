package com.example.demo.dto;

import java.io.Serializable;


import lombok.Data;

@Data
public class AppointmentRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2419474894586244650L;

	private String name;

	private int age;

	private String gender;

}
