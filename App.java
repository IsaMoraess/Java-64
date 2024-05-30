import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
CODIGO	ESPECIFICAÇÃO	PREÇO
1	cachorro-quente 	R$ 4,00
2	x-salada 	R$ 4,50
3	x-bacon	 R$ 5,00
4	torrada simples 	R$ 2,00
5	refigerante	R$  1,50
Exemplos:
Entrada: Saída:
3 2 Total: R$ 10.00
Entrada: Saída:
2 3 Total: R$ 13.50 */
    Scanner sc = new Scanner(System.in);
     int codigo;
     int quantidade;
     double total = 0.0;
     double preco; 
 
     System.out.println("Informe o código do item: ");
     codigo = sc.nextInt();
 
     System.out.println("Informe a quantidade do item: ");
     quantidade = sc.nextInt();
 
     if (codigo == 1) {
       preco = 4.00;
     } else if (codigo == 2) {
       preco = 4.50;
     } else if (codigo == 3) {
       preco = 5.00;
     } else if (codigo == 4) {
       preco = 2.00;
     } else if (codigo == 5) {
       preco = 1.50;
     } else {
       System.out.println("Código inválido!");
       preco = 0.0; 
     }
 
     total = quantidade * preco;
 
     System.out.printf("Total: R$ %.2f\n", total);
    }
}
