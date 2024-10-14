package in.atos.jersey.health.insurance.binding;

public class PlanSelection {
	
	private Integer appId;
	
	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	private Long caseNum;
	
	private String planName;
	
	private Integer planId;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(String panId) {
		this.planId = planId;
	}

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	

}
