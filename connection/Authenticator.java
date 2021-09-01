package connection;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.*;

public class Authenticator {
    // TODO: REMOVE CLIENT_ID
    String CLIENT_ID = "e761f0cb7a6d09114e7e94f7d3a5bb05";
    String baseUrl = "https://myanimelist.net/";

    /**
    * Authenticates the HTML connection with MAL and
    * returns a redirect URL.
    *
    * @return  String  The redirect url.
    */
    public String authenticate() {
        String codeVerifier = "";
        String authUrl = baseUrl + "v2/oauth2/authorize";
        StringBuffer content = new StringBuffer();

        // Generates a code verifier string
        try {
            codeVerifier = Verifier.generateCodeVerifier();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Verifier.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Creates the full authentication url
        authUrl += "?response_type=code";
        authUrl += "&client_id=" + CLIENT_ID;
        authUrl += "&code_challenge=" + codeVerifier;

        try {
            // Initiating a GET Request
            URL url = new URL(authUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setInstanceFollowRedirects(false);

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

        return content.toString();
    }
}
