package pattern.adapter.cipher;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        DataOperator dataOperator1 = new CipherAdapter();
        System.out.println(dataOperator1.doEncrypt(1, "password"));
        DataOperator dataOperator2 = new NewCipherAdapter();
        System.out.println(dataOperator2.doEncrypt(2, "password"));
    }
}
