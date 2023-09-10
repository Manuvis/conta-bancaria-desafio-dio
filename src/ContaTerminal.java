import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        ContaBanco contaBancaria = new ContaBanco();

        System.out.println("Qual seu primeiro nome ?");
        String priemiroNome = input.next();
        System.out.println("Qual seu primeiro nome ?");
        String sobrenome = input.next();
        contaBancaria.nomeCliente = priemiroNome + sobrenome;

        System.out.println("Qual o numero da conta ?");
        int numero = input.nextInt();
        contaBancaria.numeroConta = numero;

        System.out.println("Qual o numero da agência ? ");
        String agencia = input.next();
        contaBancaria.agencia = agencia;

        System.out.println("Qual o saldo da sua conta ? ");
        float saldo = input.nextFloat();
        contaBancaria.saldo = saldo;


        contaBancaria.criarConta();


        input.close();
    }

}
