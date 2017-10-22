package us.nineworlds.iadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import us.nineworlds.iadata.command.CommandCards;

public class IASpec {

	@JsonProperty(required=true, value="iaspecversion")
	private String version;
	
	@JsonProperty(required=true, value="army")
	private Army army;
	
	@JsonProperty(required=true, value="commandCards")
	List<CommandCards> commandCards;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Army getArmy() {
		return army;
	}

	public void setArmy(Army army) {
		this.army = army;
	}

	public List<CommandCards> getCommandCards() {
		return commandCards;
	}

	public void setCards(List<CommandCards> commandCards) {
		this.commandCards = commandCards;
	}
	
	
}
