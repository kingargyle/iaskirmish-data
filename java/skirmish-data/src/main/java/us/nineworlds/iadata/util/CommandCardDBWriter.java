package us.nineworlds.iadata.util;


import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import us.nineworlds.iadata.CommandCardDB;

public class CommandCardDBWriter {

	public CommandCardDB write(CommandCardDB commandCardDB, File CommandCardDBFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);

		try {
			mapper.writeValue(CommandCardDBFile, commandCardDB);
		} catch (IOException e) {
			throw new IOException("Unable to write CommandCardDB File.", e);
		}
		return commandCardDB;
	}
		
	public CommandCardDB write(CommandCardDB commandCardDB, OutputStream inputStream) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);

		try {
			mapper.writeValue(inputStream, commandCardDB);
		} catch (IOException e) {
			throw new IOException("Unable to write CommandCardDB inputstream.", e);
		}
		return commandCardDB;
	}
}
