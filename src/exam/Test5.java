package exam;

import java.util.HashMap;
import java.util.Iterator;

public class Test5 {
	public static void main(String[] args) {
		LocationHashMap locationHashMap = new LocationHashMap();
		
		Location locationA = new Location("부산기차역", 35.115225, 129.042243);
		Location locationB = new Location("아이티윌부산교육센터", 35.1584043, 129.0620349);
		Location locationC = new Location("부산광역시청", 35.179665, 129.0747635);
		
		locationHashMap.addLocation(locationA);
		locationHashMap.addLocation(locationB);
		locationHashMap.addLocation(locationC);
		
		locationHashMap.showAllLocation();
	}

} // Test5

////////////////////////////////////////////////////////////////////
class LocationHashMap {
// 멤버변수
	private HashMap<String, Location> hashMap;

	public LocationHashMap() {
		hashMap = new HashMap<String, Location>();
	}

// location 추가 메서드
	public void addLocation(Location location) {
		hashMap.put(location.getLocName(), location);
	}

// location 출력 메서드
	public void showAllLocation() {
		Iterator<String> ir = hashMap.keySet().iterator();

		while (ir.hasNext()) {
			String key = ir.next();
			Location location = hashMap.get(key);
			System.out.println(location);
		}
		System.out.println();
	}

} // LocationHashMap class


////////////////////////////////////////////////////////////////////
class Location {
	String locName; // 지명
	private double x; // 위도
	private double y; // 경도

	
	// 생성자
	public Location() {	}

	public Location(String locName, double x, double y) {
		super();
		this.locName = locName;
		this.x = x;
		this.y = y;
	}

	
	// get set
	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	
	// toString
	@Override
	public String toString() {
		return locName + " : (" + x + " , " + y + ")";
	}

} // Location class
