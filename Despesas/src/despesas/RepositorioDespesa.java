/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package despesas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel Ferreira
 */
public class RepositorioDespesa {
    
    public static List<Despesa> despesas = new ArrayList<Despesa>();

    public RepositorioDespesa() {
    }

    public static List<Despesa> getDespesas() {
        return despesas;
    }

    public boolean save(Despesa despesa){
    
        try {
            despesas.add(despesa);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
