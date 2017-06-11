/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class HashTable implements Iterable {
	Linkable[] buckets;
	Linkable retrievalLinkable;
	long retrievalKey;
	int size;
	Linkable iterationLinkable;
	int iterationIndex = 0;
	static int anInt5518;
	public static Class377 aClass377_5519;
	public static Class371 aClass371_5520;

	public void clear(byte i) {
		try {
			for (int i_0_ = 0; i_0_ < 577108745 * ((HashTable) this).size; i_0_++) {
				Linkable class298 = ((HashTable) this).buckets[i_0_];
				for (;;) {
					Linkable next = class298.next;
					if (class298 == next) {
						if (i >= 0) {
							/* empty */
						}
						break;
					}
					next.unlink(-1460969981);
				}
			}
			((HashTable) this).retrievalLinkable = null;
			((HashTable) this).iterationLinkable = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sa.i(").append(')').toString());
		}
	}

	public Linkable get(long key) {
		try {
			((HashTable) this).retrievalKey = key * -1039549200087996967L;
			Linkable head = (((HashTable) this).buckets[(int) (key & (long) (577108745 * ((HashTable) this).size - 1))]);
			for (((HashTable) this).retrievalLinkable = head.next; ((HashTable) this).retrievalLinkable != head; ((HashTable) this).retrievalLinkable = ((HashTable) this).retrievalLinkable.next) {
				if ((((HashTable) this).retrievalLinkable.linkedKey * 7051297995265073167L) == key) {
					Linkable value = ((HashTable) this).retrievalLinkable;
					((HashTable) this).retrievalLinkable = ((HashTable) this).retrievalLinkable.next;
					return value;
				}
			}
			((HashTable) this).retrievalLinkable = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sa.a(").append(')').toString());
		}
	}

	public Linkable nextInBucket(int i) {
		try {
			if (null == ((HashTable) this).retrievalLinkable)
				return null;
			for (Linkable class298 = (((HashTable) this).buckets[(int) ((((HashTable) this).retrievalKey * -6131383980927776151L) & (long) ((((HashTable) this).size * 577108745) - 1))]); ((HashTable) this).retrievalLinkable != class298; ((HashTable) this).retrievalLinkable = ((HashTable) this).retrievalLinkable.next) {
				if (((HashTable) this).retrievalKey * -6131383980927776151L == (((HashTable) this).retrievalLinkable.linkedKey * 7051297995265073167L)) {
					Linkable class298_3_ = ((HashTable) this).retrievalLinkable;
					((HashTable) this).retrievalLinkable = ((HashTable) this).retrievalLinkable.next;
					return class298_3_;
				}
			}
			((HashTable) this).retrievalLinkable = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sa.f(").append(')').toString());
		}
	}

	public int method5814(int i) {
		try {
			int i_4_ = 0;
			for (int i_5_ = 0; i_5_ < ((HashTable) this).size * 577108745; i_5_++) {
				Linkable class298 = ((HashTable) this).buckets[i_5_];
				for (Linkable class298_6_ = class298.next; class298 != class298_6_; class298_6_ = class298_6_.next)
					i_4_++;
			}
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sa.b(").append(')').toString());
		}
	}

	public Linkable method5815(byte i) {
		try {
			if (-1375920843 * ((HashTable) this).iterationIndex > 0 && (((HashTable) this).iterationLinkable != (((HashTable) this).buckets[((HashTable) this).iterationIndex * -1375920843 - 1]))) {
				Linkable class298 = ((HashTable) this).iterationLinkable;
				((HashTable) this).iterationLinkable = class298.next;
				return class298;
			}
			while_102_: do {
				Linkable class298;
				do {
					if (((HashTable) this).iterationIndex * -1375920843 >= 577108745 * ((HashTable) this).size)
						break while_102_;
					class298 = (((HashTable) this).buckets[((((HashTable) this).iterationIndex += -1552413411) * -1375920843) - 1].next);
				} while (class298 == (((HashTable) this).buckets[-1375920843 * ((HashTable) this).iterationIndex - 1]));
				((HashTable) this).iterationLinkable = class298.next;
				return class298;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sa.d(").append(')').toString());
		}
	}

	public Iterator iterator() {
		try {
			return new Class460(this);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sa.iterator(").append(')').toString());
		}
	}

	public Linkable method5816(int i) {
		try {
			((HashTable) this).iterationIndex = 0;
			return method5815((byte) 67);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sa.k(").append(')').toString());
		}
	}

	public void method5817(Linkable class298, long l) {
		try {
			if (null != class298.previous)
				class298.unlink(-1460969981);
			Linkable class298_7_ = (((HashTable) this).buckets[(int) (l & (long) (((HashTable) this).size * 577108745 - 1))]);
			class298.previous = class298_7_.previous;
			class298.next = class298_7_;
			class298.previous.next = class298;
			class298.next.previous = class298;
			class298.linkedKey = 4191220306876042991L * l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sa.p(").append(')').toString());
		}
	}

	public HashTable(int capacityi) {
		((HashTable) this).size = 1594491705 * capacityi;
		((HashTable) this).buckets = new Linkable[capacityi];
		for (int i_8_ = 0; i_8_ < capacityi; i_8_++) {
			Linkable class298 = ((HashTable) this).buckets[i_8_] = new Linkable();
			class298.next = class298;
			class298.previous = class298;
		}
	}

	static void method5818(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, boolean bool, int i_22_) {
		try {
			if (i_9_ != 0 && -1 != i_11_) {
				Entity class365_sub1_sub1_sub2 = null;
				if (i_9_ < 0) {
					int i_23_ = -i_9_ - 1;
					if (i_23_ == -442628795 * client.playerIndex)
						class365_sub1_sub1_sub2 = Class287.myPlayer;
					else
						class365_sub1_sub1_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_23_]);
				} else {
					int i_24_ = i_9_ - 1;
					Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_24_));
					if (class298_sub29 != null)
						class365_sub1_sub1_sub2 = ((Entity) class298_sub29.anObject7366);
				}
				if (class365_sub1_sub1_sub2 != null) {
					Class350 class350 = class365_sub1_sub1_sub2.method4426(95049522);
					if (null != class350.anIntArrayArray3710 && null != class350.anIntArrayArray3710[i_11_])
						i_12_ -= class350.anIntArrayArray3710[i_11_][1];
					if (class350.anIntArrayArray3753 != null && null != class350.anIntArrayArray3753[i_11_])
						i_12_ -= class350.anIntArrayArray3753[i_11_][1];
				}
			}
			Class365_Sub1_Sub1_Sub1 class365_sub1_sub1_sub1 = (new Class365_Sub1_Sub1_Sub1(client.aClass283_8716.method2675(-1611682495), i, Class375.basePlane * -191892109, Class375.basePlane * -191892109, i_14_, i_15_, i_12_, client.anInt8884 * 443738891 + i_18_, client.anInt8884 * 443738891 + i_19_, i_20_, i_21_, i_9_, i_10_, i_13_, bool, i_11_));
			class365_sub1_sub1_sub1.method4405(i_16_, i_17_, Class356.method4271(i_16_, i_17_, Class375.basePlane * -191892109, -968708982) - i_13_, 443738891 * client.anInt8884 + i_18_, 1068285759);
			client.aClass453_8824.method5935(new Class298_Sub37_Sub2(class365_sub1_sub1_sub1), 520361177);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sa.nu(").append(')').toString());
		}
	}
}
