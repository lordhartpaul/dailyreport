package com.mycoding.dailyreport.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycoding.dailyreport.dao.DailyreportDAO;
import com.mycoding.dailyreport.model.Dailyreport;





@Controller
public class Dailyreportcontroller {
	
	
	@Autowired
	private DailyreportDAO dailyreportDao;

	
	@RequestMapping(value = "/submit", method=RequestMethod.GET)
	public String newResgistration(ModelMap model) {
		
		Dailyreport dailyreport = new Dailyreport();
		model.addAttribute("dailyreport", dailyreport);
		return "submit";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveRegistration(@Valid Dailyreport dailyreport,BindingResult result, ModelMap model,RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
			
			return "submit";
			
		}
		
		dailyreportDao.save(dailyreport);
		  
		return "redirect:/viewdailyreports/1";
	}
	
	@RequestMapping("/viewdailyreports")  
    public ModelAndView viewdailyreports(){  
        List<Dailyreport> list=dailyreportDao.getAllDailyreports();
        return new ModelAndView("viewdailyreports","list",list);  
    } 
	
	@RequestMapping(value="/viewdailyreports/{pageid}")
	public ModelAndView edit(@PathVariable int pageid) {
		
		int total=2;
		
		
		if(pageid==1) {
			
		}else {
			pageid=(pageid-1)*total+1;
		}
		List<Dailyreport> list=dailyreportDao.getDailyreportsByPage(pageid, total);
		return new ModelAndView("viewdailyreports", "list", list);
		
	}
	
	@RequestMapping(value="/editdailyreport/{id}")  
    public String edit(@PathVariable int id,ModelMap model){  
       Dailyreport dailyreport=dailyreportDao.getDailyreportById(id);  
       model.addAttribute("dailyreport", dailyreport);
		return "editdailyreport";
        
        
    }
	
	@RequestMapping(value="/editsave", method=RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("dailyreport") Dailyreport p) {
		System.out.println("id is"+p.getId());
		dailyreportDao.update(p);
		return new ModelAndView("redirect:/viewdailyreports/1");
	}
	
	@RequestMapping(value="/deletedailyreport/{id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id) {
		
		dailyreportDao.delete(id);
		
		return new ModelAndView("redirect:/viewdailyreports/1");
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public ModelAndView delete() {
		
		dailyreportDao.delete();
		
		return new ModelAndView("redirect:/viewdailyreports/1");
	}
	
	@ModelAttribute("pageCount")
	public List<String> initializePageCount(){
		
		int total = 2;
		List<String> pageCount = new ArrayList<String>();
		int count = dailyreportDao.count();
		int result = ((count/total)+ (count%total));
		for(int k=0;k<result;k++) {
			pageCount.add(new Integer(k).toString());
		}
		
		return pageCount;
	}
	
	
	
}
