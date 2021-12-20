const iconList = ["search", "home", "search", "settings", "done", "info", "check_circle", "delete", "shopping_cart"];
const select = function () {
  // check more than 2 is selected
  if ($(".selected").length > 1) {
    $(".selected").removeClass("selected");
  }
  // toggle selected class
  $(this).toggleClass("selected");
};

// init
for (let i = 0; i < iconList.length; i++) {
  let x = i % 3;
  let y = (i - (i % 3)) / 3;

  // set icons & event listeners
  $(`.\\3${x + 2}  > .\\3${y + 2} `)
    .html(
      `<div style="line-height:100%"><span class="material-icons-two-tone">
  ${iconList[i]}
  </span></div>`
    )
    .on("click", function () {
      select.bind(this)();
      if ($(".selected").length == 2) {
        if ($(".selected").find("span")[0].textContent == $(".selected").find("span")[1].textContent) {
          console.log("clear");
        } else {
          console.log("wrong");
          $(".selected").removeClass("selected");
        }
      }
    });
}
