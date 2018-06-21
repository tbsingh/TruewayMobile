package com.trueway.mobile.website.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Phone")
@EntityListeners(AuditingEntityListener.class)

public class MobilePhone extends MobileEntity implements Serializable {
	private static long serialVersionUID = 1L;
	@NotBlank
    private String model;
    @NotBlank
    private String memory;
    @NotBlank
    private String storage;
    @NotBlank
    private String color;
    @NotBlank
    private String network;
    @NotBlank
    private String display;
    @NotBlank
    private String mainCamera;
    @NotBlank
    private String frontCamera;
    @NotBlank
    private String os;
    @NotBlank
    private int price;
    @NotBlank
    private String priceCurr;
    @Lob
    private byte[] image;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPriceCurr() {
		return priceCurr;
	}

	public void setPriceCurr(String priceCurr) {
		this.priceCurr = priceCurr;
	}
}