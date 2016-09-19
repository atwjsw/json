package com.imooc.json.json;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.json.JSONArray;

public class ReadJSONSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File(ReadJSONSample.class.getResource("/wangxiaoer.json").getFile());
		String content = FileUtils.readFileToString(file);
		JSONObject jsonObject =  new JSONObject(content);
		System.out.println(jsonObject.getString("name"));
		System.out.println(jsonObject.getDouble("age"));
		System.out.println(jsonObject.getBoolean("has_girlfriend"));
		JSONArray jsonArray = jsonObject.getJSONArray("major");
		for (Object object: jsonArray) {
			System.out.println(object);
		}		
	}

}
