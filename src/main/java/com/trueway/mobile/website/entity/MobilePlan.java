package com.trueway.mobile.website.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "PLAN")
@EntityListeners(AuditingEntityListener.class)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class MobilePlan extends MobileEntity{

	public MobilePlan()
	{}
	public MobilePlan(@NotBlank String name, String desc, String roiData,
			String roiFreeCall, String roiFreeText, String euData, String euFreeCall,
			String euFreeText, String ukData, String ukFreeCall, String ukFreeText, String intData, String intFreeCall,
			String intFreeText, String canadaRoaming, String usaRoaming, String reward, String contract,
			String discount, int price, String priceCurr, List<MobilePhone> phones, List<PlanOffer> offers) {
		super(name, desc);
		this.roiData = roiData;
		this.roiFreeCall = roiFreeCall;
		this.roiFreeText = roiFreeText;
		this.euData = euData;
		this.euFreeCall = euFreeCall;
		this.euFreeText = euFreeText;
		this.ukData = ukData;
		this.ukFreeCall = ukFreeCall;
		this.ukFreeText = ukFreeText;
		this.intData = intData;
		this.intFreeCall = intFreeCall;
		this.intFreeText = intFreeText;
		this.canadaRoaming = canadaRoaming;
		this.usaRoaming = usaRoaming;
		this.reward = reward;
		this.contract = contract;
		this.discount = discount;
		this.price = price;
		this.priceCurr = priceCurr;
		this.phones = phones;
		this.offers=offers;
	}
	@Column(name = "ROI_DATA")
	private String roiData;
	@Column(name = "ROI_FREE_CALL")
    private String roiFreeCall;
    @Column(name = "ROI_FREE_TEXT")
    private String roiFreeText;
    @Column(name = "EU_DATA")
    private String euData;
    @Column(name = "EU_FREE_CALL")
    private String euFreeCall;
    @Column(name = "EU_FREE_TEXT")
    private String euFreeText;
    @Column(name = "UK_DATA")
    private String ukData;
    @Column(name = "UK_FREE_CALL")
    private String ukFreeCall;
    @Column(name = "UK_FREE_TEXT")
    private String ukFreeText;
    @Column(name = "INT_DATA")
    private String intData;
    @Column(name = "INT_FREE_CALL")
    private String intFreeCall;
    @Column(name = "INT_FREE_TEXT")
    private String intFreeText;
    @Column(name = "CANADA_ROAMING")
    private String canadaRoaming;
    @Column(name = "USA_ROAMING")
    private String usaRoaming;
    @Column(name = "REWARD")
    private String reward;
    @Column(name = "CONTRACT")
    private String contract;
    @Column(name = "DISCOUNT")
    private String discount;
    @Column(name = "PRICE")
    private int price;
    @Column(name = "PRICE_CURR")
    private String priceCurr;
    @Column(name = "ACTIVE")
    private int active;
     
	@ManyToMany(cascade = 
        {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "PLAN_PHONE",
            joinColumns = { @JoinColumn(name = "PLAN_ID", referencedColumnName = "ID") },
            inverseJoinColumns = { @JoinColumn(name = "PHONE_ID", referencedColumnName = "ID") })
    private List<MobilePhone> phones=new ArrayList<>();
    
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "PLAN_OFFER",
            joinColumns = { @JoinColumn(name = "PLAN_ID", referencedColumnName = "ID") },
            inverseJoinColumns = { @JoinColumn(name = "OFFER_ID", referencedColumnName = "ID") })
    private List<PlanOffer> offers=new ArrayList<>();
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "plans")
    private List<Customer> customers=new ArrayList<>();
    
   	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public String getUsaRoaming() {
		return usaRoaming;
	}
	public void setUsaRoaming(String usaRoaming) {
		this.usaRoaming = usaRoaming;
	}
	public List<PlanOffer> getOffers() {
		return offers;
	}
	public void setOffers(List<PlanOffer> offers) {
		this.offers = offers;
	}
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
		return usaRoaming;
	}

	public void setUsRoaming(String usaRoaming) {
		this.usaRoaming = usaRoaming;
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
	public List<MobilePhone> getPhones() {
		return phones;
	}

	public void setPhones(List<MobilePhone> phones) {
		this.phones = phones;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
}