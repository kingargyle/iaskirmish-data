package us.nineworlds.iadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import us.nineworlds.iadata.command.CommandCards;

/**
 * Provides an in memory data store for all the command cards.
 */
public class CommandCardDB {

	@JsonProperty("commandCards")
	private List<CommandCards> commandCards;

	public List<CommandCards> getCommandCards() {
		return commandCards;
	}

	public void setCommandCards(List<CommandCards> commandCards) {
		this.commandCards = commandCards;
	}
		
}
