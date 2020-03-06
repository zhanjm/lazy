package com.lazy.admin.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class KaptchaConfig  {

    @Bean
    public DefaultKaptcha defaultKaptcha(){
        com.google.code.kaptcha.impl.DefaultKaptcha defaultKaptcha = new com.google.code.kaptcha.impl.DefaultKaptcha();
        Properties properties = new Properties();
        properties.setProperty("kaptcha.border", "no");  // 图片边框
        properties.setProperty("kaptcha.border.color", "105,179,90"); // 边框颜色
        properties.setProperty("kaptcha.textproducer.font.color", "red"); // 字体颜色
        properties.setProperty("kaptcha.image.width", "110");  // 图片宽
        properties.setProperty("kaptcha.image.height", "40"); // 图片高
        properties.setProperty("kaptcha.textproducer.font.size", "30");  // 字体大小
        properties.setProperty("kaptcha.session.key", "code"); // session key
        properties.setProperty("kaptcha.textproducer.char.length", "4"); // 验证码长度
        properties.setProperty("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑"); // 字体
        properties.setProperty("kaptcha.obscurificator.impl", "com.google.code.kaptcha.impl.ShadowGimpy");
        properties.setProperty("kaptcha.noise.impl", "com.google.code.kaptcha.impl.DefaultNoise");
        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
