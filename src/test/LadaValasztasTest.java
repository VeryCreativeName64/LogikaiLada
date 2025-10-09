
package test;

import controller.LadaController;
import modell.LadaModell;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import modell.LadaModell;
import view.LadaView;


public class LadaValasztasTest {
    public static void main(String[] args) {
        testModellSzoveg();
        //testLadaVezerloMegfeleloVisszajelzes();
        testVezerloGyozelemVisszajelzes();
    }

    private static void testModellFelirat() {
        //by Timudzsin
        System.out.println("teszteset: minden ládán van felirat");
    
        LadaView testView = new LadaView();
        JButton g1 = testView.getButtonArany();
        JButton g2 = testView.getButtonEzust();
        JButton g3 = testView.getButtonBronz();
        
        assert g1.getText() != "" && g2.getText() != "" && g3.getText() != "": "Nincs minden ládán felirat.";
    }
    
    private static void testModellSzoveg() {
        //by Timudzsin
        System.out.println("teszteset: a feliratok szövegébe aranynál \"én rejtem\", ezüstnél \"nem én rejtem\", bronznál \"arany hazudik\" szövegrészek megtalálhatóak");
    
        LadaView testView = new LadaView();
        JButton g1 = testView.getButtonArany();
        JButton g2 = testView.getButtonEzust();
        JButton g3 = testView.getButtonBronz();
        
        boolean a = g1.getText().contains("én rejtem");
        boolean b = g2.getText().contains("nem én rejtem");
        boolean c = g3.getText().contains("arany hazudik");
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        assert a && b && c: "Nem megfelelőek a ládák szövegei.";
    }
    
    private static void testModellLada() {
        //by Timudzsin
        System.out.println("teszteset: van pontosan 3 láda, csak az egyikben van kincs");
        
        LadaView testView = new LadaView(); 
        
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
        LadaView view = new LadaView();
        view.setVisible(true);
        view.getButtonBronz().addActionListener(e -> view.setValasz("Gratulálunk, ebben a ládában van!"));
        view.getButtonArany().addActionListener(e -> view.setValasz("Nem ebben a ládában van!"));
        view.getButtonEzust().addActionListener(e -> view.setValasz("Nem ebben a ládában van!"));
        JButton bronz = view.getButtonBronz();
        bronz.doClick();
        assert "Gratulálunk, ebben a ládában van!".equals(view.getValaszlbl().getText()) : "Hibás nyerő üzenet.";
        view.torolValasz();
        JButton arany = view.getButtonArany();
        arany.doClick();
        assert "Nem ebben a ládában van!".equals(view.getValaszlbl().getText()) : "Hibás vesztes üzenet (arany).";
        view.torolValasz();
        JButton ezust = view.getButtonEzust();
        ezust.doClick();
        assert "Nem ebben a ládában van!".equals(view.getValaszlbl().getText()) : "Hibás vesztes üzenet (ezüst).";
    }
    
    private static void testVezerloLadaSzamSzovegFelcserelve() {
        //by Vince
        System.out.println("teszteset: ládára való hivatkozásnál mi történik, ha szöveget adunk meg a szám helyett (v fordítva)");
        assert false: "";
    }
}
