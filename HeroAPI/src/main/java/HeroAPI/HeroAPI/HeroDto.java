package HeroAPI.HeroAPI;

public class HeroDto {
    private String image;
    private String realName;
    private String heroName;
    private int height;
    private int weight;
    private String specialPower;
    private String intelligence;
    private String strength;
    private String power;
    private int speed;
    private String agility;
    private String description;
    private String story;

    public HeroDto(
            String image, String real_name, String hero_name, int i, int i1,
            String special_power, String intelligence, String strength,
            String power, int i2, String agility, String description, String story) {

        this.image = image;
        this.realName = real_name;
        this.agility = agility;
        this.description = description;
        this.heroName = hero_name;
        this.height = i;
        this.weight = i1;
        this.specialPower = special_power;
        this.intelligence = intelligence;
        this.story = story;
        this.power = power;
        this.speed = i2;
    }

    public HeroDto() {
    }

    public String getImage() {
        return image;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getAgility() {
        return agility;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
