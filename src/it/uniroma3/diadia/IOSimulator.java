package it.uniroma3.diadia;

public class IOSimulator implements IO{
	private String[] righeDaLeggere ;
	private int indiceRigheDaLeggere ;
	private String[] messaggiProdotti ;
	private int indiceMessaggiProdotti ;
	private int indiceMessaggiMostrati ;
	
	public IOSimulator(String righeDaLeggere,int indiceRicheDaLeggere,String messaggiProdotti,int indiceMessaggiProdotti,int messaggiMostrati) {
		 this.righeDaLeggere = righeDaLeggere ;
		 this.indiceRigheDaLeggere = 0 ;
		 this.messaggiProdotti = new String[100] ;
		 this.indiceMessaggiProdotti = 0 ;
		 this.indiceMessaggiMostrati = 0 ;
	}
	public void leggiRiga() {
		String rigaLetta = this.righeDaLeggere[this.indiceRigheDaLeggere];
		this.indiceRigheDaLeggere++ ;
		return rigaLetta ;
	}
	public void mostraMessaggio(String messagggio) {
		
	}

}
