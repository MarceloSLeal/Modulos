package br.com.marcelo.calculo;

import br.com.marcelo.app.Calculadora;
import br.com.marcelo.calculo.interno.OperacoesAritmeticas;
import br.com.marcelo.logging.Logger;

public class CalculadoraImpl implements Calculadora {

    private String id = "abc";

    private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Somando");
        return operacoesAritmeticas.soma(nums);
    }

    public String getId() {
        return id;
    }
}
