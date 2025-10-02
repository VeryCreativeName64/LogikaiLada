package modell;


public class LadaModell {
    private String anyag;
    private boolean bennevan;

    public LadaModell(String anyag, boolean bennevan) {
        this.anyag = anyag;
        if(!"arany".equals(anyag)||!"ezüst".equals(anyag)||!"bronz".equals(anyag)){
            throw new IllegalArgumentException("Csak arany, ezüst, vagy bronz lehet!");
        }
        this.bennevan = bennevan;
    }

    public String getAnyag() {
        return anyag;
    }

    public boolean isBennevan() {
        return bennevan;
    }
    
    

    

    
    
}
