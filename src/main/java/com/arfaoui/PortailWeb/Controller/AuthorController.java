package com.arfaoui.PortailWeb.Controller;
import com.arfaoui.PortailWeb.DTO.AuthorDTO;
import com.arfaoui.PortailWeb.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService ;
    @PostMapping(path="/save")
    public String saveAuthor(@RequestBody AuthorDTO authorDTO){
            String id = authorService.addAuthor(authorDTO) ;
            return id ;

    }
}
