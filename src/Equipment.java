/**
 * Equipment interface represents equipment that can be used by a character.
 * Defines methods to retrieve the equipment's name, main stat, level, and an upgrade operation.
 */
public interface Equipment {

    /**
     * Retrieves name of the equipment.
     *
     * @return name of the equipment.
     */
    String getName();

    /**
     * Retrieves the main stat of the equipment.
     *
     * @return main stat of the equipment.
     */
    double getMainStat();

    /**
     * Retrieves level of the equipment.
     *
     * @return level of the equipment.
     */
    int getLevel();

    /**
     * Upgrades the equipment by increasing its level and adjusting its main stat.
     */
    void upgrade();

}

/**
 * MainWeapon abstract class provides a base implementation of the Equipment interface for the main weapons.
 * Includes attributes for the weapon's name, level, base stat, and stat value.
 * Constructor initializes these attributes and calculates the initial stat value.
 * Also implements the upgrade method to increase the level and adjust the stat.
 */
abstract class MainWeapon implements Equipment{

    /** Name of the main weapon. */
    private final String name;

    /** Level of the main weapon. */
    private int level;

    /** Base stat of the main weapon. */
    private final double baseStat;

    /** Current stat value of the main weapon base on level and base stat. */
    private double statValue;

    /**
     * Initializes a new MainWeapon with the provided values.
     *
     * @param name      name of the main weapon.
     * @param level     level of the main weapon.
     * @param baseStat  base stat of the main weapon.
     */
    public MainWeapon(String name, int level, double baseStat){
        this.name = name;
        this.level = level;
        this.baseStat = baseStat;
        this.statValue = baseStat + (2.5 * level);
    }

    /**
     * Retrieves name of the main weapon.
     *
     * @return name of the main weapon.
     */
    public String getName(){
        return name;
    }

    /**
     * Retrieves the main stat of the main weapon.
     *
     * @return main stat of the main weapon.
     */
    public double getMainStat() {
        return statValue;
    }

    /**
     * Retrieves level of the main weapon.
     *
     * @return level of the main weapon.
     */
    public int getLevel(){
        return level;
    }

    /**
     * Upgrades the main weapon by increasing its level and adjusting its main stat.
     */
    public void upgrade(){
        level++;
        statValue += 2.5;
    }
}

/**
 * SubWeapon abstract class provides a base implementation of the Equipment interface for sub weapons.
 * Includes attributes for the weapon's name, level, base stat, and stat value.
 * Constructor initializes these attributes and calculates the initial stat value.
 * Also implements the upgrade method to increase the level and adjust the stat.
 */
abstract class SubWeapon implements Equipment{

    /** Name of the sub weapon. */
    private final String name;

    /** Level of the sub weapon. */
    private int level;

    /** Base stat of the sub weapon. */
    private final double baseStat;

    /** Current stat value of the sub weapon. */
    private double statValue;

    /**
     * Initializes a new SubWeapon with the provided values.
     *
     * @param name      name of the sub weapon.
     * @param level     level of the sub weapon.
     * @param baseStat  base stat of the sub weapon.
     */
    public SubWeapon(String name, int level, double baseStat){
        this.name = name;
        this.level = level;
        this.baseStat = baseStat;
        statValue = baseStat + (2.5 * level);
    }

    /**
     * Retrieves name of the sub weapon.
     *
     * @return name of the sub weapon.
     */
    public String getName(){
        return name;
    }

    /**
     * Retrieves the main stat of the sub weapon.
     *
     * @return main stat of the sub weapon.
     */
    public double getMainStat() {
        return statValue;
    }

    /**
     * Retrieves level of the sub weapon.
     *
     * @return level of the sub weapon.
     */
    public int getLevel(){
        return level;
    }

    /**
     * Upgrades the sub weapon by increasing its level and adjusting its main stat.
     */
    public void upgrade(){
        level++;
        statValue += 2.5;
    }
}

/**
 * Sword class represents a main weapon of type Sword, extending the MainWeapon class.
 * Provides a constructor to initialize the sword with specific values.
 */
class Sword extends MainWeapon{

    /**
     * Initializes a new Sword with the provided values.
     *
     * @param name      name of the sword.
     * @param level     level of the sword.
     * @param baseStat  base stat of the sword.
     */
    public Sword(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

/**
 * Shield class represents a sub weapon of type Shield, extending the SubWeapon class.
 * Provides a constructor to initialize the shield with specific values.
 */
class  Shield extends SubWeapon{

    /**
     * Initializes a new Shield with the provided values.
     *
     * @param name      name of the shield.
     * @param level     level of the shield.
     * @param baseStat  base stat of the shield.
     */
    public Shield(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

/**
 * Staff class represents a main weapon of type Staff, extending the MainWeapon class.
 * Provides a constructor to initialize the staff with specific values.
 */
class Staff extends MainWeapon{

    /**
     * Initializes a new Staff with the provided values.
     *
     * @param name      name of the staff.
     * @param level     level of the staff.
     * @param baseStat  base stat of the staff.
     */
    public Staff(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

/**
 * Charm class represents a sub weapon of type Charm, extending the SubWeapon class.
 * Provides a constructor to initialize the charm with specific values.
 */
class Charm extends SubWeapon{

    /**
     * Initializes a new Charm with the provided values.
     *
     * @param name      name of the charm.
     * @param level     level of the charm.
     * @param baseStat  base stat of the charm.
     */
    public Charm(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

/**
 * Bow class represents a main weapon of type Bow, extending the MainWeapon class.
 * Provides a constructor to initialize the bow with specific values.
 */
class Bow extends MainWeapon{

    /**
     * Initializes a new Bow with the provided values.
     *
     * @param name      name of the bow.
     * @param level     level of the bow.
     * @param baseStat  base stat of the bow.
     */
    public Bow(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

/**
 * Dagger class represents a sub weapon of type Dagger, extending the SubWeapon class.
 * Provides a constructor to initialize the dagger with specific values.
 */
class Dagger extends SubWeapon{

    /**
     * Initializes a new Dagger with the provided values.
     *
     * @param name      name of the dagger.
     * @param level     level of the dagger.
     * @param baseStat  base stat of the dagger.
     */
    public Dagger(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}