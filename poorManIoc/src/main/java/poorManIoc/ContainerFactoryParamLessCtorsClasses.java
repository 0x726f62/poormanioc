/**
 * 
 */
package poorManIoc;

/**
 * @author robert.jakes
 *
 */
public class ContainerFactoryParamLessCtorsClasses extends
		AbstractContainerFactory {

	@Override
	public IContainer getContainer() {
		return new SimpleParamLessCtorsClassesContainer();
	}

}
