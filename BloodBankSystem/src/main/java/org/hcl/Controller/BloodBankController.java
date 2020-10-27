package org.hcl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BloodBankController
{
	@GetMapping("/")
	public String showHome()
	{
		return "home";
	}
}
	
