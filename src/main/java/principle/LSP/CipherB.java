package principle.LSP;

/**
 * @Author stormbroken
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class CipherB implements Cipher{
    @Override
    public String encrypt(String plainText) {
        return plainText.concat(" " + this.getClass());
    }

    @Override
    public String decrypt(String text) {
        return text.substring(0, text.length() - this.getClass().toString().length() - 1);
    }
}
