package monsville;
import java.awt.Dimension;  
import javax.swing.JFrame;

/**
 *
 * @author Samuel
 */
public class SplashScreen extends JFrame {
 
       public SplashScreen(){  
        super("SplashScreen");  
        initComponents();  
    }

    private void initComponents() {
        setPreferredSize(new Dimension(400, 200));  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        pack();  
        setVisible(true); 
    }
}
