package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramLanguageService;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;


@RestController
@RequestMapping("/api/programlanguages")
public class ProgramLanguagesController {

	private ProgramLanguageService programLanguageService;

	public ProgramLanguagesController(ProgramLanguageService programLanguageService) {
		this.programLanguageService = programLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgramLanguage> getAll() {

		return programLanguageService.getAll();

	}
	@PostMapping
	public void add(ProgramLanguage language) throws Exception {
		
		programLanguageService.add(language);

	}
	@DeleteMapping
	public void delete(int id) throws Exception {
		programLanguageService.delete(id);
	}
	@PatchMapping
	public void update(int id, ProgramLanguage updateLanguage) throws Exception {
		programLanguageService.update(id, updateLanguage);
	}
	@GetMapping("/getbyid")
	public ProgramLanguage getById(int id) throws Exception {
		return programLanguageService.getById(id);
	}

}
