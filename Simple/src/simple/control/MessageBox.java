package simple.control;

import javax.swing.JOptionPane;

public class MessageBox{
	
	private Window window;
	
	public MessageBox(Window window) {
		this.window=window;
	}

	public void normal(Object text){
		JOptionPane.showMessageDialog(window.get(), text);
	}
	
	public void error(Object text){
		JOptionPane.showMessageDialog(window.get(), text,"错误",JOptionPane.ERROR_MESSAGE);
	}

}
