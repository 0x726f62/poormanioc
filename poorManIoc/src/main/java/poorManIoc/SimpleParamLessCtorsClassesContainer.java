/**
 * 
 */
package poorManIoc;

/**
 * @author robert.jakes
 *
 */
public class SimpleParamLessCtorsClassesContainer extends AbstractContainer {

	@SuppressWarnings("unchecked")
	public <T> T getInstance(Class<T> classInterface) throws Exception {
		//TODO create custom exception
		if (! this.configLoaded) throw new Exception(); 
		
		T clazzImplInstance;
		
		ClassMapper clazzmap = mappedClasses.get(classInterface);
		//TODO Checknout jak se to chova
		// Podezrivam, ze Class<T>, respektive generika s T by tam nemela byt
		Class<T> ImplClazz = (Class<T>) Class.forName(clazzmap.getImplementationClass());	
		clazzImplInstance = (T) ImplClazz.newInstance();
		return clazzImplInstance;
	}

}
