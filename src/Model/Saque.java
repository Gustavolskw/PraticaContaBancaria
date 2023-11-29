package Model;

import View.EntradaSaida;

public class Saque extends Movimentacao {
    public int movimentacaoDeSaldo(){
        setValor(EntradaSaida.solicitaValorDeMovimentacao("Saque"));
        Conta saldoAtual = new Conta();
            return saldoAtual.getSaldo() - getValor();
    }
}
