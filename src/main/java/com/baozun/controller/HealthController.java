package com.baozun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot
 * @Package: com.baozun.controller
 * @ClassName: HealthController
 * @Author: wwn
 * @Description: this is health controller
 * @Date: 2020/6/5 22:25
 * @Version: 1.0
 */
@RestController
public class HealthController {

  @GetMapping("/health/{str}")
  public String getHealth(@PathVariable("str")String str ) {
    return str;
  }
}
