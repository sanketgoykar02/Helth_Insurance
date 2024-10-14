package in.atos.jersey.health.insurance.service;

import org.springframework.stereotype.Service;

import in.atos.jersey.health.insurance.binding.CitizenApp;

@Service
public interface ArService {
	
	public Integer createApplication(CitizenApp app);

}
