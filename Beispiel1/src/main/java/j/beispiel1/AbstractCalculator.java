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
public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;
    
    
    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply,CalculationOperation divide){
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }
    
    public abstract Number add(Number a, Number b);
    public abstract Number substract(Number a, Number b);
    public abstract Number multipy(Number a, Number b);
    public abstract Number divide(Number a, Number b);
    
}
