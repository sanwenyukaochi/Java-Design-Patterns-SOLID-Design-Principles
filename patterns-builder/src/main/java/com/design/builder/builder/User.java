package com.design.builder.builder;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

//Entity class used to construct the DTO
@Setter
@Getter
public class User {
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private Address address;
}
