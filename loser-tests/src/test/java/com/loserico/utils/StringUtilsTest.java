package com.loserico.utils;

import static java.util.Arrays.asList;

import java.util.List;

import org.junit.Test;

import com.loserico.commons.utils.StringUtils;

public class StringUtilsTest {

	@Test
	public void testEndWith() {
		List<String> strs = asList("asd", "ddd ", "cc dd cc d");
		strs.forEach((str) -> {
			System.out.println(StringUtils.endWith(str, null));
		});
	}
	
	@Test
	public void testSubStr() {
		String s = "aaaaaaaaaassssssssssssdddxasdf-09asd";
//		System.out.println(StringUtils.subStr(s, -1));
//		System.out.println(StringUtils.subStr(s, -3));
//		System.out.println(StringUtils.subStr(s, -2, 0));
//		System.out.println(StringUtils.subStr(s, 2, 0));
		System.out.println(StringUtils.subStr(s, 0, -1));
	}
	
	@Test
	public void testUniqueKey() {
		for (int i = 0; i < 11; i++) {
			System.out.println(StringUtils.uniqueKey(50));
		}
	}
}
