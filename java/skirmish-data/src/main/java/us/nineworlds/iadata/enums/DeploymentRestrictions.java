package us.nineworlds.iadata.enums;

public enum DeploymentRestrictions {

	WOOKIEE("wookiee"),
	SMUGGLER("smuggler"),
	GUARDIAN("guardian"),
	TROOPER("trooper"),
	HUNTER("hunter"),
	LEADER("leader"),
	CREATURE("creature"),
	VEHICLE("vehicle"),
	BRAWLER("brawler"),
	FORCEUSER("forceuser"),
	HEAVYWEAPON("heavyweapon"),
	DROID("droid"),
	SPY("spy");
	
	private String restriction;
	
	DeploymentRestrictions(String restriction) {
		this.restriction = restriction;
	}
	
	public String toString() {
		return restriction;
	}
}
