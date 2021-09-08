package connection;

import java.io.UnsupportedEncodingException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.net.*;

public class Kitsu {
    String baseUrl = "https://kitsu.io/api/";

    /**
    * Gets the data of an anime from Kitsu
    *
    * @return  HashMap<String, String>  The anime data
    */
    public HashMap<String, String> get_anime_data(int id) {
        String animeDataUrl = baseUrl + "edge/anime/" + id;
        StringBuffer content = new StringBuffer();

        try {
            // Initiating a GET Request
            URL url = new URL(animeDataUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Connection", "keep-alive");
            con.setRequestProperty("UseCookieContainer", "True");
            con.connect();

            // Reads the request data
            int status = con.getResponseCode();
            Reader streamReader = null;
            String inputLine;

            if (status != 200) {
                streamReader = new InputStreamReader(con.getErrorStream());
            } else {
                streamReader = new InputStreamReader(con.getInputStream());
            }

            BufferedReader in = new BufferedReader(streamReader);

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        HashMap<String, String> retMap = JSON.parse (content.toString());

        return retMap;

    }
}
