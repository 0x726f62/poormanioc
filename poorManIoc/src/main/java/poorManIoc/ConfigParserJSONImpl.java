/**
 * 
 */
package poorManIoc;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author robert.jakes
 *
 */
public class ConfigParserJSONImpl implements IConfigParser{
	private String configFile;
	
	public ConfigParserJSONImpl(String configFile) {
		this.configFile = configFile;
	}
	
	public Map<Class<?>, ClassMapper> parse() {
		String content;
		List<ClassMapper> mappedClassList;
		Map<Class<?>, ClassMapper> mappedClasses = new HashMap<Class<?>, ClassMapper>();
		ObjectMapper oMapper = new ObjectMapper();
		Path path = FileSystems.getDefault().getPath(configFile);
		
		try {
			content = Files.lines(path).toString();
			mappedClassList = oMapper.readValue(content, oMapper
					.getTypeFactory()
					.constructCollectionType(List.class, ClassMapper.class));
			
			for (ClassMapper mappedClass : mappedClassList) {
				Class<?> clazzInterface = Class.forName(mappedClass.getInterface());				
				mappedClasses.put(clazzInterface, mappedClass);
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return mappedClasses;
	}

}
