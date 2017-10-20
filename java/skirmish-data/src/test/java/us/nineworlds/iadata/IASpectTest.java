package us.nineworlds.iadata;


import static com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IASpectTest {
	
	ObjectMapper mapper;
	
	@Before
	public void setUp() {
		mapper = new ObjectMapper();
		mapper.enable(READ_ENUMS_USING_TO_STRING);
	}
	
	@Test
	public void loadIASpec() throws Exception {
		IASpec iaspec = mapper.readValue(this.getClass().getResourceAsStream("/sampleIASpec.json"), IASpec.class);
		
		assertThat(iaspec).isNotNull();
	}
	
	@Test
	public void loadIASpecCheckFactionEnumerationMapping() throws Exception {
		IASpec iaspec = mapper.readValue(this.getClass().getResourceAsStream("/sampleIASpec.json"), IASpec.class);
		
		assertThat(iaspec.getCommandCards().get(0).getCommandCard().getFaction()).isEqualTo(Factions.ANY);
	}

}