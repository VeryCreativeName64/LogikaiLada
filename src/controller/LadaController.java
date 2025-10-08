package controller;

import modell.LadaModell;
import view.LadaView;

public class LadaController {
    public LadaController() {
        LadaModell ladaModel1 = new LadaModell("arany", false);
        LadaModell ladaModel2 = new LadaModell("ezüst", true);
        LadaModell ladaModel3 = new LadaModell("bronz", false);
        LadaView view = new LadaView();
    }
    
}
