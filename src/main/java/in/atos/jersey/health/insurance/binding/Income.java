package in.atos.jersey.health.insurance.binding;

public class Income {
	
	private Integer incomId;
	private Long caseNum;
	private Double empIncome;
	private Double propertyIncome;
	public Integer getIncomId() {
		return incomId;
	}
	public void setIncomId(Integer incomId) {
		this.incomId = incomId;
	}
	public Long getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}
	public Double getEmpIncome() {
		return empIncome;
	}
	public void setEmpIncome(Double empIncome) {
		this.empIncome = empIncome;
	}
	public Double getPropertyIncome() {
		return propertyIncome;
	}
	public void setPropertyIncome(Double propertyIncome) {
		this.propertyIncome = propertyIncome;
	}
	
	

}
