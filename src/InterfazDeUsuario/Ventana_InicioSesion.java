package InterfazDeUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_InicioSesion extends JFrame{
    private JPanel panel;
    public Ventana_InicioSesion(){
        super("INSTA DAM");
        setSize(500,300);
        setLocationRelativeTo(null);
        setResizable(false);

        //Llamamos a los métodos
        colocarPanel();
        colocarBotones();
        colocarTexto();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void colocarPanel(){
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarBotones(){
        //Botón para registrar nuevo usuario
        JButton boton1 = new JButton("Registrate");
        boton1.setBounds(120, 200, 120, 30);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_Registro registro = new Ventana_Registro();
                registro.setVisible(true);
            }
        });
        panel.add(boton1);

        //Botón para iniciar sesión del usuario
        JButton boton2 = new JButton("Iniciar Sesión");
        boton2.setBounds(180, 150, 150, 30);
        panel.add(boton2);

        //Si no tiene cuenta puede entrar como visitante
        JButton boton3 = new JButton("Visitante");
        boton3.setBounds(250,200,120,30);
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_Publicaciones publicaciones = new Ventana_Publicaciones();
                publicaciones.setVisible(true);
            }
        });
        panel.add(boton3);
    }

    private void colocarTexto(){
        JLabel etiqueta1 = new JLabel("BIENVENIDO A INSTA DAM");
        etiqueta1.setFont(new Font("Arial", Font.BOLD,15));
        etiqueta1.setForeground(Color.BLACK);
        etiqueta1.setBounds(150, 20, 200, 30);
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("Usuario:");
        etiqueta2.setForeground(Color.WHITE);
        etiqueta2.setBounds(100, 60, 200, 30);
        panel.add(etiqueta2);

        JTextField texto2 = new JTextField(30);
        texto2.setBounds(180, 60, 160, 25);
        panel.add(texto2);

        JLabel etiqueta3 = new JLabel("Contraseña:");
        etiqueta3.setForeground(Color.WHITE);
        etiqueta3.setBounds(80, 95, 200, 30);
        panel.add(etiqueta3);

        JPasswordField texto3 = new JPasswordField(50);
        texto3.setBounds(180, 95, 160, 25);
        panel.add(texto3);
    }
}
