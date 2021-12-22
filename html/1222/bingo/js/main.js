// 시계 뒤집기랑 합치면 재밌겠다

const iconList = ["search", "home", "search", "settings", "done", "done", "info", "check_circle", "settings"];
const select = function () {
  // check more than 2 is selected
  if ($(".selected").length > 1) {
    $(".selected").removeClass("selected");
  }
  // toggle selected class
  $(this).toggleClass("selected");
};

const match = function (ori_cord, comp_cord) {
  $(`[data-cord="${ori_cord[0]},${ori_cord[1]}"]`).find("span")[0].textContent == $(`[data-cord="${comp_cord[0]},${comp_cord[1]}"]`).find("span")[0].textContent;
};

const dfs = function (r_cord, d_cord, record, answer, turns = 0, dirc = [0, 0], debug = 0) {
  // void: assigned at answer[0]
  if (turns < 4) {
    // console.log(" ".repeat(debug) + "=======================");
    // console.log(" ".repeat(debug) + `r_cord:${r_cord}, d_cord:${d_cord}, record:${record}, turns:${turns}, dirc:${dirc}`);
    let root = $(`[data-cord="${r_cord[0]},${r_cord[1]}"]`);

    if (dirc.some((x) => x) && root.hasClass("block")) {
      // console.log(" ".repeat(debug) + "===is block===");
      if (r_cord.every((v, i) => v == d_cord[i])) {
        // console.log(" ".repeat(debug) + "===is path===");
        // console.log(" ".repeat(debug) + record);
        answer[0] = record;
      }
    } else {
      const dircs = [
        [-1, 0],
        [0, 1],
        [1, 0],
        [0, -1],
      ];
      for (let i = 0; i < dircs.length; i++) {
        const _dirc = dircs[i];
        if (r_cord[0] + _dirc[0] in [0, 1, 2, 3, 4] && r_cord[1] + _dirc[1] in [0, 1, 2, 3, 4] && _dirc.some((v, i, arr) => v + dirc[i])) {
          let _r_cord = r_cord.map((v, i) => v + _dirc[i]);
          // console.log(" ".repeat(debug) + "===in range=== && ===in dirc===");
          // console.log(" ".repeat(debug) + `_r_cord : ${_r_cord}`);
          dfs(_r_cord, d_cord, record.concat([_r_cord]), answer, turns + !dirc.every((v, i) => v == _dirc[i]), _dirc, debug + 1);
        }
      }
    }
  }
};

const offset = function (cord) {
  // x: left, y: height
  let b = $(`[data-cord="${cord[0]},${cord[1]}"]`)[0];
  return [b.offsetLeft + b.offsetWidth / 2, b.offsetTop + b.offsetHeight / 2];
};

const line = function (path) {
  let output = "";
  for (let i = 0; i < path.length; i++) {
    if (i + 1 < path.length) {
      // console.log(output);
      let xy = offset(path[i]);
      let _xy = offset(path[i + 1]);
      output += `<line x1="${xy[0]}" y1="${xy[1]}" x2="${_xy[0]}" y2="${_xy[1]}" style="stroke:transparent;stroke-width:2px" />`;
    }
  }
  return `<svg style="position: absolute">` + output + `</svg>`;
};

const putIcon = function (cord) {
  // put icon as html
  null;
};

const addListener = function (cord) {
  // add action
  null;
};

const eachBlock = function (size) {
  // choose random pair and put icon sequencially && give '.block' && give addListener
  null;
};

const genBoard = function (size) {
  // generate board of size
  null;
};

let size = 3;

// init
for (let i = 0; i < iconList.length; i++) {
  let r = (i - (i % size)) / size;
  let c = i % size;

  // set icons & event listeners
  $(`*[data-cord="${r + 1},${c + 1}"]`)
    .html(
      `<div style="line-height:100%"><span class="material-icons-two-tone">
  ${iconList[i]}
  </span></div>`
    )
    .addClass("block")
    // actions (selecting, matching)
    .on("click", function () {
      select.bind(this)();
      let selected = $(".selected");
      if (selected.length == 2) {
        if (selected.find("span")[0].textContent == selected.find("span")[1].textContent) {
          let answer = [];
          let root = $(selected[0]);
          let dest = $(selected[1]);
          let r_cord = [root.data("cord")[0], root.data("cord")[2]].map((x) => Number(x));
          let d_cord = [dest.data("cord")[0], dest.data("cord")[2]].map((x) => Number(x));

          dfs(r_cord, d_cord, [r_cord], answer);

          if (answer.length) {
            $(".wrap").append(line(answer[0]));

            const tl = gsap.timeline();
            tl.to("line", 0.1, { stroke: "blue", stagger: 0.1 });
            tl.to(selected, { scale: 0, rotateZ: 360 });
            tl.fromTo(
              "line",
              0.2,
              { x: -1 },
              { x: 1, ease: RoughEase.ease.config({ strength: 8, points: 20, template: Linear.easeNone, randomize: false }), clearProps: "x", onComplete: () => $("line").remove() }
            );

            selected.removeClass("block");
          } else {
            // no path
            gsap.fromTo(selected, 0.1, { rotateY: -10 }, { rotateY: 10, ease: RoughEase.ease.config({ strength: 8, points: 20, template: Linear.easeNone, randomize: false }), clearProps: "x" });
            selected.removeClass("selected");
          }
        } else {
          // totally wrong
          gsap.fromTo(selected, 0.3, { rotateX: -15 }, { rotateX: 15, ease: RoughEase.ease.config({ strength: 8, points: 20, template: Linear.easeNone, randomize: false }), clearProps: "x" });
          selected.removeClass("selected");
        }
      }
    });
}
