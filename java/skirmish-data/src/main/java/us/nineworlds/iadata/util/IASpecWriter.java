package us.nineworlds.iadata.util;


import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import us.nineworlds.iadata.IASpec;

public class IASpecWriter {

	
	public IASpec write(IASpec iaspec, File iaSpecFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);

		try {
			mapper.writeValue(iaSpecFile, iaspec);
		} catch (IOException e) {
			throw new IOException("Unable to write IASpec File.", e);
		}
		return iaspec;
	}
		
	public IASpec write(IASpec iaspec, OutputStream inputStream) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);

		try {
			mapper.writeValue(inputStream, iaspec);
		} catch (IOException e) {
			throw new IOException("Unable to write IASpec inputstream.", e);
		}
		return iaspec;
	}
}
