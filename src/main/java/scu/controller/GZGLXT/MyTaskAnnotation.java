/**
 * @date 2014年5月6日
 * @author huangjie
 */
package scu.controller.GZGLXT;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 基于注解的定时器
 * @author hj
 */
@Component
public class MyTaskAnnotation {
	
	/** 
     * 定时计算。每天凌晨 01:00 执行一次 
     */  
    @Scheduled(cron = "0 * * * * ?")
	public void show(){
		//System.out.println("Annotation：is show run");
	}
	
    /** 
     * 心跳更新。启动时执行一次，之后每隔2秒执行一次 
     */  
    @Scheduled(fixedRate = 1000*2) 
	public void print(){
		//System.out.println("Annotation：print run");
	}
}