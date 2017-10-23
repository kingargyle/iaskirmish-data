package us.nineworlds.iadata.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class Deployments {
	
	@JsonProperty(required=true, value="deployment")
	@JsonPropertyDescription("A required field that contains detailed information about a deployment card.")
	private Deployment deployment;

	public Deployment getDeployment() {
		return deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

}
