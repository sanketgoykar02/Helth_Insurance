package in.atos.jersey.health.insurance.binding;

import java.util.List;

public class DcSummary {
	
	private Income income;
	private Education education;
	private List<Child> childs;
	private String planName;
	public Income getIncome() {
		return income;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public void setIncome(Income income) {
		this.income = income;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	public List<Child> getChilds() {
		return childs;
	}
	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}
	
	

}
