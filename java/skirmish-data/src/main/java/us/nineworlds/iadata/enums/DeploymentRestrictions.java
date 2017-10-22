package us.nineworlds.iadata.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DeploymentRestrictions {

	@JsonProperty("wookiee")
	WOOKIEE("wookiee"),
	@JsonProperty("smuggler")
	SMUGGLER("smuggler"),
	@JsonProperty("guardian")
	GUARDIAN("guardian"),
	@JsonProperty("trooper")
	TROOPER("trooper"),
	@JsonProperty("hunter")
	HUNTER("hunter"),
	@JsonProperty("leader")
	LEADER("leader"),
	@JsonProperty("creature")
	CREATURE("creature"),
	@JsonProperty("vehicle")
	VEHICLE("vehicle"),
	@JsonProperty("brawler")
	BRAWLER("brawler"),
	@JsonProperty("forceuser")
	FORCEUSER("forceuser"),
	@JsonProperty("heavyweapon")
	HEAVYWEAPON("heavyweapon"),
	@JsonProperty("droid")
	DROID("droid"),
	@JsonProperty("spy")
	SPY("spy"),
	@JsonProperty("massive")
	MASSIVE("massive");
	
	private String restriction;
	
	DeploymentRestrictions(String restriction) {
		this.restriction = restriction;
	}
	
	public String toString() {
		return restriction;
	}
}
