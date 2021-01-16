import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author thor
 */
public class Billet implements Comparable<Billet>{
    LocalTime issuetime;
    int duration;
    private static int id = 0;
    double prisPrTime;

    public Billet(int duration, double prisPrTime) {
        this.issuetime = LocalTime.now();
        this.duration = duration;
        id++;
        this.prisPrTime = prisPrTime;
    }
    public Billet(LocalTime lt, int duration, double prisPrTime) {
        this.issuetime = lt;
        this.duration = duration;
        id++;
        this.prisPrTime = prisPrTime;
    }

    public boolean erGyldig() {
        boolean gyldig = false;
        LocalTime now = LocalTime.now();
        LocalTime then = issuetime.plusHours(duration);
        //Duration notSpanPaidFor = Duration.between(now, then);
        if (then.isAfter(now)) {
            gyldig = false;
        }
        System.out.println("Too long: " );
        return gyldig;
    }

    public double getPris() {
        double pris = 0;
        pris = prisPrTime * duration;
        return pris;
    }
    @Override
    public String toString(){
        return "Billetnr: "+ id + ", udstedt kl "+ issuetime+ " varighed: "+ duration + " pris: "+ getPris();
    }


    @Override
    public int compareTo(Billet o) {
        return (int)(this.getPris()-o.getPris());
    }
}