## 03. Spring Boot Web Application(Spring MVC) [springboot-webmvc]

#### 예제01: webmmvc.WebMvcApplication, 간단한 Rest Controller
1. BootStrap Class webmvc.WebMvcApplication 만들기
2. BootStrap Method SpringApplication.run() 호출 시 try ~ with resource 구문 사용하지 말 것
3. spring-boot-starter-web starter dependency 추가(spring-boot-starter core starter 생략 가능)
4. 간단한 Rest Controller 작성 및 Hanlder 작성

#### 예제02: webmmvc.WebMvcApplication, MVC Controller, thymeleaf
1. spring-boot-starter-thymeleaf starter dependency 추가 / Defaut 설정 사용해 보기
2. thymeleaf 설정 조정 (application.yml, 미세설정)
3. Handler 작성

#### 예제03: webmmvc.WebMvcApplication, 서버 포트 및 context path 조정하기
1. application.yml: 미세설정

#### 예제03: webmmvc.WebMvcApplication, dev tools 설정
1. spring-boot-devtools starter dependency 추가
2. restart/live reload 적용 (application.yml, 미세설정)
   [참고]
   1) intellij
      - File -> Setting -> Complier: Build project automatically 체크
      - File -> Setting -> Advanced Settings: Compiler -> Allow auto-make to start even if developed application is currently running 체크
      - Debug 실행
   2) chrom: LiveReload++ 설치

#### 예제04: webmmvc.WebMvcApplication, JSP 함께 사용하기 (외부 WAS에 war 배포)
1. JSTL/EL Dependency 추가
2. Tomcat Jasper Dependency 추가
3. JSTL View Reolver 설정 (application.yml, 미세설정)
4. Handler 추가
5. packaging(war) 수정
6. Spring Boot Servlet Initializer 작성하기