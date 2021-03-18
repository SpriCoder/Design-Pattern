package pattern.prototype;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class EmailMain {
    public static void main(String[] args){
        Attachment attachment = new Attachment();
        attachment.setContent("I am Content");
        Email email = new Email();
        email.setAttachment(attachment);
        email.display();

        Email email2 = (Email) email.clone();
        System.out.println(email == email2);
        email2.display();
    }
}
