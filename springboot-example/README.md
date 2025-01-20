## 01. Bootstrapping & Configuration Class [springboot-example]

#### Bootstrapping Class: ex01.ExApplication
1. 어노테이션 @SpringBootApplication
2. Application Entry Point
3. Bootstrapping 
   - 스프링 애플리케이션의 부트스트래핑: SpringApplication.run()
4. Configuration
   - SpringApplication.run() method 파라미터로 전달되는 설정(configuration) 클래스 역할

#### BootStrapping Method: SpringApplication.run(...) 내부에서 순서대로 일어 나는 일들
1. 애플리케이션 컨텍스(Application Context) 생성
2. 만약, 애플리케이션이 웹애플리케이션이면 웹애플리케이션 타입을 결정(Spring MVC or Spring Reactive Web)
3. Annotation Scan 또는 Configuration Class를 통해 Bean 생성, 등록 그리고 와이어링 작업
4. 애플리케이션 타입이 웹어플리케이션:
   1) Spring MVC
       - 내장(embeded) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성
       - 서버 인스턴스에 웹애플리에션을 배포
       - 서버 인스턴스 실행
   2) Spring Reactive Web
       - Reactor Core(spring-boot-starter-webflux)의 Non-Blocking I/O Netty 엔진 실행: Mono, Flux 
5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아서 실행 - ex02.ExApplication