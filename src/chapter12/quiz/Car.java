package chapter12.quiz;

import java.util.Objects;

public class Car {
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
}
