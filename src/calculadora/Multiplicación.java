package calculadora;

public class Multiplicación {
    
    /*
    * To change this template, choose Tools | Templates
    * and open the template in the editor.
    */
     

    /**
     *
     * @author Carlos
     */
    public class Multiplicacion extends Operacion{
        
        double multi;
        
        public Multiplicacion(double n1, double n2) {
                
            super(n1, n2, '*');
            this.multi = n1 * n2;
            this.setRes(this.multi);
        }

    }
}