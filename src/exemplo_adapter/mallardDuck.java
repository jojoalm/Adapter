/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_adapter;

/**
 *
 * @author JOSI
 */
public class  mallardDuck implements duck{

    @Override
    public void voar() {
       System.out.println("voar");
    }

    @Override
    public void grosnar() {
        System.out.println("gruuu");
    }
    
    
}
