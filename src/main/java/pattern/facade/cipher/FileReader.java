package pattern.facade.cipher;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class FileReader {
    public String read(String fileNameSrc){
        System.out.println("FileReader");
        return fileNameSrc + "'s Content";
    }
}
