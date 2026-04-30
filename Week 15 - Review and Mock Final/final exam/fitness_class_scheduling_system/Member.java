import java.util.Objects;

public class Member {
    String name;
    String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Member m = (Member) o;
        return memberId.equals(m.memberId);
    }

    public int hashCode() {
        return Objects.hash(memberId);
    }
}
