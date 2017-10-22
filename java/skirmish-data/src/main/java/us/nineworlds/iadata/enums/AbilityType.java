package us.nineworlds.iadata.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AbilityType {

	@JsonProperty("none")
	NONE("none"),
	@JsonProperty("surge")
	SURGE("surge"),
	@JsonProperty("doublesurge")
	DOUBLESURGE("doublesurge"),
	@JsonProperty("block")
	BLOCK("block"),
	@JsonProperty("habitat")
	HABITAT("habitat");
	
	private String type;
	
	AbilityType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}
}
