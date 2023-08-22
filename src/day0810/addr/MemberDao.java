package day0810.addr;

import java.util.ArrayList;

public class MemberDao {
	private ArrayList<Member> list;
	
	public MemberDao() {
		list = new ArrayList<>();
	}
	
	public void insert(Member m) {
		list.add(m);
	}
	
	public void selectAll() {
		for(Member m : list) {
			System.out.println(m);
		}
	}
	
	public void delete(Member m) {
		list.remove(m);
	}
	
	public void update(Member m) {
		int idx = list.indexOf(m);
		if(idx < 0) {
			System.out.println("not found");
		}else {
			list.set(idx, m);
		}
	}
	
	public Member selectByNm(String name) {
		for(Member m : list) {
			if(m.getName().equals(name)) {
				return m;
			}
		}
		return null;
	}

	public ArrayList<Member> getList() {
		return list;
	}

	public void setList(ArrayList<Member> list) {
		this.list = list;
	}
	
	
	
}
