package zlx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class LogAspects {
    //抽取成公共切入点表达式
    @Pointcut("execution(public int zlx.aop.MathCalculator.*(..))")
    public void pointCut(){}
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println("除法运行...参数列表是：{}"+joinPoint.getSignature().getName());
    }
    @After("pointCut()")
    public void logEnd(){
        System.out.println("除法结束");
    }
    @AfterReturning(value = "pointCut()",returning = "return1")
    public void logReturn (Object return1){
        System.out.println("除法正常返回...运行结果是:{}"+return1);
    }
    @AfterThrowing("pointCut()")
    public void logExpection(){
        System.out.println("除法异常。。。异常信息:{}");
    }

}
