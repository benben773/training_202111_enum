package com.tdd.service;

import com.tdd.bo.PackageConfige;
import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author ：ls05
 * @date ：Created in 2021/11/23 7:26
 */
public class EnumGeneratorTest {
    @Test
    public void should_gererator_file() {
        String outPutFilePath = "C:\\Users\\lis\\Documents\\123\\PayMethod.java";
        EnumGenerator enumGenerator = new EnumGenerator("C:\\Users\\lis\\Documents\\123\\payMethod.txt", outPutFilePath);
        enumGenerator.execute( new PackageConfige("com.tdd","PayMetnod","注解","lis"));
        assertThat(new File(outPutFilePath).exists()).isEqualTo(true);
//        assertThat(new File(outPutFilePath).delete()).isEqualTo(true);

    }

}
