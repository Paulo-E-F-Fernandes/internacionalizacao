import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.ResourceBundle;


public class Teste {

	private static final double NUMBER = 23.59;

	public static void main(String[] args) {
		// Locale default
		DateFormat dateFormat = DateFormat.getInstance();
		DateFormat timeFormat = DateFormat.getTimeInstance();
		NumberFormat numberFormat = NumberFormat.getInstance();
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("\n***Formato padrão (máquina virtual)***");
		System.out.println("  Data : " + dateFormat.format(new Date()));
		System.out.println("  Hora : " + timeFormat.format(new Date()));
		System.out.println("Número : " + numberFormat.format(NUMBER));
		System.out.println(" Preço : " + currencyFormat.format(NUMBER));
		
		// Locale Alemanha
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, LocaleUtilsTeste.ALEMANHA);
		timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleUtilsTeste.ALEMANHA);
		numberFormat = NumberFormat.getNumberInstance(LocaleUtilsTeste.ALEMANHA);
		currencyFormat = NumberFormat.getCurrencyInstance(LocaleUtilsTeste.ALEMANHA);
		
		System.out.println("\n***Alemanha***");
		System.out.println("  Data: " + dateFormat.format(new Date()));
		System.out.println("  Hora: " + timeFormat.format(new Date()));
		System.out.println("Número: " + numberFormat.format(NUMBER));
		System.out.println(" Preço: " + currencyFormat.format(NUMBER));
		
		// Locale Brasil 
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, LocaleUtilsTeste.BRASIL);
		timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleUtilsTeste.BRASIL);
		numberFormat = NumberFormat.getNumberInstance(LocaleUtilsTeste.BRASIL);
		currencyFormat = NumberFormat.getCurrencyInstance(LocaleUtilsTeste.BRASIL);
		
		System.out.println("\n***Brasil***");
		System.out.println("  Data: " + dateFormat.format(new Date()));
		System.out.println("  Hora: " + timeFormat.format(new Date()));
		System.out.println("Número: " + numberFormat.format(NUMBER));
		System.out.println(" Preço: " + currencyFormat.format(NUMBER));
		
		// Locale Canada francês 
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, LocaleUtilsTeste.CANADA_FRANCES);
		timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleUtilsTeste.CANADA_FRANCES);
		numberFormat = NumberFormat.getNumberInstance(LocaleUtilsTeste.CANADA_FRANCES);
		currencyFormat = NumberFormat.getCurrencyInstance(LocaleUtilsTeste.CANADA_FRANCES);
		
		System.out.println("\n***Canada francês***");
		System.out.println("  Data: " + dateFormat.format(new Date()));
		System.out.println("  Hora: " + timeFormat.format(new Date()));
		System.out.println("Número: " + numberFormat.format(NUMBER));
		System.out.println(" Preço: " + currencyFormat.format(NUMBER));
		
		// Locale Canada inglês
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, LocaleUtilsTeste.CANADA_INGLES);
		timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleUtilsTeste.CANADA_INGLES);
		numberFormat = NumberFormat.getNumberInstance(LocaleUtilsTeste.CANADA_INGLES);
		currencyFormat = NumberFormat.getCurrencyInstance(LocaleUtilsTeste.CANADA_INGLES);
		
		System.out.println("\n***Canada inglês***");
		System.out.println("  Data: " + dateFormat.format(new Date()));
		System.out.println("  Hora: " + timeFormat.format(new Date()));
		System.out.println("Número: " + numberFormat.format(NUMBER));
		System.out.println(" Preço: " + currencyFormat.format(NUMBER));
		
		// Locale China
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, LocaleUtilsTeste.CHINA);
		timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleUtilsTeste.CHINA);
		numberFormat = NumberFormat.getNumberInstance(LocaleUtilsTeste.CHINA);
		currencyFormat = NumberFormat.getCurrencyInstance(LocaleUtilsTeste.CHINA);
		
		System.out.println("\n***China***");
		System.out.println("  Data: " + dateFormat.format(new Date()));
		System.out.println("  Hora: " + timeFormat.format(new Date()));
		System.out.println("Número: " + numberFormat.format(NUMBER));
		System.out.println(" Preço: " + currencyFormat.format(NUMBER));
		
		// Locale Estados Unidos
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, LocaleUtilsTeste.ESTADOS_UNIDOS);
		timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleUtilsTeste.ESTADOS_UNIDOS);
		numberFormat = NumberFormat.getNumberInstance(LocaleUtilsTeste.ESTADOS_UNIDOS);
		currencyFormat = NumberFormat.getCurrencyInstance(LocaleUtilsTeste.ESTADOS_UNIDOS);
		
		System.out.println("\n***Estados Unidos***");
		System.out.println("  Data: " + dateFormat.format(new Date()));
		System.out.println("  Hora: " + timeFormat.format(new Date()));
		System.out.println("Número: " + numberFormat.format(NUMBER));
		System.out.println(" Preço: " + currencyFormat.format(NUMBER));
		
		// Locale Inglaterra
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, LocaleUtilsTeste.INGLATERRA);
		timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleUtilsTeste.INGLATERRA);
		numberFormat = NumberFormat.getNumberInstance(LocaleUtilsTeste.INGLATERRA);
		currencyFormat = NumberFormat.getCurrencyInstance(LocaleUtilsTeste.INGLATERRA);
		
		System.out.println("\n***Inglaterra***");
		System.out.println("  Data: " + dateFormat.format(new Date()));
		System.out.println("  Hora: " + timeFormat.format(new Date()));
		System.out.println("Número: " + numberFormat.format(NUMBER));
		System.out.println(" Preço: " + currencyFormat.format(NUMBER));
		
		// Locale JVM
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, LocaleUtilsTeste.JVM_LOCALE);
		timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleUtilsTeste.JVM_LOCALE);
		numberFormat = NumberFormat.getNumberInstance(LocaleUtilsTeste.JVM_LOCALE);
		currencyFormat = NumberFormat.getCurrencyInstance(LocaleUtilsTeste.JVM_LOCALE);
		
		System.out.println("\n***Java Virtual Machine***");
		System.out.println("  Data: " + dateFormat.format(new Date()));
		System.out.println("  Hora: " + timeFormat.format(new Date()));
		System.out.println("Número: " + numberFormat.format(NUMBER));
		System.out.println(" Preço: " + currencyFormat.format(NUMBER));		
		
		/* ************************************************************************************************************ */
		System.out.println("\n***ResourceBundle***");
		// A nomenclatura segue o padrão, "messages_'iso-code-language'_'iso-code-country'". 
		// Para carregar o arquivo "messages" baseada na Locale pt-BR basta usar:
		ResourceBundle bundle = ResourceBundle.getBundle("messages/messages", LocaleUtilsTeste.BRASIL);
		System.out.println(bundle.getString("welcome"));
		System.out.println(bundle.getString("logout"));
		System.out.println();
		// Para carregar o arquivo "messages" baseada na Locale de-DE basta usar:
		bundle = ResourceBundle.getBundle("messages/messages", LocaleUtilsTeste.ALEMANHA);
		System.out.println(bundle.getString("welcome"));
		System.out.println(bundle.getString("logout"));
		System.out.println();
		// Para carregar o arquivo "messages" baseada na Locale en-US basta usar:
		bundle = ResourceBundle.getBundle("messages/messages", LocaleUtilsTeste.ESTADOS_UNIDOS);
		System.out.println(bundle.getString("welcome"));
		System.out.println(bundle.getString("logout"));
		System.out.println();
		// Para carregar alguma mensagem personalizada do proprieties:
		bundle = ResourceBundle.getBundle("messages/messages", LocaleUtilsTeste.BRASIL);
		System.out.println(bundle.getString("mensagemParametrizada"));
		System.out.println(MessageFormat.format(bundle.getString("mensagemParametrizada"), "i18n", "formatação"));
	}

}
