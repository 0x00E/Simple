package simple.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JTextField;
import simple.Control;

public class Text implements Control {
	private JTextField text;
	private int width;
	private int height;

	public static Text create(String text, int width, int height) {
		JTextField text1 = new JTextField(text);
		return new Text(text1, width, height);
	}

	public Text(JTextField text, int width, int height) {
		this.text = text;
		text.setSize(this.width = width, this.height = height);
	}

	public void setText(String text) {
		this.text.setText(text);
	}

	public void setFormat(Format format) {
		if (format == Format.Integer) {
			this.text.addKeyListener(new KeyListener() {
				public void keyTyped(KeyEvent e) {
					if ((e.getKeyCode() >= 37) && (e.getKeyCode() <= 40)) {
						return;
					}
					Text.this.text.setText(Text.this.text.getText().replaceAll("\\D", ""));
				}

				public void keyReleased(KeyEvent e) {
					keyTyped(e);
				}

				public void keyPressed(KeyEvent e) {
					keyTyped(e);
				}
			});
		} else if (format == Format.String) {
			this.text.removeKeyListener(this.text.getKeyListeners()[0]);
		}
	}

	public JComponent get() {
		return this.text;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public String getString() {
		return this.text.getText();
	}

	public int getInteger() {
		try {
			return Integer.parseInt(this.text.getText());
		} catch (NumberFormatException e) {
		}
		return 0;
	}

	public double getDouble() {
		try {
			return Double.parseDouble(this.text.getText());
		} catch (NumberFormatException e) {
		}
		return 0.0D;
	}

	public static enum Format {
		String, Integer;
	}
}
