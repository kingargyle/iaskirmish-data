package us.nineworlds.iadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import us.nineworlds.iadata.deployment.Deployments;

public class DeploymentsDB {

	@JsonProperty(required=true, value="deployments")
	private List<Deployments> deployments;

	public List<Deployments> getDeployments() {
		return deployments;
	}

	public void setDeployments(List<Deployments> deployments) {
		this.deployments = deployments;
	}
	
}
