package com.tdd.service;


/**
 * @author ：ls05
 * @date ：Created in 2021/11/23 7:36
 */
public class EnumGenerator {

    private final TemplateEngine templateEngine = new TemplateEngine(this);
    private String inputFile;
    private String outPutFilePath;

    public EnumGenerator(String inputFile, String outPutFilePath) {
        this.inputFile = inputFile;
        this.outPutFilePath = outPutFilePath;
    }

    public void execute() {

        templateEngine.execute();
    }

    public String getInputFile() {
        return inputFile;
    }

    public String getOutPutFilePath() {
        return outPutFilePath;
    }
}
