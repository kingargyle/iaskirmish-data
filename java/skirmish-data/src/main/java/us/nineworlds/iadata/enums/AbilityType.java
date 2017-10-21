package us.nineworlds.iadata.enums;

public enum AbilityType {

	NONE("none"),
	SURGE("surge"),
	DOUBLESURGE("doublesurge"),
	BLOCK("block"),
	HABITAT("habitat");
	
	private String type;
	
	AbilityType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}
}
