package com.tdd.util;

import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.tdd.bo.EnumBody;
import com.tdd.bo.EnumsConfige;
import com.tdd.bo.PackageConfige;
import org.apache.velocity.VelocityContext;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @author ：ls05
 * @date ：Created in 2021/11/24 13:12
 */
public class VelocityContextUtil {
    public static VelocityContext generateConfigContext(PackageConfige packageConfig, EnumsConfige enumsConfig ) {
        VelocityContext context = new VelocityContext();
        context.put( "package", "com.tdd" );
        context.put( "className", "NewEnum" );
        context.put( "date",  LocalDate.now().toString());
        context.put( "comment", "注释");
        context.put( "author", "lis");

        context.put( "enums", Arrays.asList(new EnumBody("AliPay","1","支付宝"),new EnumBody("WeChatPay","2","微信支付")) );
        return context;
    }
}
