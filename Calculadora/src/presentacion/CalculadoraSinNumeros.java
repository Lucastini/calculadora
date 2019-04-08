
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import negocio.Operacion;

public class CalculadoraSinNumeros extends JFrame{
    
    private JTextField txtPantalla;
    private JButton btnMas;
    private JButton btnMenos;
    private JButton btnCero;
    private JButton btnMultiplicacion;
    private JButton btnDivision;
    private JButton btnIgual;
    
    public CalculadoraSinNumeros(){
        EventoAccion e=new EventoAccion();
        this.setTitle("Calculadora sin numeros");
        this.setLayout(null);
        this.setSize(280, 200);
        txtPantalla=new JTextField();
        txtPantalla.setHorizontalAlignment(JTextField.RIGHT);
        txtPantalla.setSize(170, 30);
        txtPantalla.setLocation(50, 10);
        this.getContentPane().add(txtPantalla);
        btnMas=new JButton("+");
        btnMas.setSize(50, 30);
        btnMas.setLocation(50, 50);
        this.getContentPane().add(btnMas);
        btnMas.addActionListener(e);
        btnMenos=new JButton("-");
        btnMenos.setSize(50, 30);
        btnMenos.setLocation(110, 50);
        this.getContentPane().add(btnMenos);
        btnMenos.addActionListener(e);
        btnCero=new JButton("C");
        btnCero.setSize(50, 30);
        btnCero.setLocation(170, 50);
        this.getContentPane().add(btnCero);
        btnCero.addActionListener(e);
        btnMultiplicacion=new JButton("*");
        btnMultiplicacion.setSize(50, 30);
        btnMultiplicacion.setLocation(50, 90);
        this.getContentPane().add(btnMultiplicacion);
        btnMultiplicacion.addActionListener(e);
        btnDivision=new JButton("/");
        btnDivision.setSize(50, 30);
        btnDivision.setLocation(110, 90);
        this.getContentPane().add(btnDivision);
        btnDivision.addActionListener(e);
        btnIgual=new JButton("=");
        btnIgual.setSize(50, 30);
        btnIgual.setLocation(170, 90);
        this.getContentPane().add(btnIgual);
        btnIgual.addActionListener(e);
        
    }
    
    class EventoAccion implements ActionListener{
        private String valor1="";
        private String valor2="";
        private char operacion;

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btnCero){
                txtPantalla.setText("");
                valor1="";
                valor2="";                
            }
            else{
                if(valor1.equals("")){
                    valor1=txtPantalla.getText().trim();
                    txtPantalla.setText("");
                    if(!valor1.equals("")&&e.getSource()==btnMas)
                        operacion='+';
                    else{
                        if(e.getSource()==btnMenos)
                            operacion='-';
                        else{
                            if(e.getSource()==btnMultiplicacion)
                                operacion='*';
                            else{
                                if(e.getSource()==btnDivision)
                                    operacion='/';
                                else
                                    if(e.getSource()==btnIgual)
                                        txtPantalla.setText(valor1);
                            }}}}
                else{
                    valor2=txtPantalla.getText().trim();
                    if(valor2.equals(""))
                        txtPantalla.setText(valor1);
                    else{
                        Operacion op=new Operacion();
                        op.setNum1(Integer.parseInt(valor1));
                        op.setNum2(Integer.parseInt(valor2));
                        switch(operacion){
                            case '+':{
                                txtPantalla.setText(""+op.sumar());
                                break;}
                            case'-':{
                                txtPantalla.setText(""+op.restar());
                                break;}
                            case'*':{
                                txtPantalla.setText(""+op.multiplicar());
                                break;}
                            case'/':{
                                txtPantalla.setText(""+op.dividir());
                                break;}
                        }
                    }
                }
            }
        }
    }
    
}
