package pattern.mediator.chatroom;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public abstract class Member {
    protected AbstractChatroom abstractChatroom;
    protected String name;
    public Member(AbstractChatroom abstractChatroom, String name){
        this.abstractChatroom = abstractChatroom;
        this.name = name;
    }
    public void receiveMessage(String from, String message){
        System.out.println("Receive Message from " + from + " with message " + message);
    }

    public AbstractChatroom getAbstractChatroom() {
        return abstractChatroom;
    }

    public void setAbstractChatroom(AbstractChatroom abstractChatroom) {
        this.abstractChatroom = abstractChatroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sendMessage(String to, String message);
}
