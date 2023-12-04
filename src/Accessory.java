/**
 * Accessory interface represents an accessory that can be equipped by a character.
 * Defines methods to retrieve the accessory's name, effect type, and effect value.
 * Provides a default method to display the accessory's stats.
 */
public interface Accessory {

      /**
       * Retrieves name of the accessory.
       *
       * @return name of the accessory.
       */
      String getName();

      /**
       * Retrieves a type of effect provided by the accessory.
       *
       * @return type of effect provided by the accessory.
       */
      String getEffectType();

      /**
       * Retrieves value of the accessory's effect.
       *
       * @return value of the accessory's effect.
       */
      double getEffectValue();

      /**
       * Displays the accessory's stats, including name, effect, and value of the effect in percent to the console.
       */
      default void showStats(){
            System.out.println("Name : " + getName());
            System.out.println("Effect : " + getEffectType() + " " + getEffectValue() * 100 + "%");
      }
}


/**
 * The BaseAccessory abstract class provides a base implementation of the
 * Accessory interface. Includes attributes for the accessory's name, effect type, and effect value. The constructor initializes these attributes.
 */
abstract class BaseAccessory implements Accessory{

      /** Name of the accessory. */
      String name;

      /** Type of effect provided by the accessory. */
      String effectType;

      /** Value of the accessory's effect. */
      double effectValue;

      /**
       * Initialize a new BaseAccessory with the provided values.
       *
       * @param name        name of the accessory.
       * @param effectType  type of effect provided by the accessory.
       * @param effectValue value of the accessory's effect.
       */
      BaseAccessory(String name , String effectType , double effectValue){
            this.name = name ;
            this.effectType = effectType;
            this.effectValue = effectValue;
      }

      /**
       * Retrieves name of the accessory.
       *
       * @return name of the accessory.
       */
      public String getName() {
            return name;
      }

      /**
       * Retrieves value of the accessory's effect.
       *
       * @return value of the accessory's effect.
       */
      public String getEffectType() {
            return effectType;
      }

      /**
       * Retrieves value of the accessory's effect.
       *
       * @return value of the accessory's effect.
       */
      public double getEffectValue() {
            return effectValue;
      }
}

/**
 * Ring class represents a ring accessory, extending the BaseAccessory class.
 * Provides a constructor to initialize the ring with specific values.
 */
class Amulet extends BaseAccessory{

      /**
       * Initializes a new Amulet with the provided values.
       *
       * @param name        name of the amulet.
       * @param effectType  type of effect provided by the amulet.
       * @param effectValue value of the amulet's effect.
       */
      Amulet(String name, String effectType, double effectValue) {
            super(name, effectType, effectValue);
      }

}

/**
 * Ring class represents a ring accessory, extending the BaseAccessory class.
 * Provides a constructor to initialize the ring with specific values.
 */
class Ring extends BaseAccessory{

      /**
       * Initializes a new Ring with the provided values.
       *
       * @param name        name of the ring.
       * @param effectType  type of effect provided by the ring.
       * @param effectValue value of the ring's effect.
       */
      Ring(String name, String effectType, double effectValue) {
            super(name, effectType, effectValue);
      }
}

/**
 * Earring class represents an earring accessory, extending the BaseAccessory class.
 * Provides a constructor to initialize the earring with specific values.
 */
class Earring extends BaseAccessory{

      /**
       * Initializes a new Earring with the provided values.
       *
       * @param name        name of the earring.
       * @param effectType  type of effect provided by the earring.
       * @param effectValue value of the earring's effect.
       */
      Earring(String name, String effectType, double effectValue) {
            super(name, effectType, effectValue);
      }
}