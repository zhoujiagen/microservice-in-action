# Errors

## Spring Cloud Config

### Config Server start failed

```
Caused by: org.springframework.beans.factory.BeanCreationException: Cannot create binder factory, no `META-INF/spring.binders` resources found on the classpath
	at org.springframework.cloud.stream.config.BinderFactoryConfiguration.binderTypeRegistry(BinderFactoryConfiguration.java:153) ~[spring-cloud-stream-2.0.0.RC1.jar:2.0.0.RC1]
	at org.springframework.cloud.stream.config.BinderFactoryConfiguration$$EnhancerBySpringCGLIB$$36e0300f.CGLIB$binderTypeRegistry$1(<generated>) ~[spring-cloud-stream-2.0.0.RC1.jar:2.0.0.RC1]
	at org.springframework.cloud.stream.config.BinderFactoryConfiguration$$EnhancerBySpringCGLIB$$36e0300f$$FastClassBySpringCGLIB$$b95e6206.invoke(<generated>) ~[spring-cloud-stream-2.0.0.RC1.jar:2.0.0.RC1]
	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228) ~[spring-core-5.0.4.RELEASE.jar:5.0.4.RELEASE]
	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:361) ~[spring-context-5.0.4.RELEASE.jar:5.0.4.RELEASE]
	at org.springframework.cloud.stream.config.BinderFactoryConfiguration$$EnhancerBySpringCGLIB$$36e0300f.binderTypeRegistry(<generated>) ~[spring-cloud-stream-2.0.0.RC1.jar:2.0.0.RC1]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_112]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_112]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_112]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_112]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:154) ~[spring-beans-5.0.4.RELEASE.jar:5.0.4.RELEASE]
	... 96 common frames omitted
```

Add:

```
<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter-stream-kafka</artifactId>
</dependency>
```
