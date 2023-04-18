package java;

public class methodpractice {
	    // value0fSupplt , vatRate main method 안에서만 사용할 수 있는 지역 변수이므로 class안에 모든 method가 사용할 수 있도록
	    // main method 밖 methodpratice 안으로 옮겨준다. public statice을 앞에 붙여 methodpracice의 직접적인 소속이다라고 정해준다.   
			//공급가액
		public static double valueOfSupply = 10000.0;
			
			//부가가치세율
		public static double vatRate= 0.1;
	
	public static double getVAT(){
		return valueOfSupply * vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static void main(String[] args) {
		
		System.out.println("Value of supply:" + valueOfSupply);
		System.out.println("Vat :" + getVAT());
		System.out.println("Total :" + getTotal());

	}

}
