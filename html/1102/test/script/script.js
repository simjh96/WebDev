
     $(document).ready(function(){
         // 대메뉴 중에서 현제 내가 마우스를 올린 대메뉴의 해당 서브메뉴만 내려온다
         $(".gnb>li").mouseover(function(){
             // this -> 내가 현제 선택한 대메뉴 위치
             $(this).children(".submenu").stop().slideDown();
         });
         // 대메뉴 영역에서 마우스가 벗어나면 서브메뉴가 올라간다
         $(".gnb>li").mouseleave(function(){
             $(this).children(".submenu").stop().slideUp();
         });
         
         // 공지사항 첫번째 글을 클릭하면 레이어 팝업이 뜬다. 
         $(".click").click(function(){
             $("#popup_bg").fadeIn();
         });
         $(".close").click(function(){
             $("#popup_bg").fadeOut();
         });
     });   