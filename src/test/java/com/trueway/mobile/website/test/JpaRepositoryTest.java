package com.trueway.mobile.website.test;

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
		MobilePlan starterPlan = new MobilePlan();
		starterPlan.setName("Starter");
		starterPlan.setPrice(490);
		MobilePhone phone1 = new MobilePhone();
		phone1.setName("iPhone 8");
		phone1.setModel("Edge");
		phone1.setPrice(49);
		MobilePhone phone2= new MobilePhone();
		phone2.setName("iPhone 6");
		phone2.setModel("Best");
		phone1.setPrice(49);
		starterPlan.getPhones().add(phone1);
		starterPlan.getPhones().add(phone2);
		planRepository.saveAndFlush(starterPlan);
	}
	@Test
	public void offerTest() {
		MobilePlan starterPlan = new MobilePlan();
		starterPlan.setName("Starter");
		starterPlan.setPrice(490);
		MobilePhone phone1 = new MobilePhone();
		phone1.setName("iPhone 8");
		phone1.setModel("Edge");
		phone1.setPrice(49);
		MobilePhone phone2= new MobilePhone();
		phone2.setName("iPhone 6");
		phone2.setModel("Best");
		phone1.setPrice(49);
		starterPlan.getPhones().add(phone1);
		starterPlan.getPhones().add(phone2);
		planRepository.saveAndFlush(starterPlan);
	}

}
