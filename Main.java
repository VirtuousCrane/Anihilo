import connection.*;

public class Main {
    public static void main(String[] args) {
        Authenticator auth = new Authenticator();
        String aString  =auth.authenticate();
        System.out.println(aString);
    }
}
