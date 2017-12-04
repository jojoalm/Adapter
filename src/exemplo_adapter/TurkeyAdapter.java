/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_adapter;

/**
 *
 * @author JOSI
 */
public class TurkeyAdapter implements duck{
    turkey Turkey;

    public TurkeyAdapter(turkey Turkey) {
        this.Turkey = Turkey;
    }

    
    @Override
    public void voar() {
        Turkey.globble();
    }

    @Override
    public void grosnar() {
       Turkey.fly(); 
   }
    
}
