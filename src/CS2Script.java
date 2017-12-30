/* Class282_Sub50_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CS2Script extends Class282_Sub50 {
	public Object[] stringOpValues;
	public String scriptName;
	public CS2Operation[] operations;
	public int[] intOpValues;
	public long[] longOpValues;
	public int longArgsCount;
	public int intLocalsCount;
	public int stringLocalsCount;
	public Class397 aClass397_9527;
	public int intArgsCount;
	public int stringArgsCount;
	public int longLocalsCount;
	public Class465[] switchMap;

	public CS2Script(RsByteBuffer buffer) {
		int instructionLength = decodeHeader(buffer);
		int opCount = 0;
		CS2Operation[] operations = Class191.getCS2Operations();
		while (-1990677291 * buffer.index < instructionLength) {
			CS2Operation op = getOpcode(buffer, operations);
			decodeInstruction(buffer, opCount, op);
			opCount++;
		}
	}

	CS2Operation getOpcode(RsByteBuffer buffer, CS2Operation[] operations) {
		int opcode = buffer.readUnsignedShort();
		if (opcode < 0 || opcode >= operations.length)
			throw new RuntimeException("");
		CS2Operation op = operations[opcode];
		return op;
	}

	int decodeHeader(RsByteBuffer buffer) {
		buffer.index = (buffer.buffer.length - 2) * -1115476867;
		int switchBlockSize = buffer.readUnsignedShort();
		int instructionLength = buffer.buffer.length - 2 - switchBlockSize - 16;
		buffer.index = -1115476867 * instructionLength;
		int codeSize = buffer.readInt();
		intLocalsCount = buffer.readUnsignedShort() * -1386418893;
		stringLocalsCount = buffer.readUnsignedShort() * -975682841;
		longLocalsCount = buffer.readUnsignedShort() * -60178873;
		intArgsCount = buffer.readUnsignedShort() * 950806069;
		stringArgsCount = buffer.readUnsignedShort() * 370522055;
		longArgsCount = buffer.readUnsignedShort() * -1593316803;
		int switchesCount = buffer.readUnsignedByte();
		if (switchesCount > 0) {
			switchMap = new Class465[switchesCount];
			for (int idx = 0; idx < switchesCount; idx++) {
				int numCases = buffer.readUnsignedShort();
				Class465 class465 = new Class465(Class323.nextPowerOfTwo(numCases, -234379644));
				switchMap[idx] = class465;
				while (numCases-- > 0) {
					int key = buffer.readInt();
					int value = buffer.readInt();
					class465.method7765(new Class282_Sub38(value), (long) key);
				}
			}
		}
		buffer.index = 0;
		scriptName = buffer.readNullString(198990051);
		operations = new CS2Operation[codeSize];
		return instructionLength;
	}

	void decodeInstruction(RsByteBuffer buffer, int opIndex, CS2Operation operation) {
		int i_11_ = operations.length;
		if (operation == CS2Operation.aClass522_5949) {
			if (stringOpValues == null)
				stringOpValues = new String[i_11_];
			stringOpValues[opIndex] = buffer.readString(835506752).intern();
		} else if (CS2Operation.aClass522_5980 == operation) {
			if (null == longOpValues)
				longOpValues = new long[i_11_];
			longOpValues[opIndex] = buffer.readLong(1461379326);
		} else {
			if (null == intOpValues)
				intOpValues = new int[i_11_];
			if (operation.aBool6953)
				intOpValues[opIndex] = buffer.readInt();
			else
				intOpValues[opIndex] = buffer.readUnsignedByte();
		}
		operations[opIndex] = operation;
	}
}
