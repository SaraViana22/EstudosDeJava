/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadePOO;

/**
 *
 * @author Sara
 */
public class Leite extends Produto{
    
    private int dias;

    public Leite(int dias, String nome, double preço, String data) {
        super(nome, preço, data);
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

     @Override
    public String toString() {
        return "-----PRODUTO: LEITE-----" + 
                "dias: " + dias +
                "nome: " + getNome() +
                "preço: " + getPreço() +
                "data de validade: " + getData();
    }
    
    
    
}
