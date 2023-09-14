import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class MyFrame extends Frame implements WindowListener,ActionListener
{
	Label lb1,lb2;
	TextField tf1,tf2;
	Button btn1;
	
	public MyFrame()
	{
		this.setVisible(true);
		this.setTitle("Square");
		this.setBackground(Color.green);
		this.setBounds(100,50,700,400);
		this.setLayout(null);
		
		lb1=new Label("Enter a Number");
		lb1.setBounds(20,50,150,30);
		this.add(lb1);
		tf1=new TextField();
		tf1.setBounds(20,50,150,30);
		this.add(tf1);
		tf2=new TextField();
		tf2.setBounds(170,50,150,30);
		this.add(tf2);
		
		
		
		btn1 = new Button("Square");
		btn1.setBounds(40,120,80,30);
		btn1.setBackground(Color.white);
		this.add(btn1);
		
		
		lb2=new Label("Result");
		lb2.setBounds(20,160,180,50);
		this.add(lb2);
		
		this.add(btn1);
		
		this.addWindowListener(this);
		btn1.addActionListener(this);
		
	}
	 @Override
    public void windowOpened(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e)
	{	 
		 //throw new UnsupportedOperationException("Not supported yet."); 
		 System.exit(0);
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowIconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowActivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }
	public void actionPerformed (ActionEvent e)
	{
		int n = Integer.parseInt(tf2.getText());
		int sq=1;
		sq=n*n;
		
		lb2.setText("Square = "+sq);
		tf2.setText("");
	}
}
class Test
{
	public static void main(String args[])
	{
		new MyFrame();
	}
}