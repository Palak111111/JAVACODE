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
	Label lb1,lb2,lb3,lb4,lb5;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	Button btn1;
	
	public MyFrame()
	{
		this.setVisible(true);
		this.setTitle("Calculator");
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
		tf2.setBounds(230,50,150,30);
		this.add(tf2);
		
		lb2=new Label("Enter Rate");
		lb2.setBounds(20,100,150,30);
		this.add(lb2);
		tf3=new TextField();
		tf3.setBounds(20,100,150,30);
		this.add(tf3);
		tf4=new TextField();
		tf4.setBounds(230,100,150,30);
		this.add(tf4);
		
		lb3=new Label("Enter Time");
		lb3.setBounds(20,150,150,30);
		this.add(lb3);
		tf5=new TextField();
		tf5.setBounds(20,150,150,30);
		this.add(tf5);
		tf6=new TextField();
		tf6.setBounds(230,150,150,30);
		this.add(tf6);
		
		lb4=new Label("Enter Time amount compounded");
		lb4.setBounds(20,200,200,30);
		this.add(lb4);
		tf7=new TextField();
		tf7.setBounds(20,200,150,30);
		this.add(tf7);
		tf8=new TextField();
		tf8.setBounds(230,200,150,30);
		this.add(tf8);
		
		btn1 = new Button("SUBMIT");
		btn1.setBounds(40,250,80,30);
		btn1.setBackground(Color.pink);
		this.add(btn1);
		
		lb5=new Label("Result");
		lb5.setBounds(40,300,180,50);
		this.add(lb5);
		
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
		try
		{
		double p = Double.parseDouble(tf2.getText());
		double r = Double.parseDouble(tf4.getText());
		double t = Double.parseDouble(tf6.getText());
		double n = Double.parseDouble(tf8.getText());
	    double pow = (double)(Math.pow(1+r/100,n));
	    double ci=p*(pow) - p;
		lb5.setText("Compound interest="+ci);
		}
		catch(Exception s)
		{
			lb5.setText("Enter the principal");
		}
		tf2.setText("");
		tf4.setText("");
		tf6.setText("");
		tf8.setText("");
	}
}
class Test
{
	public static void main(String args[])
	{
		new MyFrame();
	}
}