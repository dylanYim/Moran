package dylan.moran.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {

    private Long id;
    private String eMail;
    private String password;
    private String phoneNumber;
    private String memberName;

    public Member(String eMail, String password, String phoneNumber, String memberName) {
        this.eMail = eMail;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.memberName = memberName;
    }
}
