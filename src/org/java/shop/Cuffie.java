package org.java.shop;

public class Cuffie extends Prodotto{
	private String colore;
	private Boolean isWireless;
	
	public Cuffie(String codice,String nome ,String marca,int prezzo,int iva ,String colore,Boolean isWireless) {
		super(codice, nome, marca, prezzo, iva);
		this.setIsWireless(isWireless);
		this.setColore(colore);
	}
	
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public Boolean getIsWireless() {
		return isWireless;
	}
	public void setIsWireless(Boolean isWireless) {
		this.isWireless = isWireless;
	}
	@Override
	public String toString() {
		return "Articolo di tipo Smartfone , codice : " + this.getCodice() + " , Nome prodotto : " + this.getNome()
				+ " , Marca prodotto : " + this.getMarca() + " , Prezzo prodotto : " + this.getPrezzo()
				+ " , iva prodotto : " + this.getIva() + " , Prezzo con iva : " + this.getPrezzoIva()
				+ " , Colore prodotto : " + this.getColore() + " , Il prodotto è Wireless? : " + (this.getIsWireless()? "Si" : "NO");
	}
	@Override
	public  void scontoProdotti(boolean isFedelity) {
		if(isFedelity) {
			if(!isWireless) {
				int nuovoPrezzo =  this.getPrezzo() - (getPrezzo() + (getPrezzo() * getIva()) / 100)* 7 / 100;
				this.setPrezzo(nuovoPrezzo);
				System.out.println("Nuovo prezzo con sconto del 7% : " + nuovoPrezzo);
			}else {
				int nuovoPrezzo =  this.getPrezzo() - (getPrezzo() + (getPrezzo() * getIva()) / 100)* 2 / 100;
				this.setPrezzo(nuovoPrezzo);
				System.out.println("Nuovo prezzo con sconto del 2% : " + nuovoPrezzo);
			}
			
		}else {
			this.setPrezzo(getPrezzo());
		}
	}
}
