package Control;

import Model.*;
import View.EntradaSaida;

import java.sql.SQLOutput;
import java.util.ArrayList;


public class Controller {
	 Conta conta = null;
	 public void exibeMenu() {
		  Usuario usuario = new Usuario();
		  this.conta = new Conta();
		 var deposito1 = new Deposito();

		  boolean saldoBaixo = false;
		  int escolha;
		 ArrayList<Movimentacao> listaDeMoviemntacao = new ArrayList<Movimentacao>();
		  
		  //Cadastrar usuario
		  EntradaSaida.mensagemGeral("Bem Vindo ao Banco da Somália\nCrie uma Nova Conta");
		  usuario.cadastro();
		  escolha = EntradaSaida.escolhaEntrada();
		  if(escolha==0) {
			   System.out.println(usuario.getPing());
			   int passe = EntradaSaida.login();
			   System.out.println(passe);
			   while (passe!=usuario.getPing()){
				   EntradaSaida.mensagemGeral("Senha Incorreta!!!");
					passe = EntradaSaida.login();
			   }
			   EntradaSaida.mensagemGeral("Para inicar você precisa depositar uma valor a conta...");
		  this.conta.setSaldo(deposito1.movimentacaoDeSaldo(this.conta.getSaldo()));
				listaDeMoviemntacao.add(deposito1);
		  do {
					escolha = EntradaSaida.escolha();
					switch (escolha) {
						 case 0:
							  EntradaSaida.mensagemGeral("Opcoes de Movimentação");
							  this.conta.setTipo(EntradaSaida.solicitaOpcaoDeMovimentacao());
							  saldoBaixo = true;
							  if (this.conta.getTipo().equalsIgnoreCase("Depositar")) {
								  var deposito = new Deposito();

								  this.conta.setSaldo(deposito.movimentacaoDeSaldo(this.conta.getSaldo()));

								   listaDeMoviemntacao.add(deposito);

							  }else {
								   while(saldoBaixo==false){
									   var saque = new Saque();
										this.conta.setSaldo(saque.movimentacaoDeSaldo(this.conta.getSaldo()));
										listaDeMoviemntacao.add(saque);
								   }
							  }
							  break;
						 case 1:
							  EntradaSaida.mensagemGeral("Opcoes de Visualizaçao do extrato");
							  for(int i = 0; i<listaDeMoviemntacao.size(); i++){
							 System.out.println("Moveimentação "+(i+1)+" - " + listaDeMoviemntacao.get(i).toString());
						 }
							  break;
						 
					}

			   } while (escolha != 2);
			   EntradaSaida.msgEncerraPrograma();
			  System.out.println(this.conta.getSaldo());
			   System.exit(0);
		  }else{
			   EntradaSaida.msgEncerraPrograma();
			   System.exit(0);
		  }
		  
	 }
}
