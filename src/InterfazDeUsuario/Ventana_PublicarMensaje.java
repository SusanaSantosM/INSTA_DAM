package InterfazDeUsuario;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.*;

public final class Ventana_PublicarMensaje extends JFrame {
    private JPanel panel;

    public Ventana_PublicarMensaje(){
        super("INSTADAM - Publica Mensaje");
        setSize(500,500);
        setLocationRelativeTo(null);setVisible(true);

        //Llamamos a los métodos
        colocarPanel();
        colocarTitulo();
        colocarMensaje();
        colocarBoton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void colocarPanel(){
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    public void colocarTitulo(){
        JLabel etiquetaTitulo = new JLabel("Titulo:");
        etiquetaTitulo.setBounds(50, 50, 60, 30);
        etiquetaTitulo.setFont(new Font("Arial",0,20));
        panel.add(etiquetaTitulo);

        JTextField titulo = new JTextField("¿Qué piensas?");
        titulo.setBounds(120, 50, 300, 40);
        panel.add(titulo);
    }

    public void colocarMensaje(){
        JLabel etiquetaMensaje = new JLabel("Descripción:");
        etiquetaMensaje.setBounds(50, 100, 150, 30);
        etiquetaMensaje.setFont(new Font("Arial",0,20));
        panel.add(etiquetaMensaje);

        JTextArea mensaje = new JTextArea();
        mensaje.setBounds(120, 140, 300, 100);
        panel.add(mensaje);
    }

    public void colocarBoton(){
        JButton botonEnviar = new JButton("Publicar");
        botonEnviar.setBounds(150, 300, 200, 30);
        panel.add(botonEnviar);
    }
}