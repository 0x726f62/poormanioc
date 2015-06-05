/**
 * 
 */
package poorManIoc;

/**
 * @author robert.jakes
 *
 */
public interface IContainer {
	public <T> T getInstance(Class<T> classInterface) throws Exception;
	public void loadConfiguration(IConfigParser configParser) throws Exception;
}
