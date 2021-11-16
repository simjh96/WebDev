# tis_java_03

## sass-compiler 설정방법

1. extention열기
2. live-sass 검색
3. retwick이 만든 거 다운로드
4. setting 파일열기
   - format 설정
   - compact
   - compressed

`background`혹은 `background-image` 속성으로 요소에 배경 이미지를 삽입할 수 있습니다.

```javascript
const mainVisualSlider = new Swiper("#mainVisual", {
  autoplay: true,
  speed: 1000,
  effect: "fade",
  loop: true,
  navigation: {
    prevEl: "#mainVisual .prev",
    nextEl: "#mainVisual .next",
  },
});
```

---

| 제목     | 내용     | 설명                  |
| -------- | -------- | --------------------- |
| 타이틀01 | 내용없음 | 설명도 없음너ㅣㄹ언ㄹ |
| 타이틀01 | 내용없음 | 설명도 없음           |
| 타이틀01 | 내용없음 | 설명도 없음           |

```scss
@import "vars";
@import "mixins";
html {
  font-size: 10px;
}
body {
  font-size: 1.6rem;
  font-family: "Poppins", "Noto Sans KR", sans-serif;
  color: #111;
}
a {
  color: inherit;
  text-decoration: none;
}
button {
  background: none;
  border: none;
  outline: none;
}
img {
  vertical-align: top;
}
.hidden {
  display: none;
}

#header {
  position: fixed;
  width: 100%;
  height: 90px;
  overflow: hidden;
  transition: all 0.25s ease;
  z-index: 99;
  &.open {
    height: 400px;
    background-color: rgba(0, 0, 0, 0.8);
  }
  &:after {
    content: "";
    display: block;
    position: absolute;
    height: 1px;
    //width: 100%;
    left: 0px;
    right: 0px;
    top: 89px;
    //top: 89px;
    background-color: rgba(255, 255, 255, 0.5); // r(0~255),g(0~255),b(0~255),a(0~1)
  }
  .container {
    display: flex;
    justify-content: space-between;
    padding: 0 50px;
    #logo {
      a {
        display: flex;
        height: 90px;
        align-items: center;
      }
    }
    #gnb {
      text-align: center;
      color: $white-color;
      .list {
        display: flex;
        > li {
          > a {
            font-size: $medium-size;
            text-transform: capitalize;
            font-weight: 500;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 90px;
            padding: 0 50px;
          }
          .depth02 {
            li {
              a {
                display: block;
                padding: 10px 0;
              }
            }
          }
        }
      }
    }
    .etc {
      color: $white-color;
      height: 90px;
      display: flex;
      align-items: center;
      .online {
        padding: 15px 30px;
        border: 2px solid $white-color;
        border-radius: 100px;
        transition: all 0.25s ease;
        &:hover {
          background-color: $main-color;
          border-color: $main-color;
        }
      }
      .all {
        width: 50px;
        height: 50px;
        position: relative;
        span {
          display: block;
          width: 30px;
          height: 2px;
          background-color: $white-color;
          position: absolute;
          left: 10px;
          transition: all 0.25s ease;
          &:nth-child(1) {
            top: 14px;
          }
          &:nth-child(2) {
            top: 24px;
          }
          &:nth-child(3) {
            top: 34px;
          }
        }
        &.open {
          span {
            &:nth-child(1) {
              transform: rotate(-45deg);
              top: 24px;
            }
            &:nth-child(2) {
              left: -100px;
              opacity: 0;
            }
            &:nth-child(3) {
              transform: rotate(45deg);
              top: 24px;
            }
          }
        }
      }
    }
  }
}
// header end
#footer {
  background-color: $gray-color;
  color: $white-color;
  .utilMenu {
    // built in function  darken(color,10)
    // transparentize(color, 0.5)
    border-bottom: 1px solid transparentize($white-color, 0.5);
    ul {
      display: flex;
      justify-content: center;
      li {
        &:first-child a:before {
          display: none;
        }
        a {
          display: block;
          padding: 30px;
          position: relative;
          &:before {
            @include pseudo();
            @include box(1px, 10px);
            background-color: $white-color;
            left: 0;
            top: 50%;
            transform: translateY(-50%);
          }
        }
      }
    }
  }
  .addressBox {
    width: 1200px;
    margin: auto;
    padding: 50px 0;
    display: flex;
    justify-content: flex-start;
    .address {
      margin-left: 50px;
      line-height: 1.5;
      .copyright {
        margin-top: 30px;
      }
    }
    .tel {
      margin-left: auto;
      strong {
        display: block;
        font-size: 3.6rem;
        font-weight: 600;
        margin-top: 20px;
      }
    }
  }
}
```

_이탤릭체_  
**볼드**
~~취소선~~  
<u>밑줄</u>  
`<p>태그를 쓰고 싶어요</p>`

> 인용문
> 러아널ㅇㄴ
> 러ㅏ어나ㅣ렁ㄴ
> ㅓ랑너링ㄴ

![alt 태그에 들어가는 글자](./images/main/businessField01.jpg)  
![이미지를 대신할 글자 alt](./images/main/mainLink01.jpg)  
[![이미지를 대신할 글자 alt](./images/main/mainLink01.jpg)](http://www.daum.net)

[naver](http://www.naver.com)

1. 리스트01
   - 이너리스트
   - 이너리스트02
   - 이너리스트03
2. 리스트02
3. 리스트03

---

- 순서 없는 리스트
- 순서 없는 리스트
- 순서 없는 리스트
- 순서 없는 리스트

**_글자가 두껍게 됩니다._**  
~~취소선 나타내기~~  
[GOOGLE](https://google.com)

[NAVER](https://naver.com "링크 설명(title)을 작성하세요.")

[상대적 참조](../users/login)

[Dribbble][dribbble link]

[GitHub][1]

[DAUM](http://www.daum.net)  
[naver]()

문서 안에서 [참조 링크]를 그대로 사용할 수도 있습니다.

다음과 같이 문서 내 일반 URL이나 꺾쇠 괄호(`< >`, Angle Brackets)안의 URL은 자동으로 링크를 사용합니다.
구글 홈페이지: https://google.com
네이버 홈페이지: <https://naver.com>

[dribbble link]: https://dribbble.com
[1]: https://github.com
[참조 링크]: https://naver.com "네이버로 이동합니다!"

---

1. 추가
2. 추가
3. 추가

---
