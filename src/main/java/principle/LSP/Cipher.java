package principle.LSP;

/**
 * @Author stormbroken
 * Create by 2021/03/02
 * @Version 1.0
 **/

public interface Cipher {
    String encrypt(String plainText);
    String decrypt(String text);
}
