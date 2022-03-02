package eve;

public class Classes {
	public static void main(String[] args) {
		
		demo.demo1 qwer=new demo().new demo1();
		qwer.meth();
		Classes obj=new Classes();
		obj.hello();
	}
		 void hello() {
			class innerr{
				void asd() {
					System.out.println("thank you");
					
				}
			}
			new innerr().asd();
		}
	
	
}
	class demo{
		String asd="hello how are you";
		class demo1{
			int i=1;
			public void meth() {
				System.out.println("hello macha");
				System.out.println(i);
				System.out.println(asd);
			}
		}
		
	}		
	
	