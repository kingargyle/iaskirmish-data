package us.nineworlds.iadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommandCard {

	@JsonProperty(required=true, value="faction")
	private Factions faction;
	
	@JsonProperty(required=true, value="iaspecName")
	private String iaspecname;
	
	@JsonProperty("name")
	private String name;
	
	public Factions getFaction() {
		return faction;
	}

	public void setFaction(Factions faction) {
		this.faction = faction;
	}

	public String getIaspecname() {
		return iaspecname;
	}

	public void setIaspecname(String iaspecname) {
		this.iaspecname = iaspecname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
