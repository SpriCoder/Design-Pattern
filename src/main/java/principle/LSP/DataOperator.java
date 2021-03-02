package principle.LSP;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author stormbroken
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class DataOperator {
    private List<Cipher> ciphers = new ArrayList<>();

    public void addCipher(Cipher cipher){
        this.ciphers.add(cipher);
    }

    public String encrypt(String plainText){
        String ans = plainText;
        for(Cipher cipher: ciphers){
            ans = cipher.encrypt(ans);
        }
        return ans;
    }

    public String decrypt(String text){
        String ans = text;
        for(int i = ciphers.size() - 1; i >= 0; i --){
            text = ciphers.get(i).decrypt(text);
        }
        return text;
    }
}
