public class CodeBot {
	private String className;
	private String code;
	
	public CodeBot() throws Exception {
			className = "Hello";
			code = "public class Hello { public static void main(String[] args) { System.out.println(\"hello, world\");}}";
			saveCode();
	}
	
	public CodeBot (String className, String code) throws Exception {
		this.className = className;
		this.code = code;
		saveCode();
	}
	
	private void saveCode() throws Exception {
		java.io.File javaFile = new java.io.File(className + ".java");
		
		if(javaFile.exists()) {
			System.out.println("File " + javaFile + " already exists.");
			System.exit(0);
		}
		
		try(java.io.PrintWriter pw = new java.io.PrintWriter(javaFile);) {
			pw.print(code);
		}
	}
	
	public void compile() throws CompilationException {
		if(!code.contains(className)) {
			throw new CompilationException("Class name must be found in code.");
		}
		
		else {
			System.out.println("Program " + className + ".java has compiled successfully.");
		}
	}
}