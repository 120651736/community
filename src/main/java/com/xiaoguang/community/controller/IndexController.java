/**
 * Copyright (C), 2019-2019
 * FileName: IndexController
 * Author:   xiaoguang
 * Date:     2019/11/26 9:04 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xiaoguang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈〉
 * @ClassName IndexController
 * @author xiaoguang
 * @Date 2019/11/26 9:04 PM 
 * @since 1.0.0
 */
@Controller
@RequestMapping()
public class IndexController {

	@GetMapping("/")
	public String index(){
		return "index";
	}
}