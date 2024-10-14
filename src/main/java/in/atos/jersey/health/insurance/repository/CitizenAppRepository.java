package in.atos.jersey.health.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.atos.jersey.health.insurance.entity.CitizenAppEntity;

@Repository
public interface CitizenAppRepository extends JpaRepository<CitizenAppEntity, Integer>{

}
