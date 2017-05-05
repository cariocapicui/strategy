package br.edu.unifacisa.map.strategy;

public class Main {
	public static void main(String[] args) {
		Funcionario funcionarioDesenvolvedor = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100, 1);
		System.out.println("O DESENVOLVEDOR recebera: " + funcionarioDesenvolvedor.calcularGratificacao());
		
		Funcionario funcionarioDBA = new Funcionario(Funcionario.DBA,
				1700, 2);
		System.out.println("O DBA recebera: " + funcionarioDBA.calcularGratificacao());
		
		Funcionario funcionarioGerente = new Funcionario (Funcionario.GERENTE,
				2000, 3);
		System.out.println("O GERENTE recebera: " + funcionarioGerente.calcularGratificacao());
		
		Funcionario funcionarioLider = new Funcionario (Funcionario.LIDER,
				3000, 4);
		System.out.println("O LIDER recebera: " + funcionarioLider.calcularGratificacao());
	}

}
