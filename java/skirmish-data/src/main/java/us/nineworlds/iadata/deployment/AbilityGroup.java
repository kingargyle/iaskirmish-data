package us.nineworlds.iadata.deployment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class AbilityGroup {

	@JsonProperty("group")
	@JsonPropertyDescription("A list group abilities for the deployment card.  An ability can trigger more than one group for the same type. ")
	List<Ability> groupAbilities;

	public List<Ability> getGroupAbilities() {
		return groupAbilities;
	}

	public void setGroupAbilities(List<Ability> groupAbilities) {
		this.groupAbilities = groupAbilities;
	}
		
}
