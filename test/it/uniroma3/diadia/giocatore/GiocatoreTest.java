package it.uniroma3.diadia.giocatore;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach ;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

class GiocatoreTest {
	private Giocatore giocatore ;


	@BeforeEach 
	public void setUp() {
		this.giocatore = new Giocatore() ;
	}

	@Test
	public void testCfuNonFinitiInizioPartita() {
		assertNotEquals(0,this.giocatore.getCfu()) ;
	}
	@Test
	public void testCfuIniziali() {
		assertEquals(Giocatore.CFU_INIZIALI,this.giocatore.getCfu());
	}
}
