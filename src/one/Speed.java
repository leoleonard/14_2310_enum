package one;

public enum Speed {

    SLOW("Powoli", 30), MEDIUM("Normalnie", 50), FAST("Szybko", 150);

    private int kmh;
    private String translation;

    Speed(String translation, int kmh) {
        this.translation = translation;
        this.kmh = kmh;
    }

    public int getKmh() {
        return kmh;
    }

    public String getTranslation() {
        return translation;
    }


}
