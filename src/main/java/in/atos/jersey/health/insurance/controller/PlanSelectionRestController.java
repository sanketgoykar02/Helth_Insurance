package in.atos.jersey.health.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.atos.jersey.health.insurance.binding.PlanSelection;
import in.atos.jersey.health.insurance.service.DcService;

@RestController
public class PlanSelectionRestController {
	
	@Autowired
	private DcService service;
	
	@PostMapping("/plansel")
	public ResponseEntity<Long> planSelction(@RequestBody PlanSelection planSelection) {
		
		Long caseNum = service.savePlanSelection(planSelection);
		
		return new ResponseEntity<>(caseNum, HttpStatus.CREATED);
	}

}
