package com.str.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.str.Dao.AdminDaoI;
import com.str.exception.CustomersNotFoundException;
import com.str.exception.DateNotFoundException;
import com.str.model.Customers;
import com.str.model.Feedback;
import com.str.services.CustomerServiceI;

@RestController
@RequestMapping("/customers")
public class CustomersController {

	@Autowired
	private CustomerServiceI d;
	@Autowired
	private AdminDaoI a;

	@PostMapping("/add")

	@HystrixCommand(fallbackMethod = "add_fallBack")

	public ResponseEntity<?> add(@RequestBody Customers customers) {

		Customers cd = d.bookTable(customers);
		return new ResponseEntity<>(cd, HttpStatus.CREATED);

	}

	public ResponseEntity<?> add_fallBack(@RequestBody Customers customers) {
		return new ResponseEntity<>("Customer or add service is not running.......", HttpStatus.NOT_FOUND);
	}

	@GetMapping("/FindBystateandcity/{state}/{city}")

	@HystrixCommand(fallbackMethod = "searchBystateandcityname_fallBack")
	public ResponseEntity<?> searchBystateandcityname(@PathVariable String state, String city)

			throws CustomersNotFoundException {
		List<Customers> dd = d.findByStateAndCity(state, city);
		if (d != null)
			return new ResponseEntity<>(dd, HttpStatus.OK);
		else
			throw new CustomersNotFoundException("Customers not found");

	}

	public ResponseEntity<?> searchBystateandcityname_fallBack(@PathVariable String state, String city) {
		return new ResponseEntity<>("Customer or service is not running.......", HttpStatus.NOT_FOUND);
	}

	@GetMapping("/findBydate/{date}")
	@HystrixCommand(fallbackMethod = "findBydate_fallBack")
	public ResponseEntity<?> findBydate(@PathVariable String date) throws DateNotFoundException {
		Customers cc = (Customers) d.viewBooking(date);
		if (cc != null)
			return new ResponseEntity<>(cc, HttpStatus.OK);
		else
			throw new DateNotFoundException("date not found");

	}

	public ResponseEntity<?> searchBydate_fallBack(@PathVariable String state, String city) {
		return new ResponseEntity<>("Customer Booking Date is not Correct.......", HttpStatus.NOT_FOUND);
	}

	@GetMapping("/findBycustomers")
	public List<Customers> searchByrating() {
		List<Customers> list1 = d.findBycustomersfirstname();
		return list1;
	}

	@GetMapping("/ratingstar{star}")
	public List<Feedback> customersByratingstar(@PathVariable String ratingstar) {
		List<Feedback> list = d.starRatedcustomer(ratingstar);
		return list;
	}

	@GetMapping("/findbystarratedcustomer/{rating}")
	public List<Customers> findbystarratedcustomer(@PathVariable int rating) {
		List<Customers> list = d.getcustomerrating(rating);
		return list;
	}
}
