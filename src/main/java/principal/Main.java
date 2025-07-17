package principal;


import model.Quarto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quarto[] quarto = new Quarto[10];
        System.out.print("Quantos quartos você deseja alugar? ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
        System.out.println("Quarto " + i + ":");
        System.out.print("Nome: ");
        input.nextLine();
        String nome = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Quarto: ");
        int numQuarto = input.nextInt();

        quarto[numQuarto] = new Quarto(nome, email);
        }
        System.out.println("Quartos ocupados: ");
        for(int i = 1; i <= 10; i++){
            if(quarto[i] != null){
                System.out.println(i + ": " + quarto[i]);
            }
        }







    }
}