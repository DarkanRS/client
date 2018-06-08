
/* Class312_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class312_Sub1 extends JS5StandardRequester {
	Class202 aClass202_7778;

	public void method5522(Object object, boolean bool, int i) {
		if (((Class312_Sub1) this).aClass202_7778 != null) {
			try {
				((Class312_Sub1) this).aClass202_7778.method3318(83456367);
			} catch (Exception exception) {
				/* empty */
			}
			((Class312_Sub1) this).aClass202_7778 = null;
		}
		((Class312_Sub1) this).aClass202_7778 = (Class202) object;
		method12537((byte) 78);
		method5523(bool, (byte) 116);
		((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
		((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
		for (;;) {
			Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7937(23154670));
			if (class282_sub50_sub11_sub1 == null)
				break;
			((Class312_Sub1) this).aClass477_3652.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		for (;;) {
			Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7937(1599470054));
			if (null == class282_sub50_sub11_sub1)
				break;
			((Class312_Sub1) this).aClass477_3651.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		if (0 != ((Class312_Sub1) this).aByte3656) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(4);
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(((Class312_Sub1) this).aByte3656);
				((Class312_Sub1) this).aClass282_Sub35_3655.writeInt(0);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -1775828673);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(1779285831);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
		((Class312_Sub1) this).anInt3653 = 0;
		((Class312_Sub1) this).aLong3648 = Class169.method2869(1852641285) * 4647288634594403059L;
	}

	public void method5546(boolean bool) {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(bool ? 2 : 3);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(0L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -443418120);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(-1183746217);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
	}

	public void method5549() {
		if (null != ((Class312_Sub1) this).aClass202_7778)
			((Class312_Sub1) this).aClass202_7778.method3318(-547896145);
	}

	void method12536() {
		if (((Class312_Sub1) this).aClass202_7778 != null) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(6);
				((Class312_Sub1) this).aClass282_Sub35_3655.write24BitInt(3, (byte) 14);
				((Class312_Sub1) this).aClass282_Sub35_3655.writeShort(0, 1417031095);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -2077167931);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(693081265);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
	}

	public void method5548() {
		if (null != ((Class312_Sub1) this).aClass202_7778)
			((Class312_Sub1) this).aClass202_7778.method3318(874998056);
	}

	public void method5523(boolean bool, byte i) {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(bool ? 2 : 3);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(0L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -585768342);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(1946895320);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
	}

	public void method5526(int i) {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(7);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(0L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -1373474989);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(-1489776443);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
	}

	public void method5525(int i) {
		if (null != ((Class312_Sub1) this).aClass202_7778)
			((Class312_Sub1) this).aClass202_7778.method3318(-158211655);
	}

	public void method5543(byte i) {
		if (((Class312_Sub1) this).aClass202_7778 != null) {
			if (i != 15)
				((Class312_Sub1) this).aClass202_7778.method3320((byte) 30);
		}
	}

	void method5538() {
		try {
			((Class312_Sub1) this).aClass202_7778.method3318(-1205326281);
		} catch (Exception exception) {
			/* empty */
		}
		((Class312_Sub1) this).aClass202_7778 = null;
		anInt3657 += 1211706083;
		anInt3650 = 1208836967;
		((Class312_Sub1) this).aByte3656 = (byte) (int) (Math.random() * 255.0 + 1.0);
	}

	void method5539() {
		try {
			((Class312_Sub1) this).aClass202_7778.method3318(-503045570);
		} catch (Exception exception) {
			/* empty */
		}
		((Class312_Sub1) this).aClass202_7778 = null;
		anInt3657 += 1211706083;
		anInt3650 = 1208836967;
		((Class312_Sub1) this).aByte3656 = (byte) (int) (Math.random() * 255.0 + 1.0);
	}

	void method5540() {
		try {
			((Class312_Sub1) this).aClass202_7778.method3318(-183578609);
		} catch (Exception exception) {
			/* empty */
		}
		((Class312_Sub1) this).aClass202_7778 = null;
		anInt3657 += 1211706083;
		anInt3650 = 1208836967;
		((Class312_Sub1) this).aByte3656 = (byte) (int) (Math.random() * 255.0 + 1.0);
	}

	public boolean method5524() {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			long l = Class169.method2869(1579895096);
			int i = (int) (l - (3280542953542993467L * ((Class312_Sub1) this).aLong3648));
			((Class312_Sub1) this).aLong3648 = 4647288634594403059L * l;
			if (i > 200)
				i = 200;
			((Class312_Sub1) this).anInt3653 += i * -993989301;
			if (((Class312_Sub1) this).anInt3653 * -1846332317 > 30000) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(880201539);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
			}
		}
		if (((Class312_Sub1) this).aClass202_7778 == null) {
			if (method5553((short) 10397) == 0 && method5518(-1521800227) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3652.method7941((byte) 4); null != class282_sub50_sub11_sub1; class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3652.method7955(-301602175))) {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(1);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -2053652444);
				((Class312_Sub1) this).aClass477_3645.method7936(class282_sub50_sub11_sub1, -1738910950);
			}
			for (Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3651.method7941((byte) 4); class282_sub50_sub11_sub1 != null; class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3651.method7955(1146835721))) {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(0);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -1058968042);
				((Class312_Sub1) this).aClass477_3654.method7936(class282_sub50_sub11_sub1, -1738910950);
			}
			for (int i = 0; i < 100; i++) {
				int i_0_ = ((Class312_Sub1) this).aClass202_7778.method3312(-22142053);
				if (i_0_ < 0)
					throw new IOException();
				if (0 == i_0_)
					break;
				((Class312_Sub1) this).anInt3653 = 0;
				int i_1_ = 0;
				if (null == ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)
					i_1_ = 10;
				else if (0 == -5971791 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377))
					i_1_ = 1;
				if (i_1_ > 0) {
					int i_2_ = i_1_ - -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index);
					if (i_2_ > i_0_)
						i_2_ = i_0_;
					((Class312_Sub1) this).aClass202_7778.method3327((((Class312_Sub1) this).aClass282_Sub35_3647.buffer), -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index), i_2_, -1598930989);
					if (0 != ((Class312_Sub1) this).aByte3656) {
						for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
							((Class312_Sub1) this).aClass282_Sub35_3647.buffer[i_3_ + -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index)] ^= ((Class312_Sub1) this).aByte3656;
					}
					((Class312_Sub1) this).aClass282_Sub35_3647.index += -1115476867 * i_2_;
					if ((((Class312_Sub1) this).aClass282_Sub35_3647.index * -1990677291) >= i_1_) {
						if (null == (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)) {
							((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
							int i_4_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readUnsignedByte();
							int i_5_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readInt();
							int i_6_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readUnsignedByte();
							int i_7_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readInt();
							int i_8_ = i_6_ & 0x7f;
							boolean bool_9_ = 0 != (i_6_ & 0x80);
							long l = (long) i_5_ + ((long) i_4_ << 32);
							Object object = null;
							Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1;
							if (bool_9_) {
								for (class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7941((byte) 4)); (class282_sub50_sub11_sub1 != null && (class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L) != l); class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7955(-261946030))) {
									/* empty */
								}
							} else {
								for (class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7941((byte) 4)); (class282_sub50_sub11_sub1 != null && (-7883876913471066125L * (class282_sub50_sub11_sub1.aLong8120)) != l); class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7955(-43331753))) {
									/* empty */
								}
							}
							if (class282_sub50_sub11_sub1 == null)
								throw new IOException();
							int i_10_ = i_8_ == 0 ? 5 : 9;
							((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = class282_sub50_sub11_sub1;
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378 = (new RsByteBuffer(i_10_ + i_7_ + (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aByte10376)));
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.writeByte(i_8_);
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.writeInt(i_7_);
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = -131722454;
							((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
						} else if ((-5971791 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377)) == 0) {
							if ((((Class312_Sub1) this).aClass282_Sub35_3647.buffer[0]) == -1) {
								((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = -442668975;
								((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
							} else
								((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
						} else
							throw new IOException();
					}
				} else {
					int i_11_ = ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer).length - ((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aByte10376);
					int i_12_ = 512 - (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377) * -5971791;
					if (i_12_ > i_11_ - (-1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index)))
						i_12_ = i_11_ - (-1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index));
					if (i_12_ > i_0_)
						i_12_ = i_0_;
					((Class312_Sub1) this).aClass202_7778.method3327((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer), -1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index), i_12_, -2058896407);
					if (((Class312_Sub1) this).aByte3656 != 0) {
						for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer[i_13_ + ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index) * -1990677291)] ^= ((Class312_Sub1) this).aByte3656;
					}
					((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660).aClass282_Sub35_10378.index += i_12_ * -1115476867;
					((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660).anInt10377 += i_12_ * -442668975;
					if (i_11_ == -1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index)) {
						((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660.method13452((byte) -5);
						((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).incomplete = false;
						((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
					} else if ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 * -5971791) == 512)
						((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = 0;
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				((Class312_Sub1) this).aClass202_7778.method3318(-496813903);
			} catch (Exception exception) {
				/* empty */
			}
			((Class312_Sub1) this).aClass202_7778 = null;
			anInt3657 += 1211706083;
			anInt3650 = -1877293362;
			if (method5553((short) 26686) == 0 && method5518(-1963785262) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public boolean method5542() {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			long l = Class169.method2869(1587330491);
			int i = (int) (l - (3280542953542993467L * ((Class312_Sub1) this).aLong3648));
			((Class312_Sub1) this).aLong3648 = 4647288634594403059L * l;
			if (i > 200)
				i = 200;
			((Class312_Sub1) this).anInt3653 += i * -993989301;
			if (((Class312_Sub1) this).anInt3653 * -1846332317 > 30000) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(1168410964);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
			}
		}
		if (((Class312_Sub1) this).aClass202_7778 == null) {
			if (method5553((short) 2153) == 0 && method5518(-1889405488) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3652.method7941((byte) 4); null != class282_sub50_sub11_sub1; class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3652.method7955(572445941))) {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(1);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, 1134264052);
				((Class312_Sub1) this).aClass477_3645.method7936(class282_sub50_sub11_sub1, -1738910950);
			}
			for (Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3651.method7941((byte) 4); class282_sub50_sub11_sub1 != null; class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3651.method7955(-792632663))) {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(0);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -2080680995);
				((Class312_Sub1) this).aClass477_3654.method7936(class282_sub50_sub11_sub1, -1738910950);
			}
			for (int i = 0; i < 100; i++) {
				int i_14_ = ((Class312_Sub1) this).aClass202_7778.method3312(636572826);
				if (i_14_ < 0)
					throw new IOException();
				if (0 == i_14_)
					break;
				((Class312_Sub1) this).anInt3653 = 0;
				int i_15_ = 0;
				if (null == ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)
					i_15_ = 10;
				else if (0 == -5971791 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377))
					i_15_ = 1;
				if (i_15_ > 0) {
					int i_16_ = i_15_ - -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index);
					if (i_16_ > i_14_)
						i_16_ = i_14_;
					((Class312_Sub1) this).aClass202_7778.method3327((((Class312_Sub1) this).aClass282_Sub35_3647.buffer), -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index), i_16_, -717221969);
					if (0 != ((Class312_Sub1) this).aByte3656) {
						for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
							((Class312_Sub1) this).aClass282_Sub35_3647.buffer[i_17_ + -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index)] ^= ((Class312_Sub1) this).aByte3656;
					}
					((Class312_Sub1) this).aClass282_Sub35_3647.index += -1115476867 * i_16_;
					if ((((Class312_Sub1) this).aClass282_Sub35_3647.index * -1990677291) >= i_15_) {
						if (null == (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)) {
							((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
							int i_18_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readUnsignedByte();
							int i_19_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readInt();
							int i_20_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readUnsignedByte();
							int i_21_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readInt();
							int i_22_ = i_20_ & 0x7f;
							boolean bool_23_ = 0 != (i_20_ & 0x80);
							long l = (long) i_19_ + ((long) i_18_ << 32);
							Object object = null;
							Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1;
							if (bool_23_) {
								for (class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7941((byte) 4)); (class282_sub50_sub11_sub1 != null && (class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L) != l); class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7955(464344065))) {
									/* empty */
								}
							} else {
								for (class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7941((byte) 4)); (class282_sub50_sub11_sub1 != null && (-7883876913471066125L * (class282_sub50_sub11_sub1.aLong8120)) != l); class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7955(-1933263300))) {
									/* empty */
								}
							}
							if (class282_sub50_sub11_sub1 == null)
								throw new IOException();
							int i_24_ = i_22_ == 0 ? 5 : 9;
							((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = class282_sub50_sub11_sub1;
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378 = (new RsByteBuffer(i_24_ + i_21_ + (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aByte10376)));
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.writeByte(i_22_);
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.writeInt(i_21_);
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = -131722454;
							((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
						} else if ((-5971791 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377)) == 0) {
							if ((((Class312_Sub1) this).aClass282_Sub35_3647.buffer[0]) == -1) {
								((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = -442668975;
								((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
							} else
								((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
						} else
							throw new IOException();
					}
				} else {
					int i_25_ = ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer).length - ((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aByte10376);
					int i_26_ = 512 - (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377) * -5971791;
					if (i_26_ > i_25_ - (-1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index)))
						i_26_ = i_25_ - (-1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index));
					if (i_26_ > i_14_)
						i_26_ = i_14_;
					((Class312_Sub1) this).aClass202_7778.method3327((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer), -1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index), i_26_, -625709122);
					if (((Class312_Sub1) this).aByte3656 != 0) {
						for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer[i_27_ + ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index) * -1990677291)] ^= ((Class312_Sub1) this).aByte3656;
					}
					((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660).aClass282_Sub35_10378.index += i_26_ * -1115476867;
					((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660).anInt10377 += i_26_ * -442668975;
					if (i_25_ == -1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index)) {
						((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660.method13452((byte) -5);
						((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).incomplete = false;
						((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
					} else if ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 * -5971791) == 512)
						((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = 0;
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				((Class312_Sub1) this).aClass202_7778.method3318(1386116466);
			} catch (Exception exception) {
				/* empty */
			}
			((Class312_Sub1) this).aClass202_7778 = null;
			anInt3657 += 1211706083;
			anInt3650 = -1877293362;
			if (method5553((short) 14380) == 0 && method5518(-1857295154) == 0)
				return true;
			return false;
		}
		return bool;
	}

	void method12537(byte i) {
		if (((Class312_Sub1) this).aClass202_7778 != null) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(6);
				((Class312_Sub1) this).aClass282_Sub35_3655.write24BitInt(3, (byte) 14);
				((Class312_Sub1) this).aClass282_Sub35_3655.writeShort(0, 1417031095);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, 810595372);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(192003951);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
	}

	public void method5544(Object object, boolean bool) {
		if (((Class312_Sub1) this).aClass202_7778 != null) {
			try {
				((Class312_Sub1) this).aClass202_7778.method3318(-265350643);
			} catch (Exception exception) {
				/* empty */
			}
			((Class312_Sub1) this).aClass202_7778 = null;
		}
		((Class312_Sub1) this).aClass202_7778 = (Class202) object;
		method12537((byte) -6);
		method5523(bool, (byte) 29);
		((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
		((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
		for (;;) {
			Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7937(-1288156327));
			if (class282_sub50_sub11_sub1 == null)
				break;
			((Class312_Sub1) this).aClass477_3652.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		for (;;) {
			Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7937(-1812380478));
			if (null == class282_sub50_sub11_sub1)
				break;
			((Class312_Sub1) this).aClass477_3651.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		if (0 != ((Class312_Sub1) this).aByte3656) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(4);
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(((Class312_Sub1) this).aByte3656);
				((Class312_Sub1) this).aClass282_Sub35_3655.writeInt(0);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -1020594054);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(684361654);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
		((Class312_Sub1) this).anInt3653 = 0;
		((Class312_Sub1) this).aLong3648 = Class169.method2869(1578275045) * 4647288634594403059L;
	}

	public void method5545(Object object, boolean bool) {
		if (((Class312_Sub1) this).aClass202_7778 != null) {
			try {
				((Class312_Sub1) this).aClass202_7778.method3318(-439767834);
			} catch (Exception exception) {
				/* empty */
			}
			((Class312_Sub1) this).aClass202_7778 = null;
		}
		((Class312_Sub1) this).aClass202_7778 = (Class202) object;
		method12537((byte) 23);
		method5523(bool, (byte) 95);
		((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
		((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
		for (;;) {
			Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7937(994952178));
			if (class282_sub50_sub11_sub1 == null)
				break;
			((Class312_Sub1) this).aClass477_3652.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		for (;;) {
			Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7937(1990433330));
			if (null == class282_sub50_sub11_sub1)
				break;
			((Class312_Sub1) this).aClass477_3651.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		if (0 != ((Class312_Sub1) this).aByte3656) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(4);
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(((Class312_Sub1) this).aByte3656);
				((Class312_Sub1) this).aClass282_Sub35_3655.writeInt(0);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, 1101181210);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(1984653342);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
		((Class312_Sub1) this).anInt3653 = 0;
		((Class312_Sub1) this).aLong3648 = Class169.method2869(1665275219) * 4647288634594403059L;
	}

	public boolean method5521(byte i) {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			long l = Class169.method2869(1789732045);
			int i_28_ = (int) (l - (3280542953542993467L * ((Class312_Sub1) this).aLong3648));
			((Class312_Sub1) this).aLong3648 = 4647288634594403059L * l;
			if (i_28_ > 200)
				i_28_ = 200;
			((Class312_Sub1) this).anInt3653 += i_28_ * -993989301;
			if (((Class312_Sub1) this).anInt3653 * -1846332317 > 30000) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(1707585597);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
			}
		}
		if (((Class312_Sub1) this).aClass202_7778 == null) {
			if (method5553((short) 28870) == 0 && method5518(-1745805197) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3652.method7941((byte) 4); null != class282_sub50_sub11_sub1; class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3652.method7955(-302687935))) {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(1);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -1323919760);
				((Class312_Sub1) this).aClass477_3645.method7936(class282_sub50_sub11_sub1, -1738910950);
			}
			for (Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3651.method7941((byte) 4); class282_sub50_sub11_sub1 != null; class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3651.method7955(-1021577303))) {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(0);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, 5845484);
				((Class312_Sub1) this).aClass477_3654.method7936(class282_sub50_sub11_sub1, -1738910950);
			}
			for (int i_29_ = 0; i_29_ < 100; i_29_++) {
				int i_30_ = ((Class312_Sub1) this).aClass202_7778.method3312(1392283982);
				if (i_30_ < 0)
					throw new IOException();
				if (0 == i_30_)
					break;
				((Class312_Sub1) this).anInt3653 = 0;
				int i_31_ = 0;
				if (null == ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)
					i_31_ = 10;
				else if (0 == -5971791 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377))
					i_31_ = 1;
				if (i_31_ > 0) {
					int i_32_ = i_31_ - -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index);
					if (i_32_ > i_30_)
						i_32_ = i_30_;
					((Class312_Sub1) this).aClass202_7778.method3327((((Class312_Sub1) this).aClass282_Sub35_3647.buffer), -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index), i_32_, -1570276139);
					if (0 != ((Class312_Sub1) this).aByte3656) {
						for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
							((Class312_Sub1) this).aClass282_Sub35_3647.buffer[i_33_ + -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index)] ^= ((Class312_Sub1) this).aByte3656;
					}
					((Class312_Sub1) this).aClass282_Sub35_3647.index += -1115476867 * i_32_;
					if ((((Class312_Sub1) this).aClass282_Sub35_3647.index * -1990677291) >= i_31_) {
						if (null == (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)) {
							((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
							int i_34_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readUnsignedByte();
							int i_35_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readInt();
							int i_36_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readUnsignedByte();
							int i_37_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readInt();
							int i_38_ = i_36_ & 0x7f;
							boolean bool_39_ = 0 != (i_36_ & 0x80);
							long l = (long) i_35_ + ((long) i_34_ << 32);
							Object object = null;
							Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1;
							if (bool_39_) {
								for (class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7941((byte) 4)); (class282_sub50_sub11_sub1 != null && (class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L) != l); class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7955(-257563362))) {
									/* empty */
								}
							} else {
								for (class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7941((byte) 4)); (class282_sub50_sub11_sub1 != null && (-7883876913471066125L * (class282_sub50_sub11_sub1.aLong8120)) != l); class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7955(-691952599))) {
									/* empty */
								}
							}
							if (class282_sub50_sub11_sub1 == null)
								throw new IOException();
							int i_40_ = i_38_ == 0 ? 5 : 9;
							((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = class282_sub50_sub11_sub1;
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378 = (new RsByteBuffer(i_40_ + i_37_ + (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aByte10376)));
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.writeByte(i_38_);
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.writeInt(i_37_);
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = -131722454;
							((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
						} else if ((-5971791 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377)) == 0) {
							if ((((Class312_Sub1) this).aClass282_Sub35_3647.buffer[0]) == -1) {
								((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = -442668975;
								((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
							} else
								((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
						} else
							throw new IOException();
					}
				} else {
					int i_41_ = ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer).length - ((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aByte10376);
					int i_42_ = 512 - (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377) * -5971791;
					if (i_42_ > i_41_ - (-1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index)))
						i_42_ = i_41_ - (-1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index));
					if (i_42_ > i_30_)
						i_42_ = i_30_;
					((Class312_Sub1) this).aClass202_7778.method3327((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer), -1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index), i_42_, -1556112403);
					if (((Class312_Sub1) this).aByte3656 != 0) {
						for (int i_43_ = 0; i_43_ < i_42_; i_43_++)
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer[i_43_ + ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index) * -1990677291)] ^= ((Class312_Sub1) this).aByte3656;
					}
					((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660).aClass282_Sub35_10378.index += i_42_ * -1115476867;
					((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660).anInt10377 += i_42_ * -442668975;
					if (i_41_ == -1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index)) {
						((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660.method13452((byte) -5);
						((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).incomplete = false;
						((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
					} else if ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 * -5971791) == 512)
						((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = 0;
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				((Class312_Sub1) this).aClass202_7778.method3318(483191103);
			} catch (Exception exception) {
				/* empty */
			}
			((Class312_Sub1) this).aClass202_7778 = null;
			anInt3657 += 1211706083;
			anInt3650 = -1877293362;
			if (method5553((short) 24461) == 0 && method5518(-2070253366) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public void method5547() {
		if (null != ((Class312_Sub1) this).aClass202_7778)
			((Class312_Sub1) this).aClass202_7778.method3318(677093148);
	}

	public boolean method5557() {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			long l = Class169.method2869(1829447666);
			int i = (int) (l - (3280542953542993467L * ((Class312_Sub1) this).aLong3648));
			((Class312_Sub1) this).aLong3648 = 4647288634594403059L * l;
			if (i > 200)
				i = 200;
			((Class312_Sub1) this).anInt3653 += i * -993989301;
			if (((Class312_Sub1) this).anInt3653 * -1846332317 > 30000) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(-949990042);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
			}
		}
		if (((Class312_Sub1) this).aClass202_7778 == null) {
			if (method5553((short) 2501) == 0 && method5518(-1598449109) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3652.method7941((byte) 4); null != class282_sub50_sub11_sub1; class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3652.method7955(-1980128000))) {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(1);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -943163618);
				((Class312_Sub1) this).aClass477_3645.method7936(class282_sub50_sub11_sub1, -1738910950);
			}
			for (Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3651.method7941((byte) 4); class282_sub50_sub11_sub1 != null; class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3651.method7955(-676569028))) {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(0);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -477727140);
				((Class312_Sub1) this).aClass477_3654.method7936(class282_sub50_sub11_sub1, -1738910950);
			}
			for (int i = 0; i < 100; i++) {
				int i_44_ = ((Class312_Sub1) this).aClass202_7778.method3312(2083656307);
				if (i_44_ < 0)
					throw new IOException();
				if (0 == i_44_)
					break;
				((Class312_Sub1) this).anInt3653 = 0;
				int i_45_ = 0;
				if (null == ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)
					i_45_ = 10;
				else if (0 == -5971791 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377))
					i_45_ = 1;
				if (i_45_ > 0) {
					int i_46_ = i_45_ - -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index);
					if (i_46_ > i_44_)
						i_46_ = i_44_;
					((Class312_Sub1) this).aClass202_7778.method3327((((Class312_Sub1) this).aClass282_Sub35_3647.buffer), -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index), i_46_, -914075102);
					if (0 != ((Class312_Sub1) this).aByte3656) {
						for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
							((Class312_Sub1) this).aClass282_Sub35_3647.buffer[i_47_ + -1990677291 * (((Class312_Sub1) this).aClass282_Sub35_3647.index)] ^= ((Class312_Sub1) this).aByte3656;
					}
					((Class312_Sub1) this).aClass282_Sub35_3647.index += -1115476867 * i_46_;
					if ((((Class312_Sub1) this).aClass282_Sub35_3647.index * -1990677291) >= i_45_) {
						if (null == (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)) {
							((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
							int i_48_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readUnsignedByte();
							int i_49_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readInt();
							int i_50_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readUnsignedByte();
							int i_51_ = ((Class312_Sub1) this).aClass282_Sub35_3647.readInt();
							int i_52_ = i_50_ & 0x7f;
							boolean bool_53_ = 0 != (i_50_ & 0x80);
							long l = (long) i_49_ + ((long) i_48_ << 32);
							Object object = null;
							Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1;
							if (bool_53_) {
								for (class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7941((byte) 4)); (class282_sub50_sub11_sub1 != null && (class282_sub50_sub11_sub1.aLong8120 * -7883876913471066125L) != l); class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3654.method7955(-693904973))) {
									/* empty */
								}
							} else {
								for (class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7941((byte) 4)); (class282_sub50_sub11_sub1 != null && (-7883876913471066125L * (class282_sub50_sub11_sub1.aLong8120)) != l); class282_sub50_sub11_sub1 = ((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass477_3645.method7955(-1904114468))) {
									/* empty */
								}
							}
							if (class282_sub50_sub11_sub1 == null)
								throw new IOException();
							int i_54_ = i_52_ == 0 ? 5 : 9;
							((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = class282_sub50_sub11_sub1;
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378 = (new RsByteBuffer(i_54_ + i_51_ + (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aByte10376)));
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.writeByte(i_52_);
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.writeInt(i_51_);
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = -131722454;
							((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
						} else if ((-5971791 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377)) == 0) {
							if ((((Class312_Sub1) this).aClass282_Sub35_3647.buffer[0]) == -1) {
								((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = -442668975;
								((Class312_Sub1) this).aClass282_Sub35_3647.index = 0;
							} else
								((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
						} else
							throw new IOException();
					}
				} else {
					int i_55_ = ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer).length - ((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aByte10376);
					int i_56_ = 512 - (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377) * -5971791;
					if (i_56_ > i_55_ - (-1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index)))
						i_56_ = i_55_ - (-1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index));
					if (i_56_ > i_44_)
						i_56_ = i_44_;
					((Class312_Sub1) this).aClass202_7778.method3327((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer), -1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index), i_56_, -777445999);
					if (((Class312_Sub1) this).aByte3656 != 0) {
						for (int i_57_ = 0; i_57_ < i_56_; i_57_++)
							((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.buffer[i_57_ + ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index) * -1990677291)] ^= ((Class312_Sub1) this).aByte3656;
					}
					((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660).aClass282_Sub35_10378.index += i_56_ * -1115476867;
					((Class282_Sub50_Sub11_Sub1) ((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660).anInt10377 += i_56_ * -442668975;
					if (i_55_ == -1990677291 * (((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).aClass282_Sub35_10378.index)) {
						((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660.method13452((byte) -5);
						((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).incomplete = false;
						((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660 = null;
					} else if ((((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 * -5971791) == 512)
						((Class282_Sub50_Sub11_Sub1) (((Class312_Sub1) this).aClass282_Sub50_Sub11_Sub1_3660)).anInt10377 = 0;
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				((Class312_Sub1) this).aClass202_7778.method3318(859849832);
			} catch (Exception exception) {
				/* empty */
			}
			((Class312_Sub1) this).aClass202_7778 = null;
			anInt3657 += 1211706083;
			anInt3650 = -1877293362;
			if (method5553((short) 26378) == 0 && method5518(-1720565234) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public void method5550() {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(7);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(0L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -533636623);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(2071907403);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
	}

	public void method5554() {
		if (null != ((Class312_Sub1) this).aClass202_7778)
			((Class312_Sub1) this).aClass202_7778.method3318(167485151);
	}

	public void method5537() {
		if (((Class312_Sub1) this).aClass202_7778 != null)
			((Class312_Sub1) this).aClass202_7778.method3320((byte) 76);
	}

	public void method5532() {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(7);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(0L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -199994614);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(-800915699);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
	}

	public void method5552() {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(7);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(0L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, 391543029);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(855871609);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
	}

	public void method5530() {
		if (null != ((Class312_Sub1) this).aClass202_7778) {
			try {
				((Class312_Sub1) this).aClass282_Sub35_3655.index = 0;
				((Class312_Sub1) this).aClass282_Sub35_3655.writeByte(7);
				((Class312_Sub1) this).aClass282_Sub35_3655.method13204(0L);
				((Class312_Sub1) this).aClass202_7778.method3311((((Class312_Sub1) this).aClass282_Sub35_3655.buffer), 0, (((Class312_Sub1) this).aClass282_Sub35_3655.buffer).length, -2081026700);
			} catch (IOException ioexception) {
				try {
					((Class312_Sub1) this).aClass202_7778.method3318(198330451);
				} catch (Exception exception) {
					/* empty */
				}
				((Class312_Sub1) this).aClass202_7778 = null;
				anInt3657 += 1211706083;
				anInt3650 = -1877293362;
			}
		}
	}

	public void method5514() {
		if (((Class312_Sub1) this).aClass202_7778 != null)
			((Class312_Sub1) this).aClass202_7778.method3320((byte) 105);
	}

	void method5520(byte i) {
		try {
			((Class312_Sub1) this).aClass202_7778.method3318(1038372369);
		} catch (Exception exception) {
			/* empty */
		}
		((Class312_Sub1) this).aClass202_7778 = null;
		anInt3657 += 1211706083;
		anInt3650 = 1208836967;
		((Class312_Sub1) this).aByte3656 = (byte) (int) (Math.random() * 255.0 + 1.0);
	}

	public void method5527() {
		if (((Class312_Sub1) this).aClass202_7778 != null)
			((Class312_Sub1) this).aClass202_7778.method3320((byte) 73);
	}

	public void method5528() {
		if (((Class312_Sub1) this).aClass202_7778 != null)
			((Class312_Sub1) this).aClass202_7778.method3320((byte) 13);
	}

	public static Class282_Sub36 method12538(byte i) {
		if (null == Class291_Sub1.aClass482_3459 || Class291_Sub1.aClass460_8030 == null)
			return null;
		Class291_Sub1.aClass460_8030.method7684(Class291_Sub1.aClass482_3459, (byte) 74);
		Class282_Sub36 class282_sub36 = ((Class282_Sub36) Class291_Sub1.aClass460_8030.method7683(1601520946));
		if (null == class282_sub36)
			return null;
		WorldMapAreaDefs class220 = Class291_Sub1.aClass218_3456.getWorldMapDefs((class282_sub36.anInt7991 * -1798678621), 1419676338);
		if (null == class220 || !class220.aBool2742 || !class220.method3719(Class291_Sub1.anInterface42_3458, -305455176))
			return Class540.method11595(1263609035);
		return class282_sub36;
	}
}
