package us.nineworlds.iadata.util;

import java.io.ByteArrayOutputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import us.nineworlds.iadata.IASpec;

public class IASpectWriterTest {

	IASpecWriter writer;
	IASpecLoader loader;
	
	@Before
	public void setup() throws Exception {
		writer = new IASpecWriter();
		loader = new IASpecLoader();
	}
	
	@Test
	public void test() throws Exception {
		IASpec iaSpec = loader.load(getClass().getResourceAsStream("/sampleIASpec.json"));
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		writer.write(iaSpec, outputStream);
		
		String expectedJson = IOUtils.toString(getClass().getResourceAsStream("/sampleIASpec.json"));
		String resultJson = new String(outputStream.toByteArray());
		
		JSONAssert.assertEquals(expectedJson, resultJson, false);
	}
}
