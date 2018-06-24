package com.trueway.mobile.website.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "tags")
    private Set<MobilePlan> plans = new HashSet<>();
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getMainCamera() {
		return mainCamera;
	}

	public void setMainCamera(String mainCamera) {
		this.mainCamera = mainCamera;
	}

	public String getFrontCamera() {
		return frontCamera;
	}

	public void setFrontCamera(String frontCamera) {
		this.frontCamera = frontCamera;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Set<MobilePlan> getPlans() {
		return plans;
	}

	public void setPlans(Set<MobilePlan> plans) {
		this.plans = plans;
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
}