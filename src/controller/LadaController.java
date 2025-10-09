package controller;

import javax.swing.JOptionPane;
import modell.LadaModell;
import view.LadaView;

public class LadaController {
    private LadaModell ladaModellArany;
    private LadaModell ladaModellEzust;
    private LadaModell ladaModellBronz;
    private LadaView nezet;

    public LadaController() {
        ladaModellArany = new LadaModell("arany", false);
        ladaModellEzust = new LadaModell("ezüst", true);
        ladaModellBronz = new LadaModell("bronz", false);
        nezet = new LadaView();
        nezet.getButtonArany().addActionListener(e -> valasztas(nezet, "Rossz válasz"));
        nezet.getButtonEzust().addActionListener(e -> valasztas(nezet, "Jó válasz"));
        nezet.getButtonBronz().addActionListener(e -> valasztas(nezet, "Rossz válasz"));
        nezet.setVisible(true);
    }

    private void valasztas(LadaView view, String message) {
        JOptionPane.showMessageDialog(view, message, "Eredmény", JOptionPane.INFORMATION_MESSAGE);
        view.setGombokEngedelyezve(false);
        int valasz = JOptionPane.showOptionDialog(
            view,
            "Szeretnél új játékot?",
            "Vége",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{"Új játék", "Kilépés"},
            "Új játék"
        );
        if (valasz == JOptionPane.YES_OPTION) {
            ujJatek();
        } else {
            view.dispose();
        }
    }

    private void ujJatek(){
        nezet.setGombokEngedelyezve(true);
        nezet.torolValasz();
    }
}
