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
class MyFrame3 extends Frame implements WindowListener,ActionListener
{
    Label l1,l2;
    TextField tf1;
    Button btn1;
    public MyFrame3()
    {
        this.setVisible(true);
        this.setBounds(30, 50,800,500);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        Font f=new Font("",Font.BOLD,16);
        l1=new Label("Enter The Age :");
        l1.setBounds(20, 50, 150, 30);
        l1.setFont(f);
        this.add(l1);
         tf1=new TextField();
         tf1.setBounds(180, 50, 150,30);
         tf1.setFont(f);
         this.add(tf1);
         btn1=new Button("Cheak Age");
         btn1.setBounds(20, 90, 150,30);
         btn1.setBackground(Color.MAGENTA);
         btn1.setForeground(Color.BLACK);
         btn1.setFont(f);
         this.add(btn1);
         l2=new Label();
         l2.setBounds(200, 90,200,30);
         l2.setFont(f);
         this.add(l2);
         btn1.addActionListener(this);
         this.addWindowListener(this);
    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

 
    @Override
    public void actionPerformed(ActionEvent e) {
        String s=tf1.getText();
        int age=Integer.parseInt(s);
       if(age<=0)
       {
            l2.setText("< Invalid Age > ");
            tf1.setText("");
       }
	  else if(age<=12)
      {
            l2.setText("< child age >");
            tf1.setText("");
     }
     else if(age<=19)
     {
            l2.setText("< teen age >");
            tf1.setText("");
     }
     else if(age<=59)
     {
            l2.setText("< young age >");
            tf1.setText("");
     }
     else
     {
           l2.setText("<  old age >");
            tf1.setText("");
   
     }

        
       
    }

    
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public void windowIconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public void windowDeiconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public void windowActivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void windowDeactivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
public class CheakAge{
    public static void main(String[] args) { 
     MyFrame3 ob1=new MyFrame3();       
    }
}
