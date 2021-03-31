package pattern.adapter.cipher;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Caesar implements Cipher{
    @Override
    public String doEncrypt(int key, String ps){
        return this.getClass().toString() + "|" + key + "|" + ps;
    }
}
