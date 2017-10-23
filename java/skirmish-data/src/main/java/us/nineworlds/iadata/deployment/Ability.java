package us.nineworlds.iadata.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import us.nineworlds.iadata.enums.AbilityAffect;
import us.nineworlds.iadata.enums.AbilityType;

public class Ability {

	@JsonProperty(required=true, value="type")
	@JsonPropertyDescription("A required field describing the type of ability")
	private AbilityType type;
	
	@JsonProperty(required=true, value="affect")
	@JsonPropertyDescription("A required field describing the affect that is applied by the type.")
	private AbilityAffect affect;
	
	@JsonProperty(required=true, value="affectAmount")
	@JsonPropertyDescription("A required field that specifies how much is applied.  This can be a negative number.")
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
