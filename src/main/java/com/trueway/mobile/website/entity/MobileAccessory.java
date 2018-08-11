package com.trueway.mobile.website.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ACCESSORY")
@EntityListeners(AuditingEntityListener.class)
public class MobileAccessory extends MobileEntity implements Serializable {
	
    private int price;
    private int active;
    private String priceCurr;
    private Long imageId;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "accessories")
    private List<MobilePhone> phones=new ArrayList<>();
    
	public MobileAccessory(@NotBlank String name, String desc, @NotBlank int price, @NotBlank String priceCurr, Long image) {
		super(name, desc);
		this.price = price;
		this.priceCurr = priceCurr;
		this.setImageId(image);
	}

	public MobileAccessory() {
		super();
	}

	public List<MobilePhone> getPhones() {
		return phones;
	}

	public void setPhones(List<MobilePhone> phones) {
		this.phones = phones;
	}

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

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}
}