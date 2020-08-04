package com.cloud.alibaba.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/7/2 11:00 下午
 */
public class Myhandler {

   public static String handlerException(BlockException blockException){
     return "handlerException";
   }

  public static String handlerException2(BlockException blockException){
    return "handlerException2";
  }


}
