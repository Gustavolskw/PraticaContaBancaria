package Model;

import View.EntradaSaida;

public class Saque extends Movimentacao {
    public int  movimentacaoDeSaldo(int saldo){
        setValor(EntradaSaida.solicitaValorDeMovimentacao("Saque", "Sacado"));
            return saldo -= getValor();
    }

    @Override
    public String toString() {
        return "Saque - "+ getValor();
    }
}
