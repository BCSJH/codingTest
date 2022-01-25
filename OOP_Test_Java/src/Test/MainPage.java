package Test;

import java.util.Scanner;

import Test.vo.Race;

public class MainPage {
	//레벨
	//  몬스터가 죽을 때마다 레벨이 1 씩 상승한다.
	//HP (생명력)
	//  HP는 0 이 되면 죽는다.
	//MP (마나)
	//  스킬 사용시 필요 하다.
	//  MP는 스킬 사용시 필요한 마나보다 적거나 0 이 되면 스킬을 사용할 수 없다.
	//  각각의 스킬에는 MP가 소모되는데 소모되는 MP는 임의로 지정.
	//공격력
	//  공격 속도
	//방어력
	//  회피율 (%)
	//  해당되는 퍼센테이지 수치의 확률로 상대의 공격을 무시한다.
	
	// 플러스(+)
	// 몬스터를 잡으면 100 메소를 얻는다.
	// 무기는 1,300원이다.
	// 상점에는 무기와 Hp, Mp를 충전하는 물약을 판매한다.
	// Hp 물약은 100원, Mp 물약은 50원
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String name = mainMenu();
		Race race = setting(new Race(name, 1000));
		int subMenu = subMenu(); // 무기 구매 or 사냥
	}
	
	//처음 시작
	public static String mainMenu() {
		System.out.println("빅인사이트 게임에 오신 것을 환영합니다.\n"
				+ "게임에 시작에 앞서 종족을 선택해주세요.");
		
		String name = raceCoice() == 1 ? "휴먼" : raceCoice() == 2 ? "오크" : "엘프";
		System.out.println("\n당신이 선택한 종족은 " + name + "입니다.\n"
							+ "당신에게 주어지는 돈은 1,000원 입니다.\n");
		return name;
	}
	
	// 종족 선택
	public static int raceCoice() {
		System.out.print("1. 휴먼\n"
						+ "- Hp : 100\n"
						+ "- Mp : 100\n"
						+ "- Damage : 100\n"
						+ "- AttackSpeed : 100\n"
						+ "- DefensePercentage : 100\n"
						+ "- AvoidingRate : 100\n"
						+ "2. 오크\n"
						+ "- Hp : 150\n"
						+ "- Mp : 100\n"
						+ "- Damage : 150\n"
						+ "- AttackSpeed : 50\n"
						+ "- DefensePercentage : 150\n"
						+ "- AvoidingRate : 50\n"
						+ "3. 엘프\n"
						+ "- Hp : 50\n"
						+ "- Mp : 150\n"
						+ "- Damage : 150\n"
						+ "- AttackSpeed : 150\n"
						+ "- DefensePercentage : 50\n"
						+ "- AvoidingRate : 100\n"
						+ "입력 :");
		int race = sc.nextInt();
		sc.nextLine(); // 버퍼제거
		if(race < 1 || race > 3) { // 잘못된 숫자 입력
			System.out.println("잘못 선택했습니다.\n다시 선택해주세요.\n");
			return raceCoice();
		}else {
			return race;			
		}
	}
	
	//종족 선택에 따른 hp / mp / 공격력 차이 세팅 및 출력
	public static Race setting(Race race) {	
		switch(race.getName()) {
			case("오크") :
				race.setHp(150);
				race.setMp(100);
				race.setDamage(150);
				race.setAttackSpeed(50);
				race.setDefensePercentage(150);
				race.setAvoidingRate(50);
				break;
			case("휴먼"):
				race.setHp(100);
				race.setMp(100);
				race.setDamage(100);
				race.setAttackSpeed(100);
				race.setDefensePercentage(100);
				race.setAvoidingRate(100);
			case("엘프"):
				race.setHp(50);
				race.setMp(150);
				race.setDamage(150);
				race.setAttackSpeed(150);
				race.setDefensePercentage(50);
				race.setAvoidingRate(100);	
		}
		
		return race;
	}
	
	// 물건 구매 or 몬스터 사냥
	public static int subMenu() {
		System.out.print("어떤 행동을 취할 것인가요?\n"
						+ "1. 무기 구매\n"
						+ "2. 몬스터 사냥\n"
						+ "입력 : ");
		int sub = sc.nextInt();
		sc.nextLine(); // 버퍼제거
		if(sub < 1 || sub > 2) { // 잘못된 숫자 입력
			System.out.println("잘못 선택했습니다.\n다시 선택해주세요.\n");
			return subMenu();
		}else {
			return sub;			
		}
	}
}
