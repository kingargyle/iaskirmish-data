package us.nineworlds.iadata.command;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommandCards {

	@JsonProperty("card")
	private CommandCard commandCard;

	public CommandCard getCommandCard() {
		return commandCard;
	}

	public void setCommandCard(CommandCard commandCard) {
		this.commandCard = commandCard;
	}
}
