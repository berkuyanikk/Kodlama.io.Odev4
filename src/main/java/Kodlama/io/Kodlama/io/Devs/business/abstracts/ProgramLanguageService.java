package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;

public interface ProgramLanguageService {
	List<ProgramLanguage> getAll();

	void add(ProgramLanguage language) throws Exception;

	void delete(int id) throws Exception;

	void update(int id, ProgramLanguage updateLanguage) throws Exception;

	ProgramLanguage getById(int id) throws Exception;

}
