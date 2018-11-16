package es.indra.demoblog.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogAspect {

	@Before("execution(* es.indra.demoblog.service.impl.*.*(..))")
	public void antesDeLosMetodos(JoinPoint join) {

		System.out.println("Dentro del aspecto para: " + join);

	}

	@Around("@annotation(es.indra.demoblog.aspects.annotations.MedidorDeTiempo)")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long inicio = System.currentTimeMillis();

		joinPoint.proceed();

		long tiempo = System.currentTimeMillis() - inicio;
		System.out.println("Tiempo de ejecucion: " + tiempo + "ms");
	}

}
