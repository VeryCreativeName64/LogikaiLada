package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.LadaModell;
import view.LadaView;

public class LadaController {
    public LadaController() {
        LadaModell ladaModel1 = new LadaModell("arany", false);
        LadaModell ladaModel2 = new LadaModell("ezüst", true);
        LadaModell ladaModel3 = new LadaModell("bronz", false);
        LadaView view = new LadaView();
        view.setVisible(true);
        
        JButton aranyGomb = view.getButtonArany();
        aranyGomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ladaModel1.isBennevan()){
                    view.setValasz("Gratulálunk, ebben a ládában van!");  
                } else {
                    view.setValasz("Nem ebben a ládában van!");
                }
            }
        });
        
        JButton ezustGomb = view.getButtonEzust();
        ezustGomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ladaModel2.isBennevan()){
                    view.setValasz("Gratulálunk, ebben a ládában van!");  
                } else {
                    view.setValasz("Nem ebben a ládában van!");
                }
            }
        });
        
        JButton bronzGomb = view.getButtonBronz();
        bronzGomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ladaModel3.isBennevan()){
                    view.setValasz("Gratulálunk, ebben a ládában van!");  
                } else {
                    view.setValasz("Nem ebben a ládában van!");
                }
            }
        });
    }
}
