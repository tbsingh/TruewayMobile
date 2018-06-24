package com.trueway.mobile.website.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Plan")
@EntityListeners(AuditingEntityListener.class)

public class MobilePlan extends MobileEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private String roiData;
    private String roiFreeCall;
    private String roiFreeText;
    
    private String euData;
    private String euFreeCall;
    private String euFreeText;
    
    private String ukData;
    private String ukFreeCall;
    private String ukFreeText;
    
    private String intData;
    private String intFreeCall;
    private String intFreeText;
    
    private String canadaRoaming;
    private String usRoaming;
    private String reward;
    private String contract;
    private String discount;
    private int price;
    private String priceCurr;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "PLAN_PHONE",
            joinColumns = { @JoinColumn(name = "PLAN_ID") },
            inverseJoinColumns = { @JoinColumn(name = "PHONE_ID") })
    private Set<MobilePhone> phones = new HashSet<>();

	public String getRoiData() {
		return roiData;
	}

	public void setRoiData(String roiData) {
		this.roiData = roiData;
	}

	public String getRoiFreeCall() {
		return roiFreeCall;
	}

	public void setRoiFreeCall(String roiFreeCall) {
		this.roiFreeCall = roiFreeCall;
	}

	public String getRoiFreeText() {
		return roiFreeText;
	}

	public void setRoiFreeText(String roiFreeText) {
		this.roiFreeText = roiFreeText;
	}

	public String getEuData() {
		return euData;
	}

	public void setEuData(String euData) {
		this.euData = euData;
	}

	public String getEuFreeCall() {
		return euFreeCall;
	}

	public void setEuFreeCall(String euFreeCall) {
		this.euFreeCall = euFreeCall;
	}

	public String getEuFreeText() {
		return euFreeText;
	}

	public void setEuFreeText(String euFreeText) {
		this.euFreeText = euFreeText;
	}

	public String getUkData() {
		return ukData;
	}

	public void setUkData(String ukData) {
		this.ukData = ukData;
	}

	public String getUkFreeCall() {
		return ukFreeCall;
	}

	public void setUkFreeCall(String ukFreeCall) {
		this.ukFreeCall = ukFreeCall;
	}

	public String getUkFreeText() {
		return ukFreeText;
	}

	public void setUkFreeText(String ukFreeText) {
		this.ukFreeText = ukFreeText;
	}

	public String getIntData() {
		return intData;
	}

	public void setIntData(String intData) {
		this.intData = intData;
	}

	public String getIntFreeCall() {
		return intFreeCall;
	}

	public void setIntFreeCall(String intFreeCall) {
		this.intFreeCall = intFreeCall;
	}

	public String getIntFreeText() {
		return intFreeText;
	}

	public void setIntFreeText(String intFreeText) {
		this.intFreeText = intFreeText;
	}

	public String getCanadaRoaming() {
		return canadaRoaming;
	}

	public void setCanadaRoaming(String canadaRoaming) {
		this.canadaRoaming = canadaRoaming;
	}

	public String getUsRoaming() {
		return usRoaming;
	}

	public void setUsRoaming(String usRoaming) {
		this.usRoaming = usRoaming;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
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
	public Set<MobilePhone> getPhones() {
		return phones;
	}

	public void setPhones(Set<MobilePhone> phones) {
		this.phones = phones;
	}
}