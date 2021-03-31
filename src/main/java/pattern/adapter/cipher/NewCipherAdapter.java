package pattern.adapter.cipher;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class NewCipherAdapter extends DataOperator{
    Cipher cipher = new NewCipher();
    @Override
    public String doEncrypt(int key, String ps) {
        this.password = ps;
        return cipher.doEncrypt(key, ps);
    }
}
