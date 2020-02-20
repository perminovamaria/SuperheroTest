import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ApiHelper {

    private static String ApiUrl =  "https://superhero.qa-test.csssr.com/";

    public String sendPostRequest(String url, String jsonRequest) throws IOException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        String responseStr = null;

        try {
            HttpPost request = new HttpPost(ApiUrl + url);
            StringEntity params = new StringEntity(jsonRequest);
            request.addHeader("content-type", "application/json");
            request.setEntity(params);
            CloseableHttpResponse response = httpClient.execute(request);
            responseStr = EntityUtils.toString(response.getEntity());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            httpClient.close();
        }

        return responseStr;
    }
}
