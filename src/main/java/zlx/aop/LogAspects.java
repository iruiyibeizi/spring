package zlx.aop;

import org.aspectj.lang.annotation.*;

public class LogAspects {
    //抽取成公共切入点表达式
    @Pointcut("execution(public int zlx.aop.MathCalculator.*(..))")
    public void pointCut(){}
    @Before("pointCut()")
    public void logStart(){
        System.out.println("除法运行...参数列表是：{}");
    }
    @After("pointCut()")
    public void logEnd(){
        System.out.println("除法结束");
    }
    @AfterReturning("pointCut()")
    public void logReturn (){
        System.out.println("除法正常返回...运行结果是:{}");
    }
    @AfterThrowing("pointCut()")
    public void logExpection(){
        System.out.println("除法异常。。。异常信息:{}");
    }

}
