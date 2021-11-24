package com.tdd.bo;

/**
 * @author ：ls05
 * @date ：Created in 2021/11/24 13:17
 */
public class PackageConfige {
    public String packageNam;
    public String className;
    public String comment;
    public String author;

    public PackageConfige(String packageNam, String className,  String comment, String author) {
        this.packageNam = packageNam;
        this.className = className;
        this.comment = comment;
        this.author = author;
    }

    public String getPackageNam() {
        return packageNam;
    }

    public String getClassName() {
        return className;
    }

    public String getComment() {
        return comment;
    }

    public String getAuthor() {
        return author;
    }
}
