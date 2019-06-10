package motorcyclefactory;
/* Generic Motorcycle class*/
public class Motorcycle<T extends Number> {
	protected String name;
	protected T size;
	protected T topSpeed;
	protected Color color;
	
	public Motorcycle(String name, T size, T topSpeed, Color color) {
		this.name = name;
		this.size = size;
		this.topSpeed = topSpeed;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getSize() {
		return size;
	}

	public void setSize(T size) {
		this.size = size;
	}

	public T getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(T topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public String toString() {
		return name + " " + size + " top speed: " + topSpeed  + " Color: " + color;
	}

	

}
