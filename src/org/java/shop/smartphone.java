package org.java.shop;

public class Smartphone extends Prodotto {
	private String imei;
	private int memoria;

	public Smartphone(String codice, String nome, String marca, int prezzo, int iva, String imei, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.setImei(imei);
		this.setMemoria(memoria);
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Articolo di tipo Smartfone , codice : " + this.getCodice() + " , Nome prodotto : " + this.getNome()
				+ " , Marca prodotto : " + this.getMarca() + " , Prezzo prodotto : " + this.getPrezzo()
				+ " , iva prodotto : " + this.getIva() + " , Prezzo con iva : " + this.getPrezzoIva()
				+ " , IMEI prodotto : " + this.getImei() + " , Memoria prodotto : " + this.getMemoria();
	}
	@Override
	public  void scontoProdotti(boolean isFedelity) {
		if(isFedelity) {
			if(this.memoria < 32) {
				int nuovoPrezzo =  this.getPrezzo() - (getPrezzo() + (getPrezzo() * getIva()) / 100)* 5 / 100;
				this.setPrezzo(nuovoPrezzo);
				System.out.println("Nuovo prezzo con sconto del 5% : " + nuovoPrezzo);
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
