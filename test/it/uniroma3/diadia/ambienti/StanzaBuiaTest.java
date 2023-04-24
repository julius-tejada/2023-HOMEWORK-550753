package it.uniroma3.diadia.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StanzaBuiaTest {
	private final static String DESCRIZIONE_STANZA = "StanzaBuia" ;
	private static final String ATTREZZO_LUCE_TEST = "attrezzo luce test" ;
	private StanzaBuia stanzaBuia;
	
	@BeforeEach 
	public void setUp() {
		this.stanzaBuia = new StanzaBuia("Stanzabuia",ATTREZZO_LUCE_TEST) ;
		
	}
	@Test
	public void testGetDescrizioneLuceNonPresente() {
		assertEquals(StanzaBuia.DESCRIZIONE_STANZA_BUIA,this.stanzaBuia.getDescrizione()) ;
	}

}
