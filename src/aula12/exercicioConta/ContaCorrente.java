package aula12.exercicioConta;


public class ContaCorrente extends Conta {
	private float limite;

	public ContaCorrente(String titular, String senha, float limite){
		super(titular,senha);
		this.limite = limite;
	}

	public boolean sacar(float valor){
		if(saldo+limite>=valor){
			saldo-=valor;
			return true;
		}
		return false;
	}

	public String verificaSaldo(){
		String retorno = "Seu saldo é de R$"+String.format("%.2f",saldo);
		if(saldo<0){
			retorno+="\nSeu limite é de R$"+String.format("%.2f",saldo+limite);
		}
		else {
			retorno += "\nSeu limite é de R$" + String.format("%.2f", limite);
		}
		return retorno;
	}


}
