package us.nineworlds.iadata.enums;

public enum AttackType {

	RANGE("range"),
	MELEE("melee"),
	NONE("none");
	
	private String type;
	
	AttackType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}
}
