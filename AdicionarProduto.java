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
public class AdicionarProduto {
    Scanner scanner = new Scanner(System.in);
    
    List<Produto> listaProdutos = new ArrayList<>();
    
    public void adicionarProduto(int tipo) {
        
        System.out.println("Marca: ");
        String nome = scanner.nextLine();
        System.out.println("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Data de validade: ");
        String validade = scanner.nextLine();
        
        Produto produto = null;
        
        switch (tipo) {
            case 1 -> {
                System.out.println("Quantidade cancerígenos: ");
                int componentes = scanner.nextInt();
                scanner.nextLine();
                produto = new Biscoito(nome, preco, validade, componentes);
            }
            case 2 -> {
            System.out.println("Nível de irritabilidade: ");
            int irritabilidade = scanner.nextInt();
            scanner.nextLine();
            produto = new Shampoo(irritabilidade, nome, preco, validade);
        }
            case 3 -> {
                System.out.println("Dias aberto: ");
                int dias = scanner.nextInt();
                scanner.nextLine();
                produto = new Leite(dias, nome, preco, validade);
            }
        }
        if (produto != null) {
            listaProdutos.add(produto);
            System.out.println("Produto cadastrado!");
        } else {
            System.out.println("Opção inválida");
        }
    }
    
    public void exibirProdutos() {
        
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            System.out.println("-----PRODUTOS CADASTRADOS-----");
            for (Produto produto : listaProdutos) {
                System.out.println(produto);
                System.out.println("--------------------------");
            }
            }
        }
    
}
