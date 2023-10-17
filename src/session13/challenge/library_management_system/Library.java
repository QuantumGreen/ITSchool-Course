package session13.challenge.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Library extends BookManager{
    private List<Member> memberList;

    public Library() {
        this.memberList = new ArrayList<>();
    }

    public void addMember(Member member){
        memberList.add(member);
    }
    public boolean removeMember(Member member){
        return memberList.remove(member);
    }
}
