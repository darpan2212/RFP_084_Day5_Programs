package accessmodifier;

public class ClassB{

	public static void main(String[] args) {
		ClassA aObj = new ClassA();
		aObj.num++; //0
		aObj.cnt++; //0
		
		System.out.println("Num :"+aObj.num+" Cnt : "+aObj.cnt);
		
		ClassA aObj2 = new ClassA();
		aObj2.num++; // 0
		aObj2.cnt++; // 1
		
		System.out.println("Num :"+aObj2.num+" Cnt : "+aObj2.cnt);
		
		ClassA aObj3 = new ClassA();
		aObj3.num++;
		aObj3.cnt++;
		
		System.out.println("Num :"+aObj3.num+" Cnt : "+aObj3.cnt);
	}
}