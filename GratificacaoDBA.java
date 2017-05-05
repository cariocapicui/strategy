package br.edu.unifacisa.map.strategy;

public class GratificacaoDBA implements Gratificacao {
	@Override
    public double calcularGratificacao(Funcionario umFuncionario) {
          if (umFuncionario.getNivel() >= 2) {
              return umFuncionario.getSalarioBase() * 1.30;
          }
          return umFuncionario.getSalarioBase() * 1.20;
    }
}
