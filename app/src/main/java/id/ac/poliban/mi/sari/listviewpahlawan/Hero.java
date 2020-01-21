package id.ac.poliban.mi.sari.listviewpahlawan;

public class Hero {
    private String hero;
    private String heroName;
    private String heroDesc;

    public Hero(String hero, String heroName, String heroDesc) {
        this.hero = hero;
        this.heroName = heroName;
        this.heroDesc = heroDesc;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroDesc() {
        return heroDesc;
    }

    public void setHeroDesc(String heroDesc) {
        this.heroDesc = heroDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s", getHeroName());
    }
}
