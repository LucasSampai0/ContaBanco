import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TDDO: Conhecer e importar a classe Scanner

       //Exibir mensagem para usuário

       //Obter pela classe Scanner os valores digitados no terminal

       //Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de sua conta: ");
        int conta = sc.nextInt();

        System.out.print("Digite a agência: ");
        String agencia = sc.next();

        System.out.print("Insira seu nome: ");
        String nome = sc.next();

        final double saldo = 500.75;

        System.out.println();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco"
        + "\nSua agência é: " + agencia
        + "\nConta: " + conta
        + "\nSeu saldo de " + saldo + " já está disponível para saque");
        
    }
}
