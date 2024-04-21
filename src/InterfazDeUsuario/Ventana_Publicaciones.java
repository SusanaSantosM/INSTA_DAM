package InterfazDeUsuario;

import javax.swing.*;
import javax.swing.text.BoxView;
import java.awt.*;

public class Ventana_Publicaciones extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private Box caja1;
    private Box caja2;
    private Box caja3;

    public Ventana_Publicaciones(){
        super("¿QUÉ HAY DE NUEVO?");
        setSize(600,500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        //Agregamos el panel
        paneles();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paneles(){

        JLabel titulo = new JLabel("PUBLICACIONES");
        titulo.setSize(120,60);
        panel1 = new JPanel();
        panel1.add(titulo);
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.GRAY);
        this.getContentPane().add(panel1, BorderLayout.NORTH);

        //Panel de mensajes
        panel2 = new JPanel();
        panel2.setBackground(Color.GRAY);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        this.getContentPane().add(panel2, BorderLayout.CENTER);

        //Panel de Botones
        panel3 = new JPanel();
        panel3.setBackground(Color.GRAY);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        this.getContentPane().add(panel3, BorderLayout.EAST);

        //Panel de usuarios
        panel4 = new JPanel();
        panel4.setBackground(Color.GRAY);
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        this.getContentPane().add(panel4, BorderLayout.WEST);

        //Agregamos componentes
        agregamosUsuarios();
        agregamosMensajes();
        funcionBotones();
    }

    public void agregamosUsuarios(){
        //Creamos la caja donde iran los usuarios
        caja1 = Box.createVerticalBox();
        panel4.add(caja1);
        caja1.add(Box.createVerticalStrut(50));

        //Usuario1
        JLabel usuario1 = new JLabel("Paloma16");
        usuario1.setForeground(Color.WHITE);
        usuario1.setMaximumSize(usuario1.getPreferredSize());
        panel4.add(usuario1);
        caja1.add(usuario1);
        caja1.add(Box.createVerticalStrut(120));

        //Usuario2
        JLabel usuario2 = new JLabel("Axel81");
        usuario2.setForeground(Color.WHITE);
        usuario2.setMaximumSize(usuario1.getPreferredSize());
        panel4.add(usuario2);
        caja1.add(usuario2);
        caja1.add(Box.createVerticalStrut(120));

        //Usuario3
        JLabel usuario3 = new JLabel("Cris");
        usuario3.setForeground(Color.WHITE);
        usuario3.setMaximumSize(usuario1.getPreferredSize());
        panel4.add(usuario3);
        caja1.add(usuario3);
    }

    public void agregamosMensajes() {
        //Mensajes predeterminados
        caja2 = Box.createVerticalBox();
        panel2.add(caja2);
        caja2.add(Box.createVerticalStrut(20));

        //Mensaje 1
        JTextArea mensaje1 = new JTextArea(10,20);
        mensaje1.setText("No puedo creer que no haya más entradas TwT");
        mensaje1.setEditable(false);
        panel2.add(mensaje1);
        caja2.add(mensaje1);
        caja2.add(Box.createVerticalStrut(60));

        //Mensaje 2
        JTextArea mensaje2 = new JTextArea(10,20);
        mensaje2.setText("¿Cómo? Ya se acabaron!! :O");
        mensaje2.setEditable(false);
        panel2.add(mensaje2);
        caja2.add(mensaje2);
        caja2.add(Box.createVerticalStrut(60));

        //Mensaje 3
        JTextArea mensaje3 = new JTextArea(10,20);
        mensaje3.setText("Si! Yo compre unos 3.");
        mensaje3.setEditable(false);
        panel2.add(mensaje3);
        caja2.add(mensaje3);
        caja2.add(Box.createVerticalStrut(60));
    }

    public void funcionBotones(){

        caja3 = Box.createVerticalBox();
        caja3.add(Box.createVerticalStrut(40));
        panel3.add(caja3);

        JButton meGusta1 = new JButton("Me gusta");
        panel3.add(meGusta1);
        caja3.add(meGusta1);

        JButton visitarPerfil1 = new JButton("Ver perfil");
        panel3.add(visitarPerfil1);
        caja3.add(visitarPerfil1);
        caja3.add(Box.createVerticalStrut(80));


        JButton meGusta2 = new JButton("Me gusta");
        panel3.add(meGusta2);
        caja3.add(meGusta2);

        JButton visitarPerfil2 = new JButton("Ver perfil");
        panel3.add(visitarPerfil2);
        caja3.add(visitarPerfil2);
        caja3.add(Box.createVerticalStrut(90));

        JButton meGusta3 = new JButton("Me gusta");
        panel3.add(meGusta3);
        caja3.add(meGusta3);

        JButton visitarPerfil3 = new JButton("Ver perfil");
        panel3.add(visitarPerfil3);
        caja3.add(visitarPerfil3);
    }
}
