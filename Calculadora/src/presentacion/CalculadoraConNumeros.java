
package presentacion;

import javax.swing.*;

public class CalculadoraConNumeros extends JFrame{
    private JTextField txtPantalla;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDivision;
    private JButton btnBorrar;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnMultiplicacion;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnMenos;
    private JButton btnIgual;
    private JButton btn0;
    private JButton btnPositNegat;
    private JButton btnPunto;
    private JButton btnMas;
    
    public CalculadoraConNumeros(){
        this.setTitle("Calculadora con Numeros");
        this.setSize(370, 290);
        this.setLayout(null);
        txtPantalla=new JTextField();
        txtPantalla.setSize(290, 30);
        txtPantalla.setLocation(30, 30);
        txtPantalla.setHorizontalAlignment(JTextField.RIGHT);
        this.getContentPane().add(txtPantalla);
        btn7=new JButton("7");
        btn7.setSize(50, 30);
        btn7.setLocation(30, 70);
        this.getContentPane().add(btn7);
        btn8=new JButton("8");
        btn8.setSize(50, 30);
        btn8.setLocation(90, 70);
        this.getContentPane().add(btn8);
        btn9=new JButton("9");
        btn9.setSize(50, 30);
        btn9.setLocation(150, 70);
        this.getContentPane().add(btn9);
        btnDivision=new JButton("/");
        btnDivision.setSize(50, 30);
        btnDivision.setLocation(210, 70);
        this.getContentPane().add(btnDivision);
        btnBorrar=new JButton("C");
        btnBorrar.setSize(50, 70);
        btnBorrar.setLocation(270, 70);
        this.getContentPane().add(btnBorrar);
        btn4=new JButton("4");
        btn4.setSize(50, 30);
        btn4.setLocation(30, 110);
        this.getContentPane().add(btn4);
        btn5=new JButton("5");
        btn5.setSize(50, 30);
        btn5.setLocation(90, 110);
        this.getContentPane().add(btn5);
        btn6=new JButton("6");
        btn6.setSize(50, 30);
        btn6.setLocation(150, 110);
        this.getContentPane().add(btn6);
        btnMultiplicacion=new JButton("*");
        btnMultiplicacion.setSize(50, 30);
        btnMultiplicacion.setLocation(210, 110);
        this.getContentPane().add(btnMultiplicacion);
        btn1=new JButton("1");
        btn1.setSize(50, 30);
        btn1.setLocation(30, 150);
        this.getContentPane().add(btn1);
        btn2=new JButton("2");
        btn2.setSize(50, 30);
        btn2.setLocation(90, 150);
        this.getContentPane().add(btn2);
        btn3=new JButton("3");
        btn3.setSize(50, 30);
        btn3.setLocation(150, 150);
        this.getContentPane().add(btn3);
        btnMenos=new JButton("-");
        btnMenos.setSize(50, 30);
        btnMenos.setLocation(210, 150);
        this.getContentPane().add(btnMenos);
        btnIgual=new JButton("=");
        btnIgual.setSize(50, 70);
        btnIgual.setLocation(270, 150);
        this.getContentPane().add(btnIgual);
        btn0=new JButton("0");
        btn0.setSize(50, 30);
        btn0.setLocation(30, 190);
        this.getContentPane().add(btn0);
        btnPositNegat=new JButton("+/-");
        btnPositNegat.setSize(50, 30);
        btnPositNegat.setLocation(90, 190);
        this.getContentPane().add(btnPositNegat);
        btnPunto=new JButton(".");
        btnPunto.setSize(50, 30);
        btnPunto.setLocation(150, 190);
        this.getContentPane().add(btnPunto);
        btnMas=new JButton("+");
        btnMas.setSize(50, 30);
        btnMas.setLocation(210, 190);
        this.getContentPane().add(btnMas);
    
}
    
}