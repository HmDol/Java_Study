package day0808;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service(new DaoImplMysql());
		service.add();
		service.get();
		service.edit();
		service.del();
	}

}
