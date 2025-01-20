public class Rectangle {
	//crate two private attribute
	private float length;
	private float width;
	
	//Default Constructor
	Rectangle(){
		length = 1.0f;
		width = 1.0f;
	}
	/*private float length=1.0f;
	 *private float width=1.0f;
	 *
	 * Retangle(){}
	 * 
	 */
	
	//Parameterized Constructor
	Rectangle(float length,float width){
		this.length = length;
		this.width = width;		
	}
	
	//Getters and Setters method
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float length) {
		this.length = length;		
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;		
	}
	
	//Method to calculate area
	public double getArea() {
		return this.length * this.width;
	}
	
	//Method to calculate perimeter
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	//Method toString()
	public String toString() {
		return "Rectangle[length= "+ this.length + ",width= "+ this.width+"]";
	}	
	
}






