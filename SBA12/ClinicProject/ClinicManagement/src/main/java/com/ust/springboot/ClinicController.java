package com.ust.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class ClinicController {
	
	@Autowired
	ClinicServices clinicservice;
	@Autowired
	PatientServices patientservice;
	@Autowired
	BillServices billservice;
	@RequestMapping("/")
	
	public String index() {
		return "index.html";
	}

	
	@RequestMapping("/home")
	public String iindex() {
		return "home.html";
	}
	
	@GetMapping("/viewmedicine")
	public String viewmedicines(Model model)
	{
		model.addAttribute("lisMedicine",clinicservice.getMedicine());
		return "viewmedicine";
	}
	
	@GetMapping("/addmedicine")
	public String addmedicine(Model model)
	
	{
		Med medicine=new Med();
		model.addAttribute("medicine",medicine);
		return "addmedicine";
	}
	
	@PostMapping("/save")
	public String saveMedicine(@ModelAttribute ("medicine") Med medicine)
	
	{
	clinicservice.saveMedicine(medicine);
	return "redirect:viewmedicine";
		
	}
	
	@GetMapping("/updateform/{id}")
	public String updateform(@PathVariable (value="id") String id, Model model)
	
	{
		Med medicine=clinicservice.getMedicineById(id);
		model.addAttribute("medicine",medicine);
		return "updateform";
	}
	

	@GetMapping("/deleteMedicine/{id}")
	public String deleteform(@PathVariable (value="id") String id)
	
	{
		this.clinicservice.deleteMedicineById(id);
		
		return "redirect:/viewmedicine";
	}
	
	
	@GetMapping("/viewpatients")
	public String viewpatients(Model model)
	{
		model.addAttribute("lisPatients",patientservice.getPatients());
		return "viewpatients";
	}
	
	@GetMapping("/addpatients")
	public String addpatients(Model model)
	
	{
		Patients patients=new Patients();
		model.addAttribute("patients",patients);
		return "addpatients";
	}
	
	@PostMapping("/saved")
	public String savePatients(@ModelAttribute ("patients") Patients patients)
	
	{
	patientservice.savePatients(patients);
	return "redirect:/viewpatients";
		
	}
	
	@GetMapping("/updatepatients/{id}")
	public String updatepatients(@PathVariable (value="id") String id, Model model)
	
	{
		Patients patients=patientservice.getPatientsById(id);
		model.addAttribute("patients",patients);
		return "updatepatients";
	}

	@GetMapping("/deletePatients/{id}")
	public String deletepatients(@PathVariable (value="id") String id)
	
	{
		this.patientservice.deletePatientsById(id);
		
		return "redirect:/viewpatients";
	}
	
	
	@GetMapping("/viewbill")
	public String viewbill(Model model)
	{
		model.addAttribute("lisBill", billservice.getBill());
		return "viewbill";
	}
	
	
	
	@GetMapping("/bill")
	public String bill(Model model)
	
	{
	Bill bill=new Bill();
		model.addAttribute("bill",bill);
		return "bill";
	}
	
	@PostMapping("/saves")
	public String saveBill(@ModelAttribute ("bill") Bill bill)
	
	{
	billservice.saveBill(bill);
	return "redirect:viewbill";
		
	}
	
	
		
	
}
