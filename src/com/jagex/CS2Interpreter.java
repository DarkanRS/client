package com.jagex;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;

public class CS2Interpreter {

	public static final void executeOperation(CS2Instruction operation, CS2Executor exec) {
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
		case CC_CREATE:
			ccCreate(exec);
			break;
		case CC_DELETE:
			ccDelete(exec);
			break;
		case CC_DELETEALL:
			clearCompChildren(exec);
			break;
		case CC_SETCHILD_SLOT:
			method6668(exec);
			break;
		case CC_SETCHILD:
			method2620(exec);
			break;
		case IF_SENDTOFRONT:
			ifSetFront(true, exec);
			break;
		case IF_SENDTOBACK:
			ifSetFront(false, exec);
			break;
		case CC_SENDTOFRONT:
			ccSetFront(true, exec);
			break;
		case CC_SENDTOBACK:
			ccSetFront(false, exec);
			break;
		case IF_RESUME_PAUSEBUTTON:
			ifResumePauseButton(exec);
			break;
		case CC_RESUME_PAUSEBUTTON:
			ccResumePauseButton(exec);
			break;
		case BASE_IDKIT:
			setBaseIdentiKit(exec);
			break;
		case BASE_COLOR:
			setBaseColor(exec);
			break;
		case SET_GENDER:
			setGender(exec);
			break;
		case SET_ITEM:
			setItem(exec);
			break;
		case CC_SETPOSITION:
			ccSetPosition(exec);
			break;
		case CC_SETSIZE:
			ccSetSize(exec);
			break;
		case CC_SETHIDE:
			ccSetHide(exec);
			break;
		case CC_SETASPECT:
			ccSetAspect(exec);
			break;
		case CC_SETNOCLICKTHROUGH:
			ccSetNoClickThrough(exec);
			break;
		case CC_SETSCROLLPOS:
			ccSetScrollPos(exec);
			break;
		case CC_SETCOLOR:
			method5314(exec);
			break;
		case CC_SETFILL:
			method3918(exec);
			break;
		case CC_SETTRANS:
			method5487(exec);
			break;
		case CC_SETLINEWID:
			method6687(exec);
			break;
		case CC_SETGRAPHIC:
			method6071(exec);
			break;
		case CC_SET2DANGLE:
			method5332(exec);
			break;
		case CC_SETTILING:
			method5774(exec);
			break;
		case CC_SETMODEL:
			method8327(exec);
			break;
		case CC_SETMODELANGLE:
			method6364(exec);
			break;
		case CC_SETMODELANIM:
			method8726(exec);
			break;
		case CC_SETMODELORTHOG:
			method15523(exec);
			break;
		case CC_SETMODELTINT:
			method5099(exec);
			break;
		case CC_SETTEXT:
			setCCText(exec);
			break;
		case CC_SETTEXTFONT:
			setCCFont(exec);
			break;
		case CC_SETTEXTALIGN:
			setCCTextAlign(exec);
			break;
		case CC_SETTEXTSHADOW:
			method12659(exec);
			break;
		case CC_SETTEXTANTIMACRO:
			method8714(exec);
			break;
		case CC_SETOUTLINE:
			method4965(exec);
			break;
		case CC_SETGRAPHICSHADOW:
			method1497(exec);
			break;
		case CC_SETVFLIP:
			method1569(exec);
			break;
		case CC_SETHFLIP:
			method15448(exec);
			break;
		case CC_SETSCROLLSIZE:
			method7929(exec);
			break;
		case CC_SETALPHA:
			method7933(exec);
			break;
		case CC_SETMODELZOOM:
			method12116(exec);
			break;
		case CC_SETLINEDIRECTION:
			method1259(exec);
			break;
		case CC_SETMODELORIGIN:
			method893(exec);
			break;
		case CC_SETMAXLINES:
			method1949(exec);
			break;
		case CC_SETPARAM_INT:
			method3031(exec);
			break;
		case CC_SETPARAM_STRING:
			method4558(exec);
			break;
		case instr6050: //something sprite index 36
			method6210(exec);
			break;
		case instr6051: //something text index 36
			method8344(exec);
			break;
		case CC_SETRECOL:
			method11380(exec);
			break;
		case CC_SETRETEX:
			method6688(exec);
			break;
		case CC_SETFONTMONO:
			method12846(exec);
			break;
		case CC_SETPARAM:
			method8753(exec);
			break;
		case CC_SETCLICKMASK:
			method5833(exec);
			break;
		case CC_SETITEM:
			method3080(exec);
			break;
		case CC_SETNPCHEAD:
			method3356(exec);
			break;
		case CC_SETPLAYERHEAD_SELF:
			method6802(exec);
			break;
		case CC_SETNPCMODEL:
			method8212(exec);
			break;
		case CC_SETPLAYERMODEL:
			method6283(exec);
			break;
		case CC_SETITEM_NONUM:
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
		case CC_SETPLAYERMODEL_SELF:
			method4381(exec);
			break;
		case CC_SETITEM_ALWAYSNUM:
			method15552(exec);
			break;
		case CC_SETITEM_WEARCOL_ALWAYSNUM:
			method1570(exec);
			break;
		case CC_SETOP:
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
		case instr6076: //CC_SETTARGETVERB?
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
		case CC_SETOPCURSOR:
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
		case IF_SETPOSITION:
			ifSetPosition(exec);
			break;
		case IF_SETSIZE:
			method2826(exec);
			break;
		case IF_SETHIDE:
			hideComp(exec);
			break;
		case IF_SETASPECT:
			method283(exec);
			break;
		case IF_SETNOCLICKTHROUGH:
			method1167(exec);
			break;
		case IF_SETSCROLLPOS:
			method5302(exec);
			break;
		case IF_SETCOLOR:
			method15514(exec);
			break;
		case IF_SETFILL:
			method3554(exec);
			break;
		case IF_SETTRANS:
			setCompTransparency(exec);
			break;
		case IF_SETLINEWID:
			method6016(exec);
			break;
		case IF_SETGRAPHIC:
			setCompSprite(exec);
			break;
		case IF_SET2DANGLE:
			method460(exec);
			break;
		case IF_SETTILING:
			method3250(exec);
			break;
		case IF_SETMODEL:
			method4311(exec);
			break;
		case IF_SETMODELANGLE:
			method3020(exec);
			break;
		case IF_SETMODELANIM:
			animateComp(exec);
			break;
		case instr6174:
			method11492(exec);
			break;
		case instr6369:
			method1509(exec);
			break;
		case IF_SETTEXT:
			setCompText(exec);
			break;
		case IF_SETTEXTFONT:
			setIfFont(exec);
			break;
		case IF_SETTEXTALIGN:
			setIfTextAlign(exec);
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
		case IF_SETCLICKMASK:
			method1069(exec);
			break;
		case IF_SETITEM:
			method5024(exec);
			break;
		case IF_SETNPCHEAD:
			method4863(exec);
			break;
		case IF_SETPLAYERHEAD_SELF:
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
		case IF_SETONMOUSEOVER:
			ifSetOnMouseOver(exec);
			break;
		case IF_SETONMOUSELEAVE:
			ifSetOnMouseLeave(exec);
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
		case IF_CLEARSCRIPTHOOKS:
			method6040(exec);
			break;
		case IF_GETX:
			method4146(exec);
			break;
		case IF_GETY:
			method6151(exec);
			break;
		case IF_GETWIDTH:
			getCompWidth(exec);
			break;
		case IF_GETHEIGHT:
			getCompHeight(exec);
			break;
		case IF_GETHIDE:
			getCompHidden(exec);
			break;
		case IF_GETLAYER:
			method5045(exec);
			break;
		case IF_GETPARENTLAYER:
			method8220(exec);
			break;
		case IF_GETCOLOR:
			method454(exec);
			break;
		case IF_GETSCROLLX:
			method7422(exec);
			break;
		case IF_GETSCROLLY:
			method11473(exec);
			break;
		case IF_GETTEXT:
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
			method855(exec); //IF_GETCHARINDEXATPOS?
			break;
		case instr6391:
			method6941(exec); //IF_GETCHARPOSATINDEX?
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
		case MES:
			method3339(exec);
			break;
		case RESET_MYPLAYER_ANIMS:
			method1836(exec);
			break;
		case IF_CLOSE:
			method3939(exec);
			break;
		case RESUME_COUNTDIALOG:
			resumeCountDialog(exec);
			break;
		case RESUME_NAMEDIALOG:
			resumeNamedDialog(exec);
			break;
		case RESUME_STRINGDIALOG:
			resumeStringDialog(exec);
			break;
		case OPPLAYER:
			method6194(exec);
			break;
		case IF_DRAGPICKUP:
			method870(exec);
			break;
		case CC_DRAGPICKUP:
			method5082(exec);
			break;
		case RESUME_ITEMDIALOG:
			method12841(exec);
			break;
		case IF_OPENSUBCLIENT:
			method1355(exec);
			break;
		case IF_CLOSESUBCLIENT:
			method4839(exec);
			break;
		case OPPLAYERT:
			method15399(exec);
			break;
		case MES_TYPED:
			appendTypedMessage(exec);
			break;
		case SETUP_MESSAGEBOX:
			method8147(exec);
			break;
		case RESUME_HSLDIALOG:
			resumeHSLDialog(exec);
			break;
		case RESUME_CLANFORUMQFCDIALOG:
			resumeClanForumQFCDialog(exec);
			break;
		case SOUND_SYNTH:
			playSoundSynth(exec);
			break;
		case SOUND_SONG:
			method3555(exec);
			break;
		case SOUND_JINGLE:
			method5027(exec);
			break;
		case SOUND_SYNTH_VOLUME:
			method14520(exec);
			break;
		case SOUND_SONG_VOLUME:
			method4557(exec);
			break;
		case SOUND_JINGLE_VOLUME:
			method11612(exec);
			break;
		case SOUND_VORBIS_VOLUME:
			method2823(exec);
			break;
		case SOUND_SPEECH_VOLUME:
			method8153(exec);
			break;
		case SOUND_SYNTH_RATE:
			method1888(exec);
			break;
		case SOUND_VORBIS_RATE:
			method5335(exec);
			break;
		case CLIENTCLOCK:
			method456(exec);
			break;
		case INV_GETITEM:
			method7675(exec);
			break;
		case INV_GETNUM:
			method5197(exec);
			break;
		case INV_TOTAL:
			method15389(exec);
			break;
		case INV_SIZE:
			method2729(exec);
			break;
		case INV_TOTALCAT:
			method16089(exec);
			break;
		case STAT:
			method3913(exec);
			break;
		case STAT_BASE:
			method11486(exec);
			break;
		case STAT_VISIBLE_XP:
			method7444(exec);
			break;
		case COORD:
			getMyPlayerPos(exec);
			break;
		case COORDX:
			method13057(exec);
			break;
		case COORDY:
			method7427(exec);
			break;
		case COORDZ:
			method5003(exec);
			break;
		case WORLD_MEMBERS:
			method5733(exec);
			break;
		case INVOTHER_GETITEM:
			method4825(exec);
			break;
		case INVOTHER_GETNUM:
			method6230(exec);
			break;
		case INVOTHER_TOTAL:
			method5490(exec);
			break;
		case STAFFMODLEVEL:
			staffModLevel(exec);
			break;
		case GET_SYSTEM_UPDATE_TIMER:
			getSystemUpdateTimer(exec);
			break;
		case WORLD_ID:
			getWorldId(exec);
			break;
		case RUNENERGY_VISIBLE:
			getRunEnergy(exec);
			break;
		case RUNWEIGHT_VISIBLE:
			getRunWeight(exec);
			break;
		case PLAYERMOD:
			method1467(exec);
			break;
		case PLAYERMODLEVEL:
			method3033(exec);
			break;
		case PLAYERMEMBER:
			getPlayerIsMember(exec);
			break;
		case COMLEVEL_ACTIVE:
			getPlayerCombatLevel(exec);
			break;
		case GENDER:
			getPlayerGender(exec);
			break;
		case WORLD_QUICKCHAT:
			getWorldQuickchatOnly(exec);
			break;
		case CONTAINER_FREE_SPACE:
			getContainerFreeSpace(exec);
			break;
		case CONTAINER_TOTAL_PARAM:
			containerTotalParam(exec);
			break;
		case CONTAINER_TOTAL_PARAM_STACK:
			containerTotalParamStack(exec);
			break;
		case WORLD_LANGUAGE:
			getWorldLanguage(exec);
			break;
		case MOVECOORD:
			method1613(exec);
			break;
		case AFFILIATE:
			method6799(exec);
			break;
		case PROFILE_CPU:
			getCPUProfile(exec);
			break;
		case PLAYERDEMO:
			method6399(exec);
			break;
		case APPLET_HASFOCUS:
			getAppletFocus(exec);
			break;
		case FROMBILLING:
			method7699(exec);
			break;
		case GET_MOUSE_X:
			getMouseX(exec);
			break;
		case GET_MOUSE_Y:
			getMouseY(exec);
			break;
		case GET_ACTIVE_MINIMENU_ENTRY:
			method1801(exec);
			break;
		case GET_SECOND_MINIMENU_ENTRY:
			method7322(exec);
			break;
		case GET_MINIMENU_LENGTH:
			method6121(exec);
			break;
		case GET_CURRENTCURSOR:
			method2552(exec);
			break;
		case GET_SELFYANGLE:
			method3340(exec);
			break;
		case MAP_ISOWNER:
			method13494(exec);
			break;
		case GET_MOUSEBUTTONS:
			method4031(exec);
			break;
		case SELF_PLAYER_UID:
			method7186(exec);
			break;
		case GET_MINIMENU_TARGET:
			method6275(exec);
			break;
		case ENUM_STRING:
			method4966(exec);
			break;
		case ENUM:
			method5901(exec);
			break;
		case ENUM_HASOUTPUT:
			method14503(exec);
			break;
		case ENUM_HASOUTPUT_STRING:
			method5776(exec);
			break;
		case ENUM_GETOUTPUTCOUNT:
			getEnumSize(exec);
			break;
		case ENUM_GETREVERSECOUNT:
			method1853(exec);
			break;
		case ENUM_GETREVERSECOUNT_STRING:
			method8757(exec);
			break;
		case ENUM_GETREVERSEINDEX:
			method6242(exec);
			break;
		case ENUM_GETREVERSEINDEX_STRING:
			method536(exec);
			break;
		case EMAIL_VALIDATION_SUBMIT_CODE:
			method11594(exec);
			break;
		case EMAIL_VALIDATION_CHANGE_ADDRESS:
			method7501(exec);
			break;
		case EMAIL_VALIDATION_ADD_NEW_ADDRESS:
			emailValidationAddNewAddress(exec);
			break;
		case FRIEND_COUNT:
			method4773(exec);
			break;
		case FRIEND_GETNAME:
			method2096(exec);
			break;
		case FRIEND_GETWORLD:
			method5695(exec);
			break;
		case FRIEND_GETRANK:
			method3597(exec);
			break;
		case FRIEND_GETWORLDFLAGS:
			method11370(exec);
			break;
		case FRIEND_SETRANK:
			method1641(exec);
			break;
		case FRIEND_ADD:
			method1500(exec);
			break;
		case FRIEND_DEL:
			method4278(exec);
			break;
		case IGNORE_ADD:
			method1452(exec);
			break;
		case IGNORE_DEL:
			method4181(exec);
			break;
		case FRIEND_TEST:
			method7932(exec);
			break;
		case FRIEND_GETWORLDNAME:
			method2871(exec);
			break;
		case FC_GETCHATDISPLAYNAME:
			method3966(exec);
			break;
		case FC_GETCHATCOUNT:
			method6680(exec);
			break;
		case FC_GETCHATUSERNAME:
			method8870(exec);
			break;
		case FC_GETCHATUSERWORLD:
			method4905(exec);
			break;
		case FC_GETCHATUSERRANK:
			method8756(exec);
			break;
		case FC_GETCHATMINKICK:
			method3829(exec);
			break;
		case FC_KICKUSER:
			method6152(exec);
			break;
		case FC_GETCHATRANK:
			method14491(exec);
			break;
		case FC_JOINCHAT:
			method4902(exec);
			break;
		case FC_LEAVECHAT:
			method7928(exec);
			break;
		case IGNORE_COUNT:
			method4829(exec);
			break;
		case IGNORE_GETNAME:
			method5489(exec);
			break;
		case IGNORE_TEST:
			method16124(exec);
			break;
		case FC_ISSELF:
			method1608(exec);
			break;
		case FC_GETCHATOWNERNAME:
			method13044(exec);
			break;
		case FC_GETCHATUSERWORLDNAME:
			method11355(exec);
			break;
		case FRIEND_PLATFORM:
			method1625(exec);
			break;
		case FRIEND_GETSLOTFROMNAME:
			method1775(exec);
			break;
		case PLAYERCOUNTRY:
			method14833(exec);
			break;
		case IGNORE_ADD_TEMP:
			method1462(exec);
			break;
		case IGNORE_IS_TEMP:
			method3164(exec);
			break;
		case FC_GETCHATUSERNAME_UNFILTERED:
			method4566(exec);
			break;
		case IGNORE_GETNAME_UNFILTERED:
			method8019(exec);
			break;
		case FRIEND_IS_REFERRER:
			method3739(exec);
			break;
		case ACTIVECLANSETTINGS_FIND_LISTENED:
			method8698(exec);
			break;
		case ACTIVECLANSETTINGS_FIND_AFFINED:
			method12881(exec);
			break;
		case ACTIVECLANSETTINGS_GETCLANNAME:
			method5922(exec);
			break;
		case ACTIVECLANSETTINGS_GETALLOWUNAFFINED:
			method8701(exec);
			break;
		case ACTIVECLANSETTINGS_GETRANKTALK:
			method5902(exec);
			break;
		case ACTIVECLANSETTINGS_GETRANKKICK:
			method1889(exec);
			break;
		case ACTIVECLANSETTINGS_GETRANKLOOTSHARE:
			method7274(exec);
			break;
		case ACTIVECLANSETTINGS_GETCOINSHARE:
			method1135(exec);
			break;
		case ACTIVECLANSETTINGS_GETAFFINEDCOUNT:
			method1802(exec);
			break;
		case ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME:
			method8037(exec);
			break;
		case ACTIVECLANSETTINGS_GETAFFINEDRANK:
			method2102(exec);
			break;
		case ACTIVECLANSETTINGS_GETBANNEDCOUNT:
			method1171(exec);
			break;
		case ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME:
			method3779(exec);
			break;
		case ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO:
			method5362(exec);
			break;
		case ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT:
			method933(exec);
			break;
		case ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT:
			method4295(exec);
			break;
		case ACTIVECLANSETTINGS_GETAFFINEDSLOT:
			method3361(exec);
			break;
		case ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT:
			method6205(exec);
			break;
		case UNUSED_CLAN_OP:
			method15075(exec);
			break;
		case ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY:
			method6741(exec);
			break;
		case ACTIVECLANCHANNEL_FIND_LISTENED:
			method1501(exec);
			break;
		case ACTIVECLANCHANNEL_FIND_AFFINED:
			method13046(exec);
			break;
		case ACTIVECLANCHANNEL_GETCLANNAME:
			method811(exec);
			break;
		case ACTIVECLANCHANNEL_GETRANKKICK:
			method14644(exec);
			break;
		case ACTIVECLANCHANNEL_GETRANKTALK:
			method3021(exec);
			break;
		case ACTIVECLANCHANNEL_GETUSERCOUNT:
			method13410(exec);
			break;
		case ACTIVECLANCHANNEL_GETUSERDISPLAYNAME:
			method1979(exec);
			break;
		case ACTIVECLANCHANNEL_GETUSERRANK:
			method6677(exec);
			break;
		case ACTIVECLANCHANNEL_GETUSERWORLD:
			method3169(exec);
			break;
		case ACTIVECLANCHANNEL_KICKUSER:
			method4968(exec);
			break;
		case ACTIVECLANCHANNEL_GETUSERSLOT:
			method3043(exec);
			break;
		case ACTIVECLANCHANNEL_GETSORTEDUSERSLOT:
			method471(exec);
			break;
		case CLAN_VARS_ENABLED:
			clanVarsEnabled(exec);
			break;
		case STOCKMARKET_GETOFFERTYPE:
			method6231(exec);
			break;
		case STOCKMARKET_GETOFFERITEM:
			getGEOfferItem(exec);
			break;
		case STOCKMARKET_GETOFFERPRICE:
			getGEOfferPrice(exec);
			break;
		case STOCKMARKET_GETOFFERCOUNT:
			method3802(exec);
			break;
		case STOCKMARKET_GETOFFERCOMPLETEDCOUNT:
			method7715(exec);
			break;
		case STOCKMARKET_GETOFFERCOMPLETEDGOLD:
			method6206(exec);
			break;
		case STOCKMARKET_ISOFFEREMPTY:
			method6797(exec);
			break;
		case STOCKMARKET_ISOFFERSTABLE:
			method8716(exec);
			break;
		case STOCKMARKET_ISOFFERFINISHED:
			method1951(exec);
			break;
		case STOCKMARKET_ISOFFERADDING:
			method5297(exec);
			break;
		case ADD:
			add(exec);
			break;
		case SUBTRACT:
			subtract(exec);
			break;
		case MULTIPLY:
			multiply(exec);
			break;
		case DIVIDE:
			divide(exec);
			break;
		case RANDOM:
			random(exec);
			break;
		case RANDOM_INCLUSIVE:
			randomInclusive(exec);
			break;
		case INTERPOLATE:
			interpolate(exec);
			break;
		case ADD_PERCENT:
			addPercent(exec);
			break;
		case SET_BIT:
			setBit(exec);
			break;
		case CLEAR_BIT:
			clearBit(exec);
			break;
		case BIT_FLAGGED:
			bitFlagged(exec);
			break;
		case MODULO:
			modulo(exec);
			break;
		case POW:
			pow(exec);
			break;
		case POW_INVERSE:
			powInverse(exec);
			break;
		case BIT_AND:
			bitAnd(exec);
			break;
		case BIT_OR:
			bitOr(exec);
			break;
		case MIN:
			min(exec);
			break;
		case MAX:
			max(exec);
			break;
		case SCALE:
			scale(exec);
			break;
		case RANDOM_SOUND_PITCH:
			randSoundPitch(exec);
			break;
		case HSVTORGB:
			hsvToRGB(exec);
			break;
		case BIT_NOT:
			bitNot(exec);
			break;
		case APPEND_NUM:
			strAppendNum(exec);
			break;
		case APPEND:
			strAppend(exec);
			break;
		case APPEND_SIGNNUM:
			strAppendSigNum(exec);
			break;
		case GET_COL_TAG:
			getColTag(exec);
			break;
		case LOWERCASE:
			lowerString(exec);
			break;
		case FROMDATE:
			fromDate(exec);
			break;
		case TEXT_GENDER:
			textGender(exec);
			break;
		case TOSTRING:
			toString(exec);
			break;
		case COMPARE:
			stringEqual(exec);
			break;
		case PARAHEIGHT:
			method3346(exec);
			break;
		case PARAWIDTH:
			method5735(exec);
			break;
		case TEXT_SWITCH:
			method7556(exec);
			break;
		case ESCAPE:
			method5456(exec);
			break;
		case APPEND_CHAR:
			method6117(exec);
			break;
		case CHAR_ISPRINTABLE:
			method4252(exec);
			break;
		case CHAR_ISALPHANUMERIC:
			method8218(exec);
			break;
		case CHAR_ISALPHA:
			method3068(exec);
			break;
		case CHAR_ISNUMERIC:
			method550(exec);
			break;
		case STRING_LENGTH:
			stringLength(exec);
			break;
		case SUBSTRING:
			method8839(exec);
			break;
		case REMOVETAGS:
			method3937(exec);
			break;
		case STRING_INDEXOF_CHAR:
			method5915(exec);
			break;
		case STRING_INDEXOF_STRING:
			method3547(exec);
			break;
		case CHAR_TOLOWERCASE:
			method3951(exec);
			break;
		case CHAR_TOUPPERCASE:
			method6373(exec);
			break;
		case TOSTRING_LOCALISED:
			method6691(exec);
			break;
		case STRINGWIDTH:
			method1854(exec);
			break;
		case FORMAT_DATETIME_FROM_MINUTES:
			method3830(exec);
			break;
		case CLANFORUMQFC_TOSTRING:
			method6139(exec);
			break;
		case ITEM_NAME:
			method4247(exec);
			break;
		case ITEM_OP:
			method3042(exec);
			break;
		case ITEM_IOP:
			method4202(exec);
			break;
		case ITEM_COST:
			method6284(exec);
			break;
		case ITEM_STACKABLE:
			method11406(exec);
			break;
		case ITEM_CERT:
			method12215(exec);
			break;
		case ITEM_UNCERT:
			method12724(exec);
			break;
		case ITEM_WEARPOS:
			method7445(exec);
			break;
		case ITEM_WEARPOS2:
			method5765(exec);
			break;
		case ITEM_WEARPOS3:
			method6781(exec);
			break;
		case ITEM_MEMBERS:
			method5198(exec);
			break;
		case ITEM_PARAM:
			getItemParam(exec);
			break;
		case OC_ICURSOR:
			method4630(exec);
			break;
		case ITEM_FIND:
			method5691(exec);
			break;
		case ITEM_FINDNEXT:
			method2868(exec);
			break;
		case OC_FINDRESTART:
			method4315(exec);
			break;
		case ITEM_MULTISTACKSIZE:
			method3229(exec);
			break;
		case ITEM_FIND_PARAMINT:
			method4089(exec);
			break;
		case ITEM_FIND_PARAMSTR:
			method6400(exec);
			break;
		case ITEM_MINIMENU_COLOUR_OVERRIDDEN:
			method3030(exec);
			break;
		case ITEM_MINIMENU_COLOUR:
			method911(exec);
			break;
		case NPC_PARAM:
			getNPCParam(exec);
			break;
		case OBJECT_PARAM:
			getObjectParam(exec);
			break;
		case STRUCT_PARAM:
			getStructParam(exec);
			break;
		case ANIMATION_PARAM:
			getAnimationParam(exec);
			break;
		case BAS_GETANIM_READY:
			method15408(exec);
			break;
		case UNUSED_LOGIN_GLOBAL_BOOL: //related
			method5755(exec);
			break;
		case UNUSED_PACKET_SEND_STRING: //related
			sendAClass379_4624(exec);
			break;
		case UNUSED_PACKET_SET_GLOBAL_BYTE: //related
			method546(exec);
			break;
		case CHAT_GETFILTER_PUBLIC:
			method2872(exec);
			break;
		case CHAT_SETFILTER:
			method11371(exec);
			break;
		case CHAT_SENDABUSEREPORT:
			sendReportAbusePacket(exec);
			break;
		case instr6560: //CHAT_GETHISTORY_BYUID
			method2824(exec);
			break;
		case instr6739: //CHAT_GETHISTORY_BYTYPEANDLINE
			method15512(exec);
			break;
		case instr6562: //CHAT_GETFILTER_PRIVATE
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
		case CHAT_PLAYERNAME:
			method8717(exec);
			break;
		case CHAT_GETFILTER_TRADE:
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
		case GETCLIPBOARD:
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
		case IS_GAMESCREEN_STATE:
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
		case SEND_SIGNUP_FORM_PACKET:
			sendSignupFormPacket(exec);
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
		case DETAIL_LIGHTDETAIL_HIGH:
			method451(exec);
			break;
		case DETAIL_WATERDETAIL_HIGH:
			method3693(exec);
			break;
		case instr6731:
			method12803(exec);
			break;
		case instr6674:
			method14647(exec);
			break;
		case DETAIL_STEREO:
			method3942(exec);
			break;
		case DETAIL_SOUNDVOL:
			method3599(exec);
			break;
		case DETAIL_MUSICVOL:
			method2554(exec);
			break;
		case DETAIL_BGSOUNDVOL:
			method12718(exec);
			break;
		case DETAIL_REMOVEROOFS_OPTION_OVERRIDE:
			method6397(exec);
			break;
		case DETAIL_PARTICLES:
			method11218(exec);
			break;
		case DETAIL_ANTIALIASING_DEFAULT:
			method4168(exec);
			break;
		case DETAIL_BUILDAREA:
			method5766(exec);
			break;
		case DETAIL_BLOOM:
			setBloom(exec);
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
		case DETAILGET_WATERDETAIL_HIGH:
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
			method5010(exec); //setgamehost
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
		case WORLDLIST_PINGWORLDS:
			setPingWorlds(exec);
			break;
		case instr6589:
			method3039(exec);
			break;
		case IF_DEBUG_GETOPENIFCOUNT:
			method927(exec);
			break;
		case IF_DEBUG_GETOPENIFID:
			method11613(exec);
			break;
		case IF_DEBUG_GETNAME:
			method7006(exec);
			break;
		case IF_DEBUG_GETCOMCOUNT:
			method5904(exec);
			break;
		case IF_DEBUG_GETCOMNAME:
			method3341(exec);
			break;
		case IF_DEBUG_GETSERVERTRIGGERS:
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
		case MEC_TEXT:
			method15616(exec);
			break;
		case MEC_SPRITE:
			method1255(exec);
			break;
		case MEC_TEXTSIZE:
			method3755(exec);
			break;
		case MEC_CATEGORY:
			method290(exec);
			break;
		case MEC_PARAM:
			getWorldMapParam(exec);
			break;
		case USERDETAIL_QUICKCHAT:
			method5832(exec);
			break;
		case USERDETAIL_LOBBY_MEMBERSHIP:
			method1499(exec);
			break;
		case USERDETAIL_LOBBY_RECOVERYDAY:
			method14655(exec);
			break;
		case USERDETAIL_LOBBY_UNREADMESSAGES:
			method7915(exec);
			break;
		case USERDETAIL_LOBBY_LASTLOGINDAY:
			method12859(exec);
			break;
		case USERDETAIL_LOBBY_LASTLOGINADDRESS:
			method7462(exec);
			break;
		case USERDETAIL_LOBBY_EMAILSTATUS:
			method3894(exec);
			break;
		case USERDETAIL_LOBBY_CCEXPIRY:
			method1357(exec);
			break;
		case USERDETAIL_LOBBY_GRACEEXPIRY:
			method1855(exec);
			break;
		case USERDETAIL_LOBBY_DOBREQUESTED:
			method12352(exec);
			break;
		case USERDETAIL_DOB:
			method586(exec);
			break;
		case USERDETAIL_LOBBY_MEMBERSSTATS:
			method13467(exec);
			break;
		case USERDETAIL_LOBBY_PLAYAGE:
			method8869(exec);
			break;
		case USERDETAIL_LOBBY_JCOINS_BALANCE:
			method1816(exec);
			break;
		case USERDETAIL_LOBBY_LOYALTY_ENABLED:
			method1351(exec);
			break;
		case USERDETAIL_LOBBY_LOYALTY_BALANCE:
			method6046(exec);
			break;
		case instr6852:
			method1590(exec);
			break;
		case AUTOSETUP_SETHIGH:
			method3233(exec);
			break;
		case AUTOSETUP_SETMEDIUM:
			method7773(exec);
			break;
		case AUTOSETUP_SETLOW:
			method15306(exec);
			break;
		case AUTOSETUP_SETMIN:
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
		case DETAILCANMOD_GROUNDDECOR:
			method1862(exec);
			break;
		case DETAILCANMOD_CHARSHADOWS:
			method15371(exec);
			break;
		case DETAILCANMOD_SPOTSHADOWS:
			method4989(exec);
			break;
		case DETAILCANMOD_WATERDETAIL:
			method2588(exec);
			break;
		case DETAILCANMOD_ANTIALIASING:
			method8343(exec);
			break;
		case DETAILCANMOD_PARTICLES:
			method5767(exec);
			break;
		case DETAILCANMOD_BUILDAREA:
			method11147(exec);
			break;
		case DETAILCANMOD_BLOOM:
			method6072(exec);
			break;
		case DETAILCANMOD_GROUNDBLENDING:
			method8844(exec);
			break;
		case DETAILCANMOD_TEXTURING:
			method743(exec);
			break;
		case DETAILCANMOD_MAXSCREENSIZE:
			method7552(exec);
			break;
		case DETAILCANMOD_FOG:
			method5065(exec);
			break;
		case DETAILCANMOD_TOOLKIT_DEFAULT:
			method7420(exec);
			break;
		case DETAILCANMOD_TOOLKIT:
			method3781(exec);
			break;
		case DETAILCANMOD_SKYBOXES:
			method1574(exec);
			break;
		case DETAILCANSET_GROUNDDECOR:
			method11341(exec);
			break;
		case DETAILCANSET_CHARSHADOWS:
			method15551(exec);
			break;
		case DETAILCANSET_SPOTSHADOWS:
			method11351(exec);
			break;
		case DETAILCANSET_WATERDETAIL:
			method3713(exec);
			break;
		case DETAILCANSET_ANTIALIASING:
			method7218(exec);
			break;
		case DETAILCANSET_PARTICLES:
			method6279(exec);
			break;
		case DETAILCANSET_BUILDAREA:
			method14649(exec);
			break;
		case DETAILCANSET_BLOOM:
			method4413(exec);
			break;
		case DETAILCANSET_GROUNDBLENDING:
			method1352(exec);
			break;
		case DETAILCANSET_TEXTURING:
			method1572(exec);
			break;
		case DETAILCANSET_MAXSCREENSIZE:
			method12596(exec);
			break;
		case DETAILCANSET_FOG:
			method15407(exec);
			break;
		case DETAILCANSET_TOOLKIT_DEFAULT:
			method1968(exec);
			break;
		case DETAILCANSET_RENDERER:
			method2108(exec);
			break;
		case DETAILCANSET_SKYBOXES:
			method4867(exec);
			break;
		case instr6388:
			method543(exec);
			break;
		case instr6902: //get entity interface id?
			method261(exec);
			break;
		case GET_ENTITY_SAY:
			method6281(exec);
			break;
		case GET_DISPLAYNAME_WITHEXTRAS:
			method6730(exec);
			break;
		case instr6905:
			method5814(exec);
			break;
		case instr6906:
			method12586(exec);
			break;
		case GET_NPC_NAME:
			method12915(exec);
			break;
		case instr6908:
			method1784(exec);
			break;
		case GET_ENTITY_SCREEN_POSITION:
			method6190(exec);
			break;
		case IF_GET_GAMESCREEN:
			method14606(exec);
			break;
		case instr6911:
			method2867(exec);
			break;
		case GET_NPC_STAT:
			method2639(exec);
			break;
		case IS_NPC_ACTIVE:
			method300(exec);
			break;
		case IS_NPC_VISIBLE:
			method3740(exec);
			break;
		case IS_TARGETED_ENTITY:
			method3344(exec);
			break;
		case IF_DELETEALL:
			method4830(exec);
			break;
		case NPC_TYPE:
			method2103(exec);
			break;
		case GET_OBJECT_SCREEN_POSITION:
			method5692(exec);
			break;
		case GET_ITEM_SCREEN_POSITION:
			method4137(exec);
			break;
		case GET_OBJECT_OVERLAY_HEIGHT:
			method6042(exec);
			break;
		case GET_ITEM_OVERLAY_HEIGHT:
			method3769(exec);
			break;
		case GET_OBJECT_BOUNDING_BOX:
			method7332(exec);
			break;
		case GET_ITEM_BOUNDING_BOX:
			method798(exec);
			break;
		case GET_ENTITY_BOUNDING_BOX:
			method3067(exec);
			break;
		case BUG_REPORT:
			method5298(exec);
			break;
		case ARRAY_SORT:
			method8700(exec);
			break;
		case QUEST_GETNAME:
			method2101(exec);
			break;
		case QUEST_GETSORTNAME:
			method5736(exec);
			break;
		case QUEST_TYPE:
			method356(exec);
			break;
		case QUEST_GETDIFFICULTY:
			method7434(exec);
			break;
		case QUEST_GETMEMBERS:
			method7461(exec);
			break;
		case QUEST_POINTS:
			method1799(exec);
			break;
		case QUEST_QUESTREQ_COUNT:
			method5016(exec);
			break;
		case QUEST_QUESTREQ:
			method777(exec);
			break;
		case QUEST_QUESTREQ_MET:
			method4314(exec);
			break;
		case QUEST_POINTSREQ:
			method3753(exec);
			break;
		case QUEST_POINTSREQ_MET:
			method466(exec);
			break;
		case QUEST_STATREQ_COUNT:
			method2953(exec);
			break;
		case QUEST_STATREQ_STAT:
			method2092(exec);
			break;
		case QUEST_STATREQ_LEVEL:
			method2841(exec);
			break;
		case QUEST_STATREQ_MET:
			method14841(exec);
			break;
		case QUEST_VARPREQ_COUNT:
			method868(exec);
			break;
		case QUEST_VARPREQ_DESC:
			method3553(exec);
			break;
		case QUEST_VARPREQ_MET:
			method1067(exec);
			break;
		case QUEST_VARBITREQ_COUNT:
			method7083(exec);
			break;
		case QUEST_VARBITREQ_DESC:
			method11592(exec);
			break;
		case QUEST_VARBITREQ_MET:
			method12587(exec);
			break;
		case QUEST_ALLREQMET:
			method4556(exec);
			break;
		case QUEST_STARTED:
			method8216(exec);
			break;
		case QUEST_FINISHED:
			method5290(exec);
			break;
		case QUEST_PARAM:
			method4249(exec);
			break;
		default:
			throw new RuntimeException();
		}

	}

	static final void ccSetFront(boolean bool, CS2Executor executor) {
		CS2Interface underlaydefinition_3 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_3.defs;
		RSInterface interface_5 = underlaydefinition_3.inter;
		if (bool) {
			RSInterface.method7554(interface_5, icomponentdefinitions_4);
		} else {
			RSInterface.method3710(interface_5, icomponentdefinitions_4);
		}
	}

	static final void ifSetFront(boolean bool, CS2Executor executor) {
		int i_3 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_4 = IComponentDefinitions.getDefs(i_3);
		RSInterface interface_5 = CustomCursorsPreference.INTERFACES[i_3 >> 16];
		if (bool) {
			RSInterface.method7554(interface_5, icomponentdefinitions_4);
		} else {
			RSInterface.method3710(interface_5, icomponentdefinitions_4);
		}

	}

	static final void method5755(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7323 ? 1 : 0;
	}

	static final void method5756(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method1454(icomponentdefinitions_3, interface_4, executor, (byte) 50);
	}

	static final void method5758(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method7927(icomponentdefinitions_3, executor, (byte) -98);
	}

	static final void method3546(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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
		Class393.preferences.setValue(Class393.preferences.particles, i_2);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method12209(icomponentdefinitions_3, interface_4, executor);
	}

	static final void getWaterPreference(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.water.getValue() == 2 ? 1 : 0;
	}

	static final void method7522(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method6122(icomponentdefinitions_3, interface_4, executor);
	}

	static final void getMyPlayerPos(CS2Executor executor) {
		byte b_2 = VertexNormal.MY_PLAYER.plane;
		Vector3 vector3_3 = VertexNormal.MY_PLAYER.method11166().coords;
		WorldTile coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getBase();
		int i_5 = ((int) vector3_3.x >> 9) + coordgrid_4.x;
		int i_6 = ((int) vector3_3.z >> 9) + coordgrid_4.y;
		executor.intStack[++executor.intStackPtr - 1] = (i_5 << 14) + i_6 + (b_2 << 28);
	}

	static final void method15510(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method506(icomponentdefinitions_3, interface_4, executor, 73822298);
	}

	static final void method15512(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		ifSetColor(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method2865(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method11337(icomponentdefinitions_3, interface_4, executor, -1404316012);
	}

	static final void method2866(CS2Executor executor) {
		if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
			UID192.method7373(Class393.preferences.screenSize.method12687(-580037051), -1, -1, false, (byte) 116);
		}
		if (NamedFileReference.method867(-391014767) == Class279.aClass279_3368) {
			Node_Sub11.method12211(-541554902);
			System.exit(0);
		} else {
			Class480.method8043(-25732624);
		}
	}

	static final void method2867(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentEntity.method12997();
	}

	static final void method2868(CS2Executor executor) {
		if (Class308.CS2_QUERY_RESULTS != null && Class283.CS2_QUERY_RESULT_IDX < VarcDefinitions.CS2_QUERY_RESULTS_LEN) {
			executor.intStack[++executor.intStackPtr - 1] = Class308.CS2_QUERY_RESULTS[++Class283.CS2_QUERY_RESULT_IDX - 1] & 0xffff;
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
		executor.intStack[++executor.intStackPtr - 1] = (int) client.camAngleY >> 3;
	}

	static final void method12572(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		CacheableNode_Sub6 class282_sub50_sub6_3 = Class125.method2173(1467773242);
		if (class282_sub50_sub6_3 != null) {
			boolean bool_4 = class282_sub50_sub6_3.method14775(i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Executor.anIntArray5900, -169630584);
			if (bool_4) {
				executor.intStack[++executor.intStackPtr - 1] = CS2Executor.anIntArray5900[1];
				executor.intStack[++executor.intStackPtr - 1] = CS2Executor.anIntArray5900[2];
			} else {
				executor.intStack[++executor.intStackPtr - 1] = -1;
				executor.intStack[++executor.intStackPtr - 1] = -1;
			}
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
			executor.intStack[++executor.intStackPtr - 1] = -1;
		}
	}

	static final void setPingWorlds(CS2Executor executor) {
		if (client.gameState == 0) {
			Class448.PING_WORLDS = executor.intStack[--executor.intStackPtr] == 1;
		}
	}

	static final void method8714(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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
		if (VertexNormal.MY_PLAYER != null && VertexNormal.MY_PLAYER.username != null) {
			string_2 = VertexNormal.MY_PLAYER.getUsernameWithTitle();
		} else {
			string_2 = "";
		}
		executor.stringStack[++executor.stringStackPtr - 1] = string_2;
	}

	static final void method8718(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.aClass191_7008 = new Class191(string_2);
	}

	static final void scale(CS2Executor executor) {
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolKit.method12774() ? 1 : 0;
	}

	static final void method3783(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
		int i_4 = -1;
		if (chatline_3 != null) {
			i_4 = chatline_3.quickchatMessageId;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_4;
	}

	static void method3553(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).varpRequirementNames[executor.intStack[executor.intStackPtr - 1]];
		executor.intStackPtr -= 2;
	}

	static final void method3554(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method8754(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3555(CS2Executor executor) {
		Class42.playSoundSong(executor.intStack[--executor.intStackPtr], 255, 50, (byte) 39);
	}

	static final void method3556(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		CacheableNode_Sub6 class282_sub50_sub6_3 = Class125.method2173(1333145388);
		if (class282_sub50_sub6_3 != null) {
			boolean bool_4 = class282_sub50_sub6_3.method14778(i_2 >> 28 & 0x3, i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Executor.anIntArray5900, -1889413502);
			if (bool_4) {
				FontRenderer_Sub2.method14263(CS2Executor.anIntArray5900[1], CS2Executor.anIntArray5900[2]);
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
		BufferedConnectionContext class184_2 = Preference_Sub20.getConnectionContext();
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.QUICKCHAT_PUBLIC, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(2);
		tcpmessage_3.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
		executor.currentQuickChatMessage.qcMessageDefs.method14896(tcpmessage_3.buffer, executor.currentQuickChatMessage.anIntArray4046, -463581846);
		tcpmessage_3.buffer.writeIndex(tcpmessage_3.buffer.index - i_4);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void method471(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = executor.clanChannel.getSortedPlayersByName()[executor.intStack[executor.intStackPtr - 1]];
	}

	static final void multiply(CS2Executor executor) {
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
		CutsceneAction_Sub10.method14603(4, i_2 << 16 | i_3, i_4, "", (byte) 73);
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
		if (i_2 != Class393.preferences.aPreference_Sub11_8217.method12699((byte) -18)) {
			Class393.preferences.setValue(Class393.preferences.aPreference_Sub11_8217, i_2);
			Class190.savePreferences((byte) 116);
			client.aBool7175 = false;
		}
	}

	static final void method1590(CS2Executor executor) {
		int i_2 = ApplyHitmarkCutsceneAction.method14641();
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
				Object object_3 = Class361.aClass361_4178.method6254(new Object[] { Integer.valueOf(Class504.PLAYER_DOB), Boolean.valueOf(VertexNormal.MY_PLAYER.male == 1), Integer.valueOf(executor.intStack[--executor.intStackPtr]) }, (byte) 69);
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
		Node_Sub29.method12426();
	}

	static final void method6279(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.particles.checkValid(i_2);
	}

	static final void method6280(CS2Executor executor) {
		client.aBool7189 = true;
		Class188.method3142(69417195);
	}

	static final void method6281(CS2Executor executor) {
		Class163 class163_2 = executor.currentEntity.method15811(767923452);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method14892(icomponentdefinitions_3, interface_4, executor, (byte) 79);
	}

	static final void setCCFont(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setIfFont(icomponentdefinitions_3, interface_4, executor, 1949391932);
	}

	static final void method8263(CS2Executor executor) {
		if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
			UID192.method7373(Class393.preferences.screenSize.method12687(577867050), -1, -1, false, (byte) 35);
		}
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		boolean bool_3 = executor.intStack[--executor.intStackPtr] == 1;
		String string_4 = MapAreaDefinitions.method3741() + string_2;
		CacheableNode_Sub6.method14788(string_4, bool_3, Class393.preferences.currentToolkit.getValue(-1739196165) == 5, client.aBool7158, client.aBool7159, (byte) -52);
	}

	static final void getNPCParam(CS2Executor executor) {
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

	static final void addPercent(CS2Executor executor) {
		executor.intStackPtr -= 2;
		long long_2 = (long) executor.intStack[executor.intStackPtr];
		long long_4 = (long) executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = (int) (long_2 + long_2 * long_4 / 100L);
	}

	static final void method3892(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method3078(icomponentdefinitions_3, interface_4, executor, 64340405);
	}

	static final void method3893(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.buildArea.method12615(-1794676778);
	}

	static final void method3894(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = InputSubscriberType.EMAIL_STATUS;
	}

	static final void getPlayerGender(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = VertexNormal.MY_PLAYER.playerAppearance != null && VertexNormal.MY_PLAYER.playerAppearance.gender ? 1 : 0;
	}

	static final void method4881(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.soundEffectVolume.method12714();
	}

	static final void method4882(CS2Executor executor) {
		Class492.method8265(0, 0, client.GAME_SCREEN_INTERFACE.width, client.GAME_SCREEN_INTERFACE.height, false, (byte) -37);
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7188;
		executor.intStack[++executor.intStackPtr - 1] = client.anInt7440;
	}

	static final void storeVarc(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		Class320.VARC_INT[i_2] = executor.intStack[--executor.intStackPtr];
		Node_Sub20_Sub11.method15264(i_2);
		client.aBool7400 |= Node_Sub17_Sub2.VARC_BOOL[i_2];
	}

	static final void method5099(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method4159(icomponentdefinitions_3, interface_4, executor, -1802550840);
	}

	static final void method5100(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class41_Sub1_Sub1.method15524();
	}

	static final void method13408(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method1642(icomponentdefinitions_3, interface_4, executor, -441010369);
	}

	static final void method12859(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Preference_Sub28.LASTLOGINLDAY;
	}

	static final void method2978(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.antiAliasingDefault.method12641(-255008598);
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
			if (i_2 != enumdefinitions_5.valueType) {
				throw new RuntimeException();
			} else {
				int[] ints_6 = enumdefinitions_5.method7251(Integer.valueOf(i_4));
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
		executor.intStack[++executor.intStackPtr - 1] = fontmetrics_4.getTextWidth(string_2, Class182.aNativeSpriteArray2261);
	}

	static final void method1855(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = UID192.anInt5357;
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
		Class393.preferences.setValue(Class393.preferences.customCursors, executor.intStack[--executor.intStackPtr] != 0 ? 1 : 0);
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
			CutsceneEntityMovement.method1575(i_2, i_3, false);
		}
	}

	static final void setCCText(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setCompText(icomponentdefinitions_3, interface_4, executor, -1950907302);
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
		Class393.preferences.setValue(Class393.preferences.characterShadows, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
		Class190.savePreferences((byte) 106);
		client.aBool7175 = false;
	}

	static final void emailValidationAddNewAddress(CS2Executor executor) {
		--executor.stringStackPtr;
		executor.intStackPtr -= 3;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		boolean bool_3 = executor.intStack[executor.intStackPtr] == 1;
		boolean bool_4 = executor.intStack[executor.intStackPtr + 1] == 1;
		boolean bool_5 = executor.intStack[executor.intStackPtr + 2] == 1;
		TCPPacket tcpmessage_6 = Class271.createPacket(ClientPacket.EMAIL_VALIDATION_ADD_NEW_ADDRESS, client.LOBBY_CONNECTION_CONTEXT.isaac);
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
		client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_6);
	}

	static final void method5829(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Static.method2094(i_2);
	}

	static final void randomInclusive(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = (int) (Math.random() * (double) (i_2 + 1));
	}

	static final void method5832(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.USERDETAIL_QUICKCHAT && !client.VERIFIED_EMAIL_ADDRESS ? 1 : 0;
	}

	static final void method5833(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method13468(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method12659(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method7142(icomponentdefinitions_4, interface_5, executor, -1755364676);
	}

	static final void method12660(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = i_3 >> 14 & 0x3fff;
		int i_5 = i_3 & 0x3fff;
		int i_6 = Preference_Sub11.method12702(i_2, i_4, i_5);
		if (i_6 < 0) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = i_6;
		}
	}

	static final void method13410(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.numPlayers;
	}

	static final void method12925(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spritePitch;
	}

	static final void method1864(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		if (icomponentdefinitions_3.useOnName == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.useOnName;
		}
	}

	static final void method7928(CS2Executor executor) {
		Class371.method6353();
	}

	static final void method741(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method6288(icomponentdefinitions_3, interface_4, executor, (short) 25412);
	}

	static final void method8844(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundBlending.method12761() ? 1 : 0;
	}

	static final void getAnimationParam(CS2Executor executor) {
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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
		executor.intStack[++executor.intStackPtr - 1] = client.AFFILIATE;
	}

	static final void method6800(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method12630(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method15475(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method5291(icomponentdefinitions_3, interface_4, executor, 464841858);
	}

	static final void method3079(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.textures, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
		Class190.savePreferences((byte) 119);
		Class94.method1589();
		client.aBool7175 = false;
	}

	static final void method3080(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setItemIFComp(icomponentdefinitions_3, interface_4, false, 2, executor, (byte) -57);
	}

	static final void method15399(CS2Executor executor) {
		QuestIndexLoader.method4167((String) executor.stringStack[--executor.stringStackPtr]);
	}

	static final void method6796(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.y;
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
		if (CustomCursorsPreference.INTERFACES[i_2] == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			String string_3 = CustomCursorsPreference.INTERFACES[i_2].components[0].name;
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		ifSetNPCHead(icomponentdefinitions_3, interface_4, executor, 258036500);
	}

	static final void method4864(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method15474(icomponentdefinitions_3, interface_4, executor, (byte) 126);
	}

	static final void method4865(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		method1494(icomponentdefinitions_3, executor);
	}

	static final void method4867(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.skyBoxes.checkValid(i_2);
	}

	static final void storeVarcString(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		Class462.VARC_STRING[i_2] = (String) executor.stringStack[--executor.stringStackPtr];
		Node_Sub20_Sub10.method15263(i_2);
	}

	static final void hideComp(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method786(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method5302(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method1852(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method11125(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollX;
	}

	static final void method11126(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method1455(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method11128(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		CutsceneAction_Sub10.method14603(2, i_2 << 16 | i_3, i_4, "", (byte) 10);
	}

	static final void method5901(CS2Executor executor) {
		executor.intStackPtr -= 4;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		EnumDefinitions enumDefinitions = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_4);
		if (i_2 == enumDefinitions.keyType && i_3 == enumDefinitions.valueType) {
			if (i_3 == 's') {
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
		if (CustomCursorsPreference.INTERFACES[i_2] == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = CustomCursorsPreference.INTERFACES[i_2].components.length;
		}
	}

	static final void method6668(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int ifComp = executor.intStack[executor.intStackPtr];
		int slotId = executor.intStack[executor.intStackPtr + 1];
		CS2Interface inter;
		if (executor.aBool7022) {
			inter = executor.hookedInterface2;
		} else {
			inter = executor.hookedInterface1;
		}
		executor.intStack[++executor.intStackPtr - 1] = slotId != -1 && inter.setChild(ifComp, slotId) ? 1 : 0;
	}

	static final void method6669(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.sceneryShadows.method12624((byte) -45);
	}

	static final void method6449(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.modelType == ModelType.RAW_MODEL ? icomponentdefinitions_3.modelId : -1;
	}

	static final void method6452(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method5291(icomponentdefinitions_3, interface_4, executor, 989451427);
	}

	static final void method4030(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method3365(icomponentdefinitions_3, interface_4, executor, -296742554);
	}

	static final void method4031(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.leftButtonDown() ? 1 : 0;
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.rightButtonDown() ? 1 : 0;
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.middleButtonDown() ? 1 : 0;
	}

	static final void method4033(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method14653(icomponentdefinitions_3, interface_4, executor, -1617819065);
	}

	static final void method4035(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.maxScreenSize, executor.intStack[--executor.intStackPtr]);
		Class190.savePreferences((byte) 112);
		client.aBool7185 = true;
	}

	static final void min(CS2Executor executor) {
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.characterShadows.checkValid(i_2);
	}

	static final void method4277(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.containerItemId;
	}

	static final void method4278(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class402.deleteFriend(string_2);
	}

	static final void method4279(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class293.method5206();
	}

	static final void method4283(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method11221(icomponentdefinitions_3, interface_4, executor);
	}

	static final void setItem(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (VertexNormal.MY_PLAYER.playerAppearance != null) {
			VertexNormal.MY_PLAYER.playerAppearance.setItem(i_2, i_3, IndexLoaders.ITEM_LOADER);
		}
	}

	static final void method775(CS2Executor executor) {
		CursorIndexLoader.method7333(false, 2001834911);
	}

	static void method777(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).questPrerequisiteIds[executor.intStack[executor.intStackPtr - 1]];
		--executor.intStackPtr;
	}

	static final void method779(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		int i_4 = executor.intStack[--executor.intStackPtr];
		--i_4;
		if (icomponentdefinitions_3.optionNames != null && i_4 < icomponentdefinitions_3.optionNames.length && icomponentdefinitions_3.optionNames[i_4] != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.optionNames[i_4];
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method2960(icomponentdefinitions_3, interface_4, executor, 1289929299);
	}

	static final void method3065(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.angle2d;
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
		getBoundingBox(executor.currentEntity, executor);
	}

	static final void method3068(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class60.method1169((char) i_2) ? 1 : 0;
	}

	static final void method5008(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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
	
	static final void method12724(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		if (itemdefinitions_3.certTemplateId >= 0 && itemdefinitions_3.certId >= 0) {
			executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_3.certId;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = i_2;
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aPreference_Sub13_8229.method12714();
	}

	static final void ccSetAspect(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		ifSetAspect(icomponentdefinitions_3, interface_4, executor, -1411462408);
	}

	static final void method6283(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		ifSetNPCHead(icomponentdefinitions_3, interface_4, executor, 2042314343);
	}

	static final void method3357(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.buildArea.method12609() ? 1 : 0;
	}

	static final void method6205(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = executor.currentClanSettings.method1215()[executor.intStack[executor.intStackPtr - 1]];
	}

	static final void method6206(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].totalPrice;
	}

	static final void random(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = (int) (Math.random() * (double) i_2);
	}

	static final void method6210(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method789(icomponentdefinitions_3, interface_4, executor);
	}

	static final void strAppend(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		executor.stringStack[++executor.stringStackPtr - 1] = string_2 + string_3;
	}

	static final void method7929(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method506(icomponentdefinitions_3, interface_4, executor, -1252434200);
	}

	static final void getCompWidth(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.width;
	}

	static final void method7932(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (string_2.startsWith(Class76.getCrown(0)) || string_2.startsWith(Class76.getCrown(1))) {
			string_2 = string_2.substring(7);
		}
		executor.intStack[++executor.intStackPtr - 1] = Static.isFriend(string_2) ? 1 : 0;
	}

	static final void method7933(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method2741(icomponentdefinitions_3, interface_4, executor, (byte) 5);
	}

	static final void method893(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		ifSetModelOrigin(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method894(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
		int i_4 = -1;
		if (chatline_3 != null) {
			i_4 = chatline_3.time;
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.flickeringEffects.method12943(1554846172) == 1 ? 1 : 0;
	}

	static final void method12561(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 != -1) {
			CutsceneObject.method1563(i_2);
		}
	}

	static final void method4089(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.intStackPtr -= 3;
		int i_3 = executor.intStack[executor.intStackPtr];
		int i_4 = executor.intStack[executor.intStackPtr + 1];
		int i_5 = executor.intStack[executor.intStackPtr + 2];
		Node_Sub20_Sub8.queryItemParamInt(string_2, i_3 == 1, i_4, i_5);
		executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.CS2_QUERY_RESULTS_LEN;
	}

	static final void method4091(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class291.aCacheableNode_Sub6_3491 != null ? Class291.aCacheableNode_Sub6_3491.anInt9536 : -1;
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
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method14653(icomponentdefinitions_4, interface_5, executor, -1985356850);
	}

	static final void method14342(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method789(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method12933(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 >= 1 && i_2 <= 2) {
			UID192.method7373(i_2, -1, -1, false, (byte) 57);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method6313(icomponentdefinitions_3, interface_4, executor, 435475117);
	}

	static final void method8753(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
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
		if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
			executor.intStack[++executor.intStackPtr - 1] = Class467.FC_PLAYERS[i_2].rank;
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
			if (enumdefinitions_4.valueType != 115) {
				throw new RuntimeException();
			} else {
				int[] ints_5 = enumdefinitions_4.method7251(string_3);
				int i_6 = 0;
				if (ints_5 != null) {
					i_6 = ints_5.length;
				}
				executor.intStack[++executor.intStackPtr - 1] = i_6;
			}
		}
	}

	static final void getWorldMapParam(CS2Executor executor) {
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
		executor.intStack[++executor.intStackPtr - 1] = CutsceneAction_Sub20.method14668().getValue();
	}

	static final void method5122(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.fog.method13417(-1771623069) == 1 ? 1 : 0;
	}

	static final void method5123(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_4.scrollY;
	}

	static final void method14578(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollHeight;
	}

	static final void ifSetPosition(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setComponentPosition(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6687(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method14892(icomponentdefinitions_3, interface_4, executor, (byte) 121);
	}

	static final void method6688(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method6010(icomponentdefinitions_4, interface_5, executor, -1956215078);
	}

	static final void method6691(CS2Executor executor) {
		boolean bool_2 = executor.intStack[--executor.intStackPtr] != 0;
		int i_3 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = Connection.method3342((long) i_3, 0, bool_2, Class223.CURRENT_LANGUAGE, (byte) -28);
	}

	static final void method6695(CS2Executor executor) {
		Shader.method1774();
	}

	static final void method5691(CS2Executor executor) {
		String itemName = (String) executor.stringStack[--executor.stringStackPtr];
		int tradeableOnly = executor.intStack[--executor.intStackPtr];
		Node_Sub20_Sub36.queryItemNoParams(itemName, tradeableOnly == 1);
		executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.CS2_QUERY_RESULTS_LEN;
	}

	static final void method5692(CS2Executor executor) {
		AnimationDefinitions.method11148((Transform_Sub1) executor.currentSceneObject, executor.intStack[--executor.intStackPtr], -253954252);
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[0];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[1];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method5695(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
			executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[i_2].worldId;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void playSoundSynth(CS2Executor executor) {
		executor.intStackPtr -= 3;
		VarNPCMap.playSoundSynth(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], 255, 256);
	}

	static final void method3169(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.players[i_2].world;
	}

	static final void method4161(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class152.method2598().getValue();
	}

	static final void method4168(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.antiAliasingDefault, executor.intStack[--executor.intStackPtr]);
		Class190.savePreferences((byte) 102);
	}

	static final void method14644(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.minRankToKick;
	}

	static final void method12586(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		method2738(executor.currentEntity.inter, i_2 & 0xffff, i_3, i_4, executor.aBool7022, executor);
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
			if (i_2 != enumdefinitions_5.valueType) {
				throw new RuntimeException();
			} else {
				executor.intStack[++executor.intStackPtr - 1] = enumdefinitions_5.containsKey(Integer.valueOf(i_4)) ? 1 : 0;
			}
		}
	}

	static final void resumeCountDialog(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = 0;
		if (Class115.method1950(string_2, -1586612370)) {
			i_3 = Utils.parseInt(string_2);
		}
		TCPPacket tcpmessage_4 = Class271.createPacket(ClientPacket.RESUME_COUNTDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
		tcpmessage_4.buffer.writeInt(i_3);
		client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_4);
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

	static final void getObjectParam(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
		if (attributedefault_4.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefinitions(i_2).method7973(i_3, attributedefault_4.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefinitions(i_2).method7963(i_3, attributedefault_4.defaultInt, 1059658238);
		}
	}

	static final void setBaseIdentiKit(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (VertexNormal.MY_PLAYER.playerAppearance != null) {
			int i_4;
			for (i_4 = 0; i_4 < IdentikitDefinition.anIntArray428.length; i_4++) {
				if (IdentikitDefinition.anIntArray428[i_4] == i_2) {
					VertexNormal.MY_PLAYER.playerAppearance.method3993(i_4, i_3, IndexLoaders.IDENTIKIT_LOADER, -1891661545);
					return;
				}
			}
			for (i_4 = 0; i_4 < IdentikitDefinition.anIntArray422.length; i_4++) {
				if (IdentikitDefinition.anIntArray422[i_4] == i_2) {
					VertexNormal.MY_PLAYER.playerAppearance.method3993(i_4, i_3, IndexLoaders.IDENTIKIT_LOADER, 938562628);
					break;
				}
			}
		}
	}

	static final void resumeClanForumQFCDialog(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.RESUME_CLANFORUMQFCDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
		tcpmessage_3.buffer.writeByte(string_2.length() + 1);
		tcpmessage_3.buffer.writeString(string_2);
		client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
	}

	static final void method2871(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
			executor.stringStack[++executor.stringStackPtr - 1] = client.FRIENDS[i_2].worldName;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method2872(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.PUBLIC_FILTER;
	}

	static final void method2873(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.skyBoxes.method12728();
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
		executor.intStack[++executor.intStackPtr - 1] = Node_Sub25.method12402((char) i_2) ? 1 : 0;
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method8754(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3919(CS2Executor executor) {
		Class291_Sub1.aBool8027 = executor.intStack[--executor.intStackPtr] == 1;
	}

	static final void method3921(CS2Executor executor) {
		BufferedConnectionContext class184_2 = Preference_Sub20.getConnectionContext();
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.QUICKCHAT_PUBLIC, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(1);
		tcpmessage_3.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
		executor.currentQuickChatMessage.qcMessageDefs.method14896(tcpmessage_3.buffer, executor.currentQuickChatMessage.anIntArray4046, -245952501);
		tcpmessage_3.buffer.writeIndex(tcpmessage_3.buffer.index - i_4);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void method6138(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		method5001(icomponentdefinitions_3, executor, -1847769999);
	}

	static final void method6139(CS2Executor executor) {
		long long_2 = executor.longStack[--executor.longStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = long_2 == -1L ? "" : Long.toString(long_2, 36).toUpperCase();
	}

	static final void method6141(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method7547(icomponentdefinitions_3, interface_4, executor, 1462639259);
	}

	static final void method6142(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.fontId;
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.removeRoofs.method12952((byte) 83) == 2 ? 1 : 0;
	}

	static final void method5733(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.membersWorld ? 1 : 0;
	}

	static final void method5734(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.voiceOverVolume.method12714();
	}

	static final void method5735(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.intStackPtr -= 2;
		int i_3 = executor.intStack[executor.intStackPtr];
		int i_4 = executor.intStack[executor.intStackPtr + 1];
		FontMetrics fontmetrics_5 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, i_4, 1444002710);
		executor.intStack[++executor.intStackPtr - 1] = fontmetrics_5.method6951(string_2, i_3, Class182.aNativeSpriteArray2261, (byte) 76);
	}

	static void method5736(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]).sortName;
	}

	static final void method504(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = CS2Executor.anInt5904;
	}

	static void method1067(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).method4104(Class158_Sub1.PLAYER_VAR_PROVIDER, executor.intStack[executor.intStackPtr - 1]) ? 1 : 0;
		--executor.intStackPtr;
	}

	static final void method1069(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method13468(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1070(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		boolean bool_3 = executor.intStack[--executor.intStackPtr] == 1;
		Class76.method1360(string_2, bool_3);
		executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.CS2_QUERY_RESULTS_LEN;
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
		executor.intStack[++executor.intStackPtr - 1] = SendFinishedCutsceneAction.anInt8307;
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method2741(icomponentdefinitions_3, interface_4, executor, (byte) 59);
	}

	static void method3753(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).questpointRequirement;
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
		executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getContainerTotal(i_2, i_3, false);
	}

	static final void method1562(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = client.getIComponentSettings(icomponentdefinitions_3).getUseOptionFlags();
	}

	static void method2101(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]).name;
	}

	static final void method2102(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.memberRanks[i_2];
	}

	static final void method2103(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = ((NPC) executor.currentEntity).definitions.type;
	}

	static final void loadVarc(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class320.VARC_INT[executor.intOpValues[executor.instrPtr]];
	}

	static final void method6776(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method2955(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method5697(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2).method14898(1863942043);
	}

	static final void pow(CS2Executor executor) {
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setItemIFComp(icomponentdefinitions_3, interface_4, true, 0, executor, (byte) -16);
	}

	static final void method2564(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method910(icomponentdefinitions_3, interface_4, executor, 1996171820);
	}

	static final void sendAClass379_4624(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (client.gameState == 0 && !JS5CacheFile.method3360((byte) 72)) {
			if (string_2.length() > 20) {
				client.aByte7458 = -4;
			} else {
				client.aByte7458 = -1;
				TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.DEPRECATED_97_SERVERPACKET_52, client.LOBBY_CONNECTION_CONTEXT.isaac);
				tcpmessage_3.buffer.writeByte(0);
				int i_4 = tcpmessage_3.buffer.index;
				tcpmessage_3.buffer.writeString(string_2);
				tcpmessage_3.buffer.writeIndex(tcpmessage_3.buffer.index - i_4);
				client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
			}
		} else {
			client.aByte7458 = -5;
		}
	}

	static final void method2567(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method7729(icomponentdefinitions_3, interface_4, executor, 1735506761);
	}

	static final void method2568(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.flickeringEffects, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
		Class190.savePreferences((byte) 49);
		client.aBool7175 = false;
	}

	static final void method1349(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method2955(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1350(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.characterShadows.method12966((byte) -16) == 1 ? 1 : 0;
	}

	static final void method1351(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class469.LOYALTY_ENABLED ? 1 : 0;
	}

	static final void method1352(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundBlending.checkValid(i_2);
	}

	static final void method1355(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		IdentiKitIndexLoader.openSub(i_2, new IFSubNode(i_3, 3), (int[]) null, true, (byte) 92);
	}

	static final void ccCreate(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		IComponentDefinitions.getDefs(i_2);
		method2738(CustomCursorsPreference.INTERFACES[i_2 >>> 16], i_2 & 0xffff, i_3, i_4, executor.aBool7022, executor);
	}

	static final void method5296(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
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
			NewsItem.method1804(i_2, string_3, string_4);
		}
	}

	static final void method5299(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = LongNode.method13405(Utils.time());
	}

	static final void getGEOfferPrice(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].price;
	}

	static final void getCompText(CS2Executor executor) {
		int component = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(component);
		executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.text;
	}

	static final void method5487(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setTransparency(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method5488(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method15256(icomponentdefinitions_3, interface_4, executor, -1115547958);
	}

	static final void method5489(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 != 0 && i_2 < client.IGNORE_LIST_COUNT) {
			Ignore class10_3 = client.IGNORED_PLAYERS[i_2];
			executor.stringStack[++executor.stringStackPtr - 1] = class10_3.unfilteredUsername;
			if (class10_3.displayName != null) {
				executor.stringStack[++executor.stringStackPtr - 1] = class10_3.displayName;
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
		executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getContainerTotal(i_2, i_3, true);
	}

	static final void method6314(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteId;
	}

	static final void method6315(CS2Executor executor) {
		BufferedConnectionContext class184_2 = Preference_Sub20.getConnectionContext();
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.QUICKCHAT_PUBLIC, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(0);
		tcpmessage_3.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
		executor.currentQuickChatMessage.qcMessageDefs.method14896(tcpmessage_3.buffer, executor.currentQuickChatMessage.anIntArray4046, -1259900340);
		tcpmessage_3.buffer.writeIndex(tcpmessage_3.buffer.index - i_4);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void getGEOfferItem(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].itemId;
	}

	static final void method6317(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = TextureDetails.method2875(client.gameState, -2059083211) ? 1 : 0;
	}

	static final void method6318(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setItemIFComp(icomponentdefinitions_3, interface_4, true, 2, executor, (byte) -20);
	}

	static final void setCompSprite(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method8390(icomponentdefinitions_3, interface_4, executor);
	}

	static final void getPlayerIsMember(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.IS_MEMBER ? 1 : 0;
	}

	static final void method1138(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		IComponentDefinitions icomponentdefinitions_5 = Index.getIComponentDefinitions(i_2 << 16 | i_3, i_4);
		Class60.method1170();
		IFTargetParams class282_sub10_6 = client.getIComponentSettings(icomponentdefinitions_5);
		Class304.setUseOptionFlags(icomponentdefinitions_5, class282_sub10_6.getUseOptionFlags(), class282_sub10_6.interfaceId, (byte) -101);
	}

	static final void method1140(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundBlending.method12762(-283512869) == 1 ? 1 : 0;
	}

	static final void method6310(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method6122(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method787(CS2Executor executor) {
		Node_Sub36 class282_sub36_2 = Class540.method11595(-1576243923);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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

	static final void ifResumePauseButton(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method6942(icomponentdefinitions_3, executor);
	}

	static final void method4174(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method7667(icomponentdefinitions_3, interface_4, executor, 668340664);
	}

	static final void method4175(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		WorldTile coordgrid_6 = IndexLoaders.MAP_REGION_DECODER.getBase();
		RouteStrategy.moveCamera((i_2 >> 14 & 0x3fff) - coordgrid_6.x, (i_2 & 0x3fff) - coordgrid_6.y, i_3 << 2, i_4, i_5, false);
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
		ProjectileCutsceneAction.deleteIgnore(string_2);
	}

	static final void method6071(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method8390(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6072(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.bloom.method12707() && Renderers.SOFTWARE_RENDERER.method8403() ? 1 : 0;
	}

	static final void method6169(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Node_Sub1.method11614(i_2);
	}

	static final void intGreaterOrEqual(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr] >= executor.intStack[executor.intStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void getMouseY(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.getMouseY();
	}

	static final void method300(CS2Executor executor) {
		NPC npc_2 = (NPC) executor.currentEntity;
		boolean bool_3 = false;
		NPCDefinitions npcdefinitions_4 = npc_2.definitions;
		if (npcdefinitions_4.transformTo != null) {
			npcdefinitions_4 = npcdefinitions_4.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
		}
		if (npcdefinitions_4 != null) {
			bool_3 = npcdefinitions_4.visible;
		}
		executor.intStack[++executor.intStackPtr - 1] = bool_3 ? 1 : 0;
	}

	static final void method301(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt106;
	}

	static final void method305(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
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
		if (icomponentdefinitions_2.containerItemId != -1) {
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

	static final void setIfTextAlign(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setIfTextAlign(icomponentdefinitions_3, interface_4, executor, -1301648510);
	}

	static final void getAppletFocus(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = IFSubObjectPosition.appletHasFocus ? 1 : 0;
	}

	static final void method6802(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method3987(icomponentdefinitions_3, interface_4, executor, -669419549);
	}

	static final void method8327(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method7555(icomponentdefinitions_3, interface_4, executor, (byte) -121);
	}

	static final void storeLong(CS2Executor executor) {
		executor.longLocals[executor.intOpValues[executor.instrPtr]] = executor.longStack[--executor.longStackPtr];
	}

	static final void method15523(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method7267(icomponentdefinitions_3, interface_4, executor, 1800659377);
	}

	static void method5016(CS2Executor executor) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.questPrerequisiteIds == null ? 0 : questdefinitions_2.questPrerequisiteIds.length;
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
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.offsetX;
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
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		method3965(icomponentdefinitions_4, executor, -757819357);
	}

	static final void method8863(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.x;
	}

	static final void method933(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.currentOwner;
	}

	static final void method934(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class11.SYSTEM_INFO.ram >= 512 && !client.aBool7465 && !client.aBool7171 ? 0 : 1;
	}

	static final void bitOr(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 | i_3;
	}

	static final void method3692(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.musicVolume.method12714();
	}

	static final void method3693(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.water, executor.intStack[--executor.intStackPtr] == 1 ? 2 : 0);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -59);
		Class190.savePreferences((byte) 121);
		client.aBool7175 = false;
	}

	static final void clearCompChildren(CS2Executor executor) {
		IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
		icomponentdefinitions_2.slotChildren = null;
		icomponentdefinitions_2.itemSlots = null;
		Class109.redrawComponent(icomponentdefinitions_2);
	}

	static final void method3911(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		CutsceneAction_Sub10.method14603(10, i_2 << 16 | i_3, i_4, "", (byte) 121);
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
		CS2Interface underlaydefinition_3;
		if (executor.aBool7022) {
			underlaydefinition_3 = executor.hookedInterface2;
		} else {
			underlaydefinition_3 = executor.hookedInterface1;
		}
		executor.intStack[++executor.intStackPtr - 1] = underlaydefinition_3.method8766(executor.currentEntity.inter, i_2, -1) ? 1 : 0;
	}

	static void method2953(CS2Executor executor) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.levelRequirements == null ? 0 : questdefinitions_2.levelRequirements.length;
	}

	static final void method4773(CS2Executor executor) {
		if (client.anInt7434 == 0) {
			executor.intStack[++executor.intStackPtr - 1] = -2;
		} else if (client.anInt7434 == 1) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = client.FRIEND_COUNT;
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
		Class393.preferences.setValue(Class393.preferences.graphics, 0);
		Class190.savePreferences((byte) 63);
		client.aBool7175 = false;
	}

	static final void containerTotalParamStack(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = NPCDirection.containerTotalParam(i_2, i_3, true);
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
		if (VertexNormal.MY_PLAYER != null && VertexNormal.MY_PLAYER.username != null) {
			string_2 = VertexNormal.MY_PLAYER.getDisplayName();
		} else {
			string_2 = "";
		}
		executor.stringStack[++executor.stringStackPtr - 1] = string_2;
	}

	static final void method7773(CS2Executor executor) {
		Node_Sub40.method13300(-1273704391);
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
		executor.intStack[++executor.intStackPtr - 1] = ((Player) executor.currentEntity).aClass155_10561.method2626(i_2, (byte) 56);
	}

	static final void method8343(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.antiAliasingDefault.method12646() && Renderers.SOFTWARE_RENDERER.method8405() ? 1 : 0;
	}

	static final void method8344(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method6186(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3802(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].amount;
	}

	static final void method3803(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setItemIFComp(icomponentdefinitions_3, interface_4, true, 1, executor, (byte) -9);
	}

	static void method4556(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).method4093(Class158_Sub1.PLAYER_VAR_PROVIDER, client.SKILL_LEVEL_ACTUAL) ? 1 : 0;
	}

	static final void method4557(CS2Executor executor) {
		executor.intStackPtr -= 3;
		Class42.playSoundSong(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], (byte) -2);
	}

	static final void method4558(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method505(icomponentdefinitions_3, interface_4, executor);
	}

	static final void stringEqual(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		executor.intStack[++executor.intStackPtr - 1] = Class455.method7557((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], Class223.CURRENT_LANGUAGE);
	}

	static final void toString(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = Integer.toString(i_2);
	}

	static final void method8215(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		if (icomponentdefinitions_3.useOnName == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.useOnName;
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >>> 16];
		IComponentDefinitions icomponentdefinitions_5 = CutsceneAction_Sub23.method14682(interface_4, icomponentdefinitions_3);
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
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method14586(icomponentdefinitions_4, interface_5, executor);
	}

	static final void method4838(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method3738(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method4839(CS2Executor executor) {
		--executor.intStackPtr;
		int i_2 = executor.intStack[executor.intStackPtr];
		IFSubNode class282_sub44_3 = (IFSubNode) client.OPEN_INTERFACES.get((long) i_2);
		if (class282_sub44_3 != null && class282_sub44_3.overlay == 3) {
			Class351.closeChildren(class282_sub44_3, true, true);
		}
	}

	static final void method6395(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method5009(icomponentdefinitions_4, interface_5, executor, -1781977981);
	}

	static final void method6396(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Node_Sub20_Sub38.method15430(i_2);
	}

	static final void method6397(CS2Executor executor) {
		int i_2 = Class393.preferences.removeRoofs.method12952((byte) 81);
		Class393.preferences.setValue(Class393.preferences.removeRoofsOptionOverride, executor.intStack[--executor.intStackPtr] == 1 ? 0 : i_2);
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
		ProjectileCutsceneAction.queryItemParamString(string_2, i_3 == 1, i_4, string_5);
		executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.CS2_QUERY_RESULTS_LEN;
	}

	static final void method13044(CS2Executor executor) {
		if (client.FC_OWNER_NAME != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = client.FC_OWNER_NAME;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method13046(CS2Executor executor) {
		if (Class113.CLAN_CHANNEL != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
			executor.clanChannel = Class113.CLAN_CHANNEL;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method3611(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.sceneryShadows, executor.intStack[--executor.intStackPtr]);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -4);
		Class190.savePreferences((byte) 43);
		client.aBool7175 = false;
	}

	static final void method3613(CS2Executor executor) {
		if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
			UID192.method7373(Class393.preferences.screenSize.method12687(551500203), -1, -1, false, (byte) 52);
		}
	}

	static final void divide(CS2Executor executor) {
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
		Class393.preferences.setValue(Class393.preferences.buildArea, executor.intStack[--executor.intStackPtr]);
		Class190.savePreferences((byte) 77);
		client.aBool7175 = false;
	}

	static final void method5767(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.particles.method12797() ? 1 : 0;
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method774(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method11438(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method3078(icomponentdefinitions_3, interface_4, executor, -1906837964);
	}

	static final void method11439(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = i_2 >> 14 & 0x3fff;
		int i_4 = i_2 & 0x3fff;
		WorldTile coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getBase();
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
		CutsceneAction_Sub10.method14603(1, i_2 << 16 | i_3, i_4, "", (byte) 25);
	}

	static final void method4965(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method4160(icomponentdefinitions_3, interface_4, executor, (short) 14442);
	}

	static final void method4966(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		EnumDefinitions enumdefinitions_4 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2);
		executor.stringStack[++executor.stringStackPtr - 1] = enumdefinitions_4.getStringValue(i_3);
	}

	static final void fromDate(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = NormalObjectStrategy.method13045(Class302.method5363(executor.intStack[--executor.intStackPtr], 126882752), Class223.CURRENT_LANGUAGE.getValue());
	}

	static final void method4968(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		LightDetailPreference.method12790(executor.clanChannel == Class113.CLAN_CHANNEL, i_2);
	}

	static final void method4970(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method6313(icomponentdefinitions_3, interface_4, executor, 172839480);
	}

	static final void method4971(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method910(icomponentdefinitions_3, interface_4, executor, 2070102575);
	}

	static final void method5197(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getAmountAtSlot(i_2, i_3, false);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		ifSetModelOrigin(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method564(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method4651(icomponentdefinitions_3, interface_4, executor, (byte) 59);
	}

	static final void method565(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
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

	static final void setCCTextAlign(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setIfTextAlign(icomponentdefinitions_3, interface_4, executor, 539000010);
	}

	static final void method6272(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int[] ints_3 = AreadSound.method4799(i_2);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method569(icomponentdefinitions_3, interface_4, executor, -575655435);
	}

	static final void method1625(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 >= 0 && i_2 < client.FRIEND_COUNT) {
			executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[i_2].platform;
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

	static final void subtract(CS2Executor executor) {
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
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method8387(icomponentdefinitions_4, interface_5, executor, 2021162647);
	}

	static final void method1802(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.memberCount;
	}

	static final void method1803(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.groundBlending, executor.intStack[--executor.intStackPtr] != 0 ? 1 : 0);
		Class190.savePreferences((byte) 98);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -119);
	}

	static final void strAppendSigNum(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = string_2 + HitbarIndexLoader.method5120(i_3, true, -948271642);
	}

	static final void method927(CS2Executor executor) {
		int i_2 = client.OPEN_INTERFACES.size();
		if (client.BASE_WINDOW_ID != -1) {
			++i_2;
		}
		executor.intStack[++executor.intStackPtr - 1] = i_2;
	}

	static final void method928(CS2Executor executor) {
		if (PlaySoundJingleCutsceneAction.keyRecorder.held(82)) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method2586(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.cpu, executor.intStack[--executor.intStackPtr]);
		Class190.savePreferences((byte) 44);
	}

	static final void method2587(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aShort7436;
		executor.intStack[++executor.intStackPtr - 1] = client.aShort7437;
	}

	static final void method2588(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.water.method12923() ? 1 : 0;
	}

	static final void ifSetOnMouseLeave(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setOnMouseLeave(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6194(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		Class119.method2075(i_2, string_3);
	}

	static final void method6195(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aPreference_Sub4_8223.method12641(-1731892952);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method5017(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method2856(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		Queue class477_4 = Class291.method5127(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
		boolean bool_5 = false;
		for (CacheableNode_Sub6 class282_sub50_sub6_6 = (CacheableNode_Sub6) class477_4.method7941(); class282_sub50_sub6_6 != null; class282_sub50_sub6_6 = (CacheableNode_Sub6) class477_4.method7955(-1429079098)) {
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
		FontRenderer_Sub2.method14263(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
	}

	static final void method3769(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentGroundItem.method12997();
	}

	static final void method14491(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class48_Sub2.MY_PLAYER_FC_RANK;
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		ifSetAspect(icomponentdefinitions_3, interface_4, executor, 606535438);
	}

	static final void method284(CS2Executor executor) {
		boolean bool_2 = executor.intStack[--executor.intStackPtr] == 1;
		Class393.preferences.setValue(Class393.preferences.removeRoofs, bool_2 ? 2 : 1);
		Class393.preferences.setValue(Class393.preferences.removeRoofsOptionOverride, bool_2 ? 2 : 1);
		ClanVarDefinitions.method6823();
		Class190.savePreferences((byte) 111);
		client.aBool7175 = false;
	}

	static final void method287(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) (Utils.time() / 86400000L) - 11745;
	}

	static final void method481(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.graphics.method12654();
	}

	static final void method484(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method4160(icomponentdefinitions_3, interface_4, executor, (short) 8078);
	}

	static final void method485(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method1642(icomponentdefinitions_4, interface_5, executor, -107525091);
	}

	static final void method14606(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.GAME_SCREEN_INTERFACE == null ? -1 : client.GAME_SCREEN_INTERFACE.idHash;
	}

	static final void method7322(CS2Executor executor) {
		method11160(Class507.method8727(), executor);
	}

	static final void method6762(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method3338(icomponentdefinitions_3, interface_4, executor, (byte) 82);
	}

	static final void method8723(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method3338(icomponentdefinitions_3, interface_4, executor, (byte) 40);
	}

	static final void method8724(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (CustomCursorsPreference.INTERFACES[i_2] == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = CustomCursorsPreference.INTERFACES[i_2].components[i_3].serverTriggers;
		}
	}

	static final void method8726(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method797(icomponentdefinitions_3, interface_4, executor, 2104717291);
	}

	static final void method7270(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method502(icomponentdefinitions_3, interface_4, executor, -787893593);
	}

	static final void method7274(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.lootshareRank;
	}

	static final void method7276(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		CacheableNode_Sub6 class282_sub50_sub6_3 = Class291.method5130(i_2);
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
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).levelRequirements[executor.intStack[executor.intStackPtr - 1]][0];
		--executor.intStackPtr;
	}

	static final void getVarnbitOld(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = ((NPC) executor.currentEntity).varns.getVarnBit(i_2);
	}

	static final void method2096(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
			Friend class6_3 = client.FRIENDS[i_2];
			executor.stringStack[++executor.stringStackPtr - 1] = class6_3.displayName;
			if (class6_3.username != null) {
				executor.stringStack[++executor.stringStackPtr - 1] = class6_3.username;
			} else {
				executor.stringStack[++executor.stringStackPtr - 1] = "";
			}
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void ccSetHide(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method786(icomponentdefinitions_4, interface_5, executor);
	}

	static final void method2639(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		NPC npc_3 = (NPC) executor.currentEntity;
		int i_4 = npc_3.method16163(i_2);
		int i_5 = npc_3.method16169(i_2);
		executor.intStack[++executor.intStackPtr - 1] = i_4;
		executor.intStack[++executor.intStackPtr - 1] = i_5;
	}

	static final void animateComp(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method797(icomponentdefinitions_3, interface_4, executor, 2057644852);
	}

	static final void method8742(CS2Executor executor) {
		EntityNode_Sub7.method12606((byte) 70);
	}

	static final void returnInstr(CS2Executor executor) {
		if (executor.returnValuesPtr != 0) {
			CS2ReturnValue class509_2 = executor.returnValues[--executor.returnValuesPtr];
			executor.current = class509_2.aCacheableNode_Sub5_5869;
			executor.operations = executor.current.operations;
			executor.intOpValues = executor.current.intOpValues;
			executor.instrPtr = class509_2.anInt5866;
			executor.intLocals = class509_2.anIntArray5867;
			executor.objectLocals = class509_2.anObjectArray5865;
			executor.longLocals = class509_2.aLongArray5868;
		}
	}

	static final void method4137(CS2Executor executor) {
		AnimationDefinitions.method11148(executor.currentGroundItem, executor.intStack[--executor.intStackPtr], -1315599355);
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[0];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[1];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[2];
	}

	static final void switchInstr(CS2Executor executor) {
		IterableNodeMap iterablenodemap_2 = executor.current.switchMaps[executor.intOpValues[executor.instrPtr]];
		IntNode class282_sub38_3 = (IntNode) iterablenodemap_2.get((long) executor.intStack[--executor.intStackPtr]);
		if (class282_sub38_3 != null) {
			executor.instrPtr += class282_sub38_3.value;
		}
	}

	static final void method5314(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		ifSetColor(icomponentdefinitions_4, interface_5, executor);
	}

	static final void callCS2Script(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		CS2Script cs2script_3 = AsyncInputStream.getCS2Script(i_2);
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
			CS2ReturnValue class509_8 = new CS2ReturnValue();
			class509_8.aCacheableNode_Sub5_5869 = executor.current;
			class509_8.anInt5866 = executor.instrPtr;
			class509_8.anIntArray5867 = executor.intLocals;
			class509_8.anObjectArray5865 = executor.objectLocals;
			class509_8.aLongArray5868 = executor.longLocals;
			if (executor.returnValuesPtr >= executor.returnValues.length) {
				throw new RuntimeException();
			} else {
				executor.returnValues[++executor.returnValuesPtr - 1] = class509_8;
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.bloom.method12706((byte) 21) == 1 ? 1 : 0;
	}

	static final void method2549(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class383.method6513(Class393.preferences.currentToolkit.getValue(742990495), 200, 804853307);
	}

	static final void method2552(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.CURRENT_CURSOR;
	}

	static final void method2554(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = Class393.preferences.musicVolume.method12714();
		if (i_2 != i_3) {
			if (TextureDetails.method2875(client.gameState, -2096796884)) {
				if (i_3 == 0 && Class260.anInt3223 != -1) {
					Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, i_2, (byte) -40);
					GraphicsPreference.method12658(1298761444);
					Class260.aBool3220 = false;
				} else if (i_2 == 0) {
					VarBitDefinitions.method3805();
					Class260.aBool3220 = false;
				} else {
					ParticleEmitterConfig.method1491(i_2, (byte) -25);
				}
			}
			Class393.preferences.setValue(Class393.preferences.musicVolume, i_2);
			Class190.savePreferences((byte) 29);
			client.aBool7175 = false;
		}
	}

	static final void method7032(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.width;
	}

	static final void method14659(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollHeight;
	}

	static final void method14660(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method1494(icomponentdefinitions_3, executor);
	}

	static final void setCompTransparency(CS2Executor executor) {
		int interfaceId = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(interfaceId);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[interfaceId >> 16];
		setTransparency(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1259(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method13450(icomponentdefinitions_3, interface_4, executor);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method6689(icomponentdefinitions_3, interface_4, executor, -1054634282);
	}

	static final void method3941(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method3738(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3942(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.monoStereo, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
		Node_Sub20_Sub36.method15418();
		Class190.savePreferences((byte) 44);
		client.aBool7175 = false;
	}

	static final void method2823(CS2Executor executor) {
		executor.intStackPtr -= 4;
		Class435.playSoundVorbis(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], false, 256);
	}

	static final void method2824(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method12260(icomponentdefinitions_3, interface_4, executor);
	}

	static final void getItemParam(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
		if (attributedefault_4.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).getCS2String(i_3, attributedefault_4.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).getCS2Integer(i_3, attributedefault_4.defaultInt);
		}
	}

	static final void method2729(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.INVENTORY_LOADER.getInventoryDef(i_2).maxSize;
	}

	static final void ccSetNoClickThrough(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setNoClickThrough(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3164(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.IGNORED_PLAYERS[i_2].temporary ? 1 : 0;
	}

	static final void method3168(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		IComponentDefinitions icomponentdefinitions_5 = CutsceneAction_Sub23.method14682(interface_4, icomponentdefinitions_3);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_5 == null ? -1 : icomponentdefinitions_5.idHash;
	}

	static final void ccSetSize(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method12260(icomponentdefinitions_4, interface_5, executor);
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method1083(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6121(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class20.anInt169;
		executor.intStack[++executor.intStackPtr - 1] = Class20.anInt170;
	}

	static final void method1084(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method6158(icomponentdefinitions_3, interface_4, executor, -1064421);
	}

	static final void method1085(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.currentQuickChatMessage.anIntArray4046[i_2] = i_3;
	}

	static final void storeInt(CS2Executor executor) {
		executor.intLocals[executor.intOpValues[executor.instrPtr]] = executor.intStack[--executor.intStackPtr];
	}

	static final void method13057(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = i_2 >> 14 & 0x3fff;
	}

	static final void method1467(CS2Executor executor) {
		if (client.PLAYER_MOD_LEVEL >= 5 && client.PLAYER_MOD_LEVEL <= 9) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method2169(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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
		if (Class149_Sub2.PRIVATE_FILTER == null) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = Class149_Sub2.PRIVATE_FILTER.id;
		}
	}

	static final void method5047(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		Class393.preferences.setValue(Class393.preferences.brightness, i_2);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -44);
		Class190.savePreferences((byte) 84);
		client.aBool7175 = false;
	}

	static final void method4413(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (!Renderers.SOFTWARE_RENDERER.method8403()) {
			executor.intStack[++executor.intStackPtr - 1] = 3;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.bloom.checkValid(i_2);
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.offsetX;
	}

	static final void method11351(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.sceneryShadows.checkValid(i_2);
	}

	static final void method11355(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
			executor.stringStack[++executor.stringStackPtr - 1] = Class467.FC_PLAYERS[i_2].worldName;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method7676(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.hidden ? 1 : 0;
	}

	static final void method6212(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteId;
	}

	static final void bitFlagged(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = (i_2 & 1 << i_3) != 0 ? 1 : 0;
	}

	static void method11592(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).varbitRequirementNames[executor.intStack[executor.intStackPtr - 1]];
		executor.intStackPtr -= 2;
	}

	static final void method11593(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method4772(icomponentdefinitions_3, interface_4, executor, (byte) 88);
	}

	static final void method11594(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.EMAIL_VALIDATION_SUBMIT_CODE, client.LOBBY_CONNECTION_CONTEXT.isaac);
		tcpmessage_3.buffer.writeByte(ChatLine.getLength(string_2));
		tcpmessage_3.buffer.writeString(string_2);
		client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
	}

	static final void method7715(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].currentAmount;
	}

	static final void method5332(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method8310(icomponentdefinitions_3, interface_4, executor, (byte) -121);
	}

	static final void method5335(CS2Executor executor) {
		executor.intStackPtr -= 5;
		Class435.playSoundVorbis(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], false, executor.intStack[executor.intStackPtr + 4]);
	}

	static final void method7082(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.monoStereo.method12691(-1233469498) == 1 ? 1 : 0;
	}

	static void method7083(CS2Executor executor) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.varBitRequirements == null ? 0 : questdefinitions_2.varBitRequirements.length;
	}

	static final void method584(CS2Executor executor) {
		RouteFinder.handleCommand((String) executor.stringStack[--executor.stringStackPtr], false, false);
	}

	static final void method585(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.lightDetail.method12786() == 1 ? 1 : 0;
	}

	static final void method586(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class504.PLAYER_DOB;
	}

	static final void method587(CS2Executor executor) {
		Class361.aClass361_4182.method6257(-225278415);
	}

	static final void method1949(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method569(icomponentdefinitions_3, interface_4, executor, 2101137019);
	}

	static final void method1951(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = client.GRAND_EXCHANGE_SLOTS[i_2].method5908(-1286970996);
		executor.intStack[++executor.intStackPtr - 1] = i_3 == 5 ? 1 : 0;
	}

	static final void method4898(CS2Executor executor) {
		IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
		if (icomponentdefinitions_2.slotChildren == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			int i_3 = icomponentdefinitions_2.slotChildren.length;
			for (int i_4 = 0; i_4 < icomponentdefinitions_2.slotChildren.length; i_4++) {
				if (icomponentdefinitions_2.slotChildren[i_4] == null) {
					i_3 = i_4;
					break;
				}
			}
			executor.intStack[++executor.intStackPtr - 1] = i_3;
		}
	}

	static final void method4899(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		int i_3 = Class393.preferences.aPreference_Sub13_8229.method12714();
		if (i_3 != i_2 && Class260.anInt3228 == Class260.anInt3223) {
			if (!TextureDetails.method2875(client.gameState, -2119377821)) {
				if (i_3 == 0) {
					Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, i_2, (byte) -58);
					GraphicsPreference.method12658(173344706);
					Class260.aBool3220 = false;
				} else if (i_2 == 0) {
					VarBitDefinitions.method3805();
					Class260.aBool3220 = false;
				} else {
					ParticleEmitterConfig.method1491(i_2, (byte) -14);
				}
			}
			Class393.preferences.setValue(Class393.preferences.aPreference_Sub13_8229, i_2);
			Class190.savePreferences((byte) 93);
			client.aBool7175 = false;
		}
	}

	static final void method4900(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.textures.method12873(-825847336) == 1 ? 1 : 0;
	}

	static final void method4901(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollWidth;
	}

	static final void method4902(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Connection.method3345(string_2);
	}

	static final void method15437(CS2Executor executor) {
		if (client.gameState == 0 && !JS5CacheFile.method3360((byte) 56)) {
			if (Class448.aBool5422) {
				executor.intStack[++executor.intStackPtr - 1] = 0;
			} else if (Class448.aLong5425 > Utils.time() - 1000L) {
				executor.intStack[++executor.intStackPtr - 1] = 1;
			} else {
				Class448.aBool5422 = true;
				TCPPacket tcpmessage_2 = Class271.createPacket(ClientPacket.REQUEST_WORLD_LIST, client.LOBBY_CONNECTION_CONTEXT.isaac);
				tcpmessage_2.buffer.writeInt(MapSpriteDefinitions.WORLD_LIST_IDK);
				client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
				executor.intStack[++executor.intStackPtr - 1] = 0;
			}
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		}
	}

	static final void containerTotalParam(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = NPCDirection.containerTotalParam(i_2, i_3, false);
	}

	static final void method3229(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).multiStackSize;
	}

	static final void setIfFont(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setIfFont(icomponentdefinitions_3, interface_4, executor, -442383470);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method7267(icomponentdefinitions_3, interface_4, executor, 1465963300);
	}

	static final void method6304(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2).method14916(-235375245);
	}

	static final void method6305(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		method7927(icomponentdefinitions_3, executor, (byte) -27);
	}

	static final void method11473(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollY;
	}

	static final void method3200(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.voiceOverVolume, executor.intStack[--executor.intStackPtr]);
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
		Class356[] class356s = Class356.values();
		Class353[] class353s = Class353.values();
		Node_Sub15_Sub3.method15239(class356s[executor.intStack[executor.intStackPtr]], class353s[executor.intStack[executor.intStackPtr + 1]], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], executor.intStack[executor.intStackPtr + 4], executor.intStack[executor.intStackPtr + 5], executor.intStack[executor.intStackPtr + 6], executor.intStack[executor.intStackPtr + 7], executor.intStack[executor.intStackPtr + 8], executor.intStack[executor.intStackPtr + 9], executor.intStack[executor.intStackPtr + 10]);
	}

	static final void method6908(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolKit.getValue(-558492277);
	}

	static final void method1497(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method2915(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1498(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.offsetY;
	}

	static final void method1499(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) (SongReference.MEMBERSHIP_END / 60000L);
		executor.intStack[++executor.intStackPtr - 1] = (int) ((SongReference.MEMBERSHIP_END - Utils.time() - Class43.aLong420) / 60000L);
		executor.intStack[++executor.intStackPtr - 1] = CS2ReturnValue.IS_MEMBER_SUBSCRIPTION ? 1 : 0;
	}

	static final void method1500(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class152.addFriend(string_2);
	}

	static final void method1501(CS2Executor executor) {
		if (AsyncConnection.LISTENED_CLAN_CHANNEL != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
			executor.clanChannel = AsyncConnection.LISTENED_CLAN_CHANNEL;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method14602(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.fontId;
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

	static final void ifSetOnMouseOver(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setOnMouseOver(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6738(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method13450(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6741(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.anIntArray634[i_2];
	}

	static final void method541(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method7547(icomponentdefinitions_3, interface_4, executor, -996229805);
	}

	static final void method543(CS2Executor executor) {
		executor.currentEntity.method15813(executor.intStack[--executor.intStackPtr]);
	}

	static final void setBit(CS2Executor executor) {
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
		CutsceneAction_Sub10.method14603(9, i_2 << 16 | i_3, i_4, "", (byte) 54);
	}

	static final void method550(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = AnimationIndexLoader.method11219((char) i_2, -2126211908) ? 1 : 0;
	}

	static final void method8018(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method7142(icomponentdefinitions_3, interface_4, executor, -1447710686);
	}

	static final void method8019(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 != 0 && i_2 < client.IGNORE_LIST_COUNT) {
			executor.stringStack[++executor.stringStackPtr - 1] = client.IGNORED_PLAYERS[i_2].unfilteredUsername;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method8021(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		CutsceneAction_Sub10.method14603(5, i_2 << 16 | i_3, i_4, "", (byte) 110);
	}

	static final void method8045(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		int i_4 = executor.intStack[--executor.intStackPtr];
		--i_4;
		if (icomponentdefinitions_3.optionNames != null && i_4 < icomponentdefinitions_3.optionNames.length && icomponentdefinitions_3.optionNames[i_4] != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.optionNames[i_4];
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method1813(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method11221(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1814(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
		int i_4 = 0;
		if (chatline_3 != null) {
			i_4 = chatline_3.effectFlags;
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
		executor.intStack[++executor.intStackPtr - 1] = Class354.JCOINS;
	}

	static final void getColTag(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = Utils.rgbToColHexShortcut(i_2);
	}

	static final void method7332(CS2Executor executor) {
		getBoundingBox((Transform_Sub1) executor.currentSceneObject, executor);
	}

	static final void method7334(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.customCursors.method12675() == 1 ? 1 : 0;
	}

	static final void method12846(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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

	static final void setBloom(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 < 0 || i_2 > 1) {
			i_2 = 0;
		}
		Class115.setBloom(i_2 == 1);
	}

	static final void method1509(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method4159(icomponentdefinitions_3, interface_4, executor, -710786215);
	}

	static final void method1510(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method5066(icomponentdefinitions_3, interface_4, executor, 711806396);
	}

	static final void method1511(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method3369(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1512(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.modelType == ModelType.RAW_MODEL ? icomponentdefinitions_3.modelId : -1;
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method3365(icomponentdefinitions_3, interface_4, executor, -1548245230);
	}

	static final void method4905(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
			executor.intStack[++executor.intStackPtr - 1] = Class467.FC_PLAYERS[i_2].worldId;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method6190(CS2Executor executor) {
		AnimationDefinitions.method11148(executor.currentEntity, executor.intStack[--executor.intStackPtr], 1271800838);
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[0];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[1];
		executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method5814(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		CS2Interface underlaydefinition_4;
		if (executor.aBool7022) {
			underlaydefinition_4 = executor.hookedInterface2;
		} else {
			underlaydefinition_4 = executor.hookedInterface1;
		}
		executor.intStack[++executor.intStackPtr - 1] = underlaydefinition_4.method8766(executor.currentEntity.inter, i_2, i_3) ? 1 : 0;
	}

	static final void method5816(CS2Executor executor) {
		Class274.method4884();
	}

	static final void method2150(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method869(icomponentdefinitions_3, interface_4, executor, -1209481120);
	}

	static final void getStructParam(CS2Executor executor) {
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

	static final void getContainerFreeSpace(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Shader.getContainerFreeSpace(i_2);
	}

	static final void method3986(CS2Executor executor) {
		if (Class308.CS2_QUERY_RESULTS != null && Class283.CS2_QUERY_RESULT_IDX < VarcDefinitions.CS2_QUERY_RESULTS_LEN) {
			executor.intStack[++executor.intStackPtr - 1] = Class308.CS2_QUERY_RESULTS[++Class283.CS2_QUERY_RESULT_IDX - 1] & 0xffff;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		}
	}

	static final void method15416(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method12209(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6733(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
		String str_4 = "";
		if (chatline_3 != null && chatline_3.clan != null) {
			str_4 = chatline_3.clan;
		}
		executor.stringStack[++executor.stringStackPtr - 1] = str_4;
	}

	static final void getVarnOld(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = ((NPC) executor.currentEntity).varns.getVarn(i_2);
	}

	static final void loadLong(CS2Executor executor) {
		executor.longStack[++executor.longStackPtr - 1] = executor.longLocals[executor.intOpValues[executor.instrPtr]];
	}

	static final void method13491(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.parent;
	}

	static final void getWorldLanguage(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class223.CURRENT_LANGUAGE.getValue();
	}

	static final void method4194(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = (int) (Class302.method5363(i_2, 292315472) / 60000L);
	}

	static final void method6236(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteRoll;
	}

	static final void method6237(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
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
		Node_Sub20_Sub25.method15393(1862489719);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -87);
		Class190.savePreferences((byte) 74);
		client.aBool7175 = false;
	}

	static final void appendTypedMessage(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int type = executor.intStack[executor.intStackPtr];
		int effectFlags = executor.intStack[executor.intStackPtr + 1];
		String message = (String) executor.stringStack[--executor.stringStackPtr];
		if (type == 99) {
			Class209.printConsoleMessage(message);
		} else if (type == 98) {
			QuestDefinitions.setConsoleText(message);
		} else {
			ChatLine.appendChatMessage(type, effectFlags, "", "", "", message);
		}
	}

	static final void method6230(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getAmountAtSlot(i_2, i_3, true);
	}

	static final void method6231(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].method5909();
	}

	static final void getCompHidden(CS2Executor executor) {
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
		Class393.preferences.setValue(Class393.preferences.toolKit, i_2);
		if (!bool_3) {
			Class393.preferences.setValue(Class393.preferences.graphics, 0);
		}
		Class190.savePreferences((byte) 45);
		client.aBool7175 = false;
	}

	static final void method6730(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = ((Player) executor.currentEntity).getUsernameWithTitle();
	}

	static final void getEnumSize(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		EnumDefinitions enumdefinitions_3 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2);
		executor.intStack[++executor.intStackPtr - 1] = enumdefinitions_3.getSize();
	}

	static final void method12596(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.maxScreenSize.checkValid(i_2);
	}

	static final void method12597(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) (client.aLong7153 >> 32);
		executor.intStack[++executor.intStackPtr - 1] = (int) (client.aLong7153 & ~0x0L);
	}

	static final void ccDelete(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		if (underlaydefinition_2.defs.slotId == -1) {
			if (executor.aBool7022) {
				throw new RuntimeException("");
			} else {
				throw new RuntimeException("");
			}
		} else {
			IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.method8772();
			icomponentdefinitions_3.slotChildren[underlaydefinition_2.defs.slotId] = null;
			Class109.redrawComponent(icomponentdefinitions_3);
		}
	}

	static final void hookMouseExit(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method11223(icomponentdefinitions_3, interface_4, executor, 334837898);
	}

	static final void getMouseX(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.getMouseX();
	}

	static final void lowerString(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = string_2.toLowerCase();
	}

	static final void resumeStringDialog(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.RESUME_TEXTDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
		tcpmessage_3.buffer.writeByte(string_2.length() + 1);
		tcpmessage_3.buffer.writeString(string_2);
		client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
	}

	static final void method1456(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) client.camAngleX >> 3;
	}

	static final void method14655(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class115.RECOVERYQUESTIONSSETDATE;
	}

	static final void method6073(CS2Executor executor) {
		CacheableNode_Sub6 class282_sub50_sub6_2 = Class291.method5130(executor.intStack[--executor.intStackPtr]);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method6010(icomponentdefinitions_3, interface_4, executor, -298020679);
	}

	static final void ccSetPosition(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setComponentPosition(icomponentdefinitions_3, interface_4, executor);
	}

	static void method7434(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).difficulty;
	}

	static final void method7444(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = client.SKILL_XP[i_2];
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method4136(icomponentdefinitions_3, interface_4, executor, (byte) 78);
	}

	static final void method11247(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.transparency;
	}

	static final void method11249(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
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
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).type;
	}

	static final void method7218(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (!Renderers.SOFTWARE_RENDERER.method8405()) {
			executor.intStack[++executor.intStackPtr - 1] = 3;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.antiAliasingDefault.checkValid(i_2);
		}
	}

	static final void method7219(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.color;
	}

	static final void method6005(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		BufferedConnectionContext class184_3 = Preference_Sub20.getConnectionContext();
		TCPPacket tcpmessage_4 = Class271.createPacket(ClientPacket.CHAT_TYPE, class184_3.isaac);
		tcpmessage_4.buffer.writeByte(i_2);
		class184_3.queuePacket(tcpmessage_4);
	}

	static final void sendVerifyEmailPacket(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class493.sendCheckEmailPacket(string_2);
	}

	static final void method11244(CS2Executor executor) {
		WorldDescriptor descriptor = CutsceneCameraMovement.getCurrentWorldDescriptor();
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
		BufferedConnectionContext class184_6 = Preference_Sub20.getConnectionContext();
		TCPPacket tcpmessage_7 = Class271.createPacket(ClientPacket.REPORT_ABUSE, class184_6.isaac);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aPreference_Sub11_8217.method12699((byte) -9);
	}

	static final void method3038(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 == -1) {
			int i_3 = i_2 >> 14 & 0x3fff;
			int i_4 = i_2 & 0x3fff;
			WorldTile coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getBase();
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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
		executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.getUserSlot((String) executor.stringStack[--executor.stringStackPtr]);
	}

	static final void method3713(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.water.checkValid(i_2);
	}

	static final void method3714(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		CutsceneAction_Sub10.method14603(8, i_2 << 16 | i_3, i_4, "", (byte) 81);
	}

	static final void method15392(CS2Executor executor) {
		IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_2.containerItemId;
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method542(icomponentdefinitions_3, interface_4, executor, -2005893492);
	}

	static final void method3966(CS2Executor executor) {
		if (client.FC_NAME != null) {
			executor.stringStack[++executor.stringStackPtr - 1] = Class285.method5025(client.FC_NAME);
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method6372(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method542(icomponentdefinitions_3, interface_4, executor, -1893429225);
	}

	static final void method6373(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Character.toUpperCase((char) i_2);
	}

	static final void method6374(CS2Executor executor) {
		WorldDescriptor class217_sub1_2 = SceneryShadowPreference.method12629();
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setItemIFComp(icomponentdefinitions_3, interface_4, false, 0, executor, (byte) -19);
	}

	static final void method7915(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = NPCMeshModifier.MESSAGES;
	}

	static final void method3988(CS2Executor executor) {
		if (PlaySoundJingleCutsceneAction.keyRecorder.held(86)) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method6781(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).wearPos3;
	}

	static final void getCPUProfile(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class241.getCPUProfile();
	}

	static final void method3020(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method4276(icomponentdefinitions_3, interface_4, executor, -724687188);
	}

	static final void method3021(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.guestsTalk;
	}

	static final void method7675(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getItemIdAtSlot(i_2, i_3, false);
	}

	static final void method2107(CS2Executor executor) {
		Class466.method7777();
	}

	static final void method2108(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolKit.checkValid(i_2);
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
		executor.intStack[++executor.intStackPtr - 1] = client.SKILL_LEVEL_ACTUAL[i_2];
	}

	static final void mergeStrings(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.stringStackPtr -= i_2;
		String string_3 = VarDefinitionLoader.method6398(executor.stringStack, executor.stringStackPtr, i_2);
		executor.stringStack[++executor.stringStackPtr - 1] = string_3;
	}

	static final void method12499(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method3672(icomponentdefinitions_3, interface_4, executor, (short) 10267);
	}

	static final void method810(CS2Executor executor) {
		Ignore.method458(executor.intStack[--executor.intStackPtr]);
	}

	static final void method811(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = executor.clanChannel.clanName;
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

	static final void ccResumePauseButton(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		method6942(icomponentdefinitions_3, executor);
	}

	static final void method12689(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).name;
	}

	static final void method1452(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class16.addIgnore(string_2, false, (byte) -20);
	}

	static final void method3339(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		ChatLine.appendChatMessage(string_2);
	}

	static final void method3340(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = VertexNormal.MY_PLAYER.aClass19_10359.method578() >> 3;
	}

	static final void method3341(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (CustomCursorsPreference.INTERFACES[i_2] == null) {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		} else {
			String string_4 = CustomCursorsPreference.INTERFACES[i_2].components[i_3].name;
			if (string_4 == null) {
				executor.stringStack[++executor.stringStackPtr - 1] = "";
			} else {
				executor.stringStack[++executor.stringStackPtr - 1] = string_4;
			}
		}
	}

	static final void method3344(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.ENTITY_TARGET == executor.currentEntity.getCS2Index() ? 1 : 0;
	}

	static final void method3346(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.intStackPtr -= 2;
		int i_3 = executor.intStack[executor.intStackPtr];
		int i_4 = executor.intStack[executor.intStackPtr + 1];
		FontMetrics fontmetrics_5 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, i_4, 1119085558);
		executor.intStack[++executor.intStackPtr - 1] = fontmetrics_5.method6949(string_2, i_3, Class182.aNativeSpriteArray2261);
	}

	static final void loadVarpbit(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class158_Sub1.PLAYER_VAR_PROVIDER.getVarBit(i_2);
	}

	static final void method5203(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method14482(icomponentdefinitions_3, interface_4, executor, -1228549407);
	}

	static final void intLessOrEqual(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr] <= executor.intStack[executor.intStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method5205(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = ParticleEmitterConfig.method1489().getValue();
	}

	static final void modulo(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 % i_3;
	}

	static final void method3829(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class412.FC_MIN_RANK_CAN_KICK;
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.characterShadows.method12964() ? 1 : 0;
	}

	static final void method3030(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_3.hasTooltipColor ? 1 : 0;
	}

	static final void method3031(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method1454(icomponentdefinitions_3, interface_4, executor, (byte) 111);
	}

	static final void method3033(CS2Executor executor) {
		if (client.PLAYER_MOD_LEVEL >= 5 && client.PLAYER_MOD_LEVEL <= 9) {
			executor.intStack[++executor.intStackPtr - 1] = client.PLAYER_MOD_LEVEL;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method15559(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.fontId;
	}

	static final void method4629(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method5455(icomponentdefinitions_3, interface_4, executor, 1919949252);
	}

	static final void method4630(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1] - 1;
		ItemDefinitions itemdefinitions_4 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
		if (i_3 == itemdefinitions_4.customCursorOp1) {
			executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_4.customCursorId1;
		} else if (i_3 == itemdefinitions_4.customCursorOp2) {
			executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_4.customCursorId2;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		}
	}

	static final void method4631(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.currentQuickChatMessage.anIntArray4046[i_2] = i_3;
	}

	static final void method4633(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		CutsceneAction_Sub10.method14603(6, i_2 << 16 | i_3, i_4, "", (byte) 43);
	}

	static final void method6941(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		method5001(icomponentdefinitions_3, executor, -11442386);
	}

	static final void method451(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.lightDetail, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
		Class94.method1589();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
		Class190.savePreferences((byte) 90);
		client.aBool7175 = false;
	}

	static final void method452(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 != Class393.preferences.skyBoxes.method12728()) {
			Class393.preferences.setValue(Class393.preferences.skyBoxes, i_2);
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteYaw;
	}

	static final void method8212(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method11337(icomponentdefinitions_3, interface_4, executor, -2109817364);
	}

	static final void loadVarp(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class158_Sub1.PLAYER_VAR_PROVIDER.vars[i_2];
	}

	static final void method6364(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method4276(icomponentdefinitions_3, interface_4, executor, 175430076);
	}

	static final void method3117(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		BufferedConnectionContext class184_2 = Preference_Sub20.getConnectionContext();
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.QUICKCHAT_PUBLIC, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(3);
		tcpmessage_3.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
		executor.currentQuickChatMessage.qcMessageDefs.method14896(tcpmessage_3.buffer, executor.currentQuickChatMessage.anIntArray4046, -1204920325);
		tcpmessage_3.buffer.writeIndex(tcpmessage_3.buffer.index - i_4);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void method1604(CS2Executor executor) {
		System.out.println(executor.stringStack[--executor.stringStackPtr]);
	}

	static final void method1606(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method15409(icomponentdefinitions_3, interface_4, executor, -674550702);
	}

	static final void method1608(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (Class467.FC_PLAYERS != null && i_2 < Class459.FC_PLAYER_COUNT && Class467.FC_PLAYERS[i_2].username.equalsIgnoreCase(VertexNormal.MY_PLAYER.displayName)) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void resumeNamedDialog(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.RESUME_NAMEDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
		tcpmessage_3.buffer.writeByte(string_2.length() + 1);
		tcpmessage_3.buffer.writeString(string_2);
		client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
	}

	static final void method5788(CS2Executor executor) {
		Node_Sub36 class282_sub36_2 = JS5StandardRequester_Sub1.method12538();
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		method3601(icomponentdefinitions_3, executor, -1856078763);
	}

	static final void getWorldId(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class159.GAME_CONNECTION_INFO.worldId;
	}

	static final void method1888(CS2Executor executor) {
		executor.intStackPtr -= 5;
		VarNPCMap.playSoundSynth(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], executor.intStack[executor.intStackPtr + 4]);
	}

	static final void method1889(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.kickRank;
	}

	static final void powInverse(CS2Executor executor) {
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
		if (Class11.SYSTEM_INFO.javaBuild < 6) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else if (Class11.SYSTEM_INFO.javaBuild == 6 && Class11.SYSTEM_INFO.javaUpdate < 10) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		}
	}

	static final void method5024(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setItemIFComp(icomponentdefinitions_3, interface_4, false, 2, executor, (byte) 56);
	}

	static final void method5027(CS2Executor executor) {
		executor.intStackPtr -= 2;
		Huffman.playSoundJingle(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], 255);
	}

	static final void method5029(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		method15207(icomponentdefinitions_3, executor, -304097122);
	}

	static final void method14746(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method2593(icomponentdefinitions_3, interface_4, executor, -1669147013);
	}

	static final void method8735(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_4.transparency;
	}

	static final void getRunEnergy(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.RUN_ENERGY;
	}

	static final void method3596(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method2593(icomponentdefinitions_3, interface_4, executor, -1741314875);
	}

	static final void method3597(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
			executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[i_2].fcRank;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method3599(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.soundEffectVolume, executor.intStack[--executor.intStackPtr]);
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
		CacheableNode_Sub6 class282_sub50_sub6_3 = Class291.method5130(i_2);
		if (class282_sub50_sub6_3 == null) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9542;
		}
	}

	static final void method858(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollWidth;
	}

	static void method5290(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).isComplete(Class158_Sub1.PLAYER_VAR_PROVIDER) ? 1 : 0;
	}

	static final void hsvToRGB(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class335.anIntArray3916[Class372.method6362(i_2, 1349115277) & 0xffff];
	}

	static final void method12802(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method4651(icomponentdefinitions_3, interface_4, executor, (byte) 56);
	}

	static final void method12803(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.fog, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -96);
		Class190.savePreferences((byte) 37);
		client.aBool7175 = false;
	}

	static final void pushInt(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.intOpValues[executor.instrPtr];
	}

	static final void method6510(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method1455(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method2914(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IFSubNode class282_sub44_3 = (IFSubNode) client.OPEN_INTERFACES.get((long) i_2);
		if (class282_sub44_3 != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method2916(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		CacheableNode_Sub6 class282_sub50_sub6_3 = Class125.method2173(2115091118);
		if (class282_sub50_sub6_3 != null) {
			boolean bool_4 = class282_sub50_sub6_3.method14778(i_2 >> 28 & 0x3, i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Executor.anIntArray5900, -1837274243);
			if (bool_4) {
				executor.intStack[++executor.intStackPtr - 1] = CS2Executor.anIntArray5900[1];
				executor.intStack[++executor.intStackPtr - 1] = CS2Executor.anIntArray5900[2];
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
		CacheableNode_Sub6 class282_sub50_sub6_3 = Class291.method5175(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
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
		getBoundingBox(executor.currentGroundItem, executor);
	}

	static final void method7420(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolkitDefault.method13049() ? 1 : 0;
	}

	static final void method7422(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollX;
	}

	static void method1799(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).questpointReward;
	}

	static final void pushString(CS2Executor executor) {
		executor.stringStack[++executor.stringStackPtr - 1] = executor.current.stringOpValues[executor.instrPtr];
	}

	static final void method1801(CS2Executor executor) {
		method11160(GraphicalRenderer.method8697(), executor);
	}

	static final void method260(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setOnMouseOver(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method261(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentEntity.loadedInterfaceId;
	}

	static final void method11612(CS2Executor executor) {
		executor.intStackPtr -= 3;
		Huffman.playSoundJingle(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2]);
	}

	static final void method11613(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.BASE_WINDOW_ID != -1) {
			if (i_2 == 0) {
				executor.intStack[++executor.intStackPtr - 1] = client.BASE_WINDOW_ID;
				return;
			}
			--i_2;
		}
		IFSubNode class282_sub44_3;
		for (class282_sub44_3 = (IFSubNode) client.OPEN_INTERFACES.method7750(-1846591050); i_2-- > 0; class282_sub44_3 = (IFSubNode) client.OPEN_INTERFACES.method7751((byte) 5)) {
			;
		}
		executor.intStack[++executor.intStackPtr - 1] = class282_sub44_3.interfaceId;
	}

	static final void setGender(CS2Executor executor) {
		boolean bool_2 = executor.intStack[--executor.intStackPtr] != 0;
		if (VertexNormal.MY_PLAYER.playerAppearance != null) {
			VertexNormal.MY_PLAYER.playerAppearance.method4003(bool_2);
		}
	}

	static final void method4311(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method7555(icomponentdefinitions_3, interface_4, executor, (byte) -54);
	}

	static final void staffModLevel(CS2Executor executor) {
		if (client.PLAYER_RIGHTS >= 2) {
			executor.intStack[++executor.intStackPtr - 1] = client.PLAYER_RIGHTS;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static void method4314(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).method4103(Class158_Sub1.PLAYER_VAR_PROVIDER, executor.intStack[executor.intStackPtr - 1]) ? 1 : 0;
		--executor.intStackPtr;
	}

	static final void method4315(CS2Executor executor) {
		Class283.CS2_QUERY_RESULT_IDX = 0;
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method6689(icomponentdefinitions_3, interface_4, executor, -1325522232);
	}

	static final void method5456(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = Class182.method3044(string_2);
	}

	static final void hookMouseEnter(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method6289(icomponentdefinitions_3, interface_4, executor, (byte) -46);
	}

	static final void method1492(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method774(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1967(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		method14680(icomponentdefinitions_3, executor, -493402778);
	}

	static final void method1968(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolkitDefault.checkValid(i_2);
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
		Node_Sub20_Sub9.anInt9792 = executor.intStack[executor.intStackPtr];
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
		Class354.aNativeSprite_4110 = null;
		Class149_Sub2.aNativeSprite_9315 = null;
		Class125.aNativeSprite_1571 = null;
		Class60.aNativeSprite_612 = null;
		ClanSettings.aNativeSprite_647 = null;
		Class467.aNativeSprite_5576 = null;
		HitbarIndexLoader.aNativeSprite_3452 = null;
		ParamDefinitions.aNativeSprite_5339 = null;
		Class20.aBool187 = true;
	}

	static final void method3250(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
			executor.stringStack[++executor.stringStackPtr - 1] = Class467.FC_PLAYERS[i_2].displayName;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void method12915(CS2Executor executor) {
		NPC npc_2 = (NPC) executor.currentEntity;
		String string_3 = npc_2.modifiedName;
		NPCDefinitions npcdefinitions_4 = npc_2.definitions;
		if (npcdefinitions_4.transformTo != null) {
			npcdefinitions_4 = npcdefinitions_4.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
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

	static final void bitNot(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = ~i_2;
	}

	static final void method5000(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method6690(icomponentdefinitions_3, interface_4, executor, (byte) 92);
	}

	static final void method15075(CS2Executor executor) {
		Class404.method6811(executor.intStack[--executor.intStackPtr]);
	}

	static final void method16095(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method4772(icomponentdefinitions_3, interface_4, executor, (byte) 12);
	}

	static final void method14434(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		Class533.method11404((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], "", executor.intStack[--executor.intStackPtr] == 1, false);
	}

	static final void setCompText(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setCompText(icomponentdefinitions_3, interface_4, executor, 2144367938);
	}

	static final void randSoundPitch(CS2Executor executor) {
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
			if (i_3 != enumdefinitions_7.keyType) {
				throw new RuntimeException();
			} else if (i_2 != enumdefinitions_7.valueType) {
				throw new RuntimeException();
			} else {
				int[] ints_8 = enumdefinitions_7.method7251(Integer.valueOf(i_5));
				if (i_6 >= 0 && ints_8 != null && ints_8.length > i_6) {
					executor.intStack[++executor.intStackPtr - 1] = ints_8[i_6];
				} else {
					throw new RuntimeException();
				}
			}
		}
	}

	static final void textGender(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		String string_2 = (String) executor.stringStack[executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
		if (VertexNormal.MY_PLAYER.playerAppearance != null && VertexNormal.MY_PLAYER.playerAppearance.gender) {
			executor.stringStack[++executor.stringStackPtr - 1] = string_3;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = string_2;
		}
	}

	static final void clearBit(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 & -1 - (1 << i_3);
	}

	static final void method1462(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class16.addIgnore(string_2, true, (byte) -67);
	}

	static final void method1463(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.maxScreenSize.method12666(2085478304);
	}

	static final void method14647(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub4_8223, executor.intStack[--executor.intStackPtr]);
		ParticleProducer.method11500(Class393.preferences.currentToolkit.getValue(-1329116825), false);
		Class190.savePreferences((byte) 38);
	}

	static final void method14649(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.buildArea.checkValid(i_2);
	}

	static final void method5082(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		CS2Interface underlaydefinition_4 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		Node_Sub14.method12221(underlaydefinition_4.defs, i_2, i_3, 1550850781);
	}

	static final void method7186(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.myPlayerIndex;
	}

	static final void method7187(CS2Executor executor) {
	}

	static final void method3739(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
			executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[i_2].referrer ? 1 : 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method3740(CS2Executor executor) {
		NPC npc_2 = (NPC) executor.currentEntity;
		NPCDefinitions npcdefinitions_3 = npc_2.definitions;
		if (npcdefinitions_3.transformTo != null) {
			npcdefinitions_3 = npcdefinitions_3.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
		}
		executor.intStack[++executor.intStackPtr - 1] = npcdefinitions_3 != null ? 1 : 0;
	}

	static final void getWorldQuickchatOnly(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.IS_QUICKCHAT_ONLY ? 1 : 0;
	}

	static final void intGreaterThan(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr] > executor.intStack[executor.intStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method16089(CS2Executor executor) {
		executor.intStackPtr -= 2;
		ItemContainerDefinitions inventorydef_2 = IndexLoaders.INVENTORY_LOADER.getInventoryDef(executor.intStack[executor.intStackPtr]);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method12630(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6041(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = client.getIComponentSettings(icomponentdefinitions_3).getUseOptionFlags();
	}

	static final void method6042(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = ((Transform_Sub1) executor.currentSceneObject).method12997();
	}

	static final void method6043(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setOnMouseLeave(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method6044(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.aBool7310 ? 1 : 0;
	}

	static final void method6046(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = KeyHoldInputSubscriber.LOYALTY_BALANCE;
	}

	static final void method12718(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.ambientSoundVolume, executor.intStack[--executor.intStackPtr]);
		Class190.savePreferences((byte) 49);
		client.aBool7175 = false;
	}

	static final void method12719(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		setItemIFComp(icomponentdefinitions_4, interface_5, false, 0, executor, (byte) -113);
	}

	static final void method8285(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method6289(icomponentdefinitions_3, interface_4, executor, (byte) 30);
	}

	static final void method8295(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setItemIFComp(icomponentdefinitions_3, interface_4, true, 0, executor, (byte) -3);
	}

	static final void method8296(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		BufferedConnectionContext class184_3 = Preference_Sub20.getConnectionContext();
		TCPPacket tcpmessage_4 = Class271.createPacket(ClientPacket.QUICKCHAT_PRIVATE, class184_3.isaac);
		tcpmessage_4.buffer.writeByte(0);
		int i_5 = tcpmessage_4.buffer.index;
		tcpmessage_4.buffer.writeString(string_2);
		tcpmessage_4.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
		executor.currentQuickChatMessage.qcMessageDefs.method14896(tcpmessage_4.buffer, executor.currentQuickChatMessage.anIntArray4046, -1485943767);
		tcpmessage_4.buffer.writeIndex(tcpmessage_4.buffer.index - i_5);
		class184_3.queuePacket(tcpmessage_4);
	}

	static final void method8297(CS2Executor executor) {
		if (PlaySoundJingleCutsceneAction.keyRecorder.held(81)) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method8298(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method15474(icomponentdefinitions_4, interface_5, executor, (byte) 66);
	}

	static void method868(CS2Executor executor) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
		executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.varpRequirements == null ? 0 : questdefinitions_2.varpRequirements.length;
	}

	static final void method870(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs(i_4);
		Node_Sub14.method12221(icomponentdefinitions_5, i_2, i_3, 1698123949);
	}

	static final void add(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 + i_3;
	}

	static final void method15417(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Friend.method304();
	}

	static final void method4381(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method12401(icomponentdefinitions_4, interface_5, executor, 1213503004);
	}

	static final void method14818(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.NATIVE_LIBRARY_LOADER.method4639() ? 1 : 0;
	}

	static final void method14833(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Static.COUNTRY;
	}

	static final void method14835(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		ChatLine chatline_3 = HintArrow.method3032(i_2);
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
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).method4111(client.SKILL_LEVEL_ACTUAL, executor.intStack[executor.intStackPtr - 1]) ? 1 : 0;
		--executor.intStackPtr;
	}

	static final void method6677(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.players[i_2].rank;
	}

	static final void method6678(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 < 0 || i_2 > 5) {
			i_2 = 2;
		}
		ParticleProducer.method11500(i_2, false);
	}

	static final void method6680(CS2Executor executor) {
		if (client.FC_NAME != null) {
			executor.intStack[++executor.intStackPtr - 1] = Class459.FC_PLAYER_COUNT;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method6685(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method502(icomponentdefinitions_3, interface_4, executor, 577432492);
	}

	static final void method12839(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method505(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method12841(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.GRAND_EXCHANGE_ITEM_SELECT, client.GAME_CONNECTION_CONTEXT.isaac);
		tcpmessage_3.buffer.writeShort(i_2);
		client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
	}

	static final void method456(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.cycles;
	}

	static final void method457(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.groundDecoration, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -3);
		Class190.savePreferences((byte) 89);
		client.aBool7175 = false;
	}

	static final void ccSetScrollPos(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method1852(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method460(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method8310(icomponentdefinitions_3, interface_4, executor, (byte) -108);
	}

	static final void method5774(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method501(icomponentdefinitions_3, interface_4, executor, (byte) 22);
	}

	static final void method5775(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method6288(icomponentdefinitions_3, interface_4, executor, (short) 27570);
	}

	static final void method5776(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		if (i_2 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_4 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2);
			if (enumdefinitions_4.valueType != 's') {
				throw new RuntimeException();
			} else {
				executor.intStack[++executor.intStackPtr - 1] = enumdefinitions_4.containsKey(string_3) ? 1 : 0;
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
		if (client.PLAYER_RIGHTS != 0 || (!client.USERDETAIL_QUICKCHAT || client.VERIFIED_EMAIL_ADDRESS) && !client.IS_QUICKCHAT_ONLY) {
			BufferedConnectionContext class184_4 = Preference_Sub20.getConnectionContext();
			TCPPacket tcpmessage_5 = Class271.createPacket(ClientPacket.SEND_PRIVATE_MESSAGE, class184_4.isaac);
			tcpmessage_5.buffer.writeShort(0);
			int i_6 = tcpmessage_5.buffer.index;
			tcpmessage_5.buffer.writeString(string_2);
			MapSpriteIndexLoader.method7189(tcpmessage_5.buffer, string_3, -1045149130);
			tcpmessage_5.buffer.method13281(tcpmessage_5.buffer.index - i_6);
			class184_4.queuePacket(tcpmessage_5);
		}
	}

	static final void getPlayerCombatLevel(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = VertexNormal.MY_PLAYER.combatLevel;
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
		Class393.preferences.setValue(Class393.preferences.idleAnimations, executor.intStack[--executor.intStackPtr]);
		Class190.savePreferences((byte) 79);
	}

	static final void getSystemUpdateTimer(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.REBOOT_TIMER;
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
			if (i_2 != enumdefinitions_6.keyType) {
				throw new RuntimeException();
			} else if (enumdefinitions_6.valueType != 115) {
				throw new RuntimeException();
			} else {
				int[] ints_7 = enumdefinitions_6.method7251(string_5);
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setNoClickThrough(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method1171(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.banCount;
	}

	static final void method1173(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.TRADE_FILTER;
	}

	static final void method401(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		method3251(icomponentdefinitions_3, executor, 1310130121);
	}

	static final void method12210(CS2Executor executor) {
		executor.stringStackPtr -= 3;
		Class533.method11404((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], (String) executor.stringStack[executor.stringStackPtr + 2], executor.intStack[--executor.intStackPtr] == 1, true);
	}

	static final void method7500(CS2Executor executor) {
		Class393.preferences.setValue(Class393.preferences.idleAnimations, executor.intStack[--executor.intStackPtr]);
		Class190.savePreferences((byte) 103);
		client.aBool7175 = false;
	}

	static final void method7501(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
		TCPPacket tcpmessage_4 = Class271.createPacket(ClientPacket.EMAIL_VALIDATION_CHANGE_ADDRESS, client.LOBBY_CONNECTION_CONTEXT.isaac);
		tcpmessage_4.buffer.writeShort(ChatLine.getLength(string_2) + ChatLine.getLength(string_3));
		tcpmessage_4.buffer.writeString(string_2);
		tcpmessage_4.buffer.writeString(string_3);
		client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_4);
	}

	static final void method7502(CS2Executor executor) {
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_4.text;
	}

	static final void method3949(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method6697(icomponentdefinitions_3, interface_4, executor, 1042468011);
	}

	static final void method3950(CS2Executor executor) {
		Class283.CS2_QUERY_RESULT_IDX = 0;
	}

	static final void method3951(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Character.toLowerCase((char) i_2);
	}

	static final void method5511(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method2874(icomponentdefinitions_3, interface_4, executor, (byte) 3);
	}

	static final void method5512(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		method14605(icomponentdefinitions_3, executor, (byte) -77);
	}

	static final void method4960(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method2915(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method4961(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setItemIFComp(icomponentdefinitions_3, interface_4, true, 2, executor, (byte) 71);
	}

	static final void method4962(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		setItemIFComp(icomponentdefinitions_3, interface_4, false, 1, executor, (byte) 28);
	}

	static final void method1569(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method4280(icomponentdefinitions_3, interface_4, executor, (byte) 60);
	}

	static final void method1570(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setItemIFComp(icomponentdefinitions_3, interface_4, true, 1, executor, (byte) -4);
	}

	static final void method1571(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteRoll;
	}

	static final void method1572(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.textures.checkValid(i_2);
	}

	static final void method1573(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		IFSubNode class282_sub44_4 = (IFSubNode) client.OPEN_INTERFACES.get((long) i_2);
		if (class282_sub44_4 != null && i_3 == class282_sub44_4.interfaceId) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method1574(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.skyBoxes.method12727() ? 1 : 0;
	}

	static final void method12723(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.angle2d;
	}

	static final void method1162(CS2Executor executor) {
		executor.intStackPtr -= 4;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		WorldTile coordgrid_6 = IndexLoaders.MAP_REGION_DECODER.getBase();
		Class11.method469((i_2 >> 14 & 0x3fff) - coordgrid_6.x, (i_2 & 0x3fff) - coordgrid_6.y, i_3 << 2, i_4, i_5, (byte) -62);
	}

	static final void method11154(CS2Executor executor) {
		executor.currentQuickChatMessage = new QuickChatMessage();
		executor.currentQuickChatMessage.qcMessageId = executor.intStack[--executor.intStackPtr];
		executor.currentQuickChatMessage.qcMessageDefs = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(executor.currentQuickChatMessage.qcMessageId);
		executor.currentQuickChatMessage.anIntArray4046 = new int[executor.currentQuickChatMessage.qcMessageDefs.method14916(388398854)];
	}

	static final void method1979(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = executor.clanChannel.players[i_2].name;
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method7667(icomponentdefinitions_3, interface_4, executor, 1560441308);
	}

	static final void method4825(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getItemIdAtSlot(i_2, i_3, true);
	}

	static final void method4826(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class9.anInt112;
	}

	static final void method4829(CS2Executor executor) {
		if (client.anInt7434 == 0) {
			executor.intStack[++executor.intStackPtr - 1] = -1;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = client.IGNORE_LIST_COUNT;
		}
	}

	static final void method4830(CS2Executor executor) {
		IComponentDefinitions icomponentdefinitions_2 = executor.currentEntity.inter.getComponent(executor.intStack[--executor.intStackPtr]);
		icomponentdefinitions_2.slotChildren = null;
		icomponentdefinitions_2.itemSlots = null;
		Class109.redrawComponent(icomponentdefinitions_2);
	}

	static void method7461(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).members ? 1 : 0;
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

	static final void interpolate(CS2Executor executor) {
		executor.intStackPtr -= 5;
		int a = executor.intStack[executor.intStackPtr];
		int b = executor.intStack[executor.intStackPtr + 1];
		int c = executor.intStack[executor.intStackPtr + 2];
		int d = executor.intStack[executor.intStackPtr + 3];
		int e = executor.intStack[executor.intStackPtr + 4];
		executor.intStack[++executor.intStackPtr - 1] = a + (e - c) * (b - a) / (d - c);
	}

	static final void method1860(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (client.PLAYER_RIGHTS != 0 || (!client.USERDETAIL_QUICKCHAT || client.VERIFIED_EMAIL_ADDRESS) && !client.IS_QUICKCHAT_ONLY) {
			String string_3 = string_2.toLowerCase();
			byte b_4 = 0;
			if (string_3.startsWith(Message.aClass433_5310.translate(Language.ENGLISH))) {
				b_4 = 0;
				string_2 = string_2.substring(Message.aClass433_5310.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5224.translate(Language.ENGLISH))) {
				b_4 = 1;
				string_2 = string_2.substring(Message.aClass433_5224.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5312.translate(Language.ENGLISH))) {
				b_4 = 2;
				string_2 = string_2.substring(Message.aClass433_5312.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5313.translate(Language.ENGLISH))) {
				b_4 = 3;
				string_2 = string_2.substring(Message.aClass433_5313.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5314.translate(Language.ENGLISH))) {
				b_4 = 4;
				string_2 = string_2.substring(Message.aClass433_5314.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5221.translate(Language.ENGLISH))) {
				b_4 = 5;
				string_2 = string_2.substring(Message.aClass433_5221.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5194.translate(Language.ENGLISH))) {
				b_4 = 6;
				string_2 = string_2.substring(Message.aClass433_5194.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5317.translate(Language.ENGLISH))) {
				b_4 = 7;
				string_2 = string_2.substring(Message.aClass433_5317.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5318.translate(Language.ENGLISH))) {
				b_4 = 8;
				string_2 = string_2.substring(Message.aClass433_5318.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5319.translate(Language.ENGLISH))) {
				b_4 = 9;
				string_2 = string_2.substring(Message.aClass433_5319.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5320.translate(Language.ENGLISH))) {
				b_4 = 10;
				string_2 = string_2.substring(Message.aClass433_5320.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5199.translate(Language.ENGLISH))) {
				b_4 = 11;
				string_2 = string_2.substring(Message.aClass433_5199.translate(Language.ENGLISH).length());
			} else if (Class223.CURRENT_LANGUAGE != Language.ENGLISH) {
				if (string_3.startsWith(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 0;
					string_2 = string_2.substring(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 1;
					string_2 = string_2.substring(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 2;
					string_2 = string_2.substring(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 3;
					string_2 = string_2.substring(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 4;
					string_2 = string_2.substring(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 5;
					string_2 = string_2.substring(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 6;
					string_2 = string_2.substring(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 7;
					string_2 = string_2.substring(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 8;
					string_2 = string_2.substring(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 9;
					string_2 = string_2.substring(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 10;
					string_2 = string_2.substring(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE))) {
					b_4 = 11;
					string_2 = string_2.substring(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE).length());
				}
			}
			string_3 = string_2.toLowerCase();
			byte b_5 = 0;
			if (string_3.startsWith(Message.aClass433_5292.translate(Language.ENGLISH))) {
				b_5 = 1;
				string_2 = string_2.substring(Message.aClass433_5292.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5323.translate(Language.ENGLISH))) {
				b_5 = 2;
				string_2 = string_2.substring(Message.aClass433_5323.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5324.translate(Language.ENGLISH))) {
				b_5 = 3;
				string_2 = string_2.substring(Message.aClass433_5324.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5325.translate(Language.ENGLISH))) {
				b_5 = 4;
				string_2 = string_2.substring(Message.aClass433_5325.translate(Language.ENGLISH).length());
			} else if (string_3.startsWith(Message.aClass433_5326.translate(Language.ENGLISH))) {
				b_5 = 5;
				string_2 = string_2.substring(Message.aClass433_5326.translate(Language.ENGLISH).length());
			} else if (Language.ENGLISH != Class223.CURRENT_LANGUAGE) {
				if (string_3.startsWith(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE))) {
					b_5 = 1;
					string_2 = string_2.substring(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE))) {
					b_5 = 2;
					string_2 = string_2.substring(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE))) {
					b_5 = 3;
					string_2 = string_2.substring(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE))) {
					b_5 = 4;
					string_2 = string_2.substring(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE).length());
				} else if (string_3.startsWith(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE))) {
					b_5 = 5;
					string_2 = string_2.substring(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE).length());
				}
			}
			BufferedConnectionContext class184_6 = Preference_Sub20.getConnectionContext();
			TCPPacket tcpmessage_7 = Class271.createPacket(ClientPacket.CHAT, class184_6.isaac);
			tcpmessage_7.buffer.writeByte(0);
			int i_8 = tcpmessage_7.buffer.index;
			tcpmessage_7.buffer.writeByte(b_4);
			tcpmessage_7.buffer.writeByte(b_5);
			MapSpriteIndexLoader.method7189(tcpmessage_7.buffer, string_2, 151728977);
			tcpmessage_7.buffer.writeIndex(tcpmessage_7.buffer.index - i_8);
			class184_6.queuePacket(tcpmessage_7);
		}
	}

	static final void method1861(CS2Executor executor) {
		executor.intStackPtr -= 2;
		Class455.aShortArray5452[executor.intStack[executor.intStackPtr]] = (short) Class5.method294(executor.intStack[executor.intStackPtr + 1], (byte) -4);
		IndexLoaders.ITEM_LOADER.method7152();
		IndexLoaders.ITEM_LOADER.method7151((byte) -24);
		IndexLoaders.NPC_INDEX_LOADER.method6831();
		Static.method6378();
	}

	static final void method1862(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundDecoration.method12899() ? 1 : 0;
	}

	static final void setBaseColor(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		if (VertexNormal.MY_PLAYER.playerAppearance != null) {
			VertexNormal.MY_PLAYER.playerAppearance.setBaseColor(i_2, i_3);
		}
	}

	static final void method1836(CS2Executor executor) {
		executor.intStackPtr -= 2;
		Class329_Sub1.animateZero(VertexNormal.MY_PLAYER, executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1]);
	}

	static final void method1837(CS2Executor executor) {
		Class514.method8841(1236129433);
	}

	static final void method7551(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = (int) (Utils.time() / 60000L);
	}

	static final void method7552(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.maxScreenSize.method12665() ? 1 : 0;
	}

	static final void method16124(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		if (string_2.startsWith(Class76.getCrown(0)) || string_2.startsWith(Class76.getCrown(1))) {
			string_2 = string_2.substring(7);
		}
		executor.intStack[++executor.intStackPtr - 1] = Class280.isIgnored(string_2) ? 1 : 0;
	}

	static final void method3561(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method2170(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method3562(CS2Executor executor) {
		executor.intStackPtr -= 3;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		CutsceneAction_Sub10.method14603(3, i_2 << 16 | i_3, i_4, "", (byte) 66);
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
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.fog.checkValid(i_2);
	}

	static final void method15408(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		BASDefinitions bas = IndexLoaders.RENDER_ANIM_LOADER.getBASDefs(i_2, (byte) 12);
		if (bas.randomStandAnimations != null && bas.randomStandAnimations.length > 0) {
			int i_4 = 0;
			int i_5 = bas.randomStandAnimationChances[0];
			for (int i_6 = 1; i_6 < bas.randomStandAnimations.length; i_6++) {
				if (bas.randomStandAnimationChances[i_6] > i_5) {
					i_4 = i_6;
					i_5 = bas.randomStandAnimationChances[i_6];
				}
			}
			executor.intStack[++executor.intStackPtr - 1] = bas.randomStandAnimations[i_4];
		} else {
			executor.intStack[++executor.intStackPtr - 1] = bas.standAnimation;
		}
	}

	static final void method12115(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = NativeLibraryLoader.anInt3240 == 2 ? 1 : 0;
	}

	static final void method12116(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method15511(icomponentdefinitions_3, interface_4, executor, (byte) 63);
	}

	static final void method12118(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
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
		CS2Interface underlaydefinition_2;
		if (executor.aBool7022) {
			underlaydefinition_2 = executor.hookedInterface2;
		} else {
			underlaydefinition_2 = executor.hookedInterface1;
		}
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
		RSInterface interface_5 = underlaydefinition_2.inter;
		method6045(icomponentdefinitions_4, interface_5, executor, (byte) -37);
	}

	static final void method6151(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.y;
	}

	static final void method6152(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		Class344.method6119(string_2);
	}

	static final void method6153(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolkitDefault.method13050();
	}

	static final void method13467(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = RegionMap.anInt3644;
	}

	static final void getVarpbitOld(CS2Executor executor) {
		int i_2 = executor.intOpValues[executor.instrPtr];
		executor.intStack[++executor.intStackPtr - 1] = ((Player) executor.currentEntity).aClass155_10561.method2627(i_2);
	}

	static final void strAppendNum(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		executor.stringStack[++executor.stringStackPtr - 1] = string_2 + i_3;
	}

	static final void method4988(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		CacheableNode_Sub6 class282_sub50_sub6_3 = Class291.method5130(i_2);
		if (class282_sub50_sub6_3 == null) {
			executor.intStack[++executor.intStackPtr - 1] = 0;
			executor.intStack[++executor.intStackPtr - 1] = 0;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9540 - class282_sub50_sub6_3.anInt9539;
			executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9535 - class282_sub50_sub6_3.anInt9541;
		}
	}

	static final void method4989(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.sceneryShadows.method12622() ? 1 : 0;
	}

	static final void method7043(CS2Executor executor) {
		CacheableNode_Sub6 class282_sub50_sub6_2 = Class125.method2173(1468656099);
		if (class282_sub50_sub6_2 != null) {
			boolean bool_3 = class282_sub50_sub6_2.method14775(Class291.anInt3472 + MapSpriteIndexLoader.anInt5123, Class291.anInt3473 + Class475.anInt5624, CS2Executor.anIntArray5900, -1687346032);
			if (bool_3) {
				executor.intStack[++executor.intStackPtr - 1] = CS2Executor.anIntArray5900[1];
				executor.intStack[++executor.intStackPtr - 1] = CS2Executor.anIntArray5900[2];
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
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method2874(icomponentdefinitions_3, interface_4, executor, (byte) 11);
	}

	static final void method4798(CS2Executor executor) {
		ClanChannel.method12114(executor.intStack[--executor.intStackPtr]);
	}

	static final void method4801(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method15256(icomponentdefinitions_3, interface_4, executor, -158517117);
	}

	static final void method4802(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.slotId;
	}

	static final void method11338(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
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
		CutsceneAction_Sub10.method14603(7, i_2 << 16 | i_3, i_4, "", (byte) 94);
	}

	static final void method11341(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundDecoration.checkValid(i_2);
	}

	static final void method11370(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
			executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[i_2].worldFlags;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method11371(CS2Executor executor) {
		executor.intStackPtr -= 3;
		client.PUBLIC_FILTER = executor.intStack[executor.intStackPtr];
		Class149_Sub2.PRIVATE_FILTER = Class246.getFriendStatus(executor.intStack[executor.intStackPtr + 1]);
		if (Class149_Sub2.PRIVATE_FILTER == null) {
			Class149_Sub2.PRIVATE_FILTER = FriendStatus.FRIENDS_ONLY;
		}
		client.TRADE_FILTER = executor.intStack[executor.intStackPtr + 2];
		BufferedConnectionContext class184_2 = Preference_Sub20.getConnectionContext();
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.CHAT_SETFILTER, class184_2.isaac);
		tcpmessage_3.buffer.writeByte(client.PUBLIC_FILTER);
		tcpmessage_3.buffer.writeByte(Class149_Sub2.PRIVATE_FILTER.id);
		tcpmessage_3.buffer.writeByte(client.TRADE_FILTER);
		class184_2.queuePacket(tcpmessage_3);
	}

	static final void method11372(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method7889(icomponentdefinitions_3, interface_4, executor);
	}

	static final void method11373(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method6045(icomponentdefinitions_3, interface_4, executor, (byte) -2);
	}

	static final void method4565(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		if (icomponentdefinitions_3.containerItemId != -1) {
			executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1427;
		} else {
			executor.intStack[++executor.intStackPtr - 1] = 0;
		}
	}

	static final void method4566(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
			executor.stringStack[++executor.stringStackPtr - 1] = Class467.FC_PLAYERS[i_2].username;
		} else {
			executor.stringStack[++executor.stringStackPtr - 1] = "";
		}
	}

	static final void max(CS2Executor executor) {
		executor.intStackPtr -= 2;
		int i_2 = executor.intStack[executor.intStackPtr];
		int i_3 = executor.intStack[executor.intStackPtr + 1];
		executor.intStack[++executor.intStackPtr - 1] = i_2 > i_3 ? i_2 : i_3;
	}

	static final void sendSignupFormPacket(CS2Executor executor) {
		executor.stringStackPtr -= 2;
		executor.intStackPtr -= 2;
		Class119.method2074((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1] == 1);
	}

	static final void method2071(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method1083(icomponentdefinitions_3, interface_4, executor);
	}

	static final void resumeHSLDialog(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.RESUME_HSLDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
		tcpmessage_3.buffer.writeShort(i_2);
		client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
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
		executor.intStack[++executor.intStackPtr - 1] = client.SKILL_LEVEL_VISIBLE[i_2];
	}

	static final void method1641(CS2Executor executor) {
		String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
		int i_3 = executor.intStack[--executor.intStackPtr];
		Class404.setFCRank(string_2, i_3);
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

	static final void getRunWeight(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = client.RUN_WEIGHT;
	}

	static final void method13404(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.ambientSoundVolume.method12714();
	}

	static final void method8152(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method14482(icomponentdefinitions_3, interface_4, executor, -544899981);
	}

	static final void method8153(CS2Executor executor) {
		executor.intStackPtr -= 4;
		Class435.playSoundVorbis(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], true, 256);
	}

	static final void method8154(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.fontId;
	}

	static final void method8156(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.brightness.method12865();
	}

	static final void method8694(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method6690(icomponentdefinitions_3, interface_4, executor, (byte) 95);
	}

	static final void method8698(CS2Executor executor) {
		if (Node_Sub13.GUEST_CLAN_SETTINGS != null) {
			executor.intStack[++executor.intStackPtr - 1] = 1;
			executor.currentClanSettings = Node_Sub13.GUEST_CLAN_SETTINGS;
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
			NormalObjectStrategy.method13047(executor.globalArrays[i_3], executor.globalArrays[i_4], 0, i_2 - 1);
		}
	}

	static final void method8701(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.allowGuests ? 1 : 0;
	}

	static final void method8738(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		if (i_2 >= 1 && i_2 <= 2) {
			Class393.preferences.setValue(Class393.preferences.screenSize, i_2);
			Class393.preferences.setValue(Class393.preferences.aPreference_Sub9_8218, i_2);
			Class190.savePreferences((byte) 78);
		}
	}

	static final void method14520(CS2Executor executor) {
		executor.intStackPtr -= 4;
		VarNPCMap.playSoundSynth(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], 256);
	}

	static final void method14521(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		method4136(icomponentdefinitions_3, interface_4, executor, (byte) 55);
	}

	static final void method4146(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.x;
	}

	static final void getCompHeight(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.height;
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
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method1845(icomponentdefinitions_3, interface_4, executor, -1020802647);
	}

	static final void intNotEqual(CS2Executor executor) {
		executor.intStackPtr -= 2;
		if (executor.intStack[executor.intStackPtr] != executor.intStack[executor.intStackPtr + 1]) {
			executor.instrPtr += executor.intOpValues[executor.instrPtr];
		}
	}

	static final void method5598(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.height;
	}

	static void method2841(CS2Executor executor) {
		executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).levelRequirements[executor.intStack[executor.intStackPtr - 1]][1];
		--executor.intStackPtr;
	}

	static final void clanVarsEnabled(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = Class46.CLAN_VARS != null ? 1 : 0;
	}

	static final void method14640(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method3672(icomponentdefinitions_3, interface_4, executor, (short) 9324);
	}

	static final void method15552(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		RSInterface interface_4 = underlaydefinition_2.inter;
		setItemIFComp(icomponentdefinitions_3, interface_4, false, 1, executor, (byte) 24);
	}

	static final void method15555(CS2Executor executor) {
		int[] ints_2 = executor.intStack;
		int i_3 = ++executor.intStackPtr - 1;
		byte b_4;
		if (Class393.preferences.groundDecoration.method12897((byte) 38) == 1) {
			b_4 = 1;
		} else {
			b_4 = 0;
		}
		ints_2[i_3] = b_4;
	}

	static final void method8208(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		RSInterface interface_4 = CustomCursorsPreference.INTERFACES[i_2 >> 16];
		method8387(icomponentdefinitions_3, interface_4, executor, 1918613827);
	}

	static final void method7668(CS2Executor executor) {
		SpotAnimIndexLoader.method8862(executor.intStack[--executor.intStackPtr], -1, -1, false);
	}

	static final void method6696(CS2Executor executor) {
		int i_2 = executor.intStack[--executor.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
		executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.offsetY;
	}

	static final void method2620(CS2Executor executor) {
		int ifComp = executor.intStack[--executor.intStackPtr];
		CS2Interface underlaydefinition_3;
		if (executor.aBool7022) {
			underlaydefinition_3 = executor.hookedInterface2;
		} else {
			underlaydefinition_3 = executor.hookedInterface1;
		}
		executor.intStack[++executor.intStackPtr - 1] = underlaydefinition_3.setChild(ifComp, -1) ? 1 : 0;
	}

	static final void method1134(CS2Executor executor) {
		CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
		int i_4 = executor.intStack[--executor.intStackPtr];
		ParamDefinitions attributedefault_5 = IndexLoaders.PARAM_LOADER.getParam(i_4);
		if (attributedefault_5.isString()) {
			executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.method1998(i_4, attributedefault_5.typeName);
		} else {
			executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.method1997(i_4, attributedefault_5.defaultInt, 1468810127);
		}
	}

	static final void method1135(CS2Executor executor) {
		executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.coinShare;
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
	
	static final void method15511(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.spriteScale = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			MapSize.method1818(icomponentdefinitions_0.idHash, 438520847);
		}
	}

	static final void method14680(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
		if (icomponentdefinitions_0.modelType != ModelType.NPC_MODEL) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.modelId);
			if (icomponentdefinitions_0.npcMeshModifier == null) {
				icomponentdefinitions_0.npcMeshModifier = new NPCMeshModifier(npcdefinitions_5, true);
			}
			icomponentdefinitions_0.npcMeshModifier.aLong4993 = CS2Executor.method1480();
			if (i_4 >= 0 && i_4 < npcdefinitions_5.modelIds.length) {
				icomponentdefinitions_0.npcMeshModifier.anIntArray4992[i_4] = i_3;
				Class109.redrawComponent(icomponentdefinitions_0);
			} else {
				throw new RuntimeException("" + i_4);
			}
		}
	}

	static final void getBoundingBox(Transform_Sub1 transform, CS2Executor cs2executor_1) {
		boolean bool_3 = false;
		int minX = 0;
		int minY = 0;
		int maxX = 0;
		int maxY = 0;
		if (transform.boundingBoxPolygons != null) {
			for (int i_8 = 0; i_8 < transform.boundingBoxPolygons.length; i_8++) {
				EntityNode_Sub5 node = transform.boundingBoxPolygons[i_8];
				if (node.aBool7849) {
					int left;
					int right;
					if (node.anInt7850 < node.anInt7847) {
						left = node.anInt7850 - node.anInt7851;
						right = node.anInt7851 + node.anInt7847;
					} else {
						left = node.anInt7847 - node.anInt7851;
						right = node.anInt7850 + node.anInt7851;
					}
					int bottom;
					int top;
					if (node.anInt7846 < node.anInt7848) {
						bottom = node.anInt7846 - node.anInt7851;
						top = node.anInt7851 + node.anInt7848;
					} else {
						bottom = node.anInt7848 - node.anInt7851;
						top = node.anInt7846 + node.anInt7851;
					}
					if (!bool_3 || left < minX) {
						minX = left;
					}
					if (!bool_3 || bottom < minY) {
						minY = bottom;
					}
					if (!bool_3 || right > maxX) {
						maxX = right;
					}
					if (!bool_3 || top > maxY) {
						maxY = top;
					}
					bool_3 = true;
				}
			}
		}
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = bool_3 ? 1 : 0;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = minX;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = minY;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = maxX;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = maxY;
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
		if (icomponentdefinitions_0.modelType != ModelType.NPC_MODEL && icomponentdefinitions_0.modelType != ModelType.NPC_HEAD) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.modelId);
			if (icomponentdefinitions_0.npcMeshModifier == null) {
				icomponentdefinitions_0.npcMeshModifier = new NPCMeshModifier(npcdefinitions_5, icomponentdefinitions_0.modelType == ModelType.NPC_MODEL);
			}
			icomponentdefinitions_0.npcMeshModifier.aLong4993 = CS2Executor.method1480();
			if (npcdefinitions_5.modifiedColors != null && i_4 >= 0 && i_4 < npcdefinitions_5.modifiedColors.length) {
				icomponentdefinitions_0.npcMeshModifier.aShortArray4990[i_4] = (short) i_3;
				Class109.redrawComponent(icomponentdefinitions_0);
			} else {
				throw new RuntimeException("");
			}
		}
	}

	static final void method1852(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.scrollX = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.scrollX > icomponentdefinitions_0.scrollWidth - icomponentdefinitions_0.width) {
			icomponentdefinitions_0.scrollX = icomponentdefinitions_0.scrollWidth - icomponentdefinitions_0.width;
		}
		if (icomponentdefinitions_0.scrollX < 0) {
			icomponentdefinitions_0.scrollX = 0;
		}
		icomponentdefinitions_0.scrollY = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		if (icomponentdefinitions_0.scrollY > icomponentdefinitions_0.scrollHeight - icomponentdefinitions_0.height) {
			icomponentdefinitions_0.scrollY = icomponentdefinitions_0.scrollHeight - icomponentdefinitions_0.height;
		}
		if (icomponentdefinitions_0.scrollY < 0) {
			icomponentdefinitions_0.scrollY = 0;
		}
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			BloomPreference.method12709(icomponentdefinitions_0.idHash);
		}
	}

	static final void method6289(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.onMouseHoverScript = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
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

	static final void method3078(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1389 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method3672(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, short s_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1412 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void setOnMouseLeave(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.mouseLeaveScript = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.mouseLeaveArrayParam = ints_5;
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method7889(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1346 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method774(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.hFlip = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void ifSetModelOrigin(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.originX = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.originY = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method2874(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1319 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method7267(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.usesOrthogonal = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method5009(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1413 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method7142(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.shadow = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method6288(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, short s_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1405 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.anIntArray1406 = ints_5;
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method2915(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.spriteShadow = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method8754(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.filled = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void ifSetColor(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.color = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			Node_Sub14.method12223(icomponentdefinitions_0.idHash);
		}
	}

	static final void method6689(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1397 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.varps = ints_5;
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method6690(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1361 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method4159(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.modelTintRed = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.modelTintGreen = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.modelTintBlue = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		icomponentdefinitions_0.modelTintScalar = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method4160(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, short s_3) {
		icomponentdefinitions_0.borderThickness = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final int[] popIntArrayParam(String paramTypes, CS2Executor cs2executor_1) {
		int[] intArr = null;
		if (paramTypes.length() > 0 && paramTypes.charAt(paramTypes.length() - 1) == 'Y') {
			int size = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
			if (size > 0) {
				intArr = new int[size];
				while (size-- > 0) {
					intArr[size] = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
				}
//				for (intArr = new int[size]; size-- > 0; intArr[size] = cs2executor_1.intStack[--cs2executor_1.intStackPtr]) {
//					;
//				}
			}
		}
		return intArr;
	}

	static final void method11221(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1393 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method11223(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.onMouseLeaveScript = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method501(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.tiling = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method502(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1403 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.anIntArray1315 = ints_5;
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method505(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		String string_5 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		ParamDefinitions attributedefault_6 = IndexLoaders.PARAM_LOADER.getParam(i_4);
		if (!attributedefault_6.typeName.equals(string_5)) {
			icomponentdefinitions_0.method2000(i_4, string_5);
		} else {
			icomponentdefinitions_0.method1995(i_4);
		}
	}

	static final void method506(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.scrollWidth = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.scrollHeight = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.type == ComponentType.CONTAINER) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -1735080264);
		}
	}

	static void method2738(RSInterface interface_0, int i_1, int i_2, int i_3, boolean bool_4, CS2Executor cs2executor_5) {
		if (i_2 == 0) {
			throw new RuntimeException();
		} else {
			IComponentDefinitions icomponentdefinitions_7 = interface_0.components[i_1];
			if (icomponentdefinitions_7.slotChildren == null) {
				icomponentdefinitions_7.slotChildren = new IComponentDefinitions[i_3 + 1];
				icomponentdefinitions_7.itemSlots = icomponentdefinitions_7.slotChildren;
			}
			if (icomponentdefinitions_7.slotChildren.length <= i_3) {
				IComponentDefinitions[] arr_8;
				if (icomponentdefinitions_7.slotChildren == icomponentdefinitions_7.itemSlots) {
					arr_8 = new IComponentDefinitions[i_3 + 1];
					for (int i_9 = 0; i_9 < icomponentdefinitions_7.slotChildren.length; i_9++) {
						arr_8[i_9] = icomponentdefinitions_7.slotChildren[i_9];
					}
					icomponentdefinitions_7.slotChildren = icomponentdefinitions_7.itemSlots = arr_8;
				} else {
					arr_8 = new IComponentDefinitions[i_3 + 1];
					IComponentDefinitions[] arr_11 = new IComponentDefinitions[i_3 + 1];
					for (int i_10 = 0; i_10 < icomponentdefinitions_7.slotChildren.length; i_10++) {
						arr_8[i_10] = icomponentdefinitions_7.slotChildren[i_10];
						arr_11[i_10] = icomponentdefinitions_7.itemSlots[i_10];
					}
					icomponentdefinitions_7.slotChildren = arr_8;
					icomponentdefinitions_7.itemSlots = arr_11;
				}
			}
			if (i_3 > 0 && icomponentdefinitions_7.slotChildren[i_3 - 1] == null) {
				throw new RuntimeException("" + (i_3 - 1));
			} else {
				IComponentDefinitions icomponentdefinitions_12 = new IComponentDefinitions();
				icomponentdefinitions_12.type = ComponentType.forId(i_2);
				icomponentdefinitions_12.parent = icomponentdefinitions_12.idHash = icomponentdefinitions_7.idHash;
				icomponentdefinitions_12.slotId = i_3;
				icomponentdefinitions_7.slotChildren[i_3] = icomponentdefinitions_12;
				if (icomponentdefinitions_7.slotChildren != icomponentdefinitions_7.itemSlots) {
					icomponentdefinitions_7.itemSlots[i_3] = icomponentdefinitions_12;
				}
				CS2Interface underlaydefinition_13;
				if (bool_4) {
					underlaydefinition_13 = cs2executor_5.hookedInterface2;
				} else {
					underlaydefinition_13 = cs2executor_5.hookedInterface1;
				}
				underlaydefinition_13.inter = interface_0;
				underlaydefinition_13.defs = icomponentdefinitions_12;
				Class109.redrawComponent(icomponentdefinitions_7);
			}
		}
	}

	static final void method2741(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		boolean bool_5;
		if (cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1) {
			bool_5 = true;
		} else {
			bool_5 = false;
		}
		icomponentdefinitions_0.alpha = bool_5;
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method8387(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1380 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void method8390(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 != icomponentdefinitions_0.spriteId) {
			icomponentdefinitions_0.spriteId = i_4;
			Class109.redrawComponent(icomponentdefinitions_0);
		}
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			NewsItem.method1807(icomponentdefinitions_0.idHash);
		}
	}

	static final void method15256(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1381 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void method4651(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1292 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method6313(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.anInt1404 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1432 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1433 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		icomponentdefinitions_0.anInt1434 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method786(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		boolean bool_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		if (bool_4 != icomponentdefinitions_0.hidden) {
			icomponentdefinitions_0.hidden = bool_4;
			Class109.redrawComponent(icomponentdefinitions_0);
		}
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			Class78.method1389(icomponentdefinitions_0.idHash);
		}
	}

	static final void method789(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		if (icomponentdefinitions_0.type == ComponentType.SPRITE) {
			method5459(icomponentdefinitions_0, interface_1, cs2executor_2, -1486072931);
		}
	}

	static final void method5017(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1383 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method2955(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.mouseOverCursor = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void method4772(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1419 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
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

	static final void ifSetNPCHead(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.modelType = ModelType.NPC_HEAD;
		icomponentdefinitions_0.npcMeshModifier = null;
		icomponentdefinitions_0.modelId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			CutsceneObject.method1565(icomponentdefinitions_0.idHash, -1575336609);
		}
	}

	static final void method2960(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.textAntiMacro = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			Class244.method4196(icomponentdefinitions_0.idHash);
		}
	}

	static final void method11160(CacheableNode_Sub7 class282_sub50_sub7_0, CS2Executor cs2executor_1) {
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = CutsceneAction_Sub12.method14613(class282_sub50_sub7_0);
		cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class158_Sub1.method13768(class282_sub50_sub7_0);
		cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class435.method7303(class282_sub50_sub7_0);
		cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class9.method450(class282_sub50_sub7_0);
	}

	static final void method2593(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1394 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final Object[] popParamsDynamic(String paramTypes, CS2Executor executor) {
		Object[] params = new Object[paramTypes.length() + 1];
		for (int i = params.length - 1; i >= 1; --i) {
			if (paramTypes.charAt(i - 1) == 's') {
				params[i] = executor.stringStack[--executor.stringStackPtr];
			} else if (paramTypes.charAt(i - 1) == 'º') {
				params[i] = new Long(executor.longStack[--executor.longStackPtr]);
			} else {
				params[i] = new Integer(executor.intStack[--executor.intStackPtr]);
			}
		}
		int scriptId = executor.intStack[--executor.intStackPtr];
		if (scriptId != -1) {
			params[0] = new Integer(scriptId);
		} else {
			params = null;
		}
		return params;
	}

	static final void method13468(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.clickMask = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			Message.method7278(icomponentdefinitions_0.idHash);
		}
	}

	static final void method4136(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1409 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void setItemIFComp(IComponentDefinitions ifComp, RSInterface interface_1, boolean wearCol, int renderStack, CS2Executor cs2executor_4, byte b_5) {
		cs2executor_4.intStackPtr -= 2;
		int itemId = cs2executor_4.intStack[cs2executor_4.intStackPtr];
		int i_7 = cs2executor_4.intStack[cs2executor_4.intStackPtr + 1];
		if (ifComp.slotId == -1 && !interface_1.aBool999) {
			CutsceneActionType.method6914(ifComp.idHash);
			MapSize.method1818(ifComp.idHash, 209948825);
			Item.method12575(ifComp.idHash, (byte) 59);
		}
		if (itemId == -1) {
			ifComp.modelType = ModelType.RAW_MODEL;
			ifComp.modelId = -1;
			ifComp.containerItemId = -1;
		} else {
			ifComp.containerItemId = itemId;
			ifComp.anInt1427 = i_7;
			ifComp.wearCol = wearCol;
			ItemDefinitions itemdefinitions_8 = IndexLoaders.ITEM_LOADER.getItemDefinitions(itemId);
			ifComp.spritePitch = itemdefinitions_8.modelRotationX;
			ifComp.spriteRoll = itemdefinitions_8.modelRotationY;
			ifComp.spriteYaw = itemdefinitions_8.modelRotationZ;
			ifComp.offsetX = itemdefinitions_8.modelOffsetX;
			ifComp.offsetY = itemdefinitions_8.modelOffsetY;
			ifComp.spriteScale = itemdefinitions_8.modelZoom;
			ifComp.renderStack = renderStack;
			if (ifComp.aspectWidth > 0) {
				ifComp.spriteScale = ifComp.spriteScale * 32 / ifComp.aspectWidth;
			} else if (ifComp.baseWidth > 0) {
				ifComp.spriteScale = ifComp.spriteScale * 32 / ifComp.baseWidth;
			}
		}
	}

	static final void setCompText(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (!string_4.equals(icomponentdefinitions_0.text)) {
			icomponentdefinitions_0.text = string_4;
			Class109.redrawComponent(icomponentdefinitions_0);
		}
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			RenderAnimIndexLoader.method3631(icomponentdefinitions_0.idHash);
		}
	}

	static final void method6122(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.useOnName = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
	}

	static final void method14482(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		int i_5 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_5 >= 1 && i_5 <= 10) {
			icomponentdefinitions_0.method2039(i_5 - 1, i_4);
		}
	}

	static final void method1083(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1451 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void setIfTextAlign(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 3;
		icomponentdefinitions_0.textHorizontalAli = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.textVerticalAli = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1358 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method2170(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1421 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method14605(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, byte b_2) {
		byte b_3 = 10;
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		method4883(icomponentdefinitions_0, b_3, i_4, cs2executor_1);
	}

	static final void method6186(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		if (icomponentdefinitions_0.type == ComponentType.TEXT) {
			method5459(icomponentdefinitions_0, interface_1, cs2executor_2, -2108209213);
		}
	}

	static final void method8310(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.angle2d = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method542(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1407 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void setIfFont(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.fontId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			Game.method8207(icomponentdefinitions_0.idHash);
		}
	}

	static final void method7729(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1430 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1431 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void setComponentPosition(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
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
		icomponentdefinitions_0.aspectXType = (byte) i_4;
		icomponentdefinitions_0.aspectYType = (byte) i_5;
		Class109.redrawComponent(icomponentdefinitions_0);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
		if (icomponentdefinitions_0.type == ComponentType.CONTAINER) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -1665129520);
		}
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			Class396.method6774(icomponentdefinitions_0.idHash);
		}
	}

	static final void method1454(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
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

	static final void method1455(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.modelId = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1339 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		if (cs2executor_2.intStack[cs2executor_2.intStackPtr + 2] == 1) {
			icomponentdefinitions_0.modelType = ModelType.ITEM_CONTAINER_FEMALE;
		} else {
			icomponentdefinitions_0.modelType = ModelType.ITEM_CONTAINER_MALE;
		}
		if (cs2executor_2.intStack[cs2executor_2.intStackPtr + 3] == 1) {
			icomponentdefinitions_0.wearCol = true;
		} else {
			icomponentdefinitions_0.wearCol = false;
		}
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			CutsceneObject.method1565(icomponentdefinitions_0.idHash, -940537484);
		}
	}

	static final void method14653(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1353 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method12260(IComponentDefinitions icDefs, RSInterface interface_1, CS2Executor executor) {
		executor.intStackPtr -= 4;
		icDefs.baseWidth = executor.intStack[executor.intStackPtr];
		icDefs.baseHeight = executor.intStack[executor.intStackPtr + 1];
		icDefs.aspectWidth = 0;
		icDefs.aspectHeight = 0;
		int i_4 = executor.intStack[executor.intStackPtr + 2];
		if (i_4 < 0) {
			i_4 = 0;
		} else if (i_4 > 4) {
			i_4 = 4;
		}
		int i_5 = executor.intStack[executor.intStackPtr + 3];
		if (i_5 < 0) {
			i_5 = 0;
		} else if (i_5 > 4) {
			i_5 = 4;
		}
		icDefs.aspectWidthType = (byte) i_4;
		icDefs.aspectHeightType = (byte) i_5;
		Class109.redrawComponent(icDefs);
		IdentikitDefinition.method913(interface_1, icDefs);
		if (icDefs.type == ComponentType.CONTAINER) {
			HostNameIdentifier.method483(interface_1, icDefs, false, -610252618);
		}
	}

	static final void method7555(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.modelType = ModelType.RAW_MODEL;
		icomponentdefinitions_0.modelId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			CutsceneObject.method1565(icomponentdefinitions_0.idHash, -624586705);
		}
	}

	static final void method6010(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 3;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		short s_5 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		short s_6 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		if (i_4 >= 0 && i_4 < 5) {
			icomponentdefinitions_0.retexture(i_4, s_5, s_6);
			Class109.redrawComponent(icomponentdefinitions_0);
			if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
				Class276.method4903(icomponentdefinitions_0.idHash, i_4);
			}
		}
	}

	static final void method1845(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1271 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method3365(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1302 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method3366(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1416 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method3369(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.useOptionString = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
	}

	static final void method3965(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		FontMetrics fontmetrics_3 = icomponentdefinitions_0.method1989(Class487.aClass378_5752, client.anInterface35_7206);
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_5 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_6 = fontmetrics_3.method6956(icomponentdefinitions_0.text, icomponentdefinitions_0.width, icomponentdefinitions_0.anInt1358, i_5, i_4, Class182.aNativeSpriteArray2261);
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_6;
	}

	static final void method3987(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.modelType = ModelType.PLAYER_HEAD;
		icomponentdefinitions_0.modelId = client.myPlayerIndex;
		icomponentdefinitions_0.anInt1339 = 0;
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			CutsceneObject.method1565(icomponentdefinitions_0.idHash, -1355203883);
		}
	}

	static final void method1494(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
		int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
		if (icomponentdefinitions_0.modelType != ModelType.NPC_HEAD) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.modelId);
			if (icomponentdefinitions_0.npcMeshModifier == null) {
				icomponentdefinitions_0.npcMeshModifier = new NPCMeshModifier(npcdefinitions_5, false);
			}
			icomponentdefinitions_0.npcMeshModifier.aLong4993 = CS2Executor.method1480();
			if (i_4 >= 0 && i_4 < npcdefinitions_5.headModels.length) {
				icomponentdefinitions_0.npcMeshModifier.anIntArray4992[i_4] = i_3;
				Class109.redrawComponent(icomponentdefinitions_0);
			} else {
				throw new RuntimeException("");
			}
		}
	}

	static final void method7547(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.opName = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
	}

	static final void method12401(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.modelType = ModelType.PLAYER_MODEL;
		icomponentdefinitions_0.modelId = client.myPlayerIndex;
		icomponentdefinitions_0.anInt1339 = 0;
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			CutsceneObject.method1565(icomponentdefinitions_0.idHash, -2001727659);
		}
	}

	static final void method14892(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.lineWidth = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method4276(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 6;
		icomponentdefinitions_0.offsetX = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.offsetY = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.spritePitch = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		icomponentdefinitions_0.spriteRoll = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		icomponentdefinitions_0.spriteYaw = cs2executor_2.intStack[cs2executor_2.intStackPtr + 4];
		icomponentdefinitions_0.spriteScale = cs2executor_2.intStack[cs2executor_2.intStackPtr + 5];
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			MapSize.method1818(icomponentdefinitions_0.idHash, -1101705065);
			Item.method12575(icomponentdefinitions_0.idHash, (byte) 9);
		}
	}

	static final void method4280(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		boolean bool_5;
		if (cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1) {
			bool_5 = true;
		} else {
			bool_5 = false;
		}
		icomponentdefinitions_0.vFlip = bool_5;
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method12630(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.method1987();
	}

	static final void method5066(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.modelType = ModelType.PLAYER_MODEL;
		icomponentdefinitions_0.modelId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			CutsceneObject.method1565(icomponentdefinitions_0.idHash, 1743541888);
		}
	}

	static final void method13450(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		icomponentdefinitions_0.lineDirection = i_4 == 1;
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method6942(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
		if (client.getIComponentSettings(icomponentdefinitions_0).continueOptionEnabled() && client.aClass118_7352 == null) {
			Class158_Sub2.method14355(icomponentdefinitions_0.idHash, icomponentdefinitions_0.slotId, -946546687);
			client.aClass118_7352 = Index.getIComponentDefinitions(icomponentdefinitions_0.idHash, icomponentdefinitions_0.slotId);
			Class109.redrawComponent(client.aClass118_7352);
		}
	}

	static final void method3601(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
		if (icomponentdefinitions_0.modelType != ModelType.NPC_MODEL && icomponentdefinitions_0.modelType != ModelType.NPC_HEAD) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.modelId);
			if (icomponentdefinitions_0.npcMeshModifier == null) {
				icomponentdefinitions_0.npcMeshModifier = new NPCMeshModifier(npcdefinitions_5, icomponentdefinitions_0.modelType == ModelType.NPC_MODEL);
			}
			icomponentdefinitions_0.npcMeshModifier.aLong4993 = CS2Executor.method1480();
			if (npcdefinitions_5.modifiedTextures != null && i_4 >= 0 && i_4 < npcdefinitions_5.modifiedTextures.length) {
				icomponentdefinitions_0.npcMeshModifier.aShortArray4991[i_4] = (short) i_3;
				Class109.redrawComponent(icomponentdefinitions_0);
			} else {
				throw new RuntimeException("");
			}
		}
	}

	static final void method5291(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] - 1;
		if (i_4 >= 0 && i_4 <= 9) {
			icomponentdefinitions_0.method1994(i_4, (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr]);
		} else {
			--cs2executor_2.stringStackPtr;
		}
	}

	static final void method797(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 != icomponentdefinitions_0.animation) {
			if (i_4 != -1) {
				if (icomponentdefinitions_0.anim == null) {
					icomponentdefinitions_0.anim = new Animation_Sub1();
				}
				icomponentdefinitions_0.anim.update(i_4);
			} else {
				icomponentdefinitions_0.anim = null;
			}
			icomponentdefinitions_0.animation = i_4;
			Class109.redrawComponent(icomponentdefinitions_0);
		}
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			Class149_Sub1.method14582(icomponentdefinitions_0.idHash);
		}
	}

	static final void setTransparency(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.transparency = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method5455(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1418 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method5459(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 != icomponentdefinitions_0.anInt1435) {
			icomponentdefinitions_0.anInt1435 = i_4;
			Class109.redrawComponent(icomponentdefinitions_0);
		}
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			JS5LocalRequester.method5581(icomponentdefinitions_0.idHash);
		}
	}

	static final void method569(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.maxTextLines = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0);
	}

	static final void method3251(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		if (cs2executor_1.hookRequestCount >= 10) {
			throw new RuntimeException();
		} else {
			if (icomponentdefinitions_0.anObjectArray1271 != null) {
				HookRequest hookrequest_3 = new HookRequest();
				hookrequest_3.source = icomponentdefinitions_0;
				hookrequest_3.params = icomponentdefinitions_0.anObjectArray1271;
				hookrequest_3.requestId = cs2executor_1.hookRequestCount + 1;
				client.PENDING_HOOK_REQUESTS.append(hookrequest_3);
			}
		}
	}

	static final void method5001(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		FontMetrics fontmetrics_3 = icomponentdefinitions_0.method1989(Class487.aClass378_5752, client.anInterface35_7206);
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		Point point_5 = fontmetrics_3.method6954(icomponentdefinitions_0.text, icomponentdefinitions_0.width, icomponentdefinitions_0.anInt1358, i_4, Class182.aNativeSpriteArray2261);
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.x;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.y;
	}

	static final void method3338(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1387 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.anIntArray1402 = ints_5;
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void ifSetAspect(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.aspectX = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.aspectY = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
		if (icomponentdefinitions_0.type == ComponentType.CONTAINER) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -1114649951);
		}
	}

	static final void method3738(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 2;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		if (i_4 == -1 && i_5 == -1) {
			icomponentdefinitions_0.aClass118_1379 = null;
		} else {
			icomponentdefinitions_0.aClass118_1379 = Index.getIComponentDefinitions(i_4, i_5);
		}
	}

	static final void method14586(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1396 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method6045(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.targetLeaveCursor = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		icomponentdefinitions_0.targetOverCursor = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void setOnMouseOver(IComponentDefinitions iCompDefs, RSInterface inter, CS2Executor cs2executor_2) {
		String paramTypes = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(paramTypes, cs2executor_2) != null) {
			paramTypes = paramTypes.substring(0, paramTypes.length() - 1);
		}
		iCompDefs.popupScript = popParamsDynamic(paramTypes, cs2executor_2);
		iCompDefs.usesScripts = true;
	}

	static final void method869(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 == IComponentDefinitions.anInt1283 || i_4 == IComponentDefinitions.anInt1373 || i_4 == IComponentDefinitions.anInt1265) {
			icomponentdefinitions_0.anInt1382 = i_4;
		}
	}

	static final void method910(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.params = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void setNoClickThrough(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.noClickThrough = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
	}

	static final void method12209(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2) {
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

	static final void method15409(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1386 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method6158(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1415 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method11337(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.modelType = ModelType.NPC_MODEL;
		icomponentdefinitions_0.npcMeshModifier = null;
		icomponentdefinitions_0.modelId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			CutsceneObject.method1565(icomponentdefinitions_0.idHash, -515297121);
		}
	}

	static final void method15474(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.optionNames = null;
	}

	static final void method1642(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (popIntArrayParam(string_4, cs2executor_2) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1400 = popParamsDynamic(string_4, cs2executor_2);
		icomponentdefinitions_0.usesScripts = true;
	}

	static final void method4149(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1378 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static final void method7667(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 3;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		short s_5 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		short s_6 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		if (i_4 >= 0 && i_4 < 5) {
			icomponentdefinitions_0.recolor(i_4, s_5, s_6);
			Class109.redrawComponent(icomponentdefinitions_0);
			if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
				RegionMap.method5513(icomponentdefinitions_0.idHash, i_4);
			}
		}
	}

	static final void method6697(IComponentDefinitions icomponentdefinitions_0, RSInterface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.monospaced = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.redrawComponent(icomponentdefinitions_0);
		if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
			CutsceneAction_Sub17.method14656(icomponentdefinitions_0.idHash);
		}
	}
}