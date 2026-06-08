import javax.swing.SwingUtilities;

import infrastructure.config.ResourceLoader;
import presentation.login.LoginWindow;

public class App {
    public static void main(String[] args) throws Exception {
        ResourceLoader.loadFonts();
        Runnable runable = () -> {
            LoginWindow window = new LoginWindow("Login Window");
        };
        SwingUtilities.invokeLater(runable);
    }
}
