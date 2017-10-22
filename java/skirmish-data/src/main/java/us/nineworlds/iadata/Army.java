package us.nineworlds.iadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import us.nineworlds.iadata.deployment.Deployments;

public class Army {
	
	@JsonProperty(required=true, value="name")
	private String name;

	@JsonProperty(required=true, value="deployments")
	private List<Deployments> deployments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Deployments> getDeployments() {
		return deployments;
	}

	public void setDeployments(List<Deployments> deployments) {
		this.deployments = deployments;
	}
	
}
