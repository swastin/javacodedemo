package javalangexample2;

public class Javalangexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=================Math Class==========================");
		Integer mi = 10;
		Integer mi2 = 20;
		Double md = 10.5;
		Double md1 = 20.5;
		System.out.println(Math.E);
		System.out.println(Math.PI);

		/**
		 * Trigonometry functions
		 * 
		 * sin(),cos(),tan(),cot(),asin(),acos(),atan(),acot()
		 */
		System.out.println("--------------Trigonmetry function angle as radian-------------");
		System.out.println(Math.sin(45));
		System.out.println(Math.cos(45));
		System.out.println(Math.tan(45));
		System.out.println(Math.asin(45));
		System.out.println(Math.acos(45));
		System.out.println(Math.atan(45));
		System.out.println("--------------Trigonmetry function angle as deg-------------");
		System.out.println(Math.sin(Math.toDegrees(45)));
		System.out.println(Math.cos(Math.toDegrees(45)));
		System.out.println(Math.tan(Math.toDegrees(45)));
		System.out.println(Math.asin(Math.toDegrees(45)));
		System.out.println(Math.acos(Math.toDegrees(45)));
		System.out.println(Math.atan(Math.toDegrees(45)));
		System.out.println("---------------------------");
		System.out.println(" ");
		/**
		 * Trigonometry functions
		 * 
		 * exp(),log(),log10(),sqrt(),cbrt(),pows()
		 */
		System.out.println("--------------Exponetial and log functions-----------------");
		System.out.println(Math.exp(45));
		System.out.println(Math.log(1.2));
		System.out.println(Math.log10(10));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.cbrt(5));
		System.out.println(Math.pow(4, 2));
		System.out.println(Math.pow(4, 5));
		System.out.println();

		System.out.println("---------------------------");
		System.out.println(" ");
		System.out.println("--------------Ceil and floor function-----------------");
		System.out.println(Math.ceil(4.6));
		System.out.println(Math.floor(4.56));
		System.out.println(Math.rint(4.56));
		System.out.println(Math.round(4.56));
		System.out.println("---------------------------");
		System.out.println(" ");
		System.out.println("--------------Mathematical Operations-----------------");
		System.out.println(Math.addExact(7, 8));
		System.out.println(Math.addExact(7123456789L, 89764567890L));
		System.out.println(Math.subtractExact(7, 8));
		System.out.println(Math.subtractExact(7123456789L, 89764567890L));
		System.out.println(Math.multiplyExact(7, 8));
		System.out.println(Math.multiplyExact(719L, 89L));
		System.out.println(Math.multiplyExact(7123456789L, 8));
		System.out.println(Math.incrementExact(7123456789L));
		System.out.println(Math.incrementExact(6789));
		System.out.println(Math.decrementExact(7123456789L));
		System.out.println(Math.decrementExact(6789));
		System.out.println(Math.negateExact(6789L));
		System.out.println(Math.absExact(-6789L));
		System.out.println(Math.floorDiv(2, 3));
		System.out.println(Math.floorDiv(7123456789L, 7123456788L));
		System.out.println(Math.floorMod(2, 3));
		System.out.println(Math.floorMod(7123456789L, 7123456788L));
		System.out.println(Math.abs(-1));
	}

}
