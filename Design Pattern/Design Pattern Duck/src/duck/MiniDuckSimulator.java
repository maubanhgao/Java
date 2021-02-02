package duck;

/*
 * class run
 * gỉa lập
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		System.out.println("------------------");
		Duck modelDuck = new ModeDuck();
		modelDuck.display();
		modelDuck.performFly();
		// Thay đổi cách bay thành tên lửa cho ModelDuck
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		mallardDuck.performFly();
	}

}
