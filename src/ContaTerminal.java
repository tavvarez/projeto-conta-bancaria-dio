import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // trazendo a classe conta
        Conta createConta = new Conta();

        // criação da conta
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = sc.next();
        createConta.setNomeCliente(nome);

        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = sc.next();
        createConta.setAgencia(String.format(agencia));

        System.out.println("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();
        createConta.setNumeroConta(conta);

        System.out.println("Por favor, digite o valor a ser depositado na sua conta: ");
        double saldo = sc.nextDouble();
        createConta.setSaldo(saldo);
        
        sc.close();

        System.out.println("***********************************");
        System.out.println("******** Criando sua conta ********");
        System.out.println("***********************************");

        System.out.println("-- Parabéns, sua conta foi criada.");

        System.out.println(String.format("Ol\u00E1 %s, obrigado por criar uma conta em nosso banco, sua ag\u00EAncia \u00E9 %s, conta %s e seu saldo %s j\u00E1 est\u00E1 dispon\u00EDvel para saque.", nome, agencia, conta, saldo));

    }
    
}
