package us.nineworlds.iadata.util;

import static com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import us.nineworlds.iadata.CommandCardDB;

public class CommandCardsDBLoader {
	
	public CommandCardDB load(File deploymentsFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);

		CommandCardDB CommandCardDB;
		try {
			CommandCardDB = mapper.readValue(deploymentsFile, CommandCardDB.class);
		} catch (IOException e) {
			throw new IOException("Unable to load CommandCardDB File.", e);
		}
		return CommandCardDB;
	}
	
	public CommandCardDB load(URL CommandCardDBUrl) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);

		CommandCardDB CommandCardDB;
		try {
			CommandCardDB = mapper.readValue(CommandCardDBUrl, CommandCardDB.class);
		} catch (IOException e) {
			throw new IOException("Unable to load CommandCardDB url.", e);
		}
		return CommandCardDB;
		
	}
	
	public CommandCardDB load(InputStream inputStream) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);

		CommandCardDB CommandCardDB;
		try {
			CommandCardDB = mapper.readValue(inputStream, CommandCardDB.class);
		} catch (IOException e) {
			throw new IOException("Unable to load IASpec inputstream.", e);
		}
		return CommandCardDB;
	}
}
