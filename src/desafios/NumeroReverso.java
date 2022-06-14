package desafios;
/*N�mero Reverso:
Fa�a um programa que leia um valor inteiro (este n�mero dever� conter 4 d�gitos). A sa�da dever� ser o
 reverso de um n�mero inteiro informado.
Exemplo: Digamos que a entrada foi 3257. A resposta ser� 7523.

Regras:
a) A entrada dever� estar entre 1000 e 9999;
b) Se o usu�rio digitar 3 d�gitos ou menos, o Programa avisa que tem que conter 4 d�gitos e continuar a
 programa��o at� a resposta final.*/

import java.util.Scanner;

public class NumeroReverso {
	public static void numeroReverso() {

	Scanner scan = new Scanner(System.in);
	do {
		System.out.println("Informe um valor inteiro e positivo (este n�mero dever� conter 4 d�gitos): ");
		int numeroInformado = scan.nextInt();
		String numeroInformadoString = String.valueOf(numeroInformado);
		if(numeroInformado >= 1000 && numeroInformado <= 9999) {
			StringBuilder stringBuilder = new StringBuilder(numeroInformadoString);
			System.out.println(stringBuilder.reverse());
			break;
		}else if(numeroInformadoString.length() < 4 ) {
			System.out.println("O numero informado dever� conter 4 digitos!");
		}
	}while(true);
	
	
}
}
