
package test;

import controller.LadaController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import view.LadaView;


public class LadaValasztasTest {
    public static void main(String[] args) {
        testLadaVezerloMegfeleloVisszajelzes();
    }

    private static void testModellMindenLadanVanFelirat() {
        //by Timudzsin
        
    }
    
    private static void testLadaVezerloMegfeleloVisszajelzes() {
        //by Marek Bendegúz
        LadaController controller = new LadaController();
        LadaView view = new LadaView();
        
        JButton bronzGomb = view.getButtonBronz();
        for (ActionListener al : bronzGomb.getActionListeners()) {
            al.actionPerformed(new ActionEvent(bronzGomb, ActionEvent.ACTION_PERFORMED, ""));
        }
        
        
        String vart = "Gratulálunk, ebben a ládában van!";
        JLabel kapott = view.getValaszlbl();

        
        System.out.println("Teszt: bronz láda visszajelzése");
        System.out.println("Várt: " + vart);
        System.out.println("Kapott: " + kapott);
        assert vart.equals(kapott.toString()) : "Hiba! A visszajelzés nem megfelelő.";
    }
}
