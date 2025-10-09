
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
        testLadaVezerloMegfeleloVisszajelzes();
    }

    private static void testModellFelirat() {
        //by Timudzsin
        System.out.println("teszteset: minden ládán van felirat");
    
        assert false: "Nincs minden kádán felirat.";
    }
    
    private static void testModellSzoveg() {
        //by Timudzsin
        System.out.println("teszteset: a feliratok szövegébe aranynál \"én rejtem\", ezüstnél \"nem én rejtem\", bronznál \"arany hazudik\" szövegrészek megtalálhatóak");
    
        assert false: "Nem megfelelőek a ládák szövegei.";
    }
    
    private static void testModellLada() {
        //by Timudzsin
        System.out.println("teszteset: van pontosan 3 láda, csak az egyikben van kincs");
        
        assert false: "Nem pontosan 3 láda van, vagy nem csak az egyikben van kincs.";
    }
    
    private static void testLadaVezerloMegfeleloVisszajelzes() {
        //by Marek Bendegúz
        LadaController controller = new LadaController();
        LadaView view = new LadaView();
        
        
        view.getButtonBronz().doClick();
        
        String vart = "Gratulálunk, ebben a ládában van!";
        JLabel kapott = view.getValaszlbl();

        
        System.out.println("Teszt: bronz láda visszajelzése");
        System.out.println("Várt: " + vart);
        System.out.println("Kapott: " + kapott);
        assert vart.equals(kapott.toString()) : "Hiba! A visszajelzés nem megfelelő.";
    }
    
//    private String eredmeny(LadaModell modell){
//        String vissza = "Gratulálok, eltaláltad!";
//        vissza = modell.isBennevan() ? vissza : "Sajnos nem talált";
//        return vissza;
//    }
    
    
    private static void testVezerloGyozelemVisszajelzes() {
        //by Vince
        System.out.println("teszteset: a visszajelzés szövege megfelelő (Gratulálunk..., Sajnos  nem nyert...)");
    
        assert false: "";
    }
    
    private static void testVezerloLadaSzamSzovegFelcserelve() {
        //by Vince
        System.out.println("teszteset: ládára való hivatkozásnál mi történik, ha szöveget adunk meg a szám helyett (v fordítva)");
    
        assert false: "";
    }
}