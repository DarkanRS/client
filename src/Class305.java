/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class305 {
	public Quaternion aClass381_3594;
	public Vector3 aClass385_3595;

	public void method5411(Class305 class305_0_) {
		aClass381_3594.copy(class305_0_.aClass381_3594);
		aClass385_3595.copy(class305_0_.aClass385_3595);
	}

	public String method5412() {
		return new StringBuilder().append("[").append(aClass381_3594.toString()).append("|").append(aClass385_3595.toString()).append("]").toString();
	}

	public Class305() {
		aClass381_3594 = new Quaternion();
		aClass385_3595 = new Vector3();
	}

	public final void method5413() {
		aClass381_3594.negate();
		aClass385_3595.negate();
		aClass385_3595.method6634(aClass381_3594);
	}

	public final void method5414(Class305 class305_1_) {
		aClass381_3594.multiply(class305_1_.aClass381_3594);
		aClass385_3595.method6634(class305_1_.aClass381_3594);
		aClass385_3595.add(class305_1_.aClass385_3595);
	}

	public Class305(Class305 class305_2_) {
		aClass381_3594 = new Quaternion();
		aClass385_3595 = new Vector3();
		method5411(class305_2_);
	}

	public String toString() {
		return new StringBuilder().append("[").append(aClass381_3594.toString()).append("|").append(aClass385_3595.toString()).append("]").toString();
	}

	public String method5415() {
		return new StringBuilder().append("[").append(aClass381_3594.toString()).append("|").append(aClass385_3595.toString()).append("]").toString();
	}

	public void method5416(Class305 class305_3_) {
		aClass381_3594.copy(class305_3_.aClass381_3594);
		aClass385_3595.copy(class305_3_.aClass385_3595);
	}
}
