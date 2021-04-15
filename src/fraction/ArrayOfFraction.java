package fraction;

import fraction.ArrayOfFraction;
import fraction.Fraction;

public class ArrayOfFraction {
	//khai bao thuoc tinh cua class
	private Fraction []a;
	private int n;


	// ham khoi tao 0 doi so
	public ArrayOfFraction() {
		a=new Fraction [10];
		n=0;
	}


	//ham khoi tao co doi so
	public ArrayOfFraction(int capacity) {
		a=new Fraction[capacity];
		n=0;
	}


	//method: them 1pt x vao cuoi mang a gom n pt
	public void add(Fraction x) {
		if(n==a.length) {

			// khai bao va cap phat 1 mang moi
			Fraction []b=new Fraction[a.length *2];

			//chuyen cac pt tu a qua b
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		// chen x vao
		a[n]=x;
		n++;
	}

	//ham tra ve 1 ptu tai vi tri k
	public Fraction get(int index) {
		if(index<0||index>=n) {
			System.out.println("invalid index");
			return null;
		}
		else
			return a[index];
	}

	//ham set
	public void set(int index,Fraction x) {
		if(index<0||index>=n) {
			System.out.println("invalid index");
		}
		else {
			for(int i=0;i<n;i++) {
				a[index]=x;
			}
		}
	}


	//them 1 gia tri x vao vtri index trong mang n ptu
	public void add(int index,Fraction x) {
		if(n==a.length) {
			// khai bao va cap phat 1 mang moi
			Fraction []b=new Fraction[a.length *2];
			//chuyen cac pt tu a qua b
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		else {
			if(index<0||index>n) {
				System.out.println("invalid index");
			}
			else if(index==n) {
				a[index]=x;
				n++;
			}
			else {
				int i;
				for(i=n;i>=index;i--) {
					a[i]=a[i-1];
				}
				a[index]=x;
				n++;
			}
		}
	}

	//ham remove
	public void remove(int index) {
		if(index<0||index>=n) {
			System.out.println("invalid index");
		}
		else {
			for(int i=index;i<n-1;i++)
				a[i]=a[i+1];
			n--;
		}
	}


	// ham contain
	public boolean contain(Fraction x) {
		for(int i=0;i<n;i++) 
			if(a[i]==x)
				return true;
		return false;

	}

	// ham IndexOf
	public int indexOf(Fraction x) {
		for(int i=0;i<n;i++)
			if(a[i]==x)
				return i;
		return -1;

	}

	//ham LastIndexOf
	public int lastIndexOf(Fraction x) {
		for(int i=n;i>=0;i--)
			if(a[i]==x)
				return i;
		return -1;

	}
	// ham output
	public void output() {
		for(int i=0;i<n;i++)
			System.out.print(a[i] + " ");
	}

	// ham toString
	public String toString() {
		String s="";
		for(int i=0;i<n;i++) {
			s=s+a[i] +" ";
		}
		return s;
	}

	public static void main(String[] args) {
		ArrayOfFraction aof=new ArrayOfFraction();
		aof.add(new Fraction(5,2));
		aof.add(new Fraction(3,4));
		aof.add(new Fraction(1,8));
		aof.add(new Fraction(9,7));
		aof.add(2, new Fraction(7,6) );

//		aoc.remove(3);
		aof.output();
//		System.out.println("\n"+aoc.contain(new Fraction(5,2)));
	}

}
