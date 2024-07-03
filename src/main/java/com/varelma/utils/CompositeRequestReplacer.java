package com.varelma.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompositeRequestReplacer {

	public static String transform(String payload, Object vars) throws Exception {
		//System.out.println();

		String regex = "@\\{[\\w\\.]+\\}";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Matcher m = p.matcher(payload);

		// Check for subsequences of input that match the compiled pattern
		while (m.find()) {
			String key = m.group(0).replace("@{", "").replace(".id}", "");
			String mapref = "refs.value." + key;

			String value = BeanUtils.getNestedPropertyValue(vars, mapref);
			if(!"".equals(value)) {
				payload = payload.replace(m.group(0), value);
			}
		}

		return payload;
	}

}
