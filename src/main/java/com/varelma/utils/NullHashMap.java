package com.varelma.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NullHashMap<K, V> extends HashMap<K, V> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Override
	 public V put(K key, V value) {
		if (value != null) {
			return super.put(key, value);
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void putAll(Map m) {
		Set keyset = m.keySet();
		for (Object key : keyset) {
			Object value = m.get(key);
			if (value != null) {
				put((K)key , (V)value);
			}
		}
	}

}
