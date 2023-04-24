package it.uniroma3.diadia.giocatore;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach ;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

class BorsaTest {
	private Borsa borsa ;
	private final static String ATTREZZO = "attrezzoSemplice" ;
	private final static int PESO_MAX_BORSA = 20 ;

	@BeforeEach
	public void setUp() {
		this.borsa = new Borsa(PESO_MAX_BORSA) ;
	}

	@Test
	public void testAddAttrezzoSingolo() {
		Attrezzo attrezzo = creaAttrezzoEAggiungiBorsa(this.borsa,ATTREZZO,1) ;
		assertEquals(attrezzo,this.borsa.getAttrezzo(ATTREZZO)) ;
	}
	@Test 
	public void testAddAttrezzoTroppoPesante() {
		Attrezzo attrezzoPesante = new Attrezzo("attrezzoPeante",PESO_MAX_BORSA+1) ;
		assertFalse(this.borsa.addAttrezzo(attrezzoPesante)) ;
	}
	@Test
	public void testGetAttrezzoInesistente() {
		creaAttrezzoEAggiungiBorsa(this.borsa,ATTREZZO,1) ;
		assertNull(this.borsa.getAttrezzo("inesistente")) ;
		
	}
	@Test
	public void testGetAttrezzoBorsaVuota() {
		assertEquals(PESO_MAX_BORSA,this.borsa.getPesoMax()) ;
	}
	@Test
	public void testGetPesoIniziale() {
		assertEquals(0,this.borsa.getPeso()) ;
	}
	@Test
	public void testRemoveAttrezzo() {
		creaAttrezzoEAggiungiBorsa(this.borsa,ATTREZZO,1) ;
		this.borsa.removeAttrezzo(ATTREZZO) ;
		assertFalse(this.borsa.hasAttrezzo(ATTREZZO)) ;
	}

//MODULO DI UTILITA'
	
	private Attrezzo creaAttrezzoEAggiungiBorsa(Borsa borsa,String nomeAttrezzo,int peso) {
		Attrezzo attrezzo = new Attrezzo(nomeAttrezzo,peso) ;
		borsa.addAttrezzo(attrezzo) ;
		return attrezzo ;
	}
}
