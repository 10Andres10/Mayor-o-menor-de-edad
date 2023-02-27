import javax.swing.JOptionPane;

public class condicionales{

    public static void main( String[] args){
        // Definición de variables:
        int edad;

        // Mensaje edad 
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es tu edad?"));

        if (edad>=18){
        JOptionPane.showMessageDialog(null, "Es mayor de edad");
        } else{
            JOptionPane.showMessageDialog(null, "Es menor de edad");
        }
    }

}