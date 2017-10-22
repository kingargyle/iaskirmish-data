package us.nineworlds.iadata.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AttackType {

	@JsonProperty("range")
	RANGE("range"),
	@JsonProperty("melee")
	MELEE("melee"),
	@JsonProperty("none")
	NONE("none");
	
	private String type;
	
	AttackType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}
}
