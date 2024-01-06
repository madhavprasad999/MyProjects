import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIHandler {
	String API_BASE_URL="https://api.dictionaryapi.dev/api/v2/entries/en/";
	
	HttpClient client=null;
	HttpRequest request=null;
	URI uri=null;
	HttpResponse<String> response=null;
	
	public String getResponse(String word) {
		String urlForConnection=API_BASE_URL + word;
		client=HttpClient.newBuilder().build();
		uri= URI.create(urlForConnection);
		request=HttpRequest.newBuilder(uri).build();
		
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String body = response.body();
		return body;
		
	}
	
}
