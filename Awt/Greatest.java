import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class GreatestMain extends Frame implements WindowListener, ActionListener {
    Label l1, l3;
    TextField tf1, tf2, tf3, tf4, tf5;
    Button btn1;

    public GreatestMain() {
        this.setVisible(true);
        this.setBounds(30, 50, 800, 500);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        Font f = new Font("", Font.BOLD, 20);

        l1 = new Label("Enter Five number ");
        l1.setBounds(50, 50, 260, 30);
        l1.setFont(f);
        this.add(l1);

        tf1 = new TextField();
        tf1.setBounds(50, 100, 150, 30);
        tf1.setFont(f);
        this.add(tf1);

        tf2 = new TextField();
        tf2.setBounds(50, 130, 150, 30);
        tf2.setFont(f);
        this.add(tf2);

        tf3 = new TextField();
        tf3.setBounds(50, 160, 150, 30);
        tf3.setFont(f);
        this.add(tf3);

        tf4 = new TextField();
        tf4.setBounds(50, 190, 150, 30);
        tf4.setFont(f);
        this.add(tf4);

        tf5 = new TextField();
        tf5.setBounds(50, 220, 150, 30);
        tf5.setFont(f);
        this.add(tf5);

        btn1 = new Button(" Click");
        btn1.setBounds(50, 260, 80, 30);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setForeground(Color.BLACK);
        btn1.setFont(f);
        this.add(btn1);
        btn1.addActionListener(this);

        l3 = new Label();
        l3.setBounds(10, 310, 300, 30);
        l3.setFont(f);
        this.add(l3);

        this.addWindowListener(this);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = tf1.getText();
        int a = Integer.parseInt(s);

        String s1 = tf2.getText();
        int b = Integer.parseInt(s1);

        String s2 = tf3.getText();
        int c = Integer.parseInt(s2);

        String s3 = tf4.getText();
        int d = Integer.parseInt(s3);

        String s4 = tf5.getText();
        int e1 = Integer.parseInt(s4);

        if (a > b && a > c && a > d && a > e1) {
            l3.setText("First number is greatest : " +a);
        } else if (b > c && b > d && b > e1) {
            l3.setText("Second number is greatest : "+b);
        } else if (c > d && c > e1) {
            l3.setText("Third number is greatest : "+c);
        } else if (d > e1) {
            l3.setText("Fourth number is greatest : "+d);
        } else {
            l3.setText("Fifth number is greatest : "+e1);
        }

        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
    }

    // Other WindowListener methods
    // ...
	
    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

class Test {
    public static void main(String[] args) {
        new GreatestMain();
    }
}
