
public class Interface {

	public static void main(String[] args) {
		Shape square = new Shape();
		square.setColor("Yellow");
		System.out.println(square.getColor());
		
		square.moveShape(12, 23);
		
		System.out.println(square.getXPos());
		/***************************/
	}

}
