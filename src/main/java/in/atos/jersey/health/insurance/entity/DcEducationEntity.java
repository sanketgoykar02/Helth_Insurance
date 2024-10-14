package in.atos.jersey.health.insurance.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DC-EDUCATION")
public class DcEducationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eduId;
	private Long caseNum;
	private String highestQualification;
	private Integer gradutionYear;
	public Integer getEduId() {
		return eduId;
	}
	public void setEduId(Integer eduId) {
		this.eduId = eduId;
	}
	public Long getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public Integer getGradutionYear() {
		return gradutionYear;
	}
	public void setGradutionYear(Integer gradutionYear) {
		this.gradutionYear = gradutionYear;
	}
	
	

}
