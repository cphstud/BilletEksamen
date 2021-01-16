import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        LocalTime lt = LocalTime.now().minusHours(5).minusMinutes(7);
        Billet billet = new Billet(6, 45);
        LocalTime lt1 = LocalTime.now().minusHours(5).minusMinutes(7);
        Billet billet1 = new Billet(6, 45);
        LocalTime lt2 = LocalTime.now().minusHours(3).minusMinutes(7);
        Billet billet2 = new Billet(1, 45);
        LocalTime lt3 = LocalTime.now().minusHours(2).minusMinutes(7);
        Billet billet3 = new Billet(2, 45);
        LocalTime lt4 = LocalTime.now().minusHours(1).minusMinutes(7);
        Billet billet4 = new Billet(6, 45);
	// write your code here
    }
}
