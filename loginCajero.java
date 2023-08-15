import javax.swing.*;

public class loginCajero {
    private JPanel jpanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton btn_ingresar;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Página principal");
        frame.setContentPane(new loginCajero().jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}

