package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;

public interface ProgramLanguageRepository {
	List<ProgramLanguage> getAll();
	void add(ProgramLanguage language);
	void delete(int id);
	void update(int id,ProgramLanguage updateLanguage);
	ProgramLanguage getById(int id) throws Exception;
	

}
