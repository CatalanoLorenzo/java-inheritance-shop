package org.java.shop;

public class Prodotto {

	private String codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;
	
	public Prodotto(String codice,String nome ,String marca,int prezzo,int iva) {
		this.codice = codice;
		this.setNome(nome);
		this.setMarca(marca);
		this.setPrezzo(prezzo);
		this.setIva(iva);
	}
	public void scontoProdotti(boolean isFedelity) {
		if(isFedelity) {
			int nuovoPrezzo =  this.getPrezzo() - (getPrezzo() + (getPrezzo() * getIva()) / 100)* 2 / 100;
			this.setPrezzo(nuovoPrezzo);
			System.out.println("Nuovo prezzo con sconto del 2% : " + nuovoPrezzo);
		}else {
			this.setPrezzo(getPrezzo());
		}
	}
	public String getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getPrezzoIva() {
		return this.prezzo + (this.prezzo * this.iva) / 100;
	}

}
