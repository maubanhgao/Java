package duck;

/*
 * khong the bay
 */
public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Tôi không thể bay");
	}

}
