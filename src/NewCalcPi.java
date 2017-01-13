
public class NewCalcPi {
	public  double cPi(double x){
		double pi = 3;
		int b = 0;
		for(double i = 2; i < x; i += 2){
			if(b == 0){
			double dd = i*(i+1)*(i+2);
			pi = pi + 4/dd; 
			b = 1;
			}else{
				double dd = i*(i+1)*(i+2);
				pi = pi - 4/dd;
				b = 0;
			}
		}
		return pi;
	}
}
