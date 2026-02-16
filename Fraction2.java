import java.util.Objects;
public class Fraction2 extends Number{
	private int num;
	private int den;
	
	public Fraction2(int num, int den){
		this.num = num;
		if (den == 0){
			throw new IllegalArgumentException("На ноль делить нельзя");
		} else {
			this.den = den;
		}
		if (den < 0) {
            num = -num;
            den = -den;
        }
		reduce();
	}
	
	public Fraction2(){
        this(1,1);
    }
	
	public int getNum(){
		return num;
	}
	
	public int getDen(){
		return den;
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public void setDen(int den){
		if (den >= 0){
			this.den = den;
		}
	
	}
	
	@Override
	public double doubleValue(){
		return (double) num / den;
	}
	
	@Override
	public float floatValue(){
		return (float) num / den;
	}
	
	@Override
	public int intValue(){
		return num / den;
	}
	
	
	@Override
	public long longValue(){
		return (long) num / den;
	}
	
	public int gcd(int a, int b){
		if (a >= b){
			while (a % b != 0){
				int ost = a % b;
				a = b;
				b = ost;
			}
			return b;
		} else {
			while (b % a != 0){
				int ost = b % a;
				b = a;
				a = ost;
			}
			return a;
		}
	}
	
	public void reduce(){
		int res = gcd(getNum(), getDen());
		setNum(getNum()/res);
		setDen(getDen()/res);
	}
	
	@Override
	public String toString(){
		return "'" + getNum() + "/" + getDen() + "'";
	}
	
	public Fraction2 add(Fraction2 r){
		Fraction2 result = new Fraction2(this.num * r.den + r.num * this.den, r.den * this.den);
		return result;
	}
	
	public Fraction2 sub(Fraction2 r){
		Fraction2 result = new Fraction2(this.num * r.den - r.num * this.den, r.den * this.den);
		return result;
	}
	
	public Fraction2 div(Fraction2 r){
		if (r.num == 0){
			throw new ArithmeticException("Деление на ноль");
		}
		Fraction2 result = new Fraction2(this.num * r.den , this.den * r.num);
		return result;
	}
	
	public Fraction2 mult(Fraction2 r){
		Fraction2 result = new Fraction2(this.num * r.num , this.den * r.den);
		return result;
	}
	

	@Override
    public boolean equals(Object obj) {
        Fraction2 other = (Fraction2) obj;
        return num == other.num && den == other.den;
    }
	
	public Fraction2 negate(){
		return new Fraction2(-getNum(), getDen());
	}
	
	public boolean isProper(){
		if (Math.abs(getNum()) < Math.abs(getDen())){
			return true;
		}
		return false;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(getNum(), getDen());
    }
	
}
