package ClientSide;

import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

public class test {
	
	public void analyzeRequest(String request){
		String[] a = request.split(","); 
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		test a = new test();
		int c = 0;
		String b = "1,MTL1111,r,r,r,r,r,mtl";
		a.analyzeRequest(b);
		while(true){
			c++;
			System.out.println("c is "+c);
		}
		
	}
	
}
