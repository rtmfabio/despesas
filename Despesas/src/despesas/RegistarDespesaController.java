/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package despesas;

/**
 *
 * @author Joel Ferreira
 */
public class RegistarDespesaController {
    
    public Despesa despesa;

    public RegistarDespesaController() {
    }

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }
    
    public int createDespesa(float valor, String descricao){
        
        this.despesa = new Despesa(valor, descricao);
        return 0;
    }
    
}
