package simple.control;

import java.awt.Container;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import simple.Color;
import simple.Control;
import simple.GUI;
import simple.Skin;
import simple.core.ColorAdapter;
import simple.exception.LoadSkinException;

public class Window {
	private java.awt.Window window;
	private MessageBox msgbox = new MessageBox(this);

	static {
		try {
			if (!GUI.isLoadSkinFirst()) {
				GUI.loadSkin(Skin.System);
			}
		} catch (LoadSkinException e) {
			e.printStackTrace();
		}
	}

	public static Window create(boolean dialog, boolean buttom, boolean display, String title, Integer width,
			Integer height, boolean canResize, Color color) {
		JFrame window = new JFrame();
		window.setIconImage(new ImageIcon("images/logo.png").getImage());
		if (!buttom) {
			window.setType(Type.UTILITY);
		}
		window.setSize(width.intValue(), height.intValue());
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(3);
		window.setTitle(title);
		window.setResizable(canResize);
		Container panel = window.getContentPane();
		panel.setBackground(ColorAdapter.get(color));
		window.setLayout(null);
		window.setVisible(display);
		window.requestFocus();
		return new Window(window);
	}

	public Window(java.awt.Window window) {
		this.window = window;
	}

	public void add(Control button, Integer x, Integer y) {
		JComponent btn = button.get();
		this.window.add(btn);
		btn.setBounds(x.intValue(), y.intValue(), button.getWidth(), button.getHeight());
	}

	public java.awt.Window get() {
		return this.window;
	}

	public MessageBox getMessageBox() {
		return this.msgbox;
	}

	public void setIcon(String path) {
		this.window.setIconImage(new ImageIcon(path).getImage());
	}

	public void show(Window window) {
		((JDialog) window.get()).setLocationRelativeTo(get());
		window.get().setVisible(true);
	}

	public static Window dialog(boolean dialog, boolean buttom, boolean display, String title, Integer width,
			Integer height, boolean canResize, Color color) {
		JDialog window = new JDialog();
		window.setModal(true);
		window.setIconImage(new ImageIcon("images/logo.png").getImage());
		if (!buttom) {
			window.setType(Type.UTILITY);
		}
		window.setSize(width.intValue(), height.intValue());
		window.setLocationRelativeTo(null);
		window.setTitle(title);
		window.setResizable(canResize);
		Container panel = window.getContentPane();
		panel.setBackground(ColorAdapter.get(color));
		window.setLayout(null);
		window.setVisible(display);
		window.requestFocus();
		return new Window(window);
	}
}
