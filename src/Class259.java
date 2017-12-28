/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class259 {
	int anInt3213;
	int anInt3214;
	int[] anIntArray3215;
	int[] anIntArray3216;

	Class259() {
		Class282_Sub18.method12264(16);
		((Class259) this).anInt3213 = (Class282_Sub18.method12263() != 0 ? Class282_Sub18.method12264(4) + 1 : 1);
		if (Class282_Sub18.method12263() != 0)
			Class282_Sub18.method12264(8);
		Class282_Sub18.method12264(2);
		if (((Class259) this).anInt3213 > 1)
			((Class259) this).anInt3214 = Class282_Sub18.method12264(4);
		((Class259) this).anIntArray3215 = new int[((Class259) this).anInt3213];
		((Class259) this).anIntArray3216 = new int[((Class259) this).anInt3213];
		for (int i = 0; i < ((Class259) this).anInt3213; i++) {
			Class282_Sub18.method12264(8);
			((Class259) this).anIntArray3215[i] = Class282_Sub18.method12264(8);
			((Class259) this).anIntArray3216[i] = Class282_Sub18.method12264(8);
		}
	}
}
