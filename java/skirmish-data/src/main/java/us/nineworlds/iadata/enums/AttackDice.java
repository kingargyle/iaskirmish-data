package us.nineworlds.iadata.enums;

public enum AttackDice {

	BLUE("blue"),
	RED("red"),
	GREEN("green"),
	YELLOW("yellow"),
	ANY("any");
	
	private String color;
	
	AttackDice(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color;
	}
	
}
