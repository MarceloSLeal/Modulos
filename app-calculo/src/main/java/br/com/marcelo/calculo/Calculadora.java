package br.com.marcelo.calculo;

import br.com.marcelo.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

    private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        return operacoesAritmeticas.soma(nums);
    }
}
