package javagrafico;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    public Ventana() {
        setSize(500, 500);// establecemos tamaño de la ventana
        setTitle("El mejor titulo");// establecemos el titulo de la ventana
        //setLocation(450, 150);//establecemos la posicion inicial de mi ventana
        //setBounds(450,150,500,500);// establecemos la posicion y el tamaño de la ventana
        setLocationRelativeTo(null);//centramos la ventana en nuestra pantalla
        //setResizable(false);//establecemos si se puede o no cambiar el tamaño de la ventana
        setMinimumSize(new Dimension(200, 200));//establecemos el tamaño minimo de la ventana
        //this.getContentPane().setBackground(Color.black);//establecemos el color de fondo de nuestra ventana

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();//creacion de un panel
        panel.setBackground(Color.DARK_GRAY);//cambiamos el color de fondo de nuestro panel
        panel.setLayout(null);//deshabilitamos la posicion por defecto de nuestra etiqueta

        this.getContentPane().add(panel);//agregamos el panel a mi ventana

//etiqueta 1 - tipo texto
        JLabel etiqueta = new JLabel(/*"hola", SwingConstants.CENTER*/);//agregamos una etiqueta y alineamos horizontalmente
        etiqueta.setText("Mundial 2022");//estblecemos el texto de la etiqueta
        etiqueta.setBounds(10, 10, 200, 50);//establecemos la posicion de nuestra etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//alineamos hotizontalmente
        //etiqueta.setForeground(Color.white);//cambiamos el color de los letras de nuestra etiqueta
        //etiqueta.setOpaque(true);//deshabilitamos el valor transparente de la etiqueta
        //etiqueta.setBackground(Color.BLACK);//cambiamos el color de fondo
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 30));//establecemos la fuente del texto
        panel.add(etiqueta);//agregamos la etiqueta
//etiqueta 2 - tipo imagen
        JLabel etiqueta2 = new JLabel();
        ImageIcon imagen = new ImageIcon("C:\\Users\\Raul\\Desktop\\Curso Programacion desde cero\\Comienzo curso pago\\Programacion Orientada a Objetos POO\\EjercicioPOO\\JavaGrafico\\pelotaMundial2.jpg");
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        etiqueta2.setBounds(10, 10, 500, 500);
        panel.add(etiqueta2);
    }
}
