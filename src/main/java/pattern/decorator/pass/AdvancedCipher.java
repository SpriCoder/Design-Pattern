package pattern.decorator.pass;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class AdvancedCipher extends CipherDecorator{
    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String plainText) {
        return super.encrypt(plainText) + "\nencrypt By AdvancedCipher";
    }
}
