import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class MyFrame extends Frame implements ActionListener,WindowListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2;
    Button add,mul,sub,div,mod,clear;
    public MyFrame()
    {
        this.setVisible(true);
        this.setBounds(200,200,600,400);
        this.setTitle("Calculator");
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.addWindowListener(this);
        add.addActionListener(this);
        
        l1=new Label("Enter First Number : ");
        l1.setBounds(20,50,100,30);
        t1=new TextField();
        t1.setBounds(130,50,100,30);
        l2=new Label("Enetr Second Number : ");
        l2.setBounds(20,90,100,30);
        t2=new TextField();
        t2.setBounds(130,90,100,30);
        
        add=new Button("Add");
        add.setBounds(20,170,50,40);
        add.setBackground(Color.yellow);
        add.setForeground(Color.blue);
        
////        mul=new Button("Mul");
////        mul.setBounds(80,170,50,40);
////        mul.setBackground(Color.yellow);
////        mul.setForeground(Color.blue);
////        
//        sub=new Button("Sub");
//        sub.setBounds(140,170,50,40);
//        sub.setBackground(Color.yellow);
//        sub.setForeground(Color.blue);
//        
        l3= new Label("Result : ");
        l3.setBounds(40,230,100,30);
        l4=new Label();
        l3.setBounds(160,230,100,30);
        
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(t1);
        this.add(t2);
        this.add(add);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a+b;
        l4.setText("Add = "+c);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

public class  psvm
{
    public static void main(String[] args)throws NullPointerException {
        new MyFrame();
    }
}
