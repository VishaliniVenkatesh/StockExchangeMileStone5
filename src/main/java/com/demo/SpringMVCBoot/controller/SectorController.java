package com.demo.SpringMVCBoot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import com.demo.SpringMVCBoot.model.Company;

public interface SectorController {
	List<Company> FindBySectorName(@PathVariable String name);
	List<String> FindByCompanyName(@PathVariable("name") String name);
}
