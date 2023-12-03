/**
 * Job interface represents a jobs in a role-play game.
 * Extends the RPGCharacter interface and adds methods to retrieve the job name and an array of all abilities associated with the job.
 * Provides a default method to display all abilities of the job.
 */
public interface Job extends RPGCharacter{

    /**
     * Retrieves job name.
     *
     * @return job name.
     */
    String getJobName();

    /**
     * Retrieves an array of all abilities associated with the job.
     *
     * @return An array of all abilities.
     */
    String[] getAllAbility();

    /**
     * Displays all abilities of the job to the console.
     */
    default void showAllAbilities() {
        System.out.println("Job : " + getJobName());
        System.out.println("Abilities : ");
        for (String ability : getAllAbility()) {
            System.out.print(getJobName() + " ");
        }
    }
}

/**
 * Warrior interface represents a warrior job in a role-play game.
 * Extends the Job interface and adds specific methods for warrior abilities.
 * IProvides default implementations for the job name and all abilities.
 */
interface Warrior extends Job{

    /**
     * Performs a Slash ability.
     */
    void slash();

    /**
     * Performs a Block ability.
     */
    void block();

    /**
     * Retrieves job name for warriors.
     *
     * @return string "Warrior".
     */
    default String getJobName() {
        return "Warrior";
    }

    /**
     * Retrieves a string array of all abilities for warriors.
     *
     * @return A string array of all abilities for warriors.
     */
    default String[] getAllAbility(){
        return new String[]{"Slash", "Black"};
    }

}
interface Mage extends  Job{

    /**
     * Performs a Cast Spell ability.
     */
    void castSpell();

    /**
     * Performs a Teleport ability.
     */
    void teleport();

    /**
     * Retrieves job name for mages.
     *
     * @return string "Mage".
     */
    default String getJobName() {
        return "Mage";
    }

    /**
     * Retrieves a string array of all abilities for mages.
     *
     * @return A string array of all abilities for mages.
     */
    default String[] getAllAbility(){
        return new String[]{"Cast Spell", "Teleport"};
    }
}
interface Archer extends  Job{

    /**
     * Performs a Shot ability.
     */
    void shot();

    /**
     * Performs a Dodge ability.
     */
    void dodge();

    /**
     * Retrieves job name for archers.
     *
     * @return string "Archer".
     */
    default String getJobName() {
        return "Archer";
    }

    /**
     * Retrieves a string array of all abilities for archers.
     *
     * @return A string array of all abilities for archers.
     */
    default String[] getAllAbility(){
        return new String[]{"Shot", "Dodge"};
    }
}