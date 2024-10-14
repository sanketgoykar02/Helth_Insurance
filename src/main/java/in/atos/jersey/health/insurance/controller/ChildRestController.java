package in.atos.jersey.health.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.atos.jersey.health.insurance.binding.ChildRequest;
import in.atos.jersey.health.insurance.binding.DcSummary;
import in.atos.jersey.health.insurance.service.DcService;

@RestController
public class ChildRestController {
	
	@Autowired
	private DcService service;
	
	@PostMapping("/childrens")
	public ResponseEntity<DcSummary> saveChilds(@RequestBody ChildRequest childRequest) {
		
		Long caseNum = service.saveChildren(childRequest);
		
		DcSummary summary = service.getSummary(caseNum);
		
		return new ResponseEntity<>(summary, HttpStatus.OK);
	}

}
