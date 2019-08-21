package com.demo.SpringMVCBoot.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringMVCBoot.model.Company;
import com.demo.SpringMVCBoot.model.Sectors;
import com.demo.SpringMVCBoot.service.CompanyDetailService;
import com.demo.SpringMVCBoot.service.SectorService;


@Controller
public class CompanyRegistrationControllerImpl implements CompanyRegistrationController{

	@Autowired
	private CompanyDetailService companyDetailService;

	@Autowired
	private SectorService sectorService;
	
	@ModelAttribute("sectors")
	public List<Sectors> getSectorList() throws SQLException{
		return sectorService.getSectorList();
	}
	
	public Company insertCompany(Company company) throws SQLException {
		 return companyDetailService.insertCompany(company);
			
	}
	
	
	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList",companyDetailService.getCompanyList());
		return mv;
	}

	public static void main(String [] args) {
		CompanyRegistrationController controller=new CompanyRegistrationControllerImpl();
		try {
			System.out.println(controller.getCompanyList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping(value = "/addCompany", method = RequestMethod.GET)
	public String getCompanyForm(ModelMap model) {
		System.out.println("Add New Company");
		Company c=new Company();
		
		model.addAttribute("company", c);
		return "companyForm";		
	} 
	
	@RequestMapping(value = "/addCompany", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("company") @Valid Company company, 
			BindingResult result, Model model) throws SQLException {
		System.out.println(company);
		
		if(result.hasErrors()){
			System.out.println("error");
			return "companyForm";
		}
		
	companyDetailService.insertCompany(company);
	
	return "redirect:companyList";

	}
}
	