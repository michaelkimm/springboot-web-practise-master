//본 Application 클라스는 앞으로 만들 프로젝트의 메인 클라스가 된다.

package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@SpringBootApplication으로 인해 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성이 모두 자동으로 설정된다.
//@SpringBootApplication이 있는 위치부터 설정을 읽어가므로, 이 클라스는 항상 프로젝트의 최상단에 위치해야 한다.
@SpringBootApplication

public class Application {
    public static void main(String[] args) {
        //SpringApplication.run으로 인해 내장 WAS (Web Application Server)를 실행한다.
        SpringApplication.run(Application.class, args);
    }
}