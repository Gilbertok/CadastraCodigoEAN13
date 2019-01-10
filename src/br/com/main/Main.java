package br.com.main;

public class Main {
	
	public static void main(String[] args) {
		String sequencia = "790802387638";
		System.out.println(calcularCodigoEAN(sequencia));
	}

	
	private static String calcularCodigoEAN(String sequenciaEAN) {
		Integer digito = 0;
		Integer totTotal = 0;
		for (int i = 0; i < sequenciaEAN.length(); i++) {
			if (i % 2 == 0) {
				totTotal = totTotal + (Integer.parseInt(sequenciaEAN.substring(i, i+1)));
			} else {
				totTotal = totTotal + (Integer.parseInt(sequenciaEAN.substring(i, i+1)) * 3);
			}
		}
		digito = 10 - (totTotal % 10);
		if(digito == 10) {
			digito = 0;
		}
		return sequenciaEAN+digito;
	}
	
}
