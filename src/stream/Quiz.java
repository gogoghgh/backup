package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Stream API 활용
<문제>
아래 음식 메뉴 문자열에서 ‘부추＇가 들어가 있는 음식 메뉴를 골라 화면에 표시하시오
"흑미밥 건새우아욱국 비엔나닭볶음 단무지부추무침 깍두기 호밀식빵 크림스프 샐러드&포도 아메리카노 부추전"*/

public class Quiz {

	public static void main(String[] args) {
		String string1 = "흑미밥 건새우아욱국 비엔나닭볶음 단무지부추무침 깍두기 호밀식빵 크림스프 샐러드&포도 아메리카노 부추전";
		List<String> result = Arrays.asList(string1.split(" ")).stream()
													// 공백 기준으로 쪼개기~ 단어들로 착착착
									// asList: arrayList로 바꿔준다,,? -> 그 다음,, stream 생성
//							.filter((s)->s.contains("부추")).forEach(s->System.out.println(s)); 
							.filter((s)->s.contains("부추")).collect(Collectors.toList());
							// 중간 처리 메서드: filter 			// Collectors: 다시 list로 만들어주는 라이브러리,,

		for(String s : result) System.out.println(s);

	}

}
