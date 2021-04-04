package pattern.decorator.pass;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        String plainText = "plainText";
        Cipher cipher = new SimpleCipher();
        Cipher cipher1 = new ComplexCipher(cipher);
        Cipher cipher2 = new AdvancedCipher(cipher1);
        System.out.println(cipher2.encrypt(plainText));
    }
}
