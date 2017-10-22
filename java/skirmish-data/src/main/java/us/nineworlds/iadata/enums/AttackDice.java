package us.nineworlds.iadata.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AttackDice {

	@JsonProperty("blue")
	BLUE("blue"),
	@JsonProperty("red")
	RED("red"),
	@JsonProperty("green")
	GREEN("green"),
	@JsonProperty("yellow")
	YELLOW("yellow"),
	@JsonProperty("any")
	ANY("any");
	
	private String color;
	
	AttackDice(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color;
	}
	
}
