package us.nineworlds.iadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import us.nineworlds.iadata.command.CommandCards;

public class IASpec {

	@JsonProperty(required=true, value="iaspecversion")
	@JsonPropertyDescription("The versions number of the specification implemented. Currently this is 0.5.0.  This is a required field.")
	private String version;
	
	@JsonProperty(required=true, value="army")
	@JsonPropertyDescription("An army contains a deployments group, which contains a list of deployment cards. This is a required field")
	private Army army;
	
	@JsonProperty(required=true, value="commandCards")
	@JsonPropertyDescription("A list of command cards for the army described in this specification. This is a required field.")
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
