package in.atos.jersey.health.insurance.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DC-CHILDREN")
public class DcChildren {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer childId;
	private LocalDate childDob;
	private Long childSsn;
	private Long caseNum;
	public Long getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}
	public Integer getChildId() {
		return childId;
	}
	public void setChildId(Integer childId) {
		this.childId = childId;
	}
	public LocalDate getChildDob() {
		return childDob;
	}
	public void setChildDob(LocalDate childDob) {
		this.childDob = childDob;
	}
	public Long getChildSsn() {
		return childSsn;
	}
	public void setChildSsn(Long childSsn) {
		this.childSsn = childSsn;
	}
	
	

}
