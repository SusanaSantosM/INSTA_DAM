package InterfazDeUsuario;

import javax.swing.*;
import java.awt.*;

public class Ventana_Registro extends JFrame {
    private JPanel panel;
    public Ventana_Registro(){
        super("INSTA DAM - Registro");
        setSize(500,400);
        setLocationRelativeTo(null);
        //Agregar métodos
        colocarPanel();
        botonRegistrar();
        ingresarNombre();
        ingresarApellido();
        ingresarUsuario();
        ingresarContrasenia();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void colocarPanel(){
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    public void ingresarNombre(){
        JLabel etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setBounds(90,60,80,30);
        panel.add(etiquetaNombre);

        JTextField ingresaNombre = new JTextField();
        ingresaNombre.setBounds(190,60,200,30);
        panel.add(ingresaNombre);
    }
    public void ingresarApellido(){

        JLabel etiquetaApellido = new JLabel("Apellido:");
        etiquetaApellido.setBounds(90,100,80,30);
        panel.add(etiquetaApellido);

        JTextField ingresaApellido = new JTextField();
        ingresaApellido.setBounds(190,100,200,30);
        panel.add(ingresaApellido);
    }

    public void ingresarUsuario(){
        JLabel etiquetaUsuario = new JLabel("Usuario:");
        etiquetaUsuario.setBounds(90,140,80,30);
        panel.add(etiquetaUsuario);

        JTextField ingresaUsuario = new JTextField();
        ingresaUsuario.setBounds(190,140,200,30);
        panel.add(ingresaUsuario);
    }

    public  void ingresarContrasenia(){
        JLabel etiquetaContrasenia = new JLabel("Contraseña:");
        etiquetaContrasenia.setBounds(90,180,80,30);
        panel.add(etiquetaContrasenia);

        JPasswordField ingresaContrasenia = new JPasswordField();
        ingresaContrasenia.setBounds(190,180,200,30);
        panel.add(ingresaContrasenia);
    }
    public void botonRegistrar(){
        JButton registrar = new JButton();
        registrar.setText("Registrarse");
        registrar.setBounds(190,280,100,30);
        panel.add(registrar);
    }
}
