/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadePOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        AdicionarProduto gerenciador = new AdicionarProduto();
        
        int opcao;
        
        do{
            System.out.println("\n==== CADASTRO DE PRODUTOS ====");
            System.out.println("1. Adicionar bicoito");
            System.out.println("2. Adicionar leite");
            System.out.println("3. Adicionar shampoo");
            System.out.println("4. Exibir Produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
        
            switch (opcao) {
                case 1, 2, 3 -> gerenciador.adicionarProduto(opcao);
                case 4 -> gerenciador.exibirProdutos();
                case 5 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
        
        
    }
}
