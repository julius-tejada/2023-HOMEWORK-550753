package it.uniroma3.diadia.ambienti;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.jupiter.api.BeforeEach ;


class StanzaTest {
	//FIXTURE , VARIABILI D'ISTANZA
	private final static int MAX_ATTREZZI = 10 ;
	private final static String ATTREZZO = "AttrezzoDiTest" ;
	private final static String STANZA = "StanzaTest" ;
	private final static String STANZA_ADIACENTE = "StanzaAdiacente" ;
	private final static String NORD = "nord" ;
	//	private final static String SUD_OVEST = "sud-ovest" ;

	protected Stanza stanza ;

	@BeforeEach
	//SETUP istanzia una nuova stanza ogni volta
	public void setUp() {
		this.stanza = new Stanza(STANZA) ;
	}

	@Test
	public void testImpostaStanzaAdiacenteSingola() {
		Stanza adiacente = creaStanzaEImpostaAdiacente(this.stanza, STANZA_ADIACENTE, NORD);
		assertEquals(adiacente,this.stanza.getStanzaAdiacente(NORD));
	}

	@Test
	//obiettivo: creare una stanza adiacente ,cambiarla e testare
	//se la nuova stanza e' stata cambiata
	public void cambiaStanzaAdiacente() {
		creaStanzaEImpostaAdiacente(this.stanza, STANZA_ADIACENTE, NORD);
		Stanza nuova = creaStanzaEImpostaAdiacente(this.stanza, "Nuova_Adiacente", NORD);
		assertEquals(nuova, this.stanza.getStanzaAdiacente(NORD));
	}
	@Test
	public void testImpostaMassimo4Stanze() {
		Stanza adiacente = new Stanza(STANZA_ADIACENTE) ;
		String[] direzioni = {"nord","sud","est","ovest"} ;
		//riempio la mia stanza di tutte le direzioni
		for(String direzione : direzioni)
			this.stanza.impostaStanzaAdiacente(direzione, adiacente);

		//controllo che le stanze siano tutte occupate
		String direzioneNuova = "sud-ovest" ;
		creaStanzaEImpostaAdiacente(this.stanza, "Da non inserire",direzioneNuova) ;

		assertNotContains(this.stanza.getDirezioni(),direzioneNuova) ;
	}

	private void assertNotContains(String[] direzioni, String direzioneNuova) {
		boolean contiene = false ;
		for(String direzione : direzioni)
			if(direzione != null && direzione.equals(direzioneNuova)) 
				contiene = true ;

		assertFalse(contiene);
	}
	
	@Test
	public void testHasAttrezzoSingolo() {
		Attrezzo attrezzo = new Attrezzo(ATTREZZO ,1) ;
		this.stanza.addAttrezzo(attrezzo) ;
		assertTrue(this.stanza.hasAttrezzo(ATTREZZO)) ;
	}
	
	@Test 
	public void testHasAttrezzoStanzaVuota() {
		assertFalse(this.stanza.hasAttrezzo(ATTREZZO)) ;
	}

	//METODO DI UTILITA'
	//gli passo la stanza di partenza,il nome della stanza adiacente e la direzione
	//istanzio una nuova stanza(adiacente)e gliela imposta come stanza adiacente alla stanza
	//di partenza,poi la restituisco
	private Stanza creaStanzaEImpostaAdiacente(Stanza stanzaDiPartenza,String nomeStanzaAdiacente,String direzione ) {
		Stanza stanzaAdiacente = new Stanza(nomeStanzaAdiacente) ;
		stanzaDiPartenza.impostaStanzaAdiacente(direzione, stanzaAdiacente);
		return stanzaAdiacente ;
	}


}
