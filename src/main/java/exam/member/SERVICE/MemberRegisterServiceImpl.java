package exam.member.SERVICE;

import java.util.Date;

import exam.member.Dao.MemberDao;
import exam.member.VO.MemberVo;
import exam.member.VO.RegisterRequest;

public class MemberRegisterServiceImpl implements MemberRegisterService {
	// MemberDao값으로 주입하기 위한 준비
	private MemberDao memberDao;
	
	// 매개변수가 있는 생성자 → 주입공간
	public MemberRegisterServiceImpl(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}
	
	@Override
	public void regist(RegisterRequest req) {
		MemberVo member = memberDao.selectByEmail(req.getEmail()); 
	
		// 요청한 Email 값을 member에 저장
		if(member != null) {
			System.out.println("이미 존재");
		}
		MemberVo newMember = new MemberVo(req.getEmail(), req.getPassword(), req.getName(), new Date());
		// email ~ 날짜 까지 VO에 저장 값을 가져와서 new Member로 저장
		
		memberDao.insert(newMember); // map 삽입
		
	}
	
}
