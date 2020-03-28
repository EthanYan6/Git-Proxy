package com.nancheung.gitproxy.task;

import com.nancheung.gitproxy.GitProxyProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 任务自动配置类
 *
 * @author : NanCheung
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(GitProxyProperties.class)
public class TaskAutoConfiguration {
    
    /**
     * 初始化任务
     *
     * @param gitProxyProperties 系统配置
     * @return 初始化执行器
     */
    @Bean
    public InitCommandLineRunner initDirCommandLineRunner(GitProxyProperties gitProxyProperties) {
        return new InitCommandLineRunner(gitProxyProperties);
    }
    
    /**
     * 清理文件任务
     *
     * @param gitProxyProperties 系统配置
     * @return 清理文件执行器
     */
    @Bean
    public CleanFileCommandLineRunner cleanCommandLineRunner(GitProxyProperties gitProxyProperties) {
        return new CleanFileCommandLineRunner(gitProxyProperties);
    }
}
