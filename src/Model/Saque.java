package Model;

import View.EntradaSaida;

public class Saque extends Movimentacao {
    public void movimentacaoDeSaldo(){
        setValor(EntradaSaida.solicitaValorDeMovimentacao("Saque"));
        Conta saldo = new Conta();
            saldo.setSaldo(saldo.getSaldo() - getValor());
    }
}
