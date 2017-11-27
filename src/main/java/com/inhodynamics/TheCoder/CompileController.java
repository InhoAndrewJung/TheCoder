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
import com.inhodynamics.model.TestCase;

@Controller
public class CompileController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("result")
	public ModelAndView compile(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String code = request.getParameter("code");
		String[] compiledCode = new String[2];
		//Handling System.in & Compare user soureCode and Answer
		//TestCase proc = new TestCase();
		//code = proc.process(code);
		//Compile using javac
		Compute com = new Compute();
		compiledCode = com.compile(code);
		//put error message and result to setVO
		Data set = new Data(compiledCode[0], compiledCode[1]);
		return new ModelAndView("result","code", set);	
	}
	
}
