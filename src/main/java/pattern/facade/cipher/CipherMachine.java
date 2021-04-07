package pattern.facade.cipher;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class CipherMachine {
    public String encrypt(String plainText){
        System.out.println("Encrypt");
        return plainText + "[Encrypt]";
    }
}
