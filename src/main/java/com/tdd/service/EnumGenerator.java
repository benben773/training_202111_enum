package com.tdd.service;


import com.tdd.bo.EnumsConfige;
import com.tdd.bo.PackageConfige;

/**
 * @author ：ls05
 * @date ：Created in 2021/11/23 7:36
 */
public class EnumGenerator {

    private final TemplateEngine templateEngine = new TemplateEngine(this);
    private String inputFile;
    private String outPutFilePath;
    private PackageConfige packageConfige;
    private EnumsConfige enumsConfige;

    public EnumGenerator(String inputFile, String outPutFilePath) {
        this.inputFile = inputFile;
        this.outPutFilePath = outPutFilePath;
    }

    public void execute(PackageConfige packageConfige) {
        this.packageConfige = packageConfige;
        this.enumsConfige = new EnumsConfige();
        templateEngine.execute();
    }

    public String getInputFile() {
        return inputFile;
    }

    public String getOutPutFilePath() {
        return outPutFilePath;
    }

    public PackageConfige getPackageConfige() {
        return packageConfige;
    }

    public EnumsConfige getEnumsConfige() {
        return enumsConfige;
    }
}
