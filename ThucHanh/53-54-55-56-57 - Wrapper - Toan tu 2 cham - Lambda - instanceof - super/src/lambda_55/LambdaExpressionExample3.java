package lambda_55;

interface Sayable {
	public String say();
}
public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		Sayable say = () -> {
			return "I have nothing to say.";
		};
		System.out.println(say.say());
	}

}
