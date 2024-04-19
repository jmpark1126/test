package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class study_0420 {
	public static void  main(String[] arg) {
//		//배열
//		String list[] = {"사과", "바나나", "레몬", "자몽", "유자"}; //배열
//		
//		for(String i : list) {
//			System.out.println(i);
//		}
//		
//		System.out.println();
//		
//		//List,ArrayList
//		List<String> array = new ArrayList<String>();
//		array.add("봄");
//		array.add("여름");
//		array.add("가울");
//		array.add("겨울");
//		array.add("hi");
//		
//		for(String a : array) {
//			System.out.println(a);
//		}
//		
//		//HashMap
//		HashMap<String, String> h = new HashMap<String, String>();
//		h.put("1", "일등");
//		h.put("2", "이등");
//		h.put("3", "삼등");
//		
//		System.out.println(h);
		
		//List<Map<String, Object>>
		/**
		 * 
		 * */
//		List<Map<String, Object>> mlist = new ArrayList<>();
//
//		// 첫 번째 맵 객체
//		Map<String, Object> map1 = new HashMap<>();
//		map1.put("key1", "value1");
//		map1.put("key2", 123);
//		list.add(map1);
//
//		// 두 번째 맵 객체
//		Map<String, Object> map2 = new HashMap<>();
//		map2.put("key1", "value2");
//		map2.put("key2", true);
//		list.add(map2);
		

		List<Map<String, String>> mList = new ArrayList<Map<String,String>>();
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("01", "이마크");
		map1.put("02", "황인준");
		map1.put("03", "이제노");
		map1.put("04", "나재민");
		mList.add(map1);
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("11", "문태일");
		map2.put("12", "이태용");
		map2.put("13", "서영호");
		map2.put("14", "나카모토 유타");
		mList.add(map2);
		
		for(Map<String, String> i : mList) {
			System.out.println(i);
		}
		
	}

}
