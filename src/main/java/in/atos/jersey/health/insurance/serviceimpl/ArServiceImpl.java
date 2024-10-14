package in.atos.jersey.health.insurance.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.atos.jersey.health.insurance.binding.CitizenApp;
import in.atos.jersey.health.insurance.entity.CitizenAppEntity;
import in.atos.jersey.health.insurance.repository.CitizenAppRepository;
import in.atos.jersey.health.insurance.service.ArService;

@Service
public class ArServiceImpl implements ArService{
	
	@Autowired
	private CitizenAppRepository appRepository;

	@Override
	public Integer createApplication(CitizenApp app) {
	  
	    String stateName = "New Jersey";
	    
	    if ("New Jersey".equals(stateName)) {
	        CitizenAppEntity entity = new CitizenAppEntity();
	        BeanUtils.copyProperties(app, entity);
	        entity.setStateName(stateName);
	        CitizenAppEntity save = appRepository.save(entity);
	        
	        return save.getAppId();
	    }
	    
	    return 0;
	}

}
