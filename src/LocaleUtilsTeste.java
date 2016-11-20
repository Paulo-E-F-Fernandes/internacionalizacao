import java.util.Locale;

public class LocaleUtilsTeste {

	// Locale Alemanha
	public static final Locale ALEMANHA = Locale.GERMANY;
	// Locale para o Brasil
	// pt = iso-code para o idioma português
	// BR = iso-code para o Brasil
	public static final Locale BRASIL = new Locale("pt", "BR");
	// Locale para o Canada - Como o Canada possui dois idiomas oficiais
	// fr - iso-code para o idioma francês
	// en - iso-code para o idioma inglês
	// CA - iso-code para o Canada
	public static final Locale CANADA_FRANCES = new Locale("fr", "CA");
	public static final Locale CANADA_INGLES = new Locale("en", "CA");
	// Locale China
	public static final Locale CHINA = Locale.CHINA;
	// Locale Estados Unidos
	public static final Locale ESTADOS_UNIDOS = Locale.US;
	// Locale Inglaterra
	public static final Locale INGLATERRA = Locale.UK;
	// Locale da máquina virtual
	public static final Locale JVM_LOCALE = Locale.getDefault();
	
}
