import java.util.Locale;

public class LocaleExample {
	public static void main(String[] args) {
		System.out.println( Locale.getDefault().toString() );
		System.out.println( Locale.getDefault().getDisplayCountry() );
		System.out.println( Locale.getDefault().getISO3Country() );
		System.out.println( Locale.getDefault().getDisplayName() );
		System.out.println( Locale.getDefault().getLanguage() );
	}
}