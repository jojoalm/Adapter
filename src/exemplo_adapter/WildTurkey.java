/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_adapter;

/**
 *
 * @author JOSI
 */
public class WildTurkey implements turkey{

    @Override
    public void globble() {
       System.out.println("gloob gloob");
    }

    @Override
    public void fly() {
          System.out.println("flym in a short distance");
    }

    
}
