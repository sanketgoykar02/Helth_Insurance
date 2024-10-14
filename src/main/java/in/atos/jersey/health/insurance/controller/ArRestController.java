package in.atos.jersey.health.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.atos.jersey.health.insurance.binding.CitizenApp;
import in.atos.jersey.health.insurance.service.ArService;
//http://localhost:8080/app/
@RestController
@RequestMapping("/app")
public class ArRestController {
	
	@Autowired
	private ArService service;
	
	@PostMapping("/")
	public ResponseEntity<String> createCitizenApp(@RequestBody CitizenApp app) {
		
		Integer appId = service.createApplication(app);
		
		if(appId > 0) {
			return new ResponseEntity<>("App Created with App Id :: " + appId, HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Invalid SSN", HttpStatus.BAD_REQUEST);
		}
	}

}

