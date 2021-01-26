package lambda_55;

interface Sayable_E4 {
	public String say(String word);
}

public class LambdaExpressionExample4 {

	public static void main(String[] args) {
		Sayable_E4 s = (word) -> {
            return word;
        };
        System.out.println(s.say("Meo meo!"));
	}

}
