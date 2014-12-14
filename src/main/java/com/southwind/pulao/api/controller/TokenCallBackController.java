package com.southwind.pulao.api.controller;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TokenCallBackController {
	
	@RequestMapping("/verifyToken")
	public void backToken(PrintWriter out,String signature,String echostr, String timestamp, String nonce){
//		String signature = request.getParameter("signature");        // 随机字符串
//        String echostr = request.getParameter("echostr");        // 时间戳
//        String timestamp = request.getParameter("timestamp");        // 随机数
//        String nonce = request.getParameter("nonce");
// 
//        String[] str = { TOKEN, timestamp, nonce };
//        Arrays.sort(str); // 字典序排序
//        String bigStr = str[0] + str[1] + str[2];        // SHA1加密
//        String digest = new SHA1().getDigestOfString(bigStr.getBytes()).toLowerCase();        
//        // 确认请求来至微信
//        if (digest.equals(signature)) {
//            response.getWriter().print(echostr);
//        }
		System.out.println("========"+echostr);
		out.print(echostr);;

	}

}
