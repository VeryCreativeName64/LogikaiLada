
package test;

import controller.LadaController;
import modell.LadaModell;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import view.LadaView;


public class LadaValasztasTest {
    public static void main(String[] args) {
        testModell3Lada1Kincs();
        testModellNemLetezoLada();
        testLadaVezerloMegfeleloVisszajelzes();
    }

    private static void testModell3Lada1Kincs() {
        LadaModell[] ladak = new LadaModell[]{
            new LadaModell("arany", false),
            new LadaModell("ezüst", false),
            new LadaModell("bronz", true)
        };

        System.out.println("Teszt: pontosan 3 láda és egy kincs");
        assert ladak.length == 3 : "Hiba! Nincs pontosan 3 láda.";

        int kincsDb = 0;
        for (LadaModell lada : ladak) {
            if (lada.isBennevan()) {
                kincsDb++;
            }
        }
        assert kincsDb == 1 : "Hiba! Nem pontosan egy ládában van a kincs.";
    }

    private static void testModellNemLetezoLada() {
        LadaModell[] ladak = new LadaModell[]{
            new LadaModell("arany", false),
            new LadaModell("ezüst", false),
            new LadaModell("bronz", true)
        };
        System.out.println("Teszt: nem létező ládára hivatkozás kezelése");
        boolean kivetelTortent = false;
        try {
            LadaModell nemLetezo = ladak[3]; // index: 0..2 létezik, 3 nem
            System.out.println(nemLetezo);
        } catch (ArrayIndexOutOfBoundsException ex) {
            kivetelTortent = true;
        }
        assert kivetelTortent : "Hiba! Nem kezeltük a nem létező ládára hivatkozást (kivétel várt).";
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
