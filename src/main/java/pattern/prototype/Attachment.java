package pattern.prototype;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class Attachment {
    private String content;

    public void setContent(String content){
        this.content = content;
    }

    public String download(){
        return content;
    }
}
