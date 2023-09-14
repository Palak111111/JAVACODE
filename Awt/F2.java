
//package Fram1;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Color;

class Fram1 extends Frame implements WindowListener {
    public Fram1(){
        this.setVisible(true);
        this.setTitle("MY Frame");
		this.setBackground(Color.gray);
		this.setBounds(100,50,700,400);
		this.addWindowListener(this);
    }

    private void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    //@Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
		}

    //@Override
    public void windowClosing(WindowEvent e) {
			//System.exit(0);
			this.dispose();
        //throw new UnsupportedOperationException("Not supported yet."); 
    }

    //@Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
		}

    //@Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    //@Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    //@Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    //@Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
class Test{
	public static void main(String args[])
	{
		new Fram1();
	}
}
