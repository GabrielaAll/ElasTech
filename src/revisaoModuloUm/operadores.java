package revisaoModuloUm;

public class operadores {
    public static void main(String[] args) {

        //Operadores
        //Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.
        //Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.
        //Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.
        //Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.
        //Crie um número e imprima o resto da divisão dele por 2.
        //Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.

        int a = 15;
        int b = 4;

        System.out.println("Soma: " + (a+b));
        System.out.println("Subtração: " + (a-b));
        System.out.println("Multiplicação: " + (a*b));
        System.out.println("Divisão: " + (a/b));
        System.out.println("Resto: "+ (a%b));

        double saldo = 1000.0;
        saldo += 250.0;
        saldo -= 380.0;
        System.out.println("Saldo final: R$ " + saldo);

        int x = 10;
        int y = 10;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x >= y: " + (x >= y));

        int idade = 20;
        boolean temCarteira = true;
        System.out.println("É maior de idade e tem carteira? " + (idade >= 18 && temCarteira));

        int numero = 27;
        System.out.println("Resto da divisão de " + numero + " por 2: " + (numero % 2));

        int arroz = 3;
        double valorArroz = 5.50;
        System.out.println("Total dos pacotes de arroz: R$" + (arroz*valorArroz));


        //🔥 Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?
        //💡 Uma comparação já produz true ou false sozinha — não precisa de if pra isso. E um número é divisível por outro quando o resto da divisão é zero.

        int numeroDesafio = 30;
        boolean divisivelPor3e5 = (numeroDesafio % 3 == 0) && (numeroDesafio % 5 == 0);
        System.out.println("O número " + numeroDesafio + " é divisível por 3 e 5 ao mesmo tempo? " + divisivelPor3e5);

    }
}
