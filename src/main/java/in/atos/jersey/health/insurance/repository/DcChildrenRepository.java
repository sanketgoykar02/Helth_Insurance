package in.atos.jersey.health.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.atos.jersey.health.insurance.entity.DcChildren;

public interface DcChildrenRepository extends JpaRepository<DcChildren, Integer>{
	
	public List<DcChildren> findByCaseNum(Long caseNum);
	


}
