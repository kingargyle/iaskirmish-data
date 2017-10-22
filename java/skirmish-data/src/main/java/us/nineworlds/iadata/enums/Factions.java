package us.nineworlds.iadata.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Factions {
	
	@JsonProperty("imperial")
	IMPERIAL("imperial"),
	@JsonProperty("rebel")
	REBEL("rebel"),
	@JsonProperty("mercenary")
	MERCENARY("mercenary"),
	@JsonProperty("any")
	ANY("any");
	
	private String faction;
	
	Factions(String faction) {
		this.faction = faction;
	}
	
	public String toString() {
		return faction;
	}
	
}
