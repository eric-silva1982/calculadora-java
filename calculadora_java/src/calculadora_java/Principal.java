package calculadora_java;

import funcoes.*;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int op;
		double valorA, valorB;
		do {
			
			System.out.println("--------------------------------");
			System.out.println("         Menu Principal");
			System.out.println("--------------------------------");
			System.out.println("Calculadora Java");
			System.out.println("Informe o valor de A: ");
			valorA = teclado.nextDouble();
			System.out.println("Informe o valor de B: ");
			valorB = teclado.nextDouble();
			System.out.println("Selecione uma das opções abaixo");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Porcentagem");
			System.out.println("6 - Potenciação");
			System.out.println("7 - Raiz Quadrada");
			System.out.println("0 - Sair");
			
			
			System.out.println("Qual opção deseja?");
			op = teclado.nextInt();
			
			
			if(op==0)
				break;
			
			switch(op) {
			
			case 1:
				
				Soma soma = new Soma();
				
				soma.setA(valorA);
				soma.setB(valorB);
				
				String resultSoma;
				StringBuilder somabuilder = new StringBuilder();
				somabuilder.append("Soma = ");
				somabuilder.append(soma.getSoma());
				resultSoma = somabuilder.toString();
				System.out.println(resultSoma);
				
				break;
			
			
			case 2:
			
				Subtracao sub = new Subtracao();
			
				sub.setA(valorA);
				sub.setB(valorB);
			
				String resultSubtracao;
				StringBuilder subuilder = new StringBuilder();
				subuilder.append("Diferença = ");
				subuilder.append(sub.getSubtracao());
				resultSubtracao = subuilder.toString();
				System.out.println(resultSubtracao);

				break;
			
			case 3:
				
				Multiplicacao produto = new Multiplicacao();
			
				produto.setA(valorA);
				produto.setB(valorB);
			
				String resultProduto;
				StringBuilder produtobuilder = new StringBuilder();
				produtobuilder.append("Produto = ");
				produtobuilder.append(produto.getProduto());
				resultProduto = produtobuilder.toString();
				System.out.println(resultProduto);
			
				break;
			
			case 4:
			
				Divisao divisao = new Divisao();
			
				divisao.setA(valorA);
				divisao.setB(valorB);
			
				String resultDivisao;
				StringBuilder divisaobuilder = new StringBuilder();
				divisaobuilder.append("Quociente = ");
				divisaobuilder.append(divisao.getDivisao());
				resultDivisao = divisaobuilder.toString();
				System.out.println(resultDivisao);
			
				break;
				
			case 5:
				
				Porcentagem porcentagem = new Porcentagem();
			
				porcentagem.setA(valorA);
				porcentagem.setB(valorB);
			
				String resultPorcentagem;
				StringBuilder Porcentagembuilder = new StringBuilder();
				Porcentagembuilder.append(valorB);
				Porcentagembuilder.append(" % ");
				Porcentagembuilder.append(" de ");
				Porcentagembuilder.append(valorA);
				Porcentagembuilder.append(" dá ");
				Porcentagembuilder.append(porcentagem.getPorcentagem());
				resultPorcentagem = Porcentagembuilder.toString();
				System.out.println(resultPorcentagem);
			
				break;
				
			case 6:
				
				Potencia potencia = new Potencia();
			
				potencia.setA(valorA);
				potencia.setB(valorB);
			
				String resultPotencia;
				StringBuilder Potenciabuilder = new StringBuilder();
				Potenciabuilder.append(valorA);
				Potenciabuilder.append(" ^ ");
				
				Potenciabuilder.append(valorB);
				Potenciabuilder.append(" = ");
				Potenciabuilder.append(potencia.getPotencia());
				resultPotencia = Potenciabuilder.toString();
				System.out.println(resultPotencia);
			
				break;
				
			case 7:
		
				RaizQuadrada raizq = new RaizQuadrada();
	
				raizq.setA(valorA);
				
	
				String resultRaizQ;
				StringBuilder RaizQbuilder = new StringBuilder();
				RaizQbuilder.append("Raiz quadrada de ");
				RaizQbuilder.append(valorA);
				RaizQbuilder.append(" = ");
				RaizQbuilder.append(raizq.getRaizQuadrada());
				resultRaizQ = RaizQbuilder.toString();
				System.out.println(resultRaizQ);
	
				break;
			
			default: 
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
			
		}while(true);
		
		
	}

}
