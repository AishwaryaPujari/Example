package edu.profound;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpCtrl {
	
	@RequestMapping("/empform")
	public ModelAndView showEmp(@RequestParam("eid")int eid,@RequestParam("ename")String ename,@RequestParam("esal")float esal)
	{
		String str=eid+"\t"+ename+"\t"+esal;
		
		return new ModelAndView("sucess","msg",str);
		
	}
}
