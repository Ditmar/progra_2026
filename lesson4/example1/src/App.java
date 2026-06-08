import javax.swing.SwingUtilities;

import ui.modules.MainWindow;
import ui.utils.loader.AssetsLoader;

public class App {
    public static void main(String[] args) throws Exception {
        AssetsLoader loader = new AssetsLoader();
        loader.loaderFont();
        Runnable runable = () -> {
            MainWindow window = new MainWindow("ventana");
        };
        SwingUtilities.invokeLater(runable);
    }
}
