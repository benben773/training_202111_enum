package com.tdd.service;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.config.ConstVal;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Properties;

public class TemplateEngine {
    private final EnumGenerator enumGenerator;
    private VelocityEngine velocityEngine;
    public TemplateEngine(EnumGenerator enumGenerator) {
        this.enumGenerator = enumGenerator;
    }

    public class EnumBody {
        private String enumFildName;
        private String enumValue;
        private String desc;

        public EnumBody(String enumFildName, String enumValue, String desc) {
            this.enumFildName = enumFildName;
            this.enumValue = enumValue;
            this.desc = desc;
        }

        public String getEnumFildName() {
            return enumFildName;
        }

        public String getEnumValue() {
            return enumValue;
        }

        public String getDesc() {
            return desc;
        }
    }
    public void execute() {

        StringWriter sw = new StringWriter();

        Template template = this.init().getTemplate("temple\\service.java.vm");
        VelocityContext context = new VelocityContext();

        context.put( "package", "com.tdd" );
        context.put( "className", "NewEnum" );
        context.put( "date",  LocalDate.now().toString());
        context.put( "comment", "注释");
        context.put( "author", "lis");
        context.put( "enums", Arrays.asList(new EnumBody("AliPay","1","支付宝"),new EnumBody("WeChatPay","2","微信支付")) );
        context.put( "fileAnnotation", Arrays.asList("AliPay,weChatPay".split(",")) );
        template.merge( context, sw );
        try(FileWriter fw = new FileWriter(enumGenerator.getOutPutFilePath())){
            fw.write(sw.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private VelocityEngine init() {
        Properties p = new Properties();
        p.setProperty(ConstVal.VM_LOAD_PATH_KEY, ConstVal.VM_LOAD_PATH_VALUE);
        p.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, StringPool.EMPTY);
        p.setProperty(Velocity.ENCODING_DEFAULT, ConstVal.UTF8);
        p.setProperty(Velocity.INPUT_ENCODING, ConstVal.UTF8);
        p.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        p.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        p.setProperty("file.resource.loader.unicode", StringPool.TRUE);
        velocityEngine = new VelocityEngine(p);
        return velocityEngine;
    }
}