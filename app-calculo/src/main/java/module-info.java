module app.calculo {
    requires transitive app.logging;
    exports br.com.marcelo.calculo;

    exports br.com.marcelo.calculo.interno
            to app.financeiro;

    opens br.com.marcelo.calculo to app.financeiro;
}