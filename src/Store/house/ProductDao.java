package Store.house;

///배열에 저장, 검색, 삭제...
public class ProductDao {
	private Product[] prods;//선언
	private int cnt;//0. 배열에 추가한 데이터 개수
	
	public ProductDao() {
		//배열 생성 => 방이 50개 생성
		prods = new Product[50];
	}
	
	//insert(): 배열에 추가 메서드
	//파람으로 vo 한개를 받는다
	public boolean insert(Product p) {
		if(cnt>=prods.length) {
			System.out.println("배열 꽉참");
			return false; //추가실패
		}
		prods[cnt] = p;
		cnt++;
		return true;
	}
	
	public void delete (int idx) {
		
	}
}
