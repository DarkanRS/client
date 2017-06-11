// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class2 {

	int method287() {
		return anIntArray47[0] % anInt33;
	}

	int method288() {
		return anIntArray47[0] / anInt33;
	}

	final void method289(boolean flag) {
		aBoolean36 = flag;
	}

	final void method290(boolean flag, boolean flag1, boolean flag2, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i, int j, int k, int l, float f18, float f19, float f20, int i1) {
		if (!flag) {
			method293(false, flag1, flag2, f, f1, f2, f3, f4, f5, f6, f7, f8, 0);
			return;
		}
		if (i1 != anInt37) {
			anIntArray30 = aClass_ra_Sub1_31.method5197(i1);
			if (anIntArray30 == null) {
				anInt19 = 255 - (i >> 24 & 0xff);
				int j1 = Class379.anIntArray4096[Class173.method1823(aClass_ra_Sub1_31.method5206(i1), (byte) 0) & 0xffff];
				int k1 = 0xff000000 | (i >> 16 & 0xff) * (j1 >> 16 & 0xff) << 8 & 0xff0000 | (i >> 8 & 0xff) * (j1 >> 8 & 0xff) & 0xff00 | (i & 0xff) * (j1 & 0xff) >> 8;
				method292(true, flag1, flag2, f, f1, f2, f3, f4, f5, f6, f7, f8, Class350.method4215(k1, l, f18, 0xfd870044), Class350.method4215(k1, l, f19, 0x2e32084c), Class350.method4215(k1, l, f20, 0x9dbcd924));
				return;
			}
			anInt39 = aClass_ra_Sub1_31.method5199(i1) ? 64 : aClass_ra_Sub1_31.anInt8002 * 0x420409cb;
			anInt40 = anInt39 - 1;
			anInt42 = aClass_ra_Sub1_31.method5214(i1);
			aBoolean43 = aClass_ra_Sub1_31.method5212(i1);
		}
		anInt18 = l;
		if (f > f1 || f > f2)
			if (f1 <= f2) {
				float f21 = f3;
				f3 = f4;
				f4 = f21;
				f21 = f;
				f = f1;
				f1 = f21;
				f21 = f6;
				f6 = f7;
				f7 = f21;
				f21 = f12;
				f12 = f13;
				f13 = f21;
				f21 = f15;
				f15 = f16;
				f16 = f21;
				f21 = f9;
				f9 = f10;
				f10 = f21;
				f21 = f18;
				f18 = f19;
				f19 = f21;
				int l1 = i;
				i = j;
				j = l1;
			} else {
				float f22 = f3;
				f3 = f5;
				f5 = f22;
				f22 = f;
				f = f2;
				f2 = f22;
				f22 = f6;
				f6 = f8;
				f8 = f22;
				f22 = f12;
				f12 = f14;
				f14 = f22;
				f22 = f15;
				f15 = f17;
				f17 = f22;
				f22 = f9;
				f9 = f11;
				f11 = f22;
				f22 = f18;
				f18 = f20;
				f20 = f22;
				int i2 = i;
				i = k;
				k = i2;
			}
		f12 /= f9;
		f13 /= f10;
		f14 /= f11;
		f15 /= f9;
		f16 /= f10;
		f17 /= f11;
		f6 = 1.0F / f6;
		f7 = 1.0F / f7;
		f8 = 1.0F / f8;
		f9 = 1.0F / f9;
		f10 = 1.0F / f10;
		f11 = 1.0F / f11;
		float f23 = i >> 24 & 0xff;
		float f24 = j >> 24 & 0xff;
		float f26 = k >> 24 & 0xff;
		float f27 = i >> 16 & 0xff;
		float f28 = j >> 16 & 0xff;
		float f30 = k >> 16 & 0xff;
		float f31 = i >> 8 & 0xff;
		float f32 = j >> 8 & 0xff;
		float f34 = k >> 8 & 0xff;
		float f35 = i & 0xff;
		float f36 = j & 0xff;
		float f38 = k & 0xff;
		float f39 = 0.0F;
		float f40 = 0.0F;
		float f41 = 0.0F;
		float f42 = 0.0F;
		float f43 = 0.0F;
		float f44 = 0.0F;
		float f45 = 0.0F;
		float f46 = 0.0F;
		float f47 = 0.0F;
		float f48 = 0.0F;
		if (f1 != f) {
			float f49 = f1 - f;
			f39 = (f4 - f3) / f49;
			f40 = (f7 - f6) / f49;
			f41 = (f10 - f9) / f49;
			f42 = (f13 - f12) / f49;
			f43 = (f16 - f15) / f49;
			f44 = (f19 - f18) / f49;
			f45 = (f24 - f23) / f49;
			f46 = (f28 - f27) / f49;
			f47 = (f32 - f31) / f49;
			f48 = (f36 - f35) / f49;
		}
		float f50 = 0.0F;
		float f51 = 0.0F;
		float f52 = 0.0F;
		float f53 = 0.0F;
		float f54 = 0.0F;
		float f55 = 0.0F;
		float f56 = 0.0F;
		float f57 = 0.0F;
		float f58 = 0.0F;
		float f59 = 0.0F;
		if (f2 != f1) {
			float f60 = f2 - f1;
			f50 = (f5 - f4) / f60;
			f51 = (f8 - f7) / f60;
			f52 = (f11 - f10) / f60;
			f53 = (f14 - f13) / f60;
			f54 = (f17 - f16) / f60;
			f55 = (f20 - f19) / f60;
			f56 = (f26 - f24) / f60;
			f57 = (f30 - f28) / f60;
			f58 = (f34 - f32) / f60;
			f59 = (f38 - f36) / f60;
		}
		float f61 = 0.0F;
		float f62 = 0.0F;
		float f63 = 0.0F;
		float f64 = 0.0F;
		float f65 = 0.0F;
		float f66 = 0.0F;
		float f67 = 0.0F;
		float f68 = 0.0F;
		float f69 = 0.0F;
		float f70 = 0.0F;
		if (f != f2) {
			float f71 = f - f2;
			f61 = (f3 - f5) / f71;
			f62 = (f6 - f8) / f71;
			f63 = (f9 - f11) / f71;
			f64 = (f12 - f14) / f71;
			f65 = (f15 - f17) / f71;
			f66 = (f18 - f20) / f71;
			f67 = (f23 - f26) / f71;
			f68 = (f27 - f30) / f71;
			f69 = (f31 - f34) / f71;
			f70 = (f35 - f38) / f71;
		}
		if (f >= (float) anInt38)
			return;
		if (f1 > (float) anInt38)
			f1 = anInt38;
		if (f2 > (float) anInt38)
			f2 = anInt38;
		if (f1 < f2) {
			f5 = f3;
			f8 = f6;
			f11 = f9;
			f14 = f12;
			f17 = f15;
			f20 = f18;
			f26 = f23;
			f30 = f27;
			f34 = f31;
			f38 = f35;
			if (f < 0.0F) {
				f3 -= f39 * f;
				f5 -= f61 * f;
				f6 -= f40 * f;
				f8 -= f62 * f;
				f9 -= f41 * f;
				f11 -= f63 * f;
				f12 -= f42 * f;
				f14 -= f64 * f;
				f15 -= f43 * f;
				f17 -= f65 * f;
				f18 -= f44 * f;
				f20 -= f66 * f;
				f23 -= f45 * f;
				f26 -= f67 * f;
				f27 -= f45 * f;
				f30 -= f67 * f;
				f31 -= f45 * f;
				f34 -= f67 * f;
				f35 -= f45 * f;
				f38 -= f67 * f;
				f = 0.0F;
			}
			if (f1 < 0.0F) {
				f4 -= f50 * f1;
				f7 -= f51 * f1;
				f10 -= f52 * f1;
				f13 -= f53 * f1;
				f16 -= f54 * f1;
				f19 -= f55 * f1;
				f24 -= f56 * f1;
				f28 -= f57 * f1;
				f32 -= f58 * f1;
				f36 -= f59 * f1;
				f1 = 0.0F;
			}
			if (f != f1 && f61 < f39 || f == f1 && f61 > f50) {
				f = (int) (f + 0.5F);
				f1 = (int) (f1 + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f1;
				f1 -= f;
				for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
					method295(flag1, flag2, anIntArray34, anIntArray30, (int) f, (int) f5, (int) f3, f8, f6, f11, f9, f14, f12, f17, f15, f20, f18, f26, f23, f30, f27, f34, f31, f38, f35);
					f3 += f39;
					f5 += f61;
					f6 += f40;
					f8 += f62;
					f9 += f41;
					f11 += f63;
					f12 += f42;
					f14 += f64;
					f15 += f43;
					f17 += f65;
					f18 += f44;
					f20 += f66;
					f23 += f45;
					f26 += f67;
					f27 += f46;
					f30 += f68;
					f31 += f47;
					f34 += f69;
					f35 += f48;
					f38 += f70;
				}

				while (--f2 >= 0.0F) {
					method295(flag1, flag2, anIntArray34, anIntArray30, (int) f, (int) f5, (int) f4, f8, f7, f11, f10, f14, f13, f17, f16, f20, f19, f26, f24, f30, f28, f34, f32, f38, f36);
					f4 += f50;
					f5 += f61;
					f7 += f51;
					f8 += f62;
					f10 += f52;
					f11 += f63;
					f13 += f53;
					f14 += f64;
					f16 += f54;
					f17 += f65;
					f19 += f55;
					f20 += f66;
					f24 += f56;
					f26 += f67;
					f28 += f57;
					f30 += f68;
					f32 += f58;
					f34 += f69;
					f36 += f59;
					f38 += f70;
					f += anInt33;
				}
			} else {
				f = (int) (f + 0.5F);
				f1 = (int) (f1 + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f1;
				f1 -= f;
				for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
					method295(flag1, flag2, anIntArray34, anIntArray30, (int) f, (int) f3, (int) f5, f6, f8, f9, f11, f12, f14, f15, f17, f18, f20, f23, f26, f27, f30, f31, f34, f35, f38);
					f3 += f39;
					f5 += f61;
					f6 += f40;
					f8 += f62;
					f9 += f41;
					f11 += f63;
					f12 += f42;
					f14 += f64;
					f15 += f43;
					f17 += f65;
					f18 += f44;
					f20 += f66;
					f23 += f45;
					f26 += f67;
					f27 += f46;
					f30 += f68;
					f31 += f47;
					f34 += f69;
					f35 += f48;
					f38 += f70;
				}

				while (--f2 >= 0.0F) {
					method295(flag1, flag2, anIntArray34, anIntArray30, (int) f, (int) f4, (int) f5, f7, f8, f10, f11, f13, f14, f16, f17, f19, f20, f24, f26, f28, f30, f32, f34, f36, f38);
					f4 += f50;
					f5 += f61;
					f7 += f51;
					f8 += f62;
					f10 += f52;
					f11 += f63;
					f13 += f53;
					f14 += f64;
					f16 += f54;
					f17 += f65;
					f19 += f55;
					f20 += f66;
					f24 += f56;
					f26 += f67;
					f28 += f57;
					f30 += f68;
					f32 += f58;
					f34 += f69;
					f36 += f59;
					f38 += f70;
					f += anInt33;
				}
			}
		} else {
			f4 = f3;
			f7 = f6;
			f10 = f9;
			f13 = f12;
			f16 = f15;
			f19 = f18;
			float f25 = f23;
			float f29 = f27;
			float f33 = f31;
			float f37 = f35;
			if (f < 0.0F) {
				f3 -= f39 * f;
				f4 -= f61 * f;
				f6 -= f40 * f;
				f7 -= f62 * f;
				f9 -= f41 * f;
				f10 -= f63 * f;
				f12 -= f42 * f;
				f13 -= f64 * f;
				f15 -= f43 * f;
				f16 -= f65 * f;
				f18 -= f44 * f;
				f19 -= f66 * f;
				f23 -= f45 * f;
				f25 -= f67 * f;
				f27 -= f45 * f;
				f29 -= f67 * f;
				f31 -= f45 * f;
				f33 -= f67 * f;
				f35 -= f45 * f;
				f37 -= f67 * f;
				f = 0.0F;
			}
			if (f2 < 0.0F) {
				f5 -= f50 * f2;
				f8 -= f51 * f2;
				f11 -= f52 * f2;
				f14 -= f53 * f2;
				f17 -= f54 * f2;
				f20 -= f55 * f2;
				f26 -= f56 * f2;
				f30 -= f57 * f2;
				f34 -= f58 * f2;
				f38 -= f59 * f2;
				f2 = 0.0F;
			}
			if (f != f2 && f61 < f39 || f == f2 && f50 > f39) {
				f = (int) (f + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f2;
				f2 -= f;
				for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
					method295(flag1, flag2, anIntArray34, anIntArray30, (int) f, (int) f4, (int) f3, f7, f6, f10, f9, f13, f12, f16, f15, f19, f18, f25, f23, f29, f27, f33, f31, f37, f35);
					f3 += f39;
					f4 += f61;
					f6 += f40;
					f7 += f62;
					f9 += f41;
					f10 += f63;
					f12 += f42;
					f13 += f64;
					f15 += f43;
					f16 += f65;
					f18 += f44;
					f19 += f66;
					f23 += f45;
					f25 += f67;
					f27 += f46;
					f29 += f68;
					f31 += f47;
					f33 += f69;
					f35 += f48;
					f37 += f70;
				}

				while (--f1 >= 0.0F) {
					method295(flag1, flag2, anIntArray34, anIntArray30, (int) f, (int) f5, (int) f3, f8, f6, f11, f9, f14, f12, f17, f15, f20, f18, f26, f23, f30, f27, f34, f31, f38, f35);
					f5 += f50;
					f3 += f39;
					f8 += f51;
					f6 += f40;
					f11 += f52;
					f9 += f41;
					f14 += f53;
					f12 += f42;
					f17 += f54;
					f15 += f43;
					f20 += f55;
					f18 += f44;
					f26 += f56;
					f23 += f45;
					f30 += f57;
					f27 += f46;
					f34 += f58;
					f31 += f47;
					f38 += f59;
					f35 += f48;
					f += anInt33;
				}
			} else {
				f = (int) (f + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f2;
				f2 -= f;
				for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
					method295(flag1, flag2, anIntArray34, anIntArray30, (int) f, (int) f3, (int) f4, f6, f7, f9, f10, f12, f13, f15, f16, f18, f19, f23, f25, f27, f29, f31, f33, f35, f37);
					f4 += f61;
					f3 += f39;
					f7 += f62;
					f6 += f40;
					f10 += f63;
					f9 += f41;
					f13 += f64;
					f12 += f42;
					f16 += f65;
					f15 += f43;
					f19 += f66;
					f18 += f44;
					f25 += f67;
					f23 += f45;
					f29 += f68;
					f27 += f46;
					f33 += f69;
					f31 += f47;
					f37 += f70;
					f35 += f48;
				}

				while (--f1 >= 0.0F) {
					method295(flag1, flag2, anIntArray34, anIntArray30, (int) f, (int) f3, (int) f5, f6, f8, f9, f11, f12, f14, f15, f17, f18, f20, f23, f26, f27, f30, f31, f34, f35, f38);
					f3 += f39;
					f5 += f50;
					f6 += f40;
					f8 += f51;
					f9 += f41;
					f11 += f52;
					f12 += f42;
					f14 += f53;
					f15 += f43;
					f17 += f54;
					f18 += f44;
					f20 += f55;
					f23 += f45;
					f26 += f56;
					f27 += f46;
					f30 += f57;
					f31 += f47;
					f34 += f58;
					f35 += f48;
					f38 += f59;
					f += anInt33;
				}
			}
		}
	}

	final void method291(boolean flag, boolean flag1, int ai[], int i, int j, int k, int l, int i1, float f, float f1, float f2, float f3) {
		if (aBoolean20) {
			if (i1 > anInt22)
				i1 = anInt22;
			if (l < 0)
				l = 0;
		}
		if (l >= i1)
			return;
		i += l - 1;
		f += f1 * (float) l;
		f2 += f3 * (float) l;
		if (aClass15_24.aBoolean207) {
			if (aBoolean16) {
				k = i1 - l >> 2;
				f1 *= 4F;
				if (anInt19 == 0) {
					if (k > 0)
						do {
							j = Class379.anIntArray4096[(int) f & 0xffff];
							f += f1;
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
						} while (--k > 0);
					k = i1 - l & 3;
					if (k > 0) {
						j = Class379.anIntArray4096[(int) f & 0xffff];
						do {
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
						} while (--k > 0);
					}
				} else {
					int j1 = anInt19;
					int j2 = 256 - anInt19;
					if (k > 0)
						do {
							j = Class379.anIntArray4096[(int) f & 0xffff];
							f += f1;
							j = ((j & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((j & 0xff00) * j2 >> 8 & 0xff00);
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								int j3 = ai[i];
								if (flag1)
									ai[i] = (j2 | j3 >> 24) << 24 | j + ((j3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j3 & 0xff00) * j1 >> 8 & 0xff00);
								else
									ai[i] = j + ((j3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j3 & 0xff00) * j1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								int k3 = ai[i];
								if (flag1)
									ai[i] = (j2 | k3 >> 24) << 24 | j + ((k3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((k3 & 0xff00) * j1 >> 8 & 0xff00);
								else
									ai[i] = j + ((k3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((k3 & 0xff00) * j1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								int l3 = ai[i];
								if (flag1)
									ai[i] = (j2 | l3 >> 24) << 24 | j + ((l3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((l3 & 0xff00) * j1 >> 8 & 0xff00);
								else
									ai[i] = j + ((l3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((l3 & 0xff00) * j1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								int i4 = ai[i];
								if (flag1)
									ai[i] = (j2 | i4 >> 24) << 24 | j + ((i4 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i4 & 0xff00) * j1 >> 8 & 0xff00);
								else
									ai[i] = j + ((i4 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i4 & 0xff00) * j1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
						} while (--k > 0);
					k = i1 - l & 3;
					if (k > 0) {
						j = Class379.anIntArray4096[(int) f & 0xffff];
						j = ((j & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((j & 0xff00) * j2 >> 8 & 0xff00);
						do {
							i++;
							if (!flag || f2 < aFloatArray35[i]) {
								int j4 = ai[i];
								if (flag1)
									ai[i] = (j2 | j4 >> 24) << 24 | j + ((j4 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j4 & 0xff00) * j1 >> 8 & 0xff00);
								else
									ai[i] = j + ((j4 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j4 & 0xff00) * j1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f2;
							}
							f2 += f3;
						} while (--k > 0);
					}
				}
			} else {
				k = i1 - l;
				if (anInt19 == 0) {
					do {
						i++;
						if (!flag || f2 < aFloatArray35[i]) {
							ai[i] = Class379.anIntArray4096[(int) f & 0xffff];
							if (flag)
								aFloatArray35[i] = f2;
						}
						f2 += f3;
						f += f1;
					} while (--k > 0);
				} else {
					int k1 = anInt19;
					int k2 = 256 - anInt19;
					do {
						i++;
						if (!flag || f2 < aFloatArray35[i]) {
							j = Class379.anIntArray4096[(int) f & 0xffff];
							j = ((j & 0xff00ff) * k2 >> 8 & 0xff00ff) + ((j & 0xff00) * k2 >> 8 & 0xff00);
							int k4 = ai[i];
							if (flag1)
								ai[i] = (k2 | k4 >> 24) << 24 | j + ((k4 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((k4 & 0xff00) * k1 >> 8 & 0xff00);
							else
								ai[i] = j + ((k4 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((k4 & 0xff00) * k1 >> 8 & 0xff00);
							if (flag)
								aFloatArray35[i] = f2;
						}
						f += f1;
						f2 += f3;
					} while (--k > 0);
				}
			}
		} else if (aBoolean16) {
			k = i1 - l >> 2;
			f1 *= 4F;
			if (anInt19 == 0) {
				if (k > 0)
					do {
						j = Class379.anIntArray4096[(int) f & 0xffff];
						f += f1;
						i++;
						if (!flag || f2 < aFloatArray35[i])
							ai[i] = j;
						f2 += f3;
						i++;
						if (!flag || f2 < aFloatArray35[i])
							ai[i] = j;
						f2 += f3;
						i++;
						if (!flag || f2 < aFloatArray35[i])
							ai[i] = j;
						f2 += f3;
						i++;
						if (!flag || f2 < aFloatArray35[i])
							ai[i] = j;
						f2 += f3;
					} while (--k > 0);
				k = i1 - l & 3;
				if (k > 0) {
					j = Class379.anIntArray4096[(int) f & 0xffff];
					do {
						i++;
						if (!flag || f2 < aFloatArray35[i])
							ai[i] = j;
						f2 += f3;
					} while (--k > 0);
				}
			} else {
				int l1 = anInt19;
				int l2 = 256 - anInt19;
				if (k > 0)
					do {
						j = Class379.anIntArray4096[(int) f & 0xffff];
						f += f1;
						j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
						i++;
						if (!flag || f2 < aFloatArray35[i]) {
							int l4 = ai[i];
							if (flag1)
								ai[i] = (l2 | l4 >> 24) << 24 | j + ((l4 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((l4 & 0xff00) * l1 >> 8 & 0xff00);
							else
								ai[i] = j + ((l4 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((l4 & 0xff00) * l1 >> 8 & 0xff00);
						}
						f2 += f3;
						i++;
						if (!flag || f2 < aFloatArray35[i]) {
							int i5 = ai[i];
							if (flag1)
								ai[i] = (l2 | i5 >> 24) << 24 | j + ((i5 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((i5 & 0xff00) * l1 >> 8 & 0xff00);
							else
								ai[i] = j + ((i5 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((i5 & 0xff00) * l1 >> 8 & 0xff00);
						}
						f2 += f3;
						i++;
						if (!flag || f2 < aFloatArray35[i]) {
							int j5 = ai[i];
							if (flag1)
								ai[i] = (l2 | j5 >> 24) << 24 | j + ((j5 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((j5 & 0xff00) * l1 >> 8 & 0xff00);
							else
								ai[i] = j + ((j5 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((j5 & 0xff00) * l1 >> 8 & 0xff00);
						}
						f2 += f3;
						i++;
						if (!flag || f2 < aFloatArray35[i]) {
							int k5 = ai[i];
							if (flag1)
								ai[i] = (l2 | k5 >> 24) << 24 | j + ((k5 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((k5 & 0xff00) * l1 >> 8 & 0xff00);
							else
								ai[i] = j + ((k5 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((k5 & 0xff00) * l1 >> 8 & 0xff00);
						}
						f2 += f3;
					} while (--k > 0);
				k = i1 - l & 3;
				if (k > 0) {
					j = Class379.anIntArray4096[(int) f & 0xffff];
					j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
					do {
						i++;
						if (!flag || f2 < aFloatArray35[i]) {
							int l5 = ai[i];
							if (flag1)
								ai[i] = (l2 | l5 >> 24) << 24 | j + ((l5 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((l5 & 0xff00) * l1 >> 8 & 0xff00);
							else
								ai[i] = j + ((l5 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((l5 & 0xff00) * l1 >> 8 & 0xff00);
						}
						f2 += f3;
					} while (--k > 0);
				}
			}
		} else {
			k = i1 - l;
			if (anInt19 == 0) {
				do {
					i++;
					if (!flag || f2 < aFloatArray35[i])
						ai[i] = Class379.anIntArray4096[(int) f & 0xffff];
					f2 += f3;
					f += f1;
				} while (--k > 0);
			} else {
				int i2 = anInt19;
				int i3 = 256 - anInt19;
				do {
					i++;
					if (!flag || f2 < aFloatArray35[i]) {
						j = Class379.anIntArray4096[(int) f & 0xffff];
						j = ((j & 0xff00ff) * i3 >> 8 & 0xff00ff) + ((j & 0xff00) * i3 >> 8 & 0xff00);
						int i6 = ai[i];
						if (flag1)
							ai[i] = (i3 | i6 >> 24) << 24 | j + ((i6 & 0xff00ff) * i2 >> 8 & 0xff00ff) + ((i6 & 0xff00) * i2 >> 8 & 0xff00);
						else
							ai[i] = j + ((i6 & 0xff00ff) * i2 >> 8 & 0xff00ff) + ((i6 & 0xff00) * i2 >> 8 & 0xff00);
					}
					f += f1;
					f2 += f3;
				} while (--k > 0);
			}
		}
	}

	final void method292(boolean flag, boolean flag1, boolean flag2, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int j, int k) {
		if (!flag) {
			method293(false, flag1, flag2, f, f1, f2, f3, f4, f5, f6, f7, f8, 0);
			return;
		}
		if (aBoolean36) {
			aClass_ra_Sub1_31.method5018((int) f3, (int) f, (int) f4, (int) f1, 0xff000000 | i, 0x1056d89d);
			aClass_ra_Sub1_31.method5018((int) f4, (int) f1, (int) f5, (int) f2, 0xff000000 | i, 0x7597bb76);
			aClass_ra_Sub1_31.method5018((int) f5, (int) f2, (int) f3, (int) f, 0xff000000 | i, 0x72651f80);
			return;
		}
		float f9 = f4 - f3;
		float f10 = f1 - f;
		float f11 = f5 - f3;
		float f12 = f2 - f;
		float f13 = f7 - f6;
		float f14 = f8 - f6;
		float f15 = (j & 0xff0000) - (i & 0xff0000);
		float f16 = (k & 0xff0000) - (i & 0xff0000);
		float f17 = (j & 0xff00) - (i & 0xff00);
		float f18 = (k & 0xff00) - (i & 0xff00);
		float f19 = (j & 0xff) - (i & 0xff);
		float f20 = (k & 0xff) - (i & 0xff);
		float f21;
		if (f2 != f1)
			f21 = (f5 - f4) / (f2 - f1);
		else
			f21 = 0.0F;
		float f22;
		if (f1 != f)
			f22 = f9 / f10;
		else
			f22 = 0.0F;
		float f23;
		if (f2 != f)
			f23 = f11 / f12;
		else
			f23 = 0.0F;
		float f24 = f9 * f12 - f11 * f10;
		if (f24 == 0.0F)
			return;
		float f25 = (f13 * f12 - f14 * f10) / f24;
		float f26 = (f14 * f9 - f13 * f11) / f24;
		float f27 = (f15 * f12 - f16 * f10) / f24;
		float f28 = (f16 * f9 - f15 * f11) / f24;
		float f29 = (f17 * f12 - f18 * f10) / f24;
		float f30 = (f18 * f9 - f17 * f11) / f24;
		float f31 = (f19 * f12 - f20 * f10) / f24;
		float f32 = (f20 * f9 - f19 * f11) / f24;
		if (f <= f1 && f <= f2) {
			if (f >= (float) anInt38)
				return;
			if (f1 > (float) anInt38)
				f1 = anInt38;
			if (f2 > (float) anInt38)
				f2 = anInt38;
			f6 = (f6 - f25 * f3) + f25;
			float f33 = ((float) (i & 0xff0000) - f27 * f3) + f27;
			float f36 = ((float) (i & 0xff00) - f29 * f3) + f29;
			float f39 = ((float) (i & 0xff) - f31 * f3) + f31;
			if (f1 < f2) {
				f5 = f3;
				if (f < 0.0F) {
					f5 -= f23 * f;
					f3 -= f22 * f;
					f6 -= f26 * f;
					f33 -= f28 * f;
					f36 -= f30 * f;
					f39 -= f32 * f;
					f = 0.0F;
				}
				if (f1 < 0.0F) {
					f4 -= f21 * f1;
					f1 = 0.0F;
				}
				if (f != f1 && f23 < f22 || f == f1 && f23 > f21) {
					f = (int) (f + 0.5F);
					f1 = (int) (f1 + 0.5F);
					f2 = (float) (int) (f2 + 0.5F) - f1;
					f1 -= f;
					for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
						method298(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f5, (int) f3, f6, f25, f33, f27, f36, f29, f39, f31);
						f5 += f23;
						f3 += f22;
						f6 += f26;
						f33 += f28;
						f36 += f30;
						f39 += f32;
					}

					while (--f2 >= 0.0F) {
						method298(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f5, (int) f4, f6, f25, f33, f27, f36, f29, f39, f31);
						f5 += f23;
						f4 += f21;
						f6 += f26;
						f33 += f28;
						f36 += f30;
						f39 += f32;
						f += anInt33;
					}
					return;
				}
				f = (int) (f + 0.5F);
				f1 = (int) (f1 + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f1;
				f1 -= f;
				for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
					method298(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f3, (int) f5, f6, f25, f33, f27, f36, f29, f39, f31);
					f5 += f23;
					f3 += f22;
					f6 += f26;
					f33 += f28;
					f36 += f30;
					f39 += f32;
				}

				while (--f2 >= 0.0F) {
					method298(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f4, (int) f5, f6, f25, f33, f27, f36, f29, f39, f31);
					f5 += f23;
					f4 += f21;
					f6 += f26;
					f33 += f28;
					f36 += f30;
					f39 += f32;
					f += anInt33;
				}
				return;
			}
			f4 = f3;
			if (f < 0.0F) {
				f4 -= f23 * f;
				f3 -= f22 * f;
				f6 -= f26 * f;
				f33 -= f28 * f;
				f36 -= f30 * f;
				f39 -= f32 * f;
				f = 0.0F;
			}
			if (f2 < 0.0F) {
				f5 -= f21 * f2;
				f2 = 0.0F;
			}
			if (f != f2 && f23 < f22 || f == f2 && f21 > f22) {
				f = (int) (f + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f2;
				f2 -= f;
				for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
					method298(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f4, (int) f3, f6, f25, f33, f27, f36, f29, f39, f31);
					f4 += f23;
					f3 += f22;
					f6 += f26;
					f33 += f28;
					f36 += f30;
					f39 += f32;
				}

				while (--f1 >= 0.0F) {
					method298(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f5, (int) f3, f6, f25, f33, f27, f36, f29, f39, f31);
					f5 += f21;
					f3 += f22;
					f6 += f26;
					f33 += f28;
					f36 += f30;
					f39 += f32;
					f += anInt33;
				}
				return;
			}
			f = (int) (f + 0.5F);
			f2 = (int) (f2 + 0.5F);
			f1 = (float) (int) (f1 + 0.5F) - f2;
			f2 -= f;
			for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
				method298(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f3, (int) f4, f6, f25, f33, f27, f36, f29, f39, f31);
				f4 += f23;
				f3 += f22;
				f6 += f26;
				f33 += f28;
				f36 += f30;
				f39 += f32;
			}

			while (--f1 >= 0.0F) {
				method298(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f3, (int) f5, f6, f25, f33, f27, f36, f29, f39, f31);
				f5 += f21;
				f3 += f22;
				f6 += f26;
				f33 += f28;
				f36 += f30;
				f39 += f32;
				f += anInt33;
			}
			return;
		}
		if (f1 <= f2) {
			if (f1 >= (float) anInt38)
				return;
			if (f2 > (float) anInt38)
				f2 = anInt38;
			if (f > (float) anInt38)
				f = anInt38;
			f7 = (f7 - f25 * f4) + f25;
			float f34 = ((float) (j & 0xff0000) - f27 * f4) + f27;
			float f37 = ((float) (j & 0xff00) - f29 * f4) + f29;
			float f40 = ((float) (j & 0xff) - f31 * f4) + f31;
			if (f2 < f) {
				f3 = f4;
				if (f1 < 0.0F) {
					f3 -= f22 * f1;
					f4 -= f21 * f1;
					f7 -= f26 * f1;
					f34 -= f28 * f1;
					f37 -= f30 * f1;
					f40 -= f32 * f1;
					f1 = 0.0F;
				}
				if (f2 < 0.0F) {
					f5 -= f23 * f2;
					f2 = 0.0F;
				}
				if (f1 != f2 && f22 < f21 || f1 == f2 && f22 > f23) {
					f1 = (int) (f1 + 0.5F);
					f2 = (int) (f2 + 0.5F);
					f = (float) (int) (f + 0.5F) - f2;
					f2 -= f1;
					for (f1 = anIntArray47[(int) f1]; --f2 >= 0.0F; f1 += anInt33) {
						method298(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f3, (int) f4, f7, f25, f34, f27, f37, f29, f40, f31);
						f3 += f22;
						f4 += f21;
						f7 += f26;
						f34 += f28;
						f37 += f30;
						f40 += f32;
					}

					while (--f >= 0.0F) {
						method298(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f3, (int) f5, f7, f25, f34, f27, f37, f29, f40, f31);
						f3 += f22;
						f5 += f23;
						f7 += f26;
						f34 += f28;
						f37 += f30;
						f40 += f32;
						f1 += anInt33;
					}
					return;
				}
				f1 = (int) (f1 + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f = (float) (int) (f + 0.5F) - f2;
				f2 -= f1;
				for (f1 = anIntArray47[(int) f1]; --f2 >= 0.0F; f1 += anInt33) {
					method298(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f4, (int) f3, f7, f25, f34, f27, f37, f29, f40, f31);
					f3 += f22;
					f4 += f21;
					f7 += f26;
					f34 += f28;
					f37 += f30;
					f40 += f32;
				}

				while (--f >= 0.0F) {
					method298(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f5, (int) f3, f7, f25, f34, f27, f37, f29, f40, f31);
					f3 += f22;
					f5 += f23;
					f7 += f26;
					f34 += f28;
					f37 += f30;
					f40 += f32;
					f1 += anInt33;
				}
				return;
			}
			f5 = f4;
			if (f1 < 0.0F) {
				f5 -= f22 * f1;
				f4 -= f21 * f1;
				f7 -= f26 * f1;
				f34 -= f28 * f1;
				f37 -= f30 * f1;
				f40 -= f32 * f1;
				f1 = 0.0F;
			}
			if (f < 0.0F) {
				f3 -= f23 * f;
				f = 0.0F;
			}
			if (f22 < f21) {
				f1 = (int) (f1 + 0.5F);
				f = (int) (f + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f;
				f -= f1;
				for (f1 = anIntArray47[(int) f1]; --f >= 0.0F; f1 += anInt33) {
					method298(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f5, (int) f4, f7, f25, f34, f27, f37, f29, f40, f31);
					f5 += f22;
					f4 += f21;
					f7 += f26;
					f34 += f28;
					f37 += f30;
					f40 += f32;
				}

				while (--f2 >= 0.0F) {
					method298(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f3, (int) f4, f7, f25, f34, f27, f37, f29, f40, f31);
					f3 += f23;
					f4 += f21;
					f7 += f26;
					f34 += f28;
					f37 += f30;
					f40 += f32;
					f1 += anInt33;
				}
				return;
			}
			f1 = (int) (f1 + 0.5F);
			f = (int) (f + 0.5F);
			f2 = (float) (int) (f2 + 0.5F) - f;
			f -= f1;
			for (f1 = anIntArray47[(int) f1]; --f >= 0.0F; f1 += anInt33) {
				method298(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f4, (int) f5, f7, f25, f34, f27, f37, f29, f40, f31);
				f5 += f22;
				f4 += f21;
				f7 += f26;
				f34 += f28;
				f37 += f30;
				f40 += f32;
			}

			while (--f2 >= 0.0F) {
				method298(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f4, (int) f3, f7, f25, f34, f27, f37, f29, f40, f31);
				f3 += f23;
				f4 += f21;
				f7 += f26;
				f34 += f28;
				f37 += f30;
				f40 += f32;
				f1 += anInt33;
			}
			return;
		}
		if (f2 >= (float) anInt38)
			return;
		if (f > (float) anInt38)
			f = anInt38;
		if (f1 > (float) anInt38)
			f1 = anInt38;
		f8 = (f8 - f25 * f5) + f25;
		float f35 = ((float) (k & 0xff0000) - f27 * f5) + f27;
		float f38 = ((float) (k & 0xff00) - f29 * f5) + f29;
		float f41 = ((float) (k & 0xff) - f31 * f5) + f31;
		if (f < f1) {
			f4 = f5;
			if (f2 < 0.0F) {
				f4 -= f21 * f2;
				f5 -= f23 * f2;
				f8 -= f26 * f2;
				f35 -= f28 * f2;
				f38 -= f30 * f2;
				f41 -= f32 * f2;
				f2 = 0.0F;
			}
			if (f < 0.0F) {
				f3 -= f22 * f;
				f = 0.0F;
			}
			if (f21 < f23) {
				f2 = (int) (f2 + 0.5F);
				f = (int) (f + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f;
				f -= f2;
				for (f2 = anIntArray47[(int) f2]; --f >= 0.0F; f2 += anInt33) {
					method298(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f4, (int) f5, f8, f25, f35, f27, f38, f29, f41, f31);
					f4 += f21;
					f5 += f23;
					f8 += f26;
					f35 += f28;
					f38 += f30;
					f41 += f32;
				}

				while (--f1 >= 0.0F) {
					method298(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f4, (int) f3, f8, f25, f35, f27, f38, f29, f41, f31);
					f4 += f21;
					f3 += f22;
					f8 += f26;
					f35 += f28;
					f38 += f30;
					f41 += f32;
					f2 += anInt33;
				}
				return;
			}
			f2 = (int) (f2 + 0.5F);
			f = (int) (f + 0.5F);
			f1 = (float) (int) (f1 + 0.5F) - f;
			f -= f2;
			for (f2 = anIntArray47[(int) f2]; --f >= 0.0F; f2 += anInt33) {
				method298(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f5, (int) f4, f8, f25, f35, f27, f38, f29, f41, f31);
				f4 += f21;
				f5 += f23;
				f8 += f26;
				f35 += f28;
				f38 += f30;
				f41 += f32;
			}

			while (--f1 >= 0.0F) {
				method298(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f3, (int) f4, f8, f25, f35, f27, f38, f29, f41, f31);
				f4 += f21;
				f3 += f22;
				f8 += f26;
				f35 += f28;
				f38 += f30;
				f41 += f32;
				f2 += anInt33;
			}
			return;
		}
		f3 = f5;
		if (f2 < 0.0F) {
			f3 -= f21 * f2;
			f5 -= f23 * f2;
			f8 -= f26 * f2;
			f35 -= f28 * f2;
			f38 -= f30 * f2;
			f41 -= f32 * f2;
			f2 = 0.0F;
		}
		if (f1 < 0.0F) {
			f4 -= f22 * f1;
			f1 = 0.0F;
		}
		if (f21 < f23) {
			f2 = (int) (f2 + 0.5F);
			f1 = (int) (f1 + 0.5F);
			f = (float) (int) (f + 0.5F) - f1;
			f1 -= f2;
			for (f2 = anIntArray47[(int) f2]; --f1 >= 0.0F; f2 += anInt33) {
				method298(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f3, (int) f5, f8, f25, f35, f27, f38, f29, f41, f31);
				f3 += f21;
				f5 += f23;
				f8 += f26;
				f35 += f28;
				f38 += f30;
				f41 += f32;
			}

			while (--f >= 0.0F) {
				method298(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f4, (int) f5, f8, f25, f35, f27, f38, f29, f41, f31);
				f4 += f22;
				f5 += f23;
				f8 += f26;
				f35 += f28;
				f38 += f30;
				f41 += f32;
				f2 += anInt33;
			}
			return;
		}
		f2 = (int) (f2 + 0.5F);
		f1 = (int) (f1 + 0.5F);
		f = (float) (int) (f + 0.5F) - f1;
		f1 -= f2;
		for (f2 = anIntArray47[(int) f2]; --f1 >= 0.0F; f2 += anInt33) {
			method298(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f5, (int) f3, f8, f25, f35, f27, f38, f29, f41, f31);
			f3 += f21;
			f5 += f23;
			f8 += f26;
			f35 += f28;
			f38 += f30;
			f41 += f32;
		}

		while (--f >= 0.0F) {
			method298(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f5, (int) f4, f8, f25, f35, f27, f38, f29, f41, f31);
			f4 += f22;
			f5 += f23;
			f8 += f26;
			f35 += f28;
			f38 += f30;
			f41 += f32;
			f2 += anInt33;
		}
	}

	final void method293(boolean flag, boolean flag1, boolean flag2, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
		if (aBoolean36) {
			aClass_ra_Sub1_31.method5018((int) f3, (int) f, (int) f4, (int) f1, i, 0x7d7e6428);
			aClass_ra_Sub1_31.method5018((int) f4, (int) f1, (int) f5, (int) f2, i, 0x7b60a0e5);
			aClass_ra_Sub1_31.method5018((int) f5, (int) f2, (int) f3, (int) f, i, 0x77f7f4fd);
			return;
		}
		float f9 = f4 - f3;
		float f10 = f1 - f;
		float f11 = f5 - f3;
		float f12 = f2 - f;
		float f13 = f7 - f6;
		float f14 = f8 - f6;
		float f15 = 0.0F;
		if (f1 != f)
			f15 = (f4 - f3) / (f1 - f);
		float f16 = 0.0F;
		if (f2 != f1)
			f16 = (f5 - f4) / (f2 - f1);
		float f17 = 0.0F;
		if (f2 != f)
			f17 = (f3 - f5) / (f - f2);
		float f18 = f9 * f12 - f11 * f10;
		if (f18 == 0.0F)
			return;
		float f19 = (f13 * f12 - f14 * f10) / f18;
		float f20 = (f14 * f9 - f13 * f11) / f18;
		if (f <= f1 && f <= f2) {
			if (f >= (float) anInt38)
				return;
			if (f1 > (float) anInt38)
				f1 = anInt38;
			if (f2 > (float) anInt38)
				f2 = anInt38;
			f6 = (f6 - f19 * f3) + f19;
			if (f1 < f2) {
				f5 = f3;
				if (f < 0.0F) {
					f5 -= f17 * f;
					f3 -= f15 * f;
					f6 -= f20 * f;
					f = 0.0F;
				}
				if (f1 < 0.0F) {
					f4 -= f16 * f1;
					f1 = 0.0F;
				}
				if (f != f1 && f17 < f15 || f == f1 && f17 > f16) {
					f = (int) (f + 0.5F);
					f1 = (int) (f1 + 0.5F);
					f2 = (float) (int) (f2 + 0.5F) - f1;
					f1 -= f;
					for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
						method294(flag, flag1, flag2, anIntArray34, (int) f, i, 0, (int) f5, (int) f3, f6, f19);
						f5 += f17;
						f3 += f15;
						f6 += f20;
					}

					while (--f2 >= 0.0F) {
						method294(flag, flag1, flag2, anIntArray34, (int) f, i, 0, (int) f5, (int) f4, f6, f19);
						f5 += f17;
						f4 += f16;
						f6 += f20;
						f += anInt33;
					}
					return;
				}
				f = (int) (f + 0.5F);
				f1 = (int) (f1 + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f1;
				f1 -= f;
				for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
					method294(flag, flag1, flag2, anIntArray34, (int) f, i, 0, (int) f3, (int) f5, f6, f19);
					f5 += f17;
					f3 += f15;
					f6 += f20;
				}

				while (--f2 >= 0.0F) {
					method294(flag, flag1, flag2, anIntArray34, (int) f, i, 0, (int) f4, (int) f5, f6, f19);
					f5 += f17;
					f4 += f16;
					f6 += f20;
					f += anInt33;
				}
				return;
			}
			f4 = f3;
			if (f < 0.0F) {
				f4 -= f17 * f;
				f3 -= f15 * f;
				f6 -= f20 * f;
				f = 0.0F;
			}
			if (f2 < 0.0F) {
				f5 -= f16 * f2;
				f2 = 0.0F;
			}
			if (f != f2 && f17 < f15 || f == f2 && f16 > f15) {
				f = (int) (f + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f2;
				f2 -= f;
				for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
					method294(flag, flag1, flag2, anIntArray34, (int) f, i, 0, (int) f4, (int) f3, f6, f19);
					f4 += f17;
					f3 += f15;
					f6 += f20;
				}

				while (--f1 >= 0.0F) {
					method294(flag, flag1, flag2, anIntArray34, (int) f, i, 0, (int) f5, (int) f3, f6, f19);
					f5 += f16;
					f3 += f15;
					f6 += f20;
					f += anInt33;
				}
				return;
			}
			f = (int) (f + 0.5F);
			f2 = (int) (f2 + 0.5F);
			f1 = (float) (int) (f1 + 0.5F) - f2;
			f2 -= f;
			for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
				method294(flag, flag1, flag2, anIntArray34, (int) f, i, 0, (int) f3, (int) f4, f6, f19);
				f4 += f17;
				f3 += f15;
				f6 += f20;
			}

			while (--f1 >= 0.0F) {
				method294(flag, flag1, flag2, anIntArray34, (int) f, i, 0, (int) f3, (int) f5, f6, f19);
				f5 += f16;
				f3 += f15;
				f6 += f20;
				f += anInt33;
			}
			return;
		}
		if (f1 <= f2) {
			if (f1 >= (float) anInt38)
				return;
			if (f2 > (float) anInt38)
				f2 = anInt38;
			if (f > (float) anInt38)
				f = anInt38;
			f7 = (f7 - f19 * f4) + f19;
			if (f2 < f) {
				f3 = f4;
				if (f1 < 0.0F) {
					f3 -= f15 * f1;
					f4 -= f16 * f1;
					f7 -= f20 * f1;
					f1 = 0.0F;
				}
				if (f2 < 0.0F) {
					f5 -= f17 * f2;
					f2 = 0.0F;
				}
				if (f1 != f2 && f15 < f16 || f1 == f2 && f15 > f17) {
					f1 = (int) (f1 + 0.5F);
					f2 = (int) (f2 + 0.5F);
					f = (float) (int) (f + 0.5F) - f2;
					f2 -= f1;
					for (f1 = anIntArray47[(int) f1]; --f2 >= 0.0F; f1 += anInt33) {
						method294(flag, flag1, flag2, anIntArray34, (int) f1, i, 0, (int) f3, (int) f4, f7, f19);
						f3 += f15;
						f4 += f16;
						f7 += f20;
					}

					while (--f >= 0.0F) {
						method294(flag, flag1, flag2, anIntArray34, (int) f1, i, 0, (int) f3, (int) f5, f7, f19);
						f3 += f15;
						f5 += f17;
						f7 += f20;
						f1 += anInt33;
					}
					return;
				}
				f1 = (int) (f1 + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f = (float) (int) (f + 0.5F) - f2;
				f2 -= f1;
				for (f1 = anIntArray47[(int) f1]; --f2 >= 0.0F; f1 += anInt33) {
					method294(flag, flag1, flag2, anIntArray34, (int) f1, i, 0, (int) f4, (int) f3, f7, f19);
					f3 += f15;
					f4 += f16;
					f7 += f20;
				}

				while (--f >= 0.0F) {
					method294(flag, flag1, flag2, anIntArray34, (int) f1, i, 0, (int) f5, (int) f3, f7, f19);
					f3 += f15;
					f5 += f17;
					f7 += f20;
					f1 += anInt33;
				}
				return;
			}
			f5 = f4;
			if (f1 < 0.0F) {
				f5 -= f15 * f1;
				f4 -= f16 * f1;
				f7 -= f20 * f1;
				f1 = 0.0F;
			}
			if (f < 0.0F) {
				f3 -= f17 * f;
				f = 0.0F;
			}
			if (f15 < f16) {
				f1 = (int) (f1 + 0.5F);
				f = (int) (f + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f;
				f -= f1;
				for (f1 = anIntArray47[(int) f1]; --f >= 0.0F; f1 += anInt33) {
					method294(flag, flag1, flag2, anIntArray34, (int) f1, i, 0, (int) f5, (int) f4, f7, f19);
					f5 += f15;
					f4 += f16;
					f7 += f20;
				}

				while (--f2 >= 0.0F) {
					method294(flag, flag1, flag2, anIntArray34, (int) f1, i, 0, (int) f3, (int) f4, f7, f19);
					f3 += f17;
					f4 += f16;
					f7 += f20;
					f1 += anInt33;
				}
				return;
			}
			f1 = (int) (f1 + 0.5F);
			f = (int) (f + 0.5F);
			f2 = (float) (int) (f2 + 0.5F) - f;
			f -= f1;
			for (f1 = anIntArray47[(int) f1]; --f >= 0.0F; f1 += anInt33) {
				method294(flag, flag1, flag2, anIntArray34, (int) f1, i, 0, (int) f4, (int) f5, f7, f19);
				f5 += f15;
				f4 += f16;
				f7 += f20;
			}

			while (--f2 >= 0.0F) {
				method294(flag, flag1, flag2, anIntArray34, (int) f1, i, 0, (int) f4, (int) f3, f7, f19);
				f3 += f17;
				f4 += f16;
				f7 += f20;
				f1 += anInt33;
			}
			return;
		}
		if (f2 >= (float) anInt38)
			return;
		if (f > (float) anInt38)
			f = anInt38;
		if (f1 > (float) anInt38)
			f1 = anInt38;
		f8 = (f8 - f19 * f5) + f19;
		if (f < f1) {
			f4 = f5;
			if (f2 < 0.0F) {
				f4 -= f16 * f2;
				f5 -= f17 * f2;
				f8 -= f20 * f2;
				f2 = 0.0F;
			}
			if (f < 0.0F) {
				f3 -= f15 * f;
				f = 0.0F;
			}
			if (f16 < f17) {
				f2 = (int) (f2 + 0.5F);
				f = (int) (f + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f;
				f -= f2;
				for (f2 = anIntArray47[(int) f2]; --f >= 0.0F; f2 += anInt33) {
					method294(flag, flag1, flag2, anIntArray34, (int) f2, i, 0, (int) f4, (int) f5, f8, f19);
					f4 += f16;
					f5 += f17;
					f8 += f20;
				}

				while (--f1 >= 0.0F) {
					method294(flag, flag1, flag2, anIntArray34, (int) f2, i, 0, (int) f4, (int) f3, f8, f19);
					f4 += f16;
					f3 += f15;
					f8 += f20;
					f2 += anInt33;
				}
				return;
			}
			f2 = (int) (f2 + 0.5F);
			f = (int) (f + 0.5F);
			f1 = (float) (int) (f1 + 0.5F) - f;
			f -= f2;
			for (f2 = anIntArray47[(int) f2]; --f >= 0.0F; f2 += anInt33) {
				method294(flag, flag1, flag2, anIntArray34, (int) f2, i, 0, (int) f5, (int) f4, f8, f19);
				f4 += f16;
				f5 += f17;
				f8 += f20;
			}

			while (--f1 >= 0.0F) {
				method294(flag, flag1, flag2, anIntArray34, (int) f2, i, 0, (int) f3, (int) f4, f8, f19);
				f4 += f16;
				f3 += f15;
				f8 += f20;
				f2 += anInt33;
			}
			return;
		}
		f3 = f5;
		if (f2 < 0.0F) {
			f3 -= f16 * f2;
			f5 -= f17 * f2;
			f8 -= f20 * f2;
			f2 = 0.0F;
		}
		if (f1 < 0.0F) {
			f4 -= f15 * f1;
			f1 = 0.0F;
		}
		if (f16 < f17) {
			f2 = (int) (f2 + 0.5F);
			f1 = (int) (f1 + 0.5F);
			f = (float) (int) (f + 0.5F) - f1;
			f1 -= f2;
			for (f2 = anIntArray47[(int) f2]; --f1 >= 0.0F; f2 += anInt33) {
				method294(flag, flag1, flag2, anIntArray34, (int) f2, i, 0, (int) f3, (int) f5, f8, f19);
				f3 += f16;
				f5 += f17;
				f8 += f20;
			}

			while (--f >= 0.0F) {
				method294(flag, flag1, flag2, anIntArray34, (int) f2, i, 0, (int) f4, (int) f5, f8, f19);
				f4 += f15;
				f5 += f17;
				f8 += f20;
				f2 += anInt33;
			}
			return;
		}
		f2 = (int) (f2 + 0.5F);
		f1 = (int) (f1 + 0.5F);
		f = (float) (int) (f + 0.5F) - f1;
		f1 -= f2;
		for (f2 = anIntArray47[(int) f2]; --f1 >= 0.0F; f2 += anInt33) {
			method294(flag, flag1, flag2, anIntArray34, (int) f2, i, 0, (int) f5, (int) f3, f8, f19);
			f3 += f16;
			f5 += f17;
			f8 += f20;
		}

		while (--f >= 0.0F) {
			method294(flag, flag1, flag2, anIntArray34, (int) f2, i, 0, (int) f5, (int) f4, f8, f19);
			f4 += f15;
			f5 += f17;
			f8 += f20;
			f2 += anInt33;
		}
	}

	final void method294(boolean flag, boolean flag1, boolean flag2, int ai[], int i, int j, int k, int l, int i1, float f, float f1) {
		if (aBoolean20) {
			if (i1 > anInt22)
				i1 = anInt22;
			if (l < 0)
				l = 0;
		}
		if (l >= i1)
			return;
		i += l - 1;
		k = i1 - l >> 2;
		f += f1 * (float) l;
		if (aClass15_24.aBoolean207) {
			if (anInt19 == 0) {
				for (; --k >= 0; f += f1) {
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						if (flag)
							ai[i] = j;
						if (flag1)
							aFloatArray35[i] = f;
					}
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						if (flag)
							ai[i] = j;
						if (flag1)
							aFloatArray35[i] = f;
					}
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						if (flag)
							ai[i] = j;
						if (flag1)
							aFloatArray35[i] = f;
					}
					f += f1;
					i++;
					if (flag1 && f >= aFloatArray35[i])
						continue;
					if (flag)
						ai[i] = j;
					if (flag1)
						aFloatArray35[i] = f;
				}

				for (k = i1 - l & 3; --k >= 0;) {
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						if (flag)
							ai[i] = j;
						if (flag1)
							aFloatArray35[i] = f;
					}
					f += f1;
				}

			} else if (anInt19 == 254) {
				if (l == 0 || i1 > anInt22 - 1)
					return;
				while (--k >= 0) {
					i++;
					if ((!flag1 || f < aFloatArray35[i]) && flag)
						ai[i - 1] = ai[i];
					f += f1;
					i++;
					if ((!flag1 || f < aFloatArray35[i]) && flag)
						ai[i - 1] = ai[i];
					f += f1;
					i++;
					if ((!flag1 || f < aFloatArray35[i]) && flag)
						ai[i - 1] = ai[i];
					f += f1;
					i++;
					if ((!flag1 || f < aFloatArray35[i]) && flag)
						ai[i - 1] = ai[i];
					f += f1;
				}
				for (k = i1 - l & 3; --k >= 0;) {
					i++;
					if ((!flag1 || f < aFloatArray35[i]) && flag)
						ai[i - 1] = ai[i];
					f += f1;
				}

			} else {
				int j1 = anInt19;
				int l1 = 256 - anInt19;
				j = ((j & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((j & 0xff00) * l1 >> 8 & 0xff00);
				for (; --k >= 0; f += f1) {
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						if (flag) {
							int j2 = ai[i];
							if (flag2)
								ai[i] = (l1 | j2 >> 24) << 24 | j + ((j2 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j2 & 0xff00) * j1 >> 8 & 0xff00);
							else
								ai[i] = j + ((j2 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j2 & 0xff00) * j1 >> 8 & 0xff00);
						}
						if (flag1)
							aFloatArray35[i] = f;
					}
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						if (flag) {
							int k2 = ai[i];
							if (flag2)
								ai[i] = (l1 | k2 >> 24) << 24 | j + ((k2 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((k2 & 0xff00) * j1 >> 8 & 0xff00);
							else
								ai[i] = j + ((k2 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((k2 & 0xff00) * j1 >> 8 & 0xff00);
						}
						if (flag1)
							aFloatArray35[i] = f;
					}
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						if (flag) {
							int l2 = ai[i];
							if (flag2)
								ai[i] = (l1 | l2 >> 24) << 24 | j + ((l2 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((l2 & 0xff00) * j1 >> 8 & 0xff00);
							else
								ai[i] = j + ((l2 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((l2 & 0xff00) * j1 >> 8 & 0xff00);
						}
						if (flag1)
							aFloatArray35[i] = f;
					}
					f += f1;
					i++;
					if (flag1 && f >= aFloatArray35[i])
						continue;
					if (flag) {
						int i3 = ai[i];
						if (flag2)
							ai[i] = (l1 | i3 >> 24) << 24 | j + ((i3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i3 & 0xff00) * j1 >> 8 & 0xff00);
						else
							ai[i] = j + ((i3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i3 & 0xff00) * j1 >> 8 & 0xff00);
					}
					if (flag1)
						aFloatArray35[i] = f;
				}

				for (k = i1 - l & 3; --k >= 0;) {
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						if (flag) {
							int j3 = ai[i];
							if (flag2)
								ai[i] = (l1 | j3 >> 24) << 24 | j + ((j3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j3 & 0xff00) * j1 >> 8 & 0xff00);
							else
								ai[i] = j + ((j3 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j3 & 0xff00) * j1 >> 8 & 0xff00);
						}
						if (flag1)
							aFloatArray35[i] = f;
					}
					f += f1;
				}

			}
		} else if (flag)
			if (anInt19 == 0) {
				while (--k >= 0) {
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i] = j;
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i] = j;
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i] = j;
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i] = j;
					f += f1;
				}
				for (k = i1 - l & 3; --k >= 0;) {
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i] = j;
					f += f1;
				}

			} else if (anInt19 == 254) {
				if (l == 0 || i1 > anInt22 - 1)
					return;
				while (--k >= 0) {
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i - 1] = ai[i];
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i - 1] = ai[i];
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i - 1] = ai[i];
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i - 1] = ai[i];
					f += f1;
				}
				for (k = i1 - l & 3; --k >= 0;) {
					i++;
					if (!flag1 || f < aFloatArray35[i])
						ai[i - 1] = ai[i];
					f += f1;
				}

			} else {
				int k1 = anInt19;
				int i2 = 256 - anInt19;
				j = ((j & 0xff00ff) * i2 >> 8 & 0xff00ff) + ((j & 0xff00) * i2 >> 8 & 0xff00);
				for (; --k >= 0; f += f1) {
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						int k3 = ai[i];
						if (flag2)
							ai[i] = (i2 | k3 >> 24) << 24 | j + ((k3 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((k3 & 0xff00) * k1 >> 8 & 0xff00);
						else
							ai[i] = j + ((k3 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((k3 & 0xff00) * k1 >> 8 & 0xff00);
					}
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						int l3 = ai[i];
						if (flag2)
							ai[i] = (i2 | l3 >> 24) << 24 | j + ((l3 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((l3 & 0xff00) * k1 >> 8 & 0xff00);
						else
							ai[i] = j + ((l3 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((l3 & 0xff00) * k1 >> 8 & 0xff00);
					}
					f += f1;
					i++;
					if (!flag1 || f < aFloatArray35[i]) {
						int i4 = ai[i];
						if (flag2)
							ai[i] = (i2 | i4 >> 24) << 24 | j + ((i4 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((i4 & 0xff00) * k1 >> 8 & 0xff00);
						else
							ai[i] = j + ((i4 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((i4 & 0xff00) * k1 >> 8 & 0xff00);
					}
					f += f1;
					i++;
					if (flag1 && f >= aFloatArray35[i])
						continue;
					int j4 = ai[i];
					if (flag2)
						ai[i] = (i2 | j4 >> 24) << 24 | j + ((j4 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((j4 & 0xff00) * k1 >> 8 & 0xff00);
					else
						ai[i] = j + ((j4 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((j4 & 0xff00) * k1 >> 8 & 0xff00);
				}

				for (k = i1 - l & 3; --k >= 0; f += f1) {
					i++;
					if (flag1 && f >= aFloatArray35[i])
						continue;
					int k4 = ai[i];
					if (flag2)
						ai[i] = (i2 | k4 >> 24) << 24 | j + ((k4 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((k4 & 0xff00) * k1 >> 8 & 0xff00);
					else
						ai[i] = j + ((k4 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((k4 & 0xff00) * k1 >> 8 & 0xff00);
				}

			}
	}

	final void method295(boolean flag, boolean flag1, int ai[], int ai1[], int i, int j, int k, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
		int l = k - j;
		float f18 = 1.0F / (float) l;
		float f19 = (f1 - f) * f18;
		float f20 = (f3 - f2) * f18;
		float f21 = (f5 - f4) * f18;
		float f22 = (f7 - f6) * f18;
		float f23 = (f9 - f8) * f18;
		float f24 = (f11 - f10) * f18;
		float f25 = (f13 - f12) * f18;
		float f26 = (f15 - f14) * f18;
		float f27 = (f17 - f16) * f18;
		if (aBoolean20) {
			if (k > anInt22)
				k = anInt22;
			if (j < 0) {
				f -= f19 * (float) j;
				f2 -= f20 * (float) j;
				f4 -= f21 * (float) j;
				f6 -= f22 * (float) j;
				f8 -= f23 * (float) j;
				f10 -= f24 * (float) j;
				f12 -= f25 * (float) j;
				f14 -= f26 * (float) j;
				f16 -= f27 * (float) j;
				j = 0;
			}
		}
		if (j >= k)
			return;
		l = k - j;
		i += j;
		while (l-- > 0) {
			float f28 = 1.0F / f;
			float f29 = 1.0F / f2;
			if (!flag || f28 < aFloatArray35[i]) {
				int i1 = (int) (f4 * f29 * (float) anInt39);
				if (aBoolean43)
					i1 &= anInt40;
				else if (i1 < 0)
					i1 = 0;
				else if (i1 > anInt40)
					i1 = anInt40;
				int j1 = (int) (f6 * f29 * (float) anInt39);
				if (aBoolean43)
					j1 &= anInt40;
				else if (j1 < 0)
					j1 = 0;
				else if (j1 > anInt40)
					j1 = anInt40;
				int k1 = anIntArray30[j1 * anInt39 + i1];
				int l1 = 255;
				if (anInt42 == 2)
					l1 = k1 >> 24 & 0xff;
				else if (anInt42 == 1)
					l1 = k1 != 0 ? 255 : 0;
				else
					l1 = (int) f10;
				if (l1 != 0)
					if (l1 != 255) {
						int i2 = 0xff000000 | (int) (f12 * (float) (k1 >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f14 * (float) (k1 >> 8 & 0xff)) & 0xff00 | (int) (f16 * (float) (k1 & 0xff)) >> 8;
						if (f8 != 0.0F) {
							int k2 = (int) (255F - f8);
							int j3 = ((anInt18 & 0xff00ff) * (int) f8 & 0xff00ff00 | (anInt18 & 0xff00) * (int) f8 & 0xff0000) >>> 8;
							i2 = (((i2 & 0xff00ff) * k2 & 0xff00ff00 | (i2 & 0xff00) * k2 & 0xff0000) >>> 8) + j3;
						}
						int l2 = ai[i];
						int k3 = 255 - l1;
						i2 = ((l2 & 0xff00ff) * k3 + (i2 & 0xff00ff) * l1 & 0xff00ff00) + ((l2 & 0xff00) * k3 + (i2 & 0xff00) * l1 & 0xff0000) >> 8;
						if (flag1)
							ai[i] = (l1 | ai[i] >> 24) << 24 | i2;
						else
							ai[i] = i2;
						if (flag)
							aFloatArray35[i] = f28;
					} else {
						int j2 = 0xff000000 | (int) (f12 * (float) (k1 >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f14 * (float) (k1 >> 8 & 0xff)) & 0xff00 | (int) (f16 * (float) (k1 & 0xff)) >> 8;
						if (f8 != 0.0F) {
							int i3 = (int) (255F - f8);
							int l3 = ((anInt18 & 0xff00ff) * (int) f8 & 0xff00ff00 | (anInt18 & 0xff00) * (int) f8 & 0xff0000) >>> 8;
							j2 = (((j2 & 0xff00ff) * i3 & 0xff00ff00 | (j2 & 0xff00) * i3 & 0xff0000) >>> 8) + l3;
						}
						if (flag1)
							ai[i] = l1 << 24 | j2;
						else
							ai[i] = j2;
						if (flag)
							aFloatArray35[i] = f28;
					}
			}
			i++;
			f += f19;
			f2 += f20;
			f4 += f21;
			f6 += f22;
			f8 += f23;
			f10 += f24;
			f12 += f25;
			f14 += f26;
			f16 += f27;
		}
	}

	final void method296(boolean flag, boolean flag1, boolean flag2, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i, int j, int k, int l, float f18, float f19, float f20, int i1, float f21, int j1, float f22, int k1, float f23) {
		if (!flag) {
			method293(false, flag1, flag2, f, f1, f2, f3, f4, f5, f6, f7, f8, 0);
			return;
		}
		anInt18 = l;
		if (f > f1 || f > f2)
			if (f1 <= f2) {
				float f24 = f3;
				f3 = f4;
				f4 = f24;
				f24 = f;
				f = f1;
				f1 = f24;
				f24 = f6;
				f6 = f7;
				f7 = f24;
				f24 = f12;
				f12 = f13;
				f13 = f24;
				f24 = f15;
				f15 = f16;
				f16 = f24;
				f24 = f9;
				f9 = f10;
				f10 = f24;
				f24 = f18;
				f18 = f19;
				f19 = f24;
				f24 = f21;
				f21 = f22;
				f22 = f24;
				int k2 = i;
				i = j;
				j = k2;
				k2 = i1;
				i1 = j1;
				j1 = k2;
			} else {
				float f25 = f3;
				f3 = f5;
				f5 = f25;
				f25 = f;
				f = f2;
				f2 = f25;
				f25 = f6;
				f6 = f8;
				f8 = f25;
				f25 = f12;
				f12 = f14;
				f14 = f25;
				f25 = f15;
				f15 = f17;
				f17 = f25;
				f25 = f9;
				f9 = f11;
				f11 = f25;
				f25 = f18;
				f18 = f20;
				f20 = f25;
				f25 = f21;
				f21 = f23;
				f23 = f25;
				int l2 = i;
				i = k;
				k = l2;
				l2 = i1;
				i1 = k1;
				k1 = l2;
			}
		if (i1 != anInt37) {
			anIntArray30 = aClass_ra_Sub1_31.method5197(i1);
			if (anIntArray30 == null) {
				anInt19 = 255 - (i >> 24 & 0xff);
				int l1 = Class379.anIntArray4096[Class173.method1823(aClass_ra_Sub1_31.method5206(i1), (byte) 0) & 0xffff];
				int i3 = 0xff000000 | (i >> 16 & 0xff) * (l1 >> 16 & 0xff) << 8 & 0xff0000 | (i >> 8 & 0xff) * (l1 >> 8 & 0xff) & 0xff00 | (i & 0xff) * (l1 & 0xff) >> 8;
				method292(true, flag1, flag2, f, f1, f2, f3, f4, f5, f6, f7, f8, Class350.method4215(i3, l, f18, 0xaaa0d14), Class350.method4215(i3, l, f19, 0xf7bb874), Class350.method4215(i3, l, f20, 0x6d5bab31));
				return;
			}
			anInt39 = aClass_ra_Sub1_31.method5199(i1) ? 64 : aClass_ra_Sub1_31.anInt8002 * 0x420409cb;
			anInt40 = anInt39 - 1;
			anInt42 = aClass_ra_Sub1_31.method5214(i1);
		}
		aFloat41 = f21;
		if (j1 != anInt44) {
			anIntArray45 = aClass_ra_Sub1_31.method5197(j1);
			if (anIntArray45 == null) {
				anInt19 = 255 - (i >> 24 & 0xff);
				int i2 = Class379.anIntArray4096[Class173.method1823(aClass_ra_Sub1_31.method5206(j1), (byte) 0) & 0xffff];
				int j3 = 0xff000000 | (i >> 16 & 0xff) * (i2 >> 16 & 0xff) << 8 & 0xff0000 | (i >> 8 & 0xff) * (i2 >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i2 & 0xff) >> 8;
				method292(true, flag1, flag2, f, f1, f2, f3, f4, f5, f6, f7, f8, Class350.method4215(j3, l, f18, 0xbf6771d4), Class350.method4215(j3, l, f19, 0x743e4ce9), Class350.method4215(j3, l, f20, 0xadd0746a));
				return;
			}
			anInt29 = aClass_ra_Sub1_31.method5199(j1) ? 64 : aClass_ra_Sub1_31.anInt8002 * 0x420409cb;
			anInt28 = anInt29 - 1;
		}
		aFloat32 = f22;
		if (k1 != anInt49) {
			anIntArray50 = aClass_ra_Sub1_31.method5197(k1);
			if (anIntArray50 == null) {
				anInt19 = 255 - (i >> 24 & 0xff);
				int j2 = Class379.anIntArray4096[Class173.method1823(aClass_ra_Sub1_31.method5206(k1), (byte) 0) & 0xffff];
				int k3 = 0xff000000 | (i >> 16 & 0xff) * (j2 >> 16 & 0xff) << 8 & 0xff0000 | (i >> 8 & 0xff) * (j2 >> 8 & 0xff) & 0xff00 | (i & 0xff) * (j2 & 0xff) >> 8;
				method292(true, flag1, flag2, (int) f, (int) f1, (int) f2, (int) f3, (int) f4, (int) f5, (int) f6, (int) f7, (int) f8, Class350.method4215(k3, l, f18, 0x8ea57cce), Class350.method4215(k3, l, f19, 0x9d545dce), Class350.method4215(k3, l, f20, 0x5621e01));
				return;
			}
			anInt51 = aClass_ra_Sub1_31.method5199(k1) ? 64 : aClass_ra_Sub1_31.anInt8002 * 0x420409cb;
			anInt52 = anInt51 - 1;
		}
		aFloat53 = f23;
		f12 /= f9;
		f13 /= f10;
		f14 /= f11;
		f15 /= f9;
		f16 /= f10;
		f17 /= f11;
		f6 = 1.0F / f6;
		f7 = 1.0F / f7;
		f8 = 1.0F / f8;
		f9 = 1.0F / f9;
		f10 = 1.0F / f10;
		f11 = 1.0F / f11;
		float f26 = i >> 24 & 0xff;
		float f27 = j >> 24 & 0xff;
		float f29 = k >> 24 & 0xff;
		float f30 = i >> 16 & 0xff;
		float f31 = j >> 16 & 0xff;
		float f33 = k >> 16 & 0xff;
		float f34 = i >> 8 & 0xff;
		float f35 = j >> 8 & 0xff;
		float f37 = k >> 8 & 0xff;
		float f38 = i & 0xff;
		float f39 = j & 0xff;
		float f41 = k & 0xff;
		float f42 = 1.0F;
		float f43 = 0.0F;
		float f45 = 0.0F;
		float f46 = 0.0F;
		float f47 = 1.0F;
		float f49 = 0.0F;
		float f50 = 0.0F;
		float f51 = 0.0F;
		float f52 = 0.0F;
		float f53 = 0.0F;
		float f54 = 0.0F;
		float f55 = 0.0F;
		float f56 = 0.0F;
		float f57 = 0.0F;
		float f58 = 0.0F;
		float f59 = 0.0F;
		float f60 = 0.0F;
		float f61 = 0.0F;
		if (f1 != f) {
			float f62 = f1 - f;
			f50 = (f4 - f3) / f62;
			f51 = (f7 - f6) / f62;
			f52 = (f10 - f9) / f62;
			f53 = (f13 - f12) / f62;
			f54 = (f16 - f15) / f62;
			f55 = (f19 - f18) / f62;
			f56 = (f27 - f26) / f62;
			f57 = (f31 - f30) / f62;
			f58 = (f35 - f34) / f62;
			f59 = (f39 - f38) / f62;
			f60 = (f43 - f42) / f62;
			f61 = (f47 - f46) / f62;
		}
		float f63 = 0.0F;
		float f64 = 0.0F;
		float f65 = 0.0F;
		float f66 = 0.0F;
		float f67 = 0.0F;
		float f68 = 0.0F;
		float f69 = 0.0F;
		float f70 = 0.0F;
		float f71 = 0.0F;
		float f72 = 0.0F;
		float f73 = 0.0F;
		float f74 = 0.0F;
		if (f2 != f1) {
			float f75 = f2 - f1;
			f63 = (f5 - f4) / f75;
			f64 = (f8 - f7) / f75;
			f65 = (f11 - f10) / f75;
			f66 = (f14 - f13) / f75;
			f67 = (f17 - f16) / f75;
			f68 = (f20 - f19) / f75;
			f69 = (f29 - f27) / f75;
			f70 = (f33 - f31) / f75;
			f71 = (f37 - f35) / f75;
			f72 = (f41 - f39) / f75;
			f73 = (f45 - f43) / f75;
			f74 = (f49 - f47) / f75;
		}
		float f76 = 0.0F;
		float f77 = 0.0F;
		float f78 = 0.0F;
		float f79 = 0.0F;
		float f80 = 0.0F;
		float f81 = 0.0F;
		float f82 = 0.0F;
		float f83 = 0.0F;
		float f84 = 0.0F;
		float f85 = 0.0F;
		float f86 = 0.0F;
		float f87 = 0.0F;
		if (f != f2) {
			float f88 = f - f2;
			f76 = (f3 - f5) / f88;
			f77 = (f6 - f8) / f88;
			f78 = (f9 - f11) / f88;
			f79 = (f12 - f14) / f88;
			f80 = (f15 - f17) / f88;
			f81 = (f18 - f20) / f88;
			f82 = (f26 - f29) / f88;
			f83 = (f30 - f33) / f88;
			f84 = (f34 - f37) / f88;
			f85 = (f38 - f41) / f88;
			f86 = (f42 - f45) / f88;
			f87 = (f46 - f49) / f88;
		}
		if (f >= (float) anInt38)
			return;
		if (f1 > (float) anInt38)
			f1 = anInt38;
		if (f2 > (float) anInt38)
			f2 = anInt38;
		if (f1 < f2) {
			f5 = f3;
			f8 = f6;
			f11 = f9;
			f14 = f12;
			f17 = f15;
			f20 = f18;
			f29 = f26;
			f33 = f30;
			f37 = f34;
			f41 = f38;
			f45 = f42;
			f49 = f46;
			if (f < 0.0F) {
				f3 -= f50 * f;
				f5 -= f76 * f;
				f6 -= f51 * f;
				f8 -= f77 * f;
				f9 -= f52 * f;
				f11 -= f78 * f;
				f12 -= f53 * f;
				f14 -= f79 * f;
				f15 -= f54 * f;
				f17 -= f80 * f;
				f18 -= f55 * f;
				f20 -= f81 * f;
				f26 -= f56 * f;
				f29 -= f82 * f;
				f30 -= f57 * f;
				f33 -= f83 * f;
				f34 -= f58 * f;
				f37 -= f84 * f;
				f38 -= f59 * f;
				f41 -= f85 * f;
				f42 -= f60 * f;
				f45 -= f86 * f;
				f46 -= f61 * f;
				f49 -= f87 * f;
				f = 0.0F;
			}
			if (f1 < 0.0F) {
				f4 -= f63 * f1;
				f7 -= f64 * f1;
				f10 -= f65 * f1;
				f13 -= f66 * f1;
				f16 -= f67 * f1;
				f19 -= f68 * f1;
				f27 -= f69 * f1;
				f31 -= f70 * f1;
				f35 -= f71 * f1;
				f39 -= f72 * f1;
				f43 -= f73 * f1;
				f47 -= f74 * f1;
				f1 = 0.0F;
			}
			if (f != f1 && f76 < f50 || f == f1 && f76 > f63) {
				f = (int) (f + 0.5F);
				f1 = (int) (f1 + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f1;
				f1 -= f;
				for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
					method297(flag1, flag2, anIntArray34, (int) f, (int) f5, (int) f3, f8, f6, f11, f9, f14, f12, f17, f15, f20, f18, f29, f26, f33, f30, f37, f34, f41, f38, f45, f42, f49, f46);
					f3 += f50;
					f5 += f76;
					f6 += f51;
					f8 += f77;
					f9 += f52;
					f11 += f78;
					f12 += f53;
					f14 += f79;
					f15 += f54;
					f17 += f80;
					f18 += f55;
					f20 += f81;
					f26 += f56;
					f29 += f82;
					f30 += f57;
					f33 += f83;
					f34 += f58;
					f37 += f84;
					f38 += f59;
					f41 += f85;
					f42 += f60;
					f45 += f86;
					f46 += f61;
					f49 += f87;
				}

				while (--f2 >= 0.0F) {
					method297(flag1, flag2, anIntArray34, (int) f, (int) f5, (int) f4, f8, f7, f11, f10, f14, f13, f17, f16, f20, f19, f29, f27, f33, f31, f37, f35, f41, f39, f45, f43, f49, f47);
					f4 += f63;
					f5 += f76;
					f7 += f64;
					f8 += f77;
					f10 += f65;
					f11 += f78;
					f13 += f66;
					f14 += f79;
					f16 += f67;
					f17 += f80;
					f19 += f68;
					f20 += f81;
					f27 += f69;
					f29 += f82;
					f31 += f70;
					f33 += f83;
					f35 += f71;
					f37 += f84;
					f39 += f72;
					f41 += f85;
					f43 += f73;
					f45 += f86;
					f47 += f74;
					f49 += f87;
					f += anInt33;
				}
			} else {
				f = (int) (f + 0.5F);
				f1 = (int) (f1 + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f1;
				f1 -= f;
				for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
					method297(flag1, flag2, anIntArray34, (int) f, (int) f3, (int) f5, f6, f8, f9, f11, f12, f14, f15, f17, f18, f20, f26, f29, f30, f33, f34, f37, f38, f41, f42, f45, f46, f49);
					f3 += f50;
					f5 += f76;
					f6 += f51;
					f8 += f77;
					f9 += f52;
					f11 += f78;
					f12 += f53;
					f14 += f79;
					f15 += f54;
					f17 += f80;
					f18 += f55;
					f20 += f81;
					f26 += f56;
					f29 += f82;
					f30 += f57;
					f33 += f83;
					f34 += f58;
					f37 += f84;
					f38 += f59;
					f41 += f85;
					f42 += f60;
					f45 += f86;
					f46 += f61;
					f49 += f87;
				}

				while (--f2 >= 0.0F) {
					method297(flag1, flag2, anIntArray34, (int) f, (int) f4, (int) f5, f7, f8, f10, f11, f13, f14, f16, f17, f19, f20, f27, f29, f31, f33, f35, f37, f39, f41, f43, f45, f47, f49);
					f4 += f63;
					f5 += f76;
					f7 += f64;
					f8 += f77;
					f10 += f65;
					f11 += f78;
					f13 += f66;
					f14 += f79;
					f16 += f67;
					f17 += f80;
					f19 += f68;
					f20 += f81;
					f27 += f69;
					f29 += f82;
					f31 += f70;
					f33 += f83;
					f35 += f71;
					f37 += f84;
					f39 += f72;
					f41 += f85;
					f43 += f73;
					f45 += f86;
					f47 += f74;
					f49 += f87;
					f += anInt33;
				}
			}
		} else {
			f4 = f3;
			f7 = f6;
			f10 = f9;
			f13 = f12;
			f16 = f15;
			f19 = f18;
			float f28 = f26;
			float f32 = f30;
			float f36 = f34;
			float f40 = f38;
			float f44 = f42;
			float f48 = f46;
			if (f < 0.0F) {
				f3 -= f50 * f;
				f4 -= f76 * f;
				f6 -= f51 * f;
				f7 -= f77 * f;
				f9 -= f52 * f;
				f10 -= f78 * f;
				f12 -= f53 * f;
				f13 -= f79 * f;
				f15 -= f54 * f;
				f16 -= f80 * f;
				f18 -= f55 * f;
				f19 -= f81 * f;
				f26 -= f56 * f;
				f28 -= f82 * f;
				f30 -= f57 * f;
				f32 -= f83 * f;
				f34 -= f58 * f;
				f36 -= f84 * f;
				f38 -= f59 * f;
				f40 -= f85 * f;
				f42 -= f60 * f;
				f44 -= f86 * f;
				f46 -= f61 * f;
				f48 -= f87 * f;
				f = 0.0F;
			}
			if (f2 < 0.0F) {
				f5 -= f63 * f2;
				f8 -= f64 * f2;
				f11 -= f65 * f2;
				f14 -= f66 * f2;
				f17 -= f67 * f2;
				f20 -= f68 * f2;
				f29 -= f69 * f2;
				f33 -= f70 * f2;
				f37 -= f71 * f2;
				f41 -= f72 * f2;
				f45 -= f73 * f2;
				f49 -= f74 * f2;
				f2 = 0.0F;
			}
			if (f != f2 && f76 < f50 || f == f2 && f63 > f50) {
				f = (int) (f + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f2;
				f2 -= f;
				for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
					method297(flag1, flag2, anIntArray34, (int) f, (int) f4, (int) f3, f7, f6, f10, f9, f13, f12, f16, f15, f19, f18, f28, f26, f32, f30, f36, f34, f40, f38, f44, f42, f48, f46);
					f3 += f50;
					f4 += f76;
					f6 += f51;
					f7 += f77;
					f9 += f52;
					f10 += f78;
					f12 += f53;
					f13 += f79;
					f15 += f54;
					f16 += f80;
					f18 += f55;
					f19 += f81;
					f26 += f56;
					f28 += f82;
					f30 += f57;
					f32 += f83;
					f34 += f58;
					f36 += f84;
					f38 += f59;
					f40 += f85;
					f42 += f60;
					f44 += f86;
					f46 += f61;
					f48 += f87;
				}

				while (--f1 >= 0.0F) {
					method297(flag1, flag2, anIntArray34, (int) f, (int) f5, (int) f3, f8, f6, f11, f9, f14, f12, f17, f15, f20, f18, f29, f26, f33, f30, f37, f34, f41, f38, f45, f42, f49, f46);
					f5 += f63;
					f3 += f50;
					f8 += f64;
					f6 += f51;
					f11 += f65;
					f9 += f52;
					f14 += f66;
					f12 += f53;
					f17 += f67;
					f15 += f54;
					f20 += f68;
					f18 += f55;
					f29 += f69;
					f26 += f56;
					f33 += f70;
					f30 += f57;
					f37 += f71;
					f34 += f58;
					f41 += f72;
					f38 += f59;
					f45 += f73;
					f42 += f60;
					f49 += f74;
					f46 += f61;
					f += anInt33;
				}
			} else {
				f = (int) (f + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f2;
				f2 -= f;
				for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
					method297(flag1, flag2, anIntArray34, (int) f, (int) f3, (int) f4, f6, f7, f9, f10, f12, f13, f15, f16, f18, f19, f26, f28, f30, f32, f34, f36, f38, f40, f42, f44, f46, f48);
					f4 += f76;
					f3 += f50;
					f7 += f77;
					f6 += f51;
					f10 += f78;
					f9 += f52;
					f13 += f79;
					f12 += f53;
					f16 += f80;
					f15 += f54;
					f19 += f81;
					f18 += f55;
					f28 += f82;
					f26 += f56;
					f32 += f83;
					f30 += f57;
					f36 += f84;
					f34 += f58;
					f40 += f85;
					f38 += f59;
					f44 += f86;
					f42 += f60;
					f48 += f87;
					f46 += f61;
				}

				while (--f1 >= 0.0F) {
					method297(flag1, flag2, anIntArray34, (int) f, (int) f3, (int) f5, f6, f8, f9, f11, f12, f14, f15, f17, f18, f20, f26, f29, f30, f33, f34, f37, f38, f41, f42, f45, f46, f49);
					f3 += f50;
					f5 += f63;
					f6 += f51;
					f8 += f64;
					f9 += f52;
					f11 += f65;
					f12 += f53;
					f14 += f66;
					f15 += f54;
					f17 += f67;
					f18 += f55;
					f20 += f68;
					f26 += f56;
					f29 += f69;
					f30 += f57;
					f33 += f70;
					f34 += f58;
					f37 += f71;
					f38 += f59;
					f41 += f72;
					f42 += f60;
					f45 += f73;
					f46 += f61;
					f49 += f74;
					f += anInt33;
				}
			}
		}
	}

	final void method297(boolean flag, boolean flag1, int ai[], int i, int j, int k, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21) {
		int l = k - j;
		float f22 = 1.0F / (float) l;
		float f23 = (f1 - f) * f22;
		float f24 = (f3 - f2) * f22;
		float f25 = (f5 - f4) * f22;
		float f26 = (f7 - f6) * f22;
		float f27 = (f9 - f8) * f22;
		float f28 = (f11 - f10) * f22;
		float f29 = (f13 - f12) * f22;
		float f30 = (f15 - f14) * f22;
		float f31 = (f17 - f16) * f22;
		float f32 = (f19 - f18) * f22;
		float f33 = (f21 - f20) * f22;
		if (aBoolean20) {
			if (k > anInt22)
				k = anInt22;
			if (j < 0) {
				f -= f23 * (float) j;
				f2 -= f24 * (float) j;
				f4 -= f25 * (float) j;
				f6 -= f26 * (float) j;
				f8 -= f27 * (float) j;
				f10 -= f28 * (float) j;
				f12 -= f29 * (float) j;
				f14 -= f30 * (float) j;
				f16 -= f31 * (float) j;
				f18 -= f32 * (float) j;
				f20 -= f33 * (float) j;
				j = 0;
			}
		}
		if (j >= k)
			return;
		l = k - j;
		i += j;
		while (l-- > 0) {
			float f34 = 1.0F / f;
			float f35 = 1.0F / f2;
			if (!flag || f34 < aFloatArray35[i]) {
				float f36 = f4 * f35;
				float f37 = f6 * f35;
				int i1 = (int) (f36 * (float) anInt39 * aFloat41) & anInt40;
				int j1 = (int) (f37 * (float) anInt39 * aFloat41) & anInt40;
				int k1 = anIntArray30[j1 * anInt39 + i1];
				i1 = (int) (f36 * (float) anInt29 * aFloat32) & anInt28;
				j1 = (int) (f37 * (float) anInt29 * aFloat32) & anInt28;
				int l1 = anIntArray45[j1 * anInt29 + i1];
				i1 = (int) (f36 * (float) anInt51 * aFloat53) & anInt52;
				j1 = (int) (f37 * (float) anInt51 * aFloat53) & anInt52;
				int i2 = anIntArray50[j1 * anInt51 + i1];
				float f38 = 1.0F - (f18 + f20);
				k1 = 0xff000000 | (int) (f18 * (float) (k1 >> 16 & 0xff)) << 16 | (int) (f18 * (float) (k1 >> 8 & 0xff)) << 8 | (int) (f18 * (float) (k1 & 0xff));
				l1 = 0xff000000 | (int) (f20 * (float) (l1 >> 16 & 0xff)) << 16 | (int) (f20 * (float) (l1 >> 8 & 0xff)) << 8 | (int) (f20 * (float) (l1 & 0xff));
				i2 = 0xff000000 | (int) (f38 * (float) (i2 >> 16 & 0xff)) << 16 | (int) (f38 * (float) (i2 >> 8 & 0xff)) << 8 | (int) (f38 * (float) (i2 & 0xff));
				int j2 = k1 + l1 + i2;
				int k2 = 0xff000000 | (int) (f12 * (float) (j2 >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f14 * (float) (j2 >> 8 & 0xff)) & 0xff00 | (int) (f16 * (float) (j2 & 0xff)) >> 8;
				if (f8 != 0.0F) {
					int l2 = (int) (255F - f8);
					int i3 = ((anInt18 & 0xff00ff) * (int) f8 & 0xff00ff00 | (anInt18 & 0xff00) * (int) f8 & 0xff0000) >>> 8;
					k2 = (((k2 & 0xff00ff) * l2 & 0xff00ff00 | (k2 & 0xff00) * l2 & 0xff0000) >>> 8) + i3;
				}
				if (flag1)
					ai[i] = ((int) f10 | ai[i] >> 24) << 24 | k2;
				else
					ai[i] = k2;
				if (flag)
					aFloatArray35[i] = f34;
			}
			i++;
			f += f23;
			f2 += f24;
			f4 += f25;
			f6 += f26;
			f8 += f27;
			f10 += f28;
			f12 += f29;
			f14 += f30;
			f16 += f31;
			f18 += f32;
			f20 += f33;
		}
	}

	Class2(Class_ra_Sub1 class_ra_sub1, Class15 class15) {
		aBoolean36 = false;
		aBoolean16 = true;
		aBoolean48 = false;
		anInt19 = 0;
		aBoolean20 = false;
		aBoolean21 = false;
		anIntArray47 = new int[4096];
		aFloat27 = 0.0F;
		aFloat46 = 1.0F;
		anInt37 = -1;
		anIntArray30 = null;
		anInt39 = 0;
		anInt40 = 0;
		aFloat41 = 0.0F;
		anInt42 = 0;
		aBoolean43 = true;
		anInt44 = -1;
		anIntArray45 = null;
		anInt29 = 0;
		anInt28 = 0;
		aFloat32 = 0.0F;
		anInt49 = -1;
		anIntArray50 = null;
		anInt51 = 0;
		anInt52 = 0;
		aFloat53 = 0.0F;
		aClass_ra_Sub1_31 = class_ra_sub1;
		aClass15_24 = class15;
		anInt33 = aClass_ra_Sub1_31.anInt7971 * 0x2940b683;
		anIntArray34 = aClass_ra_Sub1_31.anIntArray7967;
		aFloatArray35 = aClass_ra_Sub1_31.aFloatArray7973;
	}

	final void method298(boolean flag, boolean flag1, int ai[], int i, int j, int k, int l, int i1, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
		if (aBoolean20) {
			if (i1 > anInt22)
				i1 = anInt22;
			if (l < 0)
				l = 0;
		}
		if (l >= i1)
			return;
		if (aBoolean21) {
			i += l;
			f2 += f3 * (float) l;
			f4 += f5 * (float) l;
			f6 += f7 * (float) l;
			if (aBoolean16) {
				k = i1 - l >> 2;
				f3 *= 4F;
				f5 *= 4F;
				f7 *= 4F;
				if (anInt19 == 0) {
					if (k > 0)
						do {
							j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
							f2 += f3;
							f4 += f5;
							f6 += f7;
							ai[i++] = j;
							ai[i++] = j;
							ai[i++] = j;
							ai[i++] = j;
						} while (--k > 0);
					k = i1 - l & 3;
					if (k > 0) {
						j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						do
							ai[i++] = j;
						while (--k > 0);
					}
				} else if (!aBoolean48) {
					int j1 = anInt19;
					int l2 = 256 - anInt19;
					if (k > 0)
						do {
							j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
							f2 += f3;
							f4 += f5;
							f6 += f7;
							j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
							int i8 = ai[i];
							if (flag1) {
								ai[i++] = (l2 | i8 >> 24) << 24 | j + ((i8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i8 & 0xff00) * j1 >> 8 & 0xff00);
								i8 = ai[i];
								ai[i++] = (l2 | i8 >> 24) << 24 | j + ((i8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i8 & 0xff00) * j1 >> 8 & 0xff00);
								i8 = ai[i];
								ai[i++] = (l2 | i8 >> 24) << 24 | j + ((i8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i8 & 0xff00) * j1 >> 8 & 0xff00);
								i8 = ai[i];
								ai[i++] = (l2 | i8 >> 24) << 24 | j + ((i8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i8 & 0xff00) * j1 >> 8 & 0xff00);
							} else {
								ai[i++] = j + ((i8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i8 & 0xff00) * j1 >> 8 & 0xff00);
								i8 = ai[i];
								ai[i++] = j + ((i8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i8 & 0xff00) * j1 >> 8 & 0xff00);
								i8 = ai[i];
								ai[i++] = j + ((i8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i8 & 0xff00) * j1 >> 8 & 0xff00);
								i8 = ai[i];
								ai[i++] = j + ((i8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((i8 & 0xff00) * j1 >> 8 & 0xff00);
							}
						} while (--k > 0);
					k = i1 - l & 3;
					if (k > 0) {
						j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
						do {
							int j8 = ai[i];
							if (flag1)
								ai[i++] = (l2 | j8 >> 24) << 24 | j + ((j8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j8 & 0xff00) * j1 >> 8 & 0xff00);
							else
								ai[i++] = j + ((j8 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((j8 & 0xff00) * j1 >> 8 & 0xff00);
						} while (--k > 0);
					}
				} else {
					if (k > 0)
						do {
							j = (int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff;
							f2 += f3;
							f4 += f5;
							f6 += f7;
							int ai1[] = ai;
							int i3 = i++;
							int k8 = j;
							int k15 = ai1[i3];
							int j19 = k8 + k15;
							int i23 = (k8 & 0xff00ff) + (k15 & 0xff00ff);
							k15 = (i23 & 0x1000100) + (j19 - i23 & 0x10000);
							ai1[i3] = 0xff000000 | j19 - k15 | k15 - (k15 >>> 8);
							int ai16[] = ai;
							j19 = i++;
							i23 = j;
							int l26 = ai16[j19];
							int i27 = i23 + l26;
							int j27 = (i23 & 0xff00ff) + (l26 & 0xff00ff);
							l26 = (j27 & 0x1000100) + (i27 - j27 & 0x10000);
							ai16[j19] = 0xff000000 | i27 - l26 | l26 - (l26 >>> 8);
							int ai17[] = ai;
							i27 = i++;
							j27 = j;
							int k27 = ai17[i27];
							int l27 = j27 + k27;
							int i28 = (j27 & 0xff00ff) + (k27 & 0xff00ff);
							k27 = (i28 & 0x1000100) + (l27 - i28 & 0x10000);
							ai17[i27] = 0xff000000 | l27 - k27 | k27 - (k27 >>> 8);
							int ai18[] = ai;
							l27 = i++;
							i28 = j;
							int j28 = ai18[l27];
							int k28 = i28 + j28;
							int l28 = (i28 & 0xff00ff) + (j28 & 0xff00ff);
							j28 = (l28 & 0x1000100) + (k28 - l28 & 0x10000);
							ai18[l27] = 0xff000000 | k28 - j28 | j28 - (j28 >>> 8);
						} while (--k > 0);
					k = i1 - l & 3;
					if (k > 0) {
						j = (int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff;
						do {
							int ai2[] = ai;
							int j3 = i++;
							int l8 = j;
							int l15 = ai2[j3];
							int k19 = l8 + l15;
							int j23 = (l8 & 0xff00ff) + (l15 & 0xff00ff);
							l15 = (j23 & 0x1000100) + (k19 - j23 & 0x10000);
							ai2[j3] = 0xff000000 | k19 - l15 | l15 - (l15 >>> 8);
						} while (--k > 0);
					}
				}
			} else {
				k = i1 - l;
				if (anInt19 == 0)
					do {
						ai[i++] = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						f2 += f3;
						f4 += f5;
						f6 += f7;
					} while (--k > 0);
				else if (!aBoolean48) {
					int k1 = anInt19;
					int k3 = 256 - anInt19;
					do {
						j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						f2 += f3;
						f4 += f5;
						f6 += f7;
						j = ((j & 0xff00ff) * k3 >> 8 & 0xff00ff) + ((j & 0xff00) * k3 >> 8 & 0xff00);
						int i9 = ai[i];
						if (flag1)
							ai[i++] = (k3 | i9 >> 24) << 24 | j + ((i9 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((i9 & 0xff00) * k1 >> 8 & 0xff00);
						else
							ai[i++] = j + ((i9 & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((i9 & 0xff00) * k1 >> 8 & 0xff00);
					} while (--k > 0);
				} else {
					do {
						int ai3[] = ai;
						int l3 = i++;
						int j9 = (int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff;
						int i16 = ai3[l3];
						int l19 = j9 + i16;
						int k23 = (j9 & 0xff00ff) + (i16 & 0xff00ff);
						i16 = (k23 & 0x1000100) + (l19 - k23 & 0x10000);
						ai3[l3] = 0xff000000 | l19 - i16 | i16 - (i16 >>> 8);
						f2 += f3;
						f4 += f5;
						f6 += f7;
					} while (--k > 0);
				}
			}
			return;
		}
		i += l - 1;
		f += f1 * (float) l;
		f2 += f3 * (float) l;
		f4 += f5 * (float) l;
		f6 += f7 * (float) l;
		if (aClass15_24.aBoolean207) {
			if (aBoolean16) {
				k = i1 - l >> 2;
				f3 *= 4F;
				f5 *= 4F;
				f7 *= 4F;
				if (anInt19 == 0) {
					if (k > 0)
						do {
							j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
							f2 += f3;
							f4 += f5;
							f6 += f7;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
						} while (--k > 0);
					k = i1 - l & 3;
					if (k > 0) {
						j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						do {
							i++;
							if (!flag || f < aFloatArray35[i]) {
								ai[i] = j;
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
						} while (--k > 0);
					}
				} else if (!aBoolean48) {
					int l1 = anInt19;
					int i4 = 256 - anInt19;
					if (k > 0)
						do {
							j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
							f2 += f3;
							f4 += f5;
							f6 += f7;
							j = ((j & 0xff00ff) * i4 >> 8 & 0xff00ff) + ((j & 0xff00) * i4 >> 8 & 0xff00);
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int k9 = ai[i];
								if (flag1)
									ai[i] = (i4 | k9 >> 24) << 24 | j + ((k9 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((k9 & 0xff00) * l1 >> 8 & 0xff00);
								else
									ai[i] = j + ((k9 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((k9 & 0xff00) * l1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int l9 = ai[i];
								if (flag1)
									ai[i] = (i4 | l9 >> 24) << 24 | j + ((l9 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((l9 & 0xff00) * l1 >> 8 & 0xff00);
								else
									ai[i] = j + ((l9 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((l9 & 0xff00) * l1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int i10 = ai[i];
								if (flag1)
									ai[i] = (i4 | i10 >> 24) << 24 | j + ((i10 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((i10 & 0xff00) * l1 >> 8 & 0xff00);
								else
									ai[i] = j + ((i10 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((i10 & 0xff00) * l1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int j10 = ai[i];
								if (flag1)
									ai[i] = (i4 | j10 >> 24) << 24 | j + ((j10 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((j10 & 0xff00) * l1 >> 8 & 0xff00);
								else
									ai[i] = j + ((j10 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((j10 & 0xff00) * l1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
						} while (--k > 0);
					k = i1 - l & 3;
					if (k > 0) {
						j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						j = ((j & 0xff00ff) * i4 >> 8 & 0xff00ff) + ((j & 0xff00) * i4 >> 8 & 0xff00);
						do {
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int k10 = ai[i];
								if (flag1)
									ai[i] = (i4 | k10 >> 24) << 24 | j + ((k10 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((k10 & 0xff00) * l1 >> 8 & 0xff00);
								else
									ai[i] = j + ((k10 & 0xff00ff) * l1 >> 8 & 0xff00ff) + ((k10 & 0xff00) * l1 >> 8 & 0xff00);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
						} while (--k > 0);
					}
				} else {
					if (k > 0)
						do {
							j = (int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff;
							f2 += f3;
							f4 += f5;
							f6 += f7;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int ai4[] = ai;
								int j4 = i;
								int l10 = j;
								int j16 = ai4[j4];
								int i20 = l10 + j16;
								int l23 = (l10 & 0xff00ff) + (j16 & 0xff00ff);
								j16 = (l23 & 0x1000100) + (i20 - l23 & 0x10000);
								ai4[j4] = 0xff000000 | i20 - j16 | j16 - (j16 >>> 8);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int ai5[] = ai;
								int k4 = i;
								int i11 = j;
								int k16 = ai5[k4];
								int j20 = i11 + k16;
								int i24 = (i11 & 0xff00ff) + (k16 & 0xff00ff);
								k16 = (i24 & 0x1000100) + (j20 - i24 & 0x10000);
								ai5[k4] = 0xff000000 | j20 - k16 | k16 - (k16 >>> 8);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int ai6[] = ai;
								int l4 = i;
								int j11 = j;
								int l16 = ai6[l4];
								int k20 = j11 + l16;
								int j24 = (j11 & 0xff00ff) + (l16 & 0xff00ff);
								l16 = (j24 & 0x1000100) + (k20 - j24 & 0x10000);
								ai6[l4] = 0xff000000 | k20 - l16 | l16 - (l16 >>> 8);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int ai7[] = ai;
								int i5 = i;
								int k11 = j;
								int i17 = ai7[i5];
								int l20 = k11 + i17;
								int k24 = (k11 & 0xff00ff) + (i17 & 0xff00ff);
								i17 = (k24 & 0x1000100) + (l20 - k24 & 0x10000);
								ai7[i5] = 0xff000000 | l20 - i17 | i17 - (i17 >>> 8);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
						} while (--k > 0);
					k = i1 - l & 3;
					if (k > 0) {
						j = (int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff;
						do {
							i++;
							if (!flag || f < aFloatArray35[i]) {
								int ai8[] = ai;
								int j5 = i;
								int l11 = j;
								int j17 = ai8[j5];
								int i21 = l11 + j17;
								int l24 = (l11 & 0xff00ff) + (j17 & 0xff00ff);
								j17 = (l24 & 0x1000100) + (i21 - l24 & 0x10000);
								ai8[j5] = 0xff000000 | i21 - j17 | j17 - (j17 >>> 8);
								if (flag)
									aFloatArray35[i] = f;
							}
							f += f1;
						} while (--k > 0);
					}
				}
				return;
			}
			k = i1 - l;
			if (anInt19 == 0)
				do {
					i++;
					if (!flag || f < aFloatArray35[i]) {
						ai[i] = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						if (flag)
							aFloatArray35[i] = f;
					}
					f += f1;
					f2 += f3;
					f4 += f5;
					f6 += f7;
				} while (--k > 0);
			else if (!aBoolean48) {
				int i2 = anInt19;
				int k5 = 256 - anInt19;
				do {
					i++;
					if (!flag || f < aFloatArray35[i]) {
						j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						j = ((j & 0xff00ff) * k5 >> 8 & 0xff00ff) + ((j & 0xff00) * k5 >> 8 & 0xff00);
						int i12 = ai[i];
						if (flag1)
							ai[i] = (k5 | i12 >> 24) << 24 | j + ((i12 & 0xff00ff) * i2 >> 8 & 0xff00ff) + ((i12 & 0xff00) * i2 >> 8 & 0xff00);
						else
							ai[i] = j + ((i12 & 0xff00ff) * i2 >> 8 & 0xff00ff) + ((i12 & 0xff00) * i2 >> 8 & 0xff00);
						if (flag)
							aFloatArray35[i] = f;
					}
					f += f1;
					f2 += f3;
					f4 += f5;
					f6 += f7;
				} while (--k > 0);
			} else {
				do {
					i++;
					if (!flag || f < aFloatArray35[i]) {
						int ai9[] = ai;
						int l5 = i;
						int j12 = (int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff;
						int k17 = ai9[l5];
						int j21 = j12 + k17;
						int i25 = (j12 & 0xff00ff) + (k17 & 0xff00ff);
						k17 = (i25 & 0x1000100) + (j21 - i25 & 0x10000);
						ai9[l5] = 0xff000000 | j21 - k17 | k17 - (k17 >>> 8);
						if (flag)
							aFloatArray35[i] = f;
					}
					f += f1;
					f2 += f3;
					f4 += f5;
					f6 += f7;
				} while (--k > 0);
			}
			return;
		}
		if (aBoolean16) {
			k = i1 - l >> 2;
			f3 *= 4F;
			f5 *= 4F;
			f7 *= 4F;
			if (anInt19 == 0) {
				if (k > 0)
					do {
						j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						f2 += f3;
						f4 += f5;
						f6 += f7;
						i++;
						if (!flag || f < aFloatArray35[i])
							ai[i] = j;
						f += f1;
						i++;
						if (!flag || f < aFloatArray35[i])
							ai[i] = j;
						f += f1;
						i++;
						if (!flag || f < aFloatArray35[i])
							ai[i] = j;
						f += f1;
						i++;
						if (!flag || f < aFloatArray35[i])
							ai[i] = j;
						f += f1;
					} while (--k > 0);
				k = i1 - l & 3;
				if (k > 0) {
					j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
					do {
						i++;
						if (!flag || f < aFloatArray35[i])
							ai[i] = j;
						f += f1;
					} while (--k > 0);
				}
			} else if (!aBoolean48) {
				int j2 = anInt19;
				int i6 = 256 - anInt19;
				if (k > 0)
					do {
						j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
						f2 += f3;
						f4 += f5;
						f6 += f7;
						j = ((j & 0xff00ff) * i6 >> 8 & 0xff00ff) + ((j & 0xff00) * i6 >> 8 & 0xff00);
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int k12 = ai[i];
							if (flag1)
								ai[i] = (i6 | k12 >> 24) << 24 | j + ((k12 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((k12 & 0xff00) * j2 >> 8 & 0xff00);
							else
								ai[i] = j + ((k12 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((k12 & 0xff00) * j2 >> 8 & 0xff00);
						}
						f += f1;
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int l12 = ai[i];
							if (flag1)
								ai[i] = (i6 | l12 >> 24) << 24 | j + ((l12 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((l12 & 0xff00) * j2 >> 8 & 0xff00);
							else
								ai[i] = j + ((l12 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((l12 & 0xff00) * j2 >> 8 & 0xff00);
						}
						f += f1;
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int i13 = ai[i];
							if (flag1)
								ai[i] = (i6 | i13 >> 24) << 24 | j + ((i13 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((i13 & 0xff00) * j2 >> 8 & 0xff00);
							else
								ai[i] = j + ((i13 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((i13 & 0xff00) * j2 >> 8 & 0xff00);
						}
						f += f1;
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int j13 = ai[i];
							if (flag1)
								ai[i] = (i6 | j13 >> 24) << 24 | j + ((j13 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((j13 & 0xff00) * j2 >> 8 & 0xff00);
							else
								ai[i] = j + ((j13 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((j13 & 0xff00) * j2 >> 8 & 0xff00);
						}
						f += f1;
					} while (--k > 0);
				k = i1 - l & 3;
				if (k > 0) {
					j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
					j = ((j & 0xff00ff) * i6 >> 8 & 0xff00ff) + ((j & 0xff00) * i6 >> 8 & 0xff00);
					do {
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int k13 = ai[i];
							if (flag1)
								ai[i] = (i6 | k13 >> 24) << 24 | j + ((k13 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((k13 & 0xff00) * j2 >> 8 & 0xff00);
							else
								ai[i] = j + ((k13 & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((k13 & 0xff00) * j2 >> 8 & 0xff00);
						}
						f += f1;
					} while (--k > 0);
				}
			} else {
				if (k > 0)
					do {
						j = (int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff;
						f2 += f3;
						f4 += f5;
						f6 += f7;
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int ai10[] = ai;
							int j6 = i;
							int l13 = j;
							int l17 = ai10[j6];
							int k21 = l13 + l17;
							int j25 = (l13 & 0xff00ff) + (l17 & 0xff00ff);
							l17 = (j25 & 0x1000100) + (k21 - j25 & 0x10000);
							ai10[j6] = 0xff000000 | k21 - l17 | l17 - (l17 >>> 8);
						}
						f += f1;
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int ai11[] = ai;
							int k6 = i;
							int i14 = j;
							int i18 = ai11[k6];
							int l21 = i14 + i18;
							int k25 = (i14 & 0xff00ff) + (i18 & 0xff00ff);
							i18 = (k25 & 0x1000100) + (l21 - k25 & 0x10000);
							ai11[k6] = 0xff000000 | l21 - i18 | i18 - (i18 >>> 8);
						}
						f += f1;
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int ai12[] = ai;
							int l6 = i;
							int j14 = j;
							int j18 = ai12[l6];
							int i22 = j14 + j18;
							int l25 = (j14 & 0xff00ff) + (j18 & 0xff00ff);
							j18 = (l25 & 0x1000100) + (i22 - l25 & 0x10000);
							ai12[l6] = 0xff000000 | i22 - j18 | j18 - (j18 >>> 8);
						}
						f += f1;
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int ai13[] = ai;
							int i7 = i;
							int k14 = j;
							int k18 = ai13[i7];
							int j22 = k14 + k18;
							int i26 = (k14 & 0xff00ff) + (k18 & 0xff00ff);
							k18 = (i26 & 0x1000100) + (j22 - i26 & 0x10000);
							ai13[i7] = 0xff000000 | j22 - k18 | k18 - (k18 >>> 8);
						}
						f += f1;
					} while (--k > 0);
				k = i1 - l & 3;
				if (k > 0) {
					j = (int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff;
					do {
						i++;
						if (!flag || f < aFloatArray35[i]) {
							int ai14[] = ai;
							int j7 = i;
							int l14 = j;
							int l18 = ai14[j7];
							int k22 = l14 + l18;
							int j26 = (l14 & 0xff00ff) + (l18 & 0xff00ff);
							l18 = (j26 & 0x1000100) + (k22 - j26 & 0x10000);
							ai14[j7] = 0xff000000 | k22 - l18 | l18 - (l18 >>> 8);
						}
						f += f1;
					} while (--k > 0);
				}
			}
			return;
		}
		k = i1 - l;
		if (anInt19 == 0)
			do {
				i++;
				if (!flag || f < aFloatArray35[i])
					ai[i] = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
				f += f1;
				f2 += f3;
				f4 += f5;
				f6 += f7;
			} while (--k > 0);
		else if (!aBoolean48) {
			int k2 = anInt19;
			int k7 = 256 - anInt19;
			do {
				i++;
				if (!flag || f < aFloatArray35[i]) {
					j = 0xff000000 | ((int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff);
					j = ((j & 0xff00ff) * k7 >> 8 & 0xff00ff) + ((j & 0xff00) * k7 >> 8 & 0xff00);
					int i15 = ai[i];
					if (flag1)
						ai[i] = (k7 | i15 >> 24) << 24 | j + ((i15 & 0xff00ff) * k2 >> 8 & 0xff00ff) + ((i15 & 0xff00) * k2 >> 8 & 0xff00);
					else
						ai[i] = j + ((i15 & 0xff00ff) * k2 >> 8 & 0xff00ff) + ((i15 & 0xff00) * k2 >> 8 & 0xff00);
				}
				f += f1;
				f2 += f3;
				f4 += f5;
				f6 += f7;
			} while (--k > 0);
		} else {
			do {
				i++;
				if (!flag || f < aFloatArray35[i]) {
					int ai15[] = ai;
					int l7 = i;
					int j15 = (int) f2 & 0xff0000 | (int) f4 & 0xff00 | (int) f6 & 0xff;
					int i19 = ai15[l7];
					int l22 = j15 + i19;
					int k26 = (j15 & 0xff00ff) + (i19 & 0xff00ff);
					i19 = (k26 & 0x1000100) + (l22 - k26 & 0x10000);
					ai15[l7] = 0xff000000 | l22 - i19 | i19 - (i19 >>> 8);
				}
				f += f1;
				f2 += f3;
				f4 += f5;
				f6 += f7;
			} while (--k > 0);
		}
	}

	final void method299(boolean flag, boolean flag1, boolean flag2, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
		if (!flag) {
			method293(false, flag1, flag2, f, f1, f2, f3, f4, f5, f6, f7, f8, 0);
			return;
		}
		if (aBoolean36) {
			aClass_ra_Sub1_31.method5018((int) f3, (int) f, (int) f4, (int) f1, Class379.anIntArray4096[(int) f9 & 0xffff], 0x7015a40c);
			aClass_ra_Sub1_31.method5018((int) f4, (int) f1, (int) f5, (int) f2, Class379.anIntArray4096[(int) f9 & 0xffff], 0x7ddc41b5);
			aClass_ra_Sub1_31.method5018((int) f5, (int) f2, (int) f3, (int) f, Class379.anIntArray4096[(int) f9 & 0xffff], 0x3912fa4e);
			return;
		}
		float f12 = f4 - f3;
		float f13 = f1 - f;
		float f14 = f5 - f3;
		float f15 = f2 - f;
		float f16 = f10 - f9;
		float f17 = f11 - f9;
		float f18 = f7 - f6;
		float f19 = f8 - f6;
		float f20;
		if (f2 != f1)
			f20 = (f5 - f4) / (f2 - f1);
		else
			f20 = 0.0F;
		float f21;
		if (f1 != f)
			f21 = f12 / f13;
		else
			f21 = 0.0F;
		float f22;
		if (f2 != f)
			f22 = f14 / f15;
		else
			f22 = 0.0F;
		float f23 = f12 * f15 - f14 * f13;
		if (f23 == 0.0F)
			return;
		float f24 = (f16 * f15 - f17 * f13) / f23;
		float f25 = (f17 * f12 - f16 * f14) / f23;
		float f26 = (f18 * f15 - f19 * f13) / f23;
		float f27 = (f19 * f12 - f18 * f14) / f23;
		if (f <= f1 && f <= f2) {
			if (f >= (float) anInt38)
				return;
			if (f1 > (float) anInt38)
				f1 = anInt38;
			if (f2 > (float) anInt38)
				f2 = anInt38;
			f9 = (f9 - f24 * f3) + f24;
			f6 = (f6 - f26 * f3) + f26;
			if (f1 < f2) {
				f5 = f3;
				if (f < 0.0F) {
					f5 -= f22 * f;
					f3 -= f21 * f;
					f9 -= f25 * f;
					f6 -= f27 * f;
					f = 0.0F;
				}
				if (f1 < 0.0F) {
					f4 -= f20 * f1;
					f1 = 0.0F;
				}
				if (f != f1 && f22 < f21 || f == f1 && f22 > f20) {
					f = (int) (f + 0.5F);
					f1 = (int) (f1 + 0.5F);
					f2 = (float) (int) (f2 + 0.5F) - f1;
					f1 -= f;
					for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
						method291(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f5, (int) f3, f9, f24, f6, f26);
						f5 += f22;
						f3 += f21;
						f9 += f25;
						f6 += f27;
					}

					while (--f2 >= 0.0F) {
						method291(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f5, (int) f4, f9, f24, f6, f26);
						f5 += f22;
						f4 += f20;
						f9 += f25;
						f6 += f27;
						f += anInt33;
					}
					return;
				}
				f = (int) (f + 0.5F);
				f1 = (int) (f1 + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f1;
				f1 -= f;
				for (f = anIntArray47[(int) f]; --f1 >= 0.0F; f += anInt33) {
					method291(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f3, (int) f5, f9, f24, f6, f26);
					f5 += f22;
					f3 += f21;
					f9 += f25;
					f6 += f27;
				}

				while (--f2 >= 0.0F) {
					method291(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f4, (int) f5, f9, f24, f6, f26);
					f5 += f22;
					f4 += f20;
					f9 += f25;
					f6 += f27;
					f += anInt33;
				}
				return;
			}
			f4 = f3;
			if (f < 0.0F) {
				f4 -= f22 * f;
				f3 -= f21 * f;
				f9 -= f25 * f;
				f6 -= f27 * f;
				f = 0.0F;
			}
			if (f2 < 0.0F) {
				f5 -= f20 * f2;
				f2 = 0.0F;
			}
			if (f != f2 && f22 < f21 || f == f2 && f20 > f21) {
				f = (int) (f + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f2;
				f2 -= f;
				for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
					method291(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f4, (int) f3, f9, f24, f6, f26);
					f4 += f22;
					f3 += f21;
					f9 += f25;
					f6 += f27;
				}

				while (--f1 >= 0.0F) {
					method291(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f5, (int) f3, f9, f24, f6, f26);
					f5 += f20;
					f3 += f21;
					f9 += f25;
					f6 += f27;
					f += anInt33;
				}
				return;
			}
			f = (int) (f + 0.5F);
			f2 = (int) (f2 + 0.5F);
			f1 = (float) (int) (f1 + 0.5F) - f2;
			f2 -= f;
			for (f = anIntArray47[(int) f]; --f2 >= 0.0F; f += anInt33) {
				method291(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f3, (int) f4, f9, f24, f6, f26);
				f4 += f22;
				f3 += f21;
				f9 += f25;
				f6 += f27;
			}

			while (--f1 >= 0.0F) {
				method291(flag1, flag2, anIntArray34, (int) f, 0, 0, (int) f3, (int) f5, f9, f24, f6, f26);
				f5 += f20;
				f3 += f21;
				f9 += f25;
				f6 += f27;
				f += anInt33;
			}
			return;
		}
		if (f1 <= f2) {
			if (f1 >= (float) anInt38)
				return;
			if (f2 > (float) anInt38)
				f2 = anInt38;
			if (f > (float) anInt38)
				f = anInt38;
			f10 = (f10 - f24 * f4) + f24;
			f7 = (f7 - f26 * f4) + f26;
			if (f2 < f) {
				f3 = f4;
				if (f1 < 0.0F) {
					f3 -= f21 * f1;
					f4 -= f20 * f1;
					f10 -= f25 * f1;
					f7 -= f27 * f1;
					f1 = 0.0F;
				}
				if (f2 < 0.0F) {
					f5 -= f22 * f2;
					f2 = 0.0F;
				}
				if (f1 != f2 && f21 < f20 || f1 == f2 && f21 > f22) {
					f1 = (int) (f1 + 0.5F);
					f2 = (int) (f2 + 0.5F);
					f = (float) (int) (f + 0.5F) - f2;
					f2 -= f1;
					for (f1 = anIntArray47[(int) f1]; --f2 >= 0.0F; f1 += anInt33) {
						method291(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f3, (int) f4, f10, f24, f7, f26);
						f3 += f21;
						f4 += f20;
						f10 += f25;
						f7 += f27;
					}

					while (--f >= 0.0F) {
						method291(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f3, (int) f5, f10, f24, f7, f26);
						f3 += f21;
						f5 += f22;
						f10 += f25;
						f7 += f27;
						f1 += anInt33;
					}
					return;
				}
				f1 = (int) (f1 + 0.5F);
				f2 = (int) (f2 + 0.5F);
				f = (float) (int) (f + 0.5F) - f2;
				f2 -= f1;
				for (f1 = anIntArray47[(int) f1]; --f2 >= 0.0F; f1 += anInt33) {
					method291(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f4, (int) f3, f10, f24, f7, f26);
					f3 += f21;
					f4 += f20;
					f10 += f25;
					f7 += f27;
				}

				while (--f >= 0.0F) {
					method291(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f5, (int) f3, f10, f24, f7, f26);
					f3 += f21;
					f5 += f22;
					f10 += f25;
					f7 += f27;
					f1 += anInt33;
				}
				return;
			}
			f5 = f4;
			if (f1 < 0.0F) {
				f5 -= f21 * f1;
				f4 -= f20 * f1;
				f10 -= f25 * f1;
				f7 -= f27 * f1;
				f1 = 0.0F;
			}
			if (f < 0.0F) {
				f3 -= f22 * f;
				f = 0.0F;
			}
			if (f21 < f20) {
				f1 = (int) (f1 + 0.5F);
				f = (int) (f + 0.5F);
				f2 = (float) (int) (f2 + 0.5F) - f;
				f -= f1;
				for (f1 = anIntArray47[(int) f1]; --f >= 0.0F; f1 += anInt33) {
					method291(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f5, (int) f4, f10, f24, f7, f26);
					f5 += f21;
					f4 += f20;
					f10 += f25;
					f7 += f27;
				}

				while (--f2 >= 0.0F) {
					method291(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f3, (int) f4, f10, f24, f7, f26);
					f3 += f22;
					f4 += f20;
					f10 += f25;
					f7 += f27;
					f1 += anInt33;
				}
				return;
			}
			f1 = (int) (f1 + 0.5F);
			f = (int) (f + 0.5F);
			f2 = (float) (int) (f2 + 0.5F) - f;
			f -= f1;
			for (f1 = anIntArray47[(int) f1]; --f >= 0.0F; f1 += anInt33) {
				method291(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f4, (int) f5, f10, f24, f7, f26);
				f5 += f21;
				f4 += f20;
				f10 += f25;
				f7 += f27;
			}

			while (--f2 >= 0.0F) {
				method291(flag1, flag2, anIntArray34, (int) f1, 0, 0, (int) f4, (int) f3, f10, f24, f7, f26);
				f3 += f22;
				f4 += f20;
				f10 += f25;
				f7 += f27;
				f1 += anInt33;
			}
			return;
		}
		if (f2 >= (float) anInt38)
			return;
		if (f > (float) anInt38)
			f = anInt38;
		if (f1 > (float) anInt38)
			f1 = anInt38;
		f11 = (f11 - f24 * f5) + f24;
		f8 = (f8 - f26 * f5) + f26;
		if (f < f1) {
			f4 = f5;
			if (f2 < 0.0F) {
				f4 -= f20 * f2;
				f5 -= f22 * f2;
				f11 -= f25 * f2;
				f8 -= f27 * f2;
				f2 = 0.0F;
			}
			if (f < 0.0F) {
				f3 -= f21 * f;
				f = 0.0F;
			}
			if (f20 < f22) {
				f2 = (int) (f2 + 0.5F);
				f = (int) (f + 0.5F);
				f1 = (float) (int) (f1 + 0.5F) - f;
				f -= f2;
				for (f2 = anIntArray47[(int) f2]; --f >= 0.0F; f2 += anInt33) {
					method291(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f4, (int) f5, f11, f24, f8, f26);
					f4 += f20;
					f5 += f22;
					f11 += f25;
					f8 += f27;
				}

				while (--f1 >= 0.0F) {
					method291(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f4, (int) f3, f11, f24, f8, f26);
					f4 += f20;
					f3 += f21;
					f11 += f25;
					f8 += f27;
					f2 += anInt33;
				}
				return;
			}
			f2 = (int) (f2 + 0.5F);
			f = (int) (f + 0.5F);
			f1 = (float) (int) (f1 + 0.5F) - f;
			f -= f2;
			for (f2 = anIntArray47[(int) f2]; --f >= 0.0F; f2 += anInt33) {
				method291(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f5, (int) f4, f11, f24, f8, f26);
				f4 += f20;
				f5 += f22;
				f11 += f25;
				f8 += f27;
			}

			while (--f1 >= 0.0F) {
				method291(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f3, (int) f4, f11, f24, f8, f26);
				f4 += f20;
				f3 += f21;
				f11 += f25;
				f8 += f27;
				f2 += anInt33;
			}
			return;
		}
		f3 = f5;
		if (f2 < 0.0F) {
			f3 -= f20 * f2;
			f5 -= f22 * f2;
			f11 -= f25 * f2;
			f8 -= f27 * f2;
			f2 = 0.0F;
		}
		if (f1 < 0.0F) {
			f4 -= f21 * f1;
			f1 = 0.0F;
		}
		if (f20 < f22) {
			f2 = (int) (f2 + 0.5F);
			f1 = (int) (f1 + 0.5F);
			f = (float) (int) (f + 0.5F) - f1;
			f1 -= f2;
			for (f2 = anIntArray47[(int) f2]; --f1 >= 0.0F; f2 += anInt33) {
				method291(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f3, (int) f5, f11, f24, f8, f26);
				f3 += f20;
				f5 += f22;
				f11 += f25;
				f8 += f27;
			}

			while (--f >= 0.0F) {
				method291(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f4, (int) f5, f11, f24, f8, f26);
				f4 += f21;
				f5 += f22;
				f11 += f25;
				f8 += f27;
				f2 += anInt33;
			}
			return;
		}
		f2 = (int) (f2 + 0.5F);
		f1 = (int) (f1 + 0.5F);
		f = (float) (int) (f + 0.5F) - f1;
		f1 -= f2;
		for (f2 = anIntArray47[(int) f2]; --f1 >= 0.0F; f2 += anInt33) {
			method291(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f5, (int) f3, f11, f24, f8, f26);
			f3 += f20;
			f5 += f22;
			f11 += f25;
			f8 += f27;
		}

		while (--f >= 0.0F) {
			method291(flag1, flag2, anIntArray34, (int) f2, 0, 0, (int) f5, (int) f4, f11, f24, f8, f26);
			f4 += f21;
			f5 += f22;
			f11 += f25;
			f8 += f27;
			f2 += anInt33;
		}
	}

	boolean aBoolean16;
	float aFloat17;
	int anInt18;
	int anInt19;
	boolean aBoolean20;
	boolean aBoolean21;
	int anInt22;
	float aFloat23;
	Class15 aClass15_24;
	float aFloat25;
	float aFloat26;
	float aFloat27;
	int anInt28;
	int anInt29;
	int anIntArray30[];
	Class_ra_Sub1 aClass_ra_Sub1_31;
	float aFloat32;
	int anInt33;
	int anIntArray34[];
	float aFloatArray35[];
	boolean aBoolean36;
	int anInt37;
	int anInt38;
	int anInt39;
	int anInt40;
	float aFloat41;
	int anInt42;
	boolean aBoolean43;
	int anInt44;
	int anIntArray45[];
	float aFloat46;
	int anIntArray47[];
	boolean aBoolean48;
	int anInt49;
	int anIntArray50[];
	int anInt51;
	int anInt52;
	float aFloat53;
}