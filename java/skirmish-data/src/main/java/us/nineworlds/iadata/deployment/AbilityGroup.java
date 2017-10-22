package us.nineworlds.iadata.deployment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbilityGroup {

	@JsonProperty("group")
	List<Ability> groupAbilities;

	public List<Ability> getGroupAbilities() {
		return groupAbilities;
	}

	public void setGroupAbilities(List<Ability> groupAbilities) {
		this.groupAbilities = groupAbilities;
	}
		
}
