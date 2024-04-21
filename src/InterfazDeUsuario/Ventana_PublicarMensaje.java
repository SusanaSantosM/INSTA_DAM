package InterfazDeUsuario;
import EstructuraDeDatos.Publicaciones;

import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.*;

public final class Ventana_PublicarMensaje extends JFrame {
    private JPanel panel;
    private JTextArea mensaje;
    private JTextField usuario;

    public Ventana_PublicarMensaje(){
        super("INSTADAM - Publica Mensajes");
        setSize(500,500);
        setLocationRelativeTo(null);
        //Llamamos a los métodos
        colocarPanel();
        colocarUsuario();
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

    public void colocarUsuario(){
        JLabel etiquetaUsuario = new JLabel("Usuario:");
        etiquetaUsuario.setBounds(50, 50, 60, 30);
        etiquetaUsuario.setFont(new Font("Arial",0,15));
        panel.add(etiquetaUsuario);

        usuario = new JTextField("¿Qué piensas?");
        usuario.setBounds(120, 50, 300, 40);
        panel.add(usuario);
    }

    public void colocarMensaje(){
        JLabel etiquetaMensaje = new JLabel("Descripción:");
        etiquetaMensaje.setBounds(50, 100, 150, 30);
        etiquetaMensaje.setFont(new Font("Arial",0,15));
        panel.add(etiquetaMensaje);

        mensaje = new JTextArea();
        mensaje.setBounds(120, 140, 300, 100);
        panel.add(mensaje);
    }

    public void colocarBoton(){
        JButton botonEnviar = new JButton("Publicar");
        botonEnviar.setBounds(150, 300, 200, 30);
        botonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newMensaje = mensaje.getText();
                String newTitulo = usuario.getText();
                botonEnviar.setText(String.valueOf(new Ventana_Publicaciones()));
            }
        });
        panel.add(botonEnviar);
    }
}