package pattern.decorator.pass;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class SimpleCipher extends Cipher{
    @Override
    public String encrypt(String plainText) {
        return plainText + "\nencrypt By SimpleCipher";
    }
}
