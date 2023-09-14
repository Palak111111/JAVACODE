
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class MyFrameOne extends Frame implements WindowListener,ActionListener
{
    Label lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12;
    TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
    Button bn1;
     public MyFrameOne()
    {
        this.setVisible(true);
        this.setTitle("Student Info");
        this.setBounds(100,100,700,400);
        this.setBackground(Color.gray);
        this.setLayout(null);
        
        
        
        lb1=new Label("Enter your name : ");
        lb1.setBounds(50,50,150,30);
        this.add(lb1);
        lb2=new Label("Enter your Roll Number : ");
        lb2.setBounds(50,90,150,30);
        this.add(lb2);
        lb3=new Label("Enter your Father's Name : ");
        lb3.setBounds(50,140,150,30);
        this.add(lb3);
        lb4=new Label("Enter your Mother's Name: ");
        lb4.setBounds(50,180,150,30);
        this.add(lb4);
        lb5=new Label("Enter your Address : ");
        lb5.setBounds(50,220,150,30);
        this.add(lb5);
        lb6=new Label("Enter your Subject : ");
        lb6.setBounds(50,260,150,30);
        this.add(lb6);
        
        
        tf1=new TextField();
        tf1.setBounds(200,50,180,30);
        this.add(tf1);
        tf2=new TextField();
        tf2.setBounds(200,90,180,30);
        this.add(tf2);
        tf3=new TextField();
        tf3.setBounds(200,140,180,30);
        this.add(tf3);
        tf4=new TextField();
        tf4.setBounds(200,180,180,30);
        this.add(tf4);
        tf5=new TextField();
        tf5.setBounds(200,220,180,30);
        this.add(tf5);
        tf6=new TextField();
        tf6.setBounds(200,260,180,30);
        this.add(tf6);
        
        
        
        bn1=new Button("Submit Form");
        bn1.setBounds(150,300,200,50);
        bn1.setBackground(Color.PINK);
        
        
        lb7=new Label();
        lb7.setBounds(150,420,250,30);
        this.add(lb7);
        lb8=new Label();
        lb8.setBounds(150,440,350,50);
        this.add(lb8);
        lb9=new Label();
        lb9.setBounds(150,460,450,30);
        this.add(lb9);
        lb10=new Label();
        lb10.setBounds(150,480,550,50);
        this.add(lb10);
        lb11=new Label();
        lb11.setBounds(150,500,650,30);
        this.add(lb11);
        lb12=new Label();
        lb12.setBounds(150,520,750,50);
        this.add(lb12);
        
        
        this.add(bn1);
        bn1.addActionListener(this);
        this.addWindowListener(this);
        
        
        
        
    }
 
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        dispose();
    }

  
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

      public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    public void windowActivated(WindowEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  //  @Override
    public void windowDeactivated(WindowEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String s=tf1.getText();
        String s1=tf2.getText();
        String s2=tf3.getText();
        String s3=tf4.getText();
        String s4=tf5.getText();
        String s5=tf6.getText();
        lb7.setText("YOUR NAAME IS="+s);
        lb8.setText("YOUR ROLL NUMBER IS = "+s1);
        lb9.setText("YOUR  Father's NAAME IS="+s2);
        lb8.setText("YOUR Mother's Name IS = "+s3);
        lb7.setText("YOUR ADDRESS IS="+s4);
        lb8.setText("YOUR SUBJECT IS = "+s5);
    }
    
}
class Test
{
    public static void main(String[] args) {
         new MyFrameOne();
    }
}
