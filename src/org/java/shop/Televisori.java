package org.java.shop;

public class Televisori extends Prodotto{
	private int dimensioni;
	private boolean isSmart;
	
	public Televisori (String codice,String nome ,String marca,int prezzo,int iva ,int dimensioni,boolean isSmart) {
		super(codice, nome, marca, prezzo, iva);
		this.setDimensioni(dimensioni);
		this.setSmart(isSmart);
	}
	
	public int getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	public boolean isSmart() {
		return isSmart;
	}
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	@Override
	public String toString() {
		return "Articolo di tipo Smartfone , codice : " + this.getCodice() + " , Nome prodotto : " + this.getNome()
				+ " , Marca prodotto : " + this.getMarca() + " , Prezzo prodotto : " + this.getPrezzo()
				+ " , iva prodotto : " + this.getIva() + " , Prezzo con iva : " + this.getPrezzoIva()
				+ " , Dimensioni prodotto : " + this.getDimensioni() + " , Il prodotto è Smart? : " + (this.isSmart() ? "Si" : "NO");
	}
	@Override
	public  void scontoProdotti(boolean isFedelity) {
		if(isFedelity) {
			if(!isSmart) {
				int nuovoPrezzo =  this.getPrezzo() - (getPrezzo() + (getPrezzo() * getIva()) / 100)* 10 / 100;
				this.setPrezzo(nuovoPrezzo);
				System.out.println("Nuovo prezzo con sconto del 10% : " + nuovoPrezzo);
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
