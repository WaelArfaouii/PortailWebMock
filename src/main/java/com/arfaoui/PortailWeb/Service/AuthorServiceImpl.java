package com.arfaoui.PortailWeb.Service;

import com.arfaoui.PortailWeb.Controller.AuthorController;
import com.arfaoui.PortailWeb.DTO.AuthorDTO;
import com.arfaoui.PortailWeb.Model.Author;
import com.arfaoui.PortailWeb.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository ;
    @Override
    public String addAuthor(AuthorDTO authorDTO) {
        Author author = new Author() ;
        author.setDegree(authorDTO.getDegree());
        author.setEmail(authorDTO.getEmail());
        author.setName(authorDTO.getName());
        author.setTitle(authorDTO.getTitle());
        author.setFirstName(authorDTO.getFirstName());
        author.setLastName(authorDTO.getLastName());
        author.setMiddleName(authorDTO.getMiddleName());
        author.setPhoneNumber(authorDTO.getPhoneNumber());

        authorRepository.save(author) ;
        return author.getName() ;
    }
}
