package in.atos.jersey.health.insurance.binding;

import java.time.LocalDate;

public class Child {
	
	private String childName;
	private Integer childAge;
	private Long childSsn;
	
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public Integer getChildAge() {
		return childAge;
	}
	public void setChildAge(Integer childAge) {
		this.childAge = childAge;
	}
	public Long getChildSsn() {
		return childSsn;
	}
	public void setChildSsn(Long childSsn) {
		this.childSsn = childSsn;
	}
	
	
	

}
