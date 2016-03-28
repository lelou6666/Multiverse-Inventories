package com.onarandombox.multiverseinventories.api.profile;

import com.onarandombox.multiverseinventories.api.share.Sharable;
import org.bukkit.OfflinePlayer;

import java.util.Map;

/**
 * Interface for a PlayerProfile which controls all the world/group specific data for a player.
 * This represents what is saved/loaded to/from persistence.
 */
public interface PlayerProfile extends Cloneable {

    /**
     * @return A map containing all the player data to be saved to disk.
     */
    Map<String, Object> serialize();

    /**
     * @return The container type of profile, a group or world.
     */
    ContainerType getContainerType();

    /**
     * @return The name of the container, world or group, containing this profile.
     */
<<<<<<< HEAD
    OfflinePlayer getPlayer();

    /**
     * @return the Contents of the Profile's inventory.
     */
    ItemStack[] getInventoryContents();

    /**
     * Sets the inventory contents for this Profile.
     *
     * @param inventoryContents Inventory contents for this player.
     */
    void setInventoryContents(ItemStack[] inventoryContents);

    /**
     * @return the Contents of the Profile's armor.
     */
    ItemStack[] getArmorContents();

    /**
     * Sets the armor contents for this Profile.
     *
     * @param armorContents Armor contents for this player.
     */
    void setArmorContents(ItemStack[] armorContents);

    /**
     * @return The health of this Profile.
     */
    Integer getHealth();

    /**
     * Sets the health for this Profile.
     *
     * @param health New health for Profile.
     */
    void setHealth(int health);

    /**
     * @return The exp of this Profile.
     */
    Float getExp();

    /**
     * Sets the exp for this Profile.
     *
     * @param exp New exp for Profile.
     */
    void setExp(float exp);
=======
    String getContainerName();
>>>>>>> refs/remotes/Multiverse/master

    /**
     * @return the Player associated with this profile.
     */
<<<<<<< HEAD
    Integer getTotalExperience();

    /**
     * Sets the total exp for this Profile.
     *
     * @param totalExperience exp New total exp for Profile.
     */
    void setTotalExperience(int totalExperience);

    /**
     * @return The level of this Profile.
     */
    Integer getLevel();

    /**
     * Sets the level for this Profile.
     *
     * @param level New level for Profile.
     */
    void setLevel(int level);

    /**
     * @return The food level of this Profile.
     */
    Integer getFoodLevel();

    /**
     * Sets the food level for this Profile.
     *
     * @param foodLevel New food level for Profile.
     */
    void setFoodLevel(int foodLevel);
=======
    OfflinePlayer getPlayer();
>>>>>>> refs/remotes/Multiverse/master

    /**
     * @return The type of profile this object represents.
     */
    ProfileType getProfileType();

    /**
     * Retrieves the profile's value of the {@link Sharable} passed in.
     *
<<<<<<< HEAD
     * @param exhaustion New exhaustion for Profile.
     */
    void setExhaustion(float exhaustion);

    /**
     * @return The saturation of this Profile.
=======
     * @param sharable Represents the key for the data wanted from the profile.
     * @param <T>      This indicates the type of return value to be expected.
     * @return The value of the sharable for this profile.  Null if no value is set.
>>>>>>> refs/remotes/Multiverse/master
     */
    <T> T get(Sharable<T> sharable);

    /**
     * Sets the profile's value for the {@link Sharable} passed in.
     *
<<<<<<< HEAD
     * @param saturation New saturation for Profile.
     */
    void setSaturation(float saturation);

    /**
     * @return The bed spawn location of this Profile.
=======
     * @param sharable Represents the key for the data to store.
     * @param value    The value of the data.
     * @param <T>      The type of value to be expected.
>>>>>>> refs/remotes/Multiverse/master
     */
    <T> void set(Sharable<T> sharable, T value);

<<<<<<< HEAD
    /**
     * Sets the bed spawn location for this Profile.
     *
     * @param location New bed spawn location for Profile.
     */
    void setBedSpawnLocation(Location location);
    
    Float getFallDistance();
    
    void setFallDistance(float fallDistance);
    
    Integer getFireTicks();
    
    void setFireTicks(int fireTicks);
    
    Integer getRemainingAir();

    void setRemainingAir(int remainingAir);
    
    Integer getMaximumAir();

    void setMaximumAir(int maximumAir);
=======
    PlayerProfile clone() throws CloneNotSupportedException;
>>>>>>> refs/remotes/Multiverse/master
}

