package String1;

public class String6 {

	public static void main(String[] args) {
		// substring()은 인덱스 기준으로 앞 문자열을 삭제합니다.
		// 인덱스 번호를 두 개 주면 처음 인덱스번호 ~ 두 번째 인덱스번호 사이만 남겨줍니다.
		
		String str = "자바자바JSPJSP스프링스프링"; // 16글자 0부터 시작.
		String result = str.substring(5); // 5번을 시작점으로 잡겠다는 의미.
		System.out.println(result);
		
		result = str.substring(10,15); // 10번을 시작 15번 직전까지 사이만 남겨줌.
		System.out.println(result);

	}

}
