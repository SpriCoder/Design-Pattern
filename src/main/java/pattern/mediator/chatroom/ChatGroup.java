package pattern.mediator.chatroom;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class ChatGroup extends AbstractChatroom{
    @Override
    public void sendMessage(String from, String to, String message) {
        Member member = memberHashtable.get(to);
        if(member == null){
            System.out.println("没有找到该用户");
        }else{
            member.receiveMessage(from, message);
        }
    }
}
