package Model;

public abstract class Usuario implements IUsuario{
	 protected String operador;
	 protected String endereco;
	 
	 
	 public String getOperador() {
		  return operador;
	 }
	 
	 public void setOperador(String nome) {
		  this.operador = nome;
	 }
	 
	 public String getEndereco() {
		  return endereco;
	 }
	 
	 public void setEndereco(String endereco) {
		  this.endereco = endereco;
	 }
}
