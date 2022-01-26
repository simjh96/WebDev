Splitting();

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

/*
const gnbItem = document.querySelectorAll("#gnb .list > li");
//document.querySelectorAll(찾는거) // 배열처럼 생긴 nodeList를 리턴한다.
const header = document.querySelector("#header");
console.log(gnbItem);
console.log(gnbItem.length);
for (let i = 0; i < gnbItem.length; i++) {
  gnbItem[i].addEventListener("mouseenter", function () {
    header.classList.add("open");
  });
  gnbItem[i].addEventListener("mouseleave", function () {
    header.classList.remove("open");
  });
}
*/

gsap.from("#mainVisual .slogan .main .char", { opacity: 0, x: 150, ease: "power4", duration: 1, stagger: 0.1 });
gsap.from("#mainVisual .slogan .sub .char", { opacity: 0, x: 150, ease: "power4", duration: 1, delay: 2, stagger: 0.02 });

const gnbList = $("#gnb .list > li");

const header = $("#header");

/*
// fulldown 메뉴
gnbList.on("mouseenter", function () {
  header.addClass("open");
});
gnbList.on("mouseleave", function () {
  header.removeClass("open");
});
*/
gnbList.on("mouseenter", function () {
  const selectedDepth02 = $(this).find(".depth02");
  selectedDepth02.stop().slideDown(200);
});
gnbList.on("mouseleave", function () {
  const selectedDepth02 = $(this).find(".depth02");
  selectedDepth02.stop().slideUp(100);
});
$(window).on("scroll", function () {
  //console.log($(window).scrollTop());
  const st = $(window).scrollTop();
  if (st > 0) {
    if (!header.hasClass("scroll")) {
      header.addClass("scroll");
    }
  } else {
    if (header.hasClass("scroll")) {
      header.removeClass("scroll");
    }
  }
});

const tabBox = $(".tabBox");
const tabMenu = tabBox.find(".tabMenu > ul > li");
const tabContents = tabBox.find(".tabContents > ul > li");

tabMenu.on("click", function () {
  $(this).addClass("on").siblings("li").removeClass("on");
  tabContents.hide();
  tabContents.eq($(this).index()).show();
});

const popup = $(".popup");
const btnOneday = popup.find(".oneday");
const btnClose = popup.find(".close");
btnOneday.on("click", function () {
  gsap.to(".popup", {
    duration: 1,
    top: "-100%",
    ease: "back.in",
    onComplete: function () {
      popup.remove();
    },
  });
});
