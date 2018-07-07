package com.trueway.mobile.website.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.trueway.mobile.website.entity.MobilePhone;
import com.trueway.mobile.website.entity.MobilePlan;
import com.trueway.mobile.website.entity.PlanOffer;
import com.trueway.mobile.website.repo.AccesssoryRepository;
import com.trueway.mobile.website.repo.CustomerRepository;
import com.trueway.mobile.website.repo.OfferRepository;
import com.trueway.mobile.website.repo.PhoneRepository;
import com.trueway.mobile.website.repo.PlanRepository;
import com.trueway.mobile.website.repo.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class JpaRepositoryTest {
	@Autowired
	private PlanRepository planRepository;
	@Autowired
	private PhoneRepository phoneRepository;
	@Autowired
	private OfferRepository offerRepository;
	@Autowired
	private AccesssoryRepository accessoryRepository;
//	@Autowired
//	private CustomerRepository customerRepository;
//	@Autowired
//	private UserRepository userRepository;
//	
	@Test
	public void planTest() {
		planRepository.deleteAllInBatch();
		phoneRepository.deleteAllInBatch();
		offerRepository.deleteAllInBatch();
		byte [] image1 = new byte [1000];
		MobilePhone phone1 = new MobilePhone("name1", "desc1", "model1", "memory1", "storage1", "color1", "network1", "display1",
											 "mainCamera1", "frontCamera1","os1", 79, "priceCurr1", image1);
		MobilePhone phone2 = new MobilePhone("name2", "desc2", "model2", "memory2", "storage2", "color2", "network2", "display2",
				 							 "mainCamera2", "frontCamera2","os2", 99, "priceCurr2", image1);
		List<MobilePhone> phones = new ArrayList<>();
		phones.add(phone1);
		phones.add(phone2);
	
		PlanOffer offer1 = new PlanOffer("name1", "desc1", 10, 12);
		PlanOffer offer2 = new PlanOffer("name2", "desc2", 1, 2);
		List<PlanOffer> offers = new ArrayList<>();
		offers.add(offer1);
		offers.add(offer2);
		MobilePlan starterPlan = new MobilePlan("name1", "desc1","roiData","roiFreeCall", "roiFreeText", "euData", "euFreeCall",
												"euFreeText", "ukData", "ukFreeCall", "ukFreeText", "intData", "intFreeCall",
												"intFreeText", "canadaRoaming", "usaRoaming", "reward", "contract", "discount", 120, "priceCurr", phones, offers);	
		planRepository.saveAndFlush(starterPlan);
		
	}
	@Test
	public void offerTest() {
//		MobilePlan starterPlan = new MobilePlan();
//		starterPlan.setName("Starter");
//		starterPlan.setPrice(490);
//		MobilePhone phone1 = new MobilePhone();
//		phone1.setName("iPhone 8");
//		phone1.setModel("Edge");
//		phone1.setPrice(49);
//		MobilePhone phone2= new MobilePhone();
//		phone2.setName("iPhone 6");
//		phone2.setModel("Best");
//		phone1.setPrice(49);
//		starterPlan.getPhones().add(phone1);
//		starterPlan.getPhones().add(phone2);
//		planRepository.saveAndFlush(starterPlan);
	}

}
