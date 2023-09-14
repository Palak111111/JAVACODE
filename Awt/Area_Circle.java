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
	Label lb1,lb2,lb3;
	TextField tf1,tf2;
	Button btn1,btn2;
	
	public MyFrame()
	{
		this.setVisible(true);
		this.setTitle("Frame");
		this.setBackground(Color.GRAY);
		this.setBounds(100,50,700,400);
		this.setLayout(null);
		
		lb1=new Label("Enter radius");
		lb1.setBounds(20,50,110,30);
		this.add(lb1);
		
		tf1=new TextField();
		tf1.setBounds(130,50,150,30);
		this.add(tf1);
		
		btn1 = new Button("Find Area");
		btn1.setBounds(30,100,120,40);
		btn1.setBackground(Color.orange);
		this.add(btn1);
		
		btn2 = new Button("Find Circumference");
		btn2.setBounds(170,100,120,40);
		btn2.setBackground(Color.orange);
		this.add(btn2);
		
		lb3=new Label("Result");
		lb3.setBounds(20,140,190,40);
		this.add(lb3);
		
		this.addWindowListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
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
		try
		{
		double r = Double.parseDouble(tf1.getText());
		if(e.getSource()==btn1)
		{
			double area=3.14*r*r;
			lb3.setText("Area = "+area);
		}
		else if(e.getSource()==btn2)
		{
			double cir=2*3.14*r;
			lb3.setText("circumference = "+cir);
		}
		}
		catch(Exception s)
		{
			lb3.setText("Enter the radius");
		}
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