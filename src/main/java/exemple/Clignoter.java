package exemple;

import bandeau.Bandeau;

public class Clignoter extends Effet{

    public Clignoter(int duration, String texte, int répétitions) {
        super(duration, texte, répétitions);
    }

    @Override
    public void executer(Bandeau a) {
        a.sleep(this.duration/2);
        a.setMessage("");
        a.sleep(this.duration/2);
        a.setMessage(texte);
    }


}
