## Calendar_IOS

**소속**  
개인
  
**담당역할**  
Android 개발
  
## 필수 구현 목표    
 - 필수 구현 목표와 제한 사항은 반드시 지켜야 하며, 그 외는 자유롭게 구현이 가능합니다.
 - 사용자가 검색어를 입력하고 이미지 검색 결과를 화면에 표시하는 어플리케이션을 만들어야 합니다.
 - 다음 이미지 검색 API 를 사용하여 개발해야 합니다. (API 키는 본인이 직접 발급 받으셔야 합니다.
 - https://developers.kakao.com/docs/restapi/search#%EC%9D%B4%EB%AF%B8%EC%A7%80-%EA%B2%80%EC%83%89
 - 검색 결과는 JSON 형식으로 사용해야 합니다.
 - 검색어 필드는 상단에 위치해야 합니다.
 - 검색 버튼은 없어야 하며, 1초 이상 검색어 입력이 없을 경우 검색 작업을 수행합니다.
 - 검색 결과가 없거나 오류가 발생했을 경우 사용자에게 알려야 합니다.
 - 검색 결과 이미지는 원본의 가로 세로 비율을 유지하여야 하며 이미지의 가로 사이즈는 화면 폭과 동일해야 합니다.
 - 페이징을 구현해야 합니다.
 - Loading 중일 때 Loading 을 나타낼 수 있는 Indicator (Progress) 를 노출해야합니다.
 
 ## 제한 사항
  - 사용 언어 : Java
  - 사용 필수 라이브러리 : OkHttp3 / Retrofit2 / Jackson 혹은 Gson / Glide4
  - MVP 혹은 MVVM 사용
## 추가 구현 목표
 - Kotlin 사용
 - Clean Architecture 사용
 - Android Architecture 및 Android Data Binding 사용
 - Rx2 사용
 - Dagger2 사용
