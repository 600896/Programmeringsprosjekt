package no.hvl.dat100.prosjekt.kontroll;

import no.hvl.dat100.prosjekt.modell.KortSamling;
import no.hvl.dat100.prosjekt.modell.KortUtils;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.modell.Kort;

/**
 * Klasse som implementerer bordet som spilles på. 
 * 
 * Klassen har objektvariablene bunkeTil og bunkeFra som skal brukes til å representere 
 * kortene som er i de to bunker på border. 
 */
public class Bord {

	private KortSamling bunkeFra;
	private KortSamling bunkeTil;
	
	/**
	 * Metoden oppretter to bunker, til- og fra-bunken
	 * Alle kortene legges til fra-bunken. 
	 */
	public Bord() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.constructor("Bord"));
		// TODO - END
	}
	
	/**
	 * Gir peker/referanse til til-bunken.
	 * 
	 * @return referanse/peker til til-bunken.
	 */
	public KortSamling getBunkeTil() {
		
		return bunkeTil;
		
	}

	/**
	 * Gir peker/referanse til fra-bunken.
	 * 
	 * @return referanse/peker til fra-bunken.
	 */
	public KortSamling getBunkeFra() {
		
		return bunkeFra;
		
	}
	
	/**
	 * Sjekker om til-bunken er tom.
	 * 
	 * @return true om til-bunken er tom, false ellers.
	 */
	public boolean bunketilTom() {
		
		// TODO - START
				
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Sjekker om fra-bunken er tom.
	 * 
	 * @return true om fra-bunken er tom, false ellers.
	 */
	public boolean bunkefraTom() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());
	
		// TODO - END
		
	}
	
	/**
	 * Gir antall kort i fra-bunken.
	 * 
	 * @return antall kort i fra-bunken.
	 */
	public int antallBunkeFra() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Gir antall kort i til-bunken.
	 * 
	 * @return antall kort i til-bunken.
	 */
	public int antallBunkeTil() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}
	
	/**
	 * Tar øverste kortet fra fra-bunken og legger dettte til til-bunken (med
	 * billedsiden opp, men det trenger ikke gruppen tenke på).
	 */
	public void vendOversteFraBunke() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());
		// TODO - END
		
	}
		
	/**
	 * Tar øverste kortet fra fra-bunken.
	 * 
	 * @return peker/referanse til det kort som blev tatt fra fra-bunken
	 */
	
	public Kort taOversteFraBunke() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}
	
	/**
	 * Metode som leser øverste kortet i til-bunken. Kortet vil fremdeles være
	 * øverst i til-bunken etter at metoden er utført.
	 * 
	 * @return peker/referanse til øverste kortet i til-bunken.
	 */
	public Kort seOversteBunkeTil() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}
	
	/**
	 * Når fra-bunken blir tom, tar man vare på kortet pÂ toppen av til-bunken.
	 * Deretter legges alle den andre kortene i til-bunken over i fra-bunken.
	 * Denne stokkes og kortet som man har tatt vare pÂ legges tilbake i
	 * til-bunken. Det vil nå være det eneste kortet i til-bunken.
	 */
	public void snuTilBunken() {

		Kort siste = bunkeTil.taSiste();
		Kort gamle = new Kort(siste.getFarge(), siste.getVerdi());
		KortSamling T = new KortSamling(bunkeTil);
		bunkeFra = T;
		bunkeTil = new KortSamling();
		bunkeTil.leggTil(gamle);	
	}
		
	/**
	 * Metode som legger et kort i til-bunken. 
	 * 
	 * @param k
	 * 			kort som skal legges ned. 
	 * 	
	 */
	public void leggNedBunkeTil(Kort k) {
		
		System.out.print("\n Spelar Nord Pr�var � gjere noko \n");
		System.out.printf("Toppen er %d , Farge er %s \n", topp.getVerdi(), topp.fargeTilStreng());
		System.out.printf("Nord Har : \n"); 

		for(Kort i : hand) 
			{
			System.out.printf("%d , \tFarge er %s \n ", i.getVerdi(), i.fargeTilStreng());
			}

		Kort mogleg = hand.GetGyldige(topp);

		if(mogleg != null) {
			System.out.printf("Kan legge ned kort : \tFarge = %s\tVerdi=\t%d\n",mogleg.fargeTilStreng(),mogleg.getVerdi());
			return new Handling(HandlingsType.LEGGNED, mogleg);
		}

		if(getAntallTrekk() < Regler.maksTrekk()) {
			System.out.printf("Pr�var � trekke, Antal trekk er : %d \n", getAntallTrekk());
			return new Handling(HandlingsType.TREKK, topp);
		}
		System.out.println("M� melde Pass");
		return new Handling(HandlingsType.FORBI, topp);

	}
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());
		// TODO - END
				
	}
}
