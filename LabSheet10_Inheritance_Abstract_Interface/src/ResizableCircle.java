
public class ResizableCircle extends Circle implements Resizable {
	
	ResizableCircle(double radius){
		super(radius);				
	}
	
	@Override
	public void resize(int percent) {
		radius *= percent / 100.0;		
	}
	
	public double getResize() {
		return radius*10;
	}
	
	public String toString() {
		return "ResizableCircle[" + super.toString() + "]" ;
	}	

}
