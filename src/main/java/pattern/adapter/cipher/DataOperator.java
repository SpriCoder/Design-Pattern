package pattern.adapter.cipher;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public abstract class DataOperator {
    protected String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String doEncrypt(int key, String ps);
}
