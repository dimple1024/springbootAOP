# springbootAOP

## When to use AOP?
- Cross cutting concerns like logging, execption handling, caching
 

## Behind the scenes of spring AOP
- AOP uses proxy mechanisms where a proxy object is created , and the all calls to target object happens in a new class wrapped with aspects around target object.
Proxying mechanisms: https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch08s06.html
<img width="1511" alt="image" src="https://user-images.githubusercontent.com/18646176/233779878-40dfd3de-1f86-4b27-9992-360835c7c046.png">

- AOP uses proxy mechanisms where a proxy object is created , and the all calls to target object happens in a new class wrapped with aspects around target object.

- There is runtime weaving in spring AOP i.e the Aspect weaver creates the modified ( code weaved with proxy) at runtime.

- TODO: Add link to proxy design pattern



