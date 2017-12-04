package com.inhodynamics.TheCoder;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Display;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inhodynamics.compile.Compute;
import com.inhodynamics.model.Data;
import com.inhodynamics.model.Preprocess;

@Controller
public class CompileController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("result")
	public ModelAndView compile(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String code = request.getParameter("code");
		String[] compiledResult = new String[4];
		int questionNo = 1; //Get questionNo from DB
		int tcNo = 0; //TestCase number
		//Handling System.in & Compare user soureCode and Answer
		Preprocess proc = new Preprocess();
		for(tcNo=0; tcNo<2; tcNo++) {
		code = proc.process(code, questionNo, tcNo);
		System.out.println("After process:"+code);
		//Compile using javac
		Compute com = new Compute();
		compiledResult = com.compile(code, questionNo, tcNo);
		//put error message and result to setVO
		}
		//0 : answerResult, 1 : error, 2 : result 
		System.out.println("에러메세지@controller : "+ compiledResult[0]);
		if(compiledResult[0].contains("Exception")) {
			System.out.println("런타임에러 확인 :"+compiledResult[0]);
			compiledResult[0] = "Exception";
		}
		System.out.println("런타임에러 확인 :"+compiledResult[1]);
		Data set = new Data(compiledResult[0], compiledResult[1], compiledResult[2]);
		return new ModelAndView("result","code", set);	
	}
	
}
