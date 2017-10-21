package us.nineworlds.iadata;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeploymentsDBTest {

	ObjectMapper mapper;
	
	@Before
	public void setUp() throws Exception {
		mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
		mapper.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
	}
	
	@Test
	public void loadDeploymentsFile() throws Exception {
		DeploymentsDB deploymentsDB = mapper.readValue(this.getClass().getResourceAsStream("/sampleDeployments.json"), DeploymentsDB.class);
		
		assertThat(deploymentsDB).isNotNull();
	}

}
