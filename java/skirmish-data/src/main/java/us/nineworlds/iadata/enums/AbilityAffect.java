package us.nineworlds.iadata.enums;

public enum AbilityAffect {

	DAMAGE("damage"),
	STUN("stun"),
	WEAKEN("weaken"),
	BLEED("bleed"),
	ACCURACY("accuracy"),
	HIDE("hide"),
	PIERCE("pierce"),
	RECOVER("recover"),
	MOBILE("mobile"),
	MASSIVE("massive"),
	CANCEL("cancel"),
	FOCUS("focus"),
	POWERDAMAGE("powerdamage"),
	POWERBLOCK("powerblock"),
	BLAST("blast"),
	CLEAVE("cleave"),
	BLOCK("block"),
	SURGE("surge"),
	REACH("reach"),
	DESERT("desert"),
	SNOW("snow");
	
	private String affectType;
	
	AbilityAffect(String affectType) {
		this.affectType = affectType;
	}
	
	public String toString() {
		return affectType;
	}
}
