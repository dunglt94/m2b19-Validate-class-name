public class Main {
    public static final String[] validName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidName = new String[]{"C0_18G", "P0323A"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String account : validName) {
            boolean isValid = className.validate(account);
            System.out.println("Class name " + account + " is valid: " + isValid);
        }
        for (String account : invalidName) {
            boolean isValid = className.validate(account);
            System.out.println("Class name " + account + " is valid: " + isValid);
        }
    }
}
