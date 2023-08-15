import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class loginCajero {
    private JPanel jpanel;
    private JTextField btn_correo;
    private JPasswordField btn_contraseña;
    private JButton btn_ingresar;
    String correo;
    String contraseña;

    public loginCajero() {
        btn_ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(correo);
                System.out.println(contraseña);
                //crear un nuevo archivo
                File file = new File("C://Users//POO//Documents//cajero.dat");
                try{
                    //Escribir datos dentro de un archivo //file archivo que ya guarde arribaa
                    FileWriter fileWriter = new FileWriter(file,true);
                    //crear otra clase escribri datos para guardar en memoria
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(correo+":"+contraseña+"\n");
                    //cerrar
                    bufferedWriter.close();
                }catch (IOException exception){
                    System.out.println("Error al ingresar ");
                }
            }
        });
        btn_correo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                correo=btn_correo.getText();
            }
        });
        btn_contraseña.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contraseña=btn_contraseña.getText();
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Cajero");
        frame.setContentPane(new loginCajero().jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}

