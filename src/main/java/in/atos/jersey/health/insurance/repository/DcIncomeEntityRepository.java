package in.atos.jersey.health.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.atos.jersey.health.insurance.entity.DcIncomeEntity;

public interface DcIncomeEntityRepository extends JpaRepository<DcIncomeEntity, Integer>{
	

	public DcIncomeEntity findByCaseNum(Long caseNum);
	

}
