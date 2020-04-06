package com.spike.microservice.commons.data.mybatis.gen;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * MyBatis生成器工具.
 */
public class MyBatisGeneratorMain {

  public static void main(String[] args) {
    try {
      List<String> warnings = new ArrayList<String>();
      boolean overwrite = true;
      File configFile = new File("src/test/resources/generatorConfig.xml");
      ConfigurationParser cp = new ConfigurationParser(warnings);
      Configuration config = cp.parseConfiguration(configFile);
      DefaultShellCallback callback = new DefaultShellCallback(overwrite);
      MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
      myBatisGenerator.generate(null);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}