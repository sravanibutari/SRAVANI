package comm.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import comm.example.spring.model.CDType;

@Controller
public class CDTypeController {
@RequestMapping(method=RequestMethod.GET,path="/home")
public String showFormForAdd()
{
	return "add-new-type";
}
@RequestMapping("/processForm")
public String processForm(@RequestParam("title") String title,@RequestParam("CDType") String CDType)
{
	CDType cdtype=new CDType(title,CDType);
	return "success";
}
}
