package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramLanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;

@Service
public class ProgramLanguageManager implements ProgramLanguageService {

	private ProgramLanguageRepository programLanguageRepository;

	public ProgramLanguageManager(ProgramLanguageRepository programLanguageRepository) {

		this.programLanguageRepository = programLanguageRepository;
	}

	@Override
	public List<ProgramLanguage> getAll() {

		return programLanguageRepository.getAll();
	}

	@Override
	public void add(ProgramLanguage language) throws Exception {
		if (language.getName().isEmpty()) {
			throw new Exception("Programlama dili boş olamaz.");
		}
		for (ProgramLanguage programLanguage : getAll()) {
			if (programLanguage.getName().toLowerCase().equals(language.getName().toLowerCase())) {
				throw new Exception("Programlama dili zaten mevcut.");
			}

		}
		programLanguageRepository.add(language);
	}

	@Override
	public void delete(int id) throws Exception {
		for (ProgramLanguage language : getAll()) {
			if (language.getId() == id) {
				programLanguageRepository.delete(id);
			} else {
				throw new Exception("Programlama dili bulunamadı.");
			}

		}

	}

	@Override
	public void update(int id, ProgramLanguage updateLanguage) throws Exception {
		for (ProgramLanguage language : getAll()) {
			if (language.getId() == id) {
				programLanguageRepository.update(id, updateLanguage);

			} else {
				throw new Exception("Programlama dili bulunamadı.");
			}

		}

	}

	@Override
	public ProgramLanguage getById(int id) throws Exception {

		return programLanguageRepository.getById(id);
	}

}
