package HeroAPI.HeroAPI;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeroAPIController {

    private List<HeroDto> heroList;

    public HeroAPIController() {
        heroList = new ArrayList<HeroDto>();
    }

    @PostMapping("hero")
    @ResponseStatus(HttpStatus.CREATED)
    public void addHero(@RequestBody HeroDto heroDto){
        System.out.println("Hello");
        this.heroList.add(heroDto);

    }
}

