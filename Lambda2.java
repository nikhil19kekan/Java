
public class Lambda2 {
	//generic functional interface T can take form of any object
	interface generic<T>{
		T func(T arg);
	}
	public static void main(String[] args) {
		// T is String here
		//output of this inline lambda will be original string concatinated with some other string
		generic<String> inst = (s) -> s+":attaching this string to original String s";
		String output = inst.func("String s");
		System.out.println(output);
		
		//T is int here and lambda return sum of it with 10
		generic<Integer> inst1 = (i) -> 10+i;
		int output1 = inst1.func(20);
		System.out.println(output1);
	}

}
