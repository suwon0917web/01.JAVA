package statement;

import java.util.Scanner;

/**
 * if switch 자유롭게 학년과 점수를 입력받아서 4학년은 70점이상이면 합격 5학년은 80점 이상이면 합격 6학년은 90점 이상이면
 * 합격 그리고.. 위의 조건을 벗어난 입력이면 잘못입력했습니다. 출력
 * 
 *
 */
public class Main11 {

	public static void main(String[] args) {
		System.out.println("학년과 점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		int jumsu = sc.nextInt();
		if (!(grade >= 4 && grade <= 6 && jumsu >= 0 && jumsu <= 100)) {
			System.out.println("잘못 입력했습니다.");
			
		} else {
			switch (grade) {
			case 4:
				System.out.println((jumsu >= 70) ? "합격" : "불합격");
				break;
			case 5:
				System.out.println((jumsu >= 80) ? "합격" : "불합격");
				break;
			case 6:
				System.out.println((jumsu >= 90) ? "합격" : "불합격");
				break;
			default:

				break;
			}
		}
	}

}
