package HeroAPI.HeroAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc

public class HeroIT {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void addHero() throws Exception {
        HeroDto heroDto = new HeroDto("image1", "real name1", "hero name1", 185, 220, "special power1", "intelligence1",
                "strength1", "power1", 120, "agility1", "description1", "story1");
        mockMvc.perform(post("/hero")
                .content(objectMapper.writeValueAsString(heroDto))
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isCreated());
    };

    @Test
    public void viewHeroes() throws Exception {
        HeroDto heroDto = new HeroDto("image1", "real name1", "hero name1", 185, 220, "special power1", "intelligence1",
                "strength1", "power1", 120, "agility1", "description1", "story1");

        mockMvc.perform(post("/hero")
                .content(objectMapper.writeValueAsString(heroDto))
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isCreated());
        mockMvc.perform(get("/heroes")
                .content(objectMapper.writeValueAsString(heroDto))
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().is(200)); //checking get status
    };

    @Test
    public void HeroByName() throws Exception {
        HeroDto heroDto = new HeroDto("image1", "real name1", "hero name1", 185, 220, "special power1", "intelligence1",
                "strength1", "power1", 120, "agility1", "description1", "story1");

        mockMvc.perform(post("/hero")
                .content(objectMapper.writeValueAsString(heroDto))
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isCreated());
        mockMvc.perform(get("/heroes?name=real name1")
                .content(objectMapper.writeValueAsString(heroDto))
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().is(200)); //checking get status
    };
}
