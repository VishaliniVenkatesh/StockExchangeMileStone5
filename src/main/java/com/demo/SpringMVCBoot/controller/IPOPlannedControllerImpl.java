package com.demo.SpringMVCBoot.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.demo.SpringMVCBoot.model.IPOPlanned;
import com.demo.SpringMVCBoot.service.IPOPlannedService;
@Controller
public class IPOPlannedControllerImpl implements IPOPlannedController{
	
	@Autowired
	IPOPlannedService ipoService;
	@RequestMapping(value = "/insertIpo")
	public String insertIPODetails(Model model) {
		
		IPOPlanned ipo=new IPOPlanned();
		
		model.addAttribute("ipo", ipo);
		return "insertIPO";
	}	
	@RequestMapping(path="/IPODetailsList")
	public ModelAndView getIPOList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("IPODetailsList");
		mv.addObject("IPODetailsList",ipoService.getIPOList());
		return mv;
	}	
	public static void main(String [] args) {
		IPOPlannedController controller=new IPOPlannedControllerImpl();
		try {
			System.out.println(controller.getIPOList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping(value = "/insertIpoDetail", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("ipo") @Valid IPOPlanned ipo, 
			BindingResult result, Model model) throws SQLException {
		System.out.println(ipo);
		if(result.hasErrors()){
			System.out.println("error");
			return "insertIpo";
		}
		
	ipoService.insertIPO(ipo);
	
	return "redirect:IPODetailsList";
}

}