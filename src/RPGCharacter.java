/**
 * RPGCharacter interface represents a character in a role-play game.
 * Defines methods to retrieve the character's name, level, job name, and various actions.
 * Provides methods to manage and display equipped accessories and equipment, and default method to display the character information.
 */
public interface RPGCharacter {

    /**
     * Retrieves name of the character.
     *
     * @return name of the character.
     */
    String getName();

    /**
     * Retrieves level of the character.
     *
     * @return level of the character.
     */
    int getLevel();

    /**
     * Retrieves job name of the character.
     *
     * @return job name of the character.
     */
    String getJobName();

    /**
     * Levels up the character, increasing various attributes.
     */
    void levelUp();

    /**
     * Retrieves an array of equipped accessories.
     *
     * @return An array of equipped accessories.
     */
    Accessory[] getEquippedAccessory();

    /**
     * Retrieves an array of equipped equipment.
     *
     * @return An array of equipped equipment.
     */
    Equipment[] getEquippedEquipment();

    /**
     * Equips the provided accessory to the character.
     *
     * @param accessory The accessory to be equipped.
     */
    void equipAccessory(Accessory accessory);

    /**
     * Equips the provided equipment to the character.
     *
     * @param equipment The equipment to be equipped.
     */
    void equipEquipment(Equipment equipment);

    /**
     * Displays the character's stats.
     */
    void showStats();

    /**
     * Displays detailed information about the character, including name, job, stats, and equipped items to the console.
     */
    default void showCharacterInfo(){
        System.out.println("Name : " + getName());
        System.out.println("Job : " + getJobName());
        showStats();
        System.out.println("Accessory : ");
        for( Accessory acc : getEquippedAccessory()){
            switch (acc) {
                case Amulet amulet -> System.out.println("  Amulet : " + amulet.getName());
                case Ring ring -> System.out.println("  Ring : " + ring.getName());
                case Earring earring -> System.out.println("  Earring : " + earring.getName());
                case null, default -> System.out.print("");
            }
        }
        System.out.println("Equipment : ");
        for( Equipment equ : getEquippedEquipment()){
            switch (equ) {
                case MainWeapon mainWeapon -> System.out.println("  Main Weapon : " + mainWeapon.getName() + " Lv." + mainWeapon.getLevel());
                case SubWeapon subWeapon -> System.out.println("  Sub Weapon : " + subWeapon.getName()+ " Lv." + subWeapon.getLevel());
                case null, default -> System.out.print("");
            }
        }
    }   
}

/**
 * BaseCharacter abstract class provides a base implementation of the RPGCharacter interface.
 * Includes attributes for the character's name, level, base statistics, and equipped items.
 * Provides methods for leveling up, equipping accessories and equipment, and displaying stats.
 */
abstract class BaseCharacter implements RPGCharacter{

    /** Name of the character. */
    private final String name;

    /** Level of the character. */
    private int level;

    /** Maximum and current health points (hp) of the character. */
    private double maxHp, hp;

    /** Maximum and current mana points (mana) of the character. */
    private double mana, maxMana;

    /** Base speed of the character. */
    private final double baseSpeed;

    /** Current and maximum speed of the character. */
    private double speed, maxSpeed;


    /** Equipped items: main hand, sub hand, amulet, ring, and earring. */
    MainWeapon mainHand;
    SubWeapon subHand;
    Amulet amulet;
    Ring ring;
    Earring earring;

    /**
     * Initializes a new BaseCharacter with the provided values.
     *
     * @param name      name of the character.
     * @param level     level of the character.
     * @param maxHp     maximum hit points of the character.
     * @param maxMana   maximum mana points of the character.
     * @param baseSpeed base speed of the character.
     */
    BaseCharacter(String name, int level, double maxHp, double maxMana, double baseSpeed){
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.maxMana = maxMana;
        this.mana = maxMana;
        this.baseSpeed = baseSpeed;
        this.maxSpeed = baseSpeed + (1.5 * (level - 1));
        this.speed = this.maxSpeed;
        mainHand  = null;
        subHand = null;
        amulet = null;
        ring = null;
        earring = null;
    }

    /**
     * Displays the character's stats, including level, hp, maxHp, mana, maxMana, baseSpeed, speed, and maxSpeed.
     */
    public void showStats() {
        System.out.println("Level : " + level);
        System.out.println("Hp : " + hp + " / " + maxHp);
        System.out.println("Mana : " + mana + " / " + maxMana);
        System.out.println("Speed" + "(Base " + baseSpeed + ") : " + speed + " / " + maxSpeed );
    }

    /**
     * Retrieves name of the character.
     *
     * @return name of the character.
     */
    public String getName(){
        return name;
    }

    /**
     * Retrieves level of the character.
     *
     * @return level of the character.
     */
    public int getLevel(){
        return level;
    }

    /**
     * Levels up the character, increasing level, hp, maxHp, mana, maxMana, maxSpeed, and speed.
     */
    public void levelUp(){
        level++;
        maxHp += 10;
        hp += 10;
        maxMana += 5;
        mana += 5;
        maxSpeed += 1.5;
        speed += 1.5;
        System.out.println(name + " level Up!");
    }

    /**
     * Equips the provided accessory to the character.
     *
     * @param accessory accessory to be equipped.
     */
    public void equipAccessory(Accessory accessory){
        if(accessory instanceof Amulet){
            amulet = (Amulet) accessory;
            System.out.println("Equipped Amulet : " + accessory.getName());
        }else if(accessory instanceof  Ring) {
            ring = (Ring) accessory;
            System.out.println("Equipped Ring : " + accessory.getName());
        }else if(accessory instanceof Earring){
            earring = (Earring) accessory;
            System.out.println("Equipped Earring : " + accessory.getName());
        }
    }

    /**
     * Equips the provided equipment to the character.
     *
     * @param equipment equipment to be equipped.
     */
    public void equipEquipment(Equipment equipment){
        if(equipment instanceof MainWeapon){
            mainHand = (MainWeapon) equipment;
            System.out.println("Equipped Main Weapon : " + equipment.getName());
        }else if(equipment instanceof  SubWeapon) {
            subHand = (SubWeapon) equipment;
            System.out.println("Equipped Sub Weapon : " + equipment.getName());
        }
    }

    /**
     * Retrieves an array of equipped accessories.
     *
     * @return An array of equipped accessories.
     */
    public Accessory[] getEquippedAccessory(){
        Accessory[] accArr = new Accessory[3];
        accArr[0] = amulet;
        accArr[1] = ring;
        accArr[2] = earring;
        return accArr;
    }

    /**
     * Retrieves an array of equipped equipment.
     *
     * @return An array of equipped equipment.
     */
    public Equipment[] getEquippedEquipment(){
        Equipment[] eqmArr = new Equipment[2];
        eqmArr[0] = mainHand;
        eqmArr[1] = subHand;
        return eqmArr;
    }
}

/**
 * WarriorCharacter class represents a character of type Warrior, extending the BaseCharacter class.
 * Provides a constructor to initialize the warrior character with specific values.
 */
class WarriorCharacter extends BaseCharacter implements Warrior{

    /**
     * Initializes a new WarriorCharacter with name and the initial base stats of a warrior job at level 1.
     *
     * @param name name of the warrior character.
     */
    WarriorCharacter(String name){
        super(name,1,150,25,100);
    }

    /**
     * Performs a Slash ability.
     */
    public void slash() {
        System.out.println(getName() + " using Slash !!");
    }

    /**
     * Performs a Block ability.
     */
    public void block() {
        System.out.println(getName() + " using Block");
    }

    /**
     * Overrides the equipEquipment method to allow only Sword and Shield for warriors.
     *
     * @param equipment equipment to be equipped.
     */
    @Override
    public void equipEquipment(Equipment equipment) {
        if(equipment instanceof Sword || equipment instanceof Shield){
            super.equipEquipment(equipment);
        }else {
            System.out.println("Warrior can equip only Sword&Shield");
        }
    }
}

/**
 * MageCharacter class represents a character of type Mage, extending the BaseCharacter class.
 * Provides a constructor to initialize the mage character with specific values.
 */
class MageCharacter extends  BaseCharacter implements  Mage{

    /**
     * Initializes a new MageCharacter with name and the initial base stats of a mage job at level 1.
     *
     * @param name name of the mage character.
     */
    MageCharacter(String name) {
        super(name, 1, 50, 125, 80);
    }

    /**
     * Performs a Cast Spell ability.
     */
    public void castSpell() {
        System.out.println(getName() + " using Cast Spell !!");
    }

    /**
     * Performs a Teleport ability.
     */
    public void teleport() {
        System.out.println(getName() + " using Teleport ");
    }

    /**
     * Overrides the equipEquipment method to allow only Staff and Charm for mages.
     *
     * @param equipment equipment to be equipped.
     */
    @Override
    public void equipEquipment(Equipment equipment) {
        if(equipment instanceof Staff || equipment instanceof Charm){
            super.equipEquipment(equipment);
        }else {
            System.out.println("Mage can equip only Staff&Charm");
        }
    }
}

/**
 * ArcherCharacter class represents a character of type Archer, extending the BaseCharacter class.
 * Provides a constructor to initialize the archer character with specific values.
 */
class ArcherCharacter extends BaseCharacter implements  Archer{

    /**
     * Initializes a new ArcherCharacter with name and the initial base stats of an archer job at level 1.
     *
     * @param name name of the archer character.
     */
    ArcherCharacter(String name) {
        super(name, 1,100, 75, 150);
    }

    /**
     * Performs a Shot ability.
     */
    public void shot() {
        System.out.println(getName() + " using Shot !!");
    }

    /**
     * Performs a Dodge ability.
     */
    public void dodge() {
        System.out.println(getName() + " using Dodge");
    }

    /**
     * Overrides the equipEquipment method to allow only Bow and Dagger for archers.
     *
     * @param equipment equipment to be equipped.
     */
    @Override
    public void equipEquipment(Equipment equipment) {
        if(equipment instanceof Bow || equipment instanceof Dagger){
            super.equipEquipment(equipment);
        }else {
            System.out.println("Archer can equip only Bow&Dagger");
        }
    }
}
