package com.jiaxin.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author gong.jiaxin
 * @since 2018/9/12 22:58
 */
@RestController
public class TestController {

    @RequestMapping(path = "/")
    public Object sayHello() {
        return "hello:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
