package controller;

import modell.LadaModell;
import view.LadaView;

public class LadaController {
    private LadaModell modell;
    private LadaView nezet;
    
    public LadaController(LadaModell modell, LadaView nezet) {
        this.modell = modell;
        this.nezet = nezet;
        //nezet.setVisible(true);
    }
    
    public void feladat() {
        System.out.println("asd");
    }
    
}
