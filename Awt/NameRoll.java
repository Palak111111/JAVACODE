
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

 class MyFrame extends Frame implements WindowListener,ActionListener
{
    Label lb1,lb2,lb3,lb4;
    TextField tf1,tf2;
    Button bn1;
     public MyFrame()
    {
        this.setVisible(true);
        this.setTitle("MY Frame");
        this.setBounds(100,50,700,400);
        this.setBackground(Color.yellow);
        this.setLayout(null);
        lb1=new Label("Enter your name : ");
        lb1.setBounds(50,50,150,30);
        this.add(lb1);
        lb2=new Label("Enter your Roll Number : ");
        lb2.setBounds(50,80,150,30);
        this.add(lb2);
        tf1=new TextField();
        tf1.setBounds(200,50,180,30);
        this.add(tf1);
        tf2=new TextField();
        tf2.setBounds(200,90,180,30);
        this.add(tf2);
        bn1=new Button("Submit Form");
        bn1.setBounds(150,200,200,50);
        bn1.setBackground(Color.PINK);
        lb3=new Label();
        lb3.setBounds(130,120,250,30);
        this.add(lb3);
        lb4=new Label();
        lb4.setBounds(130,160,350,50);
        this.add(lb4);
        this.add(bn1);
        bn1.addActionListener(this);
        this.addWindowListener(this);
        
        
        
        
    }
    //@Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //@Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        dispose();
    }

    //@Override
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //@Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //@Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //@Override
    public void windowActivated(WindowEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  //  @Override
    public void windowDeactivated(WindowEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String s=tf1.getText();
        String s1=tf2.getText();
        lb3.setText("YOUR NAAME IS="+s);
        lb4.setText("YOUR ROLL NUMBER IS = "+s1);
    }
    
}
class Test
{
    public static void main(String[] args) {
         new MyFrame();
    }
}
