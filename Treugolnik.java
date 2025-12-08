public class Treugolnik{
	private double[] tochka1 = new double[2];
	private double[] tochka2 = new double[2];
	private double[] tochka3 = new double[2];
	
	public Treugolnik(double[] tochka1, double[] tochka2, double[] tochka3){
		this.tochka1 = tochka1;
		this.tochka2 = tochka2;
		this.tochka3 = tochka3;
	}
	
	public double plochad(){
		double poluper = (getDlina1() + getDlina2() + getDlina3())/2;
		double ploshad = sqrt(poluper * (poluper - getDlina1()) * (poluper - getDlina2()) * (poluper - getDlina3()));
		return ploshad;
	}
	
	public double getDlina1(){
		return sqrt(abs(tochka1[0] - tochka2[0]) * abs(tochka1[0] - tochka2[0]) + abs(tochka1[1] - tochka2[1]) * abs(tochka1[1] - tochka2[1]));
	}
	
	public double getDlina2(){
		return sqrt(abs(tochka1[0] - tochka3[0]) * abs(tochka1[0] - tochka3[0]) + abs(tochka1[1] - tochka3[1]) * abs(tochka1[1] - tochka3[1]));
	}
	
	public double getDlina3(){
		return sqrt(abs(tochka2[0] - tochka3[0]) * abs(tochka3[0] - tochka2[0]) + abs(tochka3[1] - tochka2[1]) * abs(tochka3[1] - tochka2[1]));
	}
	
	
	
	public double perimetr(){
		return getDlina1() + getDlina2() + getDlina3();
	}
	
	public boolean ravnobedr(){
		if (getDlina1() == getDlina2() || getDlina1() == getDlina3() || getDlina2() == getDlina3()){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean pramoug(){
		if (sqrt(getDlina1() * getDlina1() + getDlina2() * getDlina2()) == getDlina3()){
			return true;
		}
		if (sqrt(getDlina3() * getDlina3() + getDlina1() * getDlina1()) == getDlina2()){
			return true;
		}
		if (sqrt(getDlina2() * getDlina2() + getDlina3() * getDlina3()) == getDlina1()){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean ravenstvo(Treugolnik t){
		if (this.tochka1 == t.tochka1 && this.tochka2 == t.tochka2 && this.tochka3 == t.tochka3){
			return true;
		} else {
			return false;
		}
	}
		
	
	
	
	
	private double sqrt(double m){
		if (m == 0){
			return 0;
		}
		double q = m;
		double e = 1e-10;
		
		while (abs(q * q - m) > e){
			q = (q + m/q)/2.0;
		}
		return q;
	}
	
	public double abs(double m){
		if (m < 0){
			return -m;
		} else {
			return m;
		}
	}
	
	public String toString(){
		return "(" + getDlina1() + " " +  getDlina2() + " " + getDlina2() + ")";
	}
	
	
	
	
	
		
}
