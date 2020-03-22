//package com.trueway.mobile.website.test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.trueway.mobile.website.entity.AppUser;
//import com.trueway.mobile.website.entity.Customer;
//import com.trueway.mobile.website.entity.Invoice;
//import com.trueway.mobile.website.entity.MobileAccessory;
//import com.trueway.mobile.website.entity.MobilePhone;
//import com.trueway.mobile.website.entity.MobilePlan;
//import com.trueway.mobile.website.entity.PlanOffer;
//import com.trueway.mobile.website.repo.AccessoryRepository;
//import com.trueway.mobile.website.repo.AppUserRepository;
//import com.trueway.mobile.website.repo.CustomerRepository;
//import com.trueway.mobile.website.repo.InvoiceRepository;
//import com.trueway.mobile.website.repo.OfferRepository;
//import com.trueway.mobile.website.repo.PhoneRepository;
//import com.trueway.mobile.website.repo.PlanRepository;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//@SpringBootTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//public class JpaRepositoryTest {
//	@Autowired
//	private PlanRepository planRepository;
//	@Autowired
//	private PhoneRepository phoneRepository;
//	@Autowired
//	private OfferRepository offerRepository;
//	@Autowired
//	private AccessoryRepository accessoryRepository;
//	@Autowired
//	private CustomerRepository customerRepository;
//	@Autowired
//	private InvoiceRepository invoiceRepository;
//	@Autowired
//	private AppUserRepository userRepository;
//	@Before
//    public void setUp() throws Exception{
//		//Clean database
////		planRepository.deleteAllInBatch();
////		phoneRepository.deleteAllInBatch();
////		offerRepository.deleteAllInBatch();
////		accessoryRepository.deleteAllInBatch();
////		customerRepository.deleteAllInBatch();
//    }
//	@Test
//	public void planTest() {
//		byte [] image1 = new byte [1000];
//		MobilePhone phone1 = new MobilePhone("name1", "desc1", "model1", "memory1", "storage1", "color1", "network1", "display1",
//											 "mainCamera1", "frontCamera1","os1", 79, "priceCurr1", image1);
//		MobilePhone phone2 = new MobilePhone("name2", "desc2", "model2", "memory2", "storage2", "color2", "network2", "display2",
//				 							 "mainCamera2", "frontCamera2","os2", 99, "priceCurr2", image1);
//		List<MobilePhone> phones = new ArrayList<>();
//		phones.add(phone1);
//		phones.add(phone2);
//	
//		PlanOffer offer1 = new PlanOffer("name1", "desc1", 10, 12);
//		PlanOffer offer2 = new PlanOffer("name2", "desc2", 1, 2);
//		List<PlanOffer> offers = new ArrayList<>();
//		offers.add(offer1);
//		offers.add(offer2);
//		MobilePlan starterPlan = new MobilePlan("name1", "desc1","roiData","roiFreeCall", "roiFreeText", "euData", "euFreeCall",
//												"euFreeText", "ukData", "ukFreeCall", "ukFreeText", "intData", "intFreeCall",
//												"intFreeText", "canadaRoaming", "usaRoaming", "reward", "contract", "discount", 120, "priceCurr", phones, offers);	
//		planRepository.saveAndFlush(starterPlan);
//		
//	}
//	@Test
//	public void phoneTest() {
//		byte [] image1 = new byte [1000];
//		MobilePhone phone = new MobilePhone("name1", "desc1", "model1", "memory1", "storage1", "color1", "network1", "display1",
//				 "mainCamera1", "frontCamera1","os1", 79, "priceCurr1", image1);
//		MobileAccessory accessory1 = new MobileAccessory("name1", "desc1", 10, "$", image1);
//		MobileAccessory accessory2 = new MobileAccessory("name2", "desc2", 20, "$", image1);
//		List<MobileAccessory> accessories = new ArrayList<>();
//		accessories.add(accessory1);
//		accessories.add(accessory2);
//		phone.setAccessories(accessories);
//		phoneRepository.saveAndFlush(phone);
//	}
//	@Test
//	public void customerTest() {
//		Customer customer1 = new Customer("fistName1", "middleName1", "lastName1", "address1", "address2",
//										  "address3", "county1", "country1", "2018-07-06", "2018-07-06", "homePhone1",
//										  "mobilePhone", "email1", "email2");
//		customerRepository.saveAndFlush(customer1);
//		Customer customer2 = new Customer("fistName2", "middleName2", "lastName2", "address1", "address2",
//				  "address3", "county2", "country2", "2018-07-06", "2018-07-06", "homePhone2",
//				  "mobilePhone2", "email1", "email2");
//		customerRepository.saveAndFlush(customer2);
//	}
//	@Test
//	public void invoceTest() {
//		
//		List<MobilePlan> plans = planRepository.findAll();
//		for(MobilePlan plan: plans){
//			Long planId = plan.getId();
//			List<Customer> customers = customerRepository.findAll();
//			for(Customer customer: customers){
//				Long customerId = customer.getId();
//				Invoice invoice = new Invoice("name"+customerId, "desc"+customerId, planId, customerId, 100L, 400L, 300L, "Direct Debit");
//				invoiceRepository.saveAndFlush(invoice);
//				
//			}
//		}
//		
//	}
//	@Test
//	public void appUserTest() {
//		AppUser user = new AppUser("login1", "password1", false, true, true, false);
//		AppUser user2 = new AppUser("login1", "password1", false, true, true, false);
//		userRepository.saveAndFlush(user);
//		userRepository.saveAndFlush(user2);
//	}
//		
//}
