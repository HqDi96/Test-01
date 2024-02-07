package dev.hadi;

import org.bukkit.plugin.java.JavaPlugin;

import dev.hadi.manager.ClassManager;
import dev.hadi.workmaybe.TestClass;
import lombok.Getter;
import lombok.Setter;

public class PVPPlugin extends JavaPlugin{
	
	@Getter @Setter
	private ClassManager classManager;

	@java.lang.Override
	public void onEnable() {
		TestClass testClass = new TestClass();

        ClassManager classManager = new ClassManager();
        
        classManager.registerClass(ClassType.TEST_CLASS, testClass);
        
        classManager.executeClass(ClassType.TEST_CLASS);




}
	
	@java.lang.Override
	public void onDisable() {
		
	}
}
