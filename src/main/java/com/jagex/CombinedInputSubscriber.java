package com.jagex;

public class CombinedInputSubscriber implements InputSubscriber {

	static CombinedInputSubscriber decode(ByteBuf rsbytebuffer_0) {
		int clickType = rsbytebuffer_0.readUnsignedByte();
		int minimumClicks = rsbytebuffer_0.readUnsignedByte();
		int count = rsbytebuffer_0.readUnsignedByte();
		int[] keys = new int[count];
		for (int i_6 = 0; i_6 < count; i_6++)
			keys[i_6] = rsbytebuffer_0.readUnsignedByte();
		return new CombinedInputSubscriber(clickType, minimumClicks, keys);
	}
	static void queryItem(String query, boolean tradeableOnly, int paramId, int paramIntQuery, String paramStringQuery, boolean paramIsString) {
		query = query.toLowerCase();
		short[] results = new short[16];
		int paramIntDefault = -1;
		String paramStrDefault = null;
		if (paramId != -1) {
			ParamDefinitions paramDef = IndexLoaders.PARAM_LOADER.getParam(paramId);
			if (paramDef == null || paramDef.isString() != paramIsString)
				return;
			if (paramDef.isString())
				paramStrDefault = paramDef.typeName;
			else
				paramIntDefault = paramDef.defaultInt;
		}
		int numResults = 0;
		for (int i = 0; i < IndexLoaders.ITEM_LOADER.maxItemsCount; i++) {
			ItemDefinitions itemDef = IndexLoaders.ITEM_LOADER.getItemDefinitions(i);
			if ((!tradeableOnly || itemDef.grandExchange) && itemDef.certTemplateId == -1 && itemDef.lendTemplateId == -1 && itemDef.bindTemplateId == -1 && itemDef.unknownInt6 == 0 && itemDef.name.toLowerCase().indexOf(query) != -1) {
				if (paramId != -1)
					if (paramIsString) {
						if (!paramStringQuery.equals(itemDef.getCS2String(paramId, paramStrDefault)))
							continue;
					} else if (paramIntQuery != itemDef.getCS2Integer(paramId, paramIntDefault))
						continue;
				if (numResults >= 250) {
					VarcDefinitions.CS2_QUERY_RESULTS_LEN = -1;
					Class308.CS2_QUERY_RESULTS = null;
					return;
				}
				if (numResults >= results.length) {
					short[] newResults = new short[results.length * 2];
					System.arraycopy(results, 0, newResults, 0, numResults);
					results = newResults;
				}
				results[numResults++] = (short) i;
			}
		}
		Class308.CS2_QUERY_RESULTS = results;
		StaticElements.CS2_QUERY_RESULT_IDX = 0;
		VarcDefinitions.CS2_QUERY_RESULTS_LEN = numResults;
		String[] resultNames = new String[VarcDefinitions.CS2_QUERY_RESULTS_LEN];
		for (int i_12 = 0; i_12 < VarcDefinitions.CS2_QUERY_RESULTS_LEN; i_12++)
			resultNames[i_12] = IndexLoaders.ITEM_LOADER.getItemDefinitions(results[i_12]).name;
		ShaderDecoder.sortAlphabetically(resultNames, Class308.CS2_QUERY_RESULTS);
	}
	int clickType;

	int minimumClicks;

	int[] requiredKeys;

	CombinedInputSubscriber(int i_1, int i_2, int[] ints_3) {
		clickType = i_1;
		minimumClicks = i_2;
		requiredKeys = ints_3;
	}

	@Override
	public boolean valid(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, KeyRecorder class199_4) {
		if (class282_sub53_1 == null)
			return clickType == -1;
		if ((clickType != class282_sub53_1.getClickType()) || (minimumClicks > class282_sub53_1.getMeta()))
			return false;
		int[] ints_6 = requiredKeys;
		for (int i_8 : ints_6) {
			if (!class199_4.held(i_8))
				return false;
		}
		return true;
	}
}
