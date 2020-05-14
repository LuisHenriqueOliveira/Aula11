public class Pagamento{
   private String nomeDoPagador, cpf;
   private double valorASerPago;
   public Pagamento(String nomeDoPagador, String cpf, double valorASerPago){
      this.nomeDoPagador = nomeDoPagador;
      this.cpf = cpf;
      this.valorASerPago = valorASerPago;      
   }
   //metodo de acesso
   public String getNomeDoPagador(){
      return nomeDoPagador;
   }
   public String getCpf(){
      return cpf;
   }
   public double getValorASerPago(){
      return valorASerPago;
   }
   //metodo modificador
   public void setNomeDoPagador(String nomeDoPagador){
      this.nomeDoPagador = nomeDoPagador;
   }
   public void setCpf(String cpf){
      this.cpf = cpf;
   }
   public void setValorASerPago(double valorASerPago){
      this.valorASerPago = valorASerPago;
   }
}