package Test;

    import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

    public class Main {

        private static final String BASE_URL = "https://poe.ninja/api/data/currencyoverview";

        public static void main(String[] args) {
            String leagueName = "Standard";  // Beispiel Liga-Name
            String response = getCurrencyOverview(leagueName);
            System.out.println(response);
        }

        public static String getCurrencyOverview(String leagueName) {
            try {
                String urlString = BASE_URL + "?league=" + leagueName + "&type=Currency";
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(urlString))
                        .GET()
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    return response.body();
                } else {
                    return "GET request failed: HTTP code " + response.statusCode();
                }

            } catch (Exception e) {
                e.printStackTrace();
                return "Exception: " + e.getMessage();
            }
        }
    }



