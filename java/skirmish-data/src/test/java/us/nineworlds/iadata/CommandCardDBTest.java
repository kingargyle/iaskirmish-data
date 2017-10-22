package us.nineworlds.iadata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommandCardDBTest {

	ObjectMapper mapper;

	@Before
	public void setUp() throws Exception {
		mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
		mapper.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
	}

	@Test
	public void loadAllCommandCards() throws Exception {
		CommandCardDB commandCardDB = mapper.readValue(this.getClass().getResourceAsStream("/sampleCommandCards.json"),
				CommandCardDB.class);
		assertThat(commandCardDB).isNotNull();
	}

}
