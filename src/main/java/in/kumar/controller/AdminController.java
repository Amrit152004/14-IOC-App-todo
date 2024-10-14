package in.kumar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.kumar.Entity.AdminEntity;
import in.kumar.Entity.TaskEntity;
import in.kumar.dto.AdminDTO;
import in.kumar.dto.AdminLoginDTO;
import in.kumar.dto.TaskDto;
import in.kumar.service.AdminService;
import in.kumar.service.TaskService;

@Controller

public class AdminController {
	@Autowired
	private AdminService ads;
	@Autowired
	private TaskService ts;
	private String email;
	@RequestMapping("/hello")
	public String LoadClass(ModelMap model) {
		return "registration";
	}
	@PostMapping("/submit")
	public String SaveAdmin(AdminDTO ad, ModelMap model) {
		AdminEntity ae=new AdminEntity();
		ae.setName(ad.getName());
		ae.setEmail(ad.getEmail());
		ae.setGender(ad.getGender());
		ae.setPass(ad.getPass());
		ae.setPhno(ad.getPhno());
		ads.saveAdmin(ae);
		return "login";
	}
	@RequestMapping("/login")
	public String LoginLoad(ModelMap model) {
		return "login";
	}
		
	
	@PostMapping("/log")
	public String loginAdmin(AdminLoginDTO ald,ModelMap model) {
		Optional<String> byEmail = ads.findByEmail(ald.getEmail());
		String pass = byEmail.get();
		//String pass = byEmail.;
		if(pass.equals(ald.getPass())) {
			email=ald.getEmail();
		String s="welcome "+ald.getEmail();
			model.addAttribute("msg",s);
			return "home";
		}
		model.addAttribute("msg", "invalid Credential, Login Again");
		return "login";
		
	}
	@PostMapping("/task")
	public String addTask(TaskDto dto, ModelMap model) {
		TaskEntity te=new TaskEntity();
		te.setTname(dto.getTname());
		te.setTdate(dto.getTdate());
		te.setTtime(dto.getTtime());
		te.setTemailid(email);
		ts.saveTask(te);
		 return "redirect:/view";
	}
	@GetMapping("/view")
	public String viewTask(ModelMap model) {
		List<TaskEntity> teList =ts.findByEmail(email);
		model.addAttribute("task", teList);
		System.out.println(teList);
		for (TaskEntity te : teList) {
		    System.out.println(te.getTname());
		    System.out.println(te.getTdate());
		    System.out.println(te.getTemailid());// Prints each TaskEntity object
		    // You can also access fields of te like te.getId(), te.getName(), etc.
		}
		return"show";
	}
	@GetMapping("/delete/{tId}")
	public String deleteTask(@PathVariable("tId") Integer tId,ModelMap model) {
		System.out.println(tId);
		ts.deleteById(tId);
		List<TaskEntity> teList =ts.findByEmail(email);
		model.addAttribute("task", teList);
		System.out.println(teList);
		for (TaskEntity te : teList) {
		    System.out.println(te.getTname());
		    System.out.println(te.getTdate());
		    System.out.println(te.getTemailid());// Prints each TaskEntity object
		    // You can also access fields of te like te.getId(), te.getName(), etc.
		}
		 return "redirect:/view";
	}

	@GetMapping("/update/{tId}")
	public String updateTask(@PathVariable("tId") Integer tId,ModelMap model) {
	Optional<TaskEntity>te=	ts.findById(tId);
	TaskEntity taskEntity = te.get();
	model.addAttribute("task", taskEntity);
		 return "update";
	}
	@PostMapping("/updateAll/{tId}")
	public String UpdateTaskData(TaskDto dto, ModelMap model,@PathVariable("tId") Integer tId) {
		String tdate = dto.getTdate();
		String ttime = dto.getTtime();
		ts.updateByIdData(tId,tdate,ttime);
		
		return "redirect:/view";
		
	}


}
