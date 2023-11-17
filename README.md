
# 네이버 웹툰 클론코딩 

## 프로젝트 4조
- 김대홍(팀장)
- 김하얀
- 윤채빈
- 김지원
- 박민희

## 📌 시연 영상(유튜브 링크) 

<iframe width="2543" height="754" src="https://www.youtube.com/embed/U6SiR_z5pNo" title="4조 플러터" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
<iframe width="2543" height="754" src="https://www.youtube.com/embed/7j7BKHVhSJs" title="4조 관리자 페이지" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
<iframe width="2543" height="754" src="https://www.youtube.com/embed/ipFFrg8UWJk" title="4조 ppt 영상으로" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>

## 📚 기술 스택

### Backend
https://github.com/Merhong/final-back
 <img src="https://img.shields.io/badge/Springboot-6DB33F?style=for-the-badge&logo=SpringBoot&logoColor=white">
 
### Frontend
https://github.com/Merhong/final-front
<img src="https://img.shields.io/badge/flutter-02569B?style=for-the-badge&logo=Flutter&logoColor=white"> <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white">

### 협업 도구
<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"> <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white"> <img src="https://img.shields.io/badge/Slack-4A154B?style=for-the-badge&logo=Slack&logoColor=white"> <img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white">

### 데이터베이스
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">

### 의존성





	implementation group: 'com.auth0', name: 'java-jwt', version: '4.4.0'
	implementation 'org.springframework.boot:spring-boot-starter-aop'
	implementation 'org.springframework.boot:spring-boot-starter-validation'
	implementation "org.springframework.boot:spring-boot-starter-data-jpa"
	compileOnly 'org.projectlombok:lombok'
	annotationProcessor ('org.projectlombok:lombok')
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	implementation 'org.jsoup:jsoup:1.15.3'
	implementation 'com.google.code.gson:gson:2.9.0'
	runtimeOnly 'com.h2database:h2'
	implementation 'com.google.firebase:firebase-admin:6.8.1'
	runtimeOnly 'com.mysql:mysql-connector-j'
	testImplementation 'org.springframework.restdocs:spring-restdocs-mockmvc'



## 기능 설명

웹툰, 에피소드, 작가 등 다양한 테이블과 관계를 공부하고 실습해볼 수 있는 네이버 웹툰을 클론코딩했습니다.


### 🙋‍♀️ 유저 관련 기능

- 자동 로그인
- 관심 웹툰/관심 작가 등록
- 관심 웹툰 등록시 알림 발송

### 🎨 웹툰 관련 기능

- 웹툰 에피소드 별점 주기
- 웹툰 랜덤 보기
- 최근 본 웹툰
- 웹툰 좋아요/좋아요 취소

### 🧑‍💼 관리자 페이지

- 웹툰,작가,광고 등록/수정

## 모델링 연관관계
![image](https://github.com/Merhong/final-back/assets/78343061/ef5e34d2-e9be-4303-9eee-0acf7359804f)

## 보완할 점

- 베스트 도전 장르별
- 신고하기, 차단하기
- 임시저장

## 느낀점 
