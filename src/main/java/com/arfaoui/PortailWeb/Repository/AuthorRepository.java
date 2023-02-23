package com.arfaoui.PortailWeb.Repository;

import com.arfaoui.PortailWeb.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
