public enum Earth {
    MERCURY("Ближайшая к солнцу планета"),
    VENUS(" Сфмфя беспокойная и горячая планета"),
    JUPITER("Слишком уж велика планета"),
    SATURN("Сфморазегревающеся система"),
    MARS("Расположены самые высокие солнечный системы горы"),
    URANUS("'Это самая холодная планета"),
    NEPTUNE(" самая горячая планета");

    private String planetDescription;

    Earth(String planetDescription) {
        this.planetDescription = planetDescription;
    }

    public String getPlanetDescription() {
        return planetDescription;
    }

    @Override
    public String toString() {
        return planetDescription;
    }
}

