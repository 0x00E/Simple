package simple.core;

import java.util.HashMap;
import java.util.Map;

import javax.swing.UIManager;

import simple.Skin;

public class SkinAdapter {
	
	private static Map<simple.Skin, String> map=new HashMap<simple.Skin, String>();
	
	static {
		map.put(simple.Skin.System, UIManager.getSystemLookAndFeelClassName());
		map.put(simple.Skin.Acryl, "com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		map.put(simple.Skin.Aero, "com.jtattoo.plaf.aero.AeroLookAndFeel");
		map.put(simple.Skin.Aluminium, "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		map.put(simple.Skin.Bernstein, "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		map.put(simple.Skin.Cross, UIManager.getCrossPlatformLookAndFeelClassName());
		map.put(simple.Skin.Default, null);
		map.put(simple.Skin.Fast, "com.jtattoo.plaf.fast.FastLookAndFeel");
		map.put(simple.Skin.HiFi, "com.jtattoo.plaf.hiFi.HiFiLookAndFeel");
		map.put(simple.Skin.Luna, "com.jtattoo.plaf.luna.LunaLookAndFeel");
		map.put(simple.Skin.McWin, "com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		map.put(simple.Skin.Mint, "com.jtattoo.plaf.mint.MintLookAndFeel");
		map.put(simple.Skin.Noire, "com.jtattoo.plaf.noire.NoireLookAndFeel");
		map.put(simple.Skin.Smart, "com.jtattoo.plaf.smart.SmartLookAndFeel");
	}

	public static String get(Skin skin) {
		return map.get(skin);
	}

}
