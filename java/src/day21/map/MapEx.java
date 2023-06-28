package day21.map;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		/* Map을 배열처럼 사용 */ 
		HashMap<Integer, Integer> map = new HashMap<>();
		// 배열 0번지에 1, 1번지에 2,... 4번지에 5를 저장
		for(int i = 0; i < 5; i++) {
			map.put(i, i+1);
		}
		System.out.println(map);
		
		/* 아이디, 비번을 관리하는 예제 */
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("abc123", "1234567");
		map2.put("qwe1", "qwe123123");
		map2.put("abc123", "abc");
		
		/* KetSet을 이용한 반복문 */
		Set<String> keySet = map2.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String id = it.next();//key값을 가져옴
			String pw = map2.get(id);//key값(id)를 이용해서 value값을 가져옴
			System.out.println("id: " + id + " , pw : " + pw);
		}
		/* 멤버로 key와 value를 가지는 Entry를 이용하여  map에 있는 key,value값을
		 * Entry 객체 하나에 넣어 set으로 만듬*/
		
		Set<Entry<String, String>> entrySet = map2.entrySet();
		
		Iterator<Entry<String, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, String> tmp = it2.next();
			String id = tmp.getKey();//key값을 가져옴
			String pw = tmp.getValue();
			System.out.println("id: " + id + " , pw : " + pw);
		}
	}

}
