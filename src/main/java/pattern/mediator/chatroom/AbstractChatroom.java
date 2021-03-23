package pattern.mediator.chatroom;

import java.util.Hashtable;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public abstract class AbstractChatroom {
    protected Hashtable<String, Member> memberHashtable = new Hashtable<>();
    public void register(Member member){
        memberHashtable.put(member.getName(), member);
    }
    public abstract void sendMessage(String from, String to, String message);
}
