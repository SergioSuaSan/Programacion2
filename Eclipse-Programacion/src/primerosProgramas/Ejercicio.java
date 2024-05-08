package primerosProgramas;

public class Ejercicio {

	public static void main(String[] args) {
		
		
		
		int x;
		int y;
		int z;
		final float PI=3.141592F;
		final float E=2.718281F;
		x=1;
		y=4;
		z=10;
		float V;
		int R = 2;
		
		int da = 1;
		int dn= 1;
		int ma = 2;
		int mn  = 2;
		int aa = 2019;
		int an = 1999;
		
		System.out.println(2 * x + 0.5f * y - (1 / 5f)* z);	 //Hay que poner la F de float a la división porque si no lo especificas, no utiliza decimales. 1/5 sería 0. 0*z=0
		System.out.println(PI* x * x > y || 2 * PI * x <= z);
		System.out.println(x - y + z + PI - E + 2.576689f);
		System.out.println(- 3 * x + 2 * y - 1 / 2f* z);
		System.out.println(x > 3 && y == 4 || x + y <= z);
		System.out.println(x > 3 && ( y == 4 || x + y <= z ));
		System.out.println(! ( 2 * x == y / 2 || ( PI - E ) * z > y ));
		System.out.println(! ( 2 * x == y / 2 || ( PI - E ) * z > y ) ==( ! (y / 2 == 2 * x) && !( y <( PI - E ) * z)));
		
		
		System.out.println(5* x^2 + 3* x + 6);
		System.out.println((x-y)/x + (z-y)/y > y/x);
		System.out.println(x+y <= z && x!= z);
		System.out.println(x == y && x!= z);
		System.out.println(V= 4* PI/3f * (float)  Math.pow(R, 3)); 			//Este comando sirve para hacer potencias
		System.out.println(da==dn && ma == mn && aa== an+20);
		
		float m;
		int b  =3;
		int c = 2;
		int a = 100;
		int d = 6;
		
		
		System.out.println(m = (float) ((b+c)/2*a)/((a-b)*(c+d)));
		System.out.println(Math.sqrt(a));			//Este comando sirve para hacer raíces cuadradas.
		
	



		
		
		
		
		
		

	}

}
