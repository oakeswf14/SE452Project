package edu.depaul.cdm.se452.project.model;

import org.springframework.data.repository.CrudRepository;

//Help to perform CRUD operations for Section
public interface SectionRepository extends CrudRepository<Section, Long> {
	Section findBySectionNumber(int num);

}
