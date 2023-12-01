package Control;

import Model.*;
import View.EntradaSaida;
import java.util.ArrayList;


public class 	Controller {
	 Conta conta = null;
	 Movimentacao movimentacao = null;
	 public void exibeMenu() {
		  Usuario usuario = new Usuario();
		  this.conta = new Conta();
		  this.movimentacao = new Movimentacao();
		  var deposito1 = new Deposito();
		  
		  boolean saldoBaixo = false;
		  int escolha;
		  ArrayList<Movimentacao> listaDeMoviemntacao = new ArrayList<Movimentacao>();
		  ArrayList<Cofre> listaCorrente = new ArrayList<Cofre>();
		  ArrayList<Cofre> listaPoupanca = new ArrayList<Cofre>();
		  
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
			   this.conta.setTipo(EntradaSaida.solicitaTipoDeConta());
			   if(this.conta.getTipo().equalsIgnoreCase("Corrente")) {
					var corrente = new Corrente();
					deposito1.setValor(EntradaSaida.solicitarInformacoesDeposito());
					listaDeMoviemntacao.add(deposito1);
					corrente.setSaldoConta(deposito1.getValor());
					listaCorrente.add(corrente);
					
			   }else {
					var poupanca = new Poupanca();
					deposito1.setValor(EntradaSaida.solicitarInformacoesDeposito());
					listaDeMoviemntacao.add(deposito1);
					poupanca.setSaldoConta(deposito1.getValor());
					listaPoupanca.add(poupanca);
			   }
			   this.conta.depositar(deposito1.getValor());
			   do {
					escolha = EntradaSaida.escolha();
					switch (escolha) {
						 case 0:
							  this.conta.setTipo(EntradaSaida.solicitaTipoDeConta());
							  if(this.conta.getTipo().equalsIgnoreCase("Corrente")){
								   this.movimentacao.setTipo(EntradaSaida.solicitaOpcaoDeMovimentacao());
								   if(this.conta.getSaldo()<10){
										saldoBaixo = true;
								   }
								   if (this.movimentacao.getTipo().equalsIgnoreCase("Depositar")) {
										var deposito = new Deposito();
										deposito.setValor(EntradaSaida.solicitarInformacoesDeposito());
										listaDeMoviemntacao.add(deposito);
										this.conta.depositar(deposito.getValor());
								   }else {
										if(!saldoBaixo){
											 var saque = new Saque();
											 saque.setValor(EntradaSaida.solicitarInformacoesSaque());
											 while(saque.getValor()>this.conta.getSaldo()){
												  EntradaSaida.mensagemGeral("O valor Digitado é acima do Saldo atual!!!");
												  saque.setValor(EntradaSaida.solicitarInformacoesSaque());
											 }
											 listaDeMoviemntacao.add(saque);
											 this.conta.sacar(saque.getValor());
										}else{
											 EntradaSaida.mensagemGeral("Seu Saldo é Baixo para realizar um Saque");
										}
								   }
							  }else {
								   this.movimentacao.setTipo(EntradaSaida.solicitaOpcaoDeMovimentacao());
								   if (this.conta.getSaldo() < 10) {
										saldoBaixo = true;
								   }
								   if (this.movimentacao.getTipo().equalsIgnoreCase("Depositar")) {
										var deposito = new Deposito();
										deposito.setValor(EntradaSaida.solicitarInformacoesDeposito());
										listaDeMoviemntacao.add(deposito);
										this.conta.depositar(deposito.getValor());
								   } else {
										if (!saldoBaixo) {
											 var saque = new Saque();
											 saque.setValor(EntradaSaida.solicitarInformacoesSaque());
											 while (saque.getValor() > this.conta.getSaldo()) {
												  EntradaSaida.mensagemGeral("O valor Digitado é acima do Saldo atual!!!");
												  saque.setValor(EntradaSaida.solicitarInformacoesSaque());
											 }
											 listaDeMoviemntacao.add(saque);
											 this.conta.sacar(saque.getValor());
										} else {
											 EntradaSaida.mensagemGeral("Seu Saldo é Baixo para realizar um Saque");
										}
								   }
							  }
							  break;
						 case 1:
							  EntradaSaida.mensagemGeral("Opcoes de Visualizaçao do extrato");
							  for (int i = 0; i < listaDeMoviemntacao.size(); i++) {
								   System.out.println("Movimentação " + (i + 1) + " - " + listaDeMoviemntacao.get(i).toString());
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
