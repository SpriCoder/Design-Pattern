package pattern.intrinsic.string;

/**
 * @Author stormbroken
 * Create by 2021/04/06
 * @Version 1.0
 **/

public class test {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcd";
        String str3 = "ab" + "cd";
        String str4 = "ab";
        str4 += "cd";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}
