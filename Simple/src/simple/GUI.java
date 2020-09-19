package simple;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import simple.core.SkinAdapter;
import simple.exception.LoadSkinException;

public class GUI {
	
	private static boolean loadSkinFrist;

	public static boolean isLoadSkinFirst() {
		return loadSkinFrist;
	}

	public static void loadSkin(Skin skin) throws LoadSkinException{
		try {
			UIManager.setLookAndFeel(SkinAdapter.get(skin));
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
	}

}
