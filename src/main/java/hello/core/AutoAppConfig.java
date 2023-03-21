package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 탐색할 기본 페키지 위치를 지정한다.
        // basePackages = "hello.core",
        // basePackageClasses = AutoAppConfig.class,
        // 패키지 위치를 지정하지 않으면, 현제 클래스, 현재 클래스가 속해있는 패키지 부터 탐색한다. -> 권장사항
        // AppConfig가 @Configuration이다. 자동으로 컨테이너에 등록되는걸 막기 위해서 예외처리 한다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
