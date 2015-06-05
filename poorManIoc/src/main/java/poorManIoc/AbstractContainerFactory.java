/**
 * 
 */
package poorManIoc;

/**
 * @author robert.jakes
 *
 */
public abstract class AbstractContainerFactory {
	
	public static AbstractContainerFactory getContainerFactory( boolean classesHasParameterlessCtor) {
		AbstractContainerFactory factory;
		
		if (classesHasParameterlessCtor) {
			factory = new ContainerFactoryParamLessCtorsClasses();
		} else {
			factory = null;
		}
		
		return factory;
	}
	
	public abstract IContainer getContainer();
	
	
}
