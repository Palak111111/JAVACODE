import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
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
        this.setBounds(400,150,600,400);
        this.setTitle("Calculator");
        //this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.addWindowListener(this);
        
        
        l1=new Label("Enter First Number : ");
        l1.setBounds(20,50,150,30);
        t1=new TextField();
        t1.setBounds(180,50,100,30);
        l2=new Label("Enter Second Number : ");
        l2.setBounds(20,90,150,30);
        t2=new TextField();
        t2.setBounds(180,90,100,30);
        
        add=new Button("Add");
        add.addActionListener(this);
        add.setBounds(20,170,50,40);
        add.setBackground(Color.YELLOW);
        add.setForeground(Color.BLUE);
        
        sub=new Button("Sub");
		sub.addActionListener(this);
        sub.setBounds(80,170,50,40);
        sub.setBackground(Color.yellow);
        sub.setForeground(Color.blue);

        mul=new Button("Mul");
		mul.addActionListener(this);
        mul.setBounds(140,170,50,40);
        mul.setBackground(Color.yellow);
        mul.setForeground(Color.blue);        
				
		div=new Button("Div");
		div.addActionListener(this);
        div.setBounds(20,220,50,40);
        div.setBackground(Color.yellow);
        div.setForeground(Color.blue);
		
		mod=new Button("Mod");
		mod.addActionListener(this);
        mod.setBounds(80,220,50,40);
        mod.setBackground(Color.yellow);
        mod.setForeground(Color.blue);
		
		clear=new Button("Clear");
		clear.addActionListener(this);
        clear.setBounds(140,220,50,40);
        clear.setBackground(Color.yellow);
        clear.setForeground(Color.blue);
        
        l3= new Label("Result : ");
        l3.setBounds(40,280,100,30);
        l4=new Label();
        l4.setBounds(160,280,100,30);
        
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(t1);
        this.add(t2);
        this.add(add);
		this.add(sub);
        this.add(mul);
		this.add(div);
        this.add(mod);
		this.add(clear);
        
        
    }

    
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double a=Double.parseDouble(t1.getText());
        double b=Double.parseDouble(t2.getText());
		double c;
        if(add==e.getSource())
        {
        	c=a+b;	
        	l4.setText(""+c);
        }
		else if(mul==e.getSource())
        {
        	c=a*b;	
        	l4.setText(""+c);
        }
		else if(sub==e.getSource())
        {
        	c=a-b;	
        	l4.setText(""+c);
        }
		else if(div==e.getSource())
        {
        	c=a/b;	
        	l4.setText(""+c);
        }
		else if(mod==e.getSource())
        {
        	c=b%a;	
        	l4.setText(""+c);
        }
		else if(clear==e.getSource())
        {
			t1.setText("");
			t2.setText("");
			l4.setText("");
        }
        
            }

    
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.dispose();
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
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
 class  Test
{
    public static void main(String[] args){
        new MyFrame();
    }
}
