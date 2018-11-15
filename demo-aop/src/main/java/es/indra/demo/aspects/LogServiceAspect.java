package es.indra.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogServiceAspect {
	
	@Before("execution(* es.indra.demo.service.impl.*.*(..))")
    public void before(JoinPoint joinPoint) {
        //Advice
        System.out.println("log de la operacion: " + joinPoint);
    }

}
