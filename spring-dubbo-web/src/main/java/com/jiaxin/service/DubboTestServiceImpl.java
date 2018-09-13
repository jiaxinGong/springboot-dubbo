package com.jiaxin.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiaxin.api.IDubboTestService;

/**
 * <p>
 *
 * </p>
 *
 * @author gong.jiaxin
 * @since 2018/9/12 23:10
 */
@Service
public class DubboTestServiceImpl implements IDubboTestService {

    @Override
    public String tellMe(String msg) {
        return "service-msg:" + msg;
    }
}
