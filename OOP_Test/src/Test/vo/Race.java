package Test.vo;

public class Race extends Property{
	private String name; // 종족 이름
	private int weapon; // 무기 착용 여부
	private int money; // 가지고 있는 금액
	public Race(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Race [name=" + name + ", money=" + money + "]";
	}
}
