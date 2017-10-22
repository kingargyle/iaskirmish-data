package us.nineworlds.iadata.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

import us.nineworlds.iadata.enums.AbilityAffect;
import us.nineworlds.iadata.enums.AbilityType;

public class Ability {

	@JsonProperty("type")
	private AbilityType type;
	
	@JsonProperty("affect")
	private AbilityAffect affect;
	
	@JsonProperty("affectAmount")
	private int affectAmount;

	public AbilityType getType() {
		return type;
	}

	public void setType(AbilityType type) {
		this.type = type;
	}

	public AbilityAffect getAffect() {
		return affect;
	}

	public void setAffect(AbilityAffect affect) {
		this.affect = affect;
	}

	public int getAffectAmount() {
		return affectAmount;
	}

	public void setAffectAmount(int affectAmount) {
		this.affectAmount = affectAmount;
	}
		
}
