package dylan.moran.domain.member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
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
