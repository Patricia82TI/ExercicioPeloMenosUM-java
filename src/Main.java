import java.util.Scanner;

//Faça um programa que leia 2 números inteiros e imprima na tela se pelo
//menos um deles for maior que 10
    public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        System.out.println("Digite outro número: ");
        int b = sc.nextInt();

        if(a > 10 || b > 10){
            System.out.println("Pelo menos um deles é maior que 10");
        }else{
            System.out.println("Nenhum deles é maior que 10");
        }

    }
}