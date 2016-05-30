package com.sedion.zhe.validator;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.DisposableBean;

import com.alibaba.druid.support.logging.Log;

import sun.tools.tree.ThisExpression;

@Aspect
public class RecordRecord implements DisposableBean{
	
	Logger logger;
	public RecordRecord() {
		System.out.println("使用spring aop");
	}
	@Pointcut("execution(public * *(..))")//设置切点
	public void startAop(){
	}
	@Before("startAop()")
	public void beforeRecord(){
		System.out.println("SPRING AOP大法好");
	}
	
	@AfterReturning("startAop()")
	public void afterRecordSuccessful(JoinPoint point) throws Exception {
		//PropertyConfigurator.configure("/Users/x72/Desktop/log4j2.properties");
		logger = Logger.getLogger(RecordRecord.class);   
		System.out.println("全世界都知道");
			BasicConfigurator.configure();
			Object[]attrs = point.getArgs();
			String attr = "";
			for(Object at : attrs){
				attr +=at;
				attr +=" ";
			}
			System.out.println("-----------------------------------------------------------");
			logger.debug("\n" + "func: " +point.getSignature() +"\n" + "Method: " + "\n" + "attrs:" + attr);
			System.out.println("-----------------------------------------------------------");
			logger.shutdown();
	}
	@AfterThrowing("startAop()")
	public void afterRecordFail(JoinPoint point){
		System.out.println("-----------------------------------------------------------");
		logger.debug("\n" + "func: " +point.getSignature() + "\n");
		System.out.println("-----------------------------------------------------------");
		logger.shutdown();

	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("一切都结束了");
	}
	
}
