/* Class452 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class452 {
	public Object anObject5443;
	public Object anObject5444;

	public String toString() {
		return new StringBuilder().append(anObject5443).append(", ").append(anObject5444).toString();
	}

	public String method7523() {
		return new StringBuilder().append(anObject5443).append(", ").append(anObject5444).toString();
	}

	public boolean equals(Object object) {
		if (object == null || !(object instanceof Class452))
			return false;
		Class452 class452_0_ = (Class452) object;
		if (anObject5443 == null) {
			if (class452_0_.anObject5443 != null)
				return false;
		} else if (!anObject5443.equals(class452_0_.anObject5443))
			return false;
		if (anObject5444 == null) {
			if (class452_0_.anObject5444 != null)
				return false;
		} else if (!anObject5444.equals(class452_0_.anObject5444))
			return false;
		return true;
	}

	public int hashCode() {
		int i = 0;
		if (anObject5443 != null)
			i += anObject5443.hashCode();
		if (anObject5444 != null)
			i += 31 * anObject5444.hashCode();
		return i;
	}

	public String method7524() {
		return new StringBuilder().append(anObject5443).append(", ").append(anObject5444).toString();
	}

	public boolean method7525(Object object) {
		if (object == null || !(object instanceof Class452))
			return false;
		Class452 class452_1_ = (Class452) object;
		if (anObject5443 == null) {
			if (class452_1_.anObject5443 != null)
				return false;
		} else if (!anObject5443.equals(class452_1_.anObject5443))
			return false;
		if (anObject5444 == null) {
			if (class452_1_.anObject5444 != null)
				return false;
		} else if (!anObject5444.equals(class452_1_.anObject5444))
			return false;
		return true;
	}

	public int method7526() {
		int i = 0;
		if (anObject5443 != null)
			i += anObject5443.hashCode();
		if (anObject5444 != null)
			i += 31 * anObject5444.hashCode();
		return i;
	}

	public Class452(Object object, Object object_2_) {
		anObject5443 = object;
		anObject5444 = object_2_;
	}

	public boolean method7527(Object object) {
		if (object == null || !(object instanceof Class452))
			return false;
		Class452 class452_3_ = (Class452) object;
		if (anObject5443 == null) {
			if (class452_3_.anObject5443 != null)
				return false;
		} else if (!anObject5443.equals(class452_3_.anObject5443))
			return false;
		if (anObject5444 == null) {
			if (class452_3_.anObject5444 != null)
				return false;
		} else if (!anObject5444.equals(class452_3_.anObject5444))
			return false;
		return true;
	}

	public boolean method7528(Object object) {
		if (object == null || !(object instanceof Class452))
			return false;
		Class452 class452_4_ = (Class452) object;
		if (anObject5443 == null) {
			if (class452_4_.anObject5443 != null)
				return false;
		} else if (!anObject5443.equals(class452_4_.anObject5443))
			return false;
		if (anObject5444 == null) {
			if (class452_4_.anObject5444 != null)
				return false;
		} else if (!anObject5444.equals(class452_4_.anObject5444))
			return false;
		return true;
	}
}
