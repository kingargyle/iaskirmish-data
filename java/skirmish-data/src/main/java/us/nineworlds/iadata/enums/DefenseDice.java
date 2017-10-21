package us.nineworlds.iadata.enums;

public enum DefenseDice {

	WHITE("white"),
	BLACK("black"),
	NONE("none");
	
	private String diceType;
	
	DefenseDice(String diceType) {
		this.diceType = diceType;
	}
	
	public String toString() {
		return diceType;
	}
}
