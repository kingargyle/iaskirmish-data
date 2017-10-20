package us.nineworlds.iadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deployment {

	@JsonProperty(required=true, value="iaspecName")
	private String iaspecname;
	
	@JsonProperty(required=true, value="faction")
	private Factions faction;
	
	@JsonProperty("name")
	private String name;

	public String getIAspecname() {
		return iaspecname;
	}

	public void setIAspecname(String iaspecname) {
		this.iaspecname = iaspecname;
	}

	public Factions getFaction() {
		return faction;
	}

	public void setFaction(Factions faction) {
		this.faction = faction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
