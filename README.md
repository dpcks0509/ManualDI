# Android DI(Dependency Injection)
이 코드는 [테드박의 안드로이드 앱 개발 : 확장성과 유지보수에 용이한 클린 아키텍처](https://fastcampus.co.kr/dev_online_clean) 강의에서 사용된 샘플 프로젝트입니다.
- Part 4. 의존성 주입(DI) - DI 직접 구현하기 / Hilt / Koin

강의를 수강하시면서 이 프로젝트의 소스코드를 직접 살펴보시면 확실하게 이해가 되실겁니다.<br>

<br><br>
## DI..직접 해보신적 있으신가요?
- 많은 안드로이드 개발자들은 Hilt나 Koin과 같은 라이브러리를 통해 DI를 구현하지만, **직접 DI를 구현해본 개발자는 드뭅니다.**
- DI라는 개념을 알고 있고 Hilt, Koin을 익숙하게 많이 사용해봤지만 여러분들은 **DI를 직접 구현해보신적이 있으신가요?**
- 이 프로젝트에서는 DI를 직접 구현하는 방식을 포함하여, 안드로이드에서 DI를 구현하는 세 가지 방법을 각각의 브랜치로 나누어 제공합니다.

<br><br>
## 스크린샷
<img src="screenshots/movie.png" width="200"/>
<br><br>

## Branch별 구현
이 프로젝트는 각 샘플앱을 각각의 Branch로 나누어서 구현합니다.<br>
|     Branch     | 설명 |
| ------------- | ------------- |
| [main](https://github.com/ParkSangGwon/ManualDI/tree/main) | 직접 DI를 구현 |
| [hilt](https://github.com/ParkSangGwon/ManualDI/tree/hilt) | 직접 구현한 DI를 Hilt로 변환 |
| [koin](https://github.com/ParkSangGwon/ManualDI/tree/koin) | 직접 구현한 DI를 Koin으로 변환 |
| [koin-annotations](https://github.com/ParkSangGwon/ManualDI/tree/koin-annotations) | 기존 Koin 코드를 Koin Anntations를 이용해서 변환 |


<br><br>
## 설정
### API KEY
이 영화 프로젝트 앱을 실행하기 위해서는 [TMDB API Key](https://developer.themoviedb.org/reference/intro/getting-started)를 발급받아서 설정해야 합니다.

- `local.properties` file에 발급받은 API Key를 입력해주세요
```properties
api_key=<발급받은 TMDB API KEY>
```

<br><br>
## 클린 아키텍처 강의
이 프로젝트 코드를 살펴보시고 '클린 아키텍처'강의에 관심이 생기셨다면 지금 바로 강의를 수강해보세요.<br>
아래 쿠폰코드 입력하시면 2만원 할인된 가격으로 수강하실 수 있습니다.<br>
- 쿠폰코드: PRDTEA240919_b
- https://bit.ly/ted-clean-architecture-blog

