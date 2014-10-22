package com.gradeadminsystrem.util;

import java.util.HashMap;
import java.util.Map;

public class CollectionUtil{
	public static  <k,v>Map<k, v> newInstance(){
		return new HashMap<k, v>();
	}
}