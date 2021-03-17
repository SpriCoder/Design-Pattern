package pattern.prototype;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class Email implements Cloneable {
    private Attachment attachment;

    public Email(){
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    protected Object clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Not support cloneable");
            return null;
        }
        System.out.println("Clone Success!");
        return object;
    }

    public void display(){
        System.out.println(attachment.download());
    }

    public Attachment getAttachment(){
        return attachment;
    }
}
