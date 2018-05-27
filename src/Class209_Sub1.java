
/* Class209_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class209_Sub1 extends Class209 implements MouseListener, MouseMotionListener, MouseWheelListener {
	Component aComponent7935;
	static final int anInt7936 = 2;
	static final int anInt7937 = 4;
	int anInt7938;
	int anInt7939;
	int anInt7940;
	NodeCollection aClass482_7941 = new NodeCollection();
	int anInt7942;
	int anInt7943;
	int anInt7944;
	NodeCollection aClass482_7945 = new NodeCollection();
	boolean aBool7946;
	static final int anInt7947 = 1;

	public synchronized void mouseReleased(MouseEvent mouseevent) {
		int i = method12908(mouseevent, 1117707265);
		if ((((Class209_Sub1) this).anInt7944 * 1646603351 & i) == 0)
			i = 1646603351 * ((Class209_Sub1) this).anInt7944;
		if (0 != (i & 0x1))
			method12909(3, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1931505233);
		if (0 != (i & 0x4))
			method12909(5, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1931505233);
		if ((i & 0x2) != 0)
			method12909(4, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1931505233);
		((Class209_Sub1) this).anInt7944 = 919895911 * (((Class209_Sub1) this).anInt7944 * 1646603351 & (i ^ 0xffffffff));
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void mouseClicked(MouseEvent mouseevent) {
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	Class209_Sub1(Component component, boolean bool) {
		method12906(component, 1883441347);
		((Class209_Sub1) this).aBool7946 = bool;
	}

	public synchronized void method3589(byte i) {
		((Class209_Sub1) this).anInt7938 = ((Class209_Sub1) this).anInt7942 * 1630671813;
		((Class209_Sub1) this).anInt7939 = ((Class209_Sub1) this).anInt7943 * 1370759671;
		((Class209_Sub1) this).anInt7940 = ((Class209_Sub1) this).anInt7944 * -714190199;
		NodeCollection class482 = ((Class209_Sub1) this).aClass482_7941;
		((Class209_Sub1) this).aClass482_7941 = ((Class209_Sub1) this).aClass482_7945;
		((Class209_Sub1) this).aClass482_7945 = class482;
		((Class209_Sub1) this).aClass482_7945.method8118(-2108421155);
	}

	void method12905(int i, int i_0_, int i_1_) {
		((Class209_Sub1) this).anInt7942 = 1679338381 * i;
		((Class209_Sub1) this).anInt7943 = 1672782407 * i_0_;
		if (((Class209_Sub1) this).aBool7946)
			method12909(-1, i, i_0_, 0, -1931505233);
	}

	public boolean method3566(int i) {
		return 0 != (((Class209_Sub1) this).anInt7940 * -1237626913 & 0x2);
	}

	public int method3573() {
		return 954893953 * ((Class209_Sub1) this).anInt7939;
	}

	public boolean method3565(byte i) {
		return 0 != (((Class209_Sub1) this).anInt7940 * -1237626913 & 0x1);
	}

	public synchronized void mouseMoved(MouseEvent mouseevent) {
		method12905(mouseevent.getX(), mouseevent.getY(), -2109256124);
	}

	public boolean method3567(byte i) {
		return 0 != (((Class209_Sub1) this).anInt7940 * -1237626913 & 0x4);
	}

	void method12906(Component component, int i) {
		method12907((short) 12335);
		((Class209_Sub1) this).aComponent7935 = component;
		((Class209_Sub1) this).aComponent7935.addMouseListener(this);
		((Class209_Sub1) this).aComponent7935.addMouseMotionListener(this);
		((Class209_Sub1) this).aComponent7935.addMouseWheelListener(this);
	}

	public int method3569(int i) {
		return 1002227073 * ((Class209_Sub1) this).anInt7938;
	}

	public void method3584(int i) {
		method12907((short) 14669);
	}

	void method12907(short i) {
		if (((Class209_Sub1) this).aComponent7935 != null) {
			((Class209_Sub1) this).aComponent7935.removeMouseWheelListener(this);
			((Class209_Sub1) this).aComponent7935.removeMouseMotionListener(this);
			((Class209_Sub1) this).aComponent7935.removeMouseListener(this);
			((Class209_Sub1) this).aComponent7935 = null;
			((Class209_Sub1) this).anInt7940 = 0;
			((Class209_Sub1) this).anInt7939 = 0;
			((Class209_Sub1) this).anInt7938 = 0;
			((Class209_Sub1) this).anInt7944 = 0;
			((Class209_Sub1) this).anInt7943 = 0;
			((Class209_Sub1) this).anInt7942 = 0;
			((Class209_Sub1) this).aClass482_7941 = null;
			((Class209_Sub1) this).aClass482_7945 = null;
		}
	}

	public synchronized void mouseEntered(MouseEvent mouseevent) {
		method12905(mouseevent.getX(), mouseevent.getY(), -119743031);
	}

	public Class282_Sub53 method3571(byte i) {
		return ((Class282_Sub53) ((Class209_Sub1) this).aClass482_7941.method8061((byte) -121));
	}

	int method12908(MouseEvent mouseevent, int i) {
		if (mouseevent.getButton() == 1) {
			if (mouseevent.isMetaDown())
				return 4;
			return 1;
		}
		if (mouseevent.getButton() == 2)
			return 2;
		if (mouseevent.getButton() == 3)
			return 4;
		return 0;
	}

	public synchronized void mousePressed(MouseEvent mouseevent) {
		int i = method12908(mouseevent, -1413980906);
		if (i == 1)
			method12909(0, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1931505233);
		else if (i == 4)
			method12909(2, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1931505233);
		else if (i == 2)
			method12909(1, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1931505233);
		((Class209_Sub1) this).anInt7944 = 919895911 * (1646603351 * ((Class209_Sub1) this).anInt7944 | i);
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	void method12909(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		Class282_Sub53_Sub2 class282_sub53_sub2 = Class521_Sub1_Sub3_Sub1.method16080(i, i_2_, i_3_, Class169.method2869(1557164427), i_4_, 1660805972);
		((Class209_Sub1) this).aClass482_7945.append(class282_sub53_sub2, 335888371);
	}

	public synchronized void method3578() {
		((Class209_Sub1) this).anInt7938 = ((Class209_Sub1) this).anInt7942 * 1630671813;
		((Class209_Sub1) this).anInt7939 = ((Class209_Sub1) this).anInt7943 * 1370759671;
		((Class209_Sub1) this).anInt7940 = ((Class209_Sub1) this).anInt7944 * -714190199;
		NodeCollection class482 = ((Class209_Sub1) this).aClass482_7941;
		((Class209_Sub1) this).aClass482_7941 = ((Class209_Sub1) this).aClass482_7945;
		((Class209_Sub1) this).aClass482_7945 = class482;
		((Class209_Sub1) this).aClass482_7945.method8118(237232495);
	}

	public Class282_Sub53 method3590() {
		return ((Class282_Sub53) ((Class209_Sub1) this).aClass482_7941.method8061((byte) -90));
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		int i = mousewheelevent.getX();
		int i_6_ = mousewheelevent.getY();
		int i_7_ = mousewheelevent.getWheelRotation();
		method12909(6, i, i_6_, i_7_, -1931505233);
		mousewheelevent.consume();
	}

	public synchronized void method3581() {
		((Class209_Sub1) this).anInt7938 = ((Class209_Sub1) this).anInt7942 * 1630671813;
		((Class209_Sub1) this).anInt7939 = ((Class209_Sub1) this).anInt7943 * 1370759671;
		((Class209_Sub1) this).anInt7940 = ((Class209_Sub1) this).anInt7944 * -714190199;
		NodeCollection class482 = ((Class209_Sub1) this).aClass482_7941;
		((Class209_Sub1) this).aClass482_7941 = ((Class209_Sub1) this).aClass482_7945;
		((Class209_Sub1) this).aClass482_7945 = class482;
		((Class209_Sub1) this).aClass482_7945.method8118(-461780594);
	}

	public Class282_Sub53 method3591() {
		return ((Class282_Sub53) ((Class209_Sub1) this).aClass482_7941.method8061((byte) -123));
	}

	public boolean method3583() {
		return 0 != (((Class209_Sub1) this).anInt7940 * -1237626913 & 0x1);
	}

	public boolean method3580() {
		return 0 != (((Class209_Sub1) this).anInt7940 * -1237626913 & 0x2);
	}

	public boolean method3593() {
		return 0 != (((Class209_Sub1) this).anInt7940 * -1237626913 & 0x2);
	}

	public boolean method3582() {
		return 0 != (((Class209_Sub1) this).anInt7940 * -1237626913 & 0x4);
	}

	public boolean method3579() {
		return 0 != (((Class209_Sub1) this).anInt7940 * -1237626913 & 0x4);
	}

	public int method3585() {
		return 1002227073 * ((Class209_Sub1) this).anInt7938;
	}

	public int method3570(int i) {
		return 954893953 * ((Class209_Sub1) this).anInt7939;
	}

	public int method3564() {
		return 954893953 * ((Class209_Sub1) this).anInt7939;
	}

	public Class282_Sub53 method3592() {
		return ((Class282_Sub53) ((Class209_Sub1) this).aClass482_7941.method8061((byte) -101));
	}

	public synchronized void mouseExited(MouseEvent mouseevent) {
		method12905(mouseevent.getX(), mouseevent.getY(), -1606107629);
	}

	public synchronized void mouseDragged(MouseEvent mouseevent) {
		method12905(mouseevent.getX(), mouseevent.getY(), -641824056);
	}

	public Class282_Sub53 method3588() {
		return ((Class282_Sub53) ((Class209_Sub1) this).aClass482_7941.method8061((byte) -37));
	}

	public void method3594() {
		method12907((short) 11484);
	}

	public void method3595() {
		method12907((short) 31873);
	}

	void method12910(Component component) {
		method12907((short) 21776);
		((Class209_Sub1) this).aComponent7935 = component;
		((Class209_Sub1) this).aComponent7935.addMouseListener(this);
		((Class209_Sub1) this).aComponent7935.addMouseMotionListener(this);
		((Class209_Sub1) this).aComponent7935.addMouseWheelListener(this);
	}

	void method12911() {
		if (((Class209_Sub1) this).aComponent7935 != null) {
			((Class209_Sub1) this).aComponent7935.removeMouseWheelListener(this);
			((Class209_Sub1) this).aComponent7935.removeMouseMotionListener(this);
			((Class209_Sub1) this).aComponent7935.removeMouseListener(this);
			((Class209_Sub1) this).aComponent7935 = null;
			((Class209_Sub1) this).anInt7940 = 0;
			((Class209_Sub1) this).anInt7939 = 0;
			((Class209_Sub1) this).anInt7938 = 0;
			((Class209_Sub1) this).anInt7944 = 0;
			((Class209_Sub1) this).anInt7943 = 0;
			((Class209_Sub1) this).anInt7942 = 0;
			((Class209_Sub1) this).aClass482_7941 = null;
			((Class209_Sub1) this).aClass482_7945 = null;
		}
	}

	void method12912(int i, int i_8_, int i_9_, int i_10_) {
		Class282_Sub53_Sub2 class282_sub53_sub2 = Class521_Sub1_Sub3_Sub1.method16080(i, i_8_, i_9_, Class169.method2869(2110720470), i_10_, 2004293850);
		((Class209_Sub1) this).aClass482_7945.append(class282_sub53_sub2, 1726247046);
	}

	void method12913(int i, int i_11_, int i_12_, int i_13_) {
		Class282_Sub53_Sub2 class282_sub53_sub2 = Class521_Sub1_Sub3_Sub1.method16080(i, i_11_, i_12_, Class169.method2869(1587211340), i_13_, 1414576799);
		((Class209_Sub1) this).aClass482_7945.append(class282_sub53_sub2, 33532215);
	}

	void method12914(int i, int i_14_) {
		((Class209_Sub1) this).anInt7942 = 1679338381 * i;
		((Class209_Sub1) this).anInt7943 = 1672782407 * i_14_;
		if (((Class209_Sub1) this).aBool7946)
			method12909(-1, i, i_14_, 0, -1931505233);
	}

	static final void method12915(CS2Executor class527, int i) {
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) ((CS2Executor) class527).animable);
		String string = class521_sub1_sub1_sub2_sub2.aString10584;
		NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (null != class409.anIntArray4886) {
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null == class409)
				string = "";
			else
				string = class409.aString4857;
		}
		if (null == string)
			string = "";
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	public static void method12916(byte i) {
		for (int i_15_ = 0; i_15_ < 100; i_15_++) {
			if (i != 16)
				return;
			Class81.aClass108Array798[i_15_] = null;
		}
		Class81.anInt800 = 0;
	}
}
