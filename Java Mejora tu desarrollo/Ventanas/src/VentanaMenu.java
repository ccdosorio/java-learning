import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu implements ActionListener {
    JFrame ventana;
    JMenu opcion1, opcion2, Sopcion1, Sopcion2, Sopcion3, Sopcion4;
    JMenuItem sub1, sub2;
    JMenuBar menubar;

    public VentanaMenu() {
        crearMenu();
        crearVentana();
    }

    public void crearMenu() {
        menubar = new JMenuBar();

        opcion1 = new JMenu("1");
        opcion2 = new JMenu("2");

        Sopcion1 = new JMenu("A");
        Sopcion2 = new JMenu("B");
        Sopcion3 = new JMenu("C");
        Sopcion4 = new JMenu("D");

        sub1 = new JMenuItem("X");
        sub2 = new JMenuItem("Y");


        menubar.add(opcion1);
        menubar.add(opcion2);

        opcion1.add(Sopcion1);
        opcion1.add(Sopcion2);

        opcion2.add(Sopcion3);
        opcion2.add(Sopcion4);

        Sopcion1.add(sub1);
        Sopcion2.add(sub2);

        Sopcion1.addActionListener(this);
        Sopcion2.addActionListener(this);
        Sopcion3.addActionListener(this);
        Sopcion4.addActionListener(this);

        sub1.addActionListener(this);
        sub2.addActionListener(this);
    }

    public void crearVentana() {

        ventana = new JFrame("Ventana con Menu");
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.setSize(300, 300);
        ventana.setVisible(true);
        ventana.setJMenuBar(menubar);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub1) {
            System.out.println("X");
            ventana.setSize(500, 500);
        }
    }
}
