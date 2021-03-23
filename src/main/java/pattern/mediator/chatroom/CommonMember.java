package pattern.mediator.chatroom;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class CommonMember extends Member{
    public CommonMember(AbstractChatroom abstractChatroom, String name) {
        super(abstractChatroom, name);
    }

    @Override
    public void sendMessage(String to, String message) {
        abstractChatroom.sendMessage(this.getClass().toString() + this.name, to, message);
    }
}
