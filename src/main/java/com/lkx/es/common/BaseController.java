package com.lkx.es.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee Cather
 * @date 2018-08-21 11:43
 * desc : controller基类
 */
@RestController
@ResponseBody
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
