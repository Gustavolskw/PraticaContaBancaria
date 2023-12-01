package Model;

import View.EntradaSaida;

public class Deposito extends Movimentacao{
    

    @Override
    public String toString() {
        return "Deposito - "+getValor();
    }
}
