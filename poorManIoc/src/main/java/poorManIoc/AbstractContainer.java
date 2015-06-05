/**
 * 
 */
package poorManIoc;

import java.util.Map;

/**
 * @author robert.jakes
 *
 */
public abstract class AbstractContainer implements IContainer {
	protected boolean configLoaded = false;
	protected Map<Class<?>, ClassMapper> mappedClasses;
	
	public void loadConfiguration(IConfigParser configParser)  {
		configLoaded = true;
		mappedClasses = configParser.parse();
	}

}
