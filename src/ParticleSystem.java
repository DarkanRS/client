import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ParticleSystem {

	static boolean[] aBoolArray7133 = new boolean[32];
	static boolean[] aBoolArray7134 = new boolean[8];
	long aLong7124;
	long aLong7123;
	boolean aBool7119 = false;
	boolean aBool7130 = false;
	public boolean aBool7132 = false;
	int size = 0;
	List aList7129 = new LinkedList();
	int anInt7126 = 0;
	List aList7127 = new LinkedList();
	int anInt7121 = 0;
	boolean aBool7128 = false;
	int anInt7122;
	Class151 aClass151_7131 = new Class151();
	Particle[] particles = new Particle[8192];

	void method11504(int i_1, boolean bool_2) {
		Class235.aList2896.add(this);
		this.aLong7124 = (long) i_1;
		this.aLong7123 = (long) i_1;
		this.aBool7119 = true;
		this.aBool7130 = bool_2;
	}

	public void method11505() {
		this.aBool7119 = true;
	}

	void method11506() {
		this.aBool7132 = true;
		Iterator iterator_1 = this.aList7127.iterator();

		while (iterator_1.hasNext()) {
			Node_Sub40 class282_sub40_3 = (Node_Sub40) iterator_1.next();
			if (class282_sub40_3.aClass345_8007.anInt4041 == 1) {
				class282_sub40_3.remove();
			}
		}

		for (int i_2 = 0; i_2 < this.particles.length; i_2++) {
			if (this.particles[i_2] != null) {
				this.particles[i_2].kill();
				this.particles[i_2] = null;
			}
		}

		this.size = 0;
		this.aList7129 = new LinkedList();
		this.anInt7126 = 0;
		this.aList7127 = new LinkedList();
		this.anInt7121 = 0;
	}

	void method11508() {
		this.aBool7128 = false;
	}

	boolean method11509(GraphicalRenderer graphicalrenderer_1, long long_2) {
		if (this.aLong7124 != this.aLong7123) {
			this.method11527();
		} else {
			this.method11508();
		}

		if (long_2 - this.aLong7124 > 750L) {
			this.method11506();
			return false;
		} else {
			int i_4 = (int) (long_2 - this.aLong7123);
			Iterator iterator_5;
			ParticleProducer class538_6;
			if (this.aBool7119) {
				iterator_5 = this.aList7129.iterator();

				while (iterator_5.hasNext()) {
					class538_6 = (ParticleProducer) iterator_5.next();

					for (int i_7 = 0; i_7 < class538_6.definition.anInt557; i_7++) {
						class538_6.method11493(graphicalrenderer_1, long_2, 1, !this.aBool7128, 1874029066);
					}
				}

				this.aBool7119 = false;
			}

			iterator_5 = this.aList7129.iterator();

			while (iterator_5.hasNext()) {
				class538_6 = (ParticleProducer) iterator_5.next();
				class538_6.method11493(graphicalrenderer_1, long_2, i_4, !this.aBool7128, 1118195717);
			}

			this.aLong7123 = long_2;
			return true;
		}
	}

	public void method11511(GraphicalRenderer graphicalrenderer_1, long long_2, ParticleEmitterConfig[] arr_4, SurfaceSkin[] arr_5) {
		if (!this.aBool7132) {
			this.method11541(graphicalrenderer_1, arr_4);
			this.method11513(arr_5);
			this.aLong7124 = long_2;
		}

	}

	public void method11512(long long_1) {
		this.aLong7124 = long_1;
	}

	void method11513(SurfaceSkin[] arr_1) {
		for (int i_3 = 0; i_3 < 8; i_3++) {
			aBoolArray7134[i_3] = false;
		}

		Iterator iterator_6 = this.aList7127.iterator();

		while (true) {
			label69: while (iterator_6.hasNext()) {
				Node_Sub40 class282_sub40_7 = (Node_Sub40) iterator_6.next();
				if (arr_1 != null) {
					for (int i_8 = 0; i_8 < arr_1.length; i_8++) {
						if (arr_1[i_8] == class282_sub40_7.aClass172_8009 || arr_1[i_8].aClass172_2114 == class282_sub40_7.aClass172_8009) {
							aBoolArray7134[i_8] = true;
							class282_sub40_7.method13298((byte) -28);
							continue label69;
						}
					}
				}

				if (!false) {
					class282_sub40_7.remove();
					--this.anInt7121;
					if (class282_sub40_7.isLinked()) {
						class282_sub40_7.remove();
						--Class235.anInt2898;
					}
				}
			}

			if (arr_1 != null) {
				for (int i_4 = 0; i_4 < arr_1.length && i_4 != 8 && this.anInt7121 != 8; i_4++) {
					if (!aBoolArray7134[i_4]) {
						Node_Sub40 class282_sub40_5 = null;
						if (arr_1[i_4].method2913(-1744283986).anInt4041 == 1 && Class235.anInt2898 < 32) {
							class282_sub40_5 = new Node_Sub40(arr_1[i_4], this);
							Class235.aClass465_2904.put(class282_sub40_5, (long) arr_1[i_4].anInt2115);
							++Class235.anInt2898;
						}

						if (class282_sub40_5 == null) {
							class282_sub40_5 = new Node_Sub40(arr_1[i_4], this);
						}

						this.aList7127.add(class282_sub40_5);
						++this.anInt7121;
						aBoolArray7134[i_4] = true;
					}
				}
			}

			return;
		}
	}

	public void method11515(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.anInt7122 = i_1;
	}

	void method11516(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2) {
		this.aClass151_7131.aClass464_1961.method7740();
		Iterator iterator_3 = this.aList7129.iterator();

		while (iterator_3.hasNext()) {
			ParticleProducer class538_4 = (ParticleProducer) iterator_3.next();
			class538_4.method11496(sceneobjectmanager_1, graphicalrenderer_2, this.aLong7123);
		}

	}

	public Class151 method11517() {
		return this.aClass151_7131;
	}

	public void method11527() {
		this.aBool7128 = true;
	}

	public Class151 method11533() {
		this.aClass151_7131.aClass464_1961.method7740();

		for (int i_1 = 0; i_1 < this.particles.length; i_1++) {
			if (this.particles[i_1] != null && this.particles[i_1].producer != null) {
				this.aClass151_7131.aClass464_1961.method7735(this.particles[i_1], -1474682277);
			}
		}

		return this.aClass151_7131;
	}

	ParticleSystem(int i_1, boolean bool_2) {
		this.method11504(i_1, bool_2);
	}

	void method11541(GraphicalRenderer graphicalrenderer_1, ParticleEmitterConfig[] arr_2) {
		for (int i_4 = 0; i_4 < 32; i_4++) {
			aBoolArray7133[i_4] = false;
		}

		Iterator iterator_7 = this.aList7129.iterator();

		while (true) {
			label60: while (iterator_7.hasNext()) {
				ParticleProducer class538_8 = (ParticleProducer) iterator_7.next();
				if (arr_2 != null) {
					for (int i_9 = 0; i_9 < arr_2.length; i_9++) {
						if (arr_2[i_9] == class538_8.aClass87_7110 || arr_2[i_9].aClass87_835 == class538_8.aClass87_7110) {
							aBoolArray7133[i_9] = true;
							class538_8.updatePosition((byte) 5);
							class538_8.aBool7107 = false;
							continue label60;
						}
					}
				}

				if (!false) {
					if (class538_8.particleCount == 0) {
						iterator_7.remove();
						--this.anInt7126;
					} else {
						class538_8.aBool7107 = true;
					}
				}
			}

			if (arr_2 != null) {
				for (int i_5 = 0; i_5 < arr_2.length && i_5 != 32 && this.anInt7126 != 32; i_5++) {
					if (!aBoolArray7133[i_5]) {
						ParticleProducer class538_6 = new ParticleProducer(graphicalrenderer_1, arr_2[i_5], this, this.aLong7124);
						this.aList7129.add(class538_6);
						++this.anInt7126;
						aBoolArray7133[i_5] = true;
					}
				}
			}

			return;
		}
	}

	public static ParticleSystem method11557(int i_0, boolean bool_1) {
		if (Class235.anInt2901 != Class235.anInt2899) {
			ParticleSystem class539_2 = Queue.aClass539Array5632[Class235.anInt2899];
			Class235.anInt2899 = Class235.anInt2899 + 1 & Class89.anIntArray931[Class235.anInt2906];
			class539_2.method11504(i_0, bool_1);
			return class539_2;
		} else {
			return new ParticleSystem(i_0, bool_1);
		}
	}

}
