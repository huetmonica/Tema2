package Controller;

import Repository.Spectacol;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import Repository.SpectacolDAO;
import Repository.Angajat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import Repository.UserBd;
import Repository.MD5Digest;
import Repository.UserService;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SpectacolController {

	@RequestMapping(value = "/spectacol")
	public ModelAndView spectacol() {

		return new ModelAndView("spectacol", "command", new Spectacol());
	}

	@RequestMapping(value = "/adaugaS", method = RequestMethod.POST)
	public String adaugaS(@ModelAttribute("SpringWeb") UserBd ub, Spectacol sp, MD5Digest md, UserService us,
			Angajat ang, SpectacolDAO spd, ModelMap model) throws Exception {

		spd = new SpectacolDAO();
		model.addAttribute("titlu", sp.getTitlu());
		model.addAttribute("distributie", sp.getDistributia());
		model.addAttribute("data", sp.getData());
		model.addAttribute("regia", sp.getRegia());
		model.addAttribute("nrbilete", sp.getNrbilete());
		spd.addSpectacol(sp);
		return "redirect:/spectacol.do";

	}

	@RequestMapping(value = "/VizualizareS", method = RequestMethod.GET)
	public ModelAndView Vizualizare(@ModelAttribute("SpringWeb") SpectacolDAO spec, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("spec", spec.getSpectacol());

		return new ModelAndView("Vizualizare", model);
	}

	@RequestMapping(value = "/adaugaA", method = RequestMethod.POST)
	public String adaugaA(@ModelAttribute("SpringWeb") ModelMap model) {
		return "redirect:/angajat.do";
	}
}