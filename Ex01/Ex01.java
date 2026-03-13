/*
 * Exercício Gemini-01
 * 
 * Escreva um programa que:
 * 	(1) Peça ao usuário um número inteiro;
 * 	(2) Utilize um método chamado 'isPar' para verificar se o número é par ou ímpar;
 * 	(3) Utilize um método chamado 'gerarMensagem', que recebe o número e o resultado da
 * 		verificação, retornando uma frase formatada;
 * 	(4) Imprima o resultado na tela.
 * 
 * 	DICA TÉCNICA: o método 'isPar' deve retornar um tipo 'boolean' (verdadeiro ou falso).
 */

import java.util.Scanner;

/**
 * Classe que verifica se um número inteiro é par ou ímpar.
 * 
 * @author Fabio H
 * @version 1.0
 */
public class Ex01
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do número a ser verificado: ");

		int num = sc.nextInt();
		String message = gerarMensagem(num, isPar(num));

		System.out.println(message);

		sc.close();
	}

	/**
	 * Método-auxiliar, usado para verificar se um número é par usando o operador de resto.
	 * 
	 * @param num 	O valor do número a ser verificado.
	 * @return		Valor booleano: 'true' para números pares, 'false' para ímpares.
	 */
	static boolean isPar(int num)
	{
		if(num % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Método-auxiliar, usado para gerar uma mensagem-padrão.
	 * 
	 * @param num 	O número digitado pelo usuário.
	 * @param eval	O resultado da avaliação sobre a 'paridade' do número digitado pelo usuário.
	 * @return		A mensagem-padrão gerada.
	 */
	static String gerarMensagem(int num, boolean eval)
	{
		if(eval)
		{
			return ("O número " +num +" é PAR.");
		}
		else
		{
			return ("O número " +num +" é ÍMPAR.");
		}
	}
}