
public class Lambda1 {
	//functional interface
	interface FunctionalInterface{
		void print(String s);
	}
	public static void main(String[] args) {
		//implementing function print as lambda to print string
		FunctionalInterface inst1 = (s) -> System.out.println(s); 
		
		//implementing function print as lambda to print string in reverse order
		FunctionalInterface inst2 = (s) -> {
			char[] s_reverse=new char[s.length()];
			for(int i=s.length()-1,j=0;i>=0 && j<s.length();i--,j++){
				s_reverse[j]=s.charAt(i);
			}
			System.out.println(String.valueOf(s_reverse, 0, s.length()));
		};
		//calling above implemented functions
		inst1.print("nikhil");
		inst2.print("nikhil");
	}

}
