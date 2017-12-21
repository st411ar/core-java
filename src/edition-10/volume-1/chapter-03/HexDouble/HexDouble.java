/*
hex float / double consists of 3 parts:
	1) mantissa - hex float point number
	2) exponent - dec integer number
	3) base - equals 2 and marks by symbol 'p'
*/		

public class HexDouble {
	public static void main(String[] args) {

		System.out.println("\ninteger part without fraction part and exponent");

		// compilation error
		// print(1.0, 0x1.0);
		printDecAndHex(1.0, 0x1.0p0);
		printDecAndHex(2.0, 0x2.0p0);
		printDecAndHex(9.0, 0x9.0p0);
		printDecAndHex(10.0, 0xa.0p0);
		printDecAndHex(11.0, 0xb.0p0);
		printDecAndHex(15.0, 0xf.0p0);
		printDecAndHex(16.0, 0x10.0p0);
		printDecAndHex(17.0, 0x11.0p0);
		printDecAndHex(25.0, 0x19.0p0);
		printDecAndHex(26.0, 0x1a.0p0);
		printDecAndHex(27.0, 0x1b.0p0);
		printDecAndHex(31.0, 0x1f.0p0);
		printDecAndHex(32.0, 0x20.0p0);

		// also you may use next integer format
		printDecAndHex(32, 0x20);
		printDecAndHex(32e0, 0x20p0);


		System.out.println("\ninteger part and exponent without fraction part");

		// 1 * 10 ^ 0 = 1 * 1 = 1
		// 0x1 * 2 ^ 0 = 1 * 1 = 1
		printDecAndHex(1.0e0, 0x1.0p0);

		// 1 * 10 ^ 1 = 1 * 10 = 10
		// 0x1 * 2 ^ 1 = 1 * 2 = 2
		printDecAndHex(1.0e1, 0x1.0p1);

		// 1 * 10 ^ 2 = 1 * 100 = 100
		// 0x1 * 2 ^ 2 = 1 * 4 = 4
		printDecAndHex(1.0e2, 0x1.0p2);

		// 1 * 10 ^ 3 = 1 * 1000 = 1000
		// 0x1 * 2 ^ 3 = 1 * 8 = 8
		printDecAndHex(1.0e3, 0x1.0p3);

		// 2 * 10 ^ 3 = 2 * 1000 = 2000
		// 0x2 * 2 ^ 3 = 2 * 8 = 16
		printDecAndHex(2.0e3, 0x2.0p3);

		// 9 * 10 ^ 3 = 9 * 1000 = 9000
		// 0x9 * 2 ^ 3 = 9 * 8 = 72
		printDecAndHex(9.0e3, 0x9.0p3);

		// 10 * 10 ^ 3 = 10 * 1000 = 10000
		// 0xa * 2 ^ 3 = 10 * 8 = 80
		printDecAndHex(10.0e3, 0xa.0p3);

		// 11 * 10 ^ 3 = 11 * 1000 = 11000
		// 0xb * 2 ^ 3 = 11 * 8 = 88
		printDecAndHex(11.0e3, 0xb.0p3);

		// 15 * 10 ^ 3 = 15 * 1000 = 15000
		// 0xf * 2 ^ 3 = 15 * 8 = 120
		printDecAndHex(15.0e3, 0xf.0p3);

		// 16 * 10 ^ 3 = 16 * 1000 = 16000
		// 0x10 * 2 ^ 3 = 16 * 8 = 128
		printDecAndHex(16.0e3, 0x10.0p3);

		// 17 * 10 ^ 3 = 17 * 1000 = 17000
		// 0x11 * 2 ^ 3 = 17 * 8 = 136
		printDecAndHex(17.0e3, 0x11.0p3);

		// also you may use next integer format
		printDecAndHex(17e3, 0x11p3);


		System.out.println("\nfraction part without integer part and exponent");

		// 0.1 = 0 + 1 / 10 = 0.1
		// 0x0.1 = 0 + 1 / 16 = 0.0625
		printDecAndHex(0.1, 0x0.1p0);

		// 0.2 = 0 + 2 / 10 = 0.2
		// 0x0.2 = 0 + 2 / 16 = 0.125
		printDecAndHex(0.2, 0x0.2p0);

		// 0.3 = 0 + 3 / 10 = 0.3
		// 0x0.3 = 0 + 3 / 16 = 0.1875
		printDecAndHex(0.3, 0x0.3p0);

		// 0.8 = 0 + 8 / 10 = 0.8
		// 0x0.8 = 0 + 8 / 16 = 0.5
		printDecAndHex(0.8, 0x0.8p0);

		// 0.9 = 0 + 9 / 10 = 0.9
		// 0x0.9 = 0 + 9 / 16 = 0.5625
		printDecAndHex(0.9, 0x0.ap0);

		// 0.9 = 0 + 9 / 10 = 0.9
		// 0x0.a = 0 + a / 16 = 0 + 10 / 16 = 0.625
		printDecAndHex(0.9, 0x0.ap0);

		// 0.9 = 0 + 9 / 10 = 0.9
		// 0x0.b = 0 + b / 16 = 0 + 11 / 16 = 0.6875
		printDecAndHex(0.9, 0x0.bp0);

		// 0.9 = 0 + 9 / 10 = 0.9
		// 0x0.f = 0 + f / 16 = 0 + 15 / 16 = 0.9375
		printDecAndHex(0.9, 0x0.fp0);

		// 0.11 = 0 + 1 / 10 + 1 / 100 = 0.11
		// 0x0.11 = 0 + 1 / 16 + 1 / 256 = 0 + 0.0625 + 0.00390625 = 0.06640625
		printDecAndHex(0.11, 0x0.11p0);


		System.out.println("\nfraction part and exponent without integer part");

		// 0.1 * 10 ^ 0 = (0 + 1 / 10) * 1 = 0.1
		// 0x0.1 * 2 ^ 0 = (0 + 1 / 16) * 1 = 0.0625
		printDecAndHex(0.1e0, 0x0.1p0);

		// 0.1 * 10 ^ 1 = (0 + 1 / 10) * 10 = 1
		// 0x0.1 * 2 ^ 1 = (0 + 1 / 16) * 2 = 0.125
		printDecAndHex(0.1e1, 0x0.1p1);

		// 0.1 * 10 ^ 2 = (0 + 1 / 10) * 100 = 10
		// 0x0.1 * 2 ^ 2 = (0 + 1 / 16) * 3 = 0.25
		printDecAndHex(0.1e2, 0x0.1p2);

		// 0.1 * 10 ^ 3 = (0 + 1 / 10) * 1000 = 100
		// 0x0.1 * 2 ^ 3 = (0 + 1 / 16) * 8 = 0.5
		printDecAndHex(0.1e3, 0x0.1p3);

		// 0.1 * 10 ^ 4 = (0 + 1 / 10) * 10000 = 1000
		// 0x0.1 * 2 ^ 4 = (0 + 1 / 16) * 16 = 1
		printDecAndHex(0.1e4, 0x0.1p4);

		// 0.2 * 10 ^ 4 = (0 + 2 / 10) * 10000 = 2000
		// 0x0.2 * 2 ^ 4 = (0 + 2 / 16) * 16 = 2
		printDecAndHex(0.2e4, 0x0.2p4);

		// 0.9 * 10 ^ 4 = (0 + 9 / 10) * 10000 = 9000
		// 0x0.9 * 2 ^ 4 = (0 + 9 / 16) * 16 = 9
		printDecAndHex(0.9e4, 0x0.9p4);

		// 1.0 * 10 ^ 4 = 1 * 10000 = 10000
		// 0x0.a * 2 ^ 4 = (0 + 10 / 16) * 16 = 10
		printDecAndHex(1.0e4, 0x0.ap4);

		// 1.1 * 10 ^ 4 = (1 + 1 / 10) * 10000 = 11000
		// 0x0.b * 2 ^ 4 = (0 + 11 / 16) * 16 = 11
		printDecAndHex(1.1e4, 0x0.bp4);

		// 1.5 * 10 ^ 4 = (1 + 5 / 10) * 10000 = 15000
		// 0x0.f * 2 ^ 4 = (0 + 15 / 16) * 16 = 15
		printDecAndHex(1.5e4, 0x0.fp4);

		// 1.6 * 10 ^ 4 = (1 + 6 / 10) * 10000 = 16000
		// 0x1.0 * 2 ^ 4 = 1 * 16 = 16
		printDecAndHex(1.6e4, 0x1.0p4);

		// 1.7 * 10 ^ 4 = (1 + 7 / 10) * 10000 = 17000
		// 0x1.1 * 2 ^ 4 = (1 + 1 / 16) * 16 = 17
		printDecAndHex(1.7e4, 0x1.1p4);


		System.out.println("\ninteger and fraction parts without exponent");

		// 1.1 = 1 + 1 / 10 = 1.1
		// 0x1.1 = 1 + 1 / 16 = 1.0625
		printDecAndHex(1.1, 0x1.1p0);

		// 2.2 = 2 + 2 / 10 = 2.2
		// 0x2.2 = 2 + 2 / 16 = 2.125
		printDecAndHex(2.2, 0x2.2p0);

		// 9.9 = 9 + 9 / 10 = 9.9
		// 0x9.9 = 9 + 9 / 16 = 9.5625
		printDecAndHex(9.9, 0x9.9p0);

		// 9.92 = 9 + 9 / 10 + 9 / 100 = 9.99
		// 0x9.99 = 9 + 9 / 16 + 9 / 256 = 9.94921875
		printDecAndHex(9.99, 0x9.99p0);

		// 10.9 = 1 * 10 + 9 / 10 = 10.9
		// 0xa.a = 10 + 10 / 16 = 10.625
		printDecAndHex(10.9, 0xa.ap0);

		// 10.99 = 1 * 10 + 9 / 10 + 9 / 100 = 10.99
		// 0xf.f = 15 + 15 / 16 = 15.8375
		printDecAndHex(10.99, 0xf.fp0);


		System.out.println("\ninteger, fraction parts with exponent");

		// 1.1e1 = (1 + 1 / 10) * 10 ^ 1 = 1.1 * 10 = 11
		// 0x1.1p1 = (1 + 1 / 16) * 2 ^ 1 = 1.0625 * 2 = 2.125
		printDecAndHex(1.1e1, 0x1.1p1);

		// 1.1e2 = (1 + 1 / 10) * 10 ^ 2 = 1.1 * 100 = 110
		// 0x1.1p2 = (1 + 1 / 16) * 2 ^ 2 = 1.0625 * 4 = 4.25
		printDecAndHex(1.1e2, 0x1.1p2);

		// 1.1e3 = (1 + 1 / 10) * 10 ^ 3 = 1.1 * 1000 = 1100
		// 0x1.1p3 = (1 + 1 / 16) * 2 ^ 3 = 1.0625 * 8 = 8.5
		printDecAndHex(1.1e3, 0x1.1p3);

		// 1.1e4 = (1 + 1 / 10) * 10 ^ 4 = 1.1 * 10000 = 11000
		// 0x1.1p4 = (1 + 1 / 16) * 2 ^ 4 = 1.0625 * 16 = 17
		printDecAndHex(1.1e4, 0x1.1p4);


		System.out.println("\ninteger, fraction parts with negative exponent");

		// 1.1e-1 = (1 + 1 / 10) / 10 ^ 1 = 1.1 / 10 = 0.11
		// 0x1.1p-1 = (1 + 1 / 16) / 2 ^ 1 = 1.0625 / 2 = 0.53125
		printDecAndHex(1.1e-1, 0x1.1p-1);

		// 1.1e-2 = (1 + 1 / 10) / 10 ^ 2 = 1.1 / 100 = 0.011
		// 0x1.1p-2 = (1 + 1 / 16) / 2 ^ 2 = 1.0625 / 4 = 0.265625
		printDecAndHex(1.1e-2, 0x1.1p-2);


		System.out.println("\nHorstmann's example");
		// 1.0e-3 = 1 / 10 ^ 3 = 1 / 1000 = 0.001
		// 0x1.0p-3 = 1 / 2 ^ 3 = 1 / 8 = 0.125
		printDecAndHex(1.0e-3, 0x1.0p-3);
	}

	private static void printDecAndHex(double dec, double hex) {
		System.out.print("equals: " + (dec == hex));
		System.out.print("\tdec:\t" + dec);
		System.out.println("\thex:\t" + hex);
	}
}