package laskin;

public class Laskin {

    private double tulos;

    public void nollaa() {
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(double n) {
        tulos = tulos + n;
    }

    public void vahenna(double n) {
        tulos = tulos - n;
    }

    public void kerro(double n) {
        tulos = tulos * n;
    }

    public void jaa(double n) {
        if (n == 0) {
            throw new ArithmeticException("Nollalla ei voi jakaa");
        } else {
            tulos = tulos / n;
        }
    }

    public void nelio(double n) {
        tulos = n * n;
    }

    public void neliojuuri(double n) {
        if (n < 0) {
            throw new ArithmeticException("Negatiiviselle luvulle ei voi laskea neliöjuurta");
        } else {
            tulos = Math.sqrt(n);
        }
    }

    public void virtaON() {
        tulos = 0;
        System.out.println("Virta päällä");
    }

    public void virtaOFF() {
        tulos = 0;
        System.out.println("Virta pois päältä");
    }
}
