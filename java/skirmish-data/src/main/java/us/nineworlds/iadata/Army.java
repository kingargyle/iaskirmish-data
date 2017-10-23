package us.nineworlds.iadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import us.nineworlds.iadata.deployment.Deployments;

public class Army {
	
	@JsonProperty(required=true, value="name")
	@JsonPropertyDescription("A required field that is a human readable name for the army.")
	private String name;

	@JsonProperty(required=true, value="deployments")
	@JsonPropertyDescription("A required list of one or more deployment groups that describe the army.")
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
