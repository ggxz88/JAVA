package chap11.sec01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {	//매개값이 Member인지 확인
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
