package ui.utils.loader;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.File;

import ui.utils.loader.providers.Fonts;

public class AssetsLoader implements Fonts {
    @Override
    public void loaderFont() {
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("/Users/ditmar/progra2.2026/lesson4/example1/resources/fonts/PlaywriteGBJ-Italic-VariableFont_wght.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("/Users/ditmar/progra2.2026/lesson4/example1/resources/fonts/BlackOpsOne-Regular.ttf")));
        } catch (IOException |  FontFormatException e) {
            System.out.println(e.getMessage());
        }
        
    }

}
