/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadePOO;

/**
 *
 * @author Sara
 */
public class Shampoo extends Produto{
    
    private int irritabilidade;

    public Shampoo(int irritabilidade, String nome, double preço, String data) {
        super(nome, preço, data);
        this.irritabilidade = irritabilidade;
    }

    public int getIrritabilidade() {
        return irritabilidade;
    }

    public void setIrritabilidade(int irritabilidade) {
        this.irritabilidade = irritabilidade;
    }

     @Override
    public String toString() {
        return "-----PRODUTO: SHAMPOO-----" + 
                "irritabilidade: " + irritabilidade +
                "nome: " + getNome() +
                "preço: " + getPreço() +
                "data de validade: " + getData();
    }
    
    
    
}
