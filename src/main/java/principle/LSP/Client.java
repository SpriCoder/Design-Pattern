package principle.LSP;

/**
 * @Author stormbroken
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        DataOperator dataOperator = new DataOperator();
        dataOperator.addCipher(new CipherA());
        dataOperator.addCipher(new CipherB());
        String plainText = "plainText";
        String text = dataOperator.encrypt(plainText);
        String newPlainText = dataOperator.decrypt(text);
        assert newPlainText == plainText;
    }
}
