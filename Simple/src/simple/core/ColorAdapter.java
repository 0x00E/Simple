package simple.core;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ColorAdapter {
	
	private static Map<simple.Color, Color> map=new HashMap<simple.Color, Color>();
	
	static {
		map.put(simple.Color.Black, Color.BLACK);
		map.put(simple.Color.Blue, Color.BLUE);
		map.put(simple.Color.Cyan, Color.CYAN);
		map.put(simple.Color.DarkGray, Color.DARK_GRAY);
		map.put(simple.Color.Gray, Color.GRAY);
		map.put(simple.Color.Green, Color.GREEN);
		map.put(simple.Color.LightGray, Color.LIGHT_GRAY);
		map.put(simple.Color.Magenta, Color.MAGENTA);
		map.put(simple.Color.Orange, Color.ORANGE);
		map.put(simple.Color.Pink, Color.PINK);
		map.put(simple.Color.Red, Color.RED);
		map.put(simple.Color.White, Color.WHITE);
		map.put(simple.Color.Yellow, Color.YELLOW);
	}

	public static Color get(simple.Color color) {
		return map.get(color);
	}

}
