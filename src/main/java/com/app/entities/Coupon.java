package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Coupon {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cId;
	
	private String coupon;
	
	private Double price;
	
	private LocalDate expireDate;

}
