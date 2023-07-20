public class Alphabet {

    // Setting up our alphabet, numbers, and symbols //
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "123456789";
    public static final String Symbols = "!@#$%^&*()-_=+\\/~?";


    private final StringBuilder pool;

    // Constructor //
    public Alphabet(boolean upperCasePresent, boolean lowerCasePresent, boolean numbersPresent, boolean symbolsPresent) {

        pool = new StringBuilder();

        if (upperCasePresent) pool.append(UPPERCASE_LETTERS);

        if (lowerCasePresent) pool.append(LOWERCASE_LETTERS);

        if (numbersPresent) pool.append(NUMBERS);

        if (symbolsPresent) pool.append(Symbols);
    }

    // Getter //
    public String getAlphabet() {
        return pool.toString();
    }
}
