package HeroAPI.HeroAPI;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeroAPIController {

    private List<HeroDto> heroList;

    @PostMapping("hero")
    @ResponseStatus(HttpStatus.CREATED)
    public void addHero(@RequestBody HeroDto heroDto){
        this.heroList.add(heroDto);
    }
}

