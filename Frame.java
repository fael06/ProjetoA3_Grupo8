import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

    Frame() {
        Panel panel = new Panel();

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);

        this.setTitle("Faculdade");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
