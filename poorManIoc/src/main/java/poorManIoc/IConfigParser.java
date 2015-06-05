/**
 * 
 */
package poorManIoc;

import java.util.Map;

/**
 * @author robert.jakes
 *
 */
public interface IConfigParser {
	Map<Class<?>, ClassMapper> parse();
}
