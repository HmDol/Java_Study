package day0808;

public class Service {
	private Dao dao;
	
	//의존성 주입
	public Service (Dao dao) {
		this.dao = dao;
	}
	
	//의존성 주입
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public void add() {
		System.out.println("추가기능");
		dao.insert();
	}
	public void get() {
		System.out.println("검색기능");
		dao.select();
	}
	public void edit() {
		System.out.println("수정기능");
		dao.update();
	}
	public void del() {
		System.out.println("삭제기능");
		dao.delete();
	}
}
