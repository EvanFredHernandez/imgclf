package v2;

public class Test {
	public static void main(String[] args) {
		// Test some activation function stuff.
		System.out.println(ActivationFunction.RELU.apply(0.3));
		System.out.println(ActivationFunction.RELU.apply(23423423));
		System.out.println(ActivationFunction.RELU.apply(-0.123213));
		
		System.out.println(ActivationFunction.RELU.applyDerivative(-.12312));
		System.out.println(ActivationFunction.RELU.applyDerivative(123));
		System.out.println(ActivationFunction.RELU.applyDerivative(0.125));
		
		// Test outer product.
		double[] v1 = new double[]{1, 2, 3};
		double[][] outerProd = Util.outerProduct(v1, v1);
		for (int i = 0; i < outerProd.length; i++) {
			for (int j = 0; j < outerProd[i].length; j++) {
				System.out.print(outerProd[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
