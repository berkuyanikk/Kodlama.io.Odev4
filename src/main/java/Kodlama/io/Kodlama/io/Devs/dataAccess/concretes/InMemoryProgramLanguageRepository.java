package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;

@Repository
public class InMemoryProgramLanguageRepository implements ProgramLanguageRepository {

	List<ProgramLanguage> languages;

	public InMemoryProgramLanguageRepository() {

		languages = new ArrayList<ProgramLanguage>();
		languages.add(new ProgramLanguage(1, "C++"));
		languages.add(new ProgramLanguage(2, "C#"));
		languages.add(new ProgramLanguage(3, "Java"));
		languages.add(new ProgramLanguage(4, "Kotlin"));
		languages.add(new ProgramLanguage(5, "Phyton"));
	}

	@Override
	public List<ProgramLanguage> getAll() {

		return languages;
	}

	@Override
	public void add(ProgramLanguage language) {
		languages.add(language);
	}

	@Override
	public void delete(int id) {
		languages.remove(id);

	}

	@Override
	public void update(int id, ProgramLanguage updateLanguage) {
		for (ProgramLanguage programLanguage : languages) {
			if (programLanguage.getId() == id) {
				programLanguage.setName(updateLanguage.getName());
			}

		}

	}

	@Override
	public ProgramLanguage getById(int id) throws Exception {
		for (ProgramLanguage programLanguage : languages) {
			if (programLanguage.getId() == id) {
				return programLanguage;
			}

		}
		throw new Exception("InMemory Hatası");

	}

}
