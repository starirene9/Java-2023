package day05.member;

// 역할: 1명의 회원정보를 묶어주는 역할
public class Member {

    int memberId;
    String email;
    String password;
    String memberName;
    Gender gender;   //alt+enter : 열거형 생성
    int age;

    public Member(int memberId, String email, String password, String memberName, Gender gender, int age) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
    }

    // 회원정보를 문자열로 만들어서 리턴하는 기능
    String inform() {
        String convertGender = (gender == Gender.MALE) ? "남성" : "여성";

        return String.format("# %d번 | %s | %s | %s | %d세"
                        , this.memberId, this.email, this.memberName
                        , convertGender, this.age
        ); //this 생략해도 되지만 붙이는것 습관화 시킬 것~!
    }
}
