package duck;

/*
 * không phải vịt thật
 * không thể kêu (câm)
 */
public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Không thể kêu");
	}

}
