package us.nineworlds.iadata.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AbilityAffect {

	@JsonProperty("damage")
	DAMAGE("damage"),
	@JsonProperty("stun")
	STUN("stun"),
	@JsonProperty("weaken")
	WEAKEN("weaken"),
	@JsonProperty("bleed")
	BLEED("bleed"),
	@JsonProperty("accuracy")
	ACCURACY("accuracy"),
	@JsonProperty("hide")
	HIDE("hide"),
	@JsonProperty("pierce")
	PIERCE("pierce"),
	@JsonProperty("recover")
	RECOVER("recover"),
	@JsonProperty("mobile")
	MOBILE("mobile"),
	@JsonProperty("massive")
	MASSIVE("massive"),
	@JsonProperty("cancel")
	CANCEL("cancel"),
	@JsonProperty("focus")
	FOCUS("focus"),
	@JsonProperty("powerdamage")
	POWERDAMAGE("powerdamage"),
	@JsonProperty("powerblock")
	POWERBLOCK("powerblock"),
	@JsonProperty("blast")
	BLAST("blast"),
	@JsonProperty("cleave")
	CLEAVE("cleave"),
	@JsonProperty("block")
	BLOCK("block"),
	@JsonProperty("surge")
	SURGE("surge"),
	@JsonProperty("reach")
	REACH("reach"),
	@JsonProperty("desert")
	DESERT("desert"),
	@JsonProperty("snow")
	SNOW("snow");
	
	private String affectType;
	
	AbilityAffect(String affectType) {
		this.affectType = affectType;
	}
	
	public String toString() {
		return affectType;
	}
}
