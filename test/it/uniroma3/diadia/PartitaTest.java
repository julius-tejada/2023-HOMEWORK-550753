package it.uniroma3.diadia;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach ;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;

class PartitaTest {

	private Partita partita ;

	@BeforeEach 
	public void setUp() {
		this.partita = new Partita() ;
	}
	
	@Test
	public void testFinitaSeCFUFiniti() {
		this.partita.setFinita() ;
		assertTrue(this.partita.isFinita()) ;
	}
	@Test
	void testGetStanzaVincenteNotNull() {
		assertNotNull(this.partita.getStanzaVincente()) ;
	}

	@Test
	public void testVintaSeStanzaCorrenteEVincente() {
		this.partita.setStanzaCorrente(this.partita.getStanzaVincente());
		assertTrue(this.partita.vinta()) ;
	}

	@Test 
	public void testNonVintaInizioPartita() {
		assertFalse(this.partita.vinta()) ;
	}

	@Test
	public void testFinitaSeVinta() {
		this.partita.setStanzaCorrente(this.partita.getStanzaVincente()) ;
		assertTrue(this.partita.isFinita()) ;
	}

}
