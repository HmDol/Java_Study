package addr;

//DAO.Member를 여러개 담을 수 잇는 배열 생성
//그 배열에 Member객체를 추가, 검색, 수정, 삭제.... 등의 작업 클래스

public class MemberDAO {
	private Member[] datas;
	private int cnt; // 추가되는 데이터 개수 카운팅
	
	public MemberDAO() {
		datas = new Member[30];
	}
	
	//배열추가 : 파라메타로 객체를 받아서 배열에 추가
	public boolean add(Member m) {// m은 service에서 추가할 사람의 이름, 전화, 주소를 입력받아 줌
		if(cnt >= datas.length) {
			return false;
		}
		datas[cnt++] = m;
		return true;
	}
	
	public int getByName(String name) {
		int idx = -1; // 없을 경우 반환
		for (int i=0; i < cnt; i++) {
			if(name.equals(datas[i].getName())) {
				idx = i;
			}
		}
		return idx;
	}
	
	public Member getByIdx(int idx) {//파람으로 방번호 받음
		return datas[idx]; // 그방에 있는 member 객체를 반환
	}
	
	public void getAll()	{
		for(int i=0; i<cnt; i++) {
			System.out.println(datas[i]);
		}
	}
	//삭제 : 삭제 할 데이터를 찾아서 앞으로 땡김, cnt --
	

}
