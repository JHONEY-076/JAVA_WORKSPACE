import java.util.*;

public class VectorEx {

	public static void printVector(Vector<Integer>v) {
		for(int i=0;i<v.size();i++) {
			
			int n=v.get(i);
			System.out.println(n);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> v=new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		
		System.out.println("벡터 내의 요소 객체 수 :"+v.size());
		System.out.println("벡터의 현재 용량:"+v.capacity());
		
		for(int i=0;i<v.size();i++) {
			int n=v.get(i);
			System.out.println(n);
		}
		
		int sum=0;
		
		for(int i=0;i<v.size();i++) {
			int n= v.elementAt(i);
			sum+=n;
		}
		
		System.out.println("벡터에 있는 정수 합:"+sum);
	
	
	
		printVector(v);
	
	}
	
}
