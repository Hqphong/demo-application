package fraction;

import java.util.Scanner;

class Fraction {
	private int tu;
	private int mau;
	
	public Fraction() {
		tu=0;
		mau=0;
	}
	
	public Fraction(int t, int m) {
		tu=t;
		mau=m;
	}
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tu: ");
		tu=sc.nextInt();
		System.out.print("Enter mau: ");
		mau=sc.nextInt();
	}
	
	public void output() {
		System.out.println("Fraction: "+tu+"/"+mau);
	}
	
	public String toString() {
		return tu+"/"+mau;
	}
	
	public Fraction plus(Fraction p1,Fraction p2) {
		Fraction p3=new Fraction();
		p3.tu=p1.tu* p2.mau + p2.tu*p1.mau;
		p3.mau=p1.mau*p2.mau;
		
		return p3;
	}
	public Fraction minus(Fraction m1,Fraction m2) {
		Fraction m3=new Fraction();
		m3.tu=m1.tu* m2.mau - m2.tu*m1.mau;
		m3.mau=m1.mau*m2.mau;
		
		return m3;
	}
	
	public Fraction multiply(Fraction x1,Fraction x2) {
		Fraction x3=new Fraction();
		x3.tu=x1.tu* x2.tu;
		x3.mau=x1.mau*x2.mau;
		
		return x3;
	}
	
	public Fraction divide(Fraction d1,Fraction d2) {
		Fraction d3=new Fraction();
		d3.tu=d1.tu* d2.mau;
		d3.mau=d1.mau*d2.tu;
		
		return d3;
	}
	
	public Double divide() {
		return (double)tu/mau;
	}
	
	public static void main(String[] args) {
		Fraction f1=new Fraction();
		Fraction f2=new Fraction(3,4);
		f1.input();
		
		Fraction fplus=new Fraction();
		fplus=fplus.plus(f1, f2);
		System.out.println("Tong:"+  fplus.toString() + " == "+fplus.divide() 	);
		
		Fraction fminus=new Fraction();
		fminus=fminus.minus(f1, f2);
		System.out.println("Hieu:"+  fminus.toString()+ " == "+fminus.divide() 	);
		
		Fraction fmultiply=new Fraction();
		fmultiply=fmultiply.multiply(f1, f2);
		System.out.println("Tich:"+  fmultiply.toString()+ " == "+fmultiply.divide() 	);
		
		Fraction fdivide=new Fraction();
		fdivide=fdivide.divide(f1, f2);
		System.out.println("Chia:"+  fdivide.toString()+ " == "+fdivide.divide() 	);
		
		
	}

}
