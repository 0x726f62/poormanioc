/**
 * 
 */
package poorManIoc;

/**
 * @author robert.jakes
 *
 */
public class ClassMapper {
	private String implementationClass;
	private String implementationInterface;
	
	public String getInterface() {
		return this.implementationInterface;
	}
	
	public void setInterface(String implementationInterface) {
		this.implementationInterface = implementationInterface;
	}
	
	public String getImplementationClass() {
		return this.implementationClass;
	}
	
	public void setImplementationClass(String implementationClass) {
		this.implementationClass = implementationClass;
	}

}
