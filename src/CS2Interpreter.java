import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;

public class CS2Interpreter {

	public static final void executeOperation(CS2OpInfo operation, CS2Executor exec) {
		switch (operation) {
		case PUSH_INT:
			pushInt(exec);
			break;
		case LOAD_VARP:
			loadVarp(exec);
			break;
		case STORE_VARP:
			storeVarp(exec);
			break;
		case PUSH_STRING:
			pushString(exec);
			break;
		case GOTO:
			gotoInstr(exec);
			break;
		case INT_NE:
			intNotEqual(exec);
			break;
		case INT_EQ:
			intEqual(exec);
			break;
		case INT_LT:
			intLessThan(exec);
			break;
		case INT_GT:
			intGreaterThan(exec);
			break;
		case GET_VARP_OLD:
			getVarpOld(exec);
			break;
		case GET_VARPBIT_OLD:
			getVarpbitOld(exec);
			break;
		case GET_VARN_OLD:
			getVarnOld(exec);
			break;
		case GET_VARNBIT_OLD:
			getVarnbitOld(exec);
			break;
		case RETURN:
			returnInstr(exec);
			break;
		case LOAD_VARPBIT:
			loadVarpbit(exec);
			break;
		case STORE_VARPBIT:
			storeVarpbit(exec);
			break;
		case INT_LE:
			intLessOrEqual(exec);
			break;
		case INT_GE:
			intGreaterOrEqual(exec);
			break;
		case LOAD_INT:
			loadInt(exec);
			break;
		case STORE_INT:
			storeInt(exec);
			break;
		case LOAD_STRING:
			loadString(exec);
			break;
		case STORE_STRING:
			storeString(exec);
			break;
		case MERGE_STRINGS:
			mergeStrings(exec);
			break;
		case POP_INT:
			popInt(exec);
			break;
		case POP_STRING:
			popString(exec);
			break;
		case CALL_CS2:
			callCS2Script(exec);
			break;
		case LOAD_VARC:
			loadVarc(exec);
			break;
		case STORE_VARC:
			storeVarc(exec);
			break;
		case ARRAY_NEW:
			arrayNew(exec);
			break;
		case ARRAY_LOAD:
			arrayLoad(exec);
			break;
		case ARRAY_STORE:
			arrayStore(exec);
			break;
		case LOAD_VARC_STRING:
			loadVarcString(exec);
			break;
		case STORE_VARC_STRING:
			storeVarcString(exec);
			break;
		case SWITCH:
			switchInstr(exec);
			break;
		case PUSH_LONG:
			pushLong(exec);
			break;
		case POP_LONG:
			popLong(exec);
			break;
		case LOAD_LONG:
			loadLong(exec);
			break;
		case STORE_LONG:
			storeLong(exec);
			break;
		case LONG_NE:
			longNotEqual(exec);
			break;
		case LONG_EQ:
			longEqual(exec);
			break;
		case LONG_LT:
			longLessThan(exec);
			break;
		case LONG_GT:
			longGreaterThan(exec);
			break;
		case LONG_LE:
			longLessOrEqual(exec);
			break;
		case LONG_GE: //also branch
			longGreaterOrEqual(exec);
			break;
		case BRANCH_EQ1:
			branchEq1(exec);
			break;
		case BRANCH_EQ0:
			branchEq0(exec);
			break;
		case LOAD_CLAN_VAR:
			loadClanVar(exec);
			break;
		case LOAD_CLAN_VARBIT:
			loadClanVarbit(exec);
			break;
		case LOAD_CLAN_VAR_LONG:
			loadClanVarLong(exec);
			break;
		case LOAD_CLAN_VAR_STRING:
			loadClanVarString(exec);
			break;
		case LOAD_CLAN_SETTING_VAR:
			loadClanSettingVar(exec);
			break;
		case LOAD_CLAN_SETTING_VARBIT:
			loadClanSettingVarbit(exec);
			break;
		case LOAD_CLAN_SETTING_VAR_LONG:
			loadClanSettingVarLong(exec);
			break;
		case LOAD_CLAN_SETTING_VAR_STRING:
			loadClanSettingVarString(exec);
			break;
		case instr6137:
			method5962(exec);
			break;
		case instr6001:
			method3790(exec);
			break;
		case CLEAR_COMP_CHILDREN:
			clearCompChildren(exec);
			break;
		case instr6003:
			method6668(exec);
			break;
		case instr6004:
			method2620(exec);
			break;
		case instr6438:
			method15553(true, exec);
			break;
		case instr6006:
			method15553(false, exec);
			break;
		case instr6007:
			method5200(true, exec);
			break;
		case instr6008:
			method5200(false, exec);
			break;
		case instr6009:
			method4173(exec);
			break;
		case instr6419:
			method815(exec);
			break;
		case instr6011:
			method11224(exec);
			break;
		case instr6012:
			method1835(exec);
			break;
		case instr6635:
			method4310(exec);
			break;
		case instr6014:
			method773(exec);
			break;
		case instr6146:
			method7561(exec);
			break;
		case instr6016:
			method6116(exec);
			break;
		case instr6118:
			method2638(exec);
			break;
		case instr6018:
			method6282(exec);
			break;
		case instr6019:
			method3163(exec);
			break;
		case instr6020:
			method459(exec);
			break;
		case instr6626:
			method5314(exec);
			break;
		case instr6022:
			method3918(exec);
			break;
		case instr6023:
			method5487(exec);
			break;
		case instr6024:
			method6687(exec);
			break;
		case instr6025:
			method6071(exec);
			break;
		case instr6026:
			method5332(exec);
			break;
		case instr6027:
			method5774(exec);
			break;
		case instr6475:
			method8327(exec);
			break;
		case instr6683:
			method6364(exec);
			break;
		case instr6055:
			method8726(exec);
			break;
		case instr6031:
			method15523(exec);
			break;
		case instr6032:
			method5099(exec);
			break;
		case instr6033:
			method6291(exec);
			break;
		case instr6034:
			method13412(exec);
			break;
		case instr6817:
			method6271(exec);
			break;
		case instr6036:
			method12659(exec);
			break;
		case instr6037:
			method8714(exec);
			break;
		case instr6038:
			method4965(exec);
			break;
		case instr6039:
			method1497(exec);
			break;
		case instr6532:
			method1569(exec);
			break;
		case instr6098:
			method15448(exec);
			break;
		case instr6831:
			method7929(exec);
			break;
		case instr6043:
			method7933(exec);
			break;
		case instr6914:
			method12116(exec);
			break;
		case instr6045:
			method1259(exec);
			break;
		case instr6079:
			method893(exec);
			break;
		case instr6047:
			method1949(exec);
			break;
		case instr6048:
			method3031(exec);
			break;
		case instr6049:
			method4558(exec);
			break;
		case instr6050:
			method6210(exec);
			break;
		case instr6051:
			method8344(exec);
			break;
		case instr6052:
			method11380(exec);
			break;
		case instr6053:
			method6688(exec);
			break;
		case instr6198:
			method12846(exec);
			break;
		case instr6909:
			method8753(exec);
			break;
		case instr6068:
			method5833(exec);
			break;
		case instr6057:
			method3080(exec);
			break;
		case instr6306:
			method3356(exec);
			break;
		case instr6059:
			method6802(exec);
			break;
		case instr6105:
			method8212(exec);
			break;
		case instr6665:
			method6283(exec);
			break;
		case instr6912:
			method12719(exec);
			break;
		case instr6063:
			method4970(exec);
			break;
		case instr6064:
			method2567(exec);
			break;
		case instr6065:
			method6318(exec);
			break;
		case instr6066:
			method2563(exec);
			break;
		case instr6895:
			method6510(exec);
			break;
		case instr6618:
			method4381(exec);
			break;
		case instr6244:
			method15552(exec);
			break;
		case instr6070:
			method1570(exec);
			break;
		case instr6071:
			method6452(exec);
			break;
		case instr6676:
			method3941(exec);
			break;
		case instr6073:
			method2169(exec);
			break;
		case instr6443:
			method2965(exec);
			break;
		case instr6075:
			method4801(exec);
			break;
		case instr6076:
			method7522(exec);
			break;
		case instr6110:
			method1511(exec);
			break;
		case instr6179:
			method8298(exec);
			break;
		case instr6218:
			method6150(exec);
			break;
		case instr6080:
			method5203(exec);
			break;
		case instr6081:
			method541(exec);
			break;
		case instr6737:
			method12118(exec);
			break;
		case instr6083:
			method6305(exec);
			break;
		case instr6258:
			method5512(exec);
			break;
		case instr6085:
			method4200(exec);
			break;
		case instr6086:
			method15416(exec);
			break;
		case instr6087:
			method6776(exec);
			break;
		case instr6088:
			method1606(exec);
			break;
		case instr5957:
			method3892(exec);
			break;
		case instr6450:
			method4030(exec);
			break;
		case instr6091:
			method8285(exec);
			break;
		case instr6092:
			method5008(exec);
			break;
		case instr6224:
			method6120(exec);
			break;
		case instr6094:
			method1631(exec);
			break;
		case instr6095:
			method5454(exec);
			break;
		case instr6556:
			method14521(exec);
			break;
		case instr6687:
			method4971(exec);
			break;
		case instr6499:
			method14746(exec);
			break;
		case instr6084:
			method4797(exec);
			break;
		case instr6346:
			method260(exec);
			break;
		case instr6452:
			method6043(exec);
			break;
		case instr6899:
			method8723(exec);
			break;
		case instr6103:
			method485(exec);
			break;
		case instr6765:
			method12499(exec);
			break;
		case instr6370:
			method6395(exec);
			break;
		case instr6106:
			method12802(exec);
			break;
		case instr6580:
			method1084(exec);
			break;
		case instr6437:
			method5296(exec);
			break;
		case instr6903:
			method16095(exec);
			break;
		case instr6099:
			method3561(exec);
			break;
		case instr6111:
			method3676(exec);
			break;
		case instr6112:
			method5004(exec);
			break;
		case instr6113:
			method14340(exec);
			break;
		case instr6492:
			method3041(exec);
			break;
		case instr6096:
			method7270(exec);
			break;
		case instr6116:
			method5775(exec);
			break;
		case instr6054:
			method4283(exec);
			break;
		case instr6782:
			method3546(exec);
			break;
		case instr6119:
			method741(exec);
			break;
		case instr6120:
			method3370(exec);
			break;
		case instr6121:
			method6800(exec);
			break;
		case instr6552:
			method8863(exec);
			break;
		case instr6772:
			method6796(exec);
			break;
		case instr6124:
			method7032(exec);
			break;
		case instr6125:
			method5598(exec);
			break;
		case instr6344:
			method892(exec);
			break;
		case instr6462:
			method13491(exec);
			break;
		case instr6128:
			method3168(exec);
			break;
		case instr6762:
			method7219(exec);
			break;
		case instr6130:
			method11125(exec);
			break;
		case instr6131:
			method5123(exec);
			break;
		case instr6132:
			method7502(exec);
			break;
		case instr6133:
			method4901(exec);
			break;
		case instr6134:
			method14578(exec);
			break;
		case instr6135:
			method11249(exec);
			break;
		case instr6901:
			method12925(exec);
			break;
		case instr6529:
			method8211(exec);
			break;
		case instr6670:
			method6236(exec);
			break;
		case instr6139:
			method8735(exec);
			break;
		case instr6005:
			method11350(exec);
			break;
		case instr6262:
			method1498(exec);
			break;
		case instr6928:
			method6314(exec);
			break;
		case instr6771:
			method1134(exec);
			break;
		case instr6144:
			method12723(exec);
			break;
		case instr6230:
			method6449(exec);
			break;
		case instr6566:
			method15559(exec);
			break;
		case instr6842:
			method7676(exec);
			break;
		case instr6148:
			method8154(exec);
			break;
		case instr6636:
			method4277(exec);
			break;
		case instr6150:
			method4565(exec);
			break;
		case instr6151:
			method4802(exec);
			break;
		case instr6585:
			method1562(exec);
			break;
		case instr6153:
			method779(exec);
			break;
		case instr6154:
			method1864(exec);
			break;
		case instr6155:
			method401(exec);
			break;
		case instr6662:
			method8859(exec);
			break;
		case instr6157:
			method6138(exec);
			break;
		case SET_COMP_POS:
			setCompPosition(exec);
			break;
		case instr6934:
			method2826(exec);
			break;
		case HIDE_COMP:
			hideComp(exec);
			break;
		case instr6161:
			method283(exec);
			break;
		case instr6706:
			method1167(exec);
			break;
		case instr6163:
			method5302(exec);
			break;
		case instr6164:
			method15514(exec);
			break;
		case instr6165:
			method3554(exec);
			break;
		case SET_COMP_TRANSPARENCY:
			setCompTransparency(exec);
			break;
		case instr6167:
			method6016(exec);
			break;
		case SET_COMP_SPRITE:
			setCompSprite(exec);
			break;
		case instr6169:
			method460(exec);
			break;
		case instr6142:
			method3250(exec);
			break;
		case instr6171:
			method4311(exec);
			break;
		case instr6056:
			method3020(exec);
			break;
		case ANIMATE_COMP:
			animateComp(exec);
			break;
		case instr6174:
			method11492(exec);
			break;
		case instr6369:
			method1509(exec);
			break;
		case SET_COMP_TEXT:
			setCompText(exec);
			break;
		case instr6177:
			method3232(exec);
			break;
		case instr6178:
			method4205(exec);
			break;
		case instr6170:
			method8018(exec);
			break;
		case instr6180:
			method3064(exec);
			break;
		case instr6181:
			method484(exec);
			break;
		case instr6182:
			method4960(exec);
			break;
		case instr6183:
			method6669(exec);
			break;
		case instr6184:
			method1492(exec);
			break;
		case instr6185:
			method15510(exec);
			break;
		case instr6216:
			method11252(exec);
			break;
		case instr6187:
			method7208(exec);
			break;
		case instr6188:
			method6738(exec);
			break;
		case instr6377:
			method563(exec);
			break;
		case instr6190:
			method1624(exec);
			break;
		case instr6191:
			method5756(exec);
			break;
		case instr6192:
			method12839(exec);
			break;
		case instr6193:
			method14342(exec);
			break;
		case instr6194:
			method305(exec);
			break;
		case instr6195:
			method4174(exec);
			break;
		case instr6196:
			method7560(exec);
			break;
		case instr6197:
			method3949(exec);
			break;
		case instr6387:
			method1069(exec);
			break;
		case instr6199:
			method5024(exec);
			break;
		case instr6200:
			method4863(exec);
			break;
		case instr6201:
			method11403(exec);
			break;
		case instr6715:
			method2865(exec);
			break;
		case instr6864:
			method1510(exec);
			break;
		case instr6879:
			method6381(exec);
			break;
		case instr6205:
			method8750(exec);
			break;
		case instr6919:
			method12492(exec);
			break;
		case instr6207:
			method4961(exec);
			break;
		case instr6208:
			method8295(exec);
			break;
		case instr6209:
			method11126(exec);
			break;
		case instr6210:
			method3117(exec);
			break;
		case instr6129:
			method4962(exec);
			break;
		case instr6793:
			method3806(exec);
			break;
		case instr6213:
			method15475(exec);
			break;
		case instr6214:
			method4838(exec);
			break;
		case instr6215:
			method2150(exec);
			break;
		case instr5969:
			method8208(exec);
			break;
		case instr6217:
			method5488(exec);
			break;
		case instr6569:
			method6310(exec);
			break;
		case instr6219:
			method4633(exec);
			break;
		case instr6220:
			method4864(exec);
			break;
		case instr6221:
			method11373(exec);
			break;
		case instr6222:
			method8152(exec);
			break;
		case instr6223:
			method6141(exec);
			break;
		case instr6888:
			method1385(exec);
			break;
		case instr6136:
			method5758(exec);
			break;
		case instr6226:
			method6851(exec);
			break;
		case instr6477:
			method6938(exec);
			break;
		case instr6228:
			method7520(exec);
			break;
		case instr6229:
			method1349(exec);
			break;
		case HOOK_MOUSE_PRESS:
			hookMousePress(exec);
			break;
		case instr6231:
			method11438(exec);
			break;
		case instr6232:
			method4904(exec);
			break;
		case HOOK_MOUSE_ENTER:
			hookMouseEnter(exec);
			break;
		case HOOK_MOUSE_EXIT:
			hookMouseExit(exec);
			break;
		case instr6235:
			method2071(exec);
			break;
		case instr6527:
			method3357(exec);
			break;
		case instr6237:
			method3940(exec);
			break;
		case instr6342:
			method11246(exec);
			break;
		case instr6239:
			method2564(exec);
			break;
		case instr6240:
			method3596(exec);
			break;
		case instr5973:
			method5511(exec);
			break;
		case HOOK_MOUSE_HOVER:
			hookMouseHover(exec);
			break;
		case instr6243:
			method2595(exec);
			break;
		case instr6393:
			method6762(exec);
			break;
		case instr6376:
			method13408(exec);
			break;
		case instr6246:
			method14640(exec);
			break;
		case instr6247:
			method5000(exec);
			break;
		case instr6248:
			method564(exec);
			break;
		case instr6708:
			method11338(exec);
			break;
		case instr6250:
			method7961(exec);
			break;
		case instr6251:
			method11593(exec);
			break;
		case instr6252:
			method4175(exec);
			break;
		case instr6253:
			method11372(exec);
			break;
		case instr6254:
			method8694(exec);
			break;
		case instr6255:
			method4033(exec);
			break;
		case instr6256:
			method5595(exec);
			break;
		case instr6257:
			method6685(exec);
			break;
		case instr6507:
			method8843(exec);
			break;
		case instr6259:
			method1813(exec);
			break;
		case instr6260:
			method2855(exec);
			break;
		case instr6261:
			method4629(exec);
			break;
		case instr6898:
			method6372(exec);
			break;
		case instr6263:
			method6040(exec);
			break;
		case instr6398:
			method4146(exec);
			break;
		case instr6265:
			method6151(exec);
			break;
		case GET_COMP_WIDTH:
			getCompWidth(exec);
			break;
		case GET_COMP_HEIGHT:
			getCompHeight(exec);
			break;
		case instr6268:
			method6232(exec);
			break;
		case instr6269:
			method5045(exec);
			break;
		case instr6270:
			method8220(exec);
			break;
		case instr6271:
			method454(exec);
			break;
		case instr6272:
			method7422(exec);
			break;
		case instr6273:
			method11473(exec);
			break;
		case GET_COMP_TEXT:
			getCompText(exec);
			break;
		case instr6275:
			method858(exec);
			break;
		case instr6276:
			method14659(exec);
			break;
		case instr6277:
			method289(exec);
			break;
		case instr6292:
			method2945(exec);
			break;
		case instr6279:
			method6174(exec);
			break;
		case instr6280:
			method1571(exec);
			break;
		case instr6281:
			method11247(exec);
			break;
		case instr6544:
			method5926(exec);
			break;
		case instr6283:
			method6696(exec);
			break;
		case instr6284:
			method6212(exec);
			break;
		case instr6072:
			method3065(exec);
			break;
		case instr6159:
			method1512(exec);
			break;
		case instr6287:
			method14602(exec);
			break;
		case instr6288:
			method7643(exec);
			break;
		case instr6289:
			method6142(exec);
			break;
		case instr6290:
			method15392(exec);
			break;
		case instr6875:
			method4201(exec);
			break;
		case instr6805:
			method2914(exec);
			break;
		case instr6293:
			method4898(exec);
			break;
		case instr6294:
			method5002(exec);
			break;
		case instr6295:
			method14679(exec);
			break;
		case instr6296:
			method6041(exec);
			break;
		case instr6297:
			method8045(exec);
			break;
		case instr6298:
			method8215(exec);
			break;
		case instr6299:
			method8715(exec);
			break;
		case instr6300:
			method855(exec);
			break;
		case instr6391:
			method6941(exec);
			break;
		case instr6302:
			method6670(exec);
			break;
		case instr6303:
			method1967(exec);
			break;
		case instr6304:
			method14660(exec);
			break;
		case instr6646:
			method4865(exec);
			break;
		case instr6186:
			method3201(exec);
			break;
		case instr6307:
			method5029(exec);
			break;
		case instr6002:
			method3171(exec);
			break;
		case instr6309:
			method12583(exec);
			break;
		case instr6625:
			method3339(exec);
			break;
		case instr6311:
			method1836(exec);
			break;
		case instr6312:
			method3939(exec);
			break;
		case instr6313:
			method4889(exec);
			break;
		case instr6314:
			method5786(exec);
			break;
		case instr6315:
			method4197(exec);
			break;
		case instr6140:
			method6194(exec);
			break;
		case instr6317:
			method870(exec);
			break;
		case instr6318:
			method5082(exec);
			break;
		case instr6910:
			method12841(exec);
			break;
		case instr6320:
			method1355(exec);
			break;
		case instr6321:
			method4839(exec);
			break;
		case instr6322:
			method15399(exec);
			break;
		case instr6040:
			method6229(exec);
			break;
		case instr6324:
			method8147(exec);
			break;
		case instr6325:
			method2072(exec);
			break;
		case instr6326:
			method2870(exec);
			break;
		case PLAY_SOUND_EFFECT:
			playSoundEffect(exec);
			break;
		case instr6480:
			method3555(exec);
			break;
		case instr6329:
			method5027(exec);
			break;
		case instr6330:
			method14520(exec);
			break;
		case instr6619:
			method4557(exec);
			break;
		case instr6332:
			method11612(exec);
			break;
		case instr6333:
			method2823(exec);
			break;
		case instr6334:
			method8153(exec);
			break;
		case instr6788:
			method1888(exec);
			break;
		case instr6336:
			method5335(exec);
			break;
		case instr6337:
			method456(exec);
			break;
		case instr6338:
			method7675(exec);
			break;
		case instr6339:
			method5197(exec);
			break;
		case instr6810:
			method15389(exec);
			break;
		case instr6341:
			method2729(exec);
			break;
		case instr6467:
			method16089(exec);
			break;
		case instr6343:
			method3913(exec);
			break;
		case instr6701:
			method11486(exec);
			break;
		case instr6345:
			method7444(exec);
			break;
		case instr6067:
			method5408(exec);
			break;
		case instr6865:
			method13057(exec);
			break;
		case instr6348:
			method7427(exec);
			break;
		case instr6349:
			method5003(exec);
			break;
		case instr6385:
			method5733(exec);
			break;
		case instr6351:
			method4825(exec);
			break;
		case instr6575:
			method6230(exec);
			break;
		case instr6353:
			method5490(exec);
			break;
		case instr6354:
			method4312(exec);
			break;
		case GET_SYSTEM_UPDATE_TIMER:
			getSystemUpdateTimer(exec);
			break;
		case instr6356:
			method12584(exec);
			break;
		case instr6357:
			method14667(exec);
			break;
		case instr6358:
			method15376(exec);
			break;
		case instr6359:
			method1467(exec);
			break;
		case instr6360:
			method3033(exec);
			break;
		case instr6361:
			method1137(exec);
			break;
		case instr6362:
			method6916(exec);
			break;
		case instr6457:
			method15696(exec);
			break;
		case instr6364:
			method3743(exec);
			break;
		case instr6693:
			method3984(exec);
			break;
		case instr6366:
			method3228(exec);
			break;
		case instr6713:
			method1872(exec);
			break;
		case instr6734:
			method4193(exec);
			break;
		case instr6327:
			method1613(exec);
			break;
		case instr6168:
			method6799(exec);
			break;
		case instr6528:
			method3017(exec);
			break;
		case instr6604:
			method6399(exec);
			break;
		case instr6373:
			method14611(exec);
			break;
		case instr6374:
			method7699(exec);
			break;
		case instr6375:
			method3792(exec);
			break;
		case instr6889:
			method299(exec);
			break;
		case instr6143:
			method1801(exec);
			break;
		case instr6378:
			method7322(exec);
			break;
		case instr6379:
			method6121(exec);
			break;
		case instr6077:
			method2552(exec);
			break;
		case instr6381:
			method3340(exec);
			break;
		case instr6382:
			method13494(exec);
			break;
		case instr6383:
			method4031(exec);
			break;
		case instr6384:
			method7186(exec);
			break;
		case instr6396:
			method6275(exec);
			break;
		case instr6819:
			method4966(exec);
			break;
		case instr6896:
			method5901(exec);
			break;
		case instr6593:
			method14503(exec);
			break;
		case instr6389:
			method5776(exec);
			break;
		case GET_ENUM_SIZE:
			getEnumSize(exec);
			break;
		case instr6945:
			method1853(exec);
			break;
		case instr6392:
			method8757(exec);
			break;
		case instr6367:
			method6242(exec);
			break;
		case instr6705:
			method536(exec);
			break;
		case instr6395:
			method11594(exec);
			break;
		case instr6942:
			method7501(exec);
			break;
		case instr6397:
			method5828(exec);
			break;
		case instr6690:
			method4773(exec);
			break;
		case instr6763:
			method2096(exec);
			break;
		case instr6932:
			method5695(exec);
			break;
		case instr6401:
			method3597(exec);
			break;
		case instr6402:
			method11370(exec);
			break;
		case instr6403:
			method1641(exec);
			break;
		case instr6399:
			method1500(exec);
			break;
		case instr6405:
			method4278(exec);
			break;
		case instr6758:
			method1452(exec);
			break;
		case instr6407:
			method4181(exec);
			break;
		case instr6944:
			method7932(exec);
			break;
		case instr6409:
			method2871(exec);
			break;
		case instr6282:
			method3966(exec);
			break;
		case instr6411:
			method6680(exec);
			break;
		case instr6412:
			method8870(exec);
			break;
		case instr6413:
			method4905(exec);
			break;
		case instr6414:
			method8756(exec);
			break;
		case instr6415:
			method3829(exec);
			break;
		case instr6897:
			method6152(exec);
			break;
		case instr6417:
			method14491(exec);
			break;
		case instr6926:
			method4902(exec);
			break;
		case instr6093:
			method7928(exec);
			break;
		case instr6420:
			method4829(exec);
			break;
		case instr6421:
			method5489(exec);
			break;
		case instr6422:
			method16124(exec);
			break;
		case instr6423:
			method1608(exec);
			break;
		case instr6424:
			method13044(exec);
			break;
		case instr6061:
			method11355(exec);
			break;
		case instr6426:
			method1625(exec);
			break;
		case instr6427:
			method1775(exec);
			break;
		case instr6428:
			method14833(exec);
			break;
		case instr6429:
			method1462(exec);
			break;
		case instr6430:
			method3164(exec);
			break;
		case instr6431:
			method4566(exec);
			break;
		case instr6432:
			method8019(exec);
			break;
		case instr6029:
			method3739(exec);
			break;
		case instr6434:
			method8698(exec);
			break;
		case instr6435:
			method12881(exec);
			break;
		case instr6436:
			method5922(exec);
			break;
		case instr6491:
			method8701(exec);
			break;
		case instr6841:
			method5902(exec);
			break;
		case instr6264:
			method1889(exec);
			break;
		case instr6440:
			method7274(exec);
			break;
		case instr6441:
			method1135(exec);
			break;
		case instr6442:
			method1802(exec);
			break;
		case instr6769:
			method8037(exec);
			break;
		case instr6444:
			method2102(exec);
			break;
		case instr6445:
			method1171(exec);
			break;
		case instr6446:
			method3779(exec);
			break;
		case instr6447:
			method5362(exec);
			break;
		case instr6448:
			method933(exec);
			break;
		case instr6830:
			method4295(exec);
			break;
		case instr6160:
			method3361(exec);
			break;
		case instr6854:
			method6205(exec);
			break;
		case instr6114:
			method15075(exec);
			break;
		case instr6453:
			method6741(exec);
			break;
		case instr6454:
			method1501(exec);
			break;
		case instr6455:
			method13046(exec);
			break;
		case instr6931:
			method811(exec);
			break;
		case instr6531:
			method14644(exec);
			break;
		case instr6787:
			method3021(exec);
			break;
		case instr6459:
			method13410(exec);
			break;
		case instr6460:
			method1979(exec);
			break;
		case instr6461:
			method6677(exec);
			break;
		case instr6245:
			method3169(exec);
			break;
		case instr5984:
			method4968(exec);
			break;
		case instr6464:
			method3043(exec);
			break;
		case instr6465:
			method471(exec);
			break;
		case instr6147:
			method14639(exec);
			break;
		case instr6316:
			method6231(exec);
			break;
		case instr6468:
			method6316(exec);
			break;
		case instr6469:
			method13040(exec);
			break;
		case instr6340:
			method3802(exec);
			break;
		case instr6471:
			method7715(exec);
			break;
		case instr6472:
			method6206(exec);
			break;
		case instr6372:
			method6797(exec);
			break;
		case instr6474:
			method8716(exec);
			break;
		case instr6109:
			method1951(exec);
			break;
		case instr6266:
			method5297(exec);
			break;
		case ADD_INT:
			addInt(exec);
			break;
		case SUBTRACT_INT:
			subtractInt(exec);
			break;
		case MULTIPLY_INT:
			multiplyInt(exec);
			break;
		case DIVIDE_INT:
			divideInt(exec);
			break;
		case instr6481:
			method6207(exec);
			break;
		case instr6482:
			method5831(exec);
			break;
		case instr6479:
			method7463(exec);
			break;
		case instr6484:
			method6437(exec);
			break;
		case instr6485:
			method545(exec);
			break;
		case instr6564:
			method1882(exec);
			break;
		case instr6487:
			method6213(exec);
			break;
		case MOD_INT:
			modInt(exec);
			break;
		case instr6347:
			method4652(exec);
			break;
		case instr6490:
			method5494(exec);
			break;
		case BIT_AND:
			bitAnd(exec);
			break;
		case instr6732:
			method3691(exec);
			break;
		case MIN_INT:
			minInt(exec);
			break;
		case MAX_INT:
			maxInt(exec);
			break;
		case instr6495:
			method8719(exec);
			break;
		case instr6418:
			method6226(exec);
			break;
		case instr6497:
			method5292(exec);
			break;
		case instr6498:
			method13446(exec);
			break;
		case instr6541:
			method4987(exec);
			break;
		case instr6500:
			method6211(exec);
			break;
		case instr6501:
			method926(exec);
			break;
		case instr6502:
			method1817(exec);
			break;
		case LOWER_STRING:
			lowerString(exec);
			break;
		case instr6504:
			method4967(exec);
			break;
		case instr6505:
			method6243(exec);
			break;
		case INT_TO_STRING:
			intToString(exec);
			break;
		case STRING_EQUAL:
			stringEqual(exec);
			break;
		case instr6152:
			method3346(exec);
			break;
		case instr6801:
			method5735(exec);
			break;
		case instr6510:
			method7556(exec);
			break;
		case instr6511:
			method5456(exec);
			break;
		case instr6512:
			method6117(exec);
			break;
		case instr6513:
			method4252(exec);
			break;
		case instr6514:
			method8218(exec);
			break;
		case instr6515:
			method3068(exec);
			break;
		case instr6516:
			method550(exec);
			break;
		case STRING_LENGTH:
			stringLength(exec);
			break;
		case instr6518:
			method8839(exec);
			break;
		case instr6519:
			method3937(exec);
			break;
		case instr6520:
			method5915(exec);
			break;
		case instr6521:
			method3547(exec);
			break;
		case instr6522:
			method3951(exec);
			break;
		case instr6523:
			method6373(exec);
			break;
		case instr6795:
			method6691(exec);
			break;
		case instr6820:
			method1854(exec);
			break;
		case instr6881:
			method3830(exec);
			break;
		case instr6319:
			method6139(exec);
			break;
		case instr6100:
			method4247(exec);
			break;
		case instr6749:
			method3042(exec);
			break;
		case instr6893:
			method4202(exec);
			break;
		case instr6380:
			method6284(exec);
			break;
		case instr6335:
			method11406(exec);
			break;
		case instr6533:
			method12215(exec);
			break;
		case instr6534:
			method12724(exec);
			break;
		case instr6508:
			method7445(exec);
			break;
		case instr6408:
			method5765(exec);
			break;
		case instr6537:
			method6781(exec);
			break;
		case instr6538:
			method5198(exec);
			break;
		case instr6539:
			method2728(exec);
			break;
		case instr6540:
			method4630(exec);
			break;
		case instr6145:
			method5691(exec);
			break;
		case instr6542:
			method2868(exec);
			break;
		case instr6104:
			method4315(exec);
			break;
		case instr6291:
			method3229(exec);
			break;
		case instr6545:
			method4089(exec);
			break;
		case instr6546:
			method6400(exec);
			break;
		case instr6547:
			method3030(exec);
			break;
		case instr6548:
			method911(exec);
			break;
		case instr6549:
			method16100(exec);
			break;
		case instr6550:
			method11222(exec);
			break;
		case GET_STRUCT_VALUE:
			getStructValue(exec);
			break;
		case instr6947:
			method3674(exec);
			break;
		case instr6553:
			method15408(exec);
			break;
		case instr6554:
			method5755(exec);
			break;
		case instr6555:
			method2566(exec);
			break;
		case instr6458:
			method546(exec);
			break;
		case instr6746:
			method2872(exec);
			break;
		case instr6558:
			method11371(exec);
			break;
		case SEND_REPORT_ABUSE_PACKET:
			sendReportAbusePacket(exec);
			break;
		case instr6560:
			method2824(exec);
			break;
		case instr6739:
			method15512(exec);
			break;
		case instr6562:
			method5046(exec);
			break;
		case instr6563:
			method6005(exec);
			break;
		case instr6010:
			method1860(exec);
			break;
		case instr6211:
			method6913(exec);
			break;
		case instr6189:
			method6237(exec);
			break;
		case instr6624:
			method6733(exec);
			break;
		case instr6565:
			method3783(exec);
			break;
		case instr6796:
			method8717(exec);
			break;
		case instr6526:
			method1173(exec);
			break;
		case instr6225:
			method5100(exec);
			break;
		case instr6572:
			method1814(exec);
			break;
		case instr6573:
			method14835(exec);
			break;
		case instr6574:
			method7771(exec);
			break;
		case instr6682:
			method3803(exec);
			break;
		case instr6249:
			method894(exec);
			break;
		case instr6577:
			method565(exec);
			break;
		case instr6578:
			method12689(exec);
			break;
		case instr6202:
			method742(exec);
			break;
		case instr6030:
			method3780(exec);
			break;
		case instr6581:
			method814(exec);
			break;
		case instr6425:
			method14492(exec);
			break;
		case instr6583:
			method5697(exec);
			break;
		case instr6584:
			method8865(exec);
			break;
		case instr6069:
			method1362(exec);
			break;
		case instr6586:
			method11154(exec);
			break;
		case instr6587:
			method6315(exec);
			break;
		case instr6588:
			method8296(exec);
			break;
		case instr6368:
			method3921(exec);
			break;
		case instr6590:
			method291(exec);
			break;
		case instr6591:
			method7826(exec);
			break;
		case instr6592:
			method4148(exec);
			break;
		case instr6449:
			method1783(exec);
			break;
		case instr6594:
			method6304(exec);
			break;
		case instr6595:
			method6439(exec);
			break;
		case instr6596:
			method4631(exec);
			break;
		case instr6597:
			method1085(exec);
			break;
		case instr6598:
			method2091(exec);
			break;
		case instr6599:
			method1070(exec);
			break;
		case instr6613:
			method3986(exec);
			break;
		case instr6601:
			method3950(exec);
			break;
		case instr6602:
			method468(exec);
			break;
		case instr6603:
			method1603(exec);
			break;
		case instr6233:
			method3988(exec);
			break;
		case instr6716:
			method928(exec);
			break;
		case instr6606:
			method8297(exec);
			break;
		case instr6607:
			method4798(exec);
			break;
		case instr6608:
			method15417(exec);
			break;
		case instr6308:
			method7668(exec);
			break;
		case instr6610:
			method13756(exec);
			break;
		case instr6611:
			method6073(exec);
			break;
		case instr6612:
			method8219(exec);
			break;
		case instr6849:
			method1391(exec);
			break;
		case instr6614:
			method7276(exec);
			break;
		case instr6615:
			method4988(exec);
			break;
		case instr6616:
			method5788(exec);
			break;
		case instr6617:
			method787(exec);
			break;
		case instr6090:
			method3556(exec);
			break;
		case instr6074:
			method2856(exec);
			break;
		case instr6620:
			method856(exec);
			break;
		case instr6621:
			method2737(exec);
			break;
		case instr6439:
			method3768(exec);
			break;
		case instr6685:
			method7043(exec);
			break;
		case instr6638:
			method2584(exec);
			break;
		case instr6212:
			method2916(exec);
			break;
		case instr5966:
			method12572(exec);
			break;
		case instr6206:
			method810(exec);
			break;
		case instr6628:
			method7774(exec);
			break;
		case instr6238:
			method3919(exec);
			break;
		case instr6630:
			method11339(exec);
			break;
		case instr6631:
			method5829(exec);
			break;
		case instr6632:
			method12506(exec);
			break;
		case instr6633:
			method2963(exec);
			break;
		case instr6634:
			method14836(exec);
			break;
		case instr6582:
			method3557(exec);
			break;
		case instr6671:
			method4091(exec);
			break;
		case instr6637:
			method12660(exec);
			break;
		case instr6818:
			method15403(exec);
			break;
		case instr6639:
			method3804(exec);
			break;
		case instr6488:
			method3613(exec);
			break;
		case instr6704:
			method3066(exec);
			break;
		case instr6404:
			method5769(exec);
			break;
		case instr6643:
			method14244(exec);
			break;
		case instr6644:
			method8199(exec);
			break;
		case instr6645:
			method12933(exec);
			break;
		case instr6406:
			method3358(exec);
			break;
		case instr6647:
			method8738(exec);
			break;
		case instr6648:
			method14434(exec);
			break;
		case instr6649:
			method1861(exec);
			break;
		case instr6650:
			method296(exec);
			break;
		case instr6651:
			method2112(exec);
			break;
		case instr6652:
			method4176(exec);
			break;
		case instr6653:
			method2866(exec);
			break;
		case instr6654:
			method4774(exec);
			break;
		case instr6655:
			method8263(exec);
			break;
		case instr6656:
			method1604(exec);
			break;
		case instr6657:
			method8206(exec);
			break;
		case instr6658:
			method7277(exec);
			break;
		case instr6666:
			method11405(exec);
			break;
		case instr6660:
			method3938(exec);
			break;
		case instr6661:
			method254(exec);
			break;
		case instr6866:
			method584(exec);
			break;
		case instr6416:
			method2171(exec);
			break;
		case instr6410:
			method587(exec);
			break;
		case instr5956:
			method6440(exec);
			break;
		case instr6780:
			method7209(exec);
			break;
		case instr6667:
			method12210(exec);
			break;
		case instr6668:
			method6044(exec);
			break;
		case CHECK_JAVA_VERSION:
			checkJavaVersion(exec);
			break;
		case instr6044:
			method6317(exec);
			break;
		case instr6923:
			method15513(exec);
			break;
		case instr6672:
			method8718(exec);
			break;
		case instr6673:
			method7021(exec);
			break;
		case instr6451:
			method13359(exec);
			break;
		case instr6675:
			method4177(exec);
			break;
		case instr6162:
			method1162(exec);
			break;
		case instr6677:
			method1366(exec);
			break;
		case instr6678:
			method1837(exec);
			break;
		case instr6679:
			method16079(exec);
			break;
		case instr6456:
			method1456(exec);
			break;
		case instr6681:
			method1370(exec);
			break;
		case instr6663:
			method4775(exec);
			break;
		case instr6108:
			method1627(exec);
			break;
		case instr6684:
			method1071(exec);
			break;
		case instr6823:
			method7518(exec);
			break;
		case instr6686:
			method1367(exec);
			break;
		case instr6331:
			method8205(exec);
			break;
		case instr6627:
			method11439(exec);
			break;
		case instr6236:
			method8742(exec);
			break;
		case instr6013:
			method3038(exec);
			break;
		case instr6122:
			method12115(exec);
			break;
		case instr6692:
			method6674(exec);
			break;
		case instr6204:
			method6695(exec);
			break;
		case instr6694:
			method3368(exec);
			break;
		case SEND_VERIFY_EMAIL_PACKET:
			sendVerifyEmailPacket(exec);
			break;
		case instr6568:
			method4568(exec);
			break;
		case instr6697:
			method3172(exec);
			break;
		case instr6698:
			method7704(exec);
			break;
		case instr6699:
			method8303(exec);
			break;
		case instr6700:
			method4417(exec);
			break;
		case instr6323:
			method4161(exec);
			break;
		case instr6702:
			method5119(exec);
			break;
		case instr6703:
			method5205(exec);
			break;
		case instr6774:
			method4826(exec);
			break;
		case instr6641:
			method2107(exec);
			break;
		case instr6305:
			method301(exec);
			break;
		case instr6707:
			method5925(exec);
			break;
		case instr6623:
			method775(exec);
			break;
		case instr6709:
			method6285(exec);
			break;
		case instr6710:
			method2825(exec);
			break;
		case instr6711:
			method12597(exec);
			break;
		case instr6712:
			method453(exec);
			break;
		case instr6642:
			method6280(exec);
			break;
		case instr6714:
			method3119(exec);
			break;
		case instr6576:
			method14669(exec);
			break;
		case instr6101:
			method2153(exec);
			break;
		case instr6717:
			method3120(exec);
			break;
		case instr6718:
			method6169(exec);
			break;
		case instr6719:
			method6396(exec);
			break;
		case instr6720:
			method7744(exec);
			break;
		case instr6721:
			method3748(exec);
			break;
		case instr6722:
			method5047(exec);
			break;
		case instr6609:
			method284(exec);
			break;
		case instr6724:
			method457(exec);
			break;
		case instr6725:
			method7500(exec);
			break;
		case instr6726:
			method2568(exec);
			break;
		case instr6727:
			method14857(exec);
			break;
		case instr6860:
			method3611(exec);
			break;
		case instr6729:
			method451(exec);
			break;
		case instr6730:
			method3693(exec);
			break;
		case instr6731:
			method12803(exec);
			break;
		case instr6674:
			method14647(exec);
			break;
		case instr6733:
			method3942(exec);
			break;
		case instr6741:
			method3599(exec);
			break;
		case instr6735:
			method2554(exec);
			break;
		case instr6736:
			method12718(exec);
			break;
		case instr6525:
			method6397(exec);
			break;
		case instr6738:
			method11218(exec);
			break;
		case instr5993:
			method4168(exec);
			break;
		case instr6740:
			method5766(exec);
			break;
		case instr6557:
			method1508(exec);
			break;
		case instr6742:
			method1857(exec);
			break;
		case instr6743:
			method3750(exec);
			break;
		case instr6744:
			method1803(exec);
			break;
		case instr6745:
			method6678(exec);
			break;
		case instr6922:
			method6729(exec);
			break;
		case instr6747:
			method2586(exec);
			break;
		case instr6748:
			method3079(exec);
			break;
		case instr6570:
			method4035(exec);
			break;
		case instr6750:
			method3200(exec);
			break;
		case instr6629:
			method4899(exec);
			break;
		case instr6752:
			method1586(exec);
			break;
		case instr6948:
			method452(exec);
			break;
		case instr6754:
			method8156(exec);
			break;
		case instr6285:
			method292(exec);
			break;
		case instr6756:
			method15555(exec);
			break;
		case instr6688:
			method6773(exec);
			break;
		case instr6489:
			method12560(exec);
			break;
		case instr6759:
			method1350(exec);
			break;
		case instr6785:
			method6675(exec);
			break;
		case instr6761:
			method585(exec);
			break;
		case GET_WATER_PREFERENCE:
			getWaterPreference(exec);
			break;
		case instr6060:
			method5122(exec);
			break;
		case instr6938:
			method6195(exec);
			break;
		case instr6755:
			method7082(exec);
			break;
		case instr6766:
			method4881(exec);
			break;
		case instr6767:
			method3692(exec);
			break;
		case instr6768:
			method13404(exec);
			break;
		case instr5975:
			method4279(exec);
			break;
		case instr6770:
			method2978(exec);
			break;
		case instr6605:
			method3893(exec);
			break;
		case instr6640:
			method15449(exec);
			break;
		case instr6773:
			method7334(exec);
			break;
		case instr6925:
			method13301(exec);
			break;
		case instr5954:
			method1140(exec);
			break;
		case instr6600:
			method3667(exec);
			break;
		case instr6777:
			method6908(exec);
			break;
		case instr6778:
			method7448(exec);
			break;
		case instr6286:
			method4900(exec);
			break;
		case instr6400:
			method2549(exec);
			break;
		case instr6781:
			method1463(exec);
			break;
		case instr6301:
			method5734(exec);
			break;
		case instr6783:
			method7143(exec);
			break;
		case instr6784:
			method6238(exec);
			break;
		case instr6941:
			method4324(exec);
			break;
		case instr6786:
			method6153(exec);
			break;
		case instr6775:
			method934(exec);
			break;
		case instr6097:
			method745(exec);
			break;
		case instr6789:
			method2873(exec);
			break;
		case instr6790:
			method1643(exec);
			break;
		case instr6764:
			method1815(exec);
			break;
		case instr6792:
			method15404(exec);
			break;
		case instr6141:
			method4882(exec);
			break;
		case instr6486:
			method4973(exec);
			break;
		case instr5988:
			method2587(exec);
			break;
		case instr6365:
			method7551(exec);
			break;
		case instr6797:
			method287(exec);
			break;
		case instr6798:
			method4178(exec);
			break;
		case instr6799:
			method5299(exec);
			break;
		case instr6800:
			method1479(exec);
			break;
		case instr6821:
			method6272(exec);
			break;
		case instr6802:
			method4194(exec);
			break;
		case instr6803:
			method15437(exec);
			break;
		case instr6227:
			method6374(exec);
			break;
		case instr6829:
			method11244(exec);
			break;
		case instr6806:
			method5010(exec);
			break;
		case instr6807:
			method1387(exec);
			break;
		case instr6808:
			method7726(exec);
			break;
		case instr6809:
			method5816(exec);
			break;
		case instr6804:
			method12573(exec);
			break;
		case instr6589:
			method3039(exec);
			break;
		case instr6812:
			method927(exec);
			break;
		case instr6813:
			method11613(exec);
			break;
		case instr6950:
			method7006(exec);
			break;
		case instr6815:
			method5904(exec);
			break;
		case instr6816:
			method3341(exec);
			break;
		case instr6015:
			method8724(exec);
			break;
		case instr6386:
			method7187(exec);
			break;
		case instr6659:
			method11440(exec);
			break;
		case instr6794:
			method11128(exec);
			break;
		case instr6278:
			method3562(exec);
			break;
		case instr6890:
			method15387(exec);
			break;
		case instr6350:
			method8021(exec);
			break;
		case instr6824:
			method6940(exec);
			break;
		case instr6825:
			method11340(exec);
			break;
		case instr6826:
			method3714(exec);
			break;
		case instr6827:
			method548(exec);
			break;
		case instr6828:
			method3911(exec);
			break;
		case instr6920:
			method1138(exec);
			break;
		case instr5955:
			method504(exec);
			break;
		case instr6696:
			method15616(exec);
			break;
		case instr6832:
			method1255(exec);
			break;
		case instr6833:
			method3755(exec);
			break;
		case instr6834:
			method290(exec);
			break;
		case instr6835:
			method8758(exec);
			break;
		case instr6836:
			method5832(exec);
			break;
		case instr6837:
			method1499(exec);
			break;
		case instr6509:
			method14655(exec);
			break;
		case instr6839:
			method7915(exec);
			break;
		case instr6840:
			method12859(exec);
			break;
		case instr6536:
			method7462(exec);
			break;
		case instr6483:
			method3894(exec);
			break;
		case instr6843:
			method1357(exec);
			break;
		case instr6844:
			method1855(exec);
			break;
		case instr6845:
			method12352(exec);
			break;
		case instr6846:
			method586(exec);
			break;
		case instr6847:
			method13467(exec);
			break;
		case instr6848:
			method8869(exec);
			break;
		case instr6496:
			method1816(exec);
			break;
		case instr6850:
			method1351(exec);
			break;
		case instr6851:
			method6046(exec);
			break;
		case instr6852:
			method1590(exec);
			break;
		case instr6853:
			method3233(exec);
			break;
		case instr6310:
			method7773(exec);
			break;
		case instr6855:
			method15306(exec);
			break;
		case instr6394:
			method6239(exec);
			break;
		case instr6857:
			method4776(exec);
			break;
		case instr6858:
			method6998(exec);
			break;
		case instr6859:
			method481(exec);
			break;
		case instr6046:
			method6290(exec);
			break;
		case instr6861:
			method12561(exec);
			break;
		case instr6862:
			method5199(exec);
			break;
		case instr6863:
			method14818(exec);
			break;
		case instr6838:
			method3170(exec);
			break;
		case instr6680:
			method7962(exec);
			break;
		case instr6476:
			method14839(exec);
			break;
		case instr6867:
			method15406(exec);
			break;
		case instr6868:
			method572(exec);
			break;
		case instr6869:
			method6350(exec);
			break;
		case instr6058:
			method2597(exec);
			break;
		case instr6871:
			method1862(exec);
			break;
		case instr6779:
			method15371(exec);
			break;
		case instr6873:
			method4989(exec);
			break;
		case instr6874:
			method2588(exec);
			break;
		case instr6041:
			method8343(exec);
			break;
		case instr6876:
			method5767(exec);
			break;
		case instr6877:
			method11147(exec);
			break;
		case instr6878:
			method6072(exec);
			break;
		case instr6776:
			method8844(exec);
			break;
		case instr6880:
			method743(exec);
			break;
		case instr6822:
			method7552(exec);
			break;
		case instr6882:
			method5065(exec);
			break;
		case instr6883:
			method7420(exec);
			break;
		case instr6884:
			method3781(exec);
			break;
		case instr6885:
			method1574(exec);
			break;
		case instr6886:
			method11341(exec);
			break;
		case instr6887:
			method15551(exec);
			break;
		case instr6760:
			method11351(exec);
			break;
		case instr6156:
			method3713(exec);
			break;
		case instr6123:
			method7218(exec);
			break;
		case instr6891:
			method6279(exec);
			break;
		case instr6892:
			method14649(exec);
			break;
		case instr6872:
			method4413(exec);
			break;
		case instr6894:
			method1352(exec);
			break;
		case instr6622:
			method1572(exec);
			break;
		case instr5997:
			method12596(exec);
			break;
		case instr6543:
			method15407(exec);
			break;
		case instr6433:
			method1968(exec);
			break;
		case instr6173:
			method2108(exec);
			break;
		case instr6900:
			method4867(exec);
			break;
		case instr6388:
			method543(exec);
			break;
		case instr6902:
			method261(exec);
			break;
		case instr6203:
			method6281(exec);
			break;
		case instr6904:
			method6730(exec);
			break;
		case instr6905:
			method5814(exec);
			break;
		case instr6906:
			method12586(exec);
			break;
		case instr6907:
			method12915(exec);
			break;
		case instr6908:
			method1784(exec);
			break;
		case instr6664:
			method6190(exec);
			break;
		case instr5946:
			method14606(exec);
			break;
		case instr6911:
			method2867(exec);
			break;
		case instr6028:
			method2639(exec);
			break;
		case instr6913:
			method300(exec);
			break;
		case instr6107:
			method3740(exec);
			break;
		case instr6915:
			method3344(exec);
			break;
		case instr6916:
			method4830(exec);
			break;
		case instr6917:
			method2103(exec);
			break;
		case instr6918:
			method5692(exec);
			break;
		case instr6102:
			method4137(exec);
			break;
		case instr6126:
			method6042(exec);
			break;
		case instr6921:
			method3769(exec);
			break;
		case instr6000:
			method7332(exec);
			break;
		case instr6751:
			method798(exec);
			break;
		case instr6924:
			method3067(exec);
			break;
		case instr6728:
			method5298(exec);
			break;
		case instr6021:
			method8700(exec);
			break;
		case instr6089:
			method2101(exec);
			break;
		case instr6463:
			method5736(exec);
			break;
		case instr6929:
			method356(exec);
			break;
		case instr6930:
			method7434(exec);
			break;
		case instr6371:
			method7461(exec);
			break;
		case instr6723:
			method1799(exec);
			break;
		case instr6933:
			method5016(exec);
			break;
		case instr6535:
			method777(exec);
			break;
		case instr6935:
			method4314(exec);
			break;
		case instr6936:
			method3753(exec);
			break;
		case instr6937:
			method466(exec);
			break;
		case instr6042:
			method2953(exec);
			break;
		case instr6939:
			method2092(exec);
			break;
		case instr6940:
			method2841(exec);
			break;
		case instr6691:
			method14841(exec);
			break;
		case instr6062:
			method868(exec);
			break;
		case instr6943:
			method3553(exec);
			break;
		case instr6352:
			method1067(exec);
			break;
		case instr6078:
			method7083(exec);
			break;
		case instr6946:
			method11592(exec);
			break;
		case instr6241:
			method12587(exec);
			break;
		case instr6571:
			method4556(exec);
			break;
		case instr6949:
			method8216(exec);
			break;
		case instr6927:
			method5290(exec);
			break;
		case instr6951:
			method4249(exec);
			break;
		default:
			throw new RuntimeException();
		}

	}

	static final void method5200(boolean bool, CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_3 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_3.aClass118_5886;
		Interface interface_5 = underlaydefinition_3.aClass98_5885;
		if (bool) {
			Class455.method7554(interface_5, icomponentdefinitions_4, 658695956);
		} else {
			MapAreaIndexLoader.method3710(interface_5, icomponentdefinitions_4);
		}
	}

	static final void method15553(boolean bool, CS2Executor executor) {
		int i_3 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_4 = IComponentDefinitions.getDefs(i_3);
		Interface interface_5 = Class468_Sub8.INTERFACES[i_3 >> 16];
		if (bool) {
			Class455.method7554(interface_5, icomponentdefinitions_4, 1019153265);
		} else {
			MapAreaIndexLoader.method3710(interface_5, icomponentdefinitions_4);
		}

	}

	static final void method5755(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7323 ? 1 : 0;
	}

	static final void method5756(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method1454(icomponentdefinitions_3, interface_4, executor, (byte) 50);
	}

	static final void method5758(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method7927(icomponentdefinitions_3, executor, (byte) -98);
	}

	static final void method3546(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method5017(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3547(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		int i_4 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = string_2.indexOf(string_3, i_4);
	}

	static final void method2597(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (client.aBool7310) {
			try {
				Class361.aClass361_4183.method6254(new Object[] { string_2 }, (byte) -80);
			} catch (Throwable throwable_4) {
				;
			}
		}
	}

	static final void loadClanVarbit(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		ClanVarDefinitions class405_3 = IndexLoaders.CLAN_VAR_LOADER.method6753(i_2, -292141252);
		if (class405_3.aChar4832 != 1) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
		Integer integer_4 = (Integer) Class46.CLAN_VARS[class405_3.baseVar];
		if (integer_4 == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			int i_5 = class405_3.endBit == 31 ? -1 : (1 << class405_3.endBit + 1) - 1;
			executor.intStack[++executor.intStackPtr - 1] = (integer_4.intValue() & i_5) >>> class405_3.startBit;
		}
	}

	static final void loadClanSettingVarLong(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		Long long_3 = executor.currentClanSettings.getLongVar(client.CURRENT_GAME.id << 16 | i_2);
		long long_4;
		if (long_3 == null) {
			long_4 = -1L;
		} else {
			long_4 = long_3.longValue();
		}
		executor.longStack[++executor.longStackPtr - 1] = long_4;
	}
	
	static final void loadClanSettingVarString(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		String string_3 = executor.currentClanSettings.getStringVar(client.CURRENT_GAME.id << 16 | i_2);
		String string_4;
		if (string_3 == null) {
			string_4 = "";
		} else {
			string_4 = string_3;
		}
		executor.stringStack[++executor.stringStackPtr - 1] = string_4;
	}

	static final void method11218(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub20_8207, i_2, 1266441439);
		Class190.savePreferences((byte) 88);
		client.aBool7175 = false;
	}

	static final void gotoInstr(CS2Executor executor) {
		executor.instrPtr += executor.intOpValues[executor.instrPtr];
	}

	static final void method1255(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		MapAreaDefinitions worldmapareadefs_3 = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2, 676193293);
		executor.intStack[++executor.intStackPtr - 1] = worldmapareadefs_3.anInt2719;
	}

	static final void method7518(CS2Executor executor) {
		NodeCollection.method8146();
	}

	static final void method7520(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method12209(icomponentdefinitions_3, interface_4, executor);
	}

	static final void getWaterPreference(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.water.getValue(308447312) == 2 ? 1 : 0;
	}

	static final void method7522(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6122(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method5408(CS2Executor executor) {
		byte b_2 = VertexNormal.myPlayer.plane;
		Vector3 vector3_3 = VertexNormal.myPlayer.method11166().aClass385_3595;
		CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
		int i_5 = ((int) vector3_3.x >> 9) + coordgrid_4.x;
		int i_6 = ((int) vector3_3.z >> 9) + coordgrid_4.y;
		executor.intStack[++executor.intStackPtr - 1] = (i_5 << 14) + i_6 + (b_2 << 28);
	}

	static final void method15510(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method506(icomponentdefinitions_3, interface_4, executor, 73822298);
	}

	static final void method15512(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		int i_4 = -1;
		if (chatline_3 != null) {
			i_4 = chatline_3.type;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static final void method15513(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = method15508().toString();
	}

	public static File method15508() {
		return Engine.aFile3264;
	}

	static final void method15514(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method5121(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method2865(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method11337(icomponentdefinitions_3, interface_4, executor, -1404316012);
	}

	static final void method2866(CS2Executor executor) {
		if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
			Class440.method7373(Class393.preferences.screenSize.method12687(-580037051), -1, -1, false, (byte) 116);
		}
		if (NamedFileReference.method867(-391014767) == Class279.aClass279_3368) {
			Class282_Sub11.method12211(-541554902);
			System.exit(0);
		} else {
			Class480.method8043(-25732624);
		}
	}

	static final void method2867(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.animable.method12997();
	}

	static final void method2868(CS2Executor executor) {
		if (Class308.aShortArray3621 != null && Class283.anInt3384 < VarcDefinitions.anInt4985) {
			executor.intStack[++executor.intStackPtr - 1] = Class308.aShortArray3621[++Class283.anInt3384 - 1] & 0xffff;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		}
	}

	static final void method1366(CS2Executor executor) {
		executor.intStackPtr -= 6;
		int i_2 = executor.intStack[executor.intStackPtr];
		if (i_2 >= 2) {
			throw new RuntimeException();
		} else {
			client.anInt7277 = i_2;
			int i_3 = executor.intStack[executor.intStackPtr + 1];
			if (i_3 + 1 >= client.anIntArrayArrayArray7302[client.anInt7277].length >> 1) {
				throw new RuntimeException();
			} else {
				client.anInt7279 = i_3;
				client.anInt7256 = 0;
				client.anInt7327 = executor.intStack[executor.intStackPtr + 2];
				client.anInt7182 = executor.intStack[executor.intStackPtr + 3];
				int i_4 = executor.intStack[executor.intStackPtr + 4];
				if (i_4 >= 2) {
					throw new RuntimeException();
				} else {
					client.anInt7448 = i_4;
					int i_5 = executor.intStack[executor.intStackPtr + 5];
					if (i_5 + 1 >= client.anIntArrayArrayArray7302[client.anInt7448].length >> 1) {
						throw new RuntimeException();
					} else {
						client.anInt7280 = i_5;
						NativeLibraryLoader.anInt3240 = 3;
						Class86.anInt833 = -1;
						PingRequester.anInt5864 = -1;
					}
				}
			}
		}
	}

	static final void method1367(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 < 0) {
			i_2 = 0;
		}
		client.anInt7271 = i_2 + client.anInt7270;
	}

	static final void method1370(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloat7365 >> 3;
	}

	static final void method12572(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class125.method2173(1467773242);
		if (class282_sub50_sub6_3 != null) {
			boolean bool_4 = class282_sub50_sub6_3.method14775(i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Runner.anIntArray5900, -169630584);
			if (bool_4) {
				executor.intStack[++executor.intStackPtr - 1] = CS2Runner.anIntArray5900[1];
				executor.intStack[++executor.intStackPtr - 1] = CS2Runner.anIntArray5900[2];
			} else {
				executor.intStack[++executor.intStackPtr - 1] = -1;
				executor.intStack[++executor.intStackPtr - 1] = -1;
			}
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
			executor.intStack[++executor.intStackPtr - 1] = -1;
		}
	}

	static final void method12573(CS2Executor executor) {
		if (client.gameState == 0) {
			Class448.aBool5419 = executor.intStack[--executor.intStackPtr] == 1;
		}
	}

	static final void method8714(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method2960(icomponentdefinitions_3, interface_4, executor, 1306300088);
	}

	static final void method8715(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method3251(icomponentdefinitions_3, executor, 1146866687);
	}

	static final void method8716(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = client.GRAND_EXCHANGE_SLOTS[i_2].method5908(-12393301);
		executor.intStack[++executor.intStackPtr - 1] = i_3 == 2 ? 1 : 0;
	}

	static final void method8717(CS2Executor executor) {
		String string_2;
		if (VertexNormal.myPlayer != null && VertexNormal.myPlayer.username != null) {
			string_2 = VertexNormal.myPlayer.method16127(2008342545);
		} else {
			string_2 = "";
		}
		executor.stringStack[++executor.stringStackPtr - 1] = string_2;
	}

	static final void method8718(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.aClass191_7008 = new Class191(string_2);
	}

	static final void method8719(CS2Executor executor) {
		executor.intStackPtr -= 3;
		long long_2 = (long) executor.intStack[executor.intStackPtr];
		long long_4 = (long) executor.intStack[executor.intStackPtr + 1];
		long long_6 = (long) executor.intStack[executor.intStackPtr + 2];
		executor.intStack[++executor.intStackPtr - 1] = (int) (long_6 * long_2 / long_4);
	}

	static final void arrayLoad(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		if (i_3 >= 0 && i_3 < executor.globalArrayLengths[i_2]) {
			executor.intStack[++executor.intStackPtr - 1] = executor.globalArrays[i_2][i_3];
		} else {
			throw new RuntimeException();
		}
	}

	static final void method14679(CS2Executor executor) {
		method1573(executor);
	}

	static final void method3779(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = executor.currentClanSettings.bannedUserNames[i_2];
	}

	static final void method3780(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		QuickChatCategoryDefinitions class282_sub50_sub14_4 = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2);
		int i_5 = class282_sub50_sub14_4.subCategories[i_3];
		executor.intStack[++executor.intStackPtr - 1] = i_5;
	}

	static final void method3781(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub18_8214.method12774() ? 1 : 0;
	}

	static final void method3783(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		int i_4 = -1;
		if (chatline_3 != null) {
			i_4 = chatline_3.anInt1091;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static void method3553(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).aStringArray2971[executor.intStack[executor.intStackPtr - 1]];
		executor.intStackPtr -= 2;
	}

	static final void method3554(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method8754(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3555(CS2Executor executor) {
		Class42.method890(executor.intStack[--executor.intStackPtr], 255, 50, (byte) 39);
	}

	static final void method3556(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class125.method2173(1333145388);
		if (class282_sub50_sub6_3 != null) {
			boolean bool_4 = class282_sub50_sub6_3.method14778(i_2 >> 28 & 0x3, i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Runner.anIntArray5900, -1889413502);
			if (bool_4) {
				Class8_Sub2.method14263(CS2Runner.anIntArray5900[1], CS2Runner.anIntArray5900[2]);
			}
		}
	}

	static final void method3557(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (Class291_Sub1.aClass465_8025 != null) {
			Node node_3 = Class291_Sub1.aClass465_8025.get((long) i_2);
			executor.intStack[++executor.intStackPtr - 1] = node_3 != null ? 1 : 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static void method466(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).method4101(Class158_Sub1.PLAYER_VAR_PROVIDER) ? 1 : 0;
	}

	static final void longLessThan(CS2Executor executor) {
		executor.longStackPtr -= 2;
		if (executor.longStack[executor.longStackPtr] < executor.longStack[executor.longStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method468(CS2Executor executor) {
		BufferedConnectionContext class184_2 = Class468_Sub20.method12807(461566707);
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.PUBLIC_QUICKCHAT, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(2);
		tcpmessage_3.buffer.writeShort(executor.aClass346_7009.anInt4048);
		executor.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_3.buffer, executor.aClass346_7009.anIntArray4046, -463581846);
		tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, -76404824);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void method471(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = executor.aClass282_Sub4_7011.method12095()[executor.intStack[executor.intStackPtr - 1]];
	}

	static final void multiplyInt(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_3 * i_2;
	}

	static final void method15387(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(4, i_2 << 16 | i_3, i_4, "", (byte) 73);
	}

	static final void branchEq1(CS2Executor executor) {
		if (executor.intStack[--executor.intStackPtr] == 1) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}
	
	static final void branchEq0(CS2Executor executor) {
		if (executor.intStack[--executor.intStackPtr] == 0) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method1586(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 > 255 || i_2 < 0) {
			i_2 = 0;
		}
		if (i_2 != Class393.preferences.aClass468_Sub11_8217.method12699((byte) -18)) {
			Class393.preferences.setValue(Class393.preferences.aClass468_Sub11_8217, i_2, -1291296502);
			Class190.savePreferences((byte) 116);
			client.aBool7175 = false;
		}
	}

	static final void method1590(CS2Executor executor) {
		int i_2 = Class96_Sub14.method14641();
		executor.intStack[++executor.intStackPtr - 1] = ClanVarSettingsIndexLoader.anInt2880 = Class393.preferences.currentToolkit.getValue(1802099431);
		executor.intStack[++executor.intStackPtr - 1] = i_2;
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -112);
		Class190.savePreferences((byte) 117);
		client.aBool7175 = false;
	}

	static final void method3170(CS2Executor executor) {
		boolean bool_2 = false;
		if (client.aBool7310) {
			try {
				Object object_3 = Class361.aClass361_4178.method6254(new Object[] { Integer.valueOf(Class504.anInt5832), Boolean.valueOf(VertexNormal.myPlayer.male == 1), Integer.valueOf(executor.intStack[--executor.intStackPtr]) }, (byte) 69);
				if (object_3 != null) {
					bool_2 = ((Boolean) object_3).booleanValue();
				}
			} catch (Throwable throwable_4) {
				;
			}
		}
		executor.intStack[++executor.intStackPtr - 1] = bool_2 ? 1 : 0;
	}

	static final void method3171(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method3601(icomponentdefinitions_3, executor, -1995583516);
	}

	static final void method3172(CS2Executor executor) {
		Class282_Sub29.method12426();
	}

	static final void method6279(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub20_8207.method7785(i_2, -915062041);
	}

	static final void method6280(CS2Executor executor) {
		client.aBool7189 = true;
		Class188.method3142(69417195);
	}

	static final void method6281(CS2Executor executor) {
		Class163 class163_2 = executor.animable.method15811(767923452);
		if (class163_2 == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = class163_2.method2829();
		}
	}

	static final void method15616(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		MapAreaDefinitions worldmapareadefs_3 = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2, 461290146);
		if (worldmapareadefs_3.areaName == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = worldmapareadefs_3.areaName;
		}
	}

	static final void method6016(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14892(icomponentdefinitions_3, interface_4, executor, (byte) 79);
	}

	static final void method13412(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method14700(icomponentdefinitions_3, interface_4, executor, 1949391932);
	}

	static final void method8263(CS2Executor executor) {
		if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
			Class440.method7373(Class393.preferences.screenSize.method12687(577867050), -1, -1, false, (byte) 35);
		}
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		boolean bool_3 = executor.intStack[--executor.intStackPtr] == 1;
		String string_4 = MapAreaDefinitions.method3741() + string_2;
		Class282_Sub50_Sub6.method14788(string_4, bool_3, Class393.preferences.currentToolkit.getValue(-1739196165) == 5, client.aBool7158, client.aBool7159, (byte) -52);
	}

	static final void method16100(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
		if (attributedefault_4.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(i_2).getCS2Param(i_3, attributedefault_4.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(i_2).method6876(i_3, attributedefault_4.defaultInt, 1365877231);
		}
	}

	static final void method6437(CS2Executor executor) {
		executor.intStackPtr -= 2;
		long long_2 = (long) executor.intStack[executor.intStackPtr];
		long long_4 = (long) executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = (int) (long_2 + long_2 * long_4 / 100L);
	}

	static final void method3892(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method3078(icomponentdefinitions_3, interface_4, executor, 64340405);
	}

	static final void method3893(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub1_8197.method12615(-1794676778);
	}

	static final void method3894(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = InputSubscriberType.anInt2762;
	}

	static final void method15696(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = VertexNormal.myPlayer.playerAppearance != null && VertexNormal.myPlayer.playerAppearance.aBool2929 ? 1 : 0;
	}

	static final void method4881(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub13_8225.method12714();
	}

	static final void method4882(CS2Executor executor) {
		Class492.method8265(0, 0, client.aClass118_7183.anInt1301, client.aClass118_7183.anInt1429, false, (byte) -37);
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7188;
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7440;
	}

	static final void storeVarc(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		Class320.VARC_INT[i_2] = executor.intStack[--executor.intStackPtr];
		Class282_Sub20_Sub11.method15264(i_2);
		client.aBool7400 |= Class282_Sub17_Sub2.VARC_BOOL[i_2];
	}

	static final void method5099(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method4159(icomponentdefinitions_3, interface_4, executor, -1802550840);
	}

	static final void method5100(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class41_Sub1_Sub1.method15524();
	}

	static final void method13408(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method1642(icomponentdefinitions_3, interface_4, executor, -441010369);
	}

	static final void method12859(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class468_Sub28.anInt7961;
	}

	static final void method2978(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub4_8187.method12641(-255008598);
	}

	static final void method1853(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		if (i_3 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_5 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_3);
			if (i_2 != enumdefinitions_5.aChar5140) {
				throw new RuntimeException();
			} else {
				int[] ints_6 = enumdefinitions_5.method7251(Integer.valueOf(i_4), 2106886320);
				int i_7 = 0;
				if (ints_6 != null) {
					i_7 = ints_6.length;
				}
				executor.intStack[++executor.intStackPtr - 1] = i_7;
			}
		}
	}

	static final void method1854(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		FontMetrics fontmetrics_4 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, i_3, 1361822536);
		executor.intStack[++executor.intStackPtr - 1] = fontmetrics_4.getWidth(string_2, Class182.aClass160Array2261);
	}

	static final void method1855(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class440.anInt5357;
	}

	static final void stringLength(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (string_2 != null) {
			executor.intStack[++executor.intStackPtr - 1] = string_2.length();
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method1857(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.customCursors, executor.intStack[--executor.intStackPtr] != 0 ? 1 : 0, -123995659);
		Class190.savePreferences((byte) 35);
	}

	static final void method7643(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		int i_4 = -1;
		int i_5 = -1;
		Class119 class119_6 = icomponentdefinitions_3.method2046(Renderers.SOFTWARE_RENDERER, 1740359651);
		if (class119_6 != null) {
			i_4 = class119_6.anInt1458;
			i_5 = class119_6.anInt1454;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
		executor.intStack[++executor.intStackPtr - 1] = i_5;
	}

	static final void method6290(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (i_2 != -1) {
			if (i_3 > 255) {
				i_3 = 255;
			} else if (i_3 < 0) {
				i_3 = 0;
			}
			Class93.method1575(i_2, i_3, false);
		}
	}

	static final void method6291(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method2732(icomponentdefinitions_3, interface_4, executor, -1950907302);
	}

	static final void method13494(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (RegionMap.aString3643 != null && RegionMap.aString3643.equalsIgnoreCase(string_2)) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method14857(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub28_8212, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0, 1214573976);
		Class190.savePreferences((byte) 106);
		client.aBool7175 = false;
	}

	static final void method5828(CS2Executor executor) {
		--executor.stringStackPtr;
		executor.intStackPtr -= 3;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		boolean bool_3 = executor.intStack[executor.intStackPtr] == 1;
		boolean bool_4 = executor.intStack[executor.intStackPtr + 1] == 1;
		boolean bool_5 = executor.intStack[executor.intStackPtr + 2] == 1;
		TCPPacket tcpmessage_6 = Class271.createPacket(OutgoingPacket.aClass379_4619, client.connectionContext.isaac);
		tcpmessage_6.buffer.writeShort(ChatLine.getLength(string_2) + 1);
		tcpmessage_6.buffer.writeString(string_2);
		int i_7 = 0;
		if (bool_3) {
			i_7 |= 0x1;
		}
		if (bool_4) {
			i_7 |= 0x2;
		}
		if (bool_5) {
			i_7 |= 0x4;
		}
		tcpmessage_6.buffer.writeByte(i_7);
		client.connectionContext.queuePacket(tcpmessage_6);
	}

	static final void method5829(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		SharedConfigsType.method2094(i_2);
	}

	static final void method5831(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = (int) (Math.random() * (double) (i_2 + 1));
	}

	static final void method5832(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7224 && !client.aBool7244 ? 1 : 0;
	}

	static final void method5833(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method13468(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method12659(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method7142(icomponentdefinitions_4, interface_5, executor, -1755364676);
	}

	static final void method12660(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = i_3 >> 14 & 0x3fff;
		int i_5 = i_3 & 0x3fff;
		int i_6 = Class468_Sub11.method12702(i_2, i_4, i_5);
		if (i_6 < 0) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = i_6;
		}
	}

	static final void method13410(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.aClass282_Sub4_7011.numPlayers;
	}

	static final void method12925(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spritePitch;
	}

	static final void method1864(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		if (icomponentdefinitions_3.aString1369 == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.aString1369;
		}
	}

	static final void method7928(CS2Executor executor) {
		Class371.method6353();
	}

	static final void method741(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method5455(icomponentdefinitions_3, interface_4, executor, -869216999);
	}

	static final void method742(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		QuickChatCategoryDefinitions class282_sub50_sub14_3 = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2);
		if (class282_sub50_sub14_3.subCategories == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub14_3.subCategories.length;
		}
	}

	static final void method743(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.textures.method12872() ? 1 : 0;
	}

	static final void method745(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7155 ? 1 : 0;
	}

	static final void method8839(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.intStackPtr -= 2;
		int i_3 = executor.intStack[executor.intStackPtr];
		int i_4 = executor.intStack[executor.intStackPtr + 1];
		executor.stringStack[++executor.stringStackPtr - 1] = string_2.substring(i_3, i_4);
	}

	static final void method8843(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6288(icomponentdefinitions_3, interface_4, executor, (short) 25412);
	}

	static final void method8844(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub17_8200.method12761() ? 1 : 0;
	}

	static final void method3674(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
		if (attributedefault_4.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.ANIMATION_LOADER.getAnimDefs(i_2, (byte) -22).method11129(i_3, attributedefault_4.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ANIMATION_LOADER.getAnimDefs(i_2, (byte) -46).method11133(i_3, attributedefault_4.defaultInt);
		}
	}

	static final void method3676(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method7889(icomponentdefinitions_3, interface_4, executor);
	}

	static final void longGreaterThan(CS2Executor executor) {
		executor.longStackPtr -= 2;
		if (executor.longStack[executor.longStackPtr] > executor.longStack[executor.longStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method6350(CS2Executor executor) {
		boolean bool_2 = false;
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		if (client.aBool7310) {
			try {
				Object object_4 = Class361.aClass361_4172.method6254(new Object[] { string_3 }, (byte) -29);
				if (object_4 != null) {
					bool_2 = ((Boolean) object_4).booleanValue();
				}
			} catch (Throwable throwable_5) {
				;
			}
		}
		executor.intStack[++executor.intStackPtr - 1] = bool_2 ? 1 : 0;
	}

	static final void method6799(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7149;
	}

	static final void method6800(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method12630(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method15475(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method5291(icomponentdefinitions_3, interface_4, executor, 464841858);
	}

	static final void method3079(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.textures, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0, -1510347468);
		Class190.savePreferences((byte) 119);
		Class94.method1589();
		client.aBool7175 = false;
	}

	static final void method3080(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method14664(icomponentdefinitions_3, interface_4, false, 2, executor, (byte) -57);
	}

	static final void method15399(CS2Executor executor) {
		QuestIndexLoader.method4167((String) executor.stringStack[--executor.stringStackPtr]);
	}

	static final void method6796(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1428;
	}

	static final void method6797(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = client.GRAND_EXCHANGE_SLOTS[i_2].method5908(-1939537694);
		executor.intStack[++executor.intStackPtr - 1] = i_3 == 0 ? 1 : 0;
	}

	static final void method8199(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class158.windowedMode();
	}

	static final void method7006(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (Class468_Sub8.INTERFACES[i_2] == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			String string_3 = Class468_Sub8.INTERFACES[i_2].components[0].aString1285;
			if (string_3 == null) {
				executor.stringStack[++executor.stringStackPtr - 1] = "";
			} else {
				executor.stringStack[++executor.stringStackPtr - 1] = string_3.substring(0, string_3.indexOf(58));
			}
		}
	}

	static final void storeString(CS2Executor executor) {
		executor.objectLocals[executor.intOpValues[executor.instrPtr]] = executor.stringStack[--executor.stringStackPtr];
	}

	static final void method4863(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method5763(icomponentdefinitions_3, interface_4, executor, 258036500);
	}

	static final void method4864(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method15474(icomponentdefinitions_3, interface_4, executor, (byte) 126);
	}

	static final void method4865(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		method1494(icomponentdefinitions_3, executor, (byte) -2);
	}

	static final void method4867(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub14_8211.method7785(i_2, -1905006369);
	}

	static final void storeVarcString(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		Class462.VARC_STRING[i_2] = (String) executor.stringStack[--executor.stringStackPtr];
		Class282_Sub20_Sub10.method15263(i_2);
	}

	static final void hideComp(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method786(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method5302(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method1852(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method11125(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1311;
	}

	static final void method11126(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method1455(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method11128(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(2, i_2 << 16 | i_3, i_4, "", (byte) 10);
	}

	static final void method5901(CS2Executor executor) {
		executor.intStackPtr -= 4;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		EnumDefinitions enumDefinitions = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_4);
		if (i_2 == enumDefinitions.aChar5146 && i_3 == enumDefinitions.aChar5140) {
			if (i_3 == 115) {
				executor.stringStack[++executor.stringStackPtr - 1] = enumDefinitions.getStringValue(i_5);
			} else {
				executor.intStack[++executor.intStackPtr - 1] = enumDefinitions.getIntValue(i_5);
			}
		} else {
			throw new RuntimeException(i_4 + " " + i_5);
		}
	}

	static final void method5902(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.talkRank;
	}

	static final void method5904(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (Class468_Sub8.INTERFACES[i_2] == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = Class468_Sub8.INTERFACES[i_2].components.length;
		}
	}

	static final void method6668(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		InterfaceWithDefs underlaydefinition_4;
		if (executor.aBool7022) {
			underlaydefinition_4 = executor.aClass513_6994;
		} else {
			underlaydefinition_4 = executor.aClass513_7007;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_3 != -1 && underlaydefinition_4.method8764(i_2, i_3) ? 1 : 0;
	}

	static final void method6669(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method4280(icomponentdefinitions_3, interface_4, executor, (byte) 114);
	}

	static final void method6670(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method14680(icomponentdefinitions_3, executor, 434841982);
	}

	static final void method6674(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		Class2.method257(string_2, string_3);
	}

	static final void method6675(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub2_8205.method12624((byte) -45);
	}

	static final void method6449(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1329 == 1 ? icomponentdefinitions_3.anInt1330 : -1;
	}

	static final void method6452(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method5291(icomponentdefinitions_3, interface_4, executor, 989451427);
	}

	static final void method4030(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method3365(icomponentdefinitions_3, interface_4, executor, -296742554);
	}

	static final void method4031(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.method3565((byte) -75) ? 1 : 0;
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.method3566() ? 1 : 0;
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.method3567((byte) -59) ? 1 : 0;
	}

	static final void method4033(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14653(icomponentdefinitions_3, interface_4, executor, -1617819065);
	}

	static final void method4035(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub7_8210, executor.intStack[--executor.intStackPtr], 1004111582);
		Class190.savePreferences((byte) 112);
		client.aBool7185 = true;
	}

	static final void minInt(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 < i_3 ? i_2 : i_3;
	}

	static final void longGreaterOrEqual(CS2Executor executor) {
		executor.longStackPtr -= 2;
		if (executor.longStack[executor.longStackPtr] >= executor.longStack[executor.longStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method7021(CS2Executor executor) {
		boolean bool_2 = false;
		String str_3 = "";
		if (executor.aClass191_7008 != null && executor.aClass191_7008.method3154()) {
			File file_4 = executor.aClass191_7008.method3161();
			if (file_4 != null) {
				str_3 = file_4.getPath();
				if (str_3 == null) {
					str_3 = "";
				}
			}
			bool_2 = true;
			executor.aClass191_7008 = null;
		}
		executor.intStack[++executor.intStackPtr - 1] = bool_2 ? 1 : 0;
		executor.stringStack[++executor.stringStackPtr - 1] = str_3;
	}

	static final void method13301(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.idleAnimations.getValue();
	}

	static final void method6773(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.idleAnimations.getValue();
	}

	static final void method15551(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub28_8212.method7785(i_2, -1918950659);
	}

	static final void method4277(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1426;
	}

	static final void method4278(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class402.method6798(string_2);
	}

	static final void method4279(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class293.method5206();
	}

	static final void method4283(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method11221(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method773(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (VertexNormal.myPlayer.playerAppearance != null) {
			VertexNormal.myPlayer.playerAppearance.method3995(i_2, i_3, IndexLoaders.ITEM_LOADER);
		}
	}

	static final void method775(CS2Executor executor) {
		CursorIndexLoader.method7333(false, 2001834911);
	}

	static void method777(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).anIntArray2968[executor.intStack[executor.intStackPtr - 1]];
		--executor.intStackPtr;
	}

	static final void method779(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		int i_4 = executor.intStack[--executor.intStackPtr];
		--i_4;
		if (icomponentdefinitions_3.aStringArray1352 != null && i_4 < icomponentdefinitions_3.aStringArray1352.length && icomponentdefinitions_3.aStringArray1352[i_4] != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.aStringArray1352[i_4];
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method4295(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.replacementOwner;
	}

	static final void intEqual(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr + 1] == executor.intStack[executor.intStackPtr]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method3064(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method2960(icomponentdefinitions_3, interface_4, executor, 1289929299);
	}

	static final void method3065(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1423;
	}

	static final void method3066(CS2Executor executor) {
		if (Class475.supportsFullScreen) {
			Class467[] arr_2 = ClanVarDefinitions.method6825((byte) -71);
			executor.intStack[++executor.intStackPtr - 1] = arr_2.length;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method3067(CS2Executor executor) {
		method6018(executor.animable, executor, 1557948152);
	}

	static final void method3068(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class60.method1169((char) i_2) ? 1 : 0;
	}

	static final void method5008(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method11223(icomponentdefinitions_3, interface_4, executor, 4317906);
	}

	static final void method5010(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		if (client.gameState == 0 && !JS5CacheFile.method3360((byte) 17)) {
			executor.intStack[++executor.intStackPtr - 1] = Class62.setGameHost(i_2, string_3) ? 1 : 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method12215(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		if (itemdefinitions_3.certTemplateId == -1 && itemdefinitions_3.certId >= 0) {
			executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_3.certId;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = i_2;
		}
	}

	static final void method7143(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub13_8229.method12714();
	}

	static final void method6282(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6244(icomponentdefinitions_3, interface_4, executor, -1411462408);
	}

	static final void method6283(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method5066(icomponentdefinitions_3, interface_4, executor, 2045260236);
	}

	static final void method6284(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).value;
	}

	static final void method6285(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt72;
	}

	static final void method1775(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (string_2.startsWith(Class76.getCrown(0)) || string_2.startsWith(Class76.getCrown(1))) {
			string_2 = string_2.substring(7);
		}
		executor.intStack[++executor.intStackPtr - 1] = VarBitIndexLoader.method3910(string_2);
	}

	static final void hookMousePress(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method15409(icomponentdefinitions_3, interface_4, executor, -1219012115);
	}

	static final void loadClanVarString(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		String string_3 = (String) Class46.CLAN_VARS[i_2];
		if (string_3 == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = string_3;
		}
	}

	static final void method3356(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method5763(icomponentdefinitions_3, interface_4, executor, 2042314343);
	}

	static final void method3357(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14586(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3358(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.screenSize.method12687(-317680305);
	}

	static final void method3361(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.method1197((String) executor.stringStack[--executor.stringStackPtr]);
	}

	static final void method1385(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method4149(icomponentdefinitions_3, interface_4, executor, -1861412275);
	}

	static final void method1387(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		WorldDescriptor class217_sub1_3 = ObjectIndexLoader.getWorld(i_2);
		if (class217_sub1_3 != null) {
			executor.intStack[++executor.intStackPtr - 1] = class217_sub1_3.flags;
			executor.stringStack[++executor.stringStackPtr - 1] = class217_sub1_3.unknown;
			World class213_4 = class217_sub1_3.getWorld();
			executor.intStack[++executor.intStackPtr - 1] = class213_4.countryId;
			executor.stringStack[++executor.stringStackPtr - 1] = class213_4.activity;
			executor.intStack[++executor.intStackPtr - 1] = class217_sub1_3.playerCount;
			executor.intStack[++executor.intStackPtr - 1] = class217_sub1_3.ping;
			executor.stringStack[++executor.stringStackPtr - 1] = class217_sub1_3.ipAddress;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
			executor.stringStack[++executor.stringStackPtr - 1] = "";
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.stringStack[++executor.stringStackPtr - 1] = "";
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method11147(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub1_8197.method12609() ? 1 : 0;
	}

	static final void method6205(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = executor.currentClanSettings.method1215()[executor.intStack[executor.intStackPtr - 1]];
	}

	static final void method6206(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].totalPrice;
	}

	static final void method6207(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = (int) (Math.random() * (double) i_2);
	}

	static final void method6210(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method789(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6211(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		executor.stringStack[++executor.stringStackPtr - 1] = string_2 + string_3;
	}

	static final void method7929(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method506(icomponentdefinitions_3, interface_4, executor, -1252434200);
	}

	static final void getCompWidth(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1301;
	}

	static final void method7932(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (string_2.startsWith(Class76.getCrown(0)) || string_2.startsWith(Class76.getCrown(1))) {
			string_2 = string_2.substring(7);
		}
		executor.intStack[++executor.intStackPtr - 1] = MovementType.method4282(string_2) ? 1 : 0;
	}

	static final void method7933(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method2741(icomponentdefinitions_3, interface_4, executor, (byte) 5);
	}

	static final void method893(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method13292(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method894(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		int i_4 = -1;
		if (chatline_3 != null) {
			i_4 = chatline_3.anInt1084;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static final void loadInt(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.intLocals[executor.intOpValues[executor.instrPtr]];
	}

	static final void method12506(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		boolean bool_3 = executor.intStack[executor.intStackPtr + 1] == 1;
		if (Class291_Sub1.aClass465_8029 != null) {
			Node node_4 = Class291_Sub1.aClass465_8029.get((long) i_2);
			if (node_4 != null && !bool_3) {
				node_4.remove();
			} else if (node_4 == null && bool_3) {
				node_4 = new Node();
				Class291_Sub1.aClass465_8029.put(node_4, (long) i_2);
			}
		}
	}

	static final void method12560(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub26_8224.method12943(1554846172) == 1 ? 1 : 0;
	}

	static final void method12561(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 != -1) {
			Class92.method1563(i_2);
		}
	}

	static final void method4089(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.intStackPtr -= 3;
		int i_3 = executor.intStack[executor.intStackPtr];
		int i_4 = executor.intStack[executor.intStackPtr + 1];
		int i_5 = executor.intStack[executor.intStackPtr + 2];
		Class282_Sub20_Sub8.method15242(string_2, i_3 == 1, i_4, i_5, 1920082068);
		executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.anInt4985;
	}

	static final void method4091(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class291.aClass282_Sub50_Sub6_3491 != null ? Class291.aClass282_Sub50_Sub6_3491.anInt9536 : -1;
	}

	static final void method15306(CS2Executor executor) {
		Class119.method2077(2005204447);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -23);
		Class190.savePreferences((byte) 113);
		client.aBool7175 = false;
	}

	static final void method3667(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.currentToolkit.getValue(-105598031);
	}

	static final void method14340(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method14653(icomponentdefinitions_4, interface_5, executor, -1985356850);
	}

	static final void method14342(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method789(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method12933(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 >= 1 && i_2 <= 2) {
			Class440.method7373(i_2, -1, -1, false, (byte) 57);
		}
	}

	static final void intLessThan(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr] < executor.intStack[executor.intStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method8750(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6313(icomponentdefinitions_3, interface_4, executor, 435475117);
	}

	static final void method8753(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStackPtr -= 2;
		int i_4 = executor.intStack[executor.intStackPtr];
		int i_5 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_6 = IndexLoaders.PARAM_LOADER.getParam(i_4);
		if (i_5 != attributedefault_6.defaultInt) {
			icomponentdefinitions_3.method1999(i_4, i_5, -76076232);
		} else {
			icomponentdefinitions_3.method1995(i_4);
		}
	}

	static final void method8756(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.aString7426 != null && i_2 < Class459.anInt5534) {
			executor.intStack[++executor.intStackPtr - 1] = Class467.aClass173Array5575[i_2].aByte2126;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method8757(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		if (i_2 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_4 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2);
			if (enumdefinitions_4.aChar5140 != 115) {
				throw new RuntimeException();
			} else {
				int[] ints_5 = enumdefinitions_4.method7251(string_3, 1883860951);
				int i_6 = 0;
				if (ints_5 != null) {
					i_6 = ints_5.length;
				}
				executor.intStack[++executor.intStackPtr - 1] = i_6;
			}
		}
	}

	static final void method8758(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
		if (attributedefault_4.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2, 882562729).method3722(i_3, attributedefault_4.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2, 884887679).method3723(i_3, attributedefault_4.defaultInt);
		}
	}

	static final void method5119(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class96_Sub20.method14668().getValue();
	}

	static final void method5122(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.fog.method13417(-1771623069) == 1 ? 1 : 0;
	}

	static final void method5123(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_4.anInt1312;
	}

	static final void method14578(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1314;
	}

	static final void setCompPosition(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method3983(icomponentdefinitions_3, interface_4, executor, -1297016434);
	}

	static final void method6687(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method14892(icomponentdefinitions_3, interface_4, executor, (byte) 121);
	}

	static final void method6688(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method6010(icomponentdefinitions_4, interface_5, executor, -1956215078);
	}

	static final void method6691(CS2Executor executor) {
		boolean bool_2 = executor.intStack[--executor.intStackPtr] != 0;
		int i_3 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = Connection.method3342((long) i_3, 0, bool_2, Class223.CURRENT_LANGUAGE, (byte) -28);
	}

	static final void method6695(CS2Executor executor) {
		Class101.method1774();
	}

	static final void method5691(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		Class282_Sub20_Sub36.method15419(string_2, i_3 == 1);
		executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.anInt4985;
	}

	static final void method5692(CS2Executor executor) {
		AnimationDefinitions.method11148((Class521_Sub1) executor.anInterface12_7013, executor.intStack[--executor.intStackPtr], -253954252);
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[0];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[1];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method5695(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.anInt7449) {
			executor.intStack[++executor.intStackPtr - 1] = client.aClass6Array7452[i_2].anInt39;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void playSoundEffect(CS2Executor executor) {
		executor.intStackPtr -= 3;
		Class153.method2618(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], 255, 256, 1363502239);
	}

	static final void method3169(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = executor.aClass282_Sub4_7011.players[i_2].world;
	}

	static final void method4161(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class152.method2598().getValue();
	}

	static final void method4168(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8187, executor.intStack[--executor.intStackPtr], -1129391338);
		Class190.savePreferences((byte) 102);
	}

	static final void method14644(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.aClass282_Sub4_7011.minRankToKick;
	}

	static final void method12586(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		method2738(executor.animable.inter, i_2 & 0xffff, i_3, i_4, executor.aBool7022, executor);
	}

	static void method12587(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).method4105(Class158_Sub1.PLAYER_VAR_PROVIDER, executor.intStack[executor.intStackPtr - 1]) ? 1 : 0;
		--executor.intStackPtr;
	}

	static final void method572(CS2Executor executor) {
		boolean bool_2 = true;
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		if (client.aBool7310) {
			try {
				Object object_4 = Class361.aClass361_4181.method6254(new Object[] { string_3 }, (byte) -31);
				if (object_4 != null) {
					bool_2 = ((Boolean) object_4).booleanValue();
				}
			} catch (Throwable throwable_5) {
				;
			}
		}
		executor.intStack[++executor.intStackPtr - 1] = bool_2 ? 1 : 0;
	}

	static final void method7704(CS2Executor executor) {
		WallDecoration.method16088(executor.intStack[--executor.intStackPtr]);
	}

	static final void method14503(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		if (i_3 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_5 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_3);
			if (i_2 != enumdefinitions_5.aChar5140) {
				throw new RuntimeException();
			} else {
				executor.intStack[++executor.intStackPtr - 1] = enumdefinitions_5.method7228(Integer.valueOf(i_4), (byte) -68) ? 1 : 0;
			}
		}
	}

	static final void method4889(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = 0;
		if (Class115.method1950(string_2, -1586612370)) {
			i_3 = Class328.parseInt(string_2, 1827486792);
		}
		TCPPacket tcpmessage_4 = Class271.createPacket(OutgoingPacket.INPUT_INTEGER, client.outputContext.isaac);
		tcpmessage_4.buffer.writeInt(i_3);
		client.outputContext.queuePacket(tcpmessage_4);
	}

	static final void pushLong(CS2Executor executor) {
		executor.longStack[++executor.longStackPtr - 1] = executor.current.longOpValues[executor.instrPtr];
	}

	static final void method5915(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.intStackPtr -= 2;
		int i_3 = executor.intStack[executor.intStackPtr];
		int i_4 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = string_2.indexOf(i_3, i_4);
	}

	static final void method11222(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
		if (attributedefault_4.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.MAP_REGION_DECODER.method4436(-2071995524).getObjectDefinitions(i_2).method7973(i_3, attributedefault_4.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.MAP_REGION_DECODER.method4436(-1502045991).getObjectDefinitions(i_2).method7963(i_3, attributedefault_4.defaultInt, 1059658238);
		}
	}

	static final void method11224(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (VertexNormal.myPlayer.playerAppearance != null) {
			int i_4;
			for (i_4 = 0; i_4 < IdentikitDefinition.anIntArray428.length; i_4++) {
				if (IdentikitDefinition.anIntArray428[i_4] == i_2) {
					VertexNormal.myPlayer.playerAppearance.method3993(i_4, i_3, IndexLoaders.IDENTITI_KIT_LOADER, -1891661545);
					return;
				}
			}
			for (i_4 = 0; i_4 < IdentikitDefinition.anIntArray422.length; i_4++) {
				if (IdentikitDefinition.anIntArray422[i_4] == i_2) {
					VertexNormal.myPlayer.playerAppearance.method3993(i_4, i_3, IndexLoaders.IDENTITI_KIT_LOADER, 938562628);
					break;
				}
			}
		}
	}

	static final void method2870(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.aClass379_4596, client.outputContext.isaac);
		tcpmessage_3.buffer.writeByte(string_2.length() + 1);
		tcpmessage_3.buffer.writeString(string_2);
		client.outputContext.queuePacket(tcpmessage_3);
	}

	static final void method2871(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.anInt7449) {
			executor.stringStack[++executor.stringStackPtr - 1] = client.aClass6Array7452[i_2].aString40;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method2872(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7416;
	}

	static final void method2873(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub14_8211.method12728();
	}

	static final void method4247(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).name;
	}

	static void method4249(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
		if (attributedefault_4.isString()) {
			String string_5 = attributedefault_4.typeName;
			if (i_2 == -1) {
				executor.stringStack[++executor.stringStackPtr - 1] = string_5;
			} else {
				executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(i_2).method4110(i_3, string_5);
			}
		} else {
			int i_6 = attributedefault_4.defaultInt;
			if (i_2 == -1) {
				executor.intStack[++executor.intStackPtr - 1] = i_6;
			} else {
				executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(i_2).method4135(i_3, i_6);
			}
		}
	}

	static final void method4252(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class282_Sub25.method12402((char) i_2) ? 1 : 0;
	}

	static final void method1479(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		boolean bool_3 = true;
		if (i_2 < 0) {
			bool_3 = (i_2 + 1) % 4 == 0;
		} else if (i_2 < 1582) {
			bool_3 = i_2 % 4 == 0;
		} else if (i_2 % 4 != 0) {
			bool_3 = false;
		} else if (i_2 % 100 != 0) {
			bool_3 = true;
		} else if (i_2 % 400 != 0) {
			bool_3 = false;
		}
		executor.intStack[++executor.intStackPtr - 1] = bool_3 ? 1 : 0;
	}

	static final void method3918(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method8754(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3919(CS2Executor executor) {
		Class291_Sub1.aBool8027 = executor.intStack[--executor.intStackPtr] == 1;
	}

	static final void method3921(CS2Executor executor) {
		BufferedConnectionContext class184_2 = Class468_Sub20.method12807(-1070075874);
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.PUBLIC_QUICKCHAT, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(1);
		tcpmessage_3.buffer.writeShort(executor.aClass346_7009.anInt4048);
		executor.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_3.buffer, executor.aClass346_7009.anIntArray4046, -245952501);
		tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, 1096626300);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void method6138(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		method5001(icomponentdefinitions_3, executor, -1847769999);
	}

	static final void method6139(CS2Executor executor) {
		long long_2 = executor.longStack[--executor.longStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = long_2 == -1L ? "" : Long.toString(long_2, 36).toUpperCase();
	}

	static final void method6141(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method7547(icomponentdefinitions_3, interface_4, executor, 1462639259);
	}

	static final void method6142(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1277;
	}

	static final void method289(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteScale;
	}

	static final void method290(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		MapAreaDefinitions worldmapareadefs_3 = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2, 174714290);
		executor.intStack[++executor.intStackPtr - 1] = worldmapareadefs_3.anInt2718;
	}

	static final void method291(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).subCategoryHotkeys[i_3];
	}

	static final void method292(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub27_8208.method12952((byte) 83) == 2 ? 1 : 0;
	}

	static final void method5733(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.membersWorld ? 1 : 0;
	}

	static final void method5734(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub13_8227.method12714();
	}

	static final void method5735(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.intStackPtr -= 2;
		int i_3 = executor.intStack[executor.intStackPtr];
		int i_4 = executor.intStack[executor.intStackPtr + 1];
		FontMetrics fontmetrics_5 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, i_4, 1444002710);
		executor.intStack[++executor.intStackPtr - 1] = fontmetrics_5.method6951(string_2, i_3, Class182.aClass160Array2261, (byte) 76);
	}

	static void method5736(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]).altName;
	}

	static final void method504(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = CS2Runner.anInt5904;
	}

	static void method1067(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).method4104(Class158_Sub1.PLAYER_VAR_PROVIDER, executor.intStack[executor.intStackPtr - 1]) ? 1 : 0;
		--executor.intStackPtr;
	}

	static final void method1069(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method13468(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1070(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		boolean bool_3 = executor.intStack[--executor.intStackPtr] == 1;
		Class76.method1360(string_2, bool_3);
		executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.anInt4985;
	}

	static final void method1071(CS2Executor executor) {
		Class244.method4195();
	}

	static final void storeVarp(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		Class158_Sub1.PLAYER_VAR_PROVIDER.method266(i_2, executor.intStack[--executor.intStackPtr], -1744724277);
	}

	static final void method2737(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class291_Sub1.anInt8015 == 100 ? 1 : 0;
	}

	static final void method1357(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class96_Sub1.anInt8307;
	}

	static final void method1362(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2).responses[i_3];
	}

	static final void method11252(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method2741(icomponentdefinitions_3, interface_4, executor, (byte) 59);
	}

	static void method3753(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).anInt2973;
	}

	static final void method3755(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		MapAreaDefinitions worldmapareadefs_3 = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2, 262031096);
		executor.intStack[++executor.intStackPtr - 1] = worldmapareadefs_3.anInt2722;
	}

	static final void method15389(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = Huffman.method1980(i_2, i_3, false, 1448220048);
	}

	static final void method1562(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = client.method11633(icomponentdefinitions_3).getUseOptionFlags();
	}

	static void method2101(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]).name;
	}

	static final void method2102(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.memberRanks[i_2];
	}

	static final void method2103(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = ((NPC) executor.animable).definitions.anInt4856;
	}

	static final void loadVarc(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class320.VARC_INT[executor.intOpValues[executor.instrPtr]];
	}

	static final void method6776(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method2955(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method5697(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2).method14898(1863942043);
	}

	static final void method4652(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (i_2 == 0) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = (int) Math.pow((double) i_2, (double) i_3);
		}
	}

	static final void method2563(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method14664(icomponentdefinitions_3, interface_4, true, 0, executor, (byte) -16);
	}

	static final void method2564(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method910(icomponentdefinitions_3, interface_4, executor, 1996171820);
	}

	static final void method2566(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (client.gameState == 0 && !JS5CacheFile.method3360((byte) 72)) {
			if (string_2.length() > 20) {
				client.aByte7458 = -4;
			} else {
				client.aByte7458 = -1;
				TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.aClass379_4624, client.connectionContext.isaac);
				tcpmessage_3.buffer.writeByte(0);
				int i_4 = tcpmessage_3.buffer.index;
				tcpmessage_3.buffer.writeString(string_2);
				tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, -1911140874);
				client.connectionContext.queuePacket(tcpmessage_3);
			}
		} else {
			client.aByte7458 = -5;
		}
	}

	static final void method2567(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method7729(icomponentdefinitions_3, interface_4, executor, 1735506761);
	}

	static final void method2568(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub26_8224, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0, -2145743553);
		Class190.savePreferences((byte) 49);
		client.aBool7175 = false;
	}

	static final void method1349(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method2955(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1350(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub28_8212.method12966((byte) -16) == 1 ? 1 : 0;
	}

	static final void method1351(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class469.aBool5585 ? 1 : 0;
	}

	static final void method1352(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub17_8200.method7785(i_2, -332063758);
	}

	static final void method1355(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		IdentitiKitIndexLoader.method812(i_2, new Class282_Sub44(i_3, 3), (int[]) null, true, (byte) 92);
	}

	static final void method5962(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		IComponentDefinitions.getDefs(i_2);
		method2738(Class468_Sub8.INTERFACES[i_2 >>> 16], i_2 & 0xffff, i_3, i_4, executor.aBool7022, executor);
	}

	static final void method5296(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method3366(icomponentdefinitions_4, interface_5, executor, (byte) -128);
	}

	static final void method5297(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = client.GRAND_EXCHANGE_SLOTS[i_2].method5908(-1252250172);
		int[] ints_4 = executor.intStack;
		int i_5 = ++executor.intStackPtr - 1;
		byte b_6;
		if (i_3 == 1) {
			b_6 = 1;
		} else {
			b_6 = 0;
		}
		ints_4[i_5] = b_6;
	}

	static final void method5298(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStackPtr -= 2;
		String string_3 = (String) executor.stringStack[executor.stringStackPtr];
		String string_4 = (String) executor.stringStack[executor.stringStackPtr + 1];
		if (string_3.length() <= 500 && string_4.length() <= 500) {
			Class105.method1804(i_2, string_3, string_4);
		}
	}

	static final void method5299(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = LongNode.method13405(TextureDetails.time());
	}

	static final void method13040(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].price;
	}

	static final void getCompText(CS2Executor executor) {
		int component = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(component);
		executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.text;
	}

	static final void method5487(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method5453(icomponentdefinitions_3, interface_4, executor, -218121128);
	}

	static final void method5488(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method15256(icomponentdefinitions_3, interface_4, executor, -1115547958);
	}

	static final void method5489(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 != 0 && i_2 < client.anInt7373) {
			Class10 class10_3 = client.aClass10Array7456[i_2];
			executor.stringStack[++executor.stringStackPtr - 1] = class10_3.aString115;
			if (class10_3.aString116 != null) {
				executor.stringStack[++executor.stringStackPtr - 1] = class10_3.aString116;
			} else {
				executor.stringStack[++executor.stringStackPtr - 1] = "";
			}
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method5490(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = Huffman.method1980(i_2, i_3, true, 1580023895);
	}

	static final void method6314(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1320;
	}

	static final void method6315(CS2Executor executor) {
		BufferedConnectionContext class184_2 = Class468_Sub20.method12807(-1148731547);
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.PUBLIC_QUICKCHAT, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(0);
		tcpmessage_3.buffer.writeShort(executor.aClass346_7009.anInt4048);
		executor.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_3.buffer, executor.aClass346_7009.anIntArray4046, -1259900340);
		tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, 1119414501);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void method6316(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].itemId;
	}

	static final void method6317(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = TextureDetails.method2875(client.gameState, -2059083211) ? 1 : 0;
	}

	static final void method6318(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method14664(icomponentdefinitions_3, interface_4, true, 2, executor, (byte) -20);
	}

	static final void setCompSprite(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method8390(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1137(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7316 ? 1 : 0;
	}

	static final void method1138(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		IComponentDefinitions icomponentdefinitions_5 = Index.method5694(i_2 << 16 | i_3, i_4, -1458346299);
		Class60.method1170();
		IComponentSettings class282_sub10_6 = client.method11633(icomponentdefinitions_5);
		Class304.setUseOptionFlags(icomponentdefinitions_5, class282_sub10_6.getUseOptionFlags(), class282_sub10_6.interfaceId, (byte) -101);
	}

	static final void method1140(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub17_8200.method12762(-283512869) == 1 ? 1 : 0;
	}

	static final void method6310(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6122(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method787(CS2Executor executor) {
		Class282_Sub36 class282_sub36_2 = Class540.method11595(-1576243923);
		if (class282_sub36_2 == null) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub36_2.anInt7991;
			int i_3 = class282_sub36_2.anInt7988 << 28 | class282_sub36_2.anInt7987 + Class291.anInt3472 << 14 | class282_sub36_2.anInt7993 + Class291.anInt3473;
			executor.intStack[++executor.intStackPtr - 1] = i_3;
		}
	}

	static final void method11403(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method3987(icomponentdefinitions_3, interface_4, executor, -599656695);
	}

	static final void method11405(CS2Executor executor) {
		executor.intStackPtr -= 2;
		client.anInt7340 = executor.intStack[executor.intStackPtr];
		client.anInt7342 = executor.intStack[executor.intStackPtr + 1];
	}

	static final void method11406(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).stackable == 1 ? 1 : 0;
	}

	static final void method4173(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method6942(icomponentdefinitions_3, executor, -839720836);
	}

	static final void method4174(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method7667(icomponentdefinitions_3, interface_4, executor, 668340664);
	}

	static final void method4175(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method2170(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method4176(CS2Executor executor) {
		int i_2 = client.anIntArrayArrayArray7302[executor.intStack[--executor.intStackPtr]].length >> 1;
		executor.intStack[++executor.intStackPtr - 1] = i_2;
	}

	static final void method4177(CS2Executor executor) {
		executor.intStackPtr -= 4;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		CoordGrid coordgrid_6 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
		RouteStrategy.method3794((i_2 >> 14 & 0x3fff) - coordgrid_6.x, (i_2 & 0x3fff) - coordgrid_6.y, i_3 << 2, i_4, i_5, false);
	}

	static final void method4178(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		long long_5 = Class42.method891(i_2, i_3, i_4);
		int i_7 = ObjectIndexLoader.method7914(long_5);
		if (i_4 < 1970) {
			--i_7;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_7;
	}

	static final void method4181(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		ProjectileCutsceneAction.method14665(string_2);
	}

	static final void method6071(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method8390(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6072(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub12_8195.method12707() && Renderers.SOFTWARE_RENDERER.method8403() ? 1 : 0;
	}

	static final void method6169(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub1.method11614(i_2);
	}

	static final void intGreaterOrEqual(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr] >= executor.intStack[executor.intStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method299(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.getMouseY();
	}

	static final void method300(CS2Executor executor) {
		NPC npc_2 = (NPC) executor.animable;
		boolean bool_3 = false;
		NPCDefinitions npcdefinitions_4 = npc_2.definitions;
		if (npcdefinitions_4.transformTo != null) {
			npcdefinitions_4 = npcdefinitions_4.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER);
		}
		if (npcdefinitions_4 != null) {
			bool_3 = npcdefinitions_4.aBool4893;
		}
		executor.intStack[++executor.intStackPtr - 1] = bool_3 ? 1 : 0;
	}

	static final void method301(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt106;
	}

	static final void method305(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6186(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6998(CS2Executor executor) {
		if (ClanVarSettingsIndexLoader.anInt2880 == 2) {
			Class188.aBool2378 = true;
		} else if (ClanVarSettingsIndexLoader.anInt2880 == 1) {
			Class188.aBool2377 = true;
		} else if (ClanVarSettingsIndexLoader.anInt2880 == 3) {
			Class188.aBool2372 = true;
		}
	}

	static final void method4200(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStackPtr -= 10;
		byte[] bytes_4 = null;
		byte[] bytes_5 = null;
		int i_6;
		for (i_6 = 0; i_6 < 10 && executor.intStack[i_6 + executor.intStackPtr] >= 0; i_6 += 2) {
			;
		}
		if (i_6 > 0) {
			bytes_4 = new byte[i_6 / 2];
			bytes_5 = new byte[i_6 / 2];
			for (i_6 -= 2; i_6 >= 0; i_6 -= 2) {
				bytes_4[i_6 / 2] = (byte) executor.intStack[i_6 + executor.intStackPtr];
				bytes_5[i_6 / 2] = (byte) executor.intStack[i_6 + executor.intStackPtr + 1];
			}
		}
		method1838(icomponentdefinitions_3, bytes_4, bytes_5, executor);
	}

	static final void method4201(CS2Executor executor) {
		IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
		if (icomponentdefinitions_2.anInt1426 != -1) {
			executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_2.anInt1427;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method4202(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ItemDefinitions itemdefinitions_4 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		if (i_3 >= 1 && i_3 <= 5 && itemdefinitions_4.inventoryOptions[i_3 - 1] != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = itemdefinitions_4.inventoryOptions[i_3 - 1];
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method4205(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method2168(icomponentdefinitions_3, interface_4, executor, -1301648510);
	}

	static final void method14611(CS2Executor executor) {
		int[] ints_2 = executor.intStack;
		int i_3 = ++executor.intStackPtr - 1;
		byte b_4;
		if (Class530.aBool7050) {
			b_4 = 1;
		} else {
			b_4 = 0;
		}
		ints_2[i_3] = b_4;
	}

	static final void method6802(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method3987(icomponentdefinitions_3, interface_4, executor, -669419549);
	}

	static final void method8327(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method7555(icomponentdefinitions_3, interface_4, executor, (byte) -121);
	}

	static final void storeLong(CS2Executor executor) {
		executor.longLocals[executor.intOpValues[executor.instrPtr]] = executor.longStack[--executor.longStackPtr];
	}

	static final void method15523(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method7267(icomponentdefinitions_3, interface_4, executor, 1800659377);
	}

	static void method5016(CS2Executor executor) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.anIntArray2968 == null ? 0 : questdefinitions_2.anIntArray2968.length;
	}

	static final void longLessOrEqual(CS2Executor executor) {
		executor.longStackPtr -= 2;
		if (executor.longStack[executor.longStackPtr] <= executor.longStack[executor.longStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method5922(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = executor.currentClanSettings.clanName;
	}

	static final void method5925(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		Class155.method2635(string_2, string_3);
	}

	static final void method5926(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1293;
	}

	static final void method7699(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7151 ? 1 : 0;
	}

	static final void loadClanSettingVarbit(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		ClanVarSettingsDefinitions class537_3 = IndexLoaders.CLAN_VAR_SETTINGS_LOADER.method3933(i_2, 1537794608);
		if (class537_3 == null) {
			throw new RuntimeException();
		} else {
			Integer integer_4 = executor.currentClanSettings.method1225(client.CURRENT_GAME.id << 16 | class537_3.baseVar, class537_3.startBit, class537_3.endBit);
			int i_5;
			if (integer_4 == null) {
				i_5 = 0;
			} else {
				i_5 = integer_4.intValue();
			}
			executor.intStack[++executor.intStackPtr - 1] = i_5;
		}
	}

	static final void method8859(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		method3965(icomponentdefinitions_4, executor, -757819357);
	}

	static final void method8863(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1299;
	}

	static final void method933(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.currentOwner;
	}

	static final void method934(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class11.SYSTEM_INFO.anInt8167 >= 512 && !client.aBool7465 && !client.aBool7171 ? 0 : 1;
	}

	static final void method3691(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 | i_3;
	}

	static final void method3692(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub13_8228.method12714();
	}

	static final void method3693(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.water, executor.intStack[--executor.intStackPtr] == 1 ? 2 : 0, 447619076);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -59);
		Class190.savePreferences((byte) 121);
		client.aBool7175 = false;
	}

	static final void clearCompChildren(CS2Executor executor) {
		IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
		icomponentdefinitions_2.aClass118Array1438 = null;
		icomponentdefinitions_2.aClass118Array1439 = null;
		Class109.redrawComponent(icomponentdefinitions_2, (byte) -71);
	}

	static final void method3911(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(10, i_2 << 16 | i_3, i_4, "", (byte) 121);
	}

	static final void method1783(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (i_3 == -1) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).method15212((char) i_3);
		}
	}

	static final void method1784(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		InterfaceWithDefs underlaydefinition_3;
		if (executor.aBool7022) {
			underlaydefinition_3 = executor.aClass513_6994;
		} else {
			underlaydefinition_3 = executor.aClass513_7007;
		}
		executor.intStack[++executor.intStackPtr - 1] = underlaydefinition_3.method8766(executor.animable.inter, i_2, -1) ? 1 : 0;
	}

	static void method2953(CS2Executor executor) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.anIntArrayArray2966 == null ? 0 : questdefinitions_2.anIntArrayArray2966.length;
	}

	static final void method4773(CS2Executor executor) {
		if (client.anInt7434 == 0) {
			executor.intStack[++executor.intStackPtr - 1] = -2;
		} else if (client.anInt7434 == 1) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = client.anInt7449;
		}
	}

	static final void method4774(CS2Executor executor) {
		String string_2 = null;
		if (Class119.HOSTNAME_IDENTIFIER != null) {
			string_2 = Class119.HOSTNAME_IDENTIFIER.getHostName();
		}
		if (string_2 == null) {
			string_2 = "";
		}
		executor.stringStack[++executor.stringStackPtr - 1] = string_2;
	}

	static final void method4775(CS2Executor executor) {
		QuestIndexLoader.method4166();
	}

	static final void method4776(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.graphics, 0, -1214034115);
		Class190.savePreferences((byte) 63);
		client.aBool7175 = false;
	}

	static final void method1872(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = NPCDirection.method4327(i_2, i_3, true, (byte) 32);
	}

	static final void loadVarcString(CS2Executor executor) {
		String string_2 = Class462.VARC_STRING[executor.intOpValues[executor.instrPtr]];
		if (string_2 == null) {
			string_2 = "";
		}
		executor.stringStack[++executor.stringStackPtr - 1] = string_2;
	}

	static final void popString(CS2Executor executor) {
		--executor.stringStackPtr;
	}

	static final void method7771(CS2Executor executor) {
		String string_2;
		if (VertexNormal.myPlayer != null && VertexNormal.myPlayer.username != null) {
			string_2 = VertexNormal.myPlayer.method16128();
		} else {
			string_2 = "";
		}
		executor.stringStack[++executor.stringStackPtr - 1] = string_2;
	}

	static final void method7773(CS2Executor executor) {
		Class282_Sub40.method13300(-1273704391);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -42);
		Class190.savePreferences((byte) 53);
		client.aBool7175 = false;
	}

	static final void method7774(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		SpotAnimIndexLoader.method8862(i_2, i_3 >> 14 & 0x3fff, i_3 & 0x3fff, true);
	}

	static final void getVarpOld(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = ((Player) executor.animable).aClass155_10561.method2626(i_2, (byte) 56);
	}

	static final void method8343(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub4_8187.method12646() && Renderers.SOFTWARE_RENDERER.method8405() ? 1 : 0;
	}

	static final void method8344(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6186(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3802(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].amount;
	}

	static final void method3803(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		int i_4 = -1;
		if (chatline_3 != null) {
			i_4 = chatline_3.anInt1085;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static final void method3804(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (Class475.supportsFullScreen) {
			executor.intStack[++executor.intStackPtr - 1] = Engine.fullScreenFrame != null ? 1 : 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method3806(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14664(icomponentdefinitions_3, interface_4, true, 1, executor, (byte) -9);
	}

	static void method4556(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).method4093(Class158_Sub1.PLAYER_VAR_PROVIDER, client.anIntArray7337) ? 1 : 0;
	}

	static final void method4557(CS2Executor executor) {
		executor.intStackPtr -= 3;
		Class42.method890(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], (byte) -2);
	}

	static final void method4558(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method505(icomponentdefinitions_3, interface_4, executor);
	}

	static final void stringEqual(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		executor.intStack[++executor.intStackPtr - 1] = Class455.method7557((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], Class223.CURRENT_LANGUAGE);
	}

	static final void intToString(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = Integer.toString(i_2);
	}

	static final void method8215(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		if (icomponentdefinitions_3.aString1369 == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.aString1369;
		}
	}

	static void method8216(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).isStarted(Class158_Sub1.PLAYER_VAR_PROVIDER) ? 1 : 0;
	}

	static final void method8218(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class380.method6450((char) i_2, -294596475) ? 1 : 0;
	}

	static final void method8219(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class488.anInt5760;
		executor.intStack[++executor.intStackPtr - 1] = Class351.anInt4097;
	}

	static final void method8220(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >>> 16];
		IComponentDefinitions icomponentdefinitions_5 = Class96_Sub23.method14682(interface_4, icomponentdefinitions_3);
		int[] ints_6 = executor.intStack;
		int i_7 = ++executor.intStackPtr - 1;
		int i_8;
		if (icomponentdefinitions_5 == null) {
			i_8 = -1;
		} else {
			i_8 = icomponentdefinitions_5.idHash;
		}
		ints_6[i_7] = i_8;
	}

	static final void method1631(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method14586(icomponentdefinitions_4, interface_5, executor);
	}

	static final void method4838(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method3738(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method4839(CS2Executor executor) {
		--executor.intStackPtr;
		int i_2 = executor.intStack[executor.intStackPtr];
		Class282_Sub44 class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.get((long) i_2);
		if (class282_sub44_3 != null && class282_sub44_3.anInt8062 == 3) {
			Class351.closeChildren(class282_sub44_3, true, true, -1932930202);
		}
	}

	static final void method6395(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method5009(icomponentdefinitions_4, interface_5, executor, -1781977981);
	}

	static final void method6396(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub20_Sub38.method15430(i_2);
	}

	static final void method6397(CS2Executor executor) {
		int i_2 = Class393.preferences.aClass468_Sub27_8208.method12952((byte) 81);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8209, executor.intStack[--executor.intStackPtr] == 1 ? 0 : i_2, 2046929998);
		ClanVarDefinitions.method6823();
	}

	static final void method6399(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = 0;
	}

	static final void method6400(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		executor.intStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr];
		int i_4 = executor.intStack[executor.intStackPtr + 1];
		String string_5 = (String) executor.stringStack[executor.stringStackPtr + 1];
		ProjectileCutsceneAction.method14666(string_2, i_3 == 1, i_4, string_5);
		executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.anInt4985;
	}

	static final void method13044(CS2Executor executor) {
		if (client.aString7359 != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = client.aString7359;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method13046(CS2Executor executor) {
		if (Class113.CLAN_CHANNEL != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
			executor.aClass282_Sub4_7011 = Class113.CLAN_CHANNEL;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method3611(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub2_8205, executor.intStack[--executor.intStackPtr], -163458202);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -4);
		Class190.savePreferences((byte) 43);
		client.aBool7175 = false;
	}

	static final void method3613(CS2Executor executor) {
		if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
			Class440.method7373(Class393.preferences.screenSize.method12687(551500203), -1, -1, false, (byte) 52);
		}
	}

	static final void divideInt(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 / i_3;
	}

	static final void method5765(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).wearPos2;
	}

	static final void method5766(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub1_8197, executor.intStack[--executor.intStackPtr], 1012945270);
		Class190.savePreferences((byte) 77);
		client.aBool7175 = false;
	}

	static final void method5767(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub20_8207.method12797() ? 1 : 0;
	}

	static final void method5769(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (Class475.supportsFullScreen) {
			Class467[] arr_3 = ClanVarDefinitions.method6825((byte) 57);
			executor.intStack[++executor.intStackPtr - 1] = arr_3[i_2].anInt5571;
			executor.intStack[++executor.intStackPtr - 1] = arr_3[i_2].anInt5574;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method6174(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteYaw;
	}

	static final void method15448(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method774(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method11438(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method3078(icomponentdefinitions_3, interface_4, executor, -1906837964);
	}

	static final void method11439(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = i_2 >> 14 & 0x3fff;
		int i_4 = i_2 & 0x3fff;
		CoordGrid coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
		i_3 -= coordgrid_5.x;
		if (i_3 < 0) {
			i_3 = 0;
		} else if (i_3 >= IndexLoaders.MAP_REGION_DECODER.getSizeX()) {
			i_3 = IndexLoaders.MAP_REGION_DECODER.getSizeX();
		}
		i_4 -= coordgrid_5.y;
		if (i_4 < 0) {
			i_4 = 0;
		} else if (i_4 >= IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
			i_4 = IndexLoaders.MAP_REGION_DECODER.getSizeY();
		}
		client.anInt7262 = (i_3 << 9) + 256;
		client.anInt7376 = (i_4 << 9) + 256;
		NativeLibraryLoader.anInt3240 = 4;
		Class86.anInt833 = -1;
		PingRequester.anInt5864 = -1;
	}

	static final void method11440(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(1, i_2 << 16 | i_3, i_4, "", (byte) 25);
	}

	static final void method4965(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method4160(icomponentdefinitions_3, interface_4, executor, (short) 14442);
	}

	static final void method4966(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		EnumDefinitions enumdefinitions_4 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2);
		executor.stringStack[++executor.stringStackPtr - 1] = enumdefinitions_4.getStringValue(i_3);
	}

	static final void method4967(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = Class225_Sub5.method13045(Class302.method5363(executor.intStack[--executor.intStackPtr], 126882752), Class223.CURRENT_LANGUAGE.getValue());
	}

	static final void method4968(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class468_Sub19.method12790(executor.aClass282_Sub4_7011 == Class113.CLAN_CHANNEL, i_2);
	}

	static final void method4970(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6313(icomponentdefinitions_3, interface_4, executor, 172839480);
	}

	static final void method4971(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method910(icomponentdefinitions_3, interface_4, executor, 2070102575);
	}

	static final void method5197(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = Class521_Sub1_Sub1_Sub6.getAmountAtSlot(i_2, i_3, false, 1986479665);
	}

	static final void method5198(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).membersOnly ? 1 : 0;
	}

	static final void method5199(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 != -1) {
			Class123.method2152(i_2, 1279989197);
		}
	}

	static final void method563(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method13292(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method564(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method4651(icomponentdefinitions_3, interface_4, executor, (byte) 59);
	}

	static final void method565(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		String str_4 = "";
		if (chatline_3 != null && chatline_3.nameSimple != null) {
			str_4 = chatline_3.nameSimple;
		}
		executor.stringStack[++executor.stringStackPtr - 1] = str_4;
	}

	static final void method6851(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method14605(icomponentdefinitions_3, executor, (byte) -34);
	}

	static final void method1391(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = MapSpriteIndexLoader.anInt5123 + Class291.anInt3472;
		executor.intStack[++executor.intStackPtr - 1] = Class475.anInt5624 + Class291.anInt3473;
	}

	static final void method6271(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method2168(icomponentdefinitions_3, interface_4, executor, 539000010);
	}

	static final void method6272(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int[] ints_3 = Class268.method4799(i_2);
		Class503.method8362(ints_3, 0, executor.intStack, executor.intStackPtr, 3);
		executor.intStackPtr += 3;
	}

	static final void method6275(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7344 ? 1 : 0;
		executor.stringStack[++executor.stringStackPtr - 1] = client.aString7356 == null ? "" : client.aString7356;
		executor.stringStack[++executor.stringStackPtr - 1] = client.aString7275 == null ? "" : client.aString7275;
	}

	static final void method16079(CS2Executor executor) {
		executor.intStackPtr -= 2;
		HostNameIdentifier.method486(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], 0);
	}

	static final void method1624(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method569(icomponentdefinitions_3, interface_4, executor, -575655435);
	}

	static final void method1625(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 >= 0 && i_2 < client.anInt7449) {
			executor.intStack[++executor.intStackPtr - 1] = client.aClass6Array7452[i_2].anInt42;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method1627(CS2Executor executor) {
		Wall.method16114();
	}

	static final void arrayNew(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr] >> 16;
		int i_3 = executor.intOpValues[executor.instrPtr] & 0xffff;
		int i_4 = executor.intStack[--executor.intStackPtr];
		if (i_4 >= 0 && i_4 <= 5000) {
			executor.globalArrayLengths[i_2] = i_4;
			byte b_5 = -1;
			if (i_3 == 105) {
				b_5 = 0;
			}
			for (int i_6 = 0; i_6 < i_4; i_6++) {
				executor.globalArrays[i_2][i_6] = b_5;
			}
		} else {
			throw new RuntimeException();
		}
	}

	static final void subtractInt(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 - i_3;
	}

	static final void method2963(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (Class291_Sub1.aClass465_8029 != null) {
			Node node_3 = Class291_Sub1.aClass465_8029.get((long) i_2);
			executor.intStack[++executor.intStackPtr - 1] = node_3 != null ? 1 : 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method2965(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method8387(icomponentdefinitions_4, interface_5, executor, 2021162647);
	}

	static final void method1802(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.memberCount;
	}

	static final void method1803(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub17_8200, executor.intStack[--executor.intStackPtr] != 0 ? 1 : 0, -564300666);
		Class190.savePreferences((byte) 98);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -119);
	}

	static final void method926(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = string_2 + HitbarIndexLoader.method5120(i_3, true, -948271642);
	}

	static final void method927(CS2Executor executor) {
		int i_2 = client.aClass465_7442.method7748((short) 622);
		if (client.anInt7349 != -1) {
			++i_2;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_2;
	}

	static final void method928(CS2Executor executor) {
		if (Class96_Sub21.keyRecorder.held(82)) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method2586(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.cpu, executor.intStack[--executor.intStackPtr], -2100114669);
		Class190.savePreferences((byte) 44);
	}

	static final void method2587(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aShort7436;
		executor.intStack[++executor.intStackPtr - 1] = client.aShort7437;
	}

	static final void method2588(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.water.method12923() ? 1 : 0;
	}

	static final void method2595(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6453(icomponentdefinitions_3, interface_4, executor, -1649840188);
	}

	static final void method6194(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		Class119.method2075(i_2, string_3);
	}

	static final void method6195(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub4_8223.method12641(-1731892952);
	}

	static final void longNotEqual(CS2Executor executor) {
		executor.longStackPtr -= 2;
		if (executor.longStack[executor.longStackPtr] != executor.longStack[executor.longStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method2855(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method5017(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method2856(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		Queue class477_4 = Class291.method5127(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
		boolean bool_5 = false;
		for (Class282_Sub50_Sub6 class282_sub50_sub6_6 = (Class282_Sub50_Sub6) class477_4.method7941(); class282_sub50_sub6_6 != null; class282_sub50_sub6_6 = (Class282_Sub50_Sub6) class477_4.method7955(-1429079098)) {
			if (i_3 == class282_sub50_sub6_6.anInt9536) {
				bool_5 = true;
				break;
			}
		}
		if (bool_5) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method3768(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class8_Sub2.method14263(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
	}

	static final void method3769(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.aClass521_Sub1_Sub2_Sub1_7014.method12997();
	}

	static final void method14491(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class48_Sub2.aByte9263;
	}

	static final void method14492(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).messages[i_3];
	}

	static final void method283(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6244(icomponentdefinitions_3, interface_4, executor, 606535438);
	}

	static final void method284(CS2Executor executor) {
		boolean bool_2 = executor.intStack[--executor.intStackPtr] == 1;
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8208, bool_2 ? 2 : 1, 681995550);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8209, bool_2 ? 2 : 1, -1225765043);
		ClanVarDefinitions.method6823();
		Class190.savePreferences((byte) 111);
		client.aBool7175 = false;
	}

	static final void method287(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) (TextureDetails.time() / 86400000L) - 11745;
	}

	static final void method481(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.graphics.method12654();
	}

	static final void method484(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method4160(icomponentdefinitions_3, interface_4, executor, (short) 8078);
	}

	static final void method485(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method1642(icomponentdefinitions_4, interface_5, executor, -107525091);
	}

	static final void method14606(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aClass118_7183 == null ? -1 : client.aClass118_7183.idHash;
	}

	static final void method7322(CS2Executor executor) {
		method11160(Class507.method8727(), executor);
	}

	static final void method6762(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method3338(icomponentdefinitions_3, interface_4, executor, (byte) 82);
	}

	static final void method8723(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method3338(icomponentdefinitions_3, interface_4, executor, (byte) 40);
	}

	static final void method8724(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (Class468_Sub8.INTERFACES[i_2] == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = Class468_Sub8.INTERFACES[i_2].components[i_3].anInt1414;
		}
	}

	static final void method8726(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method797(icomponentdefinitions_3, interface_4, executor, 2104717291);
	}

	static final void method7270(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method502(icomponentdefinitions_3, interface_4, executor, -787893593);
	}

	static final void method7274(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.lootshareRank;
	}

	static final void method7276(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class291.method5130(i_2);
		if (class282_sub50_sub6_3 == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9532 >> 14 & 0x3fff;
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9532 & 0x3fff;
		}
	}

	static final void method7277(CS2Executor executor) {
		Class76.method1361((byte) -81);
		Class20.aBool187 = false;
	}

	static final void method2091(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		QuickchatMessageDefinitions quickchatdefinitions_5 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2);
		if (quickchatdefinitions_5.method14918(i_3, -1596809459).id != 0) {
			throw new RuntimeException("");
		} else {
			executor.intStack[++executor.intStackPtr - 1] = quickchatdefinitions_5.method14901(i_3, i_4);
		}
	}

	static void method2092(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).anIntArrayArray2966[executor.intStack[executor.intStackPtr - 1]][0];
		--executor.intStackPtr;
	}

	static final void getVarnbitOld(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = ((NPC) executor.animable).aClass153_10579.method2610(i_2);
	}

	static final void method2096(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.anInt7449) {
			Class6 class6_3 = client.aClass6Array7452[i_2];
			executor.stringStack[++executor.stringStackPtr - 1] = class6_3.aString37;
			if (class6_3.aString43 != null) {
				executor.stringStack[++executor.stringStackPtr - 1] = class6_3.aString43;
			} else {
				executor.stringStack[++executor.stringStackPtr - 1] = "";
			}
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method2638(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method786(icomponentdefinitions_4, interface_5, executor);
	}

	static final void method2639(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		NPC npc_3 = (NPC) executor.animable;
		int i_4 = npc_3.method16163(i_2);
		int i_5 = npc_3.method16169(i_2);
		executor.intStack[++executor.intStackPtr - 1] = i_4;
		executor.intStack[++executor.intStackPtr - 1] = i_5;
	}

	static final void animateComp(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method797(icomponentdefinitions_3, interface_4, executor, 2057644852);
	}

	static final void method8742(CS2Executor executor) {
		Class275_Sub7.method12606((byte) 70);
	}

	static final void returnInstr(CS2Executor executor) {
		if (executor.anInt7002 != 0) {
			Class509 class509_2 = executor.aClass509Array7016[--executor.anInt7002];
			executor.current = class509_2.aClass282_Sub50_Sub5_5869;
			executor.operations = executor.current.operations;
			executor.intOpValues = executor.current.intOpValues;
			executor.instrPtr = class509_2.anInt5866;
			executor.intLocals = class509_2.anIntArray5867;
			executor.objectLocals = class509_2.anObjectArray5865;
			executor.longLocals = class509_2.aLongArray5868;
		}
	}

	static final void method4137(CS2Executor executor) {
		AnimationDefinitions.method11148(executor.aClass521_Sub1_Sub2_Sub1_7014, executor.intStack[--executor.intStackPtr], -1315599355);
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[0];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[1];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[2];
	}

	static final void switchInstr(CS2Executor executor) {
		IterableNodeMap iterablenodemap_2 = executor.current.switchMaps[executor.intOpValues[executor.instrPtr]];
		IntNode class282_sub38_3 = (IntNode) iterablenodemap_2.get((long) executor.intStack[--executor.intStackPtr]);
		if (class282_sub38_3 != null) {
			executor.instrPtr += class282_sub38_3.anInt8002;
		}
	}

	static final void method5314(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method5121(icomponentdefinitions_4, interface_5, executor);
	}

	static final void callCS2Script(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		CS2Script cs2script_3 = Class286.getCS2Script(i_2);
		if (cs2script_3 == null) {
			throw new RuntimeException();
		} else {
			int[] ints_4 = new int[cs2script_3.intLocalsCount];
			Object[] arr_5 = new Object[cs2script_3.stringLocalsCount];
			long[] longs_6 = new long[cs2script_3.longLocalsCount];
			int i_7;
			for (i_7 = 0; i_7 < cs2script_3.intArgsCount; i_7++) {
				ints_4[i_7] = executor.intStack[i_7 + (executor.intStackPtr - cs2script_3.intArgsCount)];
			}
			for (i_7 = 0; i_7 < cs2script_3.stringArgsCount; i_7++) {
				arr_5[i_7] = executor.stringStack[i_7 + (executor.stringStackPtr - cs2script_3.stringArgsCount)];
			}
			for (i_7 = 0; i_7 < cs2script_3.longArgsCount; i_7++) {
				longs_6[i_7] = executor.longStack[i_7 + (executor.longStackPtr - cs2script_3.longArgsCount)];
			}
			executor.intStackPtr -= cs2script_3.intArgsCount;
			executor.stringStackPtr -= cs2script_3.stringArgsCount;
			executor.longStackPtr -= cs2script_3.longArgsCount;
			Class509 class509_8 = new Class509();
			class509_8.aClass282_Sub50_Sub5_5869 = executor.current;
			class509_8.anInt5866 = executor.instrPtr;
			class509_8.anIntArray5867 = executor.intLocals;
			class509_8.anObjectArray5865 = executor.objectLocals;
			class509_8.aLongArray5868 = executor.longLocals;
			if (executor.anInt7002 >= executor.aClass509Array7016.length) {
				throw new RuntimeException();
			} else {
				executor.aClass509Array7016[++executor.anInt7002 - 1] = class509_8;
				executor.current = cs2script_3;
				executor.operations = executor.current.operations;
				executor.intOpValues = executor.current.intOpValues;
				executor.instrPtr = -1;
				executor.intLocals = ints_4;
				executor.objectLocals = arr_5;
				executor.longLocals = longs_6;
			}
		}
	}

	static final void method15449(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub12_8195.method12706((byte) 21) == 1 ? 1 : 0;
	}

	static final void method2549(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class383.method6513(Class393.preferences.currentToolkit.getValue(742990495), 200, 804853307);
	}

	static final void method2552(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7190;
	}

	static final void method2554(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = Class393.preferences.aClass468_Sub13_8228.method12714();
		if (i_2 != i_3) {
			if (TextureDetails.method2875(client.gameState, -2096796884)) {
				if (i_3 == 0 && Class260.anInt3223 != -1) {
					Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, i_2, (byte) -40);
					Class468_Sub6.method12658(1298761444);
					Class260.aBool3220 = false;
				} else if (i_2 == 0) {
					VarBitDefinitions.method3805();
					Class260.aBool3220 = false;
				} else {
					Surface.method1491(i_2, (byte) -25);
				}
			}
			Class393.preferences.setValue(Class393.preferences.aClass468_Sub13_8228, i_2, 1268885388);
			Class190.savePreferences((byte) 29);
			client.aBool7175 = false;
		}
	}

	static final void method7032(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1301;
	}

	static final void method14659(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1314;
	}

	static final void method14660(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method1494(icomponentdefinitions_3, executor, (byte) -43);
	}

	static final void setCompTransparency(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method5453(icomponentdefinitions_3, interface_4, executor, 1925615787);
	}

	static final void method1259(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method13450(icomponentdefinitions_3, interface_4, executor, -2236332);
	}

	static final void method3937(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		StringBuilder stringbuilder_3 = new StringBuilder(string_2.length());
		boolean bool_4 = false;
		for (int i_5 = 0; i_5 < string_2.length(); i_5++) {
			char var_6 = string_2.charAt(i_5);
			if (var_6 == 60) {
				bool_4 = true;
			} else if (var_6 == 62) {
				bool_4 = false;
			} else if (!bool_4) {
				stringbuilder_3.append(var_6);
			}
		}
		executor.stringStack[++executor.stringStackPtr - 1] = stringbuilder_3.toString();
	}

	static final void method3938(CS2Executor executor) {
		executor.intStackPtr -= 2;
	}

	static final void method3939(CS2Executor executor) {
		LinkedNodeList.method7886();
	}

	static final void method3940(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6689(icomponentdefinitions_3, interface_4, executor, -1054634282);
	}

	static final void method3941(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method3738(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3942(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub10_8215, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0, -989964873);
		Class282_Sub20_Sub36.method15418();
		Class190.savePreferences((byte) 44);
		client.aBool7175 = false;
	}

	static final void method2823(CS2Executor executor) {
		executor.intStackPtr -= 4;
		Class435.method7300(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], false, 256);
	}

	static final void method2824(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		String str_4 = "";
		if (chatline_3 != null && chatline_3.message != null) {
			str_4 = chatline_3.message;
		}
		executor.stringStack[++executor.stringStackPtr - 1] = str_4;
	}

	static final void method2825(CS2Executor executor) {
		if (client.aByteArray7152 != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method2826(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method12260(icomponentdefinitions_3, interface_4, executor, 456705608);
	}

	static final void method2728(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
		if (attributedefault_4.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).getCS2String(i_3, attributedefault_4.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).getCS2Integer(i_3, attributedefault_4.defaultInt, -1410109564);
		}
	}

	static final void method2729(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.INVENTORY_LOADER.getInventoryDef(i_2, (short) 9738).maxSize;
	}

	static final void method3163(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method403(icomponentdefinitions_3, interface_4, executor, 1299404618);
	}

	static final void method3164(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.aClass10Array7456[i_2].aBool117 ? 1 : 0;
	}

	static final void method3168(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		IComponentDefinitions icomponentdefinitions_5 = Class96_Sub23.method14682(interface_4, icomponentdefinitions_3);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_5 == null ? -1 : icomponentdefinitions_5.idHash;
	}

	static final void method6116(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method12260(icomponentdefinitions_4, interface_5, executor, 603809090);
	}

	static final void method6117(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		if (i_3 == -1) {
			throw new RuntimeException("");
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = string_2 + (char) i_3;
		}
	}

	static final void method6120(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method1083(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6121(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class20.anInt169;
		executor.intStack[++executor.intStackPtr - 1] = Class20.anInt170;
	}

	static final void method1084(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6158(icomponentdefinitions_3, interface_4, executor, -1064421);
	}

	static final void method1085(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.aClass346_7009.anIntArray4046[i_2] = i_3;
	}

	static final void storeInt(CS2Executor executor) {
		executor.intLocals[executor.intOpValues[executor.instrPtr]] = executor.intStack[--executor.intStackPtr];
	}

	static final void method13057(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = i_2 >> 14 & 0x3fff;
	}

	static final void method1467(CS2Executor executor) {
		if (client.anInt7319 >= 5 && client.anInt7319 <= 9) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method2169(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method869(icomponentdefinitions_3, interface_4, executor, 1852179585);
	}

	static final void method2171(CS2Executor executor) {
		Class361.aClass361_4171.method6257(-168752774);
	}

	static final void method6439(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2).method14918(i_3, -1799645652).id;
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static final void method6440(CS2Executor executor) {
		String str_2 = "";
		if (Class182.aClipboard2263 != null) {
			Transferable transferable_3 = Class182.aClipboard2263.getContents((Object) null);
			if (transferable_3 != null) {
				try {
					str_2 = (String) transferable_3.getTransferData(DataFlavor.stringFlavor);
					if (str_2 == null) {
						str_2 = "";
					}
				} catch (Exception exception_5) {
					;
				}
			}
		}
		executor.stringStack[++executor.stringStackPtr - 1] = str_2;
	}

	static final void method5045(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.parent;
	}

	static final void method5046(CS2Executor executor) {
		if (Class149_Sub2.FRIEND_STATUS == null) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = Class149_Sub2.FRIEND_STATUS.id;
		}
	}

	static final void method5047(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub21_8222, i_2, -1752837734);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -44);
		Class190.savePreferences((byte) 84);
		client.aBool7175 = false;
	}

	static final void method4413(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (!Renderers.SOFTWARE_RENDERER.method8403()) {
			executor.intStack[++executor.intStackPtr - 1] = 3;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub12_8195.method7785(i_2, -550763763);
		}
	}

	static final void method4417(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt103;
	}

	static final void method12881(CS2Executor executor) {
		if (QuickchatFiller.CLAN_SETTINGS != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
			executor.currentClanSettings = QuickchatFiller.CLAN_SETTINGS;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method11350(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1293;
	}

	static final void method11351(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub2_8205.method7785(i_2, -1569082845);
	}

	static final void method11355(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.aString7426 != null && i_2 < Class459.anInt5534) {
			executor.stringStack[++executor.stringStackPtr - 1] = Class467.aClass173Array5575[i_2].aString2130;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method7676(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		int i_4 = -1;
		int i_5 = -1;
		Class119 class119_6 = icomponentdefinitions_3.method2046(Renderers.SOFTWARE_RENDERER, 1887351094);
		if (class119_6 != null) {
			i_4 = class119_6.anInt1458;
			i_5 = class119_6.anInt1454;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
		executor.intStack[++executor.intStackPtr - 1] = i_5;
	}

	static final void method892(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.hidden ? 1 : 0;
	}

	static final void method6212(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1320;
	}

	static final void method6213(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = (i_2 & 1 << i_3) != 0 ? 1 : 0;
	}

	static void method11592(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).aStringArray2975[executor.intStack[executor.intStackPtr - 1]];
		executor.intStackPtr -= 2;
	}

	static final void method11593(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method4772(icomponentdefinitions_3, interface_4, executor, (byte) 88);
	}

	static final void method11594(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.INPUT_STRING, client.connectionContext.isaac);
		tcpmessage_3.buffer.writeByte(ChatLine.getLength(string_2));
		tcpmessage_3.buffer.writeString(string_2);
		client.connectionContext.queuePacket(tcpmessage_3);
	}

	static final void method7715(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].currentAmount;
	}

	static final void method5332(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method8310(icomponentdefinitions_3, interface_4, executor, (byte) -121);
	}

	static final void method5335(CS2Executor executor) {
		executor.intStackPtr -= 5;
		Class435.method7300(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], false, executor.intStack[executor.intStackPtr + 4]);
	}

	static final void method7082(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub10_8215.method12691(-1233469498) == 1 ? 1 : 0;
	}

	static void method7083(CS2Executor executor) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.anIntArray2964 == null ? 0 : questdefinitions_2.anIntArray2964.length;
	}

	static final void method584(CS2Executor executor) {
		Class251.handleCommand((String) executor.stringStack[--executor.stringStackPtr], false, false);
	}

	static final void method585(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub19_8204.method12786() == 1 ? 1 : 0;
	}

	static final void method586(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class504.anInt5832;
	}

	static final void method587(CS2Executor executor) {
		Class361.aClass361_4182.method6257(-225278415);
	}

	static final void method1949(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method569(icomponentdefinitions_3, interface_4, executor, 2101137019);
	}

	static final void method1951(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = client.GRAND_EXCHANGE_SLOTS[i_2].method5908(-1286970996);
		executor.intStack[++executor.intStackPtr - 1] = i_3 == 5 ? 1 : 0;
	}

	static final void method4898(CS2Executor executor) {
		IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
		if (icomponentdefinitions_2.aClass118Array1438 == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			int i_3 = icomponentdefinitions_2.aClass118Array1438.length;
			for (int i_4 = 0; i_4 < icomponentdefinitions_2.aClass118Array1438.length; i_4++) {
				if (icomponentdefinitions_2.aClass118Array1438[i_4] == null) {
					i_3 = i_4;
					break;
				}
			}
			executor.intStack[++executor.intStackPtr - 1] = i_3;
		}
	}

	static final void method4899(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = Class393.preferences.aClass468_Sub13_8229.method12714();
		if (i_3 != i_2 && Class260.anInt3228 == Class260.anInt3223) {
			if (!TextureDetails.method2875(client.gameState, -2119377821)) {
				if (i_3 == 0) {
					Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, i_2, (byte) -58);
					Class468_Sub6.method12658(173344706);
					Class260.aBool3220 = false;
				} else if (i_2 == 0) {
					VarBitDefinitions.method3805();
					Class260.aBool3220 = false;
				} else {
					Surface.method1491(i_2, (byte) -14);
				}
			}
			Class393.preferences.setValue(Class393.preferences.aClass468_Sub13_8229, i_2, 1044638020);
			Class190.savePreferences((byte) 93);
			client.aBool7175 = false;
		}
	}

	static final void method4900(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.textures.method12873(-825847336) == 1 ? 1 : 0;
	}

	static final void method4901(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1376;
	}

	static final void method4902(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Connection.method3345(string_2);
	}

	static final void method15437(CS2Executor executor) {
		if (client.gameState == 0 && !JS5CacheFile.method3360((byte) 56)) {
			if (Class448.aBool5422) {
				executor.intStack[++executor.intStackPtr - 1] = 0;
			} else if (Class448.aLong5425 > TextureDetails.time() - 1000L) {
				executor.intStack[++executor.intStackPtr - 1] = 1;
			} else {
				Class448.aBool5422 = true;
				TCPPacket tcpmessage_2 = Class271.createPacket(OutgoingPacket.REQUEST_WORLD_LIST, client.connectionContext.isaac);
				tcpmessage_2.buffer.writeInt(MapSpriteDefinitions.WORLD_LIST_IDK);
				client.connectionContext.queuePacket(tcpmessage_2);
				executor.intStack[++executor.intStackPtr - 1] = 0;
			}
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		}
	}

	static final void method3228(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = NPCDirection.method4327(i_2, i_3, false, (byte) -108);
	}

	static final void method3229(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).multiStackSize;
	}

	static final void method3232(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14700(icomponentdefinitions_3, interface_4, executor, -442383470);
	}

	static final void method3233(CS2Executor executor) {
		EquipmentDefaults.method11248(2004309168);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -90);
		Class190.savePreferences((byte) 38);
		client.aBool7175 = false;
	}

	static final void method11492(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method7267(icomponentdefinitions_3, interface_4, executor, 1465963300);
	}

	static final void method6304(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2).method14916(-235375245);
	}

	static final void method6305(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		method7927(icomponentdefinitions_3, executor, (byte) -27);
	}

	static final void method11473(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1312;
	}

	static final void method3200(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub13_8227, executor.intStack[--executor.intStackPtr], 62408516);
		Class190.savePreferences((byte) 24);
		client.aBool7175 = false;
	}

	static final void method3201(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method15207(icomponentdefinitions_3, executor, 1765364986);
	}

	static final void method8147(CS2Executor executor) {
		executor.intStackPtr -= 11;
		Class356[] arr_2 = Class350_Sub3_Sub1.method15558(418447133);
		Class353[] arr_3 = AccountCreationResponseOpcodes.method8155();
		Class282_Sub15_Sub3.method15239(arr_2[executor.intStack[executor.intStackPtr]], arr_3[executor.intStack[executor.intStackPtr + 1]], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], executor.intStack[executor.intStackPtr + 4], executor.intStack[executor.intStackPtr + 5], executor.intStack[executor.intStackPtr + 6], executor.intStack[executor.intStackPtr + 7], executor.intStack[executor.intStackPtr + 8], executor.intStack[executor.intStackPtr + 9], executor.intStack[executor.intStackPtr + 10]);
	}

	static final void method6908(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub18_8214.getValue(-558492277);
	}

	static final void method1497(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method2915(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1498(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1334;
	}

	static final void method1499(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) (Class116.aLong1259 / 60000L);
		executor.intStack[++executor.intStackPtr - 1] = (int) ((Class116.aLong1259 - TextureDetails.time() - Class43.aLong420) / 60000L);
		executor.intStack[++executor.intStackPtr - 1] = Class509.aBool5870 ? 1 : 0;
	}

	static final void method1500(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class152.method2603(string_2);
	}

	static final void method1501(CS2Executor executor) {
		if (Class202_Sub1.GUEST_CLAN_CHANNEL != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
			executor.aClass282_Sub4_7011 = Class202_Sub1.GUEST_CLAN_CHANNEL;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method14602(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1277;
	}

	static final void bitAnd(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 & i_3;
	}

	static final void method8303(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt106;
	}

	static final void hookMouseHover(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method8277(icomponentdefinitions_3, interface_4, executor, 1396779389);
	}

	static final void method6738(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method13450(icomponentdefinitions_3, interface_4, executor, -51249694);
	}

	static final void method6741(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.anIntArray634[i_2];
	}

	static final void method541(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method7547(icomponentdefinitions_3, interface_4, executor, -996229805);
	}

	static final void method543(CS2Executor executor) {
		executor.animable.method15813(executor.intStack[--executor.intStackPtr]);
	}

	static final void method545(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 | 1 << i_3;
	}

	static final void method546(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aByte7458;
		if (client.aByte7458 != -1) {
			client.aByte7458 = -6;
		}
	}

	static final void method548(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(9, i_2 << 16 | i_3, i_4, "", (byte) 54);
	}

	static final void method550(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = AnimationIndexLoader.method11219((char) i_2, -2126211908) ? 1 : 0;
	}

	static final void method8018(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method7142(icomponentdefinitions_3, interface_4, executor, -1447710686);
	}

	static final void method8019(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 != 0 && i_2 < client.anInt7373) {
			executor.stringStack[++executor.stringStackPtr - 1] = client.aClass10Array7456[i_2].aString115;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method8021(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(5, i_2 << 16 | i_3, i_4, "", (byte) 110);
	}

	static final void method8045(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		int i_4 = executor.intStack[--executor.intStackPtr];
		--i_4;
		if (icomponentdefinitions_3.aStringArray1352 != null && i_4 < icomponentdefinitions_3.aStringArray1352.length && icomponentdefinitions_3.aStringArray1352[i_4] != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.aStringArray1352[i_4];
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method1813(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method11221(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1814(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		int i_4 = 0;
		if (chatline_3 != null) {
			i_4 = chatline_3.anInt1086;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static final void method1815(CS2Executor executor) {
		executor.intStackPtr -= 2;
		client.aShort7394 = (short) executor.intStack[executor.intStackPtr];
		if (client.aShort7394 <= 0) {
			client.aShort7394 = 256;
		}
		client.aShort7324 = (short) executor.intStack[executor.intStackPtr + 1];
		if (client.aShort7324 <= 0) {
			client.aShort7324 = 320;
		}
	}

	static final void method1816(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class354.anInt4112;
	}

	static final void method1817(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = ParticleProducerDefinition.method1163(i_2);
	}

	static final void method7332(CS2Executor executor) {
		method6018((Class521_Sub1) executor.anInterface12_7013, executor, 1876481461);
	}

	static final void method7334(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.customCursors.method12675() == 1 ? 1 : 0;
	}

	static final void method12846(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6697(icomponentdefinitions_3, interface_4, executor, 2102985161);
	}

	static final void method7726(CS2Executor executor) {
		executor.intStackPtr -= 4;
		int i_2 = executor.intStack[executor.intStackPtr];
		boolean bool_3 = executor.intStack[executor.intStackPtr + 1] == 1;
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		boolean bool_5 = executor.intStack[executor.intStackPtr + 3] == 1;
		Class365.method6299(i_2, bool_3, i_4, bool_5);
	}

	static final void method1508(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 < 0 || i_2 > 1) {
			i_2 = 0;
		}
		Class115.method1952(i_2 == 1, -1838966944);
	}

	static final void method1509(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method4159(icomponentdefinitions_3, interface_4, executor, -710786215);
	}

	static final void method1510(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method5066(icomponentdefinitions_3, interface_4, executor, 711806396);
	}

	static final void method1511(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method3369(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1512(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1329 == 1 ? icomponentdefinitions_3.anInt1330 : -1;
	}

	static final void arrayStore(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStackPtr -= 2;
		int i_3 = executor.intStack[executor.intStackPtr];
		if (i_3 >= 0 && i_3 < executor.globalArrayLengths[i_2]) {
			executor.globalArrays[i_2][i_3] = executor.intStack[executor.intStackPtr + 1];
		} else {
			throw new RuntimeException();
		}
	}

	static final void method4904(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method3365(icomponentdefinitions_3, interface_4, executor, -1548245230);
	}

	static final void method4905(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.aString7426 != null && i_2 < Class459.anInt5534) {
			executor.intStack[++executor.intStackPtr - 1] = Class467.aClass173Array5575[i_2].anInt2131;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method6190(CS2Executor executor) {
		AnimationDefinitions.method11148(executor.animable, executor.intStack[--executor.intStackPtr], 1271800838);
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[0];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[1];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method5814(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		InterfaceWithDefs underlaydefinition_4;
		if (executor.aBool7022) {
			underlaydefinition_4 = executor.aClass513_6994;
		} else {
			underlaydefinition_4 = executor.aClass513_7007;
		}
		executor.intStack[++executor.intStackPtr - 1] = underlaydefinition_4.method8766(executor.animable.inter, i_2, i_3) ? 1 : 0;
	}

	static final void method5816(CS2Executor executor) {
		Class274.method4884((byte) 13);
	}

	static final void method2150(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method869(icomponentdefinitions_3, interface_4, executor, -1209481120);
	}

	static final void getStructValue(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
		if (attributedefault_4.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.STRUCT_LOADER.getStruct(i_2, -1979038944).method14751(i_3, attributedefault_4.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.STRUCT_LOADER.getStruct(i_2, 1053782715).method14750(i_3, attributedefault_4.defaultInt);
		}
	}

	static final void method2153(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt113;
	}

	static final void method3984(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class101.method1776(i_2);
	}

	static final void method3986(CS2Executor executor) {
		if (Class308.aShortArray3621 != null && Class283.anInt3384 < VarcDefinitions.anInt4985) {
			executor.intStack[++executor.intStackPtr - 1] = Class308.aShortArray3621[++Class283.anInt3384 - 1] & 0xffff;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		}
	}

	static final void method15416(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method12209(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6733(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		String str_4 = "";
		if (chatline_3 != null && chatline_3.clan != null) {
			str_4 = chatline_3.clan;
		}
		executor.stringStack[++executor.stringStackPtr - 1] = str_4;
	}

	static final void getVarnOld(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = ((NPC) executor.animable).aClass153_10579.method2609(i_2, (byte) 106);
	}

	static final void loadLong(CS2Executor executor) {
		executor.longStack[++executor.longStackPtr - 1] = executor.longLocals[executor.intOpValues[executor.instrPtr]];
	}

	static final void method13491(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.parent;
	}

	static final void method4193(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class223.CURRENT_LANGUAGE.getValue();
	}

	static final void method4194(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = (int) (Class302.method5363(i_2, 292315472) / 60000L);
	}

	static final void method6236(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteRoll;
	}

	static final void method6237(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		String str_4 = "";
		if (chatline_3 != null && chatline_3.crownedName != null) {
			str_4 = chatline_3.crownedName;
		}
		executor.stringStack[++executor.stringStackPtr - 1] = str_4;
	}

	static final void method6238(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7465 ? 1 : 0;
	}

	static final void method6239(CS2Executor executor) {
		Class282_Sub20_Sub25.method15393(1862489719);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -87);
		Class190.savePreferences((byte) 74);
		client.aBool7175 = false;
	}

	static final void method6229(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		String string_4 = (String) executor.stringStack[--executor.stringStackPtr];
		if (i_2 == 99) {
			Class209.printConsoleMessage(string_4, -914132655);
		} else if (i_2 == 98) {
			QuestDefinitions.setConsoleText(string_4, 2053399101);
		} else {
			Class191.method3167(i_2, i_3, "", "", "", string_4, 30910415);
		}
	}

	static final void method6230(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = Class521_Sub1_Sub1_Sub6.getAmountAtSlot(i_2, i_3, true, -1743480204);
	}

	static final void method6231(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].method5909();
	}

	static final void method6232(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.hidden ? 1 : 0;
	}

	static final void method1613(CS2Executor executor) {
		executor.intStackPtr -= 4;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		i_2 += i_3 << 14;
		i_2 += i_4 << 28;
		i_2 += i_5;
		executor.intStack[++executor.intStackPtr - 1] = i_2;
	}

	static final void method6729(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		boolean bool_3 = executor.intStack[executor.intStackPtr + 1] == 1;
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub18_8214, i_2, 77442027);
		if (!bool_3) {
			Class393.preferences.setValue(Class393.preferences.graphics, 0, -1019376772);
		}
		Class190.savePreferences((byte) 45);
		client.aBool7175 = false;
	}

	static final void method6730(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = ((Player) executor.animable).method16127(2071482968);
	}

	static final void getEnumSize(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		EnumDefinitions enumdefinitions_3 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2);
		executor.intStack[++executor.intStackPtr - 1] = enumdefinitions_3.method7222();
	}

	static final void method12596(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub7_8210.method7785(i_2, -2053641335);
	}

	static final void method12597(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) (client.aLong7153 >> 32);
		executor.intStack[++executor.intStackPtr - 1] = (int) (client.aLong7153 & ~0x0L);
	}

	static final void method3790(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		if (underlaydefinition_2.aClass118_5886.anInt1288 == -1) {
			if (executor.aBool7022) {
				throw new RuntimeException("");
			} else {
				throw new RuntimeException("");
			}
		} else {
			IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.method8772();
			icomponentdefinitions_3.aClass118Array1438[underlaydefinition_2.aClass118_5886.anInt1288] = null;
			Class109.redrawComponent(icomponentdefinitions_3, (byte) -39);
		}
	}

	static final void hookMouseExit(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method11223(icomponentdefinitions_3, interface_4, executor, 334837898);
	}

	static final void method3792(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.getMouseX();
	}

	static final void lowerString(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = string_2.toLowerCase();
	}

	static final void method4197(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.INPUT_LONG_TEXT, client.outputContext.isaac);
		tcpmessage_3.buffer.writeByte(string_2.length() + 1);
		tcpmessage_3.buffer.writeString(string_2);
		client.outputContext.queuePacket(tcpmessage_3);
	}

	static final void method1456(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloat7146 >> 3;
	}

	static final void method14655(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class115.anInt1247;
	}

	static final void method6073(CS2Executor executor) {
		Class282_Sub50_Sub6 class282_sub50_sub6_2 = Class291.method5130(executor.intStack[--executor.intStackPtr]);
		if (class282_sub50_sub6_2 != null) {
			if (class282_sub50_sub6_2.aString9534 != null) {
				executor.stringStack[++executor.stringStackPtr - 1] = class282_sub50_sub6_2.aString9534;
				return;
			}
		}
		executor.stringStack[++executor.stringStackPtr - 1] = "";
	}

	static final void loadClanSettingVar(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		ClanVarSettingsDefinitions class537_3 = IndexLoaders.CLAN_VAR_SETTINGS_LOADER.method3933(i_2, 1715918723);
		if (class537_3 == null) {
			throw new RuntimeException();
		} else {
			Integer integer_4 = executor.currentClanSettings.getIntVar(client.CURRENT_GAME.id << 16 | i_2);
			int i_5;
			if (integer_4 == null) {
				if (class537_3.aChar7096 != 105 && class537_3.aChar7096 != 49) {
					i_5 = -1;
				} else {
					i_5 = 0;
				}
			} else {
				i_5 = integer_4.intValue();
			}
			executor.intStack[++executor.intStackPtr - 1] = i_5;
		}
	}

	static final void method7556(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		if (executor.intStack[--executor.intStackPtr] == 1) {
			executor.stringStack[++executor.stringStackPtr - 1] = string_2;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = string_3;
		}
	}

	static final void method7560(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6010(icomponentdefinitions_3, interface_4, executor, -298020679);
	}

	static final void method7561(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method3983(icomponentdefinitions_3, interface_4, executor, -1010803403);
	}

	static void method7434(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).anInt2960;
	}

	static final void method7444(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.anIntArray7338[i_2];
	}

	static final void method7445(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).wearPos;
	}

	static final void method7448(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.cpu.getValue();
	}

	static final void method11246(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method4136(icomponentdefinitions_3, interface_4, executor, (byte) 78);
	}

	static final void method11247(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1453;
	}

	static final void method11249(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteScale;
	}

	static final void method254(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int[] ints_4 = executor.intStack;
		int i_5 = ++executor.intStackPtr - 1;
		byte b_6;
		if (Class247.method4248(i_2, i_3)) {
			b_6 = 1;
		} else {
			b_6 = 0;
		}
		ints_4[i_5] = b_6;
	}

	static final void method15404(CS2Executor executor) {
		executor.intStackPtr -= 4;
		client.aShort7276 = (short) executor.intStack[executor.intStackPtr];
		if (client.aShort7276 <= 0) {
			client.aShort7276 = 1;
		}
		client.aShort7441 = (short) executor.intStack[executor.intStackPtr + 1];
		if (client.aShort7441 <= 0) {
			client.aShort7441 = 32767;
		} else if (client.aShort7441 < client.aShort7276) {
			client.aShort7441 = client.aShort7276;
		}
		client.aShort7214 = (short) executor.intStack[executor.intStackPtr + 2];
		if (client.aShort7214 <= 0) {
			client.aShort7214 = 1;
		}
		client.aShort7474 = (short) executor.intStack[executor.intStackPtr + 3];
		if (client.aShort7474 <= 0) {
			client.aShort7474 = 32767;
		} else if (client.aShort7474 < client.aShort7214) {
			client.aShort7474 = client.aShort7214;
		}
	}

	static void method356(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).anInt2958;
	}

	static final void method7218(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (!Renderers.SOFTWARE_RENDERER.method8405()) {
			executor.intStack[++executor.intStackPtr - 1] = 3;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub4_8187.method7785(i_2, -702184257);
		}
	}

	static final void method7219(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.color;
	}

	static final void method6005(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		BufferedConnectionContext class184_3 = Class468_Sub20.method12807(-1949417532);
		TCPPacket tcpmessage_4 = Class271.createPacket(OutgoingPacket.CHAT_TYPE, class184_3.isaac);
		tcpmessage_4.buffer.writeByte(i_2);
		class184_3.queuePacket(tcpmessage_4);
	}

	static final void sendVerifyEmailPacket(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class493.sendCheckEmailPacket(string_2);
	}

	static final void method11244(CS2Executor executor) {
		WorldDescriptor descriptor = Class77.getCurrentWorldDescriptor();
		if (descriptor != null) {
			executor.intStack[++executor.intStackPtr - 1] = descriptor.worldNumber;
			executor.intStack[++executor.intStackPtr - 1] = descriptor.flags;
			executor.stringStack[++executor.stringStackPtr - 1] = descriptor.unknown;
			World world = descriptor.getWorld();
			executor.intStack[++executor.intStackPtr - 1] = world.countryId;
			executor.stringStack[++executor.stringStackPtr - 1] = world.activity;
			executor.intStack[++executor.intStackPtr - 1] = descriptor.playerCount;
			executor.intStack[++executor.intStackPtr - 1] = descriptor.ping;
			executor.stringStack[++executor.stringStackPtr - 1] = descriptor.ipAddress;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.stringStack[++executor.stringStackPtr - 1] = "";
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.stringStack[++executor.stringStackPtr - 1] = "";
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void sendReportAbusePacket(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		executor.intStackPtr -= 2;
		int i_4 = executor.intStack[executor.intStackPtr];
		int i_5 = executor.intStack[executor.intStackPtr + 1];
		if (string_3 == null) {
			string_3 = "";
		}
		if (string_3.length() > 80) {
			string_3 = string_3.substring(0, 80);
		}
		BufferedConnectionContext class184_6 = Class468_Sub20.method12807(-837831842);
		TCPPacket tcpmessage_7 = Class271.createPacket(OutgoingPacket.REPORT_ABUSE, class184_6.isaac);
		tcpmessage_7.buffer.writeByte(ChatLine.getLength(string_2) + 2 + ChatLine.getLength(string_3));
		tcpmessage_7.buffer.writeString(string_2);
		tcpmessage_7.buffer.writeByte(i_4 - 1);
		tcpmessage_7.buffer.writeByte(i_5);
		tcpmessage_7.buffer.writeString(string_3);
		class184_6.queuePacket(tcpmessage_7);
	}

	static final void method8037(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = executor.currentClanSettings.memberNames[i_2];
	}

	static final void method12492(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method7729(icomponentdefinitions_3, interface_4, executor, 1544396395);
	}

	static final void loadClanVar(CS2Executor executor) {
		int param = executor.intOpValues[executor.instrPtr];
		Integer integer_3 = (Integer) Class46.CLAN_VARS[param];
		if (integer_3 == null) {
			ClanVarDefinitions class405_4 = IndexLoaders.CLAN_VAR_LOADER.method6753(param, 908110130);
			if (class405_4.aChar4832 != 105 && class405_4.aChar4832 != 49) {
				executor.intStack[++executor.intStackPtr - 1] = -1;
			} else {
				executor.intStack[++executor.intStackPtr - 1] = 0;
			}
		} else {
			executor.intStack[++executor.intStackPtr - 1] = integer_3.intValue();
		}
	}

	static final void method4324(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub11_8217.method12699((byte) -9);
	}

	static final void method3038(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 == -1) {
			int i_3 = i_2 >> 14 & 0x3fff;
			int i_4 = i_2 & 0x3fff;
			CoordGrid coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			i_3 -= coordgrid_5.x;
			if (i_3 < 0) {
				i_3 = 0;
			} else if (i_3 >= IndexLoaders.MAP_REGION_DECODER.getSizeX()) {
				i_3 = IndexLoaders.MAP_REGION_DECODER.getSizeX();
			}
			i_4 -= coordgrid_5.y;
			if (i_4 < 0) {
				i_4 = 0;
			} else if (i_4 >= IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
				i_4 = IndexLoaders.MAP_REGION_DECODER.getSizeY();
			}
			PingRequester.anInt5864 = (i_3 << 9) + 256;
			Class86.anInt833 = (i_4 << 9) + 256;
		} else {
			PingRequester.anInt5864 = -1;
			Class86.anInt833 = -1;
		}
	}

	static final void method3039(CS2Executor executor) {
		WorldDescriptor class217_sub1_2 = IsaacCipher.method7266();
		executor.intStack[++executor.intStackPtr - 1] = class217_sub1_2 == null ? 0 : class217_sub1_2.flags;
	}

	static final void method3041(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method1845(icomponentdefinitions_3, interface_4, executor, -1951994229);
	}

	static final void method3042(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ItemDefinitions itemdefinitions_4 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		if (i_3 >= 1 && i_3 <= 5 && itemdefinitions_4.groundOptions[i_3 - 1] != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = itemdefinitions_4.groundOptions[i_3 - 1];
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method3043(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.aClass282_Sub4_7011.method12098((String) executor.stringStack[--executor.stringStackPtr]);
	}

	static final void method3713(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.water.method7785(i_2, 618850580);
	}

	static final void method3714(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(8, i_2 << 16 | i_3, i_4, "", (byte) 81);
	}

	static final void method15392(CS2Executor executor) {
		IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_2.anInt1426;
	}

	static final void loadString(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = executor.objectLocals[executor.intOpValues[executor.instrPtr]];
	}

	static final void method3368(CS2Executor executor) {
		if (!JS5CacheFile.method3360((byte) -8)) {
			JS5StandardRequester.method5558();
		}
	}

	static final void method3370(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method542(icomponentdefinitions_3, interface_4, executor, -2005893492);
	}

	static final void method3966(CS2Executor executor) {
		if (client.aString7426 != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = Class285.method5025(client.aString7426);
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method6372(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method542(icomponentdefinitions_3, interface_4, executor, -1893429225);
	}

	static final void method6373(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Character.toUpperCase((char) i_2);
	}

	static final void method6374(CS2Executor executor) {
		WorldDescriptor class217_sub1_2 = Class468_Sub2.method12629();
		if (class217_sub1_2 != null) {
			executor.intStack[++executor.intStackPtr - 1] = class217_sub1_2.worldNumber;
			executor.intStack[++executor.intStackPtr - 1] = class217_sub1_2.flags;
			executor.stringStack[++executor.stringStackPtr - 1] = class217_sub1_2.unknown;
			World class213_3 = class217_sub1_2.getWorld();
			executor.intStack[++executor.intStackPtr - 1] = class213_3.countryId;
			executor.stringStack[++executor.stringStackPtr - 1] = class213_3.activity;
			executor.intStack[++executor.intStackPtr - 1] = class217_sub1_2.playerCount;
			executor.intStack[++executor.intStackPtr - 1] = class217_sub1_2.ping;
			executor.stringStack[++executor.stringStackPtr - 1] = class217_sub1_2.ipAddress;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.stringStack[++executor.stringStackPtr - 1] = "";
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.stringStack[++executor.stringStackPtr - 1] = "";
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method6381(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14664(icomponentdefinitions_3, interface_4, false, 0, executor, (byte) -19);
	}

	static final void method7915(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class417.anInt4994;
	}

	static final void method3988(CS2Executor executor) {
		if (Class96_Sub21.keyRecorder.held(86)) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method6781(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).wearPos3;
	}

	static final void method3017(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class241.method4150(-536353301);
	}

	static final void method3020(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method4276(icomponentdefinitions_3, interface_4, executor, -724687188);
	}

	static final void method3021(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.aClass282_Sub4_7011.guestsTalk;
	}

	static final void method7675(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = SpotAnimIndexLoader.getItemIdAtSlot(i_2, i_3, false, 946854305);
	}

	static final void method2107(CS2Executor executor) {
		Class466.method7777();
	}

	static final void method2108(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub18_8214.method7785(i_2, 198119632);
	}

	static final void method2112(CS2Executor executor) {
		executor.intStackPtr -= 7;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1] << 1;
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		int i_6 = executor.intStack[executor.intStackPtr + 4];
		int i_7 = executor.intStack[executor.intStackPtr + 5];
		int i_8 = executor.intStack[executor.intStackPtr + 6];
		if (i_2 >= 0 && i_2 < 2 && client.anIntArrayArrayArray7302[i_2] != null && i_3 >= 0 && i_3 < client.anIntArrayArrayArray7302[i_2].length) {
			client.anIntArrayArrayArray7302[i_2][i_3] = new int[] { (i_4 >> 14 & 0x3fff) << 9, i_5 << 2, (i_4 & 0x3fff) << 9, i_8 };
			client.anIntArrayArrayArray7302[i_2][i_3 + 1] = new int[] { (i_6 >> 14 & 0x3fff) << 9, i_7 << 2, (i_6 & 0x3fff) << 9 };
		}
	}

	static final void method11486(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.anIntArray7337[i_2];
	}

	static final void mergeStrings(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.stringStackPtr -= i_2;
		String string_3 = VarDefinitionLoader.method6398(executor.stringStack, executor.stringStackPtr, i_2);
		executor.stringStack[++executor.stringStackPtr - 1] = string_3;
	}

	static final void method12499(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method3672(icomponentdefinitions_3, interface_4, executor, (short) 10267);
	}

	static final void method810(CS2Executor executor) {
		Class10.method458(executor.intStack[--executor.intStackPtr]);
	}

	static final void method811(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = executor.aClass282_Sub4_7011.clanName;
	}

	static final void method814(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		QuickChatCategoryDefinitions class282_sub50_sub14_3 = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2);
		if (class282_sub50_sub14_3.messages == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub14_3.messages.length;
		}
	}

	static final void method815(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		method6942(icomponentdefinitions_3, executor, 312854602);
	}

	static final void method12689(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).name;
	}

	static final void method1452(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class16.method567(string_2, false, (byte) -20);
	}

	static final void method3339(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class2.method258(string_2);
	}

	static final void method3340(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = VertexNormal.myPlayer.aClass19_10359.method578() >> 3;
	}

	static final void method3341(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (Class468_Sub8.INTERFACES[i_2] == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			String string_4 = Class468_Sub8.INTERFACES[i_2].components[i_3].aString1285;
			if (string_4 == null) {
				executor.stringStack[++executor.stringStackPtr - 1] = "";
			} else {
				executor.stringStack[++executor.stringStackPtr - 1] = string_4;
			}
		}
	}

	static final void method3344(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7162 == executor.animable.method15794() ? 1 : 0;
	}

	static final void method3346(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.intStackPtr -= 2;
		int i_3 = executor.intStack[executor.intStackPtr];
		int i_4 = executor.intStack[executor.intStackPtr + 1];
		FontMetrics fontmetrics_5 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, i_4, 1119085558);
		executor.intStack[++executor.intStackPtr - 1] = fontmetrics_5.method6949(string_2, i_3, Class182.aClass160Array2261);
	}

	static final void loadVarpbit(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class158_Sub1.PLAYER_VAR_PROVIDER.getVarBit(i_2);
	}

	static final void method5203(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method14482(icomponentdefinitions_3, interface_4, executor, -1228549407);
	}

	static final void intLessOrEqual(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr] <= executor.intStack[executor.intStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method5205(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Surface.method1489().getValue();
	}

	static final void modInt(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 % i_3;
	}

	static final void method3829(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class412.aByte4963;
	}

	static final void method3830(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = Preference.method7788((long) executor.intStack[--executor.intStackPtr] * 60000L, Class223.CURRENT_LANGUAGE.getValue()) + " UTC";
	}

	static final void method5065(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.fog.method13421() ? 1 : 0;
	}

	static final void method7208(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method15511(icomponentdefinitions_3, interface_4, executor, (byte) 126);
	}

	static final void method7209(CS2Executor executor) {
		Class20.anInt198 = executor.intStack[--executor.intStackPtr];
	}

	static final void longEqual(CS2Executor executor) {
		executor.longStackPtr -= 2;
		if (executor.longStack[executor.longStackPtr + 1] == executor.longStack[executor.longStackPtr]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method15371(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub28_8212.method12964() ? 1 : 0;
	}

	static final void method3030(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_3.hasTooltipColor ? 1 : 0;
	}

	static final void method3031(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method1454(icomponentdefinitions_3, interface_4, executor, (byte) 111);
	}

	static final void method3033(CS2Executor executor) {
		if (client.anInt7319 >= 5 && client.anInt7319 <= 9) {
			executor.intStack[++executor.intStackPtr - 1] = client.anInt7319;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method15559(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1277;
	}

	static final void method4629(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method5455(icomponentdefinitions_3, interface_4, executor, 1919949252);
	}

	static final void method4630(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1] - 1;
		ItemDefinitions itemdefinitions_4 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		if (i_3 == itemdefinitions_4.unknownInt22) {
			executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_4.unknownInt23;
		} else if (i_3 == itemdefinitions_4.unknownInt27) {
			executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_4.unknownInt28;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		}
	}

	static final void method4631(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.aClass346_7009.anIntArray4046[i_2] = i_3;
	}

	static final void method4633(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method3369(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6938(CS2Executor executor) {
		executor.intStackPtr -= 3;
		byte[] bytes_2 = new byte[] { (byte) executor.intStack[executor.intStackPtr] };
		byte[] bytes_3 = new byte[] { (byte) executor.intStack[executor.intStackPtr + 1] };
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs(i_4);
		method1838(icomponentdefinitions_5, bytes_2, bytes_3, executor);
	}

	static final void method6940(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(6, i_2 << 16 | i_3, i_4, "", (byte) 43);
	}

	static final void method6941(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method5001(icomponentdefinitions_3, executor, -11442386);
	}

	static final void method451(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub19_8204, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0, -349576977);
		Class94.method1589();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048(-407830274);
		Class190.savePreferences((byte) 90);
		client.aBool7175 = false;
	}

	static final void method452(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 != Class393.preferences.aClass468_Sub14_8211.method12728()) {
			Class393.preferences.setValue(Class393.preferences.aClass468_Sub14_8211, i_2, 1770678701);
			Class190.savePreferences((byte) 15);
			client.aBool7175 = false;
		}
	}

	static final void method453(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7189 ? 1 : 0;
	}

	static final void method454(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.color;
	}

	static final void method8211(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteYaw;
	}

	static final void method8212(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method11337(icomponentdefinitions_3, interface_4, executor, -2109817364);
	}

	static final void loadVarp(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class158_Sub1.PLAYER_VAR_PROVIDER.vars[i_2];
	}

	static final void method6364(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method4276(icomponentdefinitions_3, interface_4, executor, 175430076);
	}

	static final void method3117(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method12401(icomponentdefinitions_3, interface_4, executor, 2018146774);
	}

	static final void method3119(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt107;
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt109;
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt108;
		Class9.anInt107 = -2;
		Class9.anInt109 = -1;
		Class9.anInt108 = -1;
	}

	static final void method3120(CS2Executor executor) {
		Class86.method1478();
	}

	static final void method1603(CS2Executor executor) {
		BufferedConnectionContext class184_2 = Class468_Sub20.method12807(-846822027);
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.PUBLIC_QUICKCHAT, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(3);
		tcpmessage_3.buffer.writeShort(executor.aClass346_7009.anInt4048);
		executor.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_3.buffer, executor.aClass346_7009.anIntArray4046, -1204920325);
		tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, -2062129936);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void method1604(CS2Executor executor) {
		System.out.println(executor.stringStack[--executor.stringStackPtr]);
	}

	static final void method1606(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method15409(icomponentdefinitions_3, interface_4, executor, -674550702);
	}

	static final void method1608(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (Class467.aClass173Array5575 != null && i_2 < Class459.anInt5534 && Class467.aClass173Array5575[i_2].aString2127.equalsIgnoreCase(VertexNormal.myPlayer.displayName)) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method5786(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.INPUT_NAME, client.outputContext.isaac);
		tcpmessage_3.buffer.writeByte(string_2.length() + 1);
		tcpmessage_3.buffer.writeString(string_2);
		client.outputContext.queuePacket(tcpmessage_3);
	}

	static final void method5788(CS2Executor executor) {
		Class282_Sub36 class282_sub36_2 = Class312_Sub1.method12538();
		if (class282_sub36_2 == null) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub36_2.anInt7991;
			int i_3 = class282_sub36_2.anInt7988 << 28 | class282_sub36_2.anInt7987 + Class291.anInt3472 << 14 | class282_sub36_2.anInt7993 + Class291.anInt3473;
			executor.intStack[++executor.intStackPtr - 1] = i_3;
		}
	}

	static final void method12583(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		method3601(icomponentdefinitions_3, executor, -1856078763);
	}

	static final void method12584(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class159.GAME_CONNECTION_INFO.worldId;
	}

	static final void method1888(CS2Executor executor) {
		executor.intStackPtr -= 5;
		Class153.method2618(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], executor.intStack[executor.intStackPtr + 4], 1275118183);
	}

	static final void method1889(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.kickRank;
	}

	static final void method5494(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (i_2 == 0) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else if (i_3 == 0) {
			executor.intStack[++executor.intStackPtr - 1] = Integer.MAX_VALUE;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = (int) Math.pow((double) i_2, 1.0D / (double) i_3);
		}
	}

	static final void checkJavaVersion(CS2Executor executor) {
		if (Class11.SYSTEM_INFO.javaRelease < 6) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else if (Class11.SYSTEM_INFO.javaRelease == 6 && Class11.SYSTEM_INFO.javaUpdate < 10) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		}
	}

	static final void method5024(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14664(icomponentdefinitions_3, interface_4, false, 2, executor, (byte) 56);
	}

	static final void method5027(CS2Executor executor) {
		executor.intStackPtr -= 2;
		Huffman.method1978(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], 255);
	}

	static final void method5029(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		method15207(icomponentdefinitions_3, executor, -304097122);
	}

	static final void method14746(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method2593(icomponentdefinitions_3, interface_4, executor, -1669147013);
	}

	static final void method8735(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_4.anInt1453;
	}

	static final void method14667(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7300;
	}

	static final void method3596(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method2593(icomponentdefinitions_3, interface_4, executor, -1741314875);
	}

	static final void method3597(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.anInt7449) {
			executor.intStack[++executor.intStackPtr - 1] = client.aClass6Array7452[i_2].anInt41;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method3599(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub13_8225, executor.intStack[--executor.intStackPtr], -334486590);
		Class190.savePreferences((byte) 97);
		client.aBool7175 = false;
	}

	static final void method855(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method3965(icomponentdefinitions_3, executor, -252931751);
	}

	static final void method856(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class291.method5130(i_2);
		if (class282_sub50_sub6_3 == null) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9542;
		}
	}

	static final void method858(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1376;
	}

	static void method5290(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).isComplete(Class158_Sub1.PLAYER_VAR_PROVIDER) ? 1 : 0;
	}

	static final void method5292(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class335.anIntArray3916[Class372.method6362(i_2, 1349115277) & 0xffff];
	}

	static final void method12802(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method4651(icomponentdefinitions_3, interface_4, executor, (byte) 56);
	}

	static final void method12803(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.fog, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0, -204242656);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -96);
		Class190.savePreferences((byte) 37);
		client.aBool7175 = false;
	}

	static final void pushInt(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.intOpValues[executor.instrPtr];
	}

	static final void method6510(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method1455(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method2914(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub44 class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.get((long) i_2);
		if (class282_sub44_3 != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method2916(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class125.method2173(2115091118);
		if (class282_sub50_sub6_3 != null) {
			boolean bool_4 = class282_sub50_sub6_3.method14778(i_2 >> 28 & 0x3, i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Runner.anIntArray5900, -1837274243);
			if (bool_4) {
				executor.intStack[++executor.intStackPtr - 1] = CS2Runner.anIntArray5900[1];
				executor.intStack[++executor.intStackPtr - 1] = CS2Runner.anIntArray5900[2];
			} else {
				executor.intStack[++executor.intStackPtr - 1] = -1;
				executor.intStack[++executor.intStackPtr - 1] = -1;
			}
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
			executor.intStack[++executor.intStackPtr - 1] = -1;
		}
	}

	static final void method13756(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class291.method5175(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
		if (class282_sub50_sub6_3 == null) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9536;
		}
	}

	static final void method15403(CS2Executor executor) {
		ParamIndexLoader.method7081((byte) -41);
	}

	static final void method798(CS2Executor executor) {
		method6018(executor.aClass521_Sub1_Sub2_Sub1_7014, executor, 1907071092);
	}

	static final void method7420(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub29_8201.method13049() ? 1 : 0;
	}

	static final void method7422(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1311;
	}

	static void method1799(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).anInt2963;
	}

	static final void pushString(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = executor.current.stringOpValues[executor.instrPtr];
	}

	static final void method1801(CS2Executor executor) {
		method11160(GraphicalRenderer.method8697(), executor);
	}

	static final void method260(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method8277(icomponentdefinitions_3, interface_4, executor, 1708366546);
	}

	static final void method261(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.animable.loadedInterfaceId;
	}

	static final void method11612(CS2Executor executor) {
		executor.intStackPtr -= 3;
		Huffman.method1978(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2]);
	}

	static final void method11613(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7349 != -1) {
			if (i_2 == 0) {
				executor.intStack[++executor.intStackPtr - 1] = client.anInt7349;
				return;
			}
			--i_2;
		}
		Class282_Sub44 class282_sub44_3;
		for (class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.method7750(-1846591050); i_2-- > 0; class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.method7751((byte) 5)) {
			;
		}
		executor.intStack[++executor.intStackPtr - 1] = class282_sub44_3.anInt8063;
	}

	static final void method4310(CS2Executor executor) {
		boolean bool_2 = executor.intStack[--executor.intStackPtr] != 0;
		if (VertexNormal.myPlayer.playerAppearance != null) {
			VertexNormal.myPlayer.playerAppearance.method4003(bool_2);
		}
	}

	static final void method4311(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method7555(icomponentdefinitions_3, interface_4, executor, (byte) -54);
	}

	static final void method4312(CS2Executor executor) {
		if (client.rights >= 2) {
			executor.intStack[++executor.intStackPtr - 1] = client.rights;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static void method4314(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).method4103(Class158_Sub1.PLAYER_VAR_PROVIDER, executor.intStack[executor.intStackPtr - 1]) ? 1 : 0;
		--executor.intStackPtr;
	}

	static final void method4315(CS2Executor executor) {
		Class283.anInt3384 = 0;
	}

	static final void method13359(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		boolean bool_3 = Class308.aclient3620.method4658(new File(string_2));
		executor.intStack[++executor.intStackPtr - 1] = bool_3 ? 1 : 0;
	}

	static final void method4973(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aShort7394;
		executor.intStack[++executor.intStackPtr - 1] = client.aShort7324;
	}

	static final void method5454(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6689(icomponentdefinitions_3, interface_4, executor, -1325522232);
	}

	static final void method5456(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = Class182.method3044(string_2);
	}

	static final void hookMouseEnter(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6289(icomponentdefinitions_3, interface_4, executor, (byte) -46);
	}

	static final void method1492(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method774(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1967(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		method14680(icomponentdefinitions_3, executor, -493402778);
	}

	static final void method1968(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub29_8201.method7785(i_2, -225955104);
	}

	static final void method5362(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.method1198(i_2, i_3, i_4);
	}

	static final void method8205(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7271 - client.anInt7270;
	}

	static final void method8206(CS2Executor executor) {
		executor.intStackPtr -= 12;
		Class316.method5594();
		CutsceneAction.method1607((byte) 35);
		Class282_Sub20_Sub9.anInt9792 = executor.intStack[executor.intStackPtr];
		Class301.anInt3556 = executor.intStack[executor.intStackPtr + 1];
		Class20.anInt188 = executor.intStack[executor.intStackPtr + 2];
		Class182.anInt2262 = executor.intStack[executor.intStackPtr + 3];
		ConnectionInfo.anInt5438 = executor.intStack[executor.intStackPtr + 4];
		Class373.anInt4350 = executor.intStack[executor.intStackPtr + 5];
		Class254.anInt3145 = executor.intStack[executor.intStackPtr + 6];
		Class446.anInt5396 = executor.intStack[executor.intStackPtr + 7];
		Class17.anInt148 = executor.intStack[executor.intStackPtr + 8];
		Class388.anInt4722 = executor.intStack[executor.intStackPtr + 9];
		Class99.anInt1005 = executor.intStack[executor.intStackPtr + 10];
		QuestIndexLoader.anInt2982 = executor.intStack[executor.intStackPtr + 11];
		IndexLoaders.SPRITES_INDEX.loadFile(ConnectionInfo.anInt5438);
		IndexLoaders.SPRITES_INDEX.loadFile(Class373.anInt4350);
		IndexLoaders.SPRITES_INDEX.loadFile(Class254.anInt3145);
		IndexLoaders.SPRITES_INDEX.loadFile(Class446.anInt5396);
		IndexLoaders.SPRITES_INDEX.loadFile(Class17.anInt148);
		IndexLoaders.SPRITES_INDEX.loadFile(QuestIndexLoader.anInt2982);
		IndexLoaders.FONT_METRICS_INDEX.loadFile(QuestIndexLoader.anInt2982);
		Class354.aClass160_4110 = null;
		Class149_Sub2.aClass160_9315 = null;
		Class125.aClass160_1571 = null;
		Class60.aClass160_612 = null;
		ClanSettings.aClass160_647 = null;
		Class467.aClass160_5576 = null;
		HitbarIndexLoader.aClass160_3452 = null;
		ParamDefinitions.aClass160_5339 = null;
		Class20.aBool187 = true;
	}

	static final void method3250(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method501(icomponentdefinitions_3, interface_4, executor, (byte) -2);
	}

	static final void method8865(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		QuickchatMessageDefinitions quickchatdefinitions_3 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2);
		if (quickchatdefinitions_3.responses == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = quickchatdefinitions_3.responses.length;
		}
	}

	static final void method8869(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class121.anInt1526;
	}

	static final void method8870(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.aString7426 != null && i_2 < Class459.anInt5534) {
			executor.stringStack[++executor.stringStackPtr - 1] = Class467.aClass173Array5575[i_2].aString2129;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method12915(CS2Executor executor) {
		NPC npc_2 = (NPC) executor.animable;
		String string_3 = npc_2.aString10584;
		NPCDefinitions npcdefinitions_4 = npc_2.definitions;
		if (npcdefinitions_4.transformTo != null) {
			npcdefinitions_4 = npcdefinitions_4.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER);
			if (npcdefinitions_4 == null) {
				string_3 = "";
			} else {
				string_3 = npcdefinitions_4.name;
			}
		}
		if (string_3 == null) {
			string_3 = "";
		}
		executor.stringStack[++executor.stringStackPtr - 1] = string_3;
	}

	static final void method7826(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).messageHotkeys[i_3];
	}

	static final void method12352(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class464.aBool5556 ? 1 : 0;
	}

	static final void method13446(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = ~i_2;
	}

	static final void method5000(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method5009(icomponentdefinitions_3, interface_4, executor, -1863768075);
	}

	static final void method5002(CS2Executor executor) {
		method1573(executor);
	}

	static final void method5003(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = i_2 & 0x3fff;
	}

	static final void method5004(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6690(icomponentdefinitions_3, interface_4, executor, (byte) 92);
	}

	static final void method15075(CS2Executor executor) {
		Class404.method6811(executor.intStack[--executor.intStackPtr]);
	}

	static final void method16095(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method4772(icomponentdefinitions_3, interface_4, executor, (byte) 12);
	}

	static final void method14434(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		Class533.method11404((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], "", executor.intStack[--executor.intStackPtr] == 1, false);
	}

	static final void setCompText(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method2732(icomponentdefinitions_3, interface_4, executor, 2144367938);
	}

	static final void method6226(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (i_2 > 700 || i_3 > 700) {
			executor.intStack[++executor.intStackPtr - 1] = 256;
		}
		double d_4 = (Math.random() * (double) (i_3 + i_2) - (double) i_2 + 800.0D) / 100.0D;
		executor.intStack[++executor.intStackPtr - 1] = (int) (Math.pow(2.0D, d_4) + 0.5D);
	}

	static final void method7961(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method3366(icomponentdefinitions_3, interface_4, executor, (byte) -87);
	}

	static final void method7962(CS2Executor executor) {
		if (client.aBool7310) {
			Class361.aClass361_4175.method6257(187369662);
		}
	}

	static final void method6242(CS2Executor executor) {
		executor.intStackPtr -= 5;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		int i_6 = executor.intStack[executor.intStackPtr + 4];
		if (i_4 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_7 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_4);
			if (i_3 != enumdefinitions_7.aChar5146) {
				throw new RuntimeException();
			} else if (i_2 != enumdefinitions_7.aChar5140) {
				throw new RuntimeException();
			} else {
				int[] ints_8 = enumdefinitions_7.method7251(Integer.valueOf(i_5), 2099453599);
				if (i_6 >= 0 && ints_8 != null && ints_8.length > i_6) {
					executor.intStack[++executor.intStackPtr - 1] = ints_8[i_6];
				} else {
					throw new RuntimeException();
				}
			}
		}
	}

	static final void method6243(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		if (VertexNormal.myPlayer.playerAppearance != null && VertexNormal.myPlayer.playerAppearance.aBool2929) {
			executor.stringStack[++executor.stringStackPtr - 1] = string_3;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = string_2;
		}
	}

	static final void method1882(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 & -1 - (1 << i_3);
	}

	static final void method1462(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class16.method567(string_2, true, (byte) -67);
	}

	static final void method1463(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub7_8210.method12666(2085478304);
	}

	static final void method14647(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8223, executor.intStack[--executor.intStackPtr], -939446296);
		ParticleProducer.method11500(Class393.preferences.currentToolkit.getValue(-1329116825), false);
		Class190.savePreferences((byte) 38);
	}

	static final void method14649(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub1_8197.method7785(i_2, 364907736);
	}

	static final void method5082(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		InterfaceWithDefs underlaydefinition_4 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		Class282_Sub14.method12221(underlaydefinition_4.aClass118_5886, i_2, i_3, 1550850781);
	}

	static final void method7186(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7315;
	}

	static final void method7187(CS2Executor executor) {
	}

	static final void method3739(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.anInt7449) {
			executor.intStack[++executor.intStackPtr - 1] = client.aClass6Array7452[i_2].aBool38 ? 1 : 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method3740(CS2Executor executor) {
		NPC npc_2 = (NPC) executor.animable;
		NPCDefinitions npcdefinitions_3 = npc_2.definitions;
		if (npcdefinitions_3.transformTo != null) {
			npcdefinitions_3 = npcdefinitions_3.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER);
		}
		executor.intStack[++executor.intStackPtr - 1] = npcdefinitions_3 != null ? 1 : 0;
	}

	static final void method3743(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7325 ? 1 : 0;
	}

	static final void intGreaterThan(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr] > executor.intStack[executor.intStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method16089(CS2Executor executor) {
		executor.intStackPtr -= 2;
		ItemContainerDefinitions inventorydef_2 = IndexLoaders.INVENTORY_LOADER.getInventoryDef(executor.intStack[executor.intStackPtr], (short) 24055);
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = -1;
		for (int i_5 = 0; i_5 < inventorydef_2.contentSize; i_5++) {
			if (i_3 == inventorydef_2.itemIds[i_5]) {
				i_4 = inventorydef_2.amounts[i_5];
				break;
			}
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static final void method6040(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method12630(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6041(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = client.method11633(icomponentdefinitions_3).getUseOptionFlags();
	}

	static final void method6042(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = ((Class521_Sub1) executor.anInterface12_7013).method12997();
	}

	static final void method6043(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6453(icomponentdefinitions_3, interface_4, executor, -258126680);
	}

	static final void method6044(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7310 ? 1 : 0;
	}

	static final void method6046(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = KeyHoldInputSubscriber.anInt2879;
	}

	static final void method12718(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub13_8193, executor.intStack[--executor.intStackPtr], -1898562251);
		Class190.savePreferences((byte) 49);
		client.aBool7175 = false;
	}

	static final void method12719(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method14664(icomponentdefinitions_4, interface_5, false, 0, executor, (byte) -113);
	}

	static final void method8285(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6289(icomponentdefinitions_3, interface_4, executor, (byte) 30);
	}

	static final void method8295(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14664(icomponentdefinitions_3, interface_4, true, 0, executor, (byte) -3);
	}

	static final void method8296(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		BufferedConnectionContext class184_3 = Class468_Sub20.method12807(-625511967);
		TCPPacket tcpmessage_4 = Class271.createPacket(OutgoingPacket.SEND_FRIENDS_QUICKCHAT, class184_3.isaac);
		tcpmessage_4.buffer.writeByte(0);
		int i_5 = tcpmessage_4.buffer.index;
		tcpmessage_4.buffer.writeString(string_2);
		tcpmessage_4.buffer.writeShort(executor.aClass346_7009.anInt4048);
		executor.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_4.buffer, executor.aClass346_7009.anIntArray4046, -1485943767);
		tcpmessage_4.buffer.method13061(tcpmessage_4.buffer.index - i_5, 460016164);
		class184_3.queuePacket(tcpmessage_4);
	}

	static final void method8297(CS2Executor executor) {
		if (Class96_Sub21.keyRecorder.held(81)) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method8298(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method15474(icomponentdefinitions_4, interface_5, executor, (byte) 66);
	}

	static void method868(CS2Executor executor) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.anIntArray2961 == null ? 0 : questdefinitions_2.anIntArray2961.length;
	}

	static final void method870(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs(i_4);
		Class282_Sub14.method12221(icomponentdefinitions_5, i_2, i_3, 1698123949);
	}

	static final void addInt(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 + i_3;
	}

	static final void method15417(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class6.method304();
	}

	static final void method4381(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method12401(icomponentdefinitions_4, interface_5, executor, 1213503004);
	}

	static final void method14818(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.NATIVE_LIBRARY_LOADER.method4639() ? 1 : 0;
	}

	static final void method14833(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = TilestreamPacket.anInt4219;
	}

	static final void method14835(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2);
		String str_4 = "";
		if (chatline_3 != null && chatline_3.name != null) {
			str_4 = chatline_3.name;
		}
		executor.stringStack[++executor.stringStackPtr - 1] = str_4;
	}

	static final void method14836(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		boolean bool_3 = executor.intStack[executor.intStackPtr + 1] == 1;
		if (Class291_Sub1.aClass465_8025 != null) {
			Node node_4 = Class291_Sub1.aClass465_8025.get((long) i_2);
			if (node_4 != null && !bool_3) {
				node_4.remove();
			} else if (node_4 == null && bool_3) {
				node_4 = new Node();
				Class291_Sub1.aClass465_8025.put(node_4, (long) i_2);
			}
		}
	}

	static final void method14839(CS2Executor executor) {
		if (client.aBool7310) {
			Class361.aClass361_4177.method6257(1901306878);
		}
	}

	static void method14841(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).method4111(client.anIntArray7337, executor.intStack[executor.intStackPtr - 1]) ? 1 : 0;
		--executor.intStackPtr;
	}

	static final void method6677(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = executor.aClass282_Sub4_7011.players[i_2].rank;
	}

	static final void method6678(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 < 0 || i_2 > 5) {
			i_2 = 2;
		}
		ParticleProducer.method11500(i_2, false);
	}

	static final void method6680(CS2Executor executor) {
		if (client.aString7426 != null) {
			executor.intStack[++executor.intStackPtr - 1] = Class459.anInt5534;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method6685(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method502(icomponentdefinitions_3, interface_4, executor, 577432492);
	}

	static final void method12839(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method505(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method12841(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.GRAND_EXCHANGE_ITEM_SELECT, client.outputContext.isaac);
		tcpmessage_3.buffer.writeShort(i_2);
		client.outputContext.queuePacket(tcpmessage_3);
	}

	static final void method456(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.cycles;
	}

	static final void method457(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub23_8202, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0, 2089937040);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -3);
		Class190.savePreferences((byte) 89);
		client.aBool7175 = false;
	}

	static final void method459(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method1852(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method460(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method8310(icomponentdefinitions_3, interface_4, executor, (byte) -108);
	}

	static final void method5774(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method501(icomponentdefinitions_3, interface_4, executor, (byte) 22);
	}

	static final void method5775(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method6288(icomponentdefinitions_3, interface_4, executor, (short) 27570);
	}

	static final void method5776(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		if (i_2 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_4 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2);
			if (enumdefinitions_4.aChar5140 != 115) {
				throw new RuntimeException();
			} else {
				executor.intStack[++executor.intStackPtr - 1] = enumdefinitions_4.method7228(string_3, (byte) -23) ? 1 : 0;
			}
		}
	}

	static final void method14669(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = JS5CacheFile.method3360((byte) -103) ? 1 : 0;
	}

	static final void method2584(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		SpotAnimIndexLoader.method8862(i_2, i_3 >> 14 & 0x3fff, i_3 & 0x3fff, false);
	}

	static final void method6913(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		if (client.rights != 0 || (!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
			BufferedConnectionContext class184_4 = Class468_Sub20.method12807(65699692);
			TCPPacket tcpmessage_5 = Class271.createPacket(OutgoingPacket.SEND_FRIENDS_CHAT_MESSAGE, class184_4.isaac);
			tcpmessage_5.buffer.writeShort(0);
			int i_6 = tcpmessage_5.buffer.index;
			tcpmessage_5.buffer.writeString(string_2);
			MapSpriteIndexLoader.method7189(tcpmessage_5.buffer, string_3, -1045149130);
			tcpmessage_5.buffer.method13281(tcpmessage_5.buffer.index - i_6);
			class184_4.queuePacket(tcpmessage_5);
		}
	}

	static final void method6916(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = VertexNormal.myPlayer.anInt10565;
	}

	static final void loadClanVarLong(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		Long long_3 = (Long) Class46.CLAN_VARS[i_2];
		if (long_3 == null) {
			executor.longStack[++executor.longStackPtr - 1] = -1L;
		} else {
			executor.longStack[++executor.longStackPtr - 1] = long_3.longValue();
		}
	}

	static final void method3748(CS2Executor executor) {
		if (client.aString7165 != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = client.aString7165;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void popInt(CS2Executor executor) {
		--executor.intStackPtr;
	}

	static final void method3750(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.idleAnimations, executor.intStack[--executor.intStackPtr], 1688733645);
		Class190.savePreferences((byte) 79);
	}

	static final void getSystemUpdateTimer(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7178;
	}

	static final void method911(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		int i_4;
		if (itemdefinitions_3.hasTooltipColor) {
			i_4 = itemdefinitions_3.tooltipColor;
		} else if (itemdefinitions_3.membersOnly) {
			i_4 = Class149_Sub2.DEFAULTS_LOADER_7.membersTooltipColor;
		} else {
			i_4 = Class149_Sub2.DEFAULTS_LOADER_7.f2pTooltipColor;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static final void method536(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		String string_5 = (String) executor.stringStack[--executor.stringStackPtr];
		if (i_3 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_6 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_3);
			if (i_2 != enumdefinitions_6.aChar5146) {
				throw new RuntimeException();
			} else if (enumdefinitions_6.aChar5140 != 115) {
				throw new RuntimeException();
			} else {
				int[] ints_7 = enumdefinitions_6.method7251(string_5, 1800176062);
				if (i_4 >= 0 && ints_7 != null && ints_7.length > i_4) {
					executor.intStack[++executor.intStackPtr - 1] = ints_7[i_4];
				} else {
					throw new RuntimeException();
				}
			}
		}
	}

	static final void method7427(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = i_2 >> 28;
	}

	static final void method1167(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method403(icomponentdefinitions_3, interface_4, executor, 2136495218);
	}

	static final void method1171(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.banCount;
	}

	static final void method1173(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7422;
	}

	static final void method401(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		method3251(icomponentdefinitions_3, executor, 1310130121);
	}

	static final void method12210(CS2Executor executor) {
		executor.stringStackPtr -= 3;
		Class533.method11404((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], (String) executor.stringStack[executor.stringStackPtr + 2], executor.intStack[--executor.intStackPtr] == 1, true);
	}

	static final void method7500(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.idleAnimations, executor.intStack[--executor.intStackPtr], -1848816059);
		Class190.savePreferences((byte) 103);
		client.aBool7175 = false;
	}

	static final void method7501(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_4 = Class271.createPacket(OutgoingPacket.aClass379_4558, client.connectionContext.isaac);
		tcpmessage_4.buffer.writeShort(ChatLine.getLength(string_2) + ChatLine.getLength(string_3));
		tcpmessage_4.buffer.writeString(string_2);
		tcpmessage_4.buffer.writeString(string_3);
		client.connectionContext.queuePacket(tcpmessage_4);
	}

	static final void method7502(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_4.text;
	}

	static final void method3949(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6697(icomponentdefinitions_3, interface_4, executor, 1042468011);
	}

	static final void method3950(CS2Executor executor) {
		Class283.anInt3384 = 0;
	}

	static final void method3951(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Character.toLowerCase((char) i_2);
	}

	static final void method5511(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method2874(icomponentdefinitions_3, interface_4, executor, (byte) 3);
	}

	static final void method5512(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		method14605(icomponentdefinitions_3, executor, (byte) -77);
	}

	static final void method4960(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method2915(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method4961(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14664(icomponentdefinitions_3, interface_4, true, 2, executor, (byte) 71);
	}

	static final void method4962(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14664(icomponentdefinitions_3, interface_4, false, 1, executor, (byte) 28);
	}

	static final void method1569(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method4280(icomponentdefinitions_3, interface_4, executor, (byte) 60);
	}

	static final void method1570(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method14664(icomponentdefinitions_3, interface_4, true, 1, executor, (byte) -4);
	}

	static final void method1571(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteRoll;
	}

	static final void method1572(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.textures.method7785(i_2, -398594048);
	}

	static final void method1573(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		Class282_Sub44 class282_sub44_4 = (Class282_Sub44) client.aClass465_7442.get((long) i_2);
		if (class282_sub44_4 != null && i_3 == class282_sub44_4.anInt8063) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method1574(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub14_8211.method12727() ? 1 : 0;
	}

	static final void method12723(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1423;
	}

	static final void method12724(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		if (itemdefinitions_3.certTemplateId >= 0 && itemdefinitions_3.certId >= 0) {
			executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_3.certId;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = i_2;
		}
	}

	static final void method1162(CS2Executor executor) {
		executor.intStackPtr -= 4;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		CoordGrid coordgrid_6 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
		Class11.method469((i_2 >> 14 & 0x3fff) - coordgrid_6.x, (i_2 & 0x3fff) - coordgrid_6.y, i_3 << 2, i_4, i_5, (byte) -62);
	}

	static final void method11154(CS2Executor executor) {
		executor.aClass346_7009 = new Class346();
		executor.aClass346_7009.anInt4048 = executor.intStack[--executor.intStackPtr];
		executor.aClass346_7009.aClass282_Sub50_Sub9_4047 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(executor.aClass346_7009.anInt4048);
		executor.aClass346_7009.anIntArray4046 = new int[executor.aClass346_7009.aClass282_Sub50_Sub9_4047.method14916(388398854)];
	}

	static final void method1979(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = executor.aClass282_Sub4_7011.players[i_2].name;
	}

	static final void method7744(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt94;
	}

	static final void method14244(CS2Executor executor) {
		int i_2 = Class363.anInt4203;
		int i_3 = Engine.anInt3249;
		int i_4 = -1;
		if (Class475.supportsFullScreen) {
			Class467[] arr_5 = ClanVarDefinitions.method6825((byte) 55);
			for (int i_6 = 0; i_6 < arr_5.length; i_6++) {
				Class467 class467_7 = arr_5[i_6];
				if (i_2 == class467_7.anInt5571 && i_3 == class467_7.anInt5574) {
					i_4 = i_6;
					break;
				}
			}
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static final void method11380(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method7667(icomponentdefinitions_3, interface_4, executor, 1560441308);
	}

	static final void method4825(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = SpotAnimIndexLoader.getItemIdAtSlot(i_2, i_3, true, 113694446);
	}

	static final void method4826(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt112;
	}

	static final void method4829(CS2Executor executor) {
		if (client.anInt7434 == 0) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = client.anInt7373;
		}
	}

	static final void method4830(CS2Executor executor) {
		IComponentDefinitions icomponentdefinitions_2 = executor.animable.inter.getComponent(executor.intStack[--executor.intStackPtr]);
		icomponentdefinitions_2.aClass118Array1438 = null;
		icomponentdefinitions_2.aClass118Array1439 = null;
		Class109.redrawComponent(icomponentdefinitions_2, (byte) -73);
	}

	static void method7461(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).aBool2962 ? 1 : 0;
	}

	static final void method7462(CS2Executor executor) {
		String string_2 = null;
		if (Class119.HOSTNAME_IDENTIFIER != null) {
			string_2 = Class119.HOSTNAME_IDENTIFIER.getHostName();
		}
		if (string_2 == null) {
			string_2 = "";
		}
		executor.stringStack[++executor.stringStackPtr - 1] = string_2;
	}

	static final void method7463(CS2Executor executor) {
		executor.intStackPtr -= 5;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		int i_6 = executor.intStack[executor.intStackPtr + 4];
		executor.intStack[++executor.intStackPtr - 1] = i_2 + (i_6 - i_4) * (i_3 - i_2) / (i_5 - i_4);
	}

	static final void method1860(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (client.rights != 0 || (!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
			String string_3 = string_2.toLowerCase();
			byte b_4 = 0;
			if (string_3.startsWith(Message.aClass433_5310.translate(Language.aClass495_5795, -2011565304))) {
				b_4 = 0;
				string_2 = string_2.substring(Message.aClass433_5310.translate(Language.aClass495_5795, -1474574192).length());
			} else if (string_3.startsWith(Message.aClass433_5224.translate(Language.aClass495_5795, -1018725645))) {
				b_4 = 1;
				string_2 = string_2.substring(Message.aClass433_5224.translate(Language.aClass495_5795, -728158667).length());
			} else if (string_3.startsWith(Message.aClass433_5312.translate(Language.aClass495_5795, -421866122))) {
				b_4 = 2;
				string_2 = string_2.substring(Message.aClass433_5312.translate(Language.aClass495_5795, -1190421734).length());
			} else if (string_3.startsWith(Message.aClass433_5313.translate(Language.aClass495_5795, -1865274206))) {
				b_4 = 3;
				string_2 = string_2.substring(Message.aClass433_5313.translate(Language.aClass495_5795, -885173587).length());
			} else if (string_3.startsWith(Message.aClass433_5314.translate(Language.aClass495_5795, -915262147))) {
				b_4 = 4;
				string_2 = string_2.substring(Message.aClass433_5314.translate(Language.aClass495_5795, -588425222).length());
			} else if (string_3.startsWith(Message.aClass433_5221.translate(Language.aClass495_5795, -741938249))) {
				b_4 = 5;
				string_2 = string_2.substring(Message.aClass433_5221.translate(Language.aClass495_5795, -1332685832).length());
			} else if (string_3.startsWith(Message.aClass433_5194.translate(Language.aClass495_5795, -893060110))) {
				b_4 = 6;
				string_2 = string_2.substring(Message.aClass433_5194.translate(Language.aClass495_5795, -1212621971).length());
			} else if (string_3.startsWith(Message.aClass433_5317.translate(Language.aClass495_5795, -2087693192))) {
				b_4 = 7;
				string_2 = string_2.substring(Message.aClass433_5317.translate(Language.aClass495_5795, -1840274123).length());
			} else if (string_3.startsWith(Message.aClass433_5318.translate(Language.aClass495_5795, -1925786826))) {
				b_4 = 8;
				string_2 = string_2.substring(Message.aClass433_5318.translate(Language.aClass495_5795, -605242854).length());
			} else if (string_3.startsWith(Message.aClass433_5319.translate(Language.aClass495_5795, -685127730))) {
				b_4 = 9;
				string_2 = string_2.substring(Message.aClass433_5319.translate(Language.aClass495_5795, -1671757341).length());
			} else if (string_3.startsWith(Message.aClass433_5320.translate(Language.aClass495_5795, -2082715119))) {
				b_4 = 10;
				string_2 = string_2.substring(Message.aClass433_5320.translate(Language.aClass495_5795, -893838603).length());
			} else if (string_3.startsWith(Message.aClass433_5199.translate(Language.aClass495_5795, -1011038702))) {
				b_4 = 11;
				string_2 = string_2.substring(Message.aClass433_5199.translate(Language.aClass495_5795, -705460695).length());
			} else if (Class223.CURRENT_LANGUAGE != Language.aClass495_5795) {
				if (string_3.startsWith(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE, -1967698860))) {
					b_4 = 0;
					string_2 = string_2.substring(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE, -931333964).length());
				} else if (string_3.startsWith(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE, -1211635984))) {
					b_4 = 1;
					string_2 = string_2.substring(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE, -1312881079).length());
				} else if (string_3.startsWith(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE, -392031535))) {
					b_4 = 2;
					string_2 = string_2.substring(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE, -243965545).length());
				} else if (string_3.startsWith(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE, -366331193))) {
					b_4 = 3;
					string_2 = string_2.substring(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE, -564963965).length());
				} else if (string_3.startsWith(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE, -2131562051))) {
					b_4 = 4;
					string_2 = string_2.substring(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE, -1233253928).length());
				} else if (string_3.startsWith(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE, -1423052187))) {
					b_4 = 5;
					string_2 = string_2.substring(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE, -2041202369).length());
				} else if (string_3.startsWith(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE, -1085733103))) {
					b_4 = 6;
					string_2 = string_2.substring(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE, -840616776).length());
				} else if (string_3.startsWith(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE, -1915496954))) {
					b_4 = 7;
					string_2 = string_2.substring(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE, -1395321722).length());
				} else if (string_3.startsWith(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE, -257492430))) {
					b_4 = 8;
					string_2 = string_2.substring(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE, -686511373).length());
				} else if (string_3.startsWith(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE, -1394465272))) {
					b_4 = 9;
					string_2 = string_2.substring(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE, -1753131121).length());
				} else if (string_3.startsWith(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE, -654352038))) {
					b_4 = 10;
					string_2 = string_2.substring(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE, -235801765).length());
				} else if (string_3.startsWith(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE, -2110850814))) {
					b_4 = 11;
					string_2 = string_2.substring(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE, -1600723987).length());
				}
			}
			string_3 = string_2.toLowerCase();
			byte b_5 = 0;
			if (string_3.startsWith(Message.aClass433_5292.translate(Language.aClass495_5795, -305628261))) {
				b_5 = 1;
				string_2 = string_2.substring(Message.aClass433_5292.translate(Language.aClass495_5795, -834692667).length());
			} else if (string_3.startsWith(Message.aClass433_5323.translate(Language.aClass495_5795, -242214370))) {
				b_5 = 2;
				string_2 = string_2.substring(Message.aClass433_5323.translate(Language.aClass495_5795, -2038369408).length());
			} else if (string_3.startsWith(Message.aClass433_5324.translate(Language.aClass495_5795, -1649524008))) {
				b_5 = 3;
				string_2 = string_2.substring(Message.aClass433_5324.translate(Language.aClass495_5795, -1763068646).length());
			} else if (string_3.startsWith(Message.aClass433_5325.translate(Language.aClass495_5795, -870525017))) {
				b_5 = 4;
				string_2 = string_2.substring(Message.aClass433_5325.translate(Language.aClass495_5795, -2012994574).length());
			} else if (string_3.startsWith(Message.aClass433_5326.translate(Language.aClass495_5795, -663048228))) {
				b_5 = 5;
				string_2 = string_2.substring(Message.aClass433_5326.translate(Language.aClass495_5795, -242529694).length());
			} else if (Language.aClass495_5795 != Class223.CURRENT_LANGUAGE) {
				if (string_3.startsWith(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE, -1825511899))) {
					b_5 = 1;
					string_2 = string_2.substring(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE, -600018624).length());
				} else if (string_3.startsWith(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE, -1604558277))) {
					b_5 = 2;
					string_2 = string_2.substring(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE, -1592623584).length());
				} else if (string_3.startsWith(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE, -270607277))) {
					b_5 = 3;
					string_2 = string_2.substring(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE, -1627000504).length());
				} else if (string_3.startsWith(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE, -370181299))) {
					b_5 = 4;
					string_2 = string_2.substring(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE, -1502824305).length());
				} else if (string_3.startsWith(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE, -741710586))) {
					b_5 = 5;
					string_2 = string_2.substring(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE, -1032612070).length());
				}
			}
			BufferedConnectionContext class184_6 = Class468_Sub20.method12807(-1317872697);
			TCPPacket tcpmessage_7 = Class271.createPacket(OutgoingPacket.CHAT, class184_6.isaac);
			tcpmessage_7.buffer.writeByte(0);
			int i_8 = tcpmessage_7.buffer.index;
			tcpmessage_7.buffer.writeByte(b_4);
			tcpmessage_7.buffer.writeByte(b_5);
			MapSpriteIndexLoader.method7189(tcpmessage_7.buffer, string_2, 151728977);
			tcpmessage_7.buffer.method13061(tcpmessage_7.buffer.index - i_8, -918882679);
			class184_6.queuePacket(tcpmessage_7);
		}
	}

	static final void method1861(CS2Executor executor) {
		executor.intStackPtr -= 2;
		Class455.aShortArray5452[executor.intStack[executor.intStackPtr]] = (short) Class5.method294(executor.intStack[executor.intStackPtr + 1], (byte) -4);
		IndexLoaders.ITEM_LOADER.method7152();
		IndexLoaders.ITEM_LOADER.method7151((byte) -24);
		IndexLoaders.NPC_INDEX_LOADER.method6831();
		IncomingPacket.method6378();
	}

	static final void method1862(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub23_8202.method12899() ? 1 : 0;
	}

	static final void method1835(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (VertexNormal.myPlayer.playerAppearance != null) {
			VertexNormal.myPlayer.playerAppearance.method4029(i_2, i_3);
		}
	}

	static final void method1836(CS2Executor executor) {
		executor.intStackPtr -= 2;
		Class329_Sub1.method12491(VertexNormal.myPlayer, executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1]);
	}

	static final void method1837(CS2Executor executor) {
		Class514.method8841(1236129433);
	}

	static final void method7551(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) (TextureDetails.time() / 60000L);
	}

	static final void method7552(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub7_8210.method12665() ? 1 : 0;
	}

	static final void method16124(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (string_2.startsWith(Class76.getCrown(0)) || string_2.startsWith(Class76.getCrown(1))) {
			string_2 = string_2.substring(7);
		}
		executor.intStack[++executor.intStackPtr - 1] = Class280.method4975(string_2, (byte) -104) ? 1 : 0;
	}

	static final void method3561(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method2170(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3562(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(3, i_2 << 16 | i_3, i_4, "", (byte) 66);
	}

	static final void method15406(CS2Executor executor) {
		boolean bool_2 = true;
		if (client.aBool7310) {
			try {
				Object object_3 = Class361.aClass361_4169.method6255();
				if (object_3 != null) {
					bool_2 = ((Boolean) object_3).booleanValue();
				}
			} catch (Throwable throwable_4) {
				;
			}
		}
		executor.intStack[++executor.intStackPtr - 1] = bool_2 ? 1 : 0;
	}

	static final void method15407(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.fog.method7785(i_2, -723558345);
	}

	static final void method15408(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		RenderAnimDefs renderanimdefs_3 = IndexLoaders.RENDER_ANIM_LOADER.getRenderAnimDefs(i_2, (byte) 12);
		if (renderanimdefs_3.anIntArray2814 != null && renderanimdefs_3.anIntArray2814.length > 0) {
			int i_4 = 0;
			int i_5 = renderanimdefs_3.standAnimations[0];
			for (int i_6 = 1; i_6 < renderanimdefs_3.anIntArray2814.length; i_6++) {
				if (renderanimdefs_3.standAnimations[i_6] > i_5) {
					i_4 = i_6;
					i_5 = renderanimdefs_3.standAnimations[i_6];
				}
			}
			executor.intStack[++executor.intStackPtr - 1] = renderanimdefs_3.anIntArray2814[i_4];
		} else {
			executor.intStack[++executor.intStackPtr - 1] = renderanimdefs_3.standAnimation;
		}
	}

	static final void method12115(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = NativeLibraryLoader.anInt3240 == 2 ? 1 : 0;
	}

	static final void method12116(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method15511(icomponentdefinitions_3, interface_4, executor, (byte) 63);
	}

	static final void method12118(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method4149(icomponentdefinitions_3, interface_4, executor, -799762783);
	}

	static final void method296(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (i_2 >= 0 && i_2 < 2) {
			client.anIntArrayArrayArray7302[i_2] = new int[i_3 << 1][4];
		}
	}

	static final void popLong(CS2Executor executor) {
		--executor.longStackPtr;
	}

	static final void method6150(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.aClass513_6994;
		} else {
			underlaydefinition_2 = executor.aClass513_7007;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		method6045(icomponentdefinitions_4, interface_5, executor, (byte) -37);
	}

	static final void method6151(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1428;
	}

	static final void method6152(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class344.method6119(string_2);
	}

	static final void method6153(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub29_8201.method13050();
	}

	static final void method13467(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = RegionMap.anInt3644;
	}

	static final void getVarpbitOld(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = ((Player) executor.animable).aClass155_10561.method2627(i_2);
	}

	static final void method4987(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = string_2 + i_3;
	}

	static final void method4988(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class291.method5130(i_2);
		if (class282_sub50_sub6_3 == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9540 - class282_sub50_sub6_3.anInt9539;
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9535 - class282_sub50_sub6_3.anInt9541;
		}
	}

	static final void method4989(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub2_8205.method12622() ? 1 : 0;
	}

	static final void method7043(CS2Executor executor) {
		Class282_Sub50_Sub6 class282_sub50_sub6_2 = Class125.method2173(1468656099);
		if (class282_sub50_sub6_2 != null) {
			boolean bool_3 = class282_sub50_sub6_2.method14775(Class291.anInt3472 + MapSpriteIndexLoader.anInt5123, Class291.anInt3473 + Class475.anInt5624, CS2Runner.anIntArray5900, -1687346032);
			if (bool_3) {
				executor.intStack[++executor.intStackPtr - 1] = CS2Runner.anIntArray5900[1];
				executor.intStack[++executor.intStackPtr - 1] = CS2Runner.anIntArray5900[2];
			} else {
				executor.intStack[++executor.intStackPtr - 1] = -1;
				executor.intStack[++executor.intStackPtr - 1] = -1;
			}
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
			executor.intStack[++executor.intStackPtr - 1] = -1;
		}
	}

	static final void method4797(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method2874(icomponentdefinitions_3, interface_4, executor, (byte) 11);
	}

	static final void method4798(CS2Executor executor) {
		ClanChannel.method12114(executor.intStack[--executor.intStackPtr]);
	}

	static final void method4801(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method15256(icomponentdefinitions_3, interface_4, executor, -158517117);
	}

	static final void method4802(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1288;
	}

	static final void method11338(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6158(icomponentdefinitions_3, interface_4, executor, -1706086119);
	}

	static final void method11339(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class291_Sub1.aBool8027 ? 1 : 0;
	}

	static final void method11340(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		Class96_Sub10.method14603(7, i_2 << 16 | i_3, i_4, "", (byte) 94);
	}

	static final void method11341(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub23_8202.method7785(i_2, -2039814723);
	}

	static final void method11370(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.anInt7449) {
			executor.intStack[++executor.intStackPtr - 1] = client.aClass6Array7452[i_2].anInt44;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method11371(CS2Executor executor) {
		executor.intStackPtr -= 3;
		client.anInt7416 = executor.intStack[executor.intStackPtr];
		Class149_Sub2.FRIEND_STATUS = Class246.getFriendStatus(executor.intStack[executor.intStackPtr + 1]);
		if (Class149_Sub2.FRIEND_STATUS == null) {
			Class149_Sub2.FRIEND_STATUS = FriendStatus.FRIENDS_ONLY;
		}
		client.anInt7422 = executor.intStack[executor.intStackPtr + 2];
		BufferedConnectionContext class184_2 = Class468_Sub20.method12807(-405485002);
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.UPDATE_FRIEND_STATUS, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(client.anInt7416);
		tcpmessage_3.buffer.writeByte(Class149_Sub2.FRIEND_STATUS.id);
		tcpmessage_3.buffer.writeByte(client.anInt7422);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void method11372(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method7889(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method11373(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6045(icomponentdefinitions_3, interface_4, executor, (byte) -2);
	}

	static final void method4565(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		if (icomponentdefinitions_3.anInt1426 != -1) {
			executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1427;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method4566(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.aString7426 != null && i_2 < Class459.anInt5534) {
			executor.stringStack[++executor.stringStackPtr - 1] = Class467.aClass173Array5575[i_2].aString2127;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void maxInt(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 > i_3 ? i_2 : i_3;
	}

	static final void method4568(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		executor.intStackPtr -= 2;
		Class119.method2074((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1] == 1);
	}

	static final void method2071(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method1083(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method2072(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.COLOR_PICKER_RESULT, client.outputContext.isaac);
		tcpmessage_3.buffer.writeShort(i_2);
		client.outputContext.queuePacket(tcpmessage_3);
	}

	static final void storeVarpbit(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		Class158_Sub1.PLAYER_VAR_PROVIDER.method280(i_2, executor.intStack[--executor.intStackPtr]);
	}

	static final void method2945(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spritePitch;
	}

	static final void method3913(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.anIntArray7336[i_2];
	}

	static final void method1641(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		Class404.method6809(string_2, i_3);
	}

	static final void method1643(CS2Executor executor) {
		executor.intStackPtr -= 2;
		client.aShort7436 = (short) executor.intStack[executor.intStackPtr];
		if (client.aShort7436 <= 0) {
			client.aShort7436 = 256;
		}
		client.aShort7437 = (short) executor.intStack[executor.intStackPtr + 1];
		if (client.aShort7437 <= 0) {
			client.aShort7437 = 205;
		}
	}

	static final void method15376(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7354;
	}

	static final void method13404(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub13_8193.method12714();
	}

	static final void method8152(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method14482(icomponentdefinitions_3, interface_4, executor, -544899981);
	}

	static final void method8153(CS2Executor executor) {
		executor.intStackPtr -= 4;
		Class435.method7300(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], true, 256);
	}

	static final void method8154(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1277;
	}

	static final void method8156(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aClass468_Sub21_8222.method12865();
	}

	static final void method8694(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method6690(icomponentdefinitions_3, interface_4, executor, (byte) 95);
	}

	static final void method8698(CS2Executor executor) {
		if (Class282_Sub13.GUEST_CLAN_SETTINGS != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
			executor.currentClanSettings = Class282_Sub13.GUEST_CLAN_SETTINGS;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static void method8700(CS2Executor executor) {
		int i_2 = executor.intStack[executor.intStackPtr - 3];
		int i_3 = executor.intStack[executor.intStackPtr - 2];
		int i_4 = executor.intStack[executor.intStackPtr - 1];
		executor.intStackPtr -= 3;
		if (i_2 > executor.globalArrayLengths[i_3]) {
			throw new RuntimeException();
		} else if (i_2 > executor.globalArrayLengths[i_4]) {
			throw new RuntimeException();
		} else if (i_3 == i_4) {
			throw new RuntimeException();
		} else {
			Class225_Sub5.method13047(executor.globalArrays[i_3], executor.globalArrays[i_4], 0, i_2 - 1, (byte) 46);
		}
	}

	static final void method8701(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.allowGuests ? 1 : 0;
	}

	static final void method8738(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 >= 1 && i_2 <= 2) {
			Class393.preferences.setValue(Class393.preferences.screenSize, i_2, -296279259);
			Class393.preferences.setValue(Class393.preferences.aClass468_Sub9_8218, i_2, -2128693924);
			Class190.savePreferences((byte) 78);
		}
	}

	static final void method14520(CS2Executor executor) {
		executor.intStackPtr -= 4;
		Class153.method2618(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], 256, 1476817598);
	}

	static final void method14521(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method4136(icomponentdefinitions_3, interface_4, executor, (byte) 55);
	}

	static final void method4146(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1299;
	}

	static final void getCompHeight(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1429;
	}

	static final void method4148(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (i_3 == -1) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).method15211((char) i_3);
		}
	}

	static final void method5595(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method1845(icomponentdefinitions_3, interface_4, executor, -1020802647);
	}

	static final void intNotEqual(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr] != executor.intStack[executor.intStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method5598(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1429;
	}

	static void method2841(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).anIntArrayArray2966[executor.intStack[executor.intStackPtr - 1]][1];
		--executor.intStackPtr;
	}

	static final void method14639(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class46.CLAN_VARS != null ? 1 : 0;
	}

	static final void method14640(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method3672(icomponentdefinitions_3, interface_4, executor, (short) 9324);
	}

	static final void method15552(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		method14664(icomponentdefinitions_3, interface_4, false, 1, executor, (byte) 24);
	}

	static final void method15555(CS2Executor executor) {
		int[] ints_2 = executor.intStack;
		int i_3 = ++executor.intStackPtr - 1;
		byte b_4;
		if (Class393.preferences.aClass468_Sub23_8202.method12897((byte) 38) == 1) {
			b_4 = 1;
		} else {
			b_4 = 0;
		}
		ints_2[i_3] = b_4;
	}

	static final void method8208(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		Interface interface_4 = Class468_Sub8.INTERFACES[i_2 >> 16];
		method8387(icomponentdefinitions_3, interface_4, executor, 1918613827);
	}

	static final void method7668(CS2Executor executor) {
		SpotAnimIndexLoader.method8862(executor.intStack[--executor.intStackPtr], -1, -1, false);
	}

	static final void method6696(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1334;
	}

	static final void method2620(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		InterfaceWithDefs underlaydefinition_3;
		if (executor.aBool7022) {
			underlaydefinition_3 = executor.aClass513_6994;
		} else {
			underlaydefinition_3 = executor.aClass513_7007;
		}
		executor.intStack[++executor.intStackPtr - 1] = underlaydefinition_3.method8764(i_2, -1) ? 1 : 0;
	}

	static final void method1134(CS2Executor executor) {
		InterfaceWithDefs underlaydefinition_2 = executor.aBool7022 ? executor.aClass513_6994 : executor.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		int i_4 = executor.intStack[--executor.intStackPtr];
		ParamDefinitions attributedefault_5 = IndexLoaders.PARAM_LOADER.getParam(i_4);
		if (attributedefault_5.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.method1998(i_4, attributedefault_5.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.method1997(i_4, attributedefault_5.defaultInt, 1468810127);
		}
	}

	static final void method1135(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.aByte628;
	}

	/**
	 * START MULTI PARAMETER UTILITY METHODS
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	static final void method15511(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.spriteScale = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 56);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class106.method1818(icomponentdefinitions_0.idHash, 438520847);
		}
	}

	static final void method14680(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
		if (icomponentdefinitions_0.anInt1329 != 6) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.anInt1330);
			if (icomponentdefinitions_0.aClass417_1308 == null) {
				icomponentdefinitions_0.aClass417_1308 = new Class417(npcdefinitions_5, true);
			}
			icomponentdefinitions_0.aClass417_1308.aLong4993 = Class86.method1480(-610795534);
			if (i_4 >= 0 && i_4 < npcdefinitions_5.modelIds.length) {
				icomponentdefinitions_0.aClass417_1308.anIntArray4992[i_4] = i_3;
				Class109.redrawComponent(icomponentdefinitions_0, (byte) -65);
			} else {
				throw new RuntimeException("" + i_4);
			}
		}
	}

	static final void method6018(Class521_Sub1 class521_sub1_0, CS2Executor cs2executor_1, int i_2) {
		boolean bool_3 = false;
		int i_4 = 0;
		int i_5 = 0;
		int i_6 = 0;
		int i_7 = 0;
		if (class521_sub1_0.aClass275_Sub5Array7965 != null) {
			for (int i_8 = 0; i_8 < class521_sub1_0.aClass275_Sub5Array7965.length; i_8++) {
				Class275_Sub5 class275_sub5_9 = class521_sub1_0.aClass275_Sub5Array7965[i_8];
				if (class275_sub5_9.aBool7849) {
					int i_10;
					int i_11;
					if (class275_sub5_9.anInt7850 < class275_sub5_9.anInt7847) {
						i_10 = class275_sub5_9.anInt7850 - class275_sub5_9.anInt7851;
						i_11 = class275_sub5_9.anInt7851 + class275_sub5_9.anInt7847;
					} else {
						i_10 = class275_sub5_9.anInt7847 - class275_sub5_9.anInt7851;
						i_11 = class275_sub5_9.anInt7850 + class275_sub5_9.anInt7851;
					}
					int i_12;
					int i_13;
					if (class275_sub5_9.anInt7846 < class275_sub5_9.anInt7848) {
						i_12 = class275_sub5_9.anInt7846 - class275_sub5_9.anInt7851;
						i_13 = class275_sub5_9.anInt7851 + class275_sub5_9.anInt7848;
					} else {
						i_12 = class275_sub5_9.anInt7848 - class275_sub5_9.anInt7851;
						i_13 = class275_sub5_9.anInt7846 + class275_sub5_9.anInt7851;
					}
					if (!bool_3 || i_10 < i_4) {
						i_4 = i_10;
					}
					if (!bool_3 || i_12 < i_5) {
						i_5 = i_12;
					}
					if (!bool_3 || i_11 > i_6) {
						i_6 = i_11;
					}
					if (!bool_3 || i_13 > i_7) {
						i_7 = i_13;
					}
					bool_3 = true;
				}
			}
		}
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = bool_3 ? 1 : 0;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_4;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_5;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_6;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_7;
	}

	static final void method4883(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, CS2Executor cs2executor_3) {
		if (icomponentdefinitions_0.anIntArray1267 == null) {
			if (i_2 <= 0) {
				return;
			}
			icomponentdefinitions_0.aByteArrayArray1366 = new byte[11][];
			icomponentdefinitions_0.aByteArrayArray1367 = new byte[11][];
			icomponentdefinitions_0.anIntArray1395 = new int[11];
			icomponentdefinitions_0.anIntArray1267 = new int[11];
		}
		icomponentdefinitions_0.anIntArray1267[i_1] = i_2;
		if (i_2 > 0) {
			icomponentdefinitions_0.aBool1424 = true;
		} else {
			icomponentdefinitions_0.aBool1424 = false;
			for (int i_5 = 0; i_5 < icomponentdefinitions_0.aByteArrayArray1366.length; i_5++) {
				if (icomponentdefinitions_0.aByteArrayArray1366[i_5] != null || icomponentdefinitions_0.anIntArray1267[i_5] > 0) {
					icomponentdefinitions_0.aBool1424 = true;
					break;
				}
			}
		}
	}

	static final void method15207(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
		if (icomponentdefinitions_0.anInt1329 != 6 && icomponentdefinitions_0.anInt1329 != 2) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.anInt1330);
			if (icomponentdefinitions_0.aClass417_1308 == null) {
				icomponentdefinitions_0.aClass417_1308 = new Class417(npcdefinitions_5, icomponentdefinitions_0.anInt1329 == 6);
			}
			icomponentdefinitions_0.aClass417_1308.aLong4993 = Class86.method1480(976304204);
			if (npcdefinitions_5.aShortArray4892 != null && i_4 >= 0 && i_4 < npcdefinitions_5.aShortArray4892.length) {
				icomponentdefinitions_0.aClass417_1308.aShortArray4990[i_4] = (short) i_3;
				Class109.redrawComponent(icomponentdefinitions_0, (byte) 49);
			} else {
				throw new RuntimeException("");
			}
		}
	}

	static final void method1852(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1311 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.anInt1311 > icomponentdefinitions_0.anInt1376 - icomponentdefinitions_0.anInt1301) {
			icomponentdefinitions_0.anInt1311 = icomponentdefinitions_0.anInt1376 - icomponentdefinitions_0.anInt1301;
		}
		if (icomponentdefinitions_0.anInt1311 < 0) {
			icomponentdefinitions_0.anInt1311 = 0;
		}
		icomponentdefinitions_0.anInt1312 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		if (icomponentdefinitions_0.anInt1312 > icomponentdefinitions_0.anInt1314 - icomponentdefinitions_0.anInt1429) {
			icomponentdefinitions_0.anInt1312 = icomponentdefinitions_0.anInt1314 - icomponentdefinitions_0.anInt1429;
		}
		if (icomponentdefinitions_0.anInt1312 < 0) {
			icomponentdefinitions_0.anInt1312 = 0;
		}
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 19);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class468_Sub12.method12709(icomponentdefinitions_0.idHash);
		}
	}

	static final void method6289(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, -14681089) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1390 = method6193(string_4, cs2executor_2, 289210792);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method7927(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, byte b_2) {
		cs2executor_1.intStackPtr -= 2;
		int i_3 = cs2executor_1.intStack[cs2executor_1.intStackPtr] - 1;
		int i_4 = cs2executor_1.intStack[cs2executor_1.intStackPtr + 1];
		if (i_3 >= 0 && i_3 <= 9) {
			method4883(icomponentdefinitions_0, i_3, i_4, cs2executor_1);
		} else {
			throw new RuntimeException();
		}
	}

	static final void method3078(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 198501911) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1389 = method6193(string_4, cs2executor_2, 81409636);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method3672(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, short s_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 394644224) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1412 = method6193(string_4, cs2executor_2, 1237376111);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method6453(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = method14642(string_4, cs2executor_2, 1022957959);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1342 = method6193(string_4, cs2executor_2, 720778855);
		icomponentdefinitions_0.anIntArray1398 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method7889(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1390174253) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1346 = method6193(string_4, cs2executor_2, 1483918243);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method774(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.aBool1351 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 44);
	}

	static final void method13292(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1441 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1263 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -27);
	}

	static final void method2874(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 69608151) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1319 = method6193(string_4, cs2executor_2, 1275110471);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method7267(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aBool1344 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 89);
	}

	static final void method5009(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1962956605) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1413 = method6193(string_4, cs2executor_2, 1097556379);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method7142(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aBool1420 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 53);
	}

	static final void method6288(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, short s_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = method14642(string_4, cs2executor_2, -37726580);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1405 = method6193(string_4, cs2executor_2, 1676741238);
		icomponentdefinitions_0.anIntArray1406 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method2915(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.anInt1324 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 15);
	}

	static final void method8754(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.aBool1316 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 19);
	}

	static final void method5121(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.color = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 103);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class282_Sub14.method12223(icomponentdefinitions_0.idHash);
		}
	}

	static final void method6689(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = method14642(string_4, cs2executor_2, 1724948075);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1397 = method6193(string_4, cs2executor_2, 116060778);
		icomponentdefinitions_0.anIntArray1401 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method6690(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 41262162) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1361 = method6193(string_4, cs2executor_2, -295691698);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method4159(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.anInt1340 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1350 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1281 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		icomponentdefinitions_0.anInt1354 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -26);
	}

	static final void method4160(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, short s_3) {
		icomponentdefinitions_0.anInt1323 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -6);
	}

	static final int[] method14642(String string_0, CS2Executor cs2executor_1, int i_2) {
		int[] ints_3 = null;
		if (string_0.length() > 0 && string_0.charAt(string_0.length() - 1) == 89) {
			int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
			if (i_4 > 0) {
				for (ints_3 = new int[i_4]; i_4-- > 0; ints_3[i_4] = cs2executor_1.intStack[--cs2executor_1.intStackPtr]) {
					;
				}
			}
		}
		return ints_3;
	}

	static final void method11221(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1482833983) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1393 = method6193(string_4, cs2executor_2, -404986216);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method11223(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 382641837) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1392 = method6193(string_4, cs2executor_2, 1828799616);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method501(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.aBool1322 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -70);
	}

	static final void method502(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = method14642(string_4, cs2executor_2, 2090816514);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1403 = method6193(string_4, cs2executor_2, 1107987835);
		icomponentdefinitions_0.anIntArray1315 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method505(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		String string_5 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		ParamDefinitions attributedefault_6 = IndexLoaders.PARAM_LOADER.getParam(i_4);
		if (!attributedefault_6.typeName.equals(string_5)) {
			icomponentdefinitions_0.method2000(i_4, string_5);
		} else {
			icomponentdefinitions_0.method1995(i_4);
		}
	}

	static final void method506(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1376 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1314 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -10);
		if (icomponentdefinitions_0.type == 0) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -1735080264);
		}
	}

	static void method2738(Interface interface_0, int i_1, int i_2, int i_3, boolean bool_4, CS2Executor cs2executor_5) {
		if (i_2 == 0) {
			throw new RuntimeException();
		} else {
			IComponentDefinitions icomponentdefinitions_7 = interface_0.components[i_1];
			if (icomponentdefinitions_7.aClass118Array1438 == null) {
				icomponentdefinitions_7.aClass118Array1438 = new IComponentDefinitions[i_3 + 1];
				icomponentdefinitions_7.aClass118Array1439 = icomponentdefinitions_7.aClass118Array1438;
			}
			if (icomponentdefinitions_7.aClass118Array1438.length <= i_3) {
				IComponentDefinitions[] arr_8;
				if (icomponentdefinitions_7.aClass118Array1438 == icomponentdefinitions_7.aClass118Array1439) {
					arr_8 = new IComponentDefinitions[i_3 + 1];
					for (int i_9 = 0; i_9 < icomponentdefinitions_7.aClass118Array1438.length; i_9++) {
						arr_8[i_9] = icomponentdefinitions_7.aClass118Array1438[i_9];
					}
					icomponentdefinitions_7.aClass118Array1438 = icomponentdefinitions_7.aClass118Array1439 = arr_8;
				} else {
					arr_8 = new IComponentDefinitions[i_3 + 1];
					IComponentDefinitions[] arr_11 = new IComponentDefinitions[i_3 + 1];
					for (int i_10 = 0; i_10 < icomponentdefinitions_7.aClass118Array1438.length; i_10++) {
						arr_8[i_10] = icomponentdefinitions_7.aClass118Array1438[i_10];
						arr_11[i_10] = icomponentdefinitions_7.aClass118Array1439[i_10];
					}
					icomponentdefinitions_7.aClass118Array1438 = arr_8;
					icomponentdefinitions_7.aClass118Array1439 = arr_11;
				}
			}
			if (i_3 > 0 && icomponentdefinitions_7.aClass118Array1438[i_3 - 1] == null) {
				throw new RuntimeException("" + (i_3 - 1));
			} else {
				IComponentDefinitions icomponentdefinitions_12 = new IComponentDefinitions();
				icomponentdefinitions_12.type = i_2;
				icomponentdefinitions_12.parent = icomponentdefinitions_12.idHash = icomponentdefinitions_7.idHash;
				icomponentdefinitions_12.anInt1288 = i_3;
				icomponentdefinitions_7.aClass118Array1438[i_3] = icomponentdefinitions_12;
				if (icomponentdefinitions_7.aClass118Array1438 != icomponentdefinitions_7.aClass118Array1439) {
					icomponentdefinitions_7.aClass118Array1439[i_3] = icomponentdefinitions_12;
				}
				InterfaceWithDefs underlaydefinition_13;
				if (bool_4) {
					underlaydefinition_13 = cs2executor_5.aClass513_6994;
				} else {
					underlaydefinition_13 = cs2executor_5.aClass513_7007;
				}
				underlaydefinition_13.aClass98_5885 = interface_0;
				underlaydefinition_13.aClass118_5886 = icomponentdefinitions_12;
				Class109.redrawComponent(icomponentdefinitions_7, (byte) -95);
			}
		}
	}

	static final void method2741(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		boolean bool_5;
		if (cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1) {
			bool_5 = true;
		} else {
			bool_5 = false;
		}
		icomponentdefinitions_0.aBool1327 = bool_5;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 1);
	}

	static final void method8387(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1380 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void method8390(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 != icomponentdefinitions_0.anInt1320) {
			icomponentdefinitions_0.anInt1320 = i_4;
			Class109.redrawComponent(icomponentdefinitions_0, (byte) 22);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class105.method1807(icomponentdefinitions_0.idHash);
		}
	}

	static final void method15256(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1381 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void method4651(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1522252372) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1292 = method6193(string_4, cs2executor_2, 1736342439);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method6313(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.anInt1404 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1432 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1433 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		icomponentdefinitions_0.anInt1434 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 33);
	}

	static final void method786(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		boolean bool_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		if (bool_4 != icomponentdefinitions_0.hidden) {
			icomponentdefinitions_0.hidden = bool_4;
			Class109.redrawComponent(icomponentdefinitions_0, (byte) -3);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class78.method1389(icomponentdefinitions_0.idHash);
		}
	}

	static final void method789(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		if (icomponentdefinitions_0.type == 5) {
			method5459(icomponentdefinitions_0, interface_1, cs2executor_2, -1486072931);
		}
	}

	static final void method5017(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, -305873852) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1383 = method6193(string_4, cs2executor_2, -186222410);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method2955(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.anInt1309 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void method4772(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1550392426) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1419 = method6193(string_4, cs2executor_2, 902561109);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method7429(IComponentDefinitions icomponentdefinitions_0, int i_1, byte[] bytes_2, byte[] bytes_3, CS2Executor cs2executor_4, int i_5) {
		if (icomponentdefinitions_0.aByteArrayArray1366 == null) {
			if (bytes_2 == null) {
				return;
			}
			icomponentdefinitions_0.aByteArrayArray1366 = new byte[11][];
			icomponentdefinitions_0.aByteArrayArray1367 = new byte[11][];
			icomponentdefinitions_0.anIntArray1395 = new int[11];
			icomponentdefinitions_0.anIntArray1267 = new int[11];
		}
		icomponentdefinitions_0.aByteArrayArray1366[i_1] = bytes_2;
		if (bytes_2 != null) {
			icomponentdefinitions_0.aBool1424 = true;
		} else {
			icomponentdefinitions_0.aBool1424 = false;
			for (int i_6 = 0; i_6 < icomponentdefinitions_0.aByteArrayArray1366.length; i_6++) {
				if (icomponentdefinitions_0.aByteArrayArray1366[i_6] != null || icomponentdefinitions_0.anIntArray1267[i_6] > 0) {
					icomponentdefinitions_0.aBool1424 = true;
					break;
				}
			}
		}
		icomponentdefinitions_0.aByteArrayArray1367[i_1] = bytes_3;
	}

	static final void method5763(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1329 = 2;
		icomponentdefinitions_0.aClass417_1308 = null;
		icomponentdefinitions_0.anInt1330 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, -1575336609);
		}
	}

	static final void method2960(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aBool1363 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 9);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class244.method4196(icomponentdefinitions_0.idHash);
		}
	}

	static final void method11160(Class282_Sub50_Sub7 class282_sub50_sub7_0, CS2Executor cs2executor_1) {
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = Class96_Sub12.method14613(class282_sub50_sub7_0);
		cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class158_Sub1.method13768(class282_sub50_sub7_0);
		cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class435.method7303(class282_sub50_sub7_0);
		cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class9.method450(class282_sub50_sub7_0);
	}

	static final void method2593(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1647551269) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1394 = method6193(string_4, cs2executor_2, 1442904775);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final Object[] method6193(String string_0, CS2Executor cs2executor_1, int i_2) {
		Object[] arr_3 = new Object[string_0.length() + 1];
		int i_4;
		for (i_4 = arr_3.length - 1; i_4 >= 1; --i_4) {
			if (string_0.charAt(i_4 - 1) == 115) {
				arr_3[i_4] = cs2executor_1.stringStack[--cs2executor_1.stringStackPtr];
			} else if (string_0.charAt(i_4 - 1) == 167) {
				arr_3[i_4] = new Long(cs2executor_1.longStack[--cs2executor_1.longStackPtr]);
			} else {
				arr_3[i_4] = new Integer(cs2executor_1.intStack[--cs2executor_1.intStackPtr]);
			}
		}
		i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		if (i_4 != -1) {
			arr_3[0] = new Integer(i_4);
		} else {
			arr_3 = null;
		}
		return arr_3;
	}

	static final void method13468(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.aBool1328 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 6);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Message.method7278(icomponentdefinitions_0.idHash);
		}
	}

	static final void method4136(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 718441711) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1409 = method6193(string_4, cs2executor_2, 1509347670);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method14664(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, boolean bool_2, int i_3, CS2Executor cs2executor_4, byte b_5) {
		cs2executor_4.intStackPtr -= 2;
		int i_6 = cs2executor_4.intStack[cs2executor_4.intStackPtr];
		int i_7 = cs2executor_4.intStack[cs2executor_4.intStackPtr + 1];
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			CutsceneActionType.method6914(icomponentdefinitions_0.idHash);
			Class106.method1818(icomponentdefinitions_0.idHash, 209948825);
			Item.method12575(icomponentdefinitions_0.idHash, (byte) 59);
		}
		if (i_6 == -1) {
			icomponentdefinitions_0.anInt1329 = 1;
			icomponentdefinitions_0.anInt1330 = -1;
			icomponentdefinitions_0.anInt1426 = -1;
		} else {
			icomponentdefinitions_0.anInt1426 = i_6;
			icomponentdefinitions_0.anInt1427 = i_7;
			icomponentdefinitions_0.aBool1388 = bool_2;
			ItemDefinitions itemdefinitions_8 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_6);
			icomponentdefinitions_0.spritePitch = itemdefinitions_8.modelRotationX;
			icomponentdefinitions_0.spriteRoll = itemdefinitions_8.modelRotationY;
			icomponentdefinitions_0.spriteYaw = itemdefinitions_8.modelRotationZ;
			icomponentdefinitions_0.anInt1293 = itemdefinitions_8.modelOffsetX;
			icomponentdefinitions_0.anInt1334 = itemdefinitions_8.modelOffsetY;
			icomponentdefinitions_0.spriteScale = itemdefinitions_8.modelZoom;
			icomponentdefinitions_0.anInt1335 = i_3;
			if (icomponentdefinitions_0.anInt1417 > 0) {
				icomponentdefinitions_0.spriteScale = icomponentdefinitions_0.spriteScale * 32 / icomponentdefinitions_0.anInt1417;
			} else if (icomponentdefinitions_0.baseWidth > 0) {
				icomponentdefinitions_0.spriteScale = icomponentdefinitions_0.spriteScale * 32 / icomponentdefinitions_0.baseWidth;
			}
		}
	}

	static final void method2732(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (!string_4.equals(icomponentdefinitions_0.text)) {
			icomponentdefinitions_0.text = string_4;
			Class109.redrawComponent(icomponentdefinitions_0, (byte) 79);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			RenderAnimIndexLoader.method3631(icomponentdefinitions_0.idHash);
		}
	}

	static final void method6122(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.aString1369 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
	}

	static final void method14482(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		int i_5 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_5 >= 1 && i_5 <= 10) {
			icomponentdefinitions_0.method2039(i_5 - 1, i_4);
		}
	}

	static final void method1083(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1248172600) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1451 = method6193(string_4, cs2executor_2, 537651905);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method2168(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 3;
		icomponentdefinitions_0.anInt1359 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1360 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1358 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -42);
	}

	static final void method2170(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1404763010) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1421 = method6193(string_4, cs2executor_2, 930133882);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method14605(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, byte b_2) {
		byte b_3 = 10;
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		method4883(icomponentdefinitions_0, b_3, i_4, cs2executor_1);
	}

	static final void method6186(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		if (icomponentdefinitions_0.type == 4) {
			method5459(icomponentdefinitions_0, interface_1, cs2executor_2, -2108209213);
		}
	}

	static final void method8310(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.anInt1423 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -17);
	}

	static final void method542(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 876649685) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1407 = method6193(string_4, cs2executor_2, -479801764);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method14700(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1277 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 21);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Game.method8207(icomponentdefinitions_0.idHash);
		}
	}

	static final void method7729(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1430 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1431 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 64);
	}

	static final void method3983(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.basePositionX = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.basePositionY = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		if (i_4 < 0) {
			i_4 = 0;
		} else if (i_4 > 5) {
			i_4 = 5;
		}
		int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		if (i_5 < 0) {
			i_5 = 0;
		} else if (i_5 > 5) {
			i_5 = 5;
		}
		icomponentdefinitions_0.aByte1333 = (byte) i_4;
		icomponentdefinitions_0.aByte1355 = (byte) i_5;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -75);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
		if (icomponentdefinitions_0.type == 0) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -1665129520);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class396.method6774(icomponentdefinitions_0.idHash);
		}
	}

	static final void method1454(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		cs2executor_2.intStackPtr -= 2;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		ParamDefinitions attributedefault_6 = IndexLoaders.PARAM_LOADER.getParam(i_4);
		if (i_5 != attributedefault_6.defaultInt) {
			icomponentdefinitions_0.method1999(i_4, i_5, 146446242);
		} else {
			icomponentdefinitions_0.method1995(i_4);
		}
	}

	static final void method1455(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.anInt1330 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1339 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		if (cs2executor_2.intStack[cs2executor_2.intStackPtr + 2] == 1) {
			icomponentdefinitions_0.anInt1329 = 9;
		} else {
			icomponentdefinitions_0.anInt1329 = 8;
		}
		if (cs2executor_2.intStack[cs2executor_2.intStackPtr + 3] == 1) {
			icomponentdefinitions_0.aBool1388 = true;
		} else {
			icomponentdefinitions_0.aBool1388 = false;
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, -940537484);
		}
	}

	static final void method14653(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, -271288407) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1353 = method6193(string_4, cs2executor_2, 1245386660);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method12260(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.baseWidth = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.baseHeight = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1417 = 0;
		icomponentdefinitions_0.anInt1326 = 0;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		if (i_4 < 0) {
			i_4 = 0;
		} else if (i_4 > 4) {
			i_4 = 4;
		}
		int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		if (i_5 < 0) {
			i_5 = 0;
		} else if (i_5 > 4) {
			i_5 = 4;
		}
		icomponentdefinitions_0.aByte1368 = (byte) i_4;
		icomponentdefinitions_0.aByte1294 = (byte) i_5;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -29);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
		if (icomponentdefinitions_0.type == 0) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -610252618);
		}
	}

	static final void method7555(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.anInt1329 = 1;
		icomponentdefinitions_0.anInt1330 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -15);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, -624586705);
		}
	}

	static final void method6010(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 3;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		short s_5 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		short s_6 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		if (i_4 >= 0 && i_4 < 5) {
			icomponentdefinitions_0.method2013(i_4, s_5, s_6, (byte) 11);
			Class109.redrawComponent(icomponentdefinitions_0, (byte) -78);
			if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
				Class276.method4903(icomponentdefinitions_0.idHash, i_4);
			}
		}
	}

	static final void method1845(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 122183599) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1271 = method6193(string_4, cs2executor_2, 350429453);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method3365(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1659229843) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1302 = method6193(string_4, cs2executor_2, -80213268);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method3366(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 570698140) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1416 = method6193(string_4, cs2executor_2, -422636898);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method3369(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.aString1338 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
	}

	static final void method3965(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		FontMetrics fontmetrics_3 = icomponentdefinitions_0.method1989(Class487.aClass378_5752, client.anInterface35_7206);
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_5 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_6 = fontmetrics_3.method6956(icomponentdefinitions_0.text, icomponentdefinitions_0.anInt1301, icomponentdefinitions_0.anInt1358, i_5, i_4, Class182.aClass160Array2261);
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_6;
	}

	static final void method3987(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1329 = 3;
		icomponentdefinitions_0.anInt1330 = client.anInt7315;
		icomponentdefinitions_0.anInt1339 = 0;
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, -1355203883);
		}
	}

	static final void method1494(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, byte b_2) {
		int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
		if (icomponentdefinitions_0.anInt1329 != 2) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.anInt1330);
			if (icomponentdefinitions_0.aClass417_1308 == null) {
				icomponentdefinitions_0.aClass417_1308 = new Class417(npcdefinitions_5, false);
			}
			icomponentdefinitions_0.aClass417_1308.aLong4993 = Class86.method1480(1471250768);
			if (i_4 >= 0 && i_4 < npcdefinitions_5.anIntArray4860.length) {
				icomponentdefinitions_0.aClass417_1308.anIntArray4992[i_4] = i_3;
				Class109.redrawComponent(icomponentdefinitions_0, (byte) 54);
			} else {
				throw new RuntimeException("");
			}
		}
	}

	static final void method7547(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aString1348 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
	}

	static final void method12401(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1329 = 5;
		icomponentdefinitions_0.anInt1330 = client.anInt7315;
		icomponentdefinitions_0.anInt1339 = 0;
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, -2001727659);
		}
	}

	static final void method14892(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.anInt1377 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -21);
	}

	static final void method4276(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 6;
		icomponentdefinitions_0.anInt1293 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1334 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.spritePitch = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		icomponentdefinitions_0.spriteRoll = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		icomponentdefinitions_0.spriteYaw = cs2executor_2.intStack[cs2executor_2.intStackPtr + 4];
		icomponentdefinitions_0.spriteScale = cs2executor_2.intStack[cs2executor_2.intStackPtr + 5];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 60);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class106.method1818(icomponentdefinitions_0.idHash, -1101705065);
			Item.method12575(icomponentdefinitions_0.idHash, (byte) 9);
		}
	}

	static final void method4280(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		boolean bool_5;
		if (cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1) {
			bool_5 = true;
		} else {
			bool_5 = false;
		}
		icomponentdefinitions_0.aBool1325 = bool_5;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 40);
	}

	static final void method12630(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.method1987();
	}

	static final void method5066(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1329 = 5;
		icomponentdefinitions_0.anInt1330 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, 1743541888);
		}
	}

	static final void method13450(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		icomponentdefinitions_0.aBool1357 = i_4 == 1;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 41);
	}

	static final void method6942(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		if (client.method11633(icomponentdefinitions_0).continueOptionEnabled() && client.aClass118_7352 == null) {
			Class158_Sub2.method14355(icomponentdefinitions_0.idHash, icomponentdefinitions_0.anInt1288, -946546687);
			client.aClass118_7352 = Index.method5694(icomponentdefinitions_0.idHash, icomponentdefinitions_0.anInt1288, -1963750401);
			Class109.redrawComponent(client.aClass118_7352, (byte) -38);
		}
	}

	static final void method3601(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
		if (icomponentdefinitions_0.anInt1329 != 6 && icomponentdefinitions_0.anInt1329 != 2) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.anInt1330);
			if (icomponentdefinitions_0.aClass417_1308 == null) {
				icomponentdefinitions_0.aClass417_1308 = new Class417(npcdefinitions_5, icomponentdefinitions_0.anInt1329 == 6);
			}
			icomponentdefinitions_0.aClass417_1308.aLong4993 = Class86.method1480(1488415195);
			if (npcdefinitions_5.aShortArray4867 != null && i_4 >= 0 && i_4 < npcdefinitions_5.aShortArray4867.length) {
				icomponentdefinitions_0.aClass417_1308.aShortArray4991[i_4] = (short) i_3;
				Class109.redrawComponent(icomponentdefinitions_0, (byte) 25);
			} else {
				throw new RuntimeException("");
			}
		}
	}

	static final void method5291(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] - 1;
		if (i_4 >= 0 && i_4 <= 9) {
			icomponentdefinitions_0.method1994(i_4, (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr]);
		} else {
			--cs2executor_2.stringStackPtr;
		}
	}

	static final void method797(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 != icomponentdefinitions_0.animation) {
			if (i_4 != -1) {
				if (icomponentdefinitions_0.aClass456_1437 == null) {
					icomponentdefinitions_0.aClass456_1437 = new Class456_Sub1();
				}
				icomponentdefinitions_0.aClass456_1437.update(i_4);
			} else {
				icomponentdefinitions_0.aClass456_1437 = null;
			}
			icomponentdefinitions_0.animation = i_4;
			Class109.redrawComponent(icomponentdefinitions_0, (byte) 39);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class149_Sub1.method14582(icomponentdefinitions_0.idHash);
		}
	}

	static final void method5453(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1453 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 38);
	}

	static final void method5455(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1521695883) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1418 = method6193(string_4, cs2executor_2, 570621267);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method5459(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 != icomponentdefinitions_0.anInt1435) {
			icomponentdefinitions_0.anInt1435 = i_4;
			Class109.redrawComponent(icomponentdefinitions_0, (byte) 77);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			JS5LocalRequester.method5581(icomponentdefinitions_0.idHash);
		}
	}

	static final void method569(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1362 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 60);
	}

	static final void method3251(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		if (cs2executor_1.anInt7015 >= 10) {
			throw new RuntimeException();
		} else {
			if (icomponentdefinitions_0.anObjectArray1271 != null) {
				HookRequest hookrequest_3 = new HookRequest();
				hookrequest_3.iComponentDefs = icomponentdefinitions_0;
				hookrequest_3.params = icomponentdefinitions_0.anObjectArray1271;
				hookrequest_3.anInt8061 = cs2executor_1.anInt7015 + 1;
				client.aClass482_7402.append(hookrequest_3);
			}
		}
	}

	static final void method5001(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		FontMetrics fontmetrics_3 = icomponentdefinitions_0.method1989(Class487.aClass378_5752, client.anInterface35_7206);
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		Point point_5 = fontmetrics_3.method6954(icomponentdefinitions_0.text, icomponentdefinitions_0.anInt1301, icomponentdefinitions_0.anInt1358, i_4, Class182.aClass160Array2261);
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.x;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.y;
	}

	static final void method3338(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = method14642(string_4, cs2executor_2, 510066471);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1387 = method6193(string_4, cs2executor_2, 1621483934);
		icomponentdefinitions_0.anIntArray1402 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method6244(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1289 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1375 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 14);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
		if (icomponentdefinitions_0.type == 0) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -1114649951);
		}
	}

	static final void method3738(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 2;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		if (i_4 == -1 && i_5 == -1) {
			icomponentdefinitions_0.aClass118_1379 = null;
		} else {
			icomponentdefinitions_0.aClass118_1379 = Index.method5694(i_4, i_5, 551266570);
		}
	}

	static final void method14586(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, -159099843) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1396 = method6193(string_4, cs2executor_2, -448612500);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method6045(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.anInt1310 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1307 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void method8277(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1293603558) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1278 = method6193(string_4, cs2executor_2, -34782350);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method869(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 == IComponentDefinitions.anInt1283 || i_4 == IComponentDefinitions.anInt1373 || i_4 == IComponentDefinitions.anInt1265) {
			icomponentdefinitions_0.anInt1382 = i_4;
		}
	}

	static final void method910(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 513538858) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.params = method6193(string_4, cs2executor_2, 240682174);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method403(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.disableHover = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
	}

	static final void method12209(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 2;
		byte b_4 = 10;
		byte[] bytes_5 = new byte[] { (byte) cs2executor_2.intStack[cs2executor_2.intStackPtr] };
		byte[] bytes_6 = new byte[] { (byte) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1] };
		method7429(icomponentdefinitions_0, b_4, bytes_5, bytes_6, cs2executor_2, -2033836462);
	}

	static final void method1838(IComponentDefinitions icomponentdefinitions_0, byte[] bytes_1, byte[] bytes_2, CS2Executor cs2executor_3) {
		int i_5 = cs2executor_3.intStack[--cs2executor_3.intStackPtr] - 1;
		if (i_5 >= 0 && i_5 <= 9) {
			method7429(icomponentdefinitions_0, i_5, bytes_1, bytes_2, cs2executor_3, -1172279897);
		} else {
			throw new RuntimeException();
		}
	}

	static final void method15409(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1686354780) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1386 = method6193(string_4, cs2executor_2, 1189927775);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method6158(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 908211513) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1415 = method6193(string_4, cs2executor_2, 1001457907);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method11337(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1329 = 6;
		icomponentdefinitions_0.aClass417_1308 = null;
		icomponentdefinitions_0.anInt1330 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, -515297121);
		}
	}

	static final void method15474(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.aStringArray1352 = null;
	}

	static final void method1642(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (method14642(string_4, cs2executor_2, 1421907667) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1400 = method6193(string_4, cs2executor_2, 1475160400);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method4149(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1378 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void method7667(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 3;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		short s_5 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		short s_6 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		if (i_4 >= 0 && i_4 < 5) {
			icomponentdefinitions_0.method2007(i_4, s_5, s_6, -1261332787);
			Class109.redrawComponent(icomponentdefinitions_0, (byte) -93);
			if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
				RegionMap.method5513(icomponentdefinitions_0.idHash, i_4);
			}
		}
	}

	static final void method6697(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aBool1356 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 17);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class96_Sub17.method14656(icomponentdefinitions_0.idHash);
		}
	}
}