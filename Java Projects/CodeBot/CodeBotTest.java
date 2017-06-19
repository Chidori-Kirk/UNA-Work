public class CodeBotTest {
	public static void main (String [] args) throws Exception {
		CodeBot code = new CodeBot();
		CodeBot code2 = new CodeBot("Hello2","public class { public static void main(String[] args) { System.out.println(\"hello, world\");}}");
		code.compile();
		code2.compile();
		
	}
}
