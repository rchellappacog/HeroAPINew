package HeroAPI.HeroAPI;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping ("/heroes")
    @ResponseStatus(HttpStatus.OK)
    public List<HeroDto> viewHeroes(){
        //System.out.println("Hello");
        return this.heroList;

    }
    @RequestMapping ("/heroesByName")
    @ResponseStatus(HttpStatus.OK)
    public List<HeroDto> getHeroByName(@RequestParam(value="name") String name)
    {
        //System.out.println("Hello");
        List<HeroDto> temp=null;
        for(HeroDto h:heroList){
            if(name.equals(h.getHeroName())){
                temp.add(h);
            }
        }
        return temp;

    }
}

