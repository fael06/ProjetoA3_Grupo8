import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{

    private int nUsuarios;
    private int nAlunos;
    private int nProfessores;

    Panel(){
        JLabel qtdeAlunos = new JLabel();
        JLabel qtdeUsuarios = new JLabel();
        JLabel qtdeProfessores = new JLabel();

        qtdeUsuarios.setText("Quantidade de Usuários: "+nUsuarios);
        qtdeAlunos.setText("Quantidade de Alunos: "+nAlunos);
        qtdeProfessores.setText("Quantidade de Professores: "+nProfessores);

        this.add(qtdeUsuarios);
        this.add(qtdeAlunos);
        this.add(qtdeProfessores);

        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(300,300));
        this.setFocusable(true);

    }

}
