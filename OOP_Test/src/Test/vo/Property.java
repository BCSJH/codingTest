package Test.vo;

public class Property {
	
	private int level; // 레벨
	private int hp; // 체력
	private int mp; // 마나
	private int damage; // 공격력
	private int attackSpeed; // 공격 속도
	private int defensePercentage; // 방어률
	private int avoidingRate; // 회피율
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getAttackSpeed() {
		return attackSpeed;
	}
	public void setAttackSpeed(int attackSpeed) {
		attackSpeed = attackSpeed;
	}
	public int getDefensePercentage() {
		return defensePercentage;
	}
	public void setDefensePercentage(int defensePercentage) {
		defensePercentage = defensePercentage;
	}
	public int getAvoidingRate() {
		return avoidingRate;
	}
	public void setAvoidingRate(int avoidingRate) {
		avoidingRate = avoidingRate;
	}
	@Override
	public String toString() {
		return "Property [level=" + level + ", hp=" + hp + ", mp=" + mp + ", damage=" + damage + ", AttackSpeed="
				+ attackSpeed + ", DefensePercentage=" + defensePercentage + ", AvoidingRate=" + avoidingRate + "]";
	}
	
	
}
