package eve;

public class conditional_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int num=10%2;
boolean boo=(num==0);
String result=boo?"even number":"odd numbers";
System.out.println(result);
int a=20;
int b=30;
if(a>b) {
	System.out.println("a is greater than b");
	
}else {
	System.out.println("b is greater than a");
}
String name= "irfan";
switch(name) {
case "irfan":
	System.out.println("My Name Is Irfan");
	break;
case "goutham":
	System.out.println("My Name Is Goutham");
	break;
case "riswan":
	System.out.println("My Name Is Riswan");
default:
	System.out.println("name not found");
	
}

	}

}
