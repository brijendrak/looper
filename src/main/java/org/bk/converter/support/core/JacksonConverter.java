/**
 * 
 */
package org.bk.converter.support.core;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author Brijendra Kumar
 *
 */
public interface JacksonConverter {
	
	public static String toJson(Object payload) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(payload);
	}

}
