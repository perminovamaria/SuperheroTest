import com.fasterxml.jackson.databind.DeserializationFeature;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class CreateSuperheroTest {

    private ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private String controllerPath = "superheroes";

    @Test
    public void whenCreatingAUserAndProvidingPhone_thenPhoneShouldBeStored() throws IOException {

        String expectedPhone = "+79009000000";

        SuperHeroModel superheroReq = new SuperHeroModel(
                "2020-02-10",
                "Vrn",
                "Flash",
                "M",
                null,
                "Speed",
                expectedPhone
        );

        String jsonRequest = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(superheroReq);
        String response = new ApiHelper().sendPostRequest(controllerPath, jsonRequest);
        SuperHeroModel superHeroRes = mapper.readValue(response, SuperHeroModel.class);

        String resultPhone = superHeroRes.getPhone();
        assertEquals(expectedPhone, resultPhone);
    }

}