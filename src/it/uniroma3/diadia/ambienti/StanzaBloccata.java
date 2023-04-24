package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza {
	private String attrezzoSbloccante ;
	private String direzioineBloccata; 
		
	public StanzaBloccata(String nome,String attrezzoSbloccante,String direzioneBloccata) {
		super(nome) ;
		this.attrezzoSbloccante = attrezzoSbloccante ;
		this.direzioineBloccata = direzioneBloccata ;
	}
	
	@Override
	
	public Stanza getStanzaAdiacente(String direzione) {
		if(direzione.equals(this.direzioineBloccata)&&!this.hasAttrezzo(attrezzoSbloccante)) ;
		return this ;
	return super.getStanzaAdiacente(direzione) ;
	}
		
	
}
