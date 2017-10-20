package us.nineworlds.iadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deployments {
	
	@JsonProperty("deployment")
	private Deployment deployment;

	public Deployment getDeployment() {
		return deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

}
