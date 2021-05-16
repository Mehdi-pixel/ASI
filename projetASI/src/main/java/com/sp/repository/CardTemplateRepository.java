package com.sp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.sp.model.TemplateCard;

public interface CardTemplateRepository extends CrudRepository<TemplateCard, Integer> {

	public List<TemplateCard> findByNameTemplate(String name);
}
