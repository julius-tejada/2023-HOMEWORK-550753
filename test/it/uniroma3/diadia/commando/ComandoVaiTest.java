package it.uniroma3.diadia.commando;

import static org.junit.jupiter.api.Assertions.*;
import it.uniroma3.diadia.ambienti.*;
//import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.* ;
import it.uniroma3.diadia.comando.* ;
import it.uniroma3.diadia.comando.Comando;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach ; 


class ComandoVaiTest {
	private final static String NOME_STANZA_PARTENZA = "partenza" ;
	private final static String NORD = "nord" ;
	private Partita partita ;
	private Comando comandoVai ;
	private Stanza partenza ;
	
	@BeforeEach
	public void setUp()throws Exception {
		this.comandoVai = new comandoVai() ;
		this.comandoVai.setIO(new IOConsole());
		this.partita = new Partita() ;
		this.partenza = new Stanza(NOME_STANZA_PARTENZA) ;
		this.partita.setStanzaCorrente(this.partenza); 
		
	}
	
	@Test
	public void testVaiStanzaNonPresente() {
		this.comandoVai.setParametro(NORD);
		this.comandoVai.esegui(this.partita);
		assertEquals(NOME_STANZA_PARTENZA, this.partita.getStanzaCorrente().getNome());
	}
	
	@Test
	public void testVaiStanzaPresente() {
		Stanza destinazione = new Stanza("Destinazione") ;
		this.partenza.impostaStanzaAdiacente(NORD, destinazione);
		this.comandoVai.setParametro(NORD); 
		this.comandoVai.esegui(partita); 
		assertEquals("Destinazione", this.partita.getStanzaCorrente().getNome());
	}

}
