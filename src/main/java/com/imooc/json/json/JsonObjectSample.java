package com.imooc.json.json;

import java.util.HashMap;

import org.json.JSONObject;

import com.imooc.json.bean.Diaosi;
/**
 * IMOOC JSON
 *
 */
public class JsonObjectSample 
{
    public static void main( String[] args )
    {
//    	jSONObjectSample();
//    	createJsonByMap();
    	createJsonByBean();
    }

	private static void jSONObjectSample() {
		JSONObject wangxiaoer = new JSONObject();			
		Object nullObj = null;
		wangxiaoer.put("name", "王小二");
		wangxiaoer.put("age", 25.2);
		wangxiaoer.put("birthday", "1990-01-01");
		wangxiaoer.put("school", "蓝翔技校");
		wangxiaoer.put("has_girlfriend", false);
		wangxiaoer.put("major", new String[]{"理发","挖掘机"});
		wangxiaoer.put("car", nullObj);
		wangxiaoer.put("hosue", nullObj);	
		wangxiaoer.put("comment", "王小二的介绍");
		System.out.println(wangxiaoer.toString());
	}

	private static void createJsonByMap() {
		HashMap<String, Object> wangxiaoer = new HashMap<String, Object>();
		Object nullObj = null;
		wangxiaoer.put("name", "王小二");
		wangxiaoer.put("age", 25.2);
		wangxiaoer.put("birthday", "1990-01-01");
		wangxiaoer.put("school", "蓝翔技校");
		wangxiaoer.put("has_girlfriend", false);
		wangxiaoer.put("major", new String[]{"理发","挖掘机"});
		wangxiaoer.put("car", nullObj);
		wangxiaoer.put("hosue", nullObj);	
		wangxiaoer.put("comment", "王小二的介绍");
		System.out.println(new JSONObject(wangxiaoer).toString());
	}	


	private static void createJsonByBean() {
		
		Diaosi wangxiaoer = new Diaosi();
		wangxiaoer.setName("王小二");
		wangxiaoer.setAge(25.2);
		wangxiaoer.setBirthday("1990-01-01");
		wangxiaoer.setSchool("蓝翔技校");
		wangxiaoer.setHas_girfriend(false);
		wangxiaoer.setMajor(new String[]{"理发","挖掘机"});
		wangxiaoer.setCar(null);
		wangxiaoer.setHouse(null);	
		wangxiaoer.setComment("王小二的介绍");
		System.out.println(new JSONObject(wangxiaoer).toString());	
	}
}
//{
//	"name": "王小二",
//	"age": 25.2,
//	"birthday": "1990-01-01",
//	"school": "蓝翔技校",
//	"major": ["理发"，"挖掘机"],
//	"has_girlfriend": false,
//	"car" : null,
//	"house" : null,
//	"comment": "王小二的介绍"
//}