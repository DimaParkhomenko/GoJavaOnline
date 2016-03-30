package module9;

public class EncryptCezar extends CezarCryptoMethods {
    private String output;
    private int k;

    public EncryptCezar(String text, int k) {
        this.k = k;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);

            if (findIndLower(c) == -1) {
                int y = (findIndUpper(c) + k) % n;
                output.append(upper[y]);
            }
            if (findIndUpper(c) == -1) {
                int y = (findIndLower(c) + k) % n;
                output.append(lower[y]);
            }
            if ((findIndUpper(c) == -1) && (findIndLower(c) == -1)) {
                output.append(c);
            }
        }
        this.output = output.toString();
    }

    public String getEncText() {
        return this.output;
    }

    public int getK() {
        return this.k;
    }

}
