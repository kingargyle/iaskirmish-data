package us.nineworlds.iadata.util;

import static com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import us.nineworlds.iadata.DeploymentsDB;

public class DepoymentsDBLoader {

	
	public DeploymentsDB load(File deploymentsFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);

		DeploymentsDB deploymentsDB;
		try {
			deploymentsDB = mapper.readValue(deploymentsFile, DeploymentsDB.class);
		} catch (IOException e) {
			throw new IOException("Unable to load DeploymentsDB File.", e);
		}
		return deploymentsDB;
	}
	
	public DeploymentsDB load(URL deploymentsDBUrl) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);

		DeploymentsDB deploymentsDB;
		try {
			deploymentsDB = mapper.readValue(deploymentsDBUrl, DeploymentsDB.class);
		} catch (IOException e) {
			throw new IOException("Unable to load DeploymentsDB url.", e);
		}
		return deploymentsDB;
		
	}
	
	public DeploymentsDB load(InputStream inputStream) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);

		DeploymentsDB deploymentsDB;
		try {
			deploymentsDB = mapper.readValue(inputStream, DeploymentsDB.class);
		} catch (IOException e) {
			throw new IOException("Unable to load IASpec inputstream.", e);
		}
		return deploymentsDB;
	}
}
