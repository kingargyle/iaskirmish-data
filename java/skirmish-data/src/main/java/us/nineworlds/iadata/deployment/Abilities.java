package us.nineworlds.iadata.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Abilities {

	@JsonProperty("ability")
	private AbilityGroup ability;

	public AbilityGroup getAbility() {
		return ability;
	}

	public void setAbility(AbilityGroup abilityGroup) {
		this.ability = abilityGroup;
	}
	
	
}
