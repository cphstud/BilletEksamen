import java.time.LocalTime;
import java.util.ArrayList;

public class BilletSystem {

        ArrayList<Billet> billetter;

        public BilletSystem() {
            billetter = new ArrayList<>();
        }

        public void opretBillet(int duration, double timepris) {
            if (duration > 24) {
                throw new IllegalArgumentException("Not more than 24 Hrs");
            }
            Billet tmpBillet = new Billet(duration, timepris);
            billetter.add(tmpBillet);
        }

        public ArrayList<Billet> getBilletter() {
            return billetter;
        }
    }
