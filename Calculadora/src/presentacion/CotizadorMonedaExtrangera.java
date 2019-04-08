
package presentacion;

import javax.swing.*;

public class CotizadorMonedaExtrangera extends JFrame {
    private JLabel lblCotizacion;
    private JTextField txtValorCotizacion;
    private JLabel lblPesos;
    private JTextField txtValorPesos;
    private JLabel lblDolares;
    private JTextField txtValorDolares;
    private JButton btnConvertir;
    private JButton btnLimpiar;
    
    public CotizadorMonedaExtrangera(){
        this.setTitle("Cotizador");
        this.setSize(350, 220);
        this.setLayout(null);
        //this.setLocation(200, 200);
        //this.setVisible(true);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        lblCotizacion=new JLabel("Cotizacion:");
        lblCotizacion.setSize(70, 30);
        lblCotizacion.setLocation(20, 20);
        this.getContentPane().add(lblCotizacion);
        txtValorCotizacion=new JTextField();
        txtValorCotizacion.setHorizontalAlignment(JTextField.RIGHT);
        txtValorCotizacion.setSize(60, 30);
        txtValorCotizacion.setLocation(100, 20);
        
        this.getContentPane().add(txtValorCotizacion);
        lblPesos=new JLabel("Pesos:");
        lblPesos.setSize(50, 30);
        lblPesos.setLocation(180, 20);
        this.getContentPane().add(lblPesos);
        txtValorPesos=new JTextField();
        txtValorPesos.setHorizontalAlignment(JTextField.RIGHT);
        txtValorPesos.setSize(60, 30);
        txtValorPesos.setLocation(240, 20);
        
        this.getContentPane().add(txtValorPesos);
        lblDolares=new JLabel("Dolares:");
        lblDolares.setSize(60, 30);
        lblDolares.setLocation(180, 70);
        this.getContentPane().add(lblDolares);
        txtValorDolares=new JTextField();
        txtValorDolares.setHorizontalAlignment(JTextField.RIGHT);
        txtValorDolares.setSize(60, 30);
        txtValorDolares.setLocation(240, 70);
        
        this.getContentPane().add(txtValorDolares);
        btnConvertir=new JButton("Convertir");
        btnConvertir.setSize(90, 30);
        btnConvertir.setLocation(50, 120);
        
        this.getContentPane().add(btnConvertir);
        btnLimpiar=new JButton("Limpiar");
        btnLimpiar.setSize(90, 30);
        btnLimpiar.setLocation(190, 120);
        
        this.getContentPane().add(btnLimpiar);
        
        
    }
    
    
    
}
