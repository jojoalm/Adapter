/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_adapter;

/**
 *
 * @author JOSI
 */
public class Exemplo_adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        mallardDuck duck = new mallardDuck();
        WildTurkey turkey = new WildTurkey();
        
        duck TurkeyAdapter = new TurkeyAdapter(turkey);
        
        turkey.globble();
        turkey.fly();
        
        testduck testduck = new testduck(duck);
         testduck testduck2 = new testduck(TurkeyAdapter);
        
         
         
    }
    static void testduck(duck puck){
        puck.grosnar();
        puck.voar();
    }
}
