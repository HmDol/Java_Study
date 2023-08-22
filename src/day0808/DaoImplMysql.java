package day0808;

public class DaoImplMysql implements Dao {

	@Override
	public void insert() {
		System.out.println("Mysql insert");
	}

	@Override
	public void select() {
		System.out.println("Mysql select");
	}

	@Override
	public void delete() {
		System.out.println("Mysql delete");
	}

	@Override
	public void update() {
		System.out.println("Mysql update");
	}

}
