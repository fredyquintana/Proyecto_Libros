import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaMenu extends JFrame {

    public BibliotecaMenu() {
        setTitle("Menú Principal - Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLUE);
        setLayout(new GridLayout(3, 1));

        JButton libroButton = createMenuButton("Libro");
        JButton usuarioButton = createMenuButton("Usuario");
        JButton perdidasButton = createMenuButton("Pérdidas");

        libroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazLibro();
            }
        });

        usuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazUsuario();
            }
        });

        perdidasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazPerdidas();
            }
        });

        add(libroButton);
        add(usuarioButton);
        add(perdidasButton);
    }

    private JButton createMenuButton(String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLUE);
        return button;
    }

    private void abrirInterfazLibro() {
        // Lógica para abrir la interfaz de Libro
        JOptionPane.showMessageDialog(this, "Interfaz de Libro");
    }

    private void abrirInterfazUsuario() {
        // Lógica para abrir la interfaz de Usuario
        JOptionPane.showMessageDialog(this, "Interfaz de Usuario");
    }

    private void abrirInterfazPerdidas() {
        // Lógica para abrir la interfaz de Pérdidas
        JOptionPane.showMessageDialog(this, "Interfaz de Pérdidas");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BibliotecaMenu().setVisible(true);
            }
        });
    }
}
