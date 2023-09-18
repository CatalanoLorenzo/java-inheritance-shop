package org.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carello {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean stop = true;
		// ----------------------------------------------

		System.out.println("Hai la tessera fedelta? ");
		System.out.println("Si");
		System.out.println("No");
		boolean isFedelity = (input.nextLine().toLowerCase() == "si") ? true : false;
		// ----------------------------------------------
		int numeroArticoli = 10;
		Prodotto[] carello = new Prodotto[numeroArticoli];

		int i = 0;

		while (stop) {
			// ----------------------------------------------
			if (carello.length > numeroArticoli) {
				stop = false;
			}
			// ----------------------------------------------
			System.out.println("inserisci un prodotto nel carello non ne puoi aggiungere piu di " + numeroArticoli
					+ " per volta, articoli inseriti n: " + (i));
			System.out.println(
					"il prodotto che stai inserendo è un 'Smartphone' , un 'Televisore' o delle 'Cuffie'? scegli il numero associato al prodotto");
			System.out.println("[0] Stop");
			System.out.println("[1] Smartphone");
			System.out.println("[2] Televisore");
			System.out.println("[3] Cuffie");
			// ----------------------------------------------
			String tipoDispositivo = input.nextLine();
			String nome = "";
			String marca = "";
			String imei = "";
			String prezzo = "";
			String iva = "";
			String memoria = "";
			String dimensioni = "";
			// ----------------------------------------------
			switch (tipoDispositivo) {

			case "0":
				stop = false;
				break;

			case "1":

				System.out.println("nome del dispositivo : ");
				nome = input.nextLine();
				// ----------------------------------------------
				System.out.print("marca del dispositivo : ");
				marca = input.nextLine();
				// ----------------------------------------------
				System.out.print("prezzo del dispositivo : ");
				prezzo = input.nextLine();
				// ----------------------------------------------
				System.out.print("iva del dispositivo : ");
				iva = input.nextLine();
				// ----------------------------------------------
				System.out.print("IMEI del dispositivo : ");
				imei = input.nextLine();
				// ----------------------------------------------
				System.out.print("memoria del dispositivo : ");
				memoria = input.nextLine();
				// ----------------------------------------------

				System.out.println("Nome :" + nome + " Marca: " + marca + " Prezzo : " + prezzo + " IVA : " + iva
						+ " IMEI : " + imei + " Memoria :" + memoria);
				carello[i] = new Smartphone("1", nome, marca, Integer.parseInt(prezzo), Integer.parseInt(iva), imei,
						Integer.parseInt(memoria));
				carello[i].scontoProdotti(isFedelity);
				i++;
				// ----------------------------------------------
				nome = "";
				marca = "";
				prezzo = "";
				iva = "";
				memoria = "";
				imei = "";
				break;
			// ----------------------------------------------

			case "2":

				System.out.println("nome del dispositivo : ");
				nome = input.nextLine();
				// ----------------------------------------------
				System.out.println("marca del dispositivo : ");
				marca = input.nextLine();
				// ----------------------------------------------
				System.out.println("prezzo del dispositivo : ");
				prezzo = input.nextLine();
				// ----------------------------------------------
				System.out.println("iva del dispositivo : ");
				iva = input.nextLine();
				// ----------------------------------------------
				System.out.println("Dimensioni del dispositivo : ");
				dimensioni = input.nextLine();
				// ----------------------------------------------
				System.out.println("il dispositivo è Smart : ");
				boolean isSmart = input.nextBoolean();
				System.out.println("Nome :" + nome + " Marca: " + marca + " Prezzo : " + prezzo + " IVA : " + iva
						+ " Dimensioni : " + dimensioni + " è Smart :" + isSmart);

				carello[i] = new Televisori("2", nome, marca, Integer.parseInt(prezzo), Integer.parseInt(iva),
						Integer.parseInt(dimensioni), isSmart);
				// ----------------------------------------------
				nome = "";
				marca = "";
				prezzo = "0";
				iva = "0";
				dimensioni = "";
				i++;
				// ----------------------------------------------
				break;
			case "3":

				System.out.println("nome del dispositivo : ");
				nome = input.nextLine();
				// ----------------------------------------------

				System.out.println("marca del dispositivo : ");
				marca = input.nextLine();
				// ----------------------------------------------
				System.out.println("prezzo del dispositivo : ");
				prezzo = input.nextLine();
				// ----------------------------------------------
				System.out.println("iva del dispositivo : ");
				iva = input.nextLine();
				// ----------------------------------------------
				System.out.println("Dimensioni del dispositivo : ");
				String colore = input.nextLine();
				// ----------------------------------------------
				System.out.println("il dispositivo è Smart : ");
				boolean isWireless = input.nextBoolean();
				System.out.println("Nome :" + nome + " Marca: " + marca + " Prezzo : " + prezzo + " IVA : " + iva
						+ " Colore : " + colore + " è Wireless : " + isWireless);
				carello[i] = new Cuffie("3", nome, marca, Integer.parseInt(prezzo), Integer.parseInt(iva), colore,
						isWireless);
				// ----------------------------------------------
				nome = "";
				marca = "";
				prezzo = "0";
				iva = "0";
				i++;
				// ----------------------------------------------
				break;

			default:

				System.out.println("il prodotto che hai scelto non è disponibile ");
				break;

			}

		}
		// ----------------------------------------------
		Prodotto[] carelloCompleto = new Prodotto[i];
		int totaleCarello = 0;
		for (int j = 0; j < i; j++) {
			carelloCompleto[j] = carello[j];
			totaleCarello += carelloCompleto[j].getPrezzo();
		}
		// ----------------------------------------------
		input.close();
		System.out.println(Arrays.toString(carelloCompleto));
		System.out.println("Totale carello : " + totaleCarello);
		// ----------------------------------------------
	}

}
