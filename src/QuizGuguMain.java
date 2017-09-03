import java.util.Scanner;
/*
 * 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
 * 예를 들어 사용자가 8을 입력하면 팔팔단(2 * 1~ 2*8, 3*1~3*8 / 8 * 8 , 19를 입력하면 십구십구단(2 \* 1에서 19 \* 19)을 계산해 출력한다.
 */
public class QuizGuguMain {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		System.out.println("몇의 크기의 구구단을 출력하시겠습니까?");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		int[] val = new int[Integer.parseInt(inputValue)];
		
		if(inputValue.equals("1")) {
			System.out.println("최소 2이상의 값을 넣어주십시오");
			System.out.println("다시 입력해주시 바랍니다.");
			return;
			
		} else {
			for(int i = 2; i < (val.length)+1; i++) {
				for(int j = 0; j < val.length; j++) {
					val[j] = i * (j+1);
					System.out.println(val[j]);
				}
			}
		}
/*	
	public static int[] outvo(val) {
		int[] result = new int[val];
		for(int i = 1; i <result.length; i++) {
			result[i] = val * i;
		}
	}
*/	
	}
}