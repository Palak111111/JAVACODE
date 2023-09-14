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
	Label lb1,lb2,lb3,lb4;
	TextField tf1,tf2,tf3,tf4,tf5,tf6;
	Button btn1;
	
	public MyFrame()
	{
		this.setVisible(true);
		this.setTitle("Simple Intrest");
		this.setBackground(Color.GRAY);
		this.setBounds(100,50,700,400);
		this.setLayout(null);
		
		lb1=new Label("Enter Principal");
		lb1.setBounds(20,50,150,30);
		this.add(lb1);
		tf1=new TextField();
		tf1.setBounds(20,50,150,30);
		this.add(tf1);
		tf2=new TextField();
		tf2.setBounds(170,50,150,30);
		this.add(tf2);
		
		lb2=new Label("Enter Rate");
		lb2.setBounds(20,100,150,30);
		this.add(lb2);
		tf3=new TextField();
		tf3.setBounds(20,100,150,30);
		this.add(tf3);
		tf4=new TextField();
		tf4.setBounds(170,100,150,30);
		this.add(tf4);
		
		lb3=new Label("Enter Time");
		lb3.setBounds(20,150,150,30);
		this.add(lb3);
		tf5=new TextField();
		tf5.setBounds(20,150,150,30);
		this.add(tf5);
		tf6=new TextField();
		tf6.setBounds(170,150,150,30);
		this.add(tf6);
		
		btn1 = new Button("SUBMIT");
		btn1.setBounds(40,200,80,30);
		btn1.setBackground(Color.pink);
		this.add(btn1);
		
		
		
		lb4=new Label("Result");
		lb4.setBounds(20,250,180,50);
		this.add(lb4);
		
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
	public void actionPerformed(ActionEvent e)
	{
		int p = Integer.parseInt(tf2.getText());
		int r = Integer.parseInt(tf4.getText());
		int t = Integer.parseInt(tf6.getText());
		int si=p*r*t/100;
		lb4.setText("Simple Interest= " +si);
		tf2.setText("");
		tf4.setText("");
		tf6.setText("");
	}
}
class Test
{
	public static void main(String args[])
	{
		new MyFrame();
	}
}