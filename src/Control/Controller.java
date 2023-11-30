package Control;

import Model.*;
import View.EntradaSaida;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Controller {
	 Conta conta = null;
	 public void exibeMenu() {
		  Usuario usuario = new Usuario();
		  this.conta = new Conta();
		  boolean saldoBaixo = false;
		  int escolha;
		  
		  
		  //Cadastrar usuario
		  JOptionPane.showMessageDialog(null, "Bem Vindo ao Banco da Somália\nCrie uma Nova Conta", "Banco da Somália", JOptionPane.INFORMATION_MESSAGE);
		  usuario.setNome(EntradaSaida.solicitaNome("Titular"));
		  usuario.setCpf(EntradaSaida.solicitacaoAoUsuario("CPF", "Documento"));
		  usuario.setEndereco(EntradaSaida.solicitacaoAoUsuario("Endereço", "Endereço"));
		  this.conta.setTipo(EntradaSaida.solicitaTipoDeConta());
		  usuario.setPing(EntradaSaida.passeDeLogin());
		  
		  
		 
		  
		  
		  escolha = EntradaSaida.escolhaEntrada();
		  if(escolha==0) {
			   System.out.println(usuario.getPing());
			   int passe = EntradaSaida.login();
			   System.out.println(passe);
			   while (passe!=usuario.getPing()){
					passe = EntradaSaida.login();
			   }
			   do {
					escolha = EntradaSaida.escolha();
					switch (escolha) {
						 case 0:
							  
							  
							  break;
						 case 1:
							  this.conta.setTipo(EntradaSaida.solicitaOpcaoDeMovimentacao());
							  if (this.conta.getTipo().equalsIgnoreCase("Depositar")) {
								   var saque = new Saque();
								   saque.movimentacaoDeSaldo();
							  }
							  break;
						 case 2:
							  
							  break;
						 
						 
					}
			   } while (escolha != 2);
			   EntradaSaida.msgEncerraPrograma();
			   System.exit(0);
		  }else{
			   EntradaSaida.msgEncerraPrograma();
			   System.exit(0);
		  }
		  
	 }
}
