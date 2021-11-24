package com.tdd.service;

import org.junit.Test;

import javax.servlet.FilterConfig;
import java.io.File;

import static org.assertj.core.api.Assertions.*;
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
        enumGenerator.execute();
        assertThat(new File(outPutFilePath).exists()).isEqualTo(true);
//        assertThat(new File(outPutFilePath).delete()).isEqualTo(true);

    }

}
