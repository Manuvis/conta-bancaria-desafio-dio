public class ContaBanco {

     int numeroConta;
     String agencia;
     String nomeCliente;
     float saldo;

    public void criarConta (){
        System.out.println("\"Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numeroConta +  "e seu saldo " + saldo + " já está disponível para saque\".");
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
