package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Repository.Angajat;
import Repository.MD5Digest;
import Repository.Spectacol;
import Repository.UserBd;
import Repository.UserService;

@Controller
public class AngajatController {

	@RequestMapping(value = "/angajat")
	public ModelAndView angajat() {
		return new ModelAndView("angajat", "command", new Angajat());
	}

	@RequestMapping(value = "/adaugaAng", method = RequestMethod.POST)
	public String adaugaA(@ModelAttribute("SpringWeb") UserBd ub, Spectacol sp, MD5Digest md, UserService us,
			Angajat ang, ModelMap model) throws Exception {

		String parola = "";
		String parolav = "";
		parola = ang.getParola();
		parolav = md.Criptare(parola);
		ang.setParola(parolav);
		model.addAttribute("nume", ang.getNume());
		model.addAttribute("user", ang.getUser());
		model.addAttribute("cnp", ang.getCnp());
		model.addAttribute("parola", ang.getParola());
		ub.addUser(ang);
		return "redirect:/angajat.do";

	}

}
