package com.mom.shop.mbg;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableField;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;

import java.util.Collections;


/**
 * @author Clozer
 * @date 2022/3/26 2:08 PM
 */
public class CodeGenerator {

    final static String[] STRINGS = {"attribute","brand","category","daily_income","operation","order_info","product","sku"};

    public static void main(String[] args) {
        FastAutoGenerator.create(new DataSourceConfig
                        .Builder("jdbc:mysql://101.43.3.244:3306/mom_shop?serverTimezone=UTC&useUnicode=ture&characterEncoding=utf-8","root","mom_shop123")
                        .keyWordsHandler(new MySqlKeyWordsHandler()).typeConvert(new MySqlTypeConvert()))
                .globalConfig(builder -> {
                    builder.outputDir(System.getProperty("user.dir")+"/src/main/java")
                            .author("Clozer").enableSwagger().dateType(DateType.TIME_PACK)
                            .commentDate("yyyy-MM-dd HH:mm:ss").fileOverride();
                })
                .packageConfig(builder -> {
                    builder.parent("com.mom.shop").entity("mbg.entity").mapper("mbg.mapper")
                            .service("service").serviceImpl("service.impl").controller("controller").
                            other("other")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir") + "/src/main/resources/mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude(STRINGS)
                            .enableCapitalMode().enableSkipView().entityBuilder().enableLombok()
                            .enableTableFieldAnnotation()
                            .logicDeleteColumnName("delete").logicDeletePropertyName("delete")
                            .versionColumnName("version").versionPropertyName("version")
                            .naming(NamingStrategy.underline_to_camel).columnNaming(NamingStrategy.underline_to_camel)
                            .addTableFills(new Column("create_at", FieldFill.INSERT))
                            .addTableFills(new Column("update_at",FieldFill.INSERT_UPDATE))
                            .idType(IdType.AUTO)
                            //.superClass(BaseIdEntity.class)
                            .enableRemoveIsPrefix()
                            //.addSuperEntityColumns("id","update_at","create_at","is_delete")

/*                            .controllerBuilder()
                            .enableHyphenStyle()
                            .enableRestStyle()
                            .formatFileName("%sController")*/

                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .mapperBuilder()
                            .superClass(BaseMapper.class)
                            .enableMapperAnnotation()
                            .enableBaseResultMap()
                            .enableBaseColumnList()
                            .formatMapperFileName("%sMapper");
                })
                .execute();
    }


}
