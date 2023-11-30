package Control;

import Model.*;
import View.EntradaSaida;


public class Controller {
	 Conta conta = null;
	 public void exibeMenu() {
		  Usuario usuario = new Usuario();
		  this.conta = new Conta();
		  boolean saldoBaixo = false;
		  int escolha;
		  
		  //Cadastrar usuario
		  EntradaSaida.mensagemGeral("Bem Vindo ao Banco da Somália\nCrie uma Nova Conta");
		  usuario.cadastro();
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
							  EntradaSaida.mensagemGeral("Opcoes de Movimentação");
							  this.conta.setTipo(EntradaSaida.solicitaOpcaoDeMovimentacao());
							  saldoBaixo = true;
							  if (this.conta.getTipo().equalsIgnoreCase("Depositar")) {
								  
								   var deposito = new Deposito();
								   deposito.movimentacaoDeSaldo();
							  }else {
								   while(saldoBaixo==false){
										var saque = new Saque();
										saque.movimentacaoDeSaldo();
								   }
							  }
							  break;
						 case 1:
							  EntradaSaida.mensagemGeral("Opcoes de Visualizaçao do extrato");
							 
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
