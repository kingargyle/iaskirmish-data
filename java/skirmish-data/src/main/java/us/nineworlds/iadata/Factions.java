package us.nineworlds.iadata;

public enum Factions {
	
	IMPERIAL("imperial"),
	REBEL("rebel"),
	MERCENARY("mercenary"),
	ANY("any");
	
	private String faction;
	
	Factions(String faction) {
		this.faction = faction;
	}
	
	public String toString() {
		return faction;
	}
	
}
