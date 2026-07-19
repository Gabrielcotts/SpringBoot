package aulas.springboot.controle;

import aulas.springboot.dominio.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeControle {
    //localhost:8080/anime/list
   // @RequestMapping(method = RequestMethod.GET, path = "list")
    @GetMapping(path = "list")
    public List<Anime> list(){
        return List.of(new Anime("Code Geas"), new Anime("Berserk"));
    }
}
