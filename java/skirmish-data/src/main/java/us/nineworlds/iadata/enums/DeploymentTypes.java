package us.nineworlds.iadata.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DeploymentTypes {

	@JsonProperty("deployment")
	DEPLOYMENT("deployment"),
	@JsonProperty("upgrade")
	UPGRADE("upgrade"),
	@JsonProperty("any")
	NEUTRAL("any");
	
	private String type;
	
	DeploymentTypes(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}
}
