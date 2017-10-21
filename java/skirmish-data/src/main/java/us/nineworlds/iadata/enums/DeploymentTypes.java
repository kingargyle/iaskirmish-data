package us.nineworlds.iadata.enums;

public enum DeploymentTypes {

	DEPLOYMENT("deployment"),
	UPGRADE("upgrade"),
	NEUTRAL("any");
	
	private String type;
	
	DeploymentTypes(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}
}
