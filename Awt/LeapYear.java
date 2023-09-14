import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class MyFrame extends Frame implements WindowListener,ActionListener
{
	Label lb1,lb2;
	TextField tf1;
	Button btn1;
	Font f1;
	public MyFrame()
	{
		this.setVisible(true);
		this.setTitle("Frame");
		this.setBackground(Color.blue);
		this.setBounds(100,50,700,400);
		this.setLayout(null);
		
		lb1=new Label("Enter a year");
		lb1.setBounds(20,50,100,30);
		this.add(lb1);
		
		tf1=new TextField();
		tf1.setBounds(120,50,150,30);
		this.add(tf1);
		
		
		
		btn1 = new Button("SUBMIT");
		btn1.setBounds(40,120,80,30);
		btn1.setBackground(Color.white);
		this.add(btn1);
		
		
		lb2=new Label("Result");
		lb2.setBounds(20,160,190,50);
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
		int year = Integer.parseInt(tf1.getText());
        if((year%4==0)&&(year%100!=0||year%400==0))
		lb2.setText("Year is leap year " );
		else
		lb2.setText("Year is not leap year " );
		tf1.setText("");
	}
}
class Test
{
	public static void main(String args[])
	{
		new MyFrame();
	}
}