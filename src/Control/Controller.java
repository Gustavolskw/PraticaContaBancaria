package Control;

import Model.*;
import View.EntradaSaida;

import javax.swing.*;

public class Controller {
	 Conta conta = null;
	 public void exibeMenu(){
		  this.conta = new Conta();
		boolean saldoBaixo = false;
		boolean contaCriada = false;
		int escolha;
		do{
			escolha = EntradaSaida.escolha();
			switch(escolha)

		}while(escolha!=2)









do{
	escolha = EntradaSaida.escolha();
	switch(escolha){
		case 0 :
			//Cadastrar usuario
			if(contaCriada){
				JOptionPane.showMessageDialog(null, "Conta Já Existente!!!", "Banco da Somália", JOptionPane.INFORMATION_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null, "Bem Vindo ao Banco da Somália\nCrie uma Nova Conta", "Banco da Somália", JOptionPane.INFORMATION_MESSAGE);
				this.conta.setTipoDeUsuario(EntradaSaida.escolhaTipoDeUsuario());
				if(this.conta.getTipoDeUsuario().equalsIgnoreCase("Pessoa Juridica")){
					PJ pessoaJuridica =  new PJ();
					pessoaJuridica.setCnpj(EntradaSaida.solicitacaoAoUsuario("CNPJ", "Documento"));
					pessoaJuridica.setOperador(EntradaSaida.solicitaNome("Operador/Titular"));
					this.conta.setTitularDaConta(pessoaJuridica.getOperador());
					pessoaJuridica.setEndereco(EntradaSaida.solicitacaoAoUsuario("Endereço", "Endereço"));
				}else{
					PF pessoaFisica = new PF();
					pessoaFisica.setCpf(EntradaSaida.solicitacaoAoUsuario("CPF", "Documento"));
					pessoaFisica.setOperador(EntradaSaida.solicitaNome("Operador"));
					this.conta.setTitularDaConta(pessoaFisica.getOperador());
					pessoaFisica.setEndereco(EntradaSaida.solicitacaoAoUsuario("Endereço", "Endereço"));
				}

				System.out.println(this.conta.getTitularDaConta());
				contaCriada = true;
			}

			break;
		case 1:
			this.conta.setTipo(EntradaSaida.solicitaOpcaoDeMovimentacao());
			if(this.conta.getTipo().equalsIgnoreCase("Depositar")){
				var saque = new Saque();
				saque.movimentacaoDeSaldo();
			}
			break;
		case 2 :

			break;


	}
}while(escolha!=3);


		
		
		
		
	 }
}
