package com.nancheung.gitproxy.api.git.common.exception.enums;

import com.nancheung.gitproxy.common.core.exception.enums.interfaces.ClientExceptionIEnum;
import lombok.AllArgsConstructor;

/**
 * Git异常枚举
 *
 * @author NanCheung
 */
@AllArgsConstructor
public enum GitExceptionEnum implements ClientExceptionIEnum {
    GIT_ERROR("0200", "Git操作失败"),
    GIT_DOWNLOAD_THREAD_POOL_FULL("0201", "Git下载线程池满");
    
    private final String number;
    private final String message;
    
    @Override
    public String number() {
        return number;
    }
    
    @Override
    public String message() {
        return message;
    }
}
