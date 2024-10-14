package in.atos.jersey.health.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.atos.jersey.health.insurance.binding.Income;
import in.atos.jersey.health.insurance.service.DcService;

@RestController
public class IncomRestController {
	
	@Autowired
	private DcService service;
	
	@PostMapping("/income")
	public ResponseEntity<Long> saveIncome(@RequestBody Income income) {
		
		Long caseNum = service.saveIncomeData(income);
		
		return new ResponseEntity<>(caseNum, HttpStatus.CREATED);
	}

}
