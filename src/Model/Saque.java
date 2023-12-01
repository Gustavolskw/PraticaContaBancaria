package Model;

import View.EntradaSaida;

public class Saque extends Movimentacao {
    

    @Override
    public String toString() {
        return "Saque - "+ getValor();
    }
}
