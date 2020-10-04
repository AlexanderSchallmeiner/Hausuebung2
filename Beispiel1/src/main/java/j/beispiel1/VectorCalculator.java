/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.beispiel1;

/**
 *
 * @author alexa
 */
public class VectorCalculator extends AbstractCalculator{

    public VectorCalculator() {
        super( (Number a, Number b) -> new Number(),
                (Number a, Number b) -> new Number(),
                (Number a, Number b) -> new Number(),
                (Number a, Number b) -> new Number()
        
        
        
        
        
        );
    }
    
    

    @Override
    public Number add(Number a, Number b) {
       this.add.calc(a, b);
       
    }

    @Override
    public Number substract(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number multipy(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number divide(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
