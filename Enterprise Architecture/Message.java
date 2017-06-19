package i18n;
import java.util.ResourceBundle;
import java.util.Locale;

public class Message {
	static public void main(String[] args) {
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		
		Locale myLocaleEn = new Locale("en", "EN");
		Locale myLocaleFr = new Locale("fr", "FR");
		Locale myLocaleDe = new Locale("de", "DE");
		
		ResourceBundle theBundleEn = ResourceBundle.getBundle("MessagesBundle", myLocaleEn);
		ResourceBundle theBundleFr = ResourceBundle.getBundle("MessagesBundle", myLocaleFr);
		ResourceBundle theBundleDe = ResourceBundle.getBundle("MessagesBundle", myLocaleDe);
		
		System.out.println(theBundleEn.getString("greetings"));
		System.out.println(theBundleFr.getString("farewell"));
		System.out.println(theBundleDe.getString("inquiry"));
		
        //System.out.println("Hello.");
        //System.out.println("How are you?");
        //System.out.println("Goodbye.");
    }

}
