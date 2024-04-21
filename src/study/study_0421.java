package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class study_0421 {

	public static void main(String args[]) {
		List<ApartmentInfo> aptList = new ArrayList<ApartmentInfo>();
		
		List<Map<String, String>> arr = new ArrayList<Map<String, String>>();
		
		Map<String, String> res = new HashMap<String, String>();
		res.put("1", "Welcom to the Show");
		res.put("2", "예뻤다");
		res.put("3", "한 페이지가 될 수 있게");
		arr.add(res);
		
		for(Map<String, String> item : arr) {
			System.out.println("!");
			aptList.add(new ApartmentInfo(res));
			System.out.println(aptList);
		}
		
//		for(ApartmentInfo i : aptList) {
//			System.out.println(i);
//		}
//		System.out.println(aptList);

//		return aptList;

	}
	
//	public List<ApartmentInfo> getAptList(){
//		List<ApartmentInfo> aptList = new ArrayList<ApartmentInfo>();
//		
//		List<Map<String, String>> arr = new ArrayList<Map<String, String>>();
//		
//		Map<String, String> res = new HashMap<String, String>();
//		res.put("1", "Welcom to the Show");
//		res.put("2", "예뻤다");
//		res.put("3", "한 페이지가 될 수 있게");
//		arr.add(res);
//		
//		for(Map<String, String> item : arr) {
//			System.out.println(item);
////			aptList.add(new ApartmentInfo(res));
//		}
//		return aptList;
//	}

}
