class emp{
	int id;
	String name;
}
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
emp s1= new emp();
emp s2= new emp();
s1.name = "abc";
s1.id = 101;
s2.name = "def";
s2.id = 102;
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
	}

}
