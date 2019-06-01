package com.meechiboo.velocitydemo.test;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author: <a href="mailto:wb-lzl282164@alibaba-inc.com">李智龙</a>
 * @date: 2018/3/28
 */
public class HelloVelocity {
    public static void main(String[] args) {
        VelocityEngine ve = new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        ve.init();
        // 载入（获取）模板对象
        Template t = ve.getTemplate("vm/hello.vm");
        VelocityContext ctx = new VelocityContext();
        // 域对象加入参数值
        Model model=new Model();
        JSONObject json
                = (JSONObject) JSONObject.toJSON(model);
        String table="table";
        ctx.put(table, json);
        ctx.put("utils",new Utils());
//        ctx.put("date", (new Date()).toString());
//        // list集合
//        List temp = new ArrayList();
//        temp.add("1");
//        temp.add("2");
//        ctx.put("list", temp);
//
        PrintWriter writer = null;
        try {
           // writer = new PrintWriter("C:\\Users\\Administrator\\Desktop\\x\\hello.txt");
            writer = new PrintWriter(String.format("C:\\Users\\Administrator\\Desktop\\x\\%s.txt", table));
            t.merge(ctx, writer);
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
