package us.nineworlds.iadata.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DefenseDice {

	@JsonProperty("white")
	WHITE("white"),
	@JsonProperty("black")
	BLACK("black"),
	@JsonProperty("none")
	NONE("none");
	
	private String diceType;
	
	DefenseDice(String diceType) {
		this.diceType = diceType;
	}
	
	public String toString() {
		return diceType;
	}
}
