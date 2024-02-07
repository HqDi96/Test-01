package dev.hadi.manager;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.plugin.java.JavaPlugin;

import dev.hadi.ClassType;
import dev.hadi.Registerable;

public class ClassManager extends JavaPlugin {
    private final Map<ClassType, Registerable> registeredClasses = new HashMap<>();

    public void registerClass(ClassType classType, Registerable registerable) {
        registeredClasses.put(classType, registerable);
    }

    public void executeClass(ClassType classType) {
        if (registeredClasses.containsKey(classType)) {
            Registerable registerable = registeredClasses.get(classType);
            registerable.execute();
        } else {
            getLogger().warning("Class not found for type: " + classType);
        }
    }
}
