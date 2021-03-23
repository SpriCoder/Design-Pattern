package pattern.mediator.chatroom;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class DiamondMember extends Member{
    public DiamondMember(AbstractChatroom abstractChatroom, String name) {
        super(abstractChatroom, name);
    }

    @Override
    public void sendMessage(String to, String message) {
        System.out.println("尊贵的钻石用户" + this.name + "发送了信息！");
        abstractChatroom.sendMessage(this.getClass().toString() + this.name, to, message);
    }
}
