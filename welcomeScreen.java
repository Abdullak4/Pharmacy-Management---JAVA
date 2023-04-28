package project;
import javax.swing.*;
import java.awt.*;

abstract class welcome{
    abstract void display();
}

public class welcomeScreen{
    public static void main(String[] args) {
        new screen();
    }
}

class screen{
    screen(){
        display();
    }
    public void display() {
        JWindow w = new JWindow();
        w.setSize(800,500);
        w.setLocationRelativeTo(null);
        w.setVisible(true);
        JPanel panel = new JPanel();
        w.add(panel);
        JLabel l = new JLabel(new ImageIcon("C:\\Users\\abdul\\OneDrive\\Desktop\\java\\SwingTut\\1.jpg"));
        panel.add(l,BorderLayout.CENTER);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        JProgressBar pb = new JProgressBar(0,100);
        w.add(pb,BorderLayout.PAGE_END);
        panel.setBackground(Color.WHITE);
        pb.setStringPainted(true);
        int i = 0;
        pb.setForeground(Color.red);
        while(i<=100){
            pb.setValue(i);
            try{
                Thread.sleep(100);
            }
            catch(Exception e ){}
            i = i +10; 
        }
        int j = pb.getValue();
        if(j == 100){
            w.dispose();
            Login login = new Login();
            login.setVisible(true);
            
        }

    }
}
