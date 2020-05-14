public class CartaoDeCredito extends Pagamento{
   private String nomeDoCartao;
   public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String nomeDoCartao){
      super(nomeDoPagador, cpf, valorASerPago); 
      this.nomeDoCartao = nomeDoCartao;     
   }
   //metodo de acesso
   public String getNomeDoCartao(){
      return nomeDoCartao;
   }
   //metodo modificador
   public void setNomeDoCartao(String nomeDoCartao){
      this.nomeDoCartao = nomeDoCartao;
   }
}