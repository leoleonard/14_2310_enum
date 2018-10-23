package one;

public enum Speed {

    SLOW(30), MEDIUM(50), FAST(150);

    private int kmh;

    Speed(int kmh) {
        this.kmh = kmh;
    }

    public int getKmh() {
        return kmh;
    }
}
