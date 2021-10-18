package no.hvl.dat100.prosjekt.modell;
import java.lang.Iterable;
import java.util.*;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;
import static java.lang.System.out;


/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * en konstant i klassen Regler som angir antall kort i hver av de 4 fargene. Når
 * programmet er ferdig settes denne til 13, men under utvikling / testing kan
 * det være praktisk å ha denne mindre.
 * 
 */
public class KortSamling {
	tab [] Kort = {1, 2, 3, 4};
	
	getAntalKort(Kort);

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;

	
	private int antall;
	
	/**
	 * Oppretter en tom Kortsamling med plass 
	 * til MAKS_KORT (hele kortstokken).
	 */
	public KortSamling() {
		samling = new Kort[MAKS_KORT];
		antall = 0;
		
	
	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke være
	 * full. Kortene ligger sammenhengende fra starten av tabellen. Kan få
	 * tilgang til antallet ved å bruke metoden getAntallKort(). Metoden er
	 * først og fremst ment å brukes i testklasser. Om man trenger
	 * kortene utenfor, anbefales metoden getAlleKort().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {
		
		int samling = 0;
		
		for (int i = 0; i < Kort.length; i++) {
		samling = i;
			
		}
		
		return samling;
	}
	
	/**
	 * Antall kort i samlingen.
	 * 
	 * @return antall kort i samlinga.
	 */
	public int getAntalKort() {
		int antall = 0;
		
		for (int i = 0; i < Kort.length; i++) {
			antall = i;
		}
		
		return antall;
		
	}
	
	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {
		
		boolean tom = true;	
		int antal = 0;
		
			for (int i = 0; i < Kort.length; i++) {
				samling = i;
			}
			System.out.println(samling);
			if (antal == 0) {
				tom = true;
				}
			else {
				tom = false;
			}
			return (tom);
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort
	 *            er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {
		
		Kort.add(kort);
		
//		int param = 0;

//		 int nyLengde = Kort.length + param;
//		 int [] nyTab = new int [nyLengde];
//		 
//		 for (int i = 0; i < Kort.length; i++) {
//			 nyTab[i] = tab[i];
//		 }
//
//		 for (int k = 1; k < nyTab.length; k++) {	
//				nyTab[k];
//			}
	}
	
	/**
	 * Legger alle korta (hele kortstokken) til samlinga. Korta vil være sortert
	 * slik at de normalt må stokkes før bruk.
	 */
	public void leggTilAlle() {
		
		// TODO - START
		// Husk: bruk Regler.MAKS_KORT_FARGE for å få antall kort per farge
		
		  for (Kortfarge f : Kortfarge.values()) {
	            for (int i = 1; i <= Regler.MAKS_KORT_FARGE; i++) {
	                samling[i - 1] = new Kort(f, i);
	                antall++;
	            }
	        }
	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {
		kort.clear();
		
		
		throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}
	
	/**
	 * Ser på siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort seSiste() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
		
	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort taSiste() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
	}
	
	/**
	 * Undersøker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());
		// return false;
		// TODO - END
		
	}

	/**
	 * Fjernar et kort frå samlinga. Dersom kortet ikke finnest i samlinga,
	 * skjer ingenting med samilingen
	 * 
	 * @param kort
	 *            kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *            ingenting.
	 * @return true om kortet blev fjernet fra samlinga, false ellers.
	 */
			 
	public boolean fjern(Kort kort) {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefølge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {
		String [] Spar = {"SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK"};
		String [] Hjerter = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String [] Ruter = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String [] Kl�ver = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
		String[] samling = {Spar, Hjerter, Ruter, Kl�ver};
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	
	}
	
}
