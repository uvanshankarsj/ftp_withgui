import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


public class gui  extends JFrame implements ActionListener{
    public static void main(String[] args){
        gui a=new gui();
        a.asd();
    }

    public void asd(){
        JFrame f=new JFrame();
        f.setSize(1280,720);
        JButton b=new JButton("selectfile");
        JLabel t=new JLabel("Welcome thanks for downloading");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setBounds(540,400,150,30);
        t.setBounds(520, 380, 300, 25);
        f.getContentPane().setBackground(Color.cyan);
        f.add(b);
        f.add(t);
        b.addActionListener(this);
        f.setEnabled(true);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("selectfile")) {
            JFileChooser j = new JFileChooser();
            j.showOpenDialog(null);
            String path=j.getSelectedFile().getAbsolutePath();
        }
    }
}
