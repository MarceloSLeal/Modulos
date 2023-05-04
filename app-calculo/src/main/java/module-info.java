module app.calculo {
    requires transitive app.logging;
    exports br.com.marcelo.calculo;

    exports br.com.marcelo.calculo.interno
            to app.financeiro;
}