package Model;

import View.EntradaSaida;

public class Deposito extends Movimentacao{
    public int movimentacaoDeSaldo(int saldo){
        setValor(EntradaSaida.solicitaValorDeMovimentacao("Deposito", "depositado"));

       return  saldo += getValor();
    }

    @Override
    public String toString() {
        return "Deposito - "+getValor();
    }
}
