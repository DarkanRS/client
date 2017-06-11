/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class22 {
	public static short[][][] aShortArrayArrayArray278;

	Class22() throws Throwable {
		throw new Error();
	}

	static Class115[] method370(int i) {
		try {
			return (new Class115[] { Class115.aClass115_1385, Class115.aClass115_1386, Class115.aClass115_1388, Class115.aClass115_1384, Class115.aClass115_1383 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aw.a(").append(')').toString());
		}
	}

	public static File method371(int i) {
		try {
			return Class291.aFile6500;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aw.d(").append(')').toString());
		}
	}

	static void method372(RsByteBuffer buffer, int i) {
		try {
			int length = buffer.readUnsignedSmart(1723054621);
			Class52_Sub2_Sub1_Sub1.aClass353Array9987 = new Class353[length];
			for (int i_1_ = 0; i_1_ < length; i_1_++) {
				Class52_Sub2_Sub1_Sub1.aClass353Array9987[i_1_] = new Class353();
				Class52_Sub2_Sub1_Sub1.aClass353Array9987[i_1_].anInt3820 = buffer.readUnsignedSmart(1723054621) * -801041135;
				Class52_Sub2_Sub1_Sub1.aClass353Array9987[i_1_].aString3819 = buffer.readJagString(681479919);
			}
			Class395.anInt5190 = buffer.readUnsignedSmart(1723054621) * 457295123;
			Class338.anInt3630 = buffer.readUnsignedSmart(1723054621) * -924756647;
			Class24.anInt9950 = buffer.readUnsignedSmart(1723054621) * 412440447;
			Class131.aClass343_Sub1Array1498 = new Class343_Sub1[(Class338.anInt3630 * -499146007 - -1648308965 * Class395.anInt5190 + 1)];
			for (int i_2_ = 0; i_2_ < 1017276543 * Class24.anInt9950; i_2_++) {
				int i_3_ = buffer.readUnsignedSmart(1723054621);
				Class343_Sub1 class343_sub1 = (Class131.aClass343_Sub1Array1498[i_3_] = new Class343_Sub1());
				((Class343_Sub1) class343_sub1).anInt3672 = buffer.readUnsignedByte() * 672848077;
				class343_sub1.anInt3670 = buffer.readInt((byte) 66) * -743493231;
				class343_sub1.anInt7717 = -72535113 * (Class395.anInt5190 * -1648308965 + i_3_);
				class343_sub1.aString7719 = buffer.readJagString(681479919);
				class343_sub1.aString7718 = buffer.readJagString(681479919);
			}
			Class117.anInt1399 = buffer.readInt((byte) 56) * -1232164675;
			Class338.aBoolean3631 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aw.b(").append(')').toString());
		}
	}

	static final void method373(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.aStringArray1195 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aw.jx(").append(')').toString());
		}
	}

	static final void method374(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub3_7556.method5633(-863865720) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aw.ajp(").append(')').toString());
		}
	}
}
