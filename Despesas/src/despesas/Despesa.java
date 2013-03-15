/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package despesas;

/**
 *
 * @author Janus
 */
public class Despesa {
    
    private float valor;
    private String descricao;
    
    public Despesa(){
        
        valor=0.0f;
        descricao="Sem descrição";
    }
    
    public Despesa(float valor, String descricao){
        
        this.valor=valor;
        this.descricao=descricao;
    }    
}
    
