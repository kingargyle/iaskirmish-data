package us.nineworlds.iadata.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class Abilities {

	@JsonProperty("ability")
	@JsonPropertyDescription("A field that describes the abilities for a deployment card.")
	private AbilityGroup ability;

	public AbilityGroup getAbility() {
		return ability;
	}

	public void setAbility(AbilityGroup abilityGroup) {
		this.ability = abilityGroup;
	}
	
	
}
