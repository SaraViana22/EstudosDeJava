/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadePOO;
/**
 *
 * @author Sara
 */
public class Biscoito extends Produto {
    private int compCancerigenos;

    public Biscoito(String nome, double preço, String data, int compCancerigenos) {
        super(nome, preço, data);
        this.compCancerigenos = compCancerigenos;
    }

    public int getCompCancerigenos() {
        return compCancerigenos;
    }

    public void setCompCancerigenos(int compCancerigenos) {
        this.compCancerigenos = compCancerigenos;
    }

    @Override
    public String toString() {
        return "-----PRODUTO: BISCOITO-----\n" + 
                "Componentes cancerígenos: " + compCancerigenos +
                "nome: " + getNome() +
                "preço: " + getPreço() +
                "data de validade: " + getData();
    }
    
    
}
