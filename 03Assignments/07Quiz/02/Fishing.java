public class Fishing {
	byte b1 = 4;
	int i1 = 123456;
	long L1 = (long)i1;   // line A
	short b2 = (short)i1; // line B
	byte b2 = (byte)i1;   // line C
	int i2 = (int)123.456; // line D
	byte b3 = b1 + 7;
}
