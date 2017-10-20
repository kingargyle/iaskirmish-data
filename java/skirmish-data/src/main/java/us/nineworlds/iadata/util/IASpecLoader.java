package us.nineworlds.iadata.util;

import static com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import us.nineworlds.iadata.IASpec;

public class IASpecLoader {

	
	public IASpec load(File iaSpecFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);

		IASpec iaspec;
		try {
			iaspec = mapper.readValue(iaSpecFile, IASpec.class);
		} catch (IOException e) {
			throw new IOException("Unable to load IASpec File.", e);
		}
		return iaspec;
	}
	
	public IASpec load(URL iaSpecUrl) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);

		IASpec iaspec;
		try {
			iaspec = mapper.readValue(iaSpecUrl, IASpec.class);
		} catch (IOException e) {
			throw new IOException("Unable to load IASpec url.", e);
		}
		return iaspec;
		
	}
	
	public IASpec load(InputStream inputStream) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);

		IASpec iaspec;
		try {
			iaspec = mapper.readValue(inputStream, IASpec.class);
		} catch (IOException e) {
			throw new IOException("Unable to load IASpec inputstream.", e);
		}
		return iaspec;
	}
}
