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
class OddEvenMain extends Frame implements WindowListener,ActionListener
{
    Label l1,l3;
    TextField tf1;
    Button btn1;
    public OddEvenMain()
    {
        this.setVisible(true);
        this.setBounds(30, 50,800,500);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        Font f=new Font("",Font.BOLD,20);
        l1=new Label("Enter The first number ");
        l1.setBounds(20, 50, 260, 30);
        l1.setFont(f);
        this.add(l1);
       

        tf1=new TextField();
        tf1.setBounds(290, 50, 150,30);
        tf1.setFont(f);
        this.add(tf1);
		
        btn1=new Button(" Click");
        btn1.setBounds(20, 130, 80,30);
        btn1.setBackground(Color.PINK);
        btn1.setForeground(Color.BLACK);
        btn1.setFont(f);
        this.add(btn1);
		btn1.addActionListener(this);

        l3=new Label();
        l3.setBounds(10, 180,300,30);
        l3.setFont(f);
        this.add(l3);
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
        int a=Integer.parseInt(s);
       if(a%2==0)
		{
			l3.setText("Given number is Even Number : ");
		}else
		{
			l3.setText("Given number is Odd Number : ");
		}
		tf1.setText("");
 }

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
 class Test{
    public static void main(String[] args) { 
     new OddEvenMain();
      
    }
}