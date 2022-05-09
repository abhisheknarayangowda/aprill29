class MyVectorr
{

}
public class MyVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyVectorr v1,v2;

v1=new MyVectorr();
v2=v1;
System.out.println(v1.equals(v2));
System.out.println(v1.hashCode());
System.out.println(v2.hashCode());

System.out.println(v1.equals(v2));
System.out.println(v1.hashCode());
System.out.println(v2.hashCode());


	}

}
