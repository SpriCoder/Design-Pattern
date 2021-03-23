package pattern.mediator.chatroom;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        AbstractChatroom abstractChatroom = new ChatGroup();
        Member member1 = new CommonMember(abstractChatroom, "Common");
        Member member2 = new DiamondMember(abstractChatroom, "Diamond");
        abstractChatroom.register(member1);
        abstractChatroom.register(member2);
        member1.sendMessage("Diamond", "第一个消息");
        member2.sendMessage("Common", "第二个消息");
    }
}
