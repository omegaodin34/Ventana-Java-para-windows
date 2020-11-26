
package Ventana;

/**
 *
 * @author Jose Manuel Rodriguez Altamirano
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 * Clase Ventana para juego con JFrame
 * @author Jose Manuel Rodriguez Altamirano
 */
public class Ventana extends JFrame implements ActionListener {

    private JLabel texto;           // etiqueta o texto no editable
    private JTextField caja;        // caja de texto, para insertar datos
    private JButton boton;          // boton con una determinada accion
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }
/**
 * Configuracion Ventana
 * 
 */
    private void configurarVentana() {
        this.setTitle("PES 2022  -  POR --  OMEGAODIN34");      // colocamos titulo a la ventana
        this.setSize(310, 210);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
/**
 * Inicializacion Ventana
 *  
 */
    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        // configuramos los componentes
        // texto.setText("Inserte Nombre");    // colocamos un texto a la etiqueta
        //texto.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        // caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        boton.setText("PLAY");   // colocamos un texto al boton
        boton1.setText("OPCIONES");
        boton2.setText("CREDITOS");
        boton3.setText("EXIT");
        
        boton.setBounds(120, 15, 160, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton1.setBounds(120,60,160,30);
        boton2.setBounds(120,105,160,30);
        boton3.setBounds(120,145,160,30);
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        boton1.addActionListener(this); 
        boton2.addActionListener(this);
        boton3.addActionListener(this);
 /**
 * Adicionamos componentes a la  Ventana
 *  
 */

        this.add(texto);
        this.add(caja);
        this.add(boton);
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = caja.getText();                                 // obtenemos el contenido de la caja de texto
        JOptionPane.showMessageDialog(this, "Hola " + nombre + ".");    // mostramos un mensaje (frame, mensaje)
    }

    public static void main(String[] args) {
        Ventana V = new Ventana();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
        
    }
}