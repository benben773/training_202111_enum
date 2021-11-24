package com.tdd.util;

import com.tdd.bo.EnumsConfige;
import com.tdd.bo.PackageConfige;
import org.apache.velocity.VelocityContext;
import org.junit.Assert;
import org.junit.Test;

public class VelocityContextUtilTest {

    @Test
    public void testGenerateConfigContext() {
        PackageConfige packageConfig = new PackageConfige("com.tdd","PayMetnod","注解","lis");
        EnumsConfige enumsConfig = new EnumsConfige();
        VelocityContext result = VelocityContextUtil.generateConfigContext(packageConfig, enumsConfig);
        Assert.assertEquals(result.get("package"), "com.tdd");
    }
}
