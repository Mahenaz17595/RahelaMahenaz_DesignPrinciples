package calci;

public class CalculatorModel {
	private int calculationValue;
	
	public void addTwoNumbers(int n1, int n2) {

	calculationValue = n1+n2;
}

public int getCalculationValue() {
	return calculationValue;

}
}