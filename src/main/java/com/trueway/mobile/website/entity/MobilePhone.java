package com.trueway.mobile.website.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "PHONE")
@EntityListeners(AuditingEntityListener.class)
public class MobilePhone extends MobileEntity {
	@NotBlank
    private String model;
    private String memory;
  	private String storage;
    private String color;
    private String network;
    private String display;
    private String mainCamera;
    private String frontCamera;
    private String os;
    private int price;
    private String priceCurr;
    private int active;
    private Long imageId;
    public MobilePhone()
    {}
    public MobilePhone(@NotBlank String name, String desc,
			@NotBlank String model, String memory, String storage, String color, String network, String display,
			String mainCamera, String frontCamera, String os, int price, String priceCurr, Long image
			) {
		super(name, desc);
		this.model = model;
		this.memory = memory;
		this.storage = storage;
		this.color = color;
		this.network = network;
		this.display = display;
		this.mainCamera = mainCamera;
		this.frontCamera = frontCamera;
		this.os = os;
		this.price = price;
		this.priceCurr = priceCurr;
		this.setImageId(image);
	}
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "phones")
    private List<MobilePlan> plans=new ArrayList<>();
    
    @ManyToMany(cascade = 
        {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "PHONE_ACCESSORY",
            joinColumns = { @JoinColumn(name = "PHONE_ID", referencedColumnName = "ID") },
            inverseJoinColumns = { @JoinColumn(name = "ACCESSORY_ID", referencedColumnName = "ID") })
    List<MobileAccessory> accessories = new ArrayList<>();
	   
	public List<MobileAccessory> getAccessories() {
		return accessories;
	}
	public void setAccessories(List<MobileAccessory> accessories) {
		this.accessories = accessories;
	}
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

	public List<MobilePlan> getPlans() {
		return plans;
	}

	public void setPlans(List<MobilePlan> plans) {
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