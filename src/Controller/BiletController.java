package Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import Repository.BileteDAO;

import Repository.Bilet;
import Repository.MD5Digest;
import Repository.SpectacolDAO;
import Repository.UserBd;


@Controller
public class BiletController {

	@RequestMapping(value = "/bilet")
	public ModelAndView bilet() {
		return new ModelAndView("bilet", "command", new Bilet());
	}

	@RequestMapping(value = "/adaugaB", method = RequestMethod.POST)
	public void adaugaA(@ModelAttribute("SpringWeb") UserBd ub, SpectacolDAO sp, MD5Digest md, BileteDAO bd, Bilet bl,
			ModelMap model) throws Exception {

		model.addAttribute("spectacol", bl.getSpectacol());
		model.addAttribute("rand", bl.getRand());
		model.addAttribute("numar", bl.getNumar());
		if (bd.VerificaBilet(bl) == 0)
			if (sp.VerificaSpectacol(bl.getSpectacol()) == 1) {
				bd.addBilet(bl);
			}

	}

	@RequestMapping(value = "/Vizualizare", method = RequestMethod.GET)
	public ModelAndView Vizualizare(@ModelAttribute("SpringWeb") BileteDAO bilet, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("bilet", bilet.getBilet());

		return new ModelAndView("Vizualizare", model);
	}

}
