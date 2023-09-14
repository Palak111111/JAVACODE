import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class FactAwt extends Frame implements ActionListener,WindowListener{

    Button b1;
    TextField t1;
    Label lb1, lb3;
    //Frame f;

     public FactAwt() 
     {
        Font f=new Font("serif",Font.PLAIN,20);
		Font f1=new Font("serif",Font.PLAIN,16);
		this.setLayout(null);
        this.setBounds(100,50,500,500);
        this.setVisible(true);
	    this.setBackground(Color.pink);
        this.setTitle("my fact");


        lb1 = new Label("Enter a Number :");
        lb1.setBounds(50, 50, 150, 30);
		lb1.setFont(f);
        this.add(lb1);

        t1 = new TextField();
        t1.setBounds(200, 50, 150, 30);
		t1.setFont(f);
        this.add(t1);

        lb3 = new Label("Result :");
        lb3.setBounds(90, 140, 150, 30);
		lb3.setFont(f1);
        this.add(lb3);

        b1 = new Button("Find ");
        b1.setBounds(90, 200, 100, 30);
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
        this.add(b1);
        
        b1.addActionListener(this);
        this.addWindowListener(this);

       
        
     }

    @Override
    public void actionPerformed(ActionEvent e) {

        int n = Integer.parseInt(t1.getText());
        int f = 1;
        if (e.getSource().equals(b1)) {

            for (int i = 1; i <= n; i++) {
                f = f * i;
            }

            lb3.setText(String.valueOf("Factorial is  :    " + f));
        }

    }

     @Override
    public void windowOpened(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        dispose();
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
class Test{
    public static void main(String[] args) {
        new FactAwt();
    }
}
