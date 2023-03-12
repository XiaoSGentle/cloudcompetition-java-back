package com.xiaos.cloud.db.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.Test;

import java.util.Collections;

public class AutoGenerator {
    static final String URL = "jdbc:mysql://localhost:3306/cloud_competition?serverTimezone=PRC";

//    public static void main(String[] args) {
    @Test
    public void get(){
        String baseAddress = System.getProperty("user.dir");
        FastAutoGenerator.create(URL,"root","root")

                .globalConfig(builder -> builder
                        .outputDir(baseAddress+"/src/main/java")
                        .author("xiaos")
                        .enableSwagger()
                        //.disableOpenDir()
                )
                //生成的class位置
                .packageConfig(builder -> builder
                                .parent("com.xiaos.cloud.db")
                                .pathInfo(Collections.singletonMap(OutputFile.xml,baseAddress+"/src/main/resources/mapper"))
                                .serviceImpl("service.impl")
                                .mapper("mapper")

                )
                //
                .strategyConfig(builder -> builder
                        //去除表名前缀
//                        .addTablePrefix("Cmt","Com","Hs","Qrtz","Sys")
                        //去除service的I
                        .serviceBuilder().formatServiceFileName("%sService")
                )

                .templateEngine(new FreemarkerTemplateEngine())//模板
                .execute();

    }
}
