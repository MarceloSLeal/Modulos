package br.com.marcelo.calculo;

import br.com.marcelo.calculo.interno.OperacoesAritmeticas;
import br.com.marcelo.logging.Logger;

public class Calculadora {

    private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Somando");
        return operacoesAritmeticas.soma(nums);
    }
}
