package com.jagex;

import com.jagex.clans.ClanChannel;
import com.jagex.clans.settings.ClanSettings;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.ArrayList;

public class CS2Interpreter {
    public static void executeOperation(CS2Instruction operation, CS2Executor exec) {
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
                ifSetPlace(true, exec);
                break;
            case IF_SENDTOBACK:
                ifSetPlace(false, exec);
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
                ccSetModelAngle(exec);
                break;
            case CC_SETMODELANIM:
                ccSetModelAnim(exec);
                break;
            case CC_SETMODELORTHOG:
                ccSetModelOrthog(exec);
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
                ccSetHFlip(exec);
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
                ccSetNPCHead(exec);
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
            case CC_RESETOPTIONNAMES:
                ccResetOptionNames(exec);
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
            case instr6556: //CC_SET_SCRIPT_CALLBACK_ON_GAMELOOP
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
            case CC_SETONMOUSEOVER:
                ccSetonmouseOver(exec);
                break;
            case CC_SETONMOUSELEAVE:
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
            case CC_ISHIDDEN:
                isHidden(exec);
                break;
            case instr6462:
                method13491(exec);
                break;
            case instr6128:
                ccGetParentLayer(exec);
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
            case CC_GETSPRITESCALE:
                ccGetSpriteScale(exec);
                break;
            case CC_GETSPRITEPITCH:
                ccGetSpritePitch(exec);
                break;
            case CC_GETSPRITEYAW:
                ccGetSpriteYaw(exec);
                break;
            case instr6670:
                method6236(exec);
                break;
            case CC_GETTRANSPARENCY:
                ccGetTransparency(exec);
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
            case CC_CONTAINERITEMID:
                ccGetContainerItemId(exec);
                break;
            case instr6150:
                method4565(exec);
                break;
            case instr6151:
                method4802(exec);
                break;
            case CC_GETOPTIONFLAGS:
                ccGetOptionFlags(exec);
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
                ifSetFront(exec);
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
                ifSetNoClickThrough(exec);
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
            case IF_SETMODELTINT:
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
            case IF_SETSPRITESHADOW:
                ifSetSpriteShadow(exec);
                break;
            case instr6183:
                method6669(exec);
                break;
            case instr6184:
                method1492(exec);
                break;
            case IF_SETSCROLLSIZE:
                method15510(exec);
                break;
            case IF_SETALPHA:
                ifSetAlpha(exec);
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
                ifSetNPCHead(exec);
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
                ifClearScripts(exec);
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
                ifGetParentLayer(exec);
                break;
            case IF_GETCOLOR:
                method454(exec);
                break;
            case IF_GETSCROLLX:
                ifGetScrollX(exec);
                break;
            case IF_GETSCROLLY:
                method11473(exec);
                break;
            case IF_GETTEXT:
                getCompText(exec);
                break;
            case IF_GETSCROLLWIDTH:
                ifGetScrollWidth(exec);
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
            case IF_GETOFFSETX:
                getOffsetX(exec);
                break;
            case IF_GETOFFSETY:
                ifGetOffsetY(exec);
                break;
            case IF_GETSPRITEID:
                ifGetSpriteId(exec);
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
            case IF_ISOPEN:
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
                closeInterfaces();
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
                sendPlayerInteraction(exec);
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
                playSoundVorbisVolume(exec);
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
                containerTotal(exec);
                break;
            case INV_SIZE:
                getInventorySize(exec);
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
                getMyPlayerXPos(exec);
                break;
            case COORDY:
                getMyPlayerYPos(exec);
                break;
            case COORDZ:
                getMyPlayerZPos(exec);
                break;
            case WORLD_MEMBERS:
                isWorldMembers(exec);
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
                getEnumValue(exec);
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
                getFriendsWorldId(exec);
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
                getFriendsChatName(exec);
                break;
            case FC_GETCHATCOUNT:
                getFriendsChatCount(exec);
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
                method7928();
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
                getFriendPlatform(exec);
                break;
            case FRIEND_GETSLOTFROMNAME:
                method1775(exec);
                break;
            case PLAYERCOUNTRY:
                getPlayerCountry(exec);
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
                getActiveClanChannelName(exec);
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
                getGEOfferType(exec);
                break;
            case STOCKMARKET_GETOFFERITEM:
                getGEOfferItem(exec);
                break;
            case STOCKMARKET_GETOFFERPRICE:
                getGEOfferPrice(exec);
                break;
            case STOCKMARKET_GETOFFERCOUNT:
                getGEOfferAmount(exec);
                break;
            case STOCKMARKET_GETOFFERCOMPLETEDCOUNT:
                getGEOfferCurrAmount(exec);
                break;
            case STOCKMARKET_GETOFFERCOMPLETEDGOLD:
                getGEOfferCompletedGold(exec);
                break;
            case STOCKMARKET_ISOFFEREMPTY:
                isGEOfferEmpty(exec);
                break;
            case STOCKMARKET_ISOFFERSTABLE:
                isGEOfferStable(exec);
                break;
            case STOCKMARKET_ISOFFERFINISHED:
                isGEOfferFinished(exec);
                break;
            case STOCKMARKET_ISOFFERADDING:
                isGEOfferAdding(exec);
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
                getParamWidth(exec);
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
                removeImageTags(exec);
                break;
            case STRING_INDEXOF_CHAR:
                method5915(exec);
                break;
            case STRING_INDEXOF_STRING:
                method3547(exec);
                break;
            case CHAR_TOLOWERCASE:
                charToLowerCase(exec);
                break;
            case CHAR_TOUPPERCASE:
                charToUpperCase(exec);
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
                findItem(exec);
                break;
            case ITEM_FINDNEXT:
                findNextItem(exec);
                break;
            case OC_FINDRESTART:
                method4315();
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
                getPublicFilter(exec);
                break;
            case CHAT_SETFILTER:
                setChatFilter(exec);
                break;
            case CHAT_SENDABUSEREPORT:
                sendReportAbusePacket(exec);
                break;
            case CHAT_GETBYLINE:
                getChatByLine(exec);
                break;
            case CHAT_GETTYPEBYLINE:
                getChatLineType(exec);
                break;
            case CHAT_GETFILTER_PRIVATE:
                getChatFilterPrivate(exec);
                break;
            case instr6563:
                method6005(exec);
                break;
            case SEND_PUBLIC_CHAT:
                sendChatMessage(exec);
                break;
            case SEND_PRIVATE_MESSAGE:
                sendPrivateMessage(exec);
                break;
            case instr6189:
                method6237(exec);
                break;
            case CHAT_GETCLAN:
                getChatLineClan(exec);
                break;
            case instr6565:
                method3783(exec);
                break;
            case CHAT_PLAYERNAME:
                method8717(exec);
                break;
            case CHAT_GETFILTER_TRADE:
                getTradeFilter(exec);
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
            case CHATLINE_GETCYCLES20MS:
                getChatTime20Ms(exec);
                break;
            case instr6577:
                method565(exec);
                break;
            case QC_GETNAME:
                qcGetName(exec);
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
            case QC_GETMESSAGE:
                qcGetMessage(exec);
                break;
            case instr6583:
                method5697(exec);
                break;
            case instr6584:
                method8865(exec);
                break;
            case instr6069:
                qcGetResponse(exec);
                break;
            case QC_SETMESSAGE:
                method11154(exec);
                break;
            case QC_SENDPUBLICMESSAGE:
                sendPublicQuickChatMessage(exec);
                break;
            case QC_SENDPRIVATEMESSAGE:
                sendPrivateQuickChatMessage(exec);
                break;
            case QC_SENDFRIENDSCHATMESSAGE:
                sendFriendsChatQuickChatMessage(exec);
                break;
            case QC_GETSUBHOTKEY:
                qcGetSubHotKey(exec);
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
                method3950();
                break;
            case QC_SENDCLANCHATMESSAGE:
                sendClanQuickChatMessage(exec);
                break;
            case QC_SENDGUESTCLANCHATMESSAGE:
                sendGuestClanQuickChatMessage(exec);
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
                method15403();
                break;
            case FULLSCREEN:
                chooseFullScreen(exec);
                break;
            case instr6488:
                method3613();
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
            case CHOOSE_RENDER_TYPE:
                chooseRenderType(exec);
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
                method2866();
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
                method7277();
                break;
            case instr6666:
                method11405(exec);
                break;
            case POP_2_INT:
                pop2Int(exec);
                break;
            case instr6661:
                method254(exec);
                break;
            case instr6866:
                method584(exec);
                break;
            case instr6416:
                method2171();
                break;
            case instr6410:
                method587();
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
                method1837();
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
                method4775();
                break;
            case instr6108:
                method1627();
                break;
            case instr6684:
                method1071();
                break;
            case instr6823:
                method7518();
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
                method8742();
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
                method6695();
                break;
            case instr6694:
                method3368();
                break;
            case SEND_VERIFY_EMAIL_PACKET:
                sendVerifyEmailPacket(exec);
                break;
            case SEND_SIGNUP_FORM_PACKET:
                sendSignupFormPacket(exec);
                break;
            case instr6697:
                method3172();
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
                method2107();
                break;
            case instr6305:
                method301(exec);
                break;
            case instr6707:
                loadLobby(exec);
                break;
            case instr6623:
                method775();
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
                method6280();
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
                method3120();
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
            case DETAIL_CUSTOMCURSOR:
                method1857(exec);
                break;
            case instr6743:
                method3750(exec);
                break;
            case instr6744:
                method1803(exec);
                break;
            case CHANGE_RENDER:
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
                method5816();
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
                method7187();
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
                method3233();
                break;
            case AUTOSETUP_SETMEDIUM:
                method7773();
                break;
            case AUTOSETUP_SETLOW:
                method15306();
                break;
            case AUTOSETUP_SETMIN:
                method6239();
                break;
            case instr6857:
                method4776();
                break;
            case instr6858:
                method6998();
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
                method7962();
                break;
            case instr6476:
                method14839();
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

    static void ccSetFront(boolean bool, CS2Executor executor) {
        CS2Interface underlaydefinition_3 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_3.defs;
        Interface interface_5 = underlaydefinition_3.inter;
        if (bool) {
            Interface.method7554(interface_5, icomponentdefinitions_4);
        } else {
            Interface.method3710(interface_5, icomponentdefinitions_4);
        }
    }

    static void ifSetPlace(boolean front, CS2Executor executor) {
        int i_3 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_4 = IComponentDefinitions.getDefs(i_3);
        Interface interface_5 = Interface.INTERFACES[i_3 >> 16];
        if (front) {
            Interface.method7554(interface_5, icomponentdefinitions_4);
        } else {
            Interface.method3710(interface_5, icomponentdefinitions_4);
        }

    }

    static void method5755(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aBool7323 ? 1 : 0;
    }

    static void method5756(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method1454(icomponentdefinitions_3, executor);
    }

    static void method5758(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method7927(icomponentdefinitions_3, executor);
    }

    static void method3546(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method5017(icomponentdefinitions_3, executor);
    }

    static void method3547(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        String string_2 = (String) executor.stringStack[executor.stringStackPtr];
        String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
        int i_4 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = string_2.indexOf(string_3, i_4);
    }

    static void method2597(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        if (client.aBool7310) {
            try {
                Class361.aClass361_4183.method6254(new Object[]{string_2});
            } catch (Throwable ignored) {
            }
        }
    }

    static void loadClanVarbit(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        ClanVarDefinitions class405_3 = IndexLoaders.CLAN_VAR_LOADER.method6753(i_2);
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

    static void loadClanSettingVarLong(CS2Executor executor) {
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

    static void loadClanSettingVarString(CS2Executor executor) {
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

    static void method11218(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        Class393.preferences.setValue(Class393.preferences.particles, i_2);
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void gotoInstr(CS2Executor executor) {
        executor.instrPtr += executor.intOpValues[executor.instrPtr];
    }

    static void method1255(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        MapAreaDefinitions worldmapareadefs_3 = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = worldmapareadefs_3.anInt2719;
    }

    static void method7518() {
        NodeCollection.method8146();
    }

    static void method7520(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method12209(icomponentdefinitions_3, executor);
    }

    static void getWaterPreference(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.water.getValue() == 2 ? 1 : 0;
    }

    static void method7522(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method6122(icomponentdefinitions_3, executor);
    }

    static void getMyPlayerPos(CS2Executor executor) {
        byte b_2 = VertexNormal.MY_PLAYER.plane;
        Vector3 vector3_3 = VertexNormal.MY_PLAYER.method11166().coords;
        CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getBase();
        int i_5 = ((int) vector3_3.x >> 9) + coordgrid_4.x;
        int i_6 = ((int) vector3_3.z >> 9) + coordgrid_4.y;
        executor.intStack[++executor.intStackPtr - 1] = (i_5 << 14) + i_6 + (b_2 << 28);
    }

    static void method15510(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setScrollSize(icomponentdefinitions_3, interface_4, executor);
    }

    static void getChatLineType(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ChatLine chatline_3 = ChatLine.getChatLine(i_2);
        int i_4 = -1;
        if (chatline_3 != null) {
            i_4 = chatline_3.type;
        }
        executor.intStack[++executor.intStackPtr - 1] = i_4;
    }

    static void method15513(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = method15508().toString();
    }

    public static File method15508() {
        return Engine.aFile3264;
    }

    static void method15514(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        ifSetColor(icomponentdefinitions_3, interface_4, executor);
    }

    static void method2865(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method11337(icomponentdefinitions_3, interface_4, executor);
    }

    static void method2866() {
        if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
            UID192.method7373(Class393.preferences.screenSize.method12687(), -1, -1);
        }
        if (NamedFileReference.method867() == Class279.aClass279_3368) {
            ClanSetting.saveVarcsToFile();
            System.exit(0);
        } else {
            Class480.method8043();
        }
    }

    static void method2867(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentEntity.method12997();
    }

    static void findNextItem(CS2Executor executor) {
        if (Class308.CS2_QUERY_RESULTS != null && StaticElements.CS2_QUERY_RESULT_IDX < VarcDefinitions.CS2_QUERY_RESULTS_LEN) {
            executor.intStack[++executor.intStackPtr - 1] = Class308.CS2_QUERY_RESULTS[++StaticElements.CS2_QUERY_RESULT_IDX - 1] & 0xffff;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = -1;
        }
    }

    static void method1366(CS2Executor executor) {
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

    static void method1367(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (i_2 < 0) {
            i_2 = 0;
        }
        client.anInt7271 = i_2 + client.anInt7270;
    }

    static void method1370(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = (int) client.camAngleY >> 3;
    }

    static void method12572(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        WorldMapDef class282_sub50_sub6_3 = Class125.method2173();
        if (class282_sub50_sub6_3 != null) {
            boolean bool_4 = class282_sub50_sub6_3.method14775(i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Executor.anIntArray5900);
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

    static void setPingWorlds(CS2Executor executor) {
        if (client.GAME_STATE == 0) {
            ConnectionInfo.PING_WORLDS = executor.intStack[--executor.intStackPtr] == 1;
        }
    }

    static void method8714(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method2960(icomponentdefinitions_3, interface_4, executor);
    }

    static void method8715(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method3251(icomponentdefinitions_3, executor);
    }

    static void isGEOfferStable(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        int i_3 = client.GRAND_EXCHANGE_SLOTS[i_2].getState();
        executor.intStack[++executor.intStackPtr - 1] = i_3 == 2 ? 1 : 0;
    }

    static void method8717(CS2Executor executor) {
        String string_2;
        if (VertexNormal.MY_PLAYER != null && VertexNormal.MY_PLAYER.username != null) {
            string_2 = VertexNormal.MY_PLAYER.getUsernameWithTitle();
        } else {
            string_2 = "";
        }
        executor.stringStack[++executor.stringStackPtr - 1] = string_2;
    }

    static void method8718(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        executor.aClass191_7008 = new Class191(string_2);
    }

    static void scale(CS2Executor executor) {
        executor.intStackPtr -= 3;
        long long_2 = executor.intStack[executor.intStackPtr];
        long long_4 = executor.intStack[executor.intStackPtr + 1];
        long long_6 = executor.intStack[executor.intStackPtr + 2];
        executor.intStack[++executor.intStackPtr - 1] = (int) (long_6 * long_2 / long_4);
    }

    static void arrayLoad(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        int i_3 = executor.intStack[--executor.intStackPtr];
        if (i_3 >= 0 && i_3 < executor.globalArrayLengths[i_2]) {
            executor.intStack[++executor.intStackPtr - 1] = executor.globalArrays[i_2][i_3];
        } else {
            throw new RuntimeException();
        }
    }

    static void method14679(CS2Executor executor) {
        isInterfaceOpen(executor);
    }

    static void method3779(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = executor.currentClanSettings.bannedUserNames[i_2];
    }

    static void method3780(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        QuickChatCategoryDefinitions class282_sub50_sub14_4 = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2);
        int i_5 = class282_sub50_sub14_4.subCategories[i_3];
        executor.intStack[++executor.intStackPtr - 1] = i_5;
    }

    static void method3781(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolKit.method12774() ? 1 : 0;
    }

    static void method3783(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ChatLine chatline_3 = ChatLine.getChatLine(i_2);
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

    static void method3554(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method8754(icomponentdefinitions_3, executor);
    }

    static void method3555(CS2Executor executor) {
        Class42.playSoundSong(executor.intStack[--executor.intStackPtr], 255, 50);
    }

    static void method3556(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        WorldMapDef class282_sub50_sub6_3 = Class125.method2173();
        if (class282_sub50_sub6_3 != null) {
            boolean bool_4 = class282_sub50_sub6_3.method14778(i_2 >> 28 & 0x3, i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Executor.anIntArray5900);
            if (bool_4) {
                FontRenderer_Sub2.method14263(CS2Executor.anIntArray5900[1], CS2Executor.anIntArray5900[2]);
            }
        }
    }

    static void method3557(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (Class291_Sub1.aClass465_8025 != null) {
            Node node_3 = Class291_Sub1.aClass465_8025.get(i_2);
            executor.intStack[++executor.intStackPtr - 1] = node_3 != null ? 1 : 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method466(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).method4101(Class158_Sub1.PLAYER_VAR_PROVIDER) ? 1 : 0;
    }

    static void longLessThan(CS2Executor executor) {
        executor.longStackPtr -= 2;
        if (executor.longStack[executor.longStackPtr] < executor.longStack[executor.longStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void sendClanQuickChatMessage(CS2Executor executor) {
        BufferedConnectionContext context = BufferedConnectionContext.getConnectionContext();
        TCPPacket packet = TCPPacket.createPacket(ClientProt.QUICKCHAT_PUBLIC, context.isaac);
        packet.buffer.writeByte(0);
        int startIndex = packet.buffer.index;
        packet.buffer.writeByte(2);
        packet.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
        executor.currentQuickChatMessage.qcMessageDefs.method14896(packet.buffer, executor.currentQuickChatMessage.anIntArray4046);
        packet.buffer.writeIndex(packet.buffer.index - startIndex);
        context.queuePacket(packet);
    }

    static void method471(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 1] = executor.clanChannel.getSortedPlayersByName()[executor.intStack[executor.intStackPtr - 1]];
    }

    static void multiply(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = i_3 * i_2;
    }

    static void method15387(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(4, i_2 << 16 | i_3, i_4, "");
    }

    static void branchEq1(CS2Executor executor) {
        if (executor.intStack[--executor.intStackPtr] == 1) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void branchEq0(CS2Executor executor) {
        if (executor.intStack[--executor.intStackPtr] == 0) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method1586(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (i_2 > 255 || i_2 < 0) {
            i_2 = 0;
        }
        if (i_2 != Class393.preferences.aPreference_Sub11_8217.method12699()) {
            Class393.preferences.setValue(Class393.preferences.aPreference_Sub11_8217, i_2);
            Class190.savePreferences();
            client.aBool7175 = false;
        }
    }

    static void method1590(CS2Executor executor) {
        int i_2 = ApplyHitmarkCutsceneAction.method14641();
        executor.intStack[++executor.intStackPtr - 1] = ClanVarSettingsIndexLoader.anInt2880 = Class393.preferences.currentToolkit.getValue();
        executor.intStack[++executor.intStackPtr - 1] = i_2;
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method3170(CS2Executor executor) {
        boolean bool_2 = false;
        if (client.aBool7310) {
            try {
                Object object_3 = Class361.aClass361_4178.method6254(new Object[]{Integer.valueOf(Class504.PLAYER_DOB), Boolean.valueOf(VertexNormal.MY_PLAYER.male == 1), Integer.valueOf(executor.intStack[--executor.intStackPtr])});
                if (object_3 != null) {
                    bool_2 = ((Boolean) object_3).booleanValue();
                }
            } catch (Throwable ignored) {
            }
        }
        executor.intStack[++executor.intStackPtr - 1] = bool_2 ? 1 : 0;
    }

    static void method3171(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method3601(icomponentdefinitions_3, executor);
    }

    static void method3172() {
        Node_Sub29.method12426();
    }

    static void method6279(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.particles.checkValid(i_2);
    }

    static void method6280() {
        client.aBool7189 = true;
        Class188.method3142();
    }

    static void method6281(CS2Executor executor) {
        Class163 class163_2 = executor.currentEntity.method15811();
        if (class163_2 == null) {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = class163_2.method2829();
        }
    }

    static void method15616(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        MapAreaDefinitions worldmapareadefs_3 = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2);
        if (worldmapareadefs_3.areaName == null) {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = worldmapareadefs_3.areaName;
        }
    }

    static void method6016(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method14892(icomponentdefinitions_3, executor);
    }

    static void setCCFont(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setIfFont(icomponentdefinitions_3, interface_4, executor);
    }

    static void method8263(CS2Executor executor) {
        if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
            UID192.method7373(Class393.preferences.screenSize.method12687(), -1, -1);
        }
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        boolean bool_3 = executor.intStack[--executor.intStackPtr] == 1;
        String string_4 = MapAreaDefinitions.method3741() + string_2;
        WorldMapDef.method14788(string_4, bool_3, client.aBool7158);
    }

    static void getNPCParam(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
        if (attributedefault_4.isString()) {
            executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.NPC_INDEX_LOADER.getNPCType(i_2).getCS2Param(i_3, attributedefault_4.typeName);
        } else {
            executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.NPC_INDEX_LOADER.getNPCType(i_2).method6876(i_3, attributedefault_4.defaultInt);
        }
    }

    static void addPercent(CS2Executor executor) {
        executor.intStackPtr -= 2;
        long long_2 = executor.intStack[executor.intStackPtr];
        long long_4 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = (int) (long_2 + long_2 * long_4 / 100L);
    }

    static void method3892(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method3078(icomponentdefinitions_3, executor);
    }

    static void method3893(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.buildArea.method12615();
    }

    static void method3894(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = InputSubscriberType.EMAIL_STATUS;
    }

    static void getPlayerGender(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = VertexNormal.MY_PLAYER.model != null && VertexNormal.MY_PLAYER.model.female ? 1 : 0;
    }

    static void method4881(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.soundEffectVolume.method12714();
    }

    static void method4882(CS2Executor executor) {
        Class492.method8265(0, 0, client.GAME_SCREEN_INTERFACE.width, client.GAME_SCREEN_INTERFACE.height, false);
        executor.intStack[++executor.intStackPtr - 1] = client.anInt7188;
        executor.intStack[++executor.intStackPtr - 1] = client.anInt7440;
    }

    static void storeVarc(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        Class320.VARC_INT[i_2] = executor.intStack[--executor.intStackPtr];
        MaterialProp26.method15264(i_2);
        client.NEEDS_VARC_SAVE |= Node_Sub17_Sub2.IS_VARC_SAVE_TO_FILE[i_2];
    }

    static void method5099(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        ifSetModelTint(icomponentdefinitions_3, executor);
    }

    static void method5100(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class41_Sub1_Sub1.method15524();
    }

    static void method13408(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method1642(icomponentdefinitions_3, executor);
    }

    static void method12859(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Preference_Sub28.LASTLOGINLDAY;
    }

    static void method2978(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.antiAliasingDefault.method12641();
    }

    static void method1853(CS2Executor executor) {
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

    static void method1854(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        int i_3 = executor.intStack[--executor.intStackPtr];
        FontMetrics fontmetrics_4 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, i_3);
        executor.intStack[++executor.intStackPtr - 1] = fontmetrics_4.getTextWidth(string_2, Class182.aNativeSpriteArray2261);
    }

    static void method1855(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = UID192.anInt5357;
    }

    static void stringLength(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        if (string_2 != null) {
            executor.intStack[++executor.intStackPtr - 1] = string_2.length();
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method1857(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.customCursors, executor.intStack[--executor.intStackPtr] != 0 ? 1 : 0);
        Class190.savePreferences();
    }

    static void method7643(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(i_2);
        int i_4 = -1;
        int i_5 = -1;
        Class119 class119_6 = defs.method2046(Renderers.CURRENT_RENDERER);
        if (class119_6 != null) {
            i_4 = class119_6.anInt1458;
            i_5 = class119_6.anInt1454;
        }
        executor.intStack[++executor.intStackPtr - 1] = i_4;
        executor.intStack[++executor.intStackPtr - 1] = i_5;
    }

    static void method6290(CS2Executor executor) {
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

    static void setCCText(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setCompText(icomponentdefinitions_3, interface_4, executor);
    }

    static void method13494(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        if (RenderFlagMap.aString3643 != null && RenderFlagMap.aString3643.equalsIgnoreCase(string_2)) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method14857(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.characterShadows, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void emailValidationAddNewAddress(CS2Executor executor) {
        --executor.stringStackPtr;
        executor.intStackPtr -= 3;
        String string_2 = (String) executor.stringStack[executor.stringStackPtr];
        boolean bool_3 = executor.intStack[executor.intStackPtr] == 1;
        boolean bool_4 = executor.intStack[executor.intStackPtr + 1] == 1;
        boolean bool_5 = executor.intStack[executor.intStackPtr + 2] == 1;
        TCPPacket tcpmessage_6 = TCPPacket.createPacket(ClientProt.EMAIL_VALIDATION_ADD_NEW_ADDRESS, client.LOBBY_CONNECTION_CONTEXT.isaac);
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

    static void method5829(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        Static.method2094(i_2);
    }

    static void randomInclusive(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = (int) (Math.random() * (i_2 + 1));
    }

    static void method5832(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.USERDETAIL_QUICKCHAT && !client.VERIFIED_EMAIL_ADDRESS ? 1 : 0;
    }

    static void method5833(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method13468(icomponentdefinitions_3, interface_4, executor);
    }

    static void method12659(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method7142(icomponentdefinitions_4, executor);
    }

    static void method12660(CS2Executor executor) {
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

    static void method13410(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.numPlayers;
    }

    static void ccGetSpritePitch(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spritePitch;
    }

    static void method1864(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        if (icomponentdefinitions_3.useOnName == null) {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.useOnName;
        }
    }

    static void method7928() {
        Class371.method6353();
    }

    static void method741(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method5455(icomponentdefinitions_3, executor);
    }

    static void method742(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        QuickChatCategoryDefinitions class282_sub50_sub14_3 = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2);
        if (class282_sub50_sub14_3.subCategories == null) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub14_3.subCategories.length;
        }
    }

    static void method743(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.textures.method12872() ? 1 : 0;
    }

    static void method745(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aBool7155 ? 1 : 0;
    }

    static void method8839(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        executor.intStackPtr -= 2;
        int i_3 = executor.intStack[executor.intStackPtr];
        int i_4 = executor.intStack[executor.intStackPtr + 1];
        executor.stringStack[++executor.stringStackPtr - 1] = string_2.substring(i_3, i_4);
    }

    static void method8843(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6288(icomponentdefinitions_3, executor);
    }

    static void method8844(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundBlending.method12761() ? 1 : 0;
    }

    static void getAnimationParam(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
        if (attributedefault_4.isString()) {
            executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.ANIMATION_LOADER.getAnimDefs(i_2).method11129(i_3, attributedefault_4.typeName);
        } else {
            executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ANIMATION_LOADER.getAnimDefs(i_2).method11133(i_3, attributedefault_4.defaultInt);
        }
    }

    static void method3676(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method7889(icomponentdefinitions_3, executor);
    }

    static void longGreaterThan(CS2Executor executor) {
        executor.longStackPtr -= 2;
        if (executor.longStack[executor.longStackPtr] > executor.longStack[executor.longStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method6350(CS2Executor executor) {
        boolean bool_2 = false;
        String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
        if (client.aBool7310) {
            try {
                Object object_4 = Class361.aClass361_4172.method6254(new Object[]{string_3});
                if (object_4 != null) {
                    bool_2 = ((Boolean) object_4).booleanValue();
                }
            } catch (Throwable ignored) {
            }
        }
        executor.intStack[++executor.intStackPtr - 1] = bool_2 ? 1 : 0;
    }

    static void method6799(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.AFFILIATE;
    }

    static void method6800(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        clearScripts(icomponentdefinitions_3);
    }

    static void method15475(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method5291(icomponentdefinitions_3, executor);
    }

    static void method3079(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.textures, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
        Class190.savePreferences();
        Class94.method1589();
        client.aBool7175 = false;
    }

    static void method3080(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setItemIFComp(icomponentdefinitions_3, interface_4, false, 2, executor);
    }

    static void method15399(CS2Executor executor) {
        QuestIndexLoader.method4167((String) executor.stringStack[--executor.stringStackPtr]);
    }

    static void method6796(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.y;
    }

    static void isGEOfferEmpty(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        int i_3 = client.GRAND_EXCHANGE_SLOTS[i_2].getState();
        executor.intStack[++executor.intStackPtr - 1] = i_3 == 0 ? 1 : 0;
    }

    static void method8199(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class158.getScreenMode();
    }

    static void method7006(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (Interface.INTERFACES[i_2] == null) {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        } else {
            String string_3 = Interface.INTERFACES[i_2].components[0].name;
            if (string_3 == null) {
                executor.stringStack[++executor.stringStackPtr - 1] = "";
            } else {
                executor.stringStack[++executor.stringStackPtr - 1] = string_3.substring(0, string_3.indexOf(58));
            }
        }
    }

    static void storeString(CS2Executor executor) {
        executor.objectLocals[executor.intOpValues[executor.instrPtr]] = executor.stringStack[--executor.stringStackPtr];
    }

    static void ifSetNPCHead(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        Interface inter = Interface.INTERFACES[hash >> 16];
        setNPCHead(defs, inter, executor);
    }

    static void method4864(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        resetOptionNames(icomponentdefinitions_3);
    }

    static void method4865(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        method1494(icomponentdefinitions_3, executor);
    }

    static void method4867(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.skyBoxes.checkValid(i_2);
    }

    static void storeVarcString(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        Class462.VARC_STRING[i_2] = (String) executor.stringStack[--executor.stringStackPtr];
        MaterialProp8.method15263(i_2);
    }

    static void hideComp(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method786(icomponentdefinitions_3, interface_4, executor);
    }

    static void method5302(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method1852(icomponentdefinitions_3, interface_4, executor);
    }

    static void method11125(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollX;
    }

    static void method11126(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method1455(icomponentdefinitions_3, interface_4, executor);
    }

    static void method11128(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(2, i_2 << 16 | i_3, i_4, "");
    }

    static void getEnumValue(CS2Executor executor) {
        executor.intStackPtr -= 4;
        int keyType = executor.intStack[executor.intStackPtr];
        int valueType = executor.intStack[executor.intStackPtr + 1];
        int enumId = executor.intStack[executor.intStackPtr + 2];
        int valueId = executor.intStack[executor.intStackPtr + 3];
        EnumDefinitions enumDefinitions = IndexLoaders.ENUM_LOADER.getEnumDefinitions(enumId);
        if (keyType == enumDefinitions.keyType && valueType == enumDefinitions.valueType) {
            if (valueType == 's') {
                executor.stringStack[++executor.stringStackPtr - 1] = enumDefinitions.getStringValue(valueId);
            } else {
                executor.intStack[++executor.intStackPtr - 1] = enumDefinitions.getIntValue(valueId);
            }
        } else {
            throw new RuntimeException(enumId + " " + valueId);
        }
    }

    static void method5902(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.talkRank;
    }

    static void method5904(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (Interface.INTERFACES[i_2] == null) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = Interface.INTERFACES[i_2].components.length;
        }
    }

    static void method6668(CS2Executor executor) {
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

    static void method6669(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method4280(icomponentdefinitions_3, executor);
    }

    static void method6670(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method14680(icomponentdefinitions_3, executor);
    }

    static void method6674(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        String string_2 = (String) executor.stringStack[executor.stringStackPtr];
        String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
        Class2.method257(string_2, string_3);
    }

    static void method6675(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.sceneryShadows.method12624();
    }

    static void method6449(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.modelType == ModelType.RAW_MODEL ? icomponentdefinitions_3.modelId : -1;
    }

    static void method6452(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method5291(icomponentdefinitions_3, executor);
    }

    static void method4030(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method3365(icomponentdefinitions_3, executor);
    }

    static void method4031(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.leftButtonDown() ? 1 : 0;
        executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.rightButtonDown() ? 1 : 0;
        executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.middleButtonDown() ? 1 : 0;
    }

    static void method4033(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        method14653(defs, executor);
    }

    static void method4035(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.maxScreenSize, executor.intStack[--executor.intStackPtr]);
        Class190.savePreferences();
        client.aBool7185 = true;
    }

    static void min(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = Math.min(i_2, i_3);
    }

    static void longGreaterOrEqual(CS2Executor executor) {
        executor.longStackPtr -= 2;
        if (executor.longStack[executor.longStackPtr] >= executor.longStack[executor.longStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method7021(CS2Executor executor) {
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

    static void method13301(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.idleAnimations.getValue();
    }

    static void method6773(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.idleAnimations.getValue();
    }

    static void method15551(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.characterShadows.checkValid(i_2);
    }

    static void ccGetContainerItemId(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.containerItemId;
    }

    static void method4278(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        Class402.deleteFriend(string_2);
    }

    static void method4279(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class293.method5206();
    }

    static void method4283(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method11221(icomponentdefinitions_3, executor);
    }

    static void setItem(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (VertexNormal.MY_PLAYER.model != null) {
            VertexNormal.MY_PLAYER.model.setItem(i_2, i_3, IndexLoaders.ITEM_LOADER);
        }
    }

    static void method775() {
        CursorIndexLoader.method7333(false);
    }

    static void method777(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).questPrerequisiteIds[executor.intStack[executor.intStackPtr - 1]];
        --executor.intStackPtr;
    }

    static void method779(CS2Executor executor) {
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

    static void method4295(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.replacementOwner;
    }

    static void intEqual(CS2Executor executor) {
        executor.intStackPtr -= 2;
        if (executor.intStack[executor.intStackPtr + 1] == executor.intStack[executor.intStackPtr]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method3064(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method2960(icomponentdefinitions_3, interface_4, executor);
    }

    static void method3065(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.angle2d;
    }

    static void method3066(CS2Executor executor) {
        if (Class475.supportsFullScreen) {
            Class467[] arr_2 = ClanVarDefinitions.method6825();
            executor.intStack[++executor.intStackPtr - 1] = arr_2.length;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method3067(CS2Executor executor) {
        getBoundingBox(executor.currentEntity, executor);
    }

    static void method3068(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class60.method1169((char) i_2) ? 1 : 0;
    }

    static void method5008(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method11223(icomponentdefinitions_3, executor);
    }

    static void method5010(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
        if (client.GAME_STATE == 0 && !JS5CacheFile.method3360()) {
            executor.intStack[++executor.intStackPtr - 1] = Class62.setGameHost(i_2, string_3) ? 1 : 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method12724(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
        if (itemdefinitions_3.certTemplateId >= 0 && itemdefinitions_3.certId >= 0) {
            executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_3.certId;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = i_2;
        }
    }

    static void method12215(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
        if (itemdefinitions_3.certTemplateId == -1 && itemdefinitions_3.certId >= 0) {
            executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_3.certId;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = i_2;
        }
    }

    static void method7143(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aPreference_Sub13_8229.method12714();
    }

    static void ccSetAspect(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        ifSetAspect(icomponentdefinitions_3, interface_4, executor);
    }

    static void method6283(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method5066(icomponentdefinitions_3, interface_4, executor);
    }

    static void method6284(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).value;
    }

    static void method6285(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt72;
    }

    static void method1775(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        if (string_2.startsWith(Class76.getCrown(0)) || string_2.startsWith(Class76.getCrown(1))) {
            string_2 = string_2.substring(7);
        }
        executor.intStack[++executor.intStackPtr - 1] = VarBitIndexLoader.method3910(string_2);
    }

    static void hookMousePress(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method15409(icomponentdefinitions_3, executor);
    }

    static void loadClanVarString(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        String string_3 = (String) Class46.CLAN_VARS[i_2];
        if (string_3 == null) {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = string_3;
        }
    }

    static void ccSetNPCHead(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setNPCHead(icomponentdefinitions_3, interface_4, executor);
    }

    static void method3357(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method14586(icomponentdefinitions_3, executor);
    }

    static void method3358(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.screenSize.method12687();
    }

    static void method3361(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.method1197((String) executor.stringStack[--executor.stringStackPtr]);
    }

    static void method1385(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method4149(icomponentdefinitions_3, executor);
    }

    static void method1387(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        WorldDescriptor class217_sub1_3 = WorldDescriptor.getWorld(i_2);
        if (class217_sub1_3 != null) {
            executor.intStack[++executor.intStackPtr - 1] = class217_sub1_3.flags;
            executor.stringStack[++executor.stringStackPtr - 1] = class217_sub1_3.unknown;
            WorldType class213_4 = class217_sub1_3.getWorld();
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

    static void method11147(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.buildArea.method12609() ? 1 : 0;
    }

    static void method6205(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 1] = executor.currentClanSettings.method1215()[executor.intStack[executor.intStackPtr - 1]];
    }

    static void getGEOfferCompletedGold(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].totalPrice;
    }

    static void random(CS2Executor executor) {
        int maxValue = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = (int) (Math.random() * maxValue);
    }

    static void method6210(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method789(icomponentdefinitions_3, interface_4, executor);
    }

    static void strAppend(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        String string_2 = (String) executor.stringStack[executor.stringStackPtr];
        String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
        executor.stringStack[++executor.stringStackPtr - 1] = string_2 + string_3;
    }

    static void method7929(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setScrollSize(icomponentdefinitions_3, interface_4, executor);
    }

    static void getCompWidth(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.width;
    }

    static void method7932(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        if (string_2.startsWith(Class76.getCrown(0)) || string_2.startsWith(Class76.getCrown(1))) {
            string_2 = string_2.substring(7);
        }
        executor.intStack[++executor.intStackPtr - 1] = Static.isFriend(string_2) ? 1 : 0;
    }

    static void method7933(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setAlpha(icomponentdefinitions_3, executor);
    }

    static void method893(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        ifSetModelOrigin(icomponentdefinitions_3, executor);
    }

    static void getChatTime20Ms(CS2Executor executor) {
        int lineIndex = executor.intStack[--executor.intStackPtr];
        ChatLine chatline_3 = ChatLine.getChatLine(lineIndex);
        int time20MS = -1;
        if (chatline_3 != null) {
            time20MS = chatline_3.time;
        }
        executor.intStack[++executor.intStackPtr - 1] = time20MS;
    }

    static void loadInt(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.intLocals[executor.intOpValues[executor.instrPtr]];
    }

    static void method12506(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        boolean bool_3 = executor.intStack[executor.intStackPtr + 1] == 1;
        if (Class291_Sub1.aClass465_8029 != null) {
            Node node_4 = Class291_Sub1.aClass465_8029.get(i_2);
            if (node_4 != null && !bool_3) {
                node_4.unlink();
            } else if (node_4 == null && bool_3) {
                node_4 = new Node();
                Class291_Sub1.aClass465_8029.put(node_4, i_2);
            }
        }
    }

    static void method12560(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.flickeringEffects.method12943() == 1 ? 1 : 0;
    }

    static void method12561(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (i_2 != -1) {
            CutsceneObject.method1563(i_2);
        }
    }

    static void method4089(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        executor.intStackPtr -= 3;
        int i_3 = executor.intStack[executor.intStackPtr];
        int i_4 = executor.intStack[executor.intStackPtr + 1];
        int i_5 = executor.intStack[executor.intStackPtr + 2];
        MaterialProp16.queryItemParamInt(string_2, i_3 == 1, i_4, i_5);
        executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.CS2_QUERY_RESULTS_LEN;
    }

    static void method4091(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class291.aCacheableNode_Sub6_3491 != null ? Class291.aCacheableNode_Sub6_3491.id : -1;
    }

    static void method15306() {
        Class119.method2077();
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method3667(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.currentToolkit.getValue();
    }

    static void method14340(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method14653(icomponentdefinitions_4, executor);
    }

    static void method14342(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method789(icomponentdefinitions_3, interface_4, executor);
    }

    static void chooseRenderType(CS2Executor executor) {
        int screenMode = executor.intStack[--executor.intStackPtr];
        if (screenMode >= 1 && screenMode <= 2 && !Class158.justBecameFullscreen) {
            GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            int width = gd.getDisplayMode().getWidth();
            int height = gd.getDisplayMode().getHeight();
            UID192.method7373(screenMode, width, height);
        } else
            Class158.justBecameFullscreen = false;
    }

    static void intLessThan(CS2Executor executor) {
        executor.intStackPtr -= 2;
        if (executor.intStack[executor.intStackPtr] < executor.intStack[executor.intStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method8750(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6313(icomponentdefinitions_3, executor);
    }

    static void method8753(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStackPtr -= 2;
        int i_4 = executor.intStack[executor.intStackPtr];
        int i_5 = executor.intStack[executor.intStackPtr + 1];
        ParamDefinitions attributedefault_6 = IndexLoaders.PARAM_LOADER.getParam(i_4);
        if (i_5 != attributedefault_6.defaultInt) {
            icomponentdefinitions_3.method1999(i_4, i_5);
        } else {
            icomponentdefinitions_3.method1995(i_4);
        }
    }

    static void method8756(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
            executor.intStack[++executor.intStackPtr - 1] = Class467.FC_PLAYERS[i_2].rank;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method8757(CS2Executor executor) {
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

    static void getWorldMapParam(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
        if (attributedefault_4.isString()) {
            executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2).method3722(i_3, attributedefault_4.typeName);
        } else {
            executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2).method3723(i_3, attributedefault_4.defaultInt);
        }
    }

    static void method5119(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = CutsceneAction_Sub20.method14668().getValue();
    }

    static void method5122(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.fog.method13417() == 1 ? 1 : 0;
    }

    static void method5123(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_4.scrollY;
    }

    static void method14578(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollHeight;
    }

    static void ifSetFront(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setComponentPosition(icomponentdefinitions_3, interface_4, executor);
    }

    static void method6687(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method14892(icomponentdefinitions_3, executor);
    }

    static void method6688(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method6010(icomponentdefinitions_4, interface_5, executor);
    }

    static void method6691(CS2Executor executor) {
        boolean bool_2 = executor.intStack[--executor.intStackPtr] != 0;
        int i_3 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = Connection.method3342(i_3, 0, bool_2, Class223.CURRENT_LANGUAGE);
    }

    static void method6695() {
        Shader.method1774();
    }

    static void findItem(CS2Executor executor) {
        String itemName = (String) executor.stringStack[--executor.stringStackPtr];
        int tradeableOnly = executor.intStack[--executor.intStackPtr];
        MaterialProp33.queryItemNoParams(itemName, tradeableOnly == 1);
        executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.CS2_QUERY_RESULTS_LEN;
    }

    static void method5692(CS2Executor executor) {
        AnimationDefinitions.method11148((GraphNode_Sub1) executor.activeWorldObject, executor.intStack[--executor.intStackPtr]);
        executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[0];
        executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[1];
        executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[2];
    }

    static void getFriendsWorldId(CS2Executor executor) {
        int friendIndex = executor.intStack[--executor.intStackPtr];
        if (client.anInt7434 == 2 && friendIndex < client.FRIEND_COUNT) {
            executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[friendIndex].worldId;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void playSoundSynth(CS2Executor executor) {
        executor.intStackPtr -= 3;
        VarNPCMap.playSoundSynth(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], 255, 256);
    }

    static void method3169(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.players[i_2].world;
    }

    static void method4161(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class152.method2598().getValue();
    }

    static void method4168(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.antiAliasingDefault, executor.intStack[--executor.intStackPtr]);
        Class190.savePreferences();
    }

    static void method14644(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.minRankToKick;
    }

    static void method12586(CS2Executor executor) {
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

    static void method572(CS2Executor executor) {
        boolean bool_2 = true;
        String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
        if (client.aBool7310) {
            try {
                Object object_4 = Class361.aClass361_4181.method6254(new Object[]{string_3});
                if (object_4 != null) {
                    bool_2 = ((Boolean) object_4).booleanValue();
                }
            } catch (Throwable ignored) {
            }
        }
        executor.intStack[++executor.intStackPtr - 1] = bool_2 ? 1 : 0;
    }

    static void method7704(CS2Executor executor) {
        WallDecoration.method16088(executor.intStack[--executor.intStackPtr]);
    }

    static void method14503(CS2Executor executor) {
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

    static void resumeCountDialog(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        int i_3 = 0;
        if (Class115.method1950(string_2)) {
            i_3 = Utils.parseInt(string_2);
        }
        TCPPacket tcpmessage_4 = TCPPacket.createPacket(ClientProt.RESUME_COUNTDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
        tcpmessage_4.buffer.writeInt(i_3);
        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_4);
    }

    static void pushLong(CS2Executor executor) {
        executor.longStack[++executor.longStackPtr - 1] = executor.current.longOpValues[executor.instrPtr];
    }

    static void method5915(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        executor.intStackPtr -= 2;
        int i_3 = executor.intStack[executor.intStackPtr];
        int i_4 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = string_2.indexOf(i_3, i_4);
    }

    static void getObjectParam(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        ParamDefinitions attributedefault_4 = IndexLoaders.PARAM_LOADER.getParam(i_3);
        if (attributedefault_4.isString()) {
            executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(i_2).method7973(i_3, attributedefault_4.typeName);
        } else {
            executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(i_2).method7963(i_3, attributedefault_4.defaultInt);
        }
    }

    static void setBaseIdentiKit(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (VertexNormal.MY_PLAYER.model != null) {
            int i_4;
            for (i_4 = 0; i_4 < IdentikitDefinition.anIntArray428.length; i_4++) {
                if (IdentikitDefinition.anIntArray428[i_4] == i_2) {
                    VertexNormal.MY_PLAYER.model.setIDKPart(i_4, i_3, IndexLoaders.IDENTIKIT_LOADER);
                    return;
                }
            }
            for (i_4 = 0; i_4 < IdentikitDefinition.anIntArray422.length; i_4++) {
                if (IdentikitDefinition.anIntArray422[i_4] == i_2) {
                    VertexNormal.MY_PLAYER.model.setIDKPart(i_4, i_3, IndexLoaders.IDENTIKIT_LOADER);
                    break;
                }
            }
        }
    }

    static void resumeClanForumQFCDialog(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.RESUME_CLANFORUMQFCDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
        tcpmessage_3.buffer.writeByte(string_2.length() + 1);
        tcpmessage_3.buffer.writeString(string_2);
        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
    }

    static void method2871(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
            executor.stringStack[++executor.stringStackPtr - 1] = client.FRIENDS[i_2].worldName;
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        }
    }

    static void getPublicFilter(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.PUBLIC_FILTER;
    }

    static void method2873(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.skyBoxes.method12728();
    }

    static void method4247(CS2Executor executor) {
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

    static void method4252(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Node_Sub25.method12402((char) i_2) ? 1 : 0;
    }

    static void method1479(CS2Executor executor) {
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

    static void method3918(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method8754(icomponentdefinitions_3, executor);
    }

    static void method3919(CS2Executor executor) {
        Class291_Sub1.aBool8027 = executor.intStack[--executor.intStackPtr] == 1;
    }

    static void sendFriendsChatQuickChatMessage(CS2Executor executor) {
        BufferedConnectionContext context = BufferedConnectionContext.getConnectionContext();
        TCPPacket packet = TCPPacket.createPacket(ClientProt.QUICKCHAT_PUBLIC, context.isaac);
        packet.buffer.writeByte(0);
        int i_4 = packet.buffer.index;
        packet.buffer.writeByte(1);
        packet.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
        executor.currentQuickChatMessage.qcMessageDefs.method14896(packet.buffer, executor.currentQuickChatMessage.anIntArray4046);
        packet.buffer.writeIndex(packet.buffer.index - i_4);
        context.queuePacket(packet);
    }

    static void method6138(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        method5001(icomponentdefinitions_3, executor);
    }

    static void method6139(CS2Executor executor) {
        long long_2 = executor.longStack[--executor.longStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = long_2 == -1L ? "" : Long.toString(long_2, 36).toUpperCase();
    }

    static void method6141(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method7547(icomponentdefinitions_3, executor);
    }

    static void method6142(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.fontId;
    }

    static void method289(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteScale;
    }

    static void method290(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        MapAreaDefinitions worldmapareadefs_3 = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = worldmapareadefs_3.anInt2718;
    }

    static void qcGetSubHotKey(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).subCategoryHotkeys[i_3];
    }

    static void method292(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.removeRoofs.method12952() == 2 ? 1 : 0;
    }

    static void isWorldMembers(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.membersWorld ? 1 : 0;
    }

    static void method5734(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.voiceOverVolume.method12714();
    }

    static void getParamWidth(CS2Executor executor) {
        String message = (String) executor.stringStack[--executor.stringStackPtr];
        executor.intStackPtr -= 2;
        int i_3 = executor.intStack[executor.intStackPtr];
        int fontId = executor.intStack[executor.intStackPtr + 1];
        FontMetrics font = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, fontId);
        executor.intStack[++executor.intStackPtr - 1] = font.method6951(message, i_3, Class182.aNativeSpriteArray2261);
    }

    static void method5736(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]).sortName;
    }

    static void method504(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = CS2Executor.anInt5904;
    }

    static void method1067(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).method4104(Class158_Sub1.PLAYER_VAR_PROVIDER, executor.intStack[executor.intStackPtr - 1]) ? 1 : 0;
        --executor.intStackPtr;
    }

    static void method1069(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method13468(icomponentdefinitions_3, interface_4, executor);
    }

    static void method1070(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        boolean bool_3 = executor.intStack[--executor.intStackPtr] == 1;
        Class76.method1360(string_2, bool_3);
        executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.CS2_QUERY_RESULTS_LEN;
    }

    static void method1071() {
        Class244.method4195();
    }

    static void storeVarp(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        Class158_Sub1.PLAYER_VAR_PROVIDER.method266(i_2, executor.intStack[--executor.intStackPtr]);
    }

    static void method2737(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class291_Sub1.anInt8015 == 100 ? 1 : 0;
    }

    static void method1357(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = SendFinishedCutsceneAction.anInt8307;
    }

    static void qcGetResponse(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int messageId = executor.intStack[executor.intStackPtr];
        int responseId = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(messageId).responses[responseId];
    }

    static void ifSetAlpha(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        setAlpha(defs, executor);
    }

    static void method3753(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).questpointRequirement;
    }

    static void method3755(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        MapAreaDefinitions worldmapareadefs_3 = IndexLoaders.WORLD_MAP_LOADER.getWorldMapDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = worldmapareadefs_3.anInt2722;
    }

    static void containerTotal(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int key = executor.intStack[executor.intStackPtr];
        int itemId = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getContainerTotal(key, itemId, false);
    }

    static void ccGetOptionFlags(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = client.getIComponentSettings(icomponentdefinitions_3).getUseOptionFlags();
    }

    static void method2101(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]).name;
    }

    static void method2102(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.memberRanks[i_2];
    }

    static void method2103(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = ((NPCEntity) executor.currentEntity).definitions.id;
    }

    static void loadVarc(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class320.VARC_INT[executor.intOpValues[executor.instrPtr]];
    }

    static void method6776(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method2955(icomponentdefinitions_3, executor);
    }

    static void method5697(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2).method14898();
    }

    static void pow(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (i_2 == 0) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = (int) Math.pow(i_2, i_3);
        }
    }

    static void method2563(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setItemIFComp(icomponentdefinitions_3, interface_4, true, 0, executor);
    }

    static void method2564(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method910(icomponentdefinitions_3, executor);
    }

    static void sendAClass379_4624(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        if (client.GAME_STATE == 0 && !JS5CacheFile.method3360()) {
            if (string_2.length() > 20) {
                client.aByte7458 = -4;
            } else {
                client.aByte7458 = -1;
                TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.DEPRECATED_97_SERVERPACKET_52, client.LOBBY_CONNECTION_CONTEXT.isaac);
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

    static void method2567(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method7729(icomponentdefinitions_3, executor);
    }

    static void method2568(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.flickeringEffects, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method1349(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method2955(icomponentdefinitions_3, executor);
    }

    static void method1350(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.characterShadows.method12966() == 1 ? 1 : 0;
    }

    static void method1351(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class469.LOYALTY_ENABLED ? 1 : 0;
    }

    static void method1352(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundBlending.checkValid(i_2);
    }

    static void method1355(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        IdentiKitIndexLoader.openSub(i_2, new SubInterface(i_3, 3), null, true);
    }

    static void ccCreate(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        IComponentDefinitions.getDefs(i_2);
        method2738(Interface.INTERFACES[i_2 >>> 16], i_2 & 0xffff, i_3, i_4, executor.aBool7022, executor);
    }

    static void method5296(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method3366(icomponentdefinitions_4, executor);
    }

    static void isGEOfferAdding(CS2Executor executor) {
        int slot = executor.intStack[--executor.intStackPtr];
        int state = client.GRAND_EXCHANGE_SLOTS[slot].getState();
        int[] ints_4 = executor.intStack;
        int i_5 = ++executor.intStackPtr - 1;
        byte b_6;
        if (state == 1) {
            b_6 = 1;
        } else {
            b_6 = 0;
        }
        ints_4[i_5] = b_6;
    }

    static void method5298(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.stringStackPtr -= 2;
        String string_3 = (String) executor.stringStack[executor.stringStackPtr];
        String string_4 = (String) executor.stringStack[executor.stringStackPtr + 1];
        if (string_3.length() <= 500 && string_4.length() <= 500) {
            NewsItem.method1804(i_2, string_3, string_4);
        }
    }

    static void method5299(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = LongNode.method13405(Utils.time());
    }

    static void getGEOfferPrice(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].price;
    }

    static void getCompText(CS2Executor executor) {
        int component = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(component);
        executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.text;
    }

    static void method5487(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setTransparency(icomponentdefinitions_3, executor);
    }

    static void method5488(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method15256(icomponentdefinitions_3, executor);
    }

    static void method5489(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.anInt7434 != 0 && i_2 < client.IGNORE_LIST_COUNT) {
            IgnoredPlayer class10_3 = client.IGNORED_PLAYERS[i_2];
            executor.stringStack[++executor.stringStackPtr - 1] = class10_3.displayName;
            if (class10_3.lastDisplayName != null) {
                executor.stringStack[++executor.stringStackPtr - 1] = class10_3.lastDisplayName;
            } else {
                executor.stringStack[++executor.stringStackPtr - 1] = "";
            }
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        }
    }

    static void method5490(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getContainerTotal(i_2, i_3, true);
    }

    static void method6314(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteId;
    }


    static void sendPublicQuickChatMessage(CS2Executor executor) {
        BufferedConnectionContext context = BufferedConnectionContext.getConnectionContext();
        TCPPacket packet = TCPPacket.createPacket(ClientProt.QUICKCHAT_PUBLIC, context.isaac);
        packet.buffer.writeByte(0);
        int startIndex = packet.buffer.index;
        packet.buffer.writeByte(0);
        packet.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
        executor.currentQuickChatMessage.qcMessageDefs.method14896(packet.buffer, executor.currentQuickChatMessage.anIntArray4046);
        packet.buffer.writeIndex(packet.buffer.index - startIndex);
        context.queuePacket(packet);
    }

    static void getGEOfferItem(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].itemId;
    }

    static void method6317(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = GameState.loggedIn(client.GAME_STATE) ? 1 : 0;
    }

    static void method6318(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setItemIFComp(icomponentdefinitions_3, interface_4, true, 2, executor);
    }

    static void setCompSprite(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method8390(icomponentdefinitions_3, interface_4, executor);
    }

    static void getPlayerIsMember(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.IS_MEMBER ? 1 : 0;
    }

    static void method1138(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        IComponentDefinitions icomponentdefinitions_5 = Index.getIComponentDefinitions(i_2 << 16 | i_3, i_4);
        Class60.method1170();
        IFTargetParams class282_sub10_6 = client.getIComponentSettings(icomponentdefinitions_5);
        Class304.setUseOptionFlags(icomponentdefinitions_5, class282_sub10_6.getUseOptionFlags(), class282_sub10_6.interfaceId);
    }

    static void method1140(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundBlending.method12762() == 1 ? 1 : 0;
    }

    static void method6310(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6122(icomponentdefinitions_3, executor);
    }

    static void method787(CS2Executor executor) {
        Node_Sub36 class282_sub36_2 = Class540.method11595();
        if (class282_sub36_2 == null) {
            executor.intStack[++executor.intStackPtr - 1] = -1;
            executor.intStack[++executor.intStackPtr - 1] = -1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = class282_sub36_2.anInt7991;
            int i_3 = class282_sub36_2.anInt7988 << 28 | class282_sub36_2.anInt7987 + Class291.anInt3472 << 14 | class282_sub36_2.anInt7993 + Class291.anInt3473;
            executor.intStack[++executor.intStackPtr - 1] = i_3;
        }
    }

    static void method11403(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method3987(icomponentdefinitions_3, interface_4);
    }

    static void method11405(CS2Executor executor) {
        executor.intStackPtr -= 2;
        client.anInt7340 = executor.intStack[executor.intStackPtr];
        client.anInt7342 = executor.intStack[executor.intStackPtr + 1];
    }

    static void method11406(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).stackable == 1 ? 1 : 0;
    }

    static void ifResumePauseButton(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method6942(icomponentdefinitions_3);
    }

    static void method4174(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method7667(icomponentdefinitions_3, interface_4, executor);
    }

    static void method4175(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(hash);
        method2170(icomponentdefinitions_3, executor);
    }

    static void method4176(CS2Executor executor) {
        int i_2 = client.anIntArrayArrayArray7302[executor.intStack[--executor.intStackPtr]].length >> 1;
        executor.intStack[++executor.intStackPtr - 1] = i_2;
    }

    static void method4177(CS2Executor executor) {
        executor.intStackPtr -= 4;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        int i_5 = executor.intStack[executor.intStackPtr + 3];
        CoordGrid coordgrid_6 = IndexLoaders.MAP_REGION_DECODER.getBase();
        RouteStrategy.moveCamera((i_2 >> 14 & 0x3fff) - coordgrid_6.x, (i_2 & 0x3fff) - coordgrid_6.y, i_3 << 2, i_4, i_5, false);
    }

    static void method4178(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        long long_5 = Class42.method891(i_2, i_3, i_4);
        int i_7 = LocationIndexLoader.method7914(long_5);
        if (i_4 < 1970) {
            --i_7;
        }
        executor.intStack[++executor.intStackPtr - 1] = i_7;
    }

    static void method4181(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        ProjectileCutsceneAction.deleteIgnore(string_2);
    }

    static void method6071(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method8390(icomponentdefinitions_3, interface_4, executor);
    }

    static void method6072(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.bloom.method12707() && Renderers.CURRENT_RENDERER.method8403() ? 1 : 0;
    }

    static void method6169(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        Node_Sub1.method11614(i_2);
    }

    static void intGreaterOrEqual(CS2Executor executor) {
        executor.intStackPtr -= 2;
        if (executor.intStack[executor.intStackPtr] >= executor.intStack[executor.intStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void getMouseY(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.getMouseY();
    }

    static void method300(CS2Executor executor) {
        NPCEntity npc_2 = (NPCEntity) executor.currentEntity;
        boolean bool_3 = false;
        NPCDefinitions npcdefinitions_4 = npc_2.definitions;
        if (npcdefinitions_4.transformTo != null) {
            npcdefinitions_4 = npcdefinitions_4.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
        }
        if (npcdefinitions_4 != null) {
            bool_3 = npcdefinitions_4.visible;
        }
        executor.intStack[++executor.intStackPtr - 1] = bool_3 ? 1 : 0;
    }

    static void method301(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt106;
    }

    static void method305(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6186(icomponentdefinitions_3, interface_4, executor);
    }

    static void method6998() {
        if (ClanVarSettingsIndexLoader.anInt2880 == 2) {
            Class188.aBool2378 = true;
        } else if (ClanVarSettingsIndexLoader.anInt2880 == 1) {
            Class188.aBool2377 = true;
        } else if (ClanVarSettingsIndexLoader.anInt2880 == 3) {
            Class188.aBool2372 = true;
        }
    }

    static void method4200(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStackPtr -= 10;
        byte[] bytes_4 = null;
        byte[] bytes_5 = null;
        int i_6;
        for (i_6 = 0; i_6 < 10 && executor.intStack[i_6 + executor.intStackPtr] >= 0; i_6 += 2) {
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

    static void method4201(CS2Executor executor) {
        IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
        if (icomponentdefinitions_2.containerItemId != -1) {
            executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_2.anInt1427;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method4202(CS2Executor executor) {
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

    static void setIfTextAlign(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        setIfTextAlign(defs, executor);
    }

    static void getAppletFocus(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = IFSubObjectPosition.appletHasFocus ? 1 : 0;
    }

    static void method6802(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method3987(icomponentdefinitions_3, interface_4);
    }

    static void method8327(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method7555(icomponentdefinitions_3, interface_4, executor);
    }

    static void storeLong(CS2Executor executor) {
        executor.longLocals[executor.intOpValues[executor.instrPtr]] = executor.longStack[--executor.longStackPtr];
    }

    static void ccSetModelOrthog(CS2Executor executor) {
        CS2Interface inter = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions defs = inter.defs;
        setModelOrtho(defs, executor);
    }

    static void method5016(CS2Executor executor) {
        QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
        executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.questPrerequisiteIds == null ? 0 : questdefinitions_2.questPrerequisiteIds.length;
    }

    static void longLessOrEqual(CS2Executor executor) {
        executor.longStackPtr -= 2;
        if (executor.longStack[executor.longStackPtr] <= executor.longStack[executor.longStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method5922(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = executor.currentClanSettings.clanName;
    }

    static void loadLobby(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        String string_2 = (String) executor.stringStack[executor.stringStackPtr];
        String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
        Class155.method2635(string_2, string_3);
    }

    static void getOffsetX(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        executor.intStack[++executor.intStackPtr - 1] = defs.offsetX;
    }

    static void method7699(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aBool7151 ? 1 : 0;
    }

    static void loadClanSettingVarbit(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        ClanVarSettingsDefinitions class537_3 = IndexLoaders.CLAN_VAR_SETTINGS_LOADER.method3933(i_2);
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

    static void method8859(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        method3965(icomponentdefinitions_4, executor);
    }

    static void method8863(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.x;
    }

    static void method933(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.currentOwner;
    }

    static void method934(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class11.SYSTEM_INFO.ram >= 512 && !client.aBool7465 && !client.aBool7171 ? 0 : 1;
    }

    static void bitOr(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = i_2 | i_3;
    }

    static void method3692(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.musicVolume.method12714();
    }

    static void method3693(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.water, executor.intStack[--executor.intStackPtr] == 1 ? 2 : 0);
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void clearCompChildren(CS2Executor executor) {
        IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
        icomponentdefinitions_2.slotChildren = null;
        icomponentdefinitions_2.itemSlots = null;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_2);
    }

    static void method3911(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(10, i_2 << 16 | i_3, i_4, "");
    }

    static void method1783(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (i_3 == -1) {
            executor.intStack[++executor.intStackPtr - 1] = -1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).method15212((char) i_3);
        }
    }

    static void method1784(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        CS2Interface underlaydefinition_3;
        if (executor.aBool7022) {
            underlaydefinition_3 = executor.hookedInterface2;
        } else {
            underlaydefinition_3 = executor.hookedInterface1;
        }
        executor.intStack[++executor.intStackPtr - 1] = underlaydefinition_3.method8766(executor.currentEntity.inter, i_2) ? 1 : 0;
    }

    static void method2953(CS2Executor executor) {
        QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
        executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.levelRequirements == null ? 0 : questdefinitions_2.levelRequirements.length;
    }

    static void method4773(CS2Executor executor) {
        if (client.anInt7434 == 0) {
            executor.intStack[++executor.intStackPtr - 1] = -2;
        } else if (client.anInt7434 == 1) {
            executor.intStack[++executor.intStackPtr - 1] = -1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = client.FRIEND_COUNT;
        }
    }

    static void method4774(CS2Executor executor) {
        String string_2 = null;
        if (Class119.HOSTNAME_IDENTIFIER != null) {
            string_2 = Class119.HOSTNAME_IDENTIFIER.getHostName();
        }
        if (string_2 == null) {
            string_2 = "";
        }
        executor.stringStack[++executor.stringStackPtr - 1] = string_2;
    }

    static void method4775() {
        QuestIndexLoader.method4166();
    }

    static void method4776() {
        Class393.preferences.setValue(Class393.preferences.graphics, 0);
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void containerTotalParamStack(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = NPCDirection.containerTotalParam(i_2, i_3, true);
    }

    static void loadVarcString(CS2Executor executor) {
        String string_2 = Class462.VARC_STRING[executor.intOpValues[executor.instrPtr]];
        if (string_2 == null) {
            string_2 = "";
        }
        executor.stringStack[++executor.stringStackPtr - 1] = string_2;
    }

    static void popString(CS2Executor executor) {
        --executor.stringStackPtr;
    }

    static void method7771(CS2Executor executor) {
        String string_2;
        if (VertexNormal.MY_PLAYER != null && VertexNormal.MY_PLAYER.username != null) {
            string_2 = VertexNormal.MY_PLAYER.getDisplayName();
        } else {
            string_2 = "";
        }
        executor.stringStack[++executor.stringStackPtr - 1] = string_2;
    }

    static void method7773() {
        Node_Sub40.method13300();
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method7774(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        SpotAnimIndexLoader.method8862(i_2, i_3 >> 14 & 0x3fff, i_3 & 0x3fff, true);
    }

    static void getVarpOld(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        executor.intStack[++executor.intStackPtr - 1] = ((PlayerEntity) executor.currentEntity).aClass155_10561.method2626(i_2);
    }

    static void method8343(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.antiAliasingDefault.method12646() && Renderers.CURRENT_RENDERER.method8405() ? 1 : 0;
    }

    static void method8344(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method6186(icomponentdefinitions_3, interface_4, executor);
    }

    static void getGEOfferAmount(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].amount;
    }

    static void method3803(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ChatLine chatline_3 = ChatLine.getChatLine(i_2);
        int i_4 = -1;
        if (chatline_3 != null) {
            i_4 = chatline_3.anInt1085;
        }
        executor.intStack[++executor.intStackPtr - 1] = i_4;
    }

    static void chooseFullScreen(CS2Executor executor) {
        ChatLine.appendChatMessage("Fullscreen only works for OpenGL Java 16+");
        executor.intStackPtr -= 2;
        if (Class475.supportsFullScreen) {
            ParticleProducer.switchRenderType(1/*renderOption*/, true);
            executor.intStack[++executor.intStackPtr - 1] = Engine.fullScreenFrame != null ? 1 : 0;
            GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            int width = gd.getDisplayMode().getWidth();
            int height = gd.getDisplayMode().getHeight();
            Class158.justBecameFullscreen = true;
            UID192.method7373(3, width, height);
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method3806(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setItemIFComp(icomponentdefinitions_3, interface_4, true, 1, executor);
    }

    static void method4556(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).method4093(Class158_Sub1.PLAYER_VAR_PROVIDER, client.SKILL_LEVEL_ACTUAL) ? 1 : 0;
    }

    static void method4557(CS2Executor executor) {
        executor.intStackPtr -= 3;
        Class42.playSoundSong(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2]);
    }

    static void method4558(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method505(icomponentdefinitions_3, executor);
    }

    static void stringEqual(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        executor.intStack[++executor.intStackPtr - 1] = Class455.method7557((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], Class223.CURRENT_LANGUAGE);
    }

    static void toString(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = Integer.toString(i_2);
    }

    static void method8215(CS2Executor executor) {
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

    static void method8218(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class380.method6450((char) i_2) ? 1 : 0;
    }

    static void method8219(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class488.anInt5760;
        executor.intStack[++executor.intStackPtr - 1] = Class351.anInt4097;
    }

    static void ifGetParentLayer(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        Interface inter = Interface.INTERFACES[hash >>> 16];
        IComponentDefinitions parent = IComponentDefinitions.getParentLayer(inter, defs);
        int i_8;
        if (parent == null) {
            i_8 = -1;
        } else {
            i_8 = parent.idHash;
        }
        executor.intStack[++executor.intStackPtr - 1] = i_8;
    }

    static void method1631(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method14586(icomponentdefinitions_4, executor);
    }

    static void method4838(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        method3738(defs, executor);
    }

    static void method4839(CS2Executor executor) {
        --executor.intStackPtr;
        int i_2 = executor.intStack[executor.intStackPtr];
        SubInterface class282_sub44_3 = (SubInterface) client.OPEN_INTERFACES.get(i_2);
        if (class282_sub44_3 != null && class282_sub44_3.overlay == 3) {
            Class351.closeChildren(class282_sub44_3, true, true);
        }
    }

    static void method6395(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method5009(icomponentdefinitions_4, executor);
    }

    static void method6396(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        MaterialProp13.method15430(i_2);
    }

    static void method6397(CS2Executor executor) {
        int i_2 = Class393.preferences.removeRoofs.method12952();
        Class393.preferences.setValue(Class393.preferences.removeRoofsOptionOverride, executor.intStack[--executor.intStackPtr] == 1 ? 0 : i_2);
        ClanVarDefinitions.method6823();
    }

    static void method6399(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = 0;
    }

    static void method6400(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        executor.intStackPtr -= 2;
        String string_2 = (String) executor.stringStack[executor.stringStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr];
        int i_4 = executor.intStack[executor.intStackPtr + 1];
        String string_5 = (String) executor.stringStack[executor.stringStackPtr + 1];
        ProjectileCutsceneAction.queryItemParamString(string_2, i_3 == 1, i_4, string_5);
        executor.intStack[++executor.intStackPtr - 1] = VarcDefinitions.CS2_QUERY_RESULTS_LEN;
    }

    static void method13044(CS2Executor executor) {
        if (client.FC_OWNER_NAME != null) {
            executor.stringStack[++executor.stringStackPtr - 1] = client.FC_OWNER_NAME;
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        }
    }

    static void method13046(CS2Executor executor) {
        if (Class113.CLAN_CHANNEL != null) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
            executor.clanChannel = Class113.CLAN_CHANNEL;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method3611(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.sceneryShadows, executor.intStack[--executor.intStackPtr]);
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method3613() {
        if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
            UID192.method7373(Class393.preferences.screenSize.method12687(), -1, -1);
        }
    }

    static void divide(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = i_2 / i_3;
    }

    static void method5765(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).wearPos2;
    }

    static void method5766(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.buildArea, executor.intStack[--executor.intStackPtr]);
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method5767(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.particles.method12797() ? 1 : 0;
    }

    static void method5769(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (Class475.supportsFullScreen) {
            Class467[] arr_3 = ClanVarDefinitions.method6825();
            executor.intStack[++executor.intStackPtr - 1] = arr_3[i_2].anInt5571;
            executor.intStack[++executor.intStackPtr - 1] = arr_3[i_2].anInt5574;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method6174(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteYaw;
    }

    static void ccSetHFlip(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions defs = underlaydefinition_2.defs;
        setHFlip(defs, executor);
    }

    static void method11438(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method3078(icomponentdefinitions_3, executor);
    }

    static void method11439(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        int i_3 = i_2 >> 14 & 0x3fff;
        int i_4 = i_2 & 0x3fff;
        CoordGrid coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getBase();
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

    static void method11440(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(1, i_2 << 16 | i_3, i_4, "");
    }

    static void method4965(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method4160(icomponentdefinitions_3, executor);
    }

    static void method4966(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        EnumDefinitions enumdefinitions_4 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2);
        executor.stringStack[++executor.stringStackPtr - 1] = enumdefinitions_4.getStringValue(i_3);
    }

    static void fromDate(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = Static.method13045(Class302.method5363(executor.intStack[--executor.intStackPtr]), Class223.CURRENT_LANGUAGE.getValue());
    }

    static void method4968(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        LightDetailPreference.method12790(executor.clanChannel == Class113.CLAN_CHANNEL, i_2);
    }

    static void method4970(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method6313(icomponentdefinitions_3, executor);
    }

    static void method4971(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions defs = underlaydefinition_2.defs;
        method910(defs, executor);
    }

    static void method5197(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getAmountAtSlot(i_2, i_3, false);
    }

    static void method5198(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).membersOnly ? 1 : 0;
    }

    static void method5199(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (i_2 != -1) {
            Class123.method2152(i_2);
        }
    }

    static void method563(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        ifSetModelOrigin(icomponentdefinitions_3, executor);
    }

    static void method564(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method4651(icomponentdefinitions_3, executor);
    }

    static void method565(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ChatLine chatline_3 = ChatLine.getChatLine(i_2);
        String str_4 = "";
        if (chatline_3 != null && chatline_3.nameSimple != null) {
            str_4 = chatline_3.nameSimple;
        }
        executor.stringStack[++executor.stringStackPtr - 1] = str_4;
    }

    static void method6851(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method14605(icomponentdefinitions_3, executor);
    }

    static void method1391(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = MapSpriteIndexLoader.anInt5123 + Class291.anInt3472;
        executor.intStack[++executor.intStackPtr - 1] = Class475.anInt5624 + Class291.anInt3473;
    }

    static void setCCTextAlign(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setIfTextAlign(icomponentdefinitions_3, executor);
    }

    static void method6272(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        int[] ints_3 = AreadSound.method4799(i_2);
        Class503.method8362(ints_3, 0, executor.intStack, executor.intStackPtr, 3);
        executor.intStackPtr += 3;
    }

    static void method6275(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aBool7344 ? 1 : 0;
        executor.stringStack[++executor.stringStackPtr - 1] = client.aString7356 == null ? "" : client.aString7356;
        executor.stringStack[++executor.stringStackPtr - 1] = client.aString7275 == null ? "" : client.aString7275;
    }

    static void method16079(CS2Executor executor) {
        executor.intStackPtr -= 2;
        HostNameIdentifier.method486(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], 0);
    }

    static void method1624(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method569(icomponentdefinitions_3, executor);
    }

    static void getFriendPlatform(CS2Executor executor) {
        int friendIndex = executor.intStack[--executor.intStackPtr];
        if (client.anInt7434 == 2 && friendIndex >= 0 && friendIndex < client.FRIEND_COUNT) {
            executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[friendIndex].platform;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method1627() {
        Wall.method16114();
    }

    static void arrayNew(CS2Executor executor) {
        int arrayIndex = executor.intOpValues[executor.instrPtr] >> 16;
        int valueIsZero = executor.intOpValues[executor.instrPtr] & 0xffff;
        int size = executor.intStack[--executor.intStackPtr];
        if (size >= 0 && size <= 5000) {
            executor.globalArrayLengths[arrayIndex] = size;
            byte b_5 = -1;
            if (valueIsZero == 105) {
                b_5 = 0;
            }
            for (int i = 0; i < size; i++)
                executor.globalArrays[arrayIndex][i] = b_5;
        } else {
            throw new RuntimeException();
        }
    }

    static void subtract(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = i_2 - i_3;
    }

    static void method2963(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (Class291_Sub1.aClass465_8029 != null) {
            Node node_3 = Class291_Sub1.aClass465_8029.get(i_2);
            executor.intStack[++executor.intStackPtr - 1] = node_3 != null ? 1 : 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method2965(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method8387(icomponentdefinitions_4, executor);
    }

    static void method1802(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.memberCount;
    }

    static void method1803(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.groundBlending, executor.intStack[--executor.intStackPtr] != 0 ? 1 : 0);
        Class190.savePreferences();
        IndexLoaders.MAP_REGION_DECODER.method4547();
    }

    static void strAppendSigNum(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        int i_3 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = string_2 + HeadbarIndexLoader.method5120(i_3, true);
    }

    static void method927(CS2Executor executor) {
        int i_2 = client.OPEN_INTERFACES.size();
        if (client.BASE_WINDOW_ID != -1) {
            ++i_2;
        }
        executor.intStack[++executor.intStackPtr - 1] = i_2;
    }

    static void method928(CS2Executor executor) {
        if (PlaySoundJingleCutsceneAction.keyRecorder.held(82)) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method2586(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.cpu, executor.intStack[--executor.intStackPtr]);
        Class190.savePreferences();
    }

    static void method2587(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aShort7436;
        executor.intStack[++executor.intStackPtr - 1] = client.aShort7437;
    }

    static void method2588(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.water.method12923() ? 1 : 0;
    }

    static void ifSetOnMouseLeave(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setOnMouseLeave(icomponentdefinitions_3, executor);
    }

    static void sendPlayerInteraction(CS2Executor executor) {
        int option = executor.intStack[--executor.intStackPtr];
        String name = (String) executor.stringStack[--executor.stringStackPtr];
        Class119.sendPlayerOptionInteraction(option, name);
    }

    static void method6195(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aPreference_Sub4_8223.method12641();
    }

    static void longNotEqual(CS2Executor executor) {
        executor.longStackPtr -= 2;
        if (executor.longStack[executor.longStackPtr] != executor.longStack[executor.longStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method2855(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method5017(icomponentdefinitions_3, executor);
    }

    static void method2856(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        Queue class477_4 = Class291.method5127(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
        boolean bool_5 = false;
        for (WorldMapDef class282_sub50_sub6_6 = (WorldMapDef) class477_4.method7941(); class282_sub50_sub6_6 != null; class282_sub50_sub6_6 = (WorldMapDef) class477_4.method7955()) {
            if (i_3 == class282_sub50_sub6_6.id) {
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

    static void method3768(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        FontRenderer_Sub2.method14263(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
    }

    static void method3769(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentGroundItem.method12997();
    }

    static void method14491(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class48_Sub2.MY_PLAYER_FC_RANK;
    }

    static void qcGetMessage(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int qcId = executor.intStack[executor.intStackPtr];
        int messageId = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(qcId).messages[messageId];
    }

    static void method283(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        ifSetAspect(icomponentdefinitions_3, interface_4, executor);
    }

    static void method284(CS2Executor executor) {
        boolean bool_2 = executor.intStack[--executor.intStackPtr] == 1;
        Class393.preferences.setValue(Class393.preferences.removeRoofs, bool_2 ? 2 : 1);
        Class393.preferences.setValue(Class393.preferences.removeRoofsOptionOverride, bool_2 ? 2 : 1);
        ClanVarDefinitions.method6823();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method287(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = (int) (Utils.time() / 86400000L) - 11745;
    }

    static void method481(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.graphics.method12654();
    }

    static void method484(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method4160(icomponentdefinitions_3, executor);
    }

    static void method485(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method1642(icomponentdefinitions_4, executor);
    }

    static void method14606(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.GAME_SCREEN_INTERFACE == null ? -1 : client.GAME_SCREEN_INTERFACE.idHash;
    }

    static void method7322(CS2Executor executor) {
        method11160(Class507.method8727(), executor);
    }

    static void method6762(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method3338(icomponentdefinitions_3, executor);
    }

    static void method8723(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method3338(icomponentdefinitions_3, executor);
    }

    static void method8724(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (Interface.INTERFACES[i_2] == null) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = Interface.INTERFACES[i_2].components[i_3].serverTriggers;
        }
    }

    static void ccSetModelAnim(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setModelAnim(icomponentdefinitions_3, interface_4, executor);
    }

    static void method7270(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method502(icomponentdefinitions_3, executor);
    }

    static void method7274(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.lootshareRank;
    }

    static void method7276(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        WorldMapDef class282_sub50_sub6_3 = Class291.method5130(i_2);
        if (class282_sub50_sub6_3 == null) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.regionHash >> 14 & 0x3fff;
            executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.regionHash & 0x3fff;
        }
    }

    static void method7277() {
        Class76.method1361();
        Class20.aBool187 = false;
    }

    static void method2091(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int messageId = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        QuickchatMessageDefinitions defs = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(messageId);
        if (defs.method14918(i_3).id != 0) {
            throw new RuntimeException("");
        } else {
            executor.intStack[++executor.intStackPtr - 1] = defs.method14901(i_3, i_4);
        }
    }

    static void method2092(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).levelRequirements[executor.intStack[executor.intStackPtr - 1]][0];
        --executor.intStackPtr;
    }

    static void getVarnbitOld(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        executor.intStack[++executor.intStackPtr - 1] = ((NPCEntity) executor.currentEntity).varns.getVarnBit(i_2);
    }

    static void method2096(CS2Executor executor) {
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

    static void ccSetHide(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method786(icomponentdefinitions_4, interface_5, executor);
    }

    static void method2639(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        NPCEntity npc_3 = (NPCEntity) executor.currentEntity;
        int i_4 = npc_3.method16163(i_2);
        int i_5 = npc_3.method16169(i_2);
        executor.intStack[++executor.intStackPtr - 1] = i_4;
        executor.intStack[++executor.intStackPtr - 1] = i_5;
    }

    static void animateComp(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setModelAnim(icomponentdefinitions_3, interface_4, executor);
    }

    static void method8742() {
        EntityNode_Sub7.method12606();
    }

    static void returnInstr(CS2Executor executor) {
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

    static void method4137(CS2Executor executor) {
        AnimationDefinitions.method11148(executor.currentGroundItem, executor.intStack[--executor.intStackPtr]);
        executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[0];
        executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[1];
        executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[2];
    }

    static void switchInstr(CS2Executor executor) {
        IterableNodeMap iterablenodemap_2 = executor.current.switchMaps[executor.intOpValues[executor.instrPtr]];
        IntNode class282_sub38_3 = (IntNode) iterablenodemap_2.get(executor.intStack[--executor.intStackPtr]);
        if (class282_sub38_3 != null) {
            executor.instrPtr += class282_sub38_3.value;
        }
    }

    static void method5314(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        ifSetColor(icomponentdefinitions_4, interface_5, executor);
    }

    static void callCS2Script(CS2Executor executor) {
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

    static void method15449(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.bloom.method12706() == 1 ? 1 : 0;
    }

    static void method2549(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class383.method6513(Class393.preferences.currentToolkit.getValue(), 200);
    }

    static void method2552(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.CURRENT_CURSOR;
    }

    static void method2554(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        int i_3 = Class393.preferences.musicVolume.method12714();
        if (i_2 != i_3) {
            if (GameState.loggedIn(client.GAME_STATE)) {
                if (i_3 == 0 && Class260.anInt3223 != -1) {
                    Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, i_2);
                    GraphicsPreference.method12658();
                    Class260.aBool3220 = false;
                } else if (i_2 == 0) {
                    VarBitDefinitions.method3805();
                    Class260.aBool3220 = false;
                } else {
                    ParticleEmitterConfig.method1491(i_2);
                }
            }
            Class393.preferences.setValue(Class393.preferences.musicVolume, i_2);
            Class190.savePreferences();
            client.aBool7175 = false;
        }
    }

    static void method7032(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.width;
    }

    static void method14659(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollHeight;
    }

    static void method14660(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method1494(icomponentdefinitions_3, executor);
    }

    static void setCompTransparency(CS2Executor executor) {
        int interfaceId = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(interfaceId);
        Interface interface_4 = Interface.INTERFACES[interfaceId >> 16];
        setTransparency(icomponentdefinitions_3, executor);
    }

    static void method1259(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method13450(icomponentdefinitions_3, executor);
    }

    static void removeImageTags(CS2Executor executor) {
        String message = (String) executor.stringStack[--executor.stringStackPtr];
        StringBuilder builder = new StringBuilder(message.length());
        boolean insideBrackets = false;
        for (int i = 0; i < message.length(); i++) {
            char charCode = message.charAt(i);
            if (charCode == 60) {
                insideBrackets = true;
            } else if (charCode == 62) {
                insideBrackets = false;
            } else if (!insideBrackets) {
                builder.append(charCode);
            }
        }
        executor.stringStack[++executor.stringStackPtr - 1] = builder.toString();
    }

    static void pop2Int(CS2Executor executor) {
        executor.intStackPtr -= 2;
    }

    static void closeInterfaces() {
        LinkedNodeList.closeInterfaces();
    }

    static void method3940(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        method6689(defs, executor);
    }

    static void method3941(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method3738(icomponentdefinitions_3, executor);
    }

    static void method3942(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.monoStereo, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
        MaterialProp33.method15418();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void playSoundVorbisVolume(CS2Executor executor) {
        executor.intStackPtr -= 4;
        Class435.playSoundVorbis(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], false, 256);
    }

    static void getChatByLine(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ChatLine chatline_3 = ChatLine.getChatLine(i_2);
        String str_4 = "";
        if (chatline_3 != null && chatline_3.message != null) {
            str_4 = chatline_3.message;
        }
        executor.stringStack[++executor.stringStackPtr - 1] = str_4;
    }

    static void method2825(CS2Executor executor) {
        if (client.aByteArray7152 != null) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method2826(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method12260(icomponentdefinitions_3, interface_4, executor);
    }

    static void getItemParam(CS2Executor executor) {
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

    static void getInventorySize(CS2Executor executor) {
        int invId = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.INVENTORY_LOADER.getInventoryDef(invId).maxSize;
    }

    static void ccSetNoClickThrough(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setNoClickThrough(icomponentdefinitions_3, executor);
    }

    static void method3164(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.IGNORED_PLAYERS[i_2].temporary ? 1 : 0;
    }

    static void ccGetParentLayer(CS2Executor executor) {
        CS2Interface inter = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = inter.defs;
        Interface interface_4 = inter.inter;
        IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getParentLayer(interface_4, icomponentdefinitions_3);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_5 == null ? -1 : icomponentdefinitions_5.idHash;
    }

    static void ccSetSize(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method12260(icomponentdefinitions_4, interface_5, executor);
    }

    static void method6117(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        int i_3 = executor.intStack[--executor.intStackPtr];
        if (i_3 == -1) {
            throw new RuntimeException("");
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = string_2 + (char) i_3;
        }
    }

    static void method6120(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method1083(icomponentdefinitions_3, executor);
    }

    static void method6121(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class20.anInt169;
        executor.intStack[++executor.intStackPtr - 1] = Class20.anInt170;
    }

    static void method1084(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method6158(icomponentdefinitions_3, executor);
    }

    static void method1085(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.currentQuickChatMessage.anIntArray4046[i_2] = i_3;
    }

    static void storeInt(CS2Executor executor) {
        executor.intLocals[executor.intOpValues[executor.instrPtr]] = executor.intStack[--executor.intStackPtr];
    }

    static void getMyPlayerXPos(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = i_2 >> 14 & 0x3fff;
    }

    static void method1467(CS2Executor executor) {
        if (client.PLAYER_MOD_LEVEL >= 5 && client.PLAYER_MOD_LEVEL <= 9) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method2169(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method869(icomponentdefinitions_3, executor);
    }

    static void method2171() {
        Class361.aClass361_4171.method6257();
    }

    static void method6439(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2).method14918(i_3).id;
        executor.intStack[++executor.intStackPtr - 1] = i_4;
    }

    static void method6440(CS2Executor executor) {
        String str_2 = "";
        if (Class182.aClipboard2263 != null) {
            Transferable transferable_3 = Class182.aClipboard2263.getContents(null);
            if (transferable_3 != null) {
                try {
                    str_2 = (String) transferable_3.getTransferData(DataFlavor.stringFlavor);
                    if (str_2 == null) {
                        str_2 = "";
                    }
                } catch (Exception ignored) {
                }
            }
        }
        executor.stringStack[++executor.stringStackPtr - 1] = str_2;
    }

    static void method5045(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.parent;
    }

    static void getChatFilterPrivate(CS2Executor executor) {
        if (Class149_Sub2.PRIVATE_FILTER == null) {
            executor.intStack[++executor.intStackPtr - 1] = -1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = Class149_Sub2.PRIVATE_FILTER.id;
        }
    }

    static void method5047(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        Class393.preferences.setValue(Class393.preferences.brightness, i_2);
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method4413(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (!Renderers.CURRENT_RENDERER.method8403()) {
            executor.intStack[++executor.intStackPtr - 1] = 3;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.bloom.checkValid(i_2);
        }
    }

    static void method4417(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt103;
    }

    static void method12881(CS2Executor executor) {
        if (QuickchatFiller.CLAN_SETTINGS != null) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
            executor.currentClanSettings = QuickchatFiller.CLAN_SETTINGS;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method11350(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.offsetX;
    }

    static void method11351(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.sceneryShadows.checkValid(i_2);
    }

    static void method11355(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
            executor.stringStack[++executor.stringStackPtr - 1] = Class467.FC_PLAYERS[i_2].worldName;
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        }
    }

    static void method7676(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        int i_4 = -1;
        int i_5 = -1;
        Class119 class119_6 = icomponentdefinitions_3.method2046(Renderers.CURRENT_RENDERER);
        if (class119_6 != null) {
            i_4 = class119_6.anInt1458;
            i_5 = class119_6.anInt1454;
        }
        executor.intStack[++executor.intStackPtr - 1] = i_4;
        executor.intStack[++executor.intStackPtr - 1] = i_5;
    }

    static void isHidden(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.hidden ? 1 : 0;
    }

    static void ifGetSpriteId(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteId;
    }

    static void bitFlagged(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = (i_2 & 1 << i_3) != 0 ? 1 : 0;
    }

    static void method11592(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).varbitRequirementNames[executor.intStack[executor.intStackPtr - 1]];
        executor.intStackPtr -= 2;
    }

    static void method11593(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method4772(icomponentdefinitions_3, executor);
    }

    static void method11594(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.EMAIL_VALIDATION_SUBMIT_CODE, client.LOBBY_CONNECTION_CONTEXT.isaac);
        tcpmessage_3.buffer.writeByte(ChatLine.getLength(string_2));
        tcpmessage_3.buffer.writeString(string_2);
        client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
    }

    static void getGEOfferCurrAmount(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].currentAmount;
    }

    static void method5332(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method8310(icomponentdefinitions_3, executor);
    }

    static void method5335(CS2Executor executor) {
        executor.intStackPtr -= 5;
        Class435.playSoundVorbis(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], false, executor.intStack[executor.intStackPtr + 4]);
    }

    static void method7082(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.monoStereo.method12691() == 1 ? 1 : 0;
    }

    static void method7083(CS2Executor executor) {
        QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
        executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.varBitRequirements == null ? 0 : questdefinitions_2.varBitRequirements.length;
    }

    static void method584(CS2Executor executor) {
        RouteFinder.handleCommand((String) executor.stringStack[--executor.stringStackPtr], false, false);
    }

    static void method585(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.lightDetail.method12786() == 1 ? 1 : 0;
    }

    static void method586(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class504.PLAYER_DOB;
    }

    static void method587() {
        Class361.aClass361_4182.method6257();
    }

    static void method1949(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method569(icomponentdefinitions_3, executor);
    }

    static void isGEOfferFinished(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        int i_3 = client.GRAND_EXCHANGE_SLOTS[i_2].getState();
        executor.intStack[++executor.intStackPtr - 1] = i_3 == 5 ? 1 : 0;
    }

    static void method4898(CS2Executor executor) {
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

    static void method4899(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        int i_3 = Class393.preferences.aPreference_Sub13_8229.method12714();
        if (i_3 != i_2 && Class260.anInt3228 == Class260.anInt3223) {
            if (!GameState.loggedIn(client.GAME_STATE)) {
                if (i_3 == 0) {
                    Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, i_2);
                    GraphicsPreference.method12658();
                    Class260.aBool3220 = false;
                } else if (i_2 == 0) {
                    VarBitDefinitions.method3805();
                    Class260.aBool3220 = false;
                } else {
                    ParticleEmitterConfig.method1491(i_2);
                }
            }
            Class393.preferences.setValue(Class393.preferences.aPreference_Sub13_8229, i_2);
            Class190.savePreferences();
            client.aBool7175 = false;
        }
    }

    static void method4900(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.textures.method12873() == 1 ? 1 : 0;
    }

    static void method4901(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollWidth;
    }

    static void method4902(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        Connection.method3345(string_2);
    }

    static void method15437(CS2Executor executor) {
        if (client.GAME_STATE == 0 && !JS5CacheFile.method3360()) {
            if (ConnectionInfo.aBool5422) {
                executor.intStack[++executor.intStackPtr - 1] = 0;
            } else if (ConnectionInfo.aLong5425 > Utils.time() - 1000L) {
                executor.intStack[++executor.intStackPtr - 1] = 1;
            } else {
                ConnectionInfo.aBool5422 = true;
                TCPPacket tcpmessage_2 = TCPPacket.createPacket(ClientProt.REQUEST_WORLD_LIST, client.LOBBY_CONNECTION_CONTEXT.isaac);
                tcpmessage_2.buffer.writeInt(MapSpriteDefinitions.WORLD_LIST_IDK);
                client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
                executor.intStack[++executor.intStackPtr - 1] = 0;
            }
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        }
    }

    static void containerTotalParam(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = NPCDirection.containerTotalParam(i_2, i_3, false);
    }

    static void method3229(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).multiStackSize;
    }

    static void setIfFont(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setIfFont(icomponentdefinitions_3, interface_4, executor);
    }

    static void method3233() {
        EquipmentDefaults.method11248();
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method11492(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setModelOrtho(icomponentdefinitions_3, executor);
    }

    static void method6304(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2).method14916();
    }

    static void method6305(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        method7927(icomponentdefinitions_3, executor);
    }

    static void method11473(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollY;
    }

    static void method3200(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.voiceOverVolume, executor.intStack[--executor.intStackPtr]);
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method3201(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method15207(icomponentdefinitions_3, executor);
    }

    static void method8147(CS2Executor executor) {
        executor.intStackPtr -= 11;
        Class356[] class356s = Class356.values();
        Class353[] class353s = Class353.values();
        Node_Sub15_Sub3.method15239(class356s[executor.intStack[executor.intStackPtr]], class353s[executor.intStack[executor.intStackPtr + 1]], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], executor.intStack[executor.intStackPtr + 4], executor.intStack[executor.intStackPtr + 5], executor.intStack[executor.intStackPtr + 6], executor.intStack[executor.intStackPtr + 7], executor.intStack[executor.intStackPtr + 8], executor.intStack[executor.intStackPtr + 9], executor.intStack[executor.intStackPtr + 10]);
    }

    static void method6908(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolKit.getValue();
    }

    static void method1497(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setSpriteShadow(icomponentdefinitions_3, executor);
    }

    static void method1498(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.offsetY;
    }

    static void method1499(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = (int) (SongReference.MEMBERSHIP_END / 60000L);
        executor.intStack[++executor.intStackPtr - 1] = (int) ((SongReference.MEMBERSHIP_END - Utils.time() - Class43.aLong420) / 60000L);
        executor.intStack[++executor.intStackPtr - 1] = CS2ReturnValue.IS_MEMBER_SUBSCRIPTION ? 1 : 0;
    }

    static void method1500(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        Class152.addFriend(string_2);
    }

    static void method1501(CS2Executor executor) {
        if (AsyncConnection.LISTENED_CLAN_CHANNEL != null) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
            executor.clanChannel = AsyncConnection.LISTENED_CLAN_CHANNEL;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method14602(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.fontId;
    }

    static void bitAnd(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = i_2 & i_3;
    }

    static void method8303(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt106;
    }

    static void ifSetOnMouseOver(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setOnMouseOver(icomponentdefinitions_3, executor);
    }

    static void method6738(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method13450(icomponentdefinitions_3, executor);
    }

    static void method6741(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.anIntArray634[i_2];
    }

    static void method541(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method7547(icomponentdefinitions_3, executor);
    }

    static void method543(CS2Executor executor) {
        executor.currentEntity.method15813(executor.intStack[--executor.intStackPtr]);
    }

    static void setBit(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = i_2 | 1 << i_3;
    }

    static void method546(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aByte7458;
        if (client.aByte7458 != -1) {
            client.aByte7458 = -6;
        }
    }

    static void method548(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(9, i_2 << 16 | i_3, i_4, "");
    }

    static void method550(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = AnimationIndexLoader.method11219((char) i_2) ? 1 : 0;
    }

    static void method8018(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method7142(icomponentdefinitions_3, executor);
    }

    static void method8019(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.anInt7434 != 0 && i_2 < client.IGNORE_LIST_COUNT) {
            executor.stringStack[++executor.stringStackPtr - 1] = client.IGNORED_PLAYERS[i_2].displayName;
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        }
    }

    static void method8021(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(5, i_2 << 16 | i_3, i_4, "");
    }

    static void method8045(CS2Executor executor) {
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

    static void method1813(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method11221(icomponentdefinitions_3, executor);
    }

    static void method1814(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ChatLine chatline_3 = ChatLine.getChatLine(i_2);
        int i_4 = 0;
        if (chatline_3 != null) {
            i_4 = chatline_3.effectFlags;
        }
        executor.intStack[++executor.intStackPtr - 1] = i_4;
    }

    static void method1815(CS2Executor executor) {
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

    static void method1816(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class354.JCOINS;
    }

    static void getColTag(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = Utils.rgbToColHexShortcut(i_2);
    }

    static void method7332(CS2Executor executor) {
        getBoundingBox((GraphNode_Sub1) executor.activeWorldObject, executor);
    }

    static void method7334(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.customCursors.method12675() == 1 ? 1 : 0;
    }

    static void method12846(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method6697(icomponentdefinitions_3, interface_4, executor);
    }

    static void method7726(CS2Executor executor) {
        executor.intStackPtr -= 4;
        int i_2 = executor.intStack[executor.intStackPtr];
        boolean bool_3 = executor.intStack[executor.intStackPtr + 1] == 1;
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        boolean bool_5 = executor.intStack[executor.intStackPtr + 3] == 1;
        Class365.method6299(i_2, bool_3, i_4, bool_5);
    }

    static void setBloom(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (i_2 < 0 || i_2 > 1) {
            i_2 = 0;
        }
        Class115.setBloom(i_2 == 1);
    }

    static void method1509(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        ifSetModelTint(defs, executor);
    }

    static void method1510(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method5066(icomponentdefinitions_3, interface_4, executor);
    }

    static void method1511(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method3369(icomponentdefinitions_3, executor);
    }

    static void method1512(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.modelType == ModelType.RAW_MODEL ? icomponentdefinitions_3.modelId : -1;
    }

    static void arrayStore(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        executor.intStackPtr -= 2;
        int i_3 = executor.intStack[executor.intStackPtr];
        if (i_3 >= 0 && i_3 < executor.globalArrayLengths[i_2]) {
            executor.globalArrays[i_2][i_3] = executor.intStack[executor.intStackPtr + 1];
        } else {
            throw new RuntimeException();
        }
    }

    static void method4904(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method3365(icomponentdefinitions_3, executor);
    }

    static void method4905(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
            executor.intStack[++executor.intStackPtr - 1] = Class467.FC_PLAYERS[i_2].worldId;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method6190(CS2Executor executor) {
        AnimationDefinitions.method11148(executor.currentEntity, executor.intStack[--executor.intStackPtr]);
        executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[0];
        executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[1];
        executor.intStack[++executor.intStackPtr - 1] = (int) client.aFloatArray7292[2];
    }

    static void method5814(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        CS2Interface underlaydefinition_4;
        if (executor.aBool7022) {
            underlaydefinition_4 = executor.hookedInterface2;
        } else {
            underlaydefinition_4 = executor.hookedInterface1;
        }
        executor.intStack[++executor.intStackPtr - 1] = underlaydefinition_4.method8766(executor.currentEntity.inter, i_2) ? 1 : 0;
    }

    static void method5816() {
        Class274.method4884();
    }

    static void method2150(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method869(icomponentdefinitions_3, executor);
    }

    static void getStructParam(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int structId = executor.intStack[executor.intStackPtr];
        int paramId = executor.intStack[executor.intStackPtr + 1];
        ParamDefinitions defs = IndexLoaders.PARAM_LOADER.getParam(paramId);
        if (defs.isString()) {
            executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.STRUCT_LOADER.getStruct(structId).method14751(paramId, defs.typeName);
        } else {
            executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.STRUCT_LOADER.getStruct(structId).method14750(paramId, defs.defaultInt);
        }
    }

    static void method2153(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt113;
    }

    static void getContainerFreeSpace(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Shader.getContainerFreeSpace(i_2);
    }

    static void method3986(CS2Executor executor) {
        if (Class308.CS2_QUERY_RESULTS != null && StaticElements.CS2_QUERY_RESULT_IDX < VarcDefinitions.CS2_QUERY_RESULTS_LEN) {
            executor.intStack[++executor.intStackPtr - 1] = Class308.CS2_QUERY_RESULTS[++StaticElements.CS2_QUERY_RESULT_IDX - 1] & 0xffff;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = -1;
        }
    }

    static void method15416(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method12209(icomponentdefinitions_3, executor);
    }

    static void getChatLineClan(CS2Executor executor) {
        int lineIndex = executor.intStack[--executor.intStackPtr];
        ChatLine line = ChatLine.getChatLine(lineIndex);
        String clan = "";
        if (line != null && line.clan != null)
            clan = line.clan;
        executor.stringStack[++executor.stringStackPtr - 1] = clan;
    }

    static void getVarnOld(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        executor.intStack[++executor.intStackPtr - 1] = ((NPCEntity) executor.currentEntity).varns.getVarn(i_2);
    }

    static void loadLong(CS2Executor executor) {
        executor.longStack[++executor.longStackPtr - 1] = executor.longLocals[executor.intOpValues[executor.instrPtr]];
    }

    static void method13491(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.parent;
    }

    static void getWorldLanguage(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class223.CURRENT_LANGUAGE.getValue();
    }

    static void method4194(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = (int) (Class302.method5363(i_2) / 60000L);
    }

    static void method6236(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteRoll;
    }

    static void method6237(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ChatLine chatline_3 = ChatLine.getChatLine(i_2);
        String str_4 = "";
        if (chatline_3 != null && chatline_3.crownedName != null) {
            str_4 = chatline_3.crownedName;
        }
        executor.stringStack[++executor.stringStackPtr - 1] = str_4;
    }

    static void method6238(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aBool7465 ? 1 : 0;
    }

    static void method6239() {
        MaterialProp14.method15393();
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void appendTypedMessage(CS2Executor executor) {
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

    static void method6230(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getAmountAtSlot(i_2, i_3, true);
    }

    static void getGEOfferType(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.GRAND_EXCHANGE_SLOTS[i_2].isSelling();
    }

    static void getCompHidden(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.hidden ? 1 : 0;
    }

    static void method1613(CS2Executor executor) {
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

    static void method6729(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        boolean bool_3 = executor.intStack[executor.intStackPtr + 1] == 1;
        Class393.preferences.setValue(Class393.preferences.toolKit, i_2);
        if (!bool_3) {
            Class393.preferences.setValue(Class393.preferences.graphics, 0);
        }
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method6730(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = ((PlayerEntity) executor.currentEntity).getUsernameWithTitle();
    }

    static void getEnumSize(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        EnumDefinitions enumdefinitions_3 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2);
        executor.intStack[++executor.intStackPtr - 1] = enumdefinitions_3.getSize();
    }

    static void method12596(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.maxScreenSize.checkValid(i_2);
    }

    static void method12597(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = (int) (client.aLong7153 >> 32);
        executor.intStack[++executor.intStackPtr - 1] = (int) (client.aLong7153);
    }

    static void ccDelete(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        if (underlaydefinition_2.defs.slotId == -1) {
            throw new RuntimeException("");
        } else {
            IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.method8772();
            icomponentdefinitions_3.slotChildren[underlaydefinition_2.defs.slotId] = null;
            IComponentDefinitions.redrawComponent(icomponentdefinitions_3);
        }
    }

    static void hookMouseExit(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method11223(icomponentdefinitions_3, executor);
    }

    static void getMouseX(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class163.mouseRecorder.getMouseX();
    }

    static void lowerString(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = string_2.toLowerCase();
    }

    static void resumeStringDialog(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.RESUME_TEXTDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
        tcpmessage_3.buffer.writeByte(string_2.length() + 1);
        tcpmessage_3.buffer.writeString(string_2);
        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
    }

    static void method1456(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = (int) client.camAngleX >> 3;
    }

    static void method14655(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class115.RECOVERYQUESTIONSSETDATE;
    }

    static void method6073(CS2Executor executor) {
        WorldMapDef class282_sub50_sub6_2 = Class291.method5130(executor.intStack[--executor.intStackPtr]);
        if (class282_sub50_sub6_2 != null) {
            if (class282_sub50_sub6_2.areaName != null) {
                executor.stringStack[++executor.stringStackPtr - 1] = class282_sub50_sub6_2.areaName;
                return;
            }
        }
        executor.stringStack[++executor.stringStackPtr - 1] = "";
    }

    static void loadClanSettingVar(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        ClanVarSettingsDefinitions class537_3 = IndexLoaders.CLAN_VAR_SETTINGS_LOADER.method3933(i_2);
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

    static void method7556(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        String string_2 = (String) executor.stringStack[executor.stringStackPtr];
        String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
        if (executor.intStack[--executor.intStackPtr] == 1) {
            executor.stringStack[++executor.stringStackPtr - 1] = string_2;
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = string_3;
        }
    }

    static void method7560(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6010(icomponentdefinitions_3, interface_4, executor);
    }

    static void ccSetPosition(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setComponentPosition(icomponentdefinitions_3, interface_4, executor);
    }

    static void method7434(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).difficulty;
    }

    static void method7444(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.SKILL_XP[i_2];
    }

    static void method7445(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).wearPos;
    }

    static void method7448(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.cpu.getValue();
    }

    static void method11246(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method4136(icomponentdefinitions_3, executor);
    }

    static void method11247(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.transparency;
    }

    static void ccGetSpriteScale(CS2Executor executor) {
        CS2Interface inter = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions defs = inter.defs;
        executor.intStack[++executor.intStackPtr - 1] = defs.spriteScale;
    }

    static void method254(CS2Executor executor) {
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

    static void method15404(CS2Executor executor) {
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

    static void method7218(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (!Renderers.CURRENT_RENDERER.method8405()) {
            executor.intStack[++executor.intStackPtr - 1] = 3;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.antiAliasingDefault.checkValid(i_2);
        }
    }

    static void method7219(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.color;
    }

    static void method6005(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        BufferedConnectionContext class184_3 = BufferedConnectionContext.getConnectionContext();
        TCPPacket tcpmessage_4 = TCPPacket.createPacket(ClientProt.CHAT_TYPE, class184_3.isaac);
        tcpmessage_4.buffer.writeByte(i_2);
        class184_3.queuePacket(tcpmessage_4);
    }

    static void sendVerifyEmailPacket(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        Class493.sendCheckEmailPacket(string_2);
    }

    static void method11244(CS2Executor executor) {
        WorldDescriptor descriptor = CutsceneCameraMovement.getCurrentWorldDescriptor();
        if (descriptor != null) {
            executor.intStack[++executor.intStackPtr - 1] = descriptor.worldNumber;
            executor.intStack[++executor.intStackPtr - 1] = descriptor.flags;
            executor.stringStack[++executor.stringStackPtr - 1] = descriptor.unknown;
            WorldType world = descriptor.getWorld();
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

    static void sendReportAbusePacket(CS2Executor executor) {
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
        BufferedConnectionContext class184_6 = BufferedConnectionContext.getConnectionContext();
        TCPPacket tcpmessage_7 = TCPPacket.createPacket(ClientProt.REPORT_ABUSE, class184_6.isaac);
        tcpmessage_7.buffer.writeByte(ChatLine.getLength(string_2) + 2 + ChatLine.getLength(string_3));
        tcpmessage_7.buffer.writeString(string_2);
        tcpmessage_7.buffer.writeByte(i_4 - 1);
        tcpmessage_7.buffer.writeByte(i_5);
        tcpmessage_7.buffer.writeString(string_3);
        class184_6.queuePacket(tcpmessage_7);
    }

    static void method8037(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = executor.currentClanSettings.memberNames[i_2];
    }

    static void method12492(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method7729(icomponentdefinitions_3, executor);
    }

    static void loadClanVar(CS2Executor executor) {
        int param = executor.intOpValues[executor.instrPtr];
        Integer integer_3 = (Integer) Class46.CLAN_VARS[param];
        if (integer_3 == null) {
            ClanVarDefinitions class405_4 = IndexLoaders.CLAN_VAR_LOADER.method6753(param);
            if (class405_4.aChar4832 != 105 && class405_4.aChar4832 != 49) {
                executor.intStack[++executor.intStackPtr - 1] = -1;
            } else {
                executor.intStack[++executor.intStackPtr - 1] = 0;
            }
        } else {
            executor.intStack[++executor.intStackPtr - 1] = integer_3.intValue();
        }
    }

    static void method4324(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.aPreference_Sub11_8217.method12699();
    }

    static void method3038(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (i_2 == -1) {
            int i_3 = 16383;
            int i_4 = i_2 & 0x3fff;
            CoordGrid coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getBase();
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

    static void method3039(CS2Executor executor) {
        WorldDescriptor class217_sub1_2 = WorldDescriptor.getGameWorldDescriptor();
        executor.intStack[++executor.intStackPtr - 1] = class217_sub1_2 == null ? 0 : class217_sub1_2.flags;
    }

    static void method3041(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method1845(icomponentdefinitions_3, executor);
    }

    static void method3042(CS2Executor executor) {
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

    static void method3043(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.getUserSlot((String) executor.stringStack[--executor.stringStackPtr]);
    }

    static void method3713(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.water.checkValid(i_2);
    }

    static void method3714(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(8, i_2 << 16 | i_3, i_4, "");
    }

    static void method15392(CS2Executor executor) {
        IComponentDefinitions icomponentdefinitions_2 = IComponentDefinitions.getDefs(executor.intStack[--executor.intStackPtr]);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_2.containerItemId;
    }

    static void loadString(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = executor.objectLocals[executor.intOpValues[executor.instrPtr]];
    }

    static void method3368() {
        if (!JS5CacheFile.method3360()) {
            JS5StandardRequester.method5558();
        }
    }

    static void method3370(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method542(icomponentdefinitions_3, executor);
    }

    static void getFriendsChatName(CS2Executor executor) {
        if (client.FC_NAME != null) {
            executor.stringStack[++executor.stringStackPtr - 1] = Class285.method5025(client.FC_NAME);
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        }
    }

    static void method6372(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method542(icomponentdefinitions_3, executor);
    }

    static void charToUpperCase(CS2Executor executor) {
        int character = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Character.toUpperCase((char) character);
    }

    static void method6374(CS2Executor executor) {
        WorldDescriptor class217_sub1_2 = SceneryShadowPreference.method12629();
        if (class217_sub1_2 != null) {
            executor.intStack[++executor.intStackPtr - 1] = class217_sub1_2.worldNumber;
            executor.intStack[++executor.intStackPtr - 1] = class217_sub1_2.flags;
            executor.stringStack[++executor.stringStackPtr - 1] = class217_sub1_2.unknown;
            WorldType class213_3 = class217_sub1_2.getWorld();
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

    static void method6381(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setItemIFComp(icomponentdefinitions_3, interface_4, false, 0, executor);
    }

    static void method7915(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = NPCMeshModifier.MESSAGES;
    }

    static void method3988(CS2Executor executor) {
        if (PlaySoundJingleCutsceneAction.keyRecorder.held(86)) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method6781(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2).wearPos3;
    }

    static void getCPUProfile(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class241.getCPUProfile();
    }

    static void method3020(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setModelAngle(icomponentdefinitions_3, interface_4, executor);
    }

    static void method3021(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.guestsTalk;
    }

    static void method7675(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getItemIdAtSlot(i_2, i_3, false);
    }

    static void method2107() {
        Class466.method7777();
    }

    static void method2108(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolKit.checkValid(i_2);
    }

    static void method2112(CS2Executor executor) {
        executor.intStackPtr -= 7;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1] << 1;
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        int i_5 = executor.intStack[executor.intStackPtr + 3];
        int i_6 = executor.intStack[executor.intStackPtr + 4];
        int i_7 = executor.intStack[executor.intStackPtr + 5];
        int i_8 = executor.intStack[executor.intStackPtr + 6];
        if (i_2 >= 0 && i_2 < 2 && client.anIntArrayArrayArray7302[i_2] != null && i_3 >= 0 && i_3 < client.anIntArrayArrayArray7302[i_2].length) {
            client.anIntArrayArrayArray7302[i_2][i_3] = new int[]{(i_4 >> 14 & 0x3fff) << 9, i_5 << 2, (i_4 & 0x3fff) << 9, i_8};
            client.anIntArrayArrayArray7302[i_2][i_3 + 1] = new int[]{(i_6 >> 14 & 0x3fff) << 9, i_7 << 2, (i_6 & 0x3fff) << 9};
        }
    }

    static void method11486(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.SKILL_LEVEL_ACTUAL[i_2];
    }

    static void mergeStrings(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        executor.stringStackPtr -= i_2;
        String string_3 = VarDefinitionLoader.method6398(executor.stringStack, executor.stringStackPtr, i_2);
        executor.stringStack[++executor.stringStackPtr - 1] = string_3;
    }

    static void method12499(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method3672(icomponentdefinitions_3, executor);
    }

    static void method810(CS2Executor executor) {
        IgnoredPlayer.method458(executor.intStack[--executor.intStackPtr]);
    }

    static void getActiveClanChannelName(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = executor.clanChannel.clanName;
    }

    static void method814(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        QuickChatCategoryDefinitions class282_sub50_sub14_3 = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2);
        if (class282_sub50_sub14_3.messages == null) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub14_3.messages.length;
        }
    }

    static void ccResumePauseButton(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        method6942(icomponentdefinitions_3);
    }

    static void qcGetName(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).name;
    }

    static void method1452(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        Class16.addIgnore(string_2, false);
    }

    static void method3339(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        ChatLine.appendChatMessage(string_2);
    }

    static void method3340(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = VertexNormal.MY_PLAYER.aClass19_10359.method578() >> 3;
    }

    static void method3341(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (Interface.INTERFACES[i_2] == null) {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        } else {
            String string_4 = Interface.INTERFACES[i_2].components[i_3].name;
            if (string_4 == null) {
                executor.stringStack[++executor.stringStackPtr - 1] = "";
            } else {
                executor.stringStack[++executor.stringStackPtr - 1] = string_4;
            }
        }
    }

    static void method3344(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.ENTITY_TARGET == executor.currentEntity.getCS2Index() ? 1 : 0;
    }

    static void method3346(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        executor.intStackPtr -= 2;
        int i_3 = executor.intStack[executor.intStackPtr];
        int i_4 = executor.intStack[executor.intStackPtr + 1];
        FontMetrics fontmetrics_5 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, i_4);
        executor.intStack[++executor.intStackPtr - 1] = fontmetrics_5.method6949(string_2, i_3, Class182.aNativeSpriteArray2261);
    }

    static void loadVarpbit(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class158_Sub1.PLAYER_VAR_PROVIDER.getVarBit(i_2);
    }

    static void method5203(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method14482(icomponentdefinitions_3, executor);
    }

    static void intLessOrEqual(CS2Executor executor) {
        executor.intStackPtr -= 2;
        if (executor.intStack[executor.intStackPtr] <= executor.intStack[executor.intStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method5205(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = ParticleEmitterConfig.method1489().getValue();
    }

    static void modulo(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = i_2 % i_3;
    }

    static void method3829(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class412.FC_MIN_RANK_CAN_KICK;
    }

    static void method3830(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = Preference.method7788(executor.intStack[--executor.intStackPtr] * 60000L, Class223.CURRENT_LANGUAGE.getValue()) + " UTC";
    }

    static void method5065(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.fog.method13421() ? 1 : 0;
    }

    static void method7208(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method15511(icomponentdefinitions_3, interface_4, executor);
    }

    static void method7209(CS2Executor executor) {
        Class20.anInt198 = executor.intStack[--executor.intStackPtr];
    }

    static void longEqual(CS2Executor executor) {
        executor.longStackPtr -= 2;
        if (executor.longStack[executor.longStackPtr + 1] == executor.longStack[executor.longStackPtr]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method15371(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.characterShadows.method12964() ? 1 : 0;
    }

    static void method3030(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_2);
        executor.intStack[++executor.intStackPtr - 1] = itemdefinitions_3.hasTooltipColor ? 1 : 0;
    }

    static void method3031(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method1454(icomponentdefinitions_3, executor);
    }

    static void method3033(CS2Executor executor) {
        if (client.PLAYER_MOD_LEVEL >= 5 && client.PLAYER_MOD_LEVEL <= 9) {
            executor.intStack[++executor.intStackPtr - 1] = client.PLAYER_MOD_LEVEL;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method15559(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.fontId;
    }

    static void method4629(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method5455(icomponentdefinitions_3, executor);
    }

    static void method4630(CS2Executor executor) {
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

    static void method4631(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.currentQuickChatMessage.anIntArray4046[i_2] = i_3;
    }

    static void method4633(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method3369(icomponentdefinitions_3, executor);
    }

    static void method6938(CS2Executor executor) {
        executor.intStackPtr -= 3;
        byte[] bytes_2 = {(byte) executor.intStack[executor.intStackPtr]};
        byte[] bytes_3 = {(byte) executor.intStack[executor.intStackPtr + 1]};
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs(i_4);
        method1838(icomponentdefinitions_5, bytes_2, bytes_3, executor);
    }

    static void method6940(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(6, i_2 << 16 | i_3, i_4, "");
    }

    static void method6941(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method5001(icomponentdefinitions_3, executor);
    }

    static void method451(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.lightDetail, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
        Class94.method1589();
        IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method452(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (i_2 != Class393.preferences.skyBoxes.method12728()) {
            Class393.preferences.setValue(Class393.preferences.skyBoxes, i_2);
            Class190.savePreferences();
            client.aBool7175 = false;
        }
    }

    static void method453(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aBool7189 ? 1 : 0;
    }

    static void method454(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.color;
    }

    static void ccGetSpriteYaw(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteYaw;
    }

    static void method8212(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method11337(icomponentdefinitions_3, interface_4, executor);
    }

    static void loadVarp(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class158_Sub1.PLAYER_VAR_PROVIDER.vars[i_2];
    }

    static void ccSetModelAngle(CS2Executor executor) {
        CS2Interface interDefs = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions defs = interDefs.defs;
        Interface inter = interDefs.inter;
        setModelAngle(defs, inter, executor);
    }

    static void method3117(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method12401(icomponentdefinitions_3, interface_4);
    }

    static void method3119(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt107;
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt109;
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt108;
        Class9.anInt107 = -2;
        Class9.anInt109 = -1;
        Class9.anInt108 = -1;
    }

    static void method3120() {
        Class86.method1478();
    }

    static void sendGuestClanQuickChatMessage(CS2Executor executor) {
        BufferedConnectionContext context = BufferedConnectionContext.getConnectionContext();
        TCPPacket packet = TCPPacket.createPacket(ClientProt.QUICKCHAT_PUBLIC, context.isaac);
        packet.buffer.writeByte(0);
        int startIndex = packet.buffer.index;
        packet.buffer.writeByte(3);
        packet.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
        executor.currentQuickChatMessage.qcMessageDefs.method14896(packet.buffer, executor.currentQuickChatMessage.anIntArray4046);
        packet.buffer.writeIndex(packet.buffer.index - startIndex);
        context.queuePacket(packet);
    }

    static void method1604(CS2Executor executor) {
        System.out.println(executor.stringStack[--executor.stringStackPtr]);
    }

    static void method1606(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method15409(icomponentdefinitions_3, executor);
    }

    static void method1608(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (Class467.FC_PLAYERS != null && i_2 < Class459.FC_PLAYER_COUNT && Class467.FC_PLAYERS[i_2].username.equalsIgnoreCase(VertexNormal.MY_PLAYER.displayName)) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void resumeNamedDialog(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.RESUME_NAMEDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
        tcpmessage_3.buffer.writeByte(string_2.length() + 1);
        tcpmessage_3.buffer.writeString(string_2);
        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
    }

    static void method5788(CS2Executor executor) {
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

    static void method12583(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        method3601(icomponentdefinitions_3, executor);
    }

    static void getWorldId(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = ConnectionInfo.GAME_CONNECTION_INFO.worldId;
    }

    static void method1888(CS2Executor executor) {
        executor.intStackPtr -= 5;
        VarNPCMap.playSoundSynth(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], executor.intStack[executor.intStackPtr + 4]);
    }

    static void method1889(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.kickRank;
    }

    static void powInverse(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (i_2 == 0) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else if (i_3 == 0) {
            executor.intStack[++executor.intStackPtr - 1] = Integer.MAX_VALUE;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = (int) Math.pow(i_2, 1.0D / i_3);
        }
    }

    static void checkJavaVersion(CS2Executor executor) {
        if (Class11.SYSTEM_INFO.javaBuild < 6) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else if (Class11.SYSTEM_INFO.javaBuild == 6 && Class11.SYSTEM_INFO.javaUpdate < 10) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        }
    }

    static void method5024(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setItemIFComp(icomponentdefinitions_3, interface_4, false, 2, executor);
    }

    static void method5027(CS2Executor executor) {
        executor.intStackPtr -= 2;
        Huffman.playSoundJingle(executor.intStack[executor.intStackPtr], 255);
    }

    static void method5029(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        method15207(icomponentdefinitions_3, executor);
    }

    static void method14746(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method2593(icomponentdefinitions_3, executor);
    }

    static void ccGetTransparency(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_4.transparency;
    }

    static void getRunEnergy(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.RUN_ENERGY;
    }

    static void method3596(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method2593(icomponentdefinitions_3, executor);
    }

    static void method3597(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
            executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[i_2].fcRank;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method3599(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.soundEffectVolume, executor.intStack[--executor.intStackPtr]);
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method855(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        method3965(icomponentdefinitions_3, executor);
    }

    static void method856(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        WorldMapDef class282_sub50_sub6_3 = Class291.method5130(i_2);
        if (class282_sub50_sub6_3 == null) {
            executor.intStack[++executor.intStackPtr - 1] = -1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9542;
        }
    }

    static void ifGetScrollWidth(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(hash);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollWidth;
    }

    static void method5290(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).isComplete(Class158_Sub1.PLAYER_VAR_PROVIDER) ? 1 : 0;
    }

    static void hsvToRGB(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class335.anIntArray3916[Class372.method6362(i_2) & 0xffff];
    }

    static void method12802(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method4651(icomponentdefinitions_3, executor);
    }

    static void method12803(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.fog, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void pushInt(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.intOpValues[executor.instrPtr];
    }

    static void method6510(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method1455(icomponentdefinitions_3, interface_4, executor);
    }

    static void method2914(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        SubInterface class282_sub44_3 = (SubInterface) client.OPEN_INTERFACES.get(i_2);
        if (class282_sub44_3 != null) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method2916(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        WorldMapDef class282_sub50_sub6_3 = Class125.method2173();
        if (class282_sub50_sub6_3 != null) {
            boolean bool_4 = class282_sub50_sub6_3.method14778(i_2 >> 28 & 0x3, i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Executor.anIntArray5900);
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

    static void method13756(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        WorldMapDef class282_sub50_sub6_3 = Class291.method5175(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
        if (class282_sub50_sub6_3 == null) {
            executor.intStack[++executor.intStackPtr - 1] = -1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.id;
        }
    }

    static void method15403() {
        ParamIndexLoader.method7081();
    }

    static void method798(CS2Executor executor) {
        getBoundingBox(executor.currentGroundItem, executor);
    }

    static void method7420(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolkitDefault.method13049() ? 1 : 0;
    }

    static void ifGetScrollX(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(hash);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.scrollX;
    }

    static void method1799(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).questpointReward;
    }

    static void pushString(CS2Executor executor) {
        executor.stringStack[++executor.stringStackPtr - 1] = executor.current.stringOpValues[executor.instrPtr];
    }

    static void method1801(CS2Executor executor) {
        method11160(AbstractRenderer.method8697(), executor);
    }

    static void ccSetonmouseOver(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setOnMouseOver(icomponentdefinitions_3, executor);
    }

    static void method261(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentEntity.loadedInterfaceId;
    }

    static void method11612(CS2Executor executor) {
        executor.intStackPtr -= 3;
        Huffman.playSoundJingle(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 2]);
    }

    static void method11613(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.BASE_WINDOW_ID != -1) {
            if (i_2 == 0) {
                executor.intStack[++executor.intStackPtr - 1] = client.BASE_WINDOW_ID;
                return;
            }
            --i_2;
        }
        SubInterface class282_sub44_3;
        for (class282_sub44_3 = (SubInterface) client.OPEN_INTERFACES.method7750(); i_2-- > 0; class282_sub44_3 = (SubInterface) client.OPEN_INTERFACES.method7751()) {
        }
        executor.intStack[++executor.intStackPtr - 1] = class282_sub44_3.interfaceId;
    }

    static void setGender(CS2Executor executor) {
        boolean bool_2 = executor.intStack[--executor.intStackPtr] != 0;
        if (VertexNormal.MY_PLAYER.model != null) {
            VertexNormal.MY_PLAYER.model.method4003(bool_2);
        }
    }

    static void method4311(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method7555(icomponentdefinitions_3, interface_4, executor);
    }

    static void staffModLevel(CS2Executor executor) {
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

    static void method4315() {
        StaticElements.CS2_QUERY_RESULT_IDX = 0;
    }

    static void method13359(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        boolean bool_3 = Class308.aclient3620.method4658(new File(string_2));
        executor.intStack[++executor.intStackPtr - 1] = bool_3 ? 1 : 0;
    }

    static void method4973(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aShort7394;
        executor.intStack[++executor.intStackPtr - 1] = client.aShort7324;
    }

    static void method5454(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method6689(icomponentdefinitions_3, executor);
    }

    static void method5456(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = Class182.method3044(string_2);
    }

    static void hookMouseEnter(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6289(icomponentdefinitions_3, executor);
    }

    static void method1492(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setHFlip(icomponentdefinitions_3, executor);
    }

    static void method1967(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        method14680(icomponentdefinitions_3, executor);
    }

    static void method1968(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolkitDefault.checkValid(i_2);
    }

    static void method5362(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.method1198(i_2, i_3, i_4);
    }

    static void method8205(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.anInt7271 - client.anInt7270;
    }

    static void method8206(CS2Executor executor) {
        executor.intStackPtr -= 12;
        Class316.method5594();
        CutsceneAction.method1607();
        MaterialProp28.anInt9792 = executor.intStack[executor.intStackPtr];
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
        HeadbarIndexLoader.aNativeSprite_3452 = null;
        ParamDefinitions.aNativeSprite_5339 = null;
        Class20.aBool187 = true;
    }

    static void method3250(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method501(icomponentdefinitions_3, executor);
    }

    static void method8865(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        QuickchatMessageDefinitions quickchatdefinitions_3 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_2);
        if (quickchatdefinitions_3.responses == null) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = quickchatdefinitions_3.responses.length;
        }
    }

    static void method8869(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class121.anInt1526;
    }

    static void method8870(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
            executor.stringStack[++executor.stringStackPtr - 1] = Class467.FC_PLAYERS[i_2].displayName;
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        }
    }

    static void method12915(CS2Executor executor) {
        NPCEntity npc_2 = (NPCEntity) executor.currentEntity;
        String string_3 = npc_2.modifiedName;
        NPCDefinitions npcdefinitions_4 = npc_2.definitions;
        if (npcdefinitions_4.transformTo != null) {
            npcdefinitions_4 = npcdefinitions_4.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
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

    static void method7826(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).messageHotkeys[i_3];
    }

    static void method12352(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class464.aBool5556 ? 1 : 0;
    }

    static void bitNot(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = ~i_2;
    }

    static void method5000(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method5009(icomponentdefinitions_3, executor);
    }

    static void method5002(CS2Executor executor) {
        isInterfaceOpen(executor);
    }

    static void getMyPlayerZPos(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = i_2 & 0x3fff;
    }

    static void method5004(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method6690(icomponentdefinitions_3, executor);
    }

    static void method15075(CS2Executor executor) {
        Class404.method6811(executor.intStack[--executor.intStackPtr]);
    }

    static void method16095(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method4772(icomponentdefinitions_3, executor);
    }

    static void method14434(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        Class533.method11404((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], "", executor.intStack[--executor.intStackPtr] == 1, false);
    }

    static void setCompText(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setCompText(icomponentdefinitions_3, interface_4, executor);
    }

    static void randSoundPitch(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (i_2 > 700 || i_3 > 700) {
            executor.intStack[++executor.intStackPtr - 1] = 256;
        }
        double d_4 = (Math.random() * (i_3 + i_2) - i_2 + 800.0D) / 100.0D;
        executor.intStack[++executor.intStackPtr - 1] = (int) (Math.pow(2.0D, d_4) + 0.5D);
    }

    static void method7961(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method3366(icomponentdefinitions_3, executor);
    }

    static void method7962() {
        if (client.aBool7310) {
            Class361.aClass361_4175.method6257();
        }
    }

    static void method6242(CS2Executor executor) {
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

    static void textGender(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        String string_2 = (String) executor.stringStack[executor.stringStackPtr];
        String string_3 = (String) executor.stringStack[executor.stringStackPtr + 1];
        if (VertexNormal.MY_PLAYER.model != null && VertexNormal.MY_PLAYER.model.female) {
            executor.stringStack[++executor.stringStackPtr - 1] = string_3;
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = string_2;
        }
    }

    static void clearBit(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = i_2 & -1 - (1 << i_3);
    }

    static void method1462(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        Class16.addIgnore(string_2, true);
    }

    static void method1463(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.maxScreenSize.method12666();
    }

    static void method14647(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.aPreference_Sub4_8223, executor.intStack[--executor.intStackPtr]);
        ParticleProducer.switchRenderType(Class393.preferences.currentToolkit.getValue(), false);
        Class190.savePreferences();
    }

    static void method14649(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.buildArea.checkValid(i_2);
    }

    static void method5082(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        CS2Interface underlaydefinition_4 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        Node_Sub14.method12221(underlaydefinition_4.defs, i_2, i_3);
    }

    static void method7186(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.myPlayerIndex;
    }

    static void method7187() {
    }

    static void method3739(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
            executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[i_2].referrer ? 1 : 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method3740(CS2Executor executor) {
        NPCEntity npc_2 = (NPCEntity) executor.currentEntity;
        NPCDefinitions npcdefinitions_3 = npc_2.definitions;
        if (npcdefinitions_3.transformTo != null) {
            npcdefinitions_3 = npcdefinitions_3.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
        }
        executor.intStack[++executor.intStackPtr - 1] = npcdefinitions_3 != null ? 1 : 0;
    }

    static void getWorldQuickchatOnly(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.IS_QUICKCHAT_ONLY ? 1 : 0;
    }

    static void intGreaterThan(CS2Executor executor) {
        executor.intStackPtr -= 2;
        if (executor.intStack[executor.intStackPtr] > executor.intStack[executor.intStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method16089(CS2Executor executor) {
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

    static void ifClearScripts(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        clearScripts(icomponentdefinitions_3);
    }

    static void method6041(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = client.getIComponentSettings(icomponentdefinitions_3).getUseOptionFlags();
    }

    static void method6042(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = ((GraphNode_Sub1) executor.activeWorldObject).method12997();
    }

    static void method6043(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setOnMouseLeave(icomponentdefinitions_3, executor);
    }

    static void method6044(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.aBool7310 ? 1 : 0;
    }

    static void method6046(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = KeyHoldInputSubscriber.LOYALTY_BALANCE;
    }

    static void method12718(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.ambientSoundVolume, executor.intStack[--executor.intStackPtr]);
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method12719(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        setItemIFComp(icomponentdefinitions_4, interface_5, false, 0, executor);
    }

    static void method8285(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method6289(icomponentdefinitions_3, executor);
    }

    static void method8295(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setItemIFComp(icomponentdefinitions_3, interface_4, true, 0, executor);
    }

    static void sendPrivateQuickChatMessage(CS2Executor executor) {
        String message = (String) executor.stringStack[--executor.stringStackPtr];
        BufferedConnectionContext class184_3 = BufferedConnectionContext.getConnectionContext();
        TCPPacket packet = TCPPacket.createPacket(ClientProt.QUICKCHAT_PRIVATE, class184_3.isaac);
        packet.buffer.writeByte(0);
        int startIndex = packet.buffer.index;
        packet.buffer.writeString(message);
        packet.buffer.writeShort(executor.currentQuickChatMessage.qcMessageId);
        executor.currentQuickChatMessage.qcMessageDefs.method14896(packet.buffer, executor.currentQuickChatMessage.anIntArray4046);
        packet.buffer.writeIndex(packet.buffer.index - startIndex);
        class184_3.queuePacket(packet);
    }

    static void method8297(CS2Executor executor) {
        if (PlaySoundJingleCutsceneAction.keyRecorder.held(81)) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void ccResetOptionNames(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        resetOptionNames(icomponentdefinitions_4);
    }

    static void method868(CS2Executor executor) {
        QuestDefinitions questdefinitions_2 = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[--executor.intStackPtr]);
        executor.intStack[++executor.intStackPtr - 1] = questdefinitions_2.varpRequirements == null ? 0 : questdefinitions_2.varpRequirements.length;
    }

    static void method870(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs(i_4);
        Node_Sub14.method12221(icomponentdefinitions_5, i_2, i_3);
    }

    static void add(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = i_2 + i_3;
    }

    static void method15417(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Friend.method304();
    }

    static void method4381(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method12401(icomponentdefinitions_4, interface_5);
    }

    static void method14818(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.NATIVE_LIBRARY_LOADER.hasTheoraLibrary() ? 1 : 0;
    }

    static void getPlayerCountry(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Static.COUNTRY;
    }

    static void method14835(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        ChatLine chatline_3 = ChatLine.getChatLine(i_2);
        String str_4 = "";
        if (chatline_3 != null && chatline_3.name != null) {
            str_4 = chatline_3.name;
        }
        executor.stringStack[++executor.stringStackPtr - 1] = str_4;
    }

    static void method14836(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        boolean bool_3 = executor.intStack[executor.intStackPtr + 1] == 1;
        if (Class291_Sub1.aClass465_8025 != null) {
            Node node_4 = Class291_Sub1.aClass465_8025.get(i_2);
            if (node_4 != null && !bool_3) {
                node_4.unlink();
            } else if (node_4 == null && bool_3) {
                node_4 = new Node();
                Class291_Sub1.aClass465_8025.put(node_4, i_2);
            }
        }
    }

    static void method14839() {
        if (client.aBool7310) {
            Class361.aClass361_4177.method6257();
        }
    }

    static void method14841(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).method4111(client.SKILL_LEVEL_ACTUAL, executor.intStack[executor.intStackPtr - 1]) ? 1 : 0;
        --executor.intStackPtr;
    }

    static void method6677(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = executor.clanChannel.players[i_2].rank;
    }

    static void method6678(CS2Executor executor) {
        int renderType = executor.intStack[--executor.intStackPtr];
        System.out.println(renderType);
        if (renderType < 0 || renderType > 5) {
            renderType = 2;
        }
        if(Class158.getScreenMode() == 3) {
            //Only OpenGL
            ParticleProducer.switchRenderType(1, Class158.getScreenMode() == 3 ? true : false);//Switching render types in fullscreen doesnt work!
        } else {
            ParticleProducer.switchRenderType(renderType, false);
        }
    }

    static void getFriendsChatCount(CS2Executor executor) {
        if (client.FC_NAME != null) {
            executor.intStack[++executor.intStackPtr - 1] = Class459.FC_PLAYER_COUNT;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method6685(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        method502(defs, executor);
    }

    static void method12839(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method505(icomponentdefinitions_3, executor);
    }

    static void method12841(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.GRAND_EXCHANGE_ITEM_SELECT, client.GAME_CONNECTION_CONTEXT.isaac);
        tcpmessage_3.buffer.writeShort(i_2);
        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
    }

    static void method456(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.CYCLES_20MS;
    }

    static void method457(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.groundDecor, executor.intStack[--executor.intStackPtr] == 1 ? 1 : 0);
        IndexLoaders.MAP_REGION_DECODER.method4547();
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void ccSetScrollPos(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method1852(icomponentdefinitions_3, interface_4, executor);
    }

    static void method460(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method8310(icomponentdefinitions_3, executor);
    }

    static void method5774(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method501(icomponentdefinitions_3, executor);
    }

    static void method5775(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method6288(icomponentdefinitions_3, executor);
    }

    static void method5776(CS2Executor executor) {
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

    static void method14669(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = JS5CacheFile.method3360() ? 1 : 0;
    }

    static void method2584(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        SpotAnimIndexLoader.method8862(i_2, i_3 >> 14 & 0x3fff, i_3 & 0x3fff, false);
    }

    static void sendPrivateMessage(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        String targetName = (String) executor.stringStack[executor.stringStackPtr];
        String message = (String) executor.stringStack[executor.stringStackPtr + 1];
        if (client.PLAYER_RIGHTS != 0 || (!client.USERDETAIL_QUICKCHAT || client.VERIFIED_EMAIL_ADDRESS) && !client.IS_QUICKCHAT_ONLY) {
            BufferedConnectionContext context = BufferedConnectionContext.getConnectionContext();
            TCPPacket packet = TCPPacket.createPacket(ClientProt.SEND_PRIVATE_MESSAGE, context.isaac);
            packet.buffer.writeShort(0);
            int startIndex = packet.buffer.index;
            packet.buffer.writeString(targetName);
            ByteBuf.writeHuffmanString(packet.buffer, message);
            packet.buffer.method13281(packet.buffer.index - startIndex);
            context.queuePacket(packet);
        }
    }

    static void getPlayerCombatLevel(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = VertexNormal.MY_PLAYER.combatLevel;
    }

    static void loadClanVarLong(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        Long long_3 = (Long) Class46.CLAN_VARS[i_2];
        if (long_3 == null) {
            executor.longStack[++executor.longStackPtr - 1] = -1L;
        } else {
            executor.longStack[++executor.longStackPtr - 1] = long_3.longValue();
        }
    }

    static void method3748(CS2Executor executor) {
        if (client.aString7165 != null) {
            executor.stringStack[++executor.stringStackPtr - 1] = client.aString7165;
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        }
    }

    static void popInt(CS2Executor executor) {
        --executor.intStackPtr;
    }

    static void method3750(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.idleAnimations, executor.intStack[--executor.intStackPtr]);
        Class190.savePreferences();
    }

    static void getSystemUpdateTimer(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.REBOOT_TIMER;
    }

    static void method911(CS2Executor executor) {
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

    static void method536(CS2Executor executor) {
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

    static void getMyPlayerYPos(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = i_2 >> 28;
    }

    static void ifSetNoClickThrough(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(hash);
        setNoClickThrough(icomponentdefinitions_3, executor);
    }

    static void method1171(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.banCount;
    }

    static void getTradeFilter(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.TRADE_FILTER;
    }

    static void method401(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        method3251(icomponentdefinitions_3, executor);
    }

    static void method12210(CS2Executor executor) {
        executor.stringStackPtr -= 3;
        Class533.method11404((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], (String) executor.stringStack[executor.stringStackPtr + 2], executor.intStack[--executor.intStackPtr] == 1, true);
    }

    static void method7500(CS2Executor executor) {
        Class393.preferences.setValue(Class393.preferences.idleAnimations, executor.intStack[--executor.intStackPtr]);
        Class190.savePreferences();
        client.aBool7175 = false;
    }

    static void method7501(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        String string_3 = (String) executor.stringStack[--executor.stringStackPtr];
        TCPPacket tcpmessage_4 = TCPPacket.createPacket(ClientProt.EMAIL_VALIDATION_CHANGE_ADDRESS, client.LOBBY_CONNECTION_CONTEXT.isaac);
        tcpmessage_4.buffer.writeShort(ChatLine.getLength(string_2) + ChatLine.getLength(string_3));
        tcpmessage_4.buffer.writeString(string_2);
        tcpmessage_4.buffer.writeString(string_3);
        client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_4);
    }

    static void method7502(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_4.text;
    }

    static void method3949(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6697(icomponentdefinitions_3, interface_4, executor);
    }

    static void method3950() {
        StaticElements.CS2_QUERY_RESULT_IDX = 0;
    }

    static void charToLowerCase(CS2Executor executor) {
        int charCode = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Character.toLowerCase((char) charCode);
    }

    static void method5511(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method2874(icomponentdefinitions_3, executor);
    }

    static void method5512(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        method14605(icomponentdefinitions_3, executor);
    }

    static void ifSetSpriteShadow(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions defs = IComponentDefinitions.getDefs(hash);
        setSpriteShadow(defs, executor);
    }

    static void method4961(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setItemIFComp(icomponentdefinitions_3, interface_4, true, 2, executor);
    }

    static void method4962(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        setItemIFComp(icomponentdefinitions_3, interface_4, false, 1, executor);
    }

    static void method1569(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method4280(icomponentdefinitions_3, executor);
    }

    static void method1570(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setItemIFComp(icomponentdefinitions_3, interface_4, true, 1, executor);
    }

    static void method1571(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spriteRoll;
    }

    static void method1572(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.textures.checkValid(i_2);
    }

    static void isInterfaceOpen(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int tab = executor.intStack[executor.intStackPtr];
        int interfaceId = executor.intStack[executor.intStackPtr + 1];
        SubInterface inter = (SubInterface) client.OPEN_INTERFACES.get(tab);
        if (inter != null && interfaceId == inter.interfaceId) {
            executor.intStack[++executor.intStackPtr - 1] = 1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method1574(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.skyBoxes.method12727() ? 1 : 0;
    }

    static void method12723(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.angle2d;
    }

    static void method1162(CS2Executor executor) {
        executor.intStackPtr -= 4;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        int i_5 = executor.intStack[executor.intStackPtr + 3];
        CoordGrid coordgrid_6 = IndexLoaders.MAP_REGION_DECODER.getBase();
        Class11.method469((i_2 >> 14 & 0x3fff) - coordgrid_6.x, (i_2 & 0x3fff) - coordgrid_6.y, i_3 << 2, i_4, i_5);
    }

    static void method11154(CS2Executor executor) {
        executor.currentQuickChatMessage = new QuickChatMessage();
        executor.currentQuickChatMessage.qcMessageId = executor.intStack[--executor.intStackPtr];
        executor.currentQuickChatMessage.qcMessageDefs = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(executor.currentQuickChatMessage.qcMessageId);
        executor.currentQuickChatMessage.anIntArray4046 = new int[executor.currentQuickChatMessage.qcMessageDefs.method14916()];
    }

    static void method1979(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = executor.clanChannel.players[i_2].name;
    }

    static void method7744(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt94;
    }

    static void method14244(CS2Executor executor) {
        int i_2 = Class363.anInt4203;
        int i_3 = Engine.anInt3249;
        int i_4 = -1;
        if (Class475.supportsFullScreen) {
            Class467[] arr_5 = ClanVarDefinitions.method6825();
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

    static void method11380(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method7667(icomponentdefinitions_3, interface_4, executor);
    }

    static void method4825(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = ItemContainer.getItemIdAtSlot(i_2, i_3, true);
    }

    static void method4826(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class9.anInt112;
    }

    static void method4829(CS2Executor executor) {
        if (client.anInt7434 == 0) {
            executor.intStack[++executor.intStackPtr - 1] = -1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = client.IGNORE_LIST_COUNT;
        }
    }

    static void method4830(CS2Executor executor) {
        IComponentDefinitions icomponentdefinitions_2 = executor.currentEntity.inter.getComponent(executor.intStack[--executor.intStackPtr]);
        icomponentdefinitions_2.slotChildren = null;
        icomponentdefinitions_2.itemSlots = null;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_2);
    }

    static void method7461(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 1] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 1]).members ? 1 : 0;
    }

    static void method7462(CS2Executor executor) {
        String string_2 = null;
        if (Class119.HOSTNAME_IDENTIFIER != null) {
            string_2 = Class119.HOSTNAME_IDENTIFIER.getHostName();
        }
        if (string_2 == null) {
            string_2 = "";
        }
        executor.stringStack[++executor.stringStackPtr - 1] = string_2;
    }

    static void interpolate(CS2Executor executor) {
        executor.intStackPtr -= 5;
        int a = executor.intStack[executor.intStackPtr];
        int b = executor.intStack[executor.intStackPtr + 1];
        int c = executor.intStack[executor.intStackPtr + 2];
        int d = executor.intStack[executor.intStackPtr + 3];
        int e = executor.intStack[executor.intStackPtr + 4];
        executor.intStack[++executor.intStackPtr - 1] = a + (e - c) * (b - a) / (d - c);
    }

    static void sendChatMessage(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        if (client.PLAYER_RIGHTS != 0 || (!client.USERDETAIL_QUICKCHAT || client.VERIFIED_EMAIL_ADDRESS) && !client.IS_QUICKCHAT_ONLY) {
            String string_3 = string_2.toLowerCase();
            byte b_4 = 0;
            if (string_3.startsWith(LocalizedText.aClass433_5310.translate(Language.ENGLISH))) {
                b_4 = 0;
                string_2 = string_2.substring(LocalizedText.aClass433_5310.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5224.translate(Language.ENGLISH))) {
                b_4 = 1;
                string_2 = string_2.substring(LocalizedText.aClass433_5224.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5312.translate(Language.ENGLISH))) {
                b_4 = 2;
                string_2 = string_2.substring(LocalizedText.aClass433_5312.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5313.translate(Language.ENGLISH))) {
                b_4 = 3;
                string_2 = string_2.substring(LocalizedText.aClass433_5313.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5314.translate(Language.ENGLISH))) {
                b_4 = 4;
                string_2 = string_2.substring(LocalizedText.aClass433_5314.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5221.translate(Language.ENGLISH))) {
                b_4 = 5;
                string_2 = string_2.substring(LocalizedText.aClass433_5221.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5194.translate(Language.ENGLISH))) {
                b_4 = 6;
                string_2 = string_2.substring(LocalizedText.aClass433_5194.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5317.translate(Language.ENGLISH))) {
                b_4 = 7;
                string_2 = string_2.substring(LocalizedText.aClass433_5317.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5318.translate(Language.ENGLISH))) {
                b_4 = 8;
                string_2 = string_2.substring(LocalizedText.aClass433_5318.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5319.translate(Language.ENGLISH))) {
                b_4 = 9;
                string_2 = string_2.substring(LocalizedText.aClass433_5319.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5320.translate(Language.ENGLISH))) {
                b_4 = 10;
                string_2 = string_2.substring(LocalizedText.aClass433_5320.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5199.translate(Language.ENGLISH))) {
                b_4 = 11;
                string_2 = string_2.substring(LocalizedText.aClass433_5199.translate(Language.ENGLISH).length());
            } else if (Class223.CURRENT_LANGUAGE != Language.ENGLISH) {
                if (string_3.startsWith(LocalizedText.aClass433_5310.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 0;
                    string_2 = string_2.substring(LocalizedText.aClass433_5310.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5224.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 1;
                    string_2 = string_2.substring(LocalizedText.aClass433_5224.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5312.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 2;
                    string_2 = string_2.substring(LocalizedText.aClass433_5312.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5313.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 3;
                    string_2 = string_2.substring(LocalizedText.aClass433_5313.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5314.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 4;
                    string_2 = string_2.substring(LocalizedText.aClass433_5314.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5221.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 5;
                    string_2 = string_2.substring(LocalizedText.aClass433_5221.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5194.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 6;
                    string_2 = string_2.substring(LocalizedText.aClass433_5194.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5317.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 7;
                    string_2 = string_2.substring(LocalizedText.aClass433_5317.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5318.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 8;
                    string_2 = string_2.substring(LocalizedText.aClass433_5318.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5319.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 9;
                    string_2 = string_2.substring(LocalizedText.aClass433_5319.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5320.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 10;
                    string_2 = string_2.substring(LocalizedText.aClass433_5320.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5199.translate(Class223.CURRENT_LANGUAGE))) {
                    b_4 = 11;
                    string_2 = string_2.substring(LocalizedText.aClass433_5199.translate(Class223.CURRENT_LANGUAGE).length());
                }
            }
            string_3 = string_2.toLowerCase();
            byte b_5 = 0;
            if (string_3.startsWith(LocalizedText.aClass433_5292.translate(Language.ENGLISH))) {
                b_5 = 1;
                string_2 = string_2.substring(LocalizedText.aClass433_5292.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5323.translate(Language.ENGLISH))) {
                b_5 = 2;
                string_2 = string_2.substring(LocalizedText.aClass433_5323.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5324.translate(Language.ENGLISH))) {
                b_5 = 3;
                string_2 = string_2.substring(LocalizedText.aClass433_5324.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5325.translate(Language.ENGLISH))) {
                b_5 = 4;
                string_2 = string_2.substring(LocalizedText.aClass433_5325.translate(Language.ENGLISH).length());
            } else if (string_3.startsWith(LocalizedText.aClass433_5326.translate(Language.ENGLISH))) {
                b_5 = 5;
                string_2 = string_2.substring(LocalizedText.aClass433_5326.translate(Language.ENGLISH).length());
            } else if (Class223.CURRENT_LANGUAGE != Language.ENGLISH) {
                if (string_3.startsWith(LocalizedText.aClass433_5292.translate(Class223.CURRENT_LANGUAGE))) {
                    b_5 = 1;
                    string_2 = string_2.substring(LocalizedText.aClass433_5292.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5323.translate(Class223.CURRENT_LANGUAGE))) {
                    b_5 = 2;
                    string_2 = string_2.substring(LocalizedText.aClass433_5323.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5324.translate(Class223.CURRENT_LANGUAGE))) {
                    b_5 = 3;
                    string_2 = string_2.substring(LocalizedText.aClass433_5324.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5325.translate(Class223.CURRENT_LANGUAGE))) {
                    b_5 = 4;
                    string_2 = string_2.substring(LocalizedText.aClass433_5325.translate(Class223.CURRENT_LANGUAGE).length());
                } else if (string_3.startsWith(LocalizedText.aClass433_5326.translate(Class223.CURRENT_LANGUAGE))) {
                    b_5 = 5;
                    string_2 = string_2.substring(LocalizedText.aClass433_5326.translate(Class223.CURRENT_LANGUAGE).length());
                }
            }
            BufferedConnectionContext context = BufferedConnectionContext.getConnectionContext();
            TCPPacket packet = TCPPacket.createPacket(ClientProt.CHAT, context.isaac);
            packet.buffer.writeByte(0);
            int i_8 = packet.buffer.index;
            packet.buffer.writeByte(b_4);
            packet.buffer.writeByte(b_5);
            ByteBuf.writeHuffmanString(packet.buffer, string_2);
            packet.buffer.writeIndex(packet.buffer.index - i_8);
            context.queuePacket(packet);
        }
    }

    static void method1861(CS2Executor executor) {
        executor.intStackPtr -= 2;
        Class455.aShortArray5452[executor.intStack[executor.intStackPtr]] = (short) Class5.method294(executor.intStack[executor.intStackPtr + 1]);
        IndexLoaders.ITEM_LOADER.method7152();
        IndexLoaders.ITEM_LOADER.method7151();
        IndexLoaders.NPC_INDEX_LOADER.method6831();
        Static.method6378();
    }

    static void method1862(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundDecor.method12899() ? 1 : 0;
    }

    static void setBaseColor(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (VertexNormal.MY_PLAYER.model != null) {
            VertexNormal.MY_PLAYER.model.setBaseColor(i_2, i_3);
        }
    }

    static void method1836(CS2Executor executor) {
        executor.intStackPtr -= 2;
        Class329_Sub1.animateZero(VertexNormal.MY_PLAYER, executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1]);
    }

    static void method1837() {
        Class514.method8841();
    }

    static void method7551(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = (int) (Utils.time() / 60000L);
    }

    static void method7552(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.maxScreenSize.method12665() ? 1 : 0;
    }

    static void method16124(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        if (string_2.startsWith(Class76.getCrown(0)) || string_2.startsWith(Class76.getCrown(1))) {
            string_2 = string_2.substring(7);
        }
        executor.intStack[++executor.intStackPtr - 1] = Class280.isIgnored(string_2) ? 1 : 0;
    }

    static void method3561(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method2170(icomponentdefinitions_3, executor);
    }

    static void method3562(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(3, i_2 << 16 | i_3, i_4, "");
    }

    static void method15406(CS2Executor executor) {
        boolean bool_2 = true;
        if (client.aBool7310) {
            try {
                Object object_3 = Class361.aClass361_4169.method6255();
                if (object_3 != null) {
                    bool_2 = ((Boolean) object_3).booleanValue();
                }
            } catch (Throwable ignored) {
            }
        }
        executor.intStack[++executor.intStackPtr - 1] = bool_2 ? 1 : 0;
    }

    static void method15407(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.fog.checkValid(i_2);
    }

    static void method15408(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        BASDefinitions bas = IndexLoaders.RENDER_ANIM_LOADER.getBASDefs(i_2);
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

    static void method12115(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = NativeLibraryLoader.anInt3240 == 2 ? 1 : 0;
    }

    static void method12116(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method15511(icomponentdefinitions_3, interface_4, executor);
    }

    static void method12118(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method4149(icomponentdefinitions_3, executor);
    }

    static void method296(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (i_2 >= 0 && i_2 < 2) {
            client.anIntArrayArrayArray7302[i_2] = new int[i_3 << 1][4];
        }
    }

    static void popLong(CS2Executor executor) {
        --executor.longStackPtr;
    }

    static void method6150(CS2Executor executor) {
        CS2Interface underlaydefinition_2;
        if (executor.aBool7022) {
            underlaydefinition_2 = executor.hookedInterface2;
        } else {
            underlaydefinition_2 = executor.hookedInterface1;
        }
        IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.defs;
        Interface interface_5 = underlaydefinition_2.inter;
        method6045(icomponentdefinitions_4, executor);
    }

    static void method6151(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.y;
    }

    static void method6152(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        Class344.method6119(string_2);
    }

    static void method6153(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.toolkitDefault.method13050();
    }

    static void method13467(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = RenderFlagMap.anInt3644;
    }

    static void getVarpbitOld(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        executor.intStack[++executor.intStackPtr - 1] = ((PlayerEntity) executor.currentEntity).aClass155_10561.method2627(i_2);
    }

    static void strAppendNum(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        int i_3 = executor.intStack[--executor.intStackPtr];
        executor.stringStack[++executor.stringStackPtr - 1] = string_2 + i_3;
    }

    static void method4988(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        WorldMapDef class282_sub50_sub6_3 = Class291.method5130(i_2);
        if (class282_sub50_sub6_3 == null) {
            executor.intStack[++executor.intStackPtr - 1] = 0;
            executor.intStack[++executor.intStackPtr - 1] = 0;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9540 - class282_sub50_sub6_3.anInt9539;
            executor.intStack[++executor.intStackPtr - 1] = class282_sub50_sub6_3.anInt9535 - class282_sub50_sub6_3.anInt9541;
        }
    }

    static void method4989(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.sceneryShadows.method12622() ? 1 : 0;
    }

    static void method7043(CS2Executor executor) {
        WorldMapDef class282_sub50_sub6_2 = Class125.method2173();
        if (class282_sub50_sub6_2 != null) {
            boolean bool_3 = class282_sub50_sub6_2.method14775(Class291.anInt3472 + MapSpriteIndexLoader.anInt5123, Class291.anInt3473 + Class475.anInt5624, CS2Executor.anIntArray5900);
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

    static void method4797(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method2874(icomponentdefinitions_3, executor);
    }

    static void method4798(CS2Executor executor) {
        ClanChannel.method12114(executor.intStack[--executor.intStackPtr]);
    }

    static void method4801(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method15256(icomponentdefinitions_3, executor);
    }

    static void method4802(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.slotId;
    }

    static void method11338(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6158(icomponentdefinitions_3, executor);
    }

    static void method11339(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class291_Sub1.aBool8027 ? 1 : 0;
    }

    static void method11340(CS2Executor executor) {
        executor.intStackPtr -= 3;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        int i_4 = executor.intStack[executor.intStackPtr + 2];
        CutsceneAction_Sub10.method14603(7, i_2 << 16 | i_3, i_4, "");
    }

    static void method11341(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.groundDecor.checkValid(i_2);
    }

    static void method11370(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.anInt7434 == 2 && i_2 < client.FRIEND_COUNT) {
            executor.intStack[++executor.intStackPtr - 1] = client.FRIENDS[i_2].worldFlags;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void setChatFilter(CS2Executor executor) {
        executor.intStackPtr -= 3;
        client.PUBLIC_FILTER = executor.intStack[executor.intStackPtr];
        Class149_Sub2.PRIVATE_FILTER = Class246.getFriendStatus(executor.intStack[executor.intStackPtr + 1]);
        if (Class149_Sub2.PRIVATE_FILTER == null) {
            Class149_Sub2.PRIVATE_FILTER = FriendStatus.FRIENDS_ONLY;
        }
        client.TRADE_FILTER = executor.intStack[executor.intStackPtr + 2];
        BufferedConnectionContext context = BufferedConnectionContext.getConnectionContext();
        TCPPacket packet = TCPPacket.createPacket(ClientProt.CHAT_SETFILTER, context.isaac);
        packet.buffer.writeByte(client.PUBLIC_FILTER);
        packet.buffer.writeByte(Class149_Sub2.PRIVATE_FILTER.id);
        packet.buffer.writeByte(client.TRADE_FILTER);
        context.queuePacket(packet);
    }

    static void method11372(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method7889(icomponentdefinitions_3, executor);
    }

    static void method11373(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6045(icomponentdefinitions_3, executor);
    }

    static void method4565(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        if (icomponentdefinitions_3.containerItemId != -1) {
            executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.anInt1427;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = 0;
        }
    }

    static void method4566(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (client.FC_NAME != null && i_2 < Class459.FC_PLAYER_COUNT) {
            executor.stringStack[++executor.stringStackPtr - 1] = Class467.FC_PLAYERS[i_2].username;
        } else {
            executor.stringStack[++executor.stringStackPtr - 1] = "";
        }
    }

    static void max(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        executor.intStack[++executor.intStackPtr - 1] = Math.max(i_2, i_3);
    }

    static void sendSignupFormPacket(CS2Executor executor) {
        executor.stringStackPtr -= 2;
        executor.intStackPtr -= 2;
        Class119.method2074((String) executor.stringStack[executor.stringStackPtr], (String) executor.stringStack[executor.stringStackPtr + 1], executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1] == 1);
    }

    static void method2071(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method1083(icomponentdefinitions_3, executor);
    }

    static void resumeHSLDialog(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.RESUME_HSLDIALOG, client.GAME_CONNECTION_CONTEXT.isaac);
        tcpmessage_3.buffer.writeShort(i_2);
        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
    }

    static void storeVarpbit(CS2Executor executor) {
        int i_2 = executor.intOpValues[executor.instrPtr];
        Class158_Sub1.PLAYER_VAR_PROVIDER.method280(i_2, executor.intStack[--executor.intStackPtr]);
    }

    static void method2945(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.spritePitch;
    }

    static void method3913(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        executor.intStack[++executor.intStackPtr - 1] = client.SKILL_LEVEL_VISIBLE[i_2];
    }

    static void method1641(CS2Executor executor) {
        String string_2 = (String) executor.stringStack[--executor.stringStackPtr];
        int i_3 = executor.intStack[--executor.intStackPtr];
        Class404.setFCRank(string_2, i_3);
    }

    static void method1643(CS2Executor executor) {
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

    static void getRunWeight(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = client.RUN_WEIGHT;
    }

    static void method13404(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.ambientSoundVolume.method12714();
    }

    static void method8152(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method14482(icomponentdefinitions_3, executor);
    }

    static void method8153(CS2Executor executor) {
        executor.intStackPtr -= 4;
        Class435.playSoundVorbis(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], true, 256);
    }

    static void method8154(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.fontId;
    }

    static void method8156(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class393.preferences.brightness.method12865();
    }

    static void method8694(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method6690(icomponentdefinitions_3, executor);
    }

    static void method8698(CS2Executor executor) {
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
            Static.method13047(executor.globalArrays[i_3], executor.globalArrays[i_4], 0, i_2 - 1);
        }
    }

    static void method8701(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.allowGuests ? 1 : 0;
    }

    static void method8738(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        if (i_2 >= 1 && i_2 <= 2) {
            Class393.preferences.setValue(Class393.preferences.screenSize, i_2);
            Class393.preferences.setValue(Class393.preferences.aPreference_Sub9_8218, i_2);
            Class190.savePreferences();
        }
    }

    static void method14520(CS2Executor executor) {
        executor.intStackPtr -= 4;
        VarNPCMap.playSoundSynth(executor.intStack[executor.intStackPtr], executor.intStack[executor.intStackPtr + 1], executor.intStack[executor.intStackPtr + 2], executor.intStack[executor.intStackPtr + 3], 256);
    }

    static void method14521(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        method4136(icomponentdefinitions_3, executor);
    }

    static void method4146(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.x;
    }

    static void getCompHeight(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.height;
    }

    static void method4148(CS2Executor executor) {
        executor.intStackPtr -= 2;
        int i_2 = executor.intStack[executor.intStackPtr];
        int i_3 = executor.intStack[executor.intStackPtr + 1];
        if (i_3 == -1) {
            executor.intStack[++executor.intStackPtr - 1] = -1;
        } else {
            executor.intStack[++executor.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_CATEGORY_LOADER.getChat(i_2).method15211((char) i_3);
        }
    }

    static void method5595(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method1845(icomponentdefinitions_3, executor);
    }

    static void intNotEqual(CS2Executor executor) {
        executor.intStackPtr -= 2;
        if (executor.intStack[executor.intStackPtr] != executor.intStack[executor.intStackPtr + 1]) {
            executor.instrPtr += executor.intOpValues[executor.instrPtr];
        }
    }

    static void method5598(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.height;
    }

    static void method2841(CS2Executor executor) {
        executor.intStack[executor.intStackPtr - 2] = IndexLoaders.QUEST_LOADER.getQuest(executor.intStack[executor.intStackPtr - 2]).levelRequirements[executor.intStack[executor.intStackPtr - 1]][1];
        --executor.intStackPtr;
    }

    static void clanVarsEnabled(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = Class46.CLAN_VARS != null ? 1 : 0;
    }

    static void method14640(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method3672(icomponentdefinitions_3, executor);
    }

    static void method15552(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        Interface interface_4 = underlaydefinition_2.inter;
        setItemIFComp(icomponentdefinitions_3, interface_4, false, 1, executor);
    }

    static void method15555(CS2Executor executor) {
        int[] ints_2 = executor.intStack;
        int i_3 = ++executor.intStackPtr - 1;
        byte b_4;
        if (Class393.preferences.groundDecor.method12897() == 1) {
            b_4 = 1;
        } else {
            b_4 = 0;
        }
        ints_2[i_3] = b_4;
    }

    static void method8208(CS2Executor executor) {
        int i_2 = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(i_2);
        Interface interface_4 = Interface.INTERFACES[i_2 >> 16];
        method8387(icomponentdefinitions_3, executor);
    }

    static void method7668(CS2Executor executor) {
        SpotAnimIndexLoader.method8862(executor.intStack[--executor.intStackPtr], -1, -1, false);
    }

    static void ifGetOffsetY(CS2Executor executor) {
        int hash = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getDefs(hash);
        executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.offsetY;
    }

    static void method2620(CS2Executor executor) {
        int ifComp = executor.intStack[--executor.intStackPtr];
        CS2Interface underlaydefinition_3;
        if (executor.aBool7022) {
            underlaydefinition_3 = executor.hookedInterface2;
        } else {
            underlaydefinition_3 = executor.hookedInterface1;
        }
        executor.intStack[++executor.intStackPtr - 1] = underlaydefinition_3.setChild(ifComp, -1) ? 1 : 0;
    }

    static void method1134(CS2Executor executor) {
        CS2Interface underlaydefinition_2 = executor.aBool7022 ? executor.hookedInterface2 : executor.hookedInterface1;
        IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.defs;
        int i_4 = executor.intStack[--executor.intStackPtr];
        ParamDefinitions attributedefault_5 = IndexLoaders.PARAM_LOADER.getParam(i_4);
        if (attributedefault_5.isString()) {
            executor.stringStack[++executor.stringStackPtr - 1] = icomponentdefinitions_3.method1998(i_4, attributedefault_5.typeName);
        } else {
            executor.intStack[++executor.intStackPtr - 1] = icomponentdefinitions_3.method1997(i_4, attributedefault_5.defaultInt);
        }
    }

    static void method1135(CS2Executor executor) {
        executor.intStack[++executor.intStackPtr - 1] = executor.currentClanSettings.coinShare;
    }

    /**
     * START MULTI PARAMETER UTILITY METHODS
     */

    static void method15511(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.spriteScale = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            MapSize.method1818(icomponentdefinitions_0.idHash);
        }
    }

    static void method14680(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
        int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
        int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
        if (icomponentdefinitions_0.modelType != ModelType.NPC_MODEL) {
            throw new RuntimeException("");
        } else {
            NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCType(icomponentdefinitions_0.modelId);
            if (icomponentdefinitions_0.npcMeshModifier == null) {
                icomponentdefinitions_0.npcMeshModifier = new NPCMeshModifier(npcdefinitions_5, true);
            }
            icomponentdefinitions_0.npcMeshModifier.cacheKey = CS2Executor.method1480();
            if (i_4 >= 0 && i_4 < npcdefinitions_5.modelIds.length) {
                icomponentdefinitions_0.npcMeshModifier.anIntArray4992[i_4] = i_3;
                IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
            } else {
                throw new RuntimeException("" + i_4);
            }
        }
    }

    static void getBoundingBox(GraphNode_Sub1 transform, CS2Executor cs2executor_1) {
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

    static void method4883(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2) {
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

    static void method15207(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
        int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
        int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
        if (icomponentdefinitions_0.modelType != ModelType.NPC_MODEL && icomponentdefinitions_0.modelType != ModelType.NPC_HEAD) {
            throw new RuntimeException("");
        } else {
            NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCType(icomponentdefinitions_0.modelId);
            if (icomponentdefinitions_0.npcMeshModifier == null) {
                icomponentdefinitions_0.npcMeshModifier = new NPCMeshModifier(npcdefinitions_5, icomponentdefinitions_0.modelType == ModelType.NPC_MODEL);
            }
            icomponentdefinitions_0.npcMeshModifier.cacheKey = CS2Executor.method1480();
            if (npcdefinitions_5.modifiedColors != null && i_4 >= 0 && i_4 < npcdefinitions_5.modifiedColors.length) {
                icomponentdefinitions_0.npcMeshModifier.aShortArray4990[i_4] = (short) i_3;
                IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    static void method1852(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
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
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            BloomPreference.method12709(icomponentdefinitions_0.idHash);
        }
    }

    static void method6289(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.onMouseHoverScript = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method7927(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
        cs2executor_1.intStackPtr -= 2;
        int i_3 = cs2executor_1.intStack[cs2executor_1.intStackPtr] - 1;
        int i_4 = cs2executor_1.intStack[cs2executor_1.intStackPtr + 1];
        if (i_3 >= 0 && i_3 <= 9) {
            method4883(icomponentdefinitions_0, i_3, i_4);
        } else {
            throw new RuntimeException();
        }
    }

    static void method3078(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1389 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method3672(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1412 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void setOnMouseLeave(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
        if (ints_5 != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.mouseLeaveScript = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.mouseLeaveArrayParam = ints_5;
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method7889(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1346 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void setHFlip(IComponentDefinitions defs, CS2Executor executor) {
        defs.hFlip = executor.intStack[--executor.intStackPtr] == 1;
        IComponentDefinitions.redrawComponent(defs);
    }

    static void ifSetModelOrigin(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 2;
        icomponentdefinitions_0.originX = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        icomponentdefinitions_0.originY = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void method2874(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1319 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void setModelOrtho(IComponentDefinitions defs, CS2Executor cs2executor_2) {
        defs.usesOrthogonal = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        IComponentDefinitions.redrawComponent(defs);
    }

    static void method5009(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1413 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method7142(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.shadow = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void method6288(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
        if (ints_5 != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1405 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.anIntArray1406 = ints_5;
        icomponentdefinitions_0.usesScripts = true;
    }

    static void setSpriteShadow(IComponentDefinitions defs, CS2Executor executor) {
        defs.spriteShadow = executor.intStack[--executor.intStackPtr];
        IComponentDefinitions.redrawComponent(defs);
    }

    static void method8754(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.filled = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void ifSetColor(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.color = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            Node_Sub14.method12223(icomponentdefinitions_0.idHash);
        }
    }

    static void method6689(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
        if (ints_5 != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1397 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.varps = ints_5;
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method6690(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1361 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void ifSetModelTint(IComponentDefinitions defs, CS2Executor executor) {
        executor.intStackPtr -= 4;
        defs.modelTintRed = executor.intStack[executor.intStackPtr];
        defs.modelTintGreen = executor.intStack[executor.intStackPtr + 1];
        defs.modelTintBlue = executor.intStack[executor.intStackPtr + 2];
        defs.modelTintScalar = executor.intStack[executor.intStackPtr + 3];
        IComponentDefinitions.redrawComponent(defs);
    }

    static void method4160(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.borderThickness = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static int[] popIntArrayParam(String paramTypes, CS2Executor cs2executor_1) {
        int[] intArr = null;
        if (!paramTypes.isEmpty() && paramTypes.charAt(paramTypes.length() - 1) == 'Y') {
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

    static void method11221(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1393 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method11223(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.onMouseLeaveScript = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method501(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.tiling = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void method502(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
        if (ints_5 != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1403 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.anIntArray1315 = ints_5;
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method505(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        String string_5 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        ParamDefinitions attributedefault_6 = IndexLoaders.PARAM_LOADER.getParam(i_4);
        if (!attributedefault_6.typeName.equals(string_5)) {
            icomponentdefinitions_0.method2000(i_4, string_5);
        } else {
            icomponentdefinitions_0.method1995(i_4);
        }
    }

    static void setScrollSize(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 2;
        icomponentdefinitions_0.scrollWidth = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        icomponentdefinitions_0.scrollHeight = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.type == ComponentType.CONTAINER) {
            HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false);
        }
    }

    static void method2738(Interface interface_0, int i_1, int i_2, int i_3, boolean bool_4, CS2Executor cs2executor_5) {
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
                    if (icomponentdefinitions_7.slotChildren.length >= 0)
                        System.arraycopy(icomponentdefinitions_7.slotChildren, 0, arr_8, 0, icomponentdefinitions_7.slotChildren.length);
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
                IComponentDefinitions.redrawComponent(icomponentdefinitions_7);
            }
        }
    }

    static void setAlpha(IComponentDefinitions defs, CS2Executor executor) {
        boolean bool_5;
        bool_5 = executor.intStack[--executor.intStackPtr] == 1;
        defs.alpha = bool_5;
        IComponentDefinitions.redrawComponent(defs);
    }

    static void method8387(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.anInt1380 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
    }

    static void method8390(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        if (i_4 != icomponentdefinitions_0.spriteId) {
            icomponentdefinitions_0.spriteId = i_4;
            IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        }
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            NewsItem.method1807(icomponentdefinitions_0.idHash);
        }
    }

    static void method15256(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.anInt1381 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
    }

    static void method4651(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1292 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method6313(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 4;
        icomponentdefinitions_0.anInt1404 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        icomponentdefinitions_0.anInt1432 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        icomponentdefinitions_0.anInt1433 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
        icomponentdefinitions_0.anInt1434 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void method786(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        boolean bool_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        if (bool_4 != icomponentdefinitions_0.hidden) {
            icomponentdefinitions_0.hidden = bool_4;
            IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        }
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            Class78.method1389(icomponentdefinitions_0.idHash);
        }
    }

    static void method789(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        if (icomponentdefinitions_0.type == ComponentType.SPRITE) {
            method5459(icomponentdefinitions_0, interface_1, cs2executor_2);
        }
    }

    static void method5017(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1383 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method2955(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.mouseOverCursor = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
    }

    static void method4772(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1419 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method7429(IComponentDefinitions icomponentdefinitions_0, int i_1, byte[] bytes_2, byte[] bytes_3) {
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

    static void setNPCHead(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.modelType = ModelType.NPC_HEAD;
        icomponentdefinitions_0.npcMeshModifier = null;
        icomponentdefinitions_0.modelId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            CutsceneObject.method1565(icomponentdefinitions_0.idHash);
        }
    }

    static void method2960(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.textAntiMacro = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            Class244.method4196(icomponentdefinitions_0.idHash);
        }
    }

    static void method11160(CacheableNode_Sub7 class282_sub50_sub7_0, CS2Executor cs2executor_1) {
        cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = CutsceneAction_Sub12.method14613(class282_sub50_sub7_0);
        cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class158_Sub1.method13768(class282_sub50_sub7_0);
        cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class435.method7303(class282_sub50_sub7_0);
        cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class9.method450(class282_sub50_sub7_0);
    }

    static void method2593(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1394 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static Object[] popParamsDynamic(String paramTypes, CS2Executor executor) {
        Object[] params = new Object[paramTypes.length() + 1];
        for (int i = params.length - 1; i >= 1; --i) {
            if (paramTypes.charAt(i - 1) == 's') {
                params[i] = executor.stringStack[--executor.stringStackPtr];
            } else if (paramTypes.charAt(i - 1) == '\u00BD') {
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

    static void method13468(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.clickMask = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            LocalizedText.method7278(icomponentdefinitions_0.idHash);
        }
    }

    static void method4136(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1409 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void setItemIFComp(IComponentDefinitions ifComp, Interface interface_1, boolean wearCol, int renderStack, CS2Executor cs2executor_4) {
        cs2executor_4.intStackPtr -= 2;
        int itemId = cs2executor_4.intStack[cs2executor_4.intStackPtr];
        int i_7 = cs2executor_4.intStack[cs2executor_4.intStackPtr + 1];
        if (ifComp.slotId == -1 && !interface_1.aBool999) {
            CutsceneActionType.method6914(ifComp.idHash);
            MapSize.method1818(ifComp.idHash);
            Item.method12575(ifComp.idHash);
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

    static void setCompText(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (!string_4.equals(icomponentdefinitions_0.text)) {
            icomponentdefinitions_0.text = string_4;
            IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        }
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            RenderAnimIndexLoader.method3631(icomponentdefinitions_0.idHash);
        }
    }

    static void method6122(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.useOnName = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
    }

    static void method14482(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        int i_5 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        if (i_5 >= 1 && i_5 <= 10) {
            icomponentdefinitions_0.method2039(i_5 - 1, i_4);
        }
    }

    static void method1083(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1451 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void setIfTextAlign(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 3;
        icomponentdefinitions_0.textHorizontalAli = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        icomponentdefinitions_0.textVerticalAli = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        icomponentdefinitions_0.anInt1358 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void method2170(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1421 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method14605(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
        byte b_3 = 10;
        int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
        method4883(icomponentdefinitions_0, b_3, i_4);
    }

    static void method6186(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        if (icomponentdefinitions_0.type == ComponentType.TEXT) {
            method5459(icomponentdefinitions_0, interface_1, cs2executor_2);
        }
    }

    static void method8310(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.angle2d = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void method542(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1407 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void setIfFont(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.fontId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            Game.method8207(icomponentdefinitions_0.idHash);
        }
    }

    static void method7729(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 2;
        icomponentdefinitions_0.anInt1430 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        icomponentdefinitions_0.anInt1431 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void setComponentPosition(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
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
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
        if (icomponentdefinitions_0.type == ComponentType.CONTAINER) {
            HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false);
        }
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            Class396.method6774(icomponentdefinitions_0.idHash);
        }
    }

    static void method1454(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 2;
        int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        ParamDefinitions attributedefault_6 = IndexLoaders.PARAM_LOADER.getParam(i_4);
        if (i_5 != attributedefault_6.defaultInt) {
            icomponentdefinitions_0.method1999(i_4, i_5);
        } else {
            icomponentdefinitions_0.method1995(i_4);
        }
    }

    static void method1455(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 4;
        icomponentdefinitions_0.modelId = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        icomponentdefinitions_0.anInt1339 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        if (cs2executor_2.intStack[cs2executor_2.intStackPtr + 2] == 1) {
            icomponentdefinitions_0.modelType = ModelType.ITEM_CONTAINER_FEMALE;
        } else {
            icomponentdefinitions_0.modelType = ModelType.ITEM_CONTAINER_MALE;
        }
        icomponentdefinitions_0.wearCol = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3] == 1;
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            CutsceneObject.method1565(icomponentdefinitions_0.idHash);
        }
    }

    static void method14653(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1353 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method12260(IComponentDefinitions icDefs, Interface interface_1, CS2Executor executor) {
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
        IComponentDefinitions.redrawComponent(icDefs);
        IdentikitDefinition.method913(interface_1, icDefs);
        if (icDefs.type == ComponentType.CONTAINER) {
            HostNameIdentifier.method483(interface_1, icDefs, false);
        }
    }

    static void method7555(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.modelType = ModelType.RAW_MODEL;
        icomponentdefinitions_0.modelId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            CutsceneObject.method1565(icomponentdefinitions_0.idHash);
        }
    }

    static void method6010(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 3;
        int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        short s_5 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        short s_6 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
        if (i_4 >= 0 && i_4 < 5) {
            icomponentdefinitions_0.retexture(i_4, s_5, s_6);
            IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
            if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
                Class276.method4903(icomponentdefinitions_0.idHash, i_4);
            }
        }
    }

    static void method1845(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1271 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method3365(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1302 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method3366(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1416 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method3369(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.useOptionString = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
    }

    static void method3965(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
        FontMetrics fontmetrics_3 = icomponentdefinitions_0.method1989(Class487.aClass378_5752, client.anInterface35_7206);
        int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
        int i_5 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
        int i_6 = fontmetrics_3.method6956(icomponentdefinitions_0.text, icomponentdefinitions_0.width, icomponentdefinitions_0.anInt1358, i_5, i_4, Class182.aNativeSpriteArray2261);
        cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_6;
    }

    static void method3987(IComponentDefinitions icomponentdefinitions_0, Interface interface_1) {
        icomponentdefinitions_0.modelType = ModelType.PLAYER_HEAD;
        icomponentdefinitions_0.modelId = client.myPlayerIndex;
        icomponentdefinitions_0.anInt1339 = 0;
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            CutsceneObject.method1565(icomponentdefinitions_0.idHash);
        }
    }

    static void method1494(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
        int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
        int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
        if (icomponentdefinitions_0.modelType != ModelType.NPC_HEAD) {
            throw new RuntimeException("");
        } else {
            NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCType(icomponentdefinitions_0.modelId);
            if (icomponentdefinitions_0.npcMeshModifier == null) {
                icomponentdefinitions_0.npcMeshModifier = new NPCMeshModifier(npcdefinitions_5, false);
            }
            icomponentdefinitions_0.npcMeshModifier.cacheKey = CS2Executor.method1480();
            if (i_4 >= 0 && i_4 < npcdefinitions_5.headModels.length) {
                icomponentdefinitions_0.npcMeshModifier.anIntArray4992[i_4] = i_3;
                IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    static void method7547(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.opName = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
    }

    static void method12401(IComponentDefinitions icomponentdefinitions_0, Interface interface_1) {
        icomponentdefinitions_0.modelType = ModelType.PLAYER_MODEL;
        icomponentdefinitions_0.modelId = client.myPlayerIndex;
        icomponentdefinitions_0.anInt1339 = 0;
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            CutsceneObject.method1565(icomponentdefinitions_0.idHash);
        }
    }

    static void method14892(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.lineWidth = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void setModelAngle(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 6;
        icomponentdefinitions_0.offsetX = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        icomponentdefinitions_0.offsetY = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        icomponentdefinitions_0.spritePitch = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
        icomponentdefinitions_0.spriteRoll = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
        icomponentdefinitions_0.spriteYaw = cs2executor_2.intStack[cs2executor_2.intStackPtr + 4];
        icomponentdefinitions_0.spriteScale = cs2executor_2.intStack[cs2executor_2.intStackPtr + 5];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            MapSize.method1818(icomponentdefinitions_0.idHash);
            Item.method12575(icomponentdefinitions_0.idHash);
        }
    }

    static void method4280(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        boolean bool_5;
        bool_5 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        icomponentdefinitions_0.vFlip = bool_5;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void clearScripts(IComponentDefinitions defs) {
        defs.clearScripts();
    }

    static void method5066(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.modelType = ModelType.PLAYER_MODEL;
        icomponentdefinitions_0.modelId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            CutsceneObject.method1565(icomponentdefinitions_0.idHash);
        }
    }

    static void method13450(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        icomponentdefinitions_0.lineDirection = i_4 == 1;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void method6942(IComponentDefinitions icomponentdefinitions_0) {
        if (client.getIComponentSettings(icomponentdefinitions_0).continueOptionEnabled() && client.aClass118_7352 == null) {
            Class158_Sub2.method14355(icomponentdefinitions_0.idHash, icomponentdefinitions_0.slotId);
            client.aClass118_7352 = Index.getIComponentDefinitions(icomponentdefinitions_0.idHash, icomponentdefinitions_0.slotId);
            IComponentDefinitions.redrawComponent(client.aClass118_7352);
        }
    }

    static void method3601(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
        int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
        int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
        if (icomponentdefinitions_0.modelType != ModelType.NPC_MODEL && icomponentdefinitions_0.modelType != ModelType.NPC_HEAD) {
            throw new RuntimeException("");
        } else {
            NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCType(icomponentdefinitions_0.modelId);
            if (icomponentdefinitions_0.npcMeshModifier == null) {
                icomponentdefinitions_0.npcMeshModifier = new NPCMeshModifier(npcdefinitions_5, icomponentdefinitions_0.modelType == ModelType.NPC_MODEL);
            }
            icomponentdefinitions_0.npcMeshModifier.cacheKey = CS2Executor.method1480();
            if (npcdefinitions_5.modifiedTextures != null && i_4 >= 0 && i_4 < npcdefinitions_5.modifiedTextures.length) {
                icomponentdefinitions_0.npcMeshModifier.aShortArray4991[i_4] = (short) i_3;
                IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    static void method5291(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] - 1;
        if (i_4 >= 0 && i_4 <= 9) {
            icomponentdefinitions_0.method1994(i_4, (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr]);
        } else {
            --cs2executor_2.stringStackPtr;
        }
    }

    static void setModelAnim(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
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
            IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        }
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            Class149_Sub1.method14582(icomponentdefinitions_0.idHash);
        }
    }

    static void setTransparency(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.transparency = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void method5455(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1418 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method5459(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        if (i_4 != icomponentdefinitions_0.anInt1435) {
            icomponentdefinitions_0.anInt1435 = i_4;
            IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        }
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            JS5LocalRequester.method5581(icomponentdefinitions_0.idHash);
        }
    }

    static void method569(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.maxTextLines = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
    }

    static void method3251(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
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

    static void method5001(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1) {
        FontMetrics fontmetrics_3 = icomponentdefinitions_0.method1989(Class487.aClass378_5752, client.anInterface35_7206);
        int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
        Point point_5 = fontmetrics_3.method6954(icomponentdefinitions_0.text, icomponentdefinitions_0.width, icomponentdefinitions_0.anInt1358, i_4, Class182.aNativeSpriteArray2261);
        cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.x;
        cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.y;
    }

    static void method3338(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        int[] ints_5 = popIntArrayParam(string_4, cs2executor_2);
        if (ints_5 != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1387 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.anIntArray1402 = ints_5;
        icomponentdefinitions_0.usesScripts = true;
    }

    static void ifSetAspect(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 2;
        icomponentdefinitions_0.aspectX = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        icomponentdefinitions_0.aspectY = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
        if (icomponentdefinitions_0.type == ComponentType.CONTAINER) {
            HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false);
        }
    }

    static void method3738(IComponentDefinitions defs, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 2;
        int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        if (i_4 == -1 && i_5 == -1) {
            defs.aClass118_1379 = null;
        } else {
            defs.aClass118_1379 = Index.getIComponentDefinitions(i_4, i_5);
        }
    }

    static void method14586(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1396 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method6045(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.targetLeaveCursor = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        icomponentdefinitions_0.targetOverCursor = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
    }

    static void setOnMouseOver(IComponentDefinitions iCompDefs, CS2Executor cs2executor_2) {
        String paramTypes = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(paramTypes, cs2executor_2) != null) {
            paramTypes = paramTypes.substring(0, paramTypes.length() - 1);
        }
        iCompDefs.popupScript = popParamsDynamic(paramTypes, cs2executor_2);
        iCompDefs.usesScripts = true;
    }

    static void method869(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        if (i_4 == IComponentDefinitions.anInt1283 || i_4 == IComponentDefinitions.anInt1373 || i_4 == IComponentDefinitions.anInt1265) {
            icomponentdefinitions_0.anInt1382 = i_4;
        }
    }

    static void method910(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.params = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void setNoClickThrough(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.noClickThrough = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
    }

    static void method12209(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 2;
        byte b_4 = 10;
        byte[] bytes_5 = {(byte) cs2executor_2.intStack[cs2executor_2.intStackPtr]};
        byte[] bytes_6 = {(byte) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1]};
        method7429(icomponentdefinitions_0, b_4, bytes_5, bytes_6);
    }

    static void method1838(IComponentDefinitions icomponentdefinitions_0, byte[] bytes_1, byte[] bytes_2, CS2Executor cs2executor_3) {
        int i_5 = cs2executor_3.intStack[--cs2executor_3.intStackPtr] - 1;
        if (i_5 >= 0 && i_5 <= 9) {
            method7429(icomponentdefinitions_0, i_5, bytes_1, bytes_2);
        } else {
            throw new RuntimeException();
        }
    }

    static void method15409(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1386 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method6158(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1415 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method11337(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.modelType = ModelType.NPC_MODEL;
        icomponentdefinitions_0.npcMeshModifier = null;
        icomponentdefinitions_0.modelId = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            CutsceneObject.method1565(icomponentdefinitions_0.idHash);
        }
    }

    static void resetOptionNames(IComponentDefinitions defs) {
        defs.optionNames = null;
    }

    static void method1642(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (popIntArrayParam(string_4, cs2executor_2) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1400 = popParamsDynamic(string_4, cs2executor_2);
        icomponentdefinitions_0.usesScripts = true;
    }

    static void method4149(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.anInt1378 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
    }

    static void method7667(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr -= 3;
        int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
        short s_5 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
        short s_6 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
        if (i_4 >= 0 && i_4 < 5) {
            icomponentdefinitions_0.recolor(i_4, s_5, s_6);
            IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
            if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
                RenderFlagMap.method5513(icomponentdefinitions_0.idHash, i_4);
            }
        }
    }

    static void method6697(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
        icomponentdefinitions_0.monospaced = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        IComponentDefinitions.redrawComponent(icomponentdefinitions_0);
        if (icomponentdefinitions_0.slotId == -1 && !interface_1.aBool999) {
            CutsceneAction_Sub17.method14656(icomponentdefinitions_0.idHash);
        }
    }
}