/**
 * 
 */
package org.bk.converter.support;

import java.io.IOException;

import org.bk.converter.support.core.JacksonConverter;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

/**
 * @author Brijendra Kumar
 *
 */
public interface ConversionSupport {
	default public String toJson() throws JsonGenerationException, JsonMappingException, IOException {
		return JacksonConverter.toJson(this);
	}

}
