/**
 * FileName: notepad
 * Author: nicole
 * Date: 2019/6/19 19:36
 * Description:
 */

package com.nicole;/*
 * author: nicole
 * date: 2019/6/19
 * desc:
 */

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad {

}
