package us.nineworlds.iadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import us.nineworlds.iadata.enums.AttackDice;
import us.nineworlds.iadata.enums.AttackType;

public class Attack {
	
	@JsonProperty("type")
	private AttackType attackType;
	
	@JsonProperty("dice")
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
