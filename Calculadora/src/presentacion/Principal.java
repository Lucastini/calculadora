
package presentacion;

import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) {
        CalculadoraSinNumeros calSinN=new CalculadoraSinNumeros();
        calSinN.setVisible(true);
        calSinN.setLocation(400, 200);
        calSinN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*CalculadoraConNumeros calConN=new CalculadoraConNumeros();
        calConN.setVisible(true);
        calConN.setLocation(300, 200);
        calConN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        
        /*CotizadorMonedaExtrangera cotiz=new CotizadorMonedaExtrangera();
        cotiz.setLocation(200, 200);
        cotiz.setVisible(true);
        cotiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

        
    }
    
}
