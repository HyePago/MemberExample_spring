package exam.member.VO;

import java.util.Date;

public class MemberVo {
	// VO → 프로젝트에서 사용할 데이터 형식 선언 → DB라면 테이블에 들어갈 필드들
	// → DAO영역에서 사용 될 부분
	
	private Long id; // id값
	private String email; // email
	private String password; // 비밀번호
	private String name; // 이름
	private Date registerDate; // 등록 날짜
	
	// 매개 변수가 있는 생성자 → email, password, name, registerDate
	public MemberVo(String email, String password, String name, Date registerDate) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}
	
	// getter / setter 메서드 자동 추가
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	// 추가 기능 메서드 정의 → 새롭게 들어온 비번과 예전 비번 비교
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) {
			this.password = newPassword;
		} else {
			System.out.println("이전 비밀번호와 동일합니다.");
		}
	}
}
