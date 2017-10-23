package us.nineworlds.iadata.deployment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import us.nineworlds.iadata.enums.AttackDice;
import us.nineworlds.iadata.enums.AttackType;

public class Attack {
	
	@JsonProperty(required=true, value="type")
	@JsonPropertyDescription("A required enumerated value that describes the attack type.  melee or range")
	private AttackType attackType;
	
	@JsonProperty(required=true, value="dice")
	@JsonPropertyDescription("A list of attack dice used to make up the attack pool. ")
	private List<AttackDice> dicePool;

	public AttackType getAttackType() {
		return attackType;
	}

	public void setAttackType(AttackType attackType) {
		this.attackType = attackType;
	}

	public List<AttackDice> getDicePool() {
		return dicePool;
	}

	public void setDicePool(List<AttackDice> dicePool) {
		this.dicePool = dicePool;
	}

}
