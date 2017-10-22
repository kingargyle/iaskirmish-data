package us.nineworlds.iadata.util;


import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import us.nineworlds.iadata.DeploymentsDB;

public class DeploymentDBWriter {

	public DeploymentsDB write(DeploymentsDB deploymentsDB, File DeploymentsDBFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);

		try {
			mapper.writeValue(DeploymentsDBFile, deploymentsDB);
		} catch (IOException e) {
			throw new IOException("Unable to write DeploymentsDB File.", e);
		}
		return deploymentsDB;
	}
		
	public DeploymentsDB write(DeploymentsDB deploymentsDB, OutputStream inputStream) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);

		try {
			mapper.writeValue(inputStream, deploymentsDB);
		} catch (IOException e) {
			throw new IOException("Unable to write DeploymentsDB inputstream.", e);
		}
		return deploymentsDB;
	}
}
