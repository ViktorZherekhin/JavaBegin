public class Nalog {
    double dohod;
    String systemaNalooblozheniya;

    public double calcNalog(double dohod, String systemaNalooblozheniya) {
        if (systemaNalooblozheniya == "USN") {
            return dohod * 0.15;
        } else if (systemaNalooblozheniya == "OSN") {
            return dohod * 0.20;
        } else {
            return 0;
        }

    }
}
