package org.hcl.Controller;

	import java.util.ArrayList;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	import org.hcl.entities.BloodDonor;
	import org.hcl.entities.BloodRequester;
	import org.hcl.entities.User;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.ResponseBody;



	@Controller
	public class LoginController {
		
		@RequestMapping("/")	
		public String loginview(@ModelAttribute("user")User user){		
			return "login";	
		}
		
		@RequestMapping("/")	
		public String DonorRegister(@ModelAttribute("donor")BloodDonor donor,BindingResult result,HttpServletRequest request) {
	    	
	        return "donorregistration";
	    }
		
		@RequestMapping("/")	
		public String RequesterRegister(@ModelAttribute("requester")BloodRequester requester,Model model,HttpServletRequest request) {
	    	
	        return "requesterregistration";
	    }
		
		@RequestMapping("/")	
		public String Requesterhome(@ModelAttribute("requester")BloodRequester requester,Model model,HttpServletRequest request) {
	    	
	        return "requesterhome";
	    }
		

}
