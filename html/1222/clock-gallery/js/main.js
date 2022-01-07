const main = $("#main");
$.ajax({
  type: "get",
  url: "../data/bigbang.json",
  success: function fn(response) {
    const clockList = response.clock;
    let output = "";
    $.each(clockList, function (idx, item) {
      output += `
      <div class="section" style="background-image:url(${item.bg})">
      <div class="info">
        <p class="category" data-splitting>${item.category}</p>
        <h2 class="title" data-splitting>${item.title}</h2>
        <p class="depth" data-splitting>${item.depth}MM</p>
        <p class="price" data-splitting>${item.price}</p>
      </div>
    </div>
    `;
    });
    main.html(output);
    Splitting();
    main.fullpage({
      scrollBar: true,
      onLeave: function (orign, destination, direction) {
        gsap.from(`.section:nth-child(${destination.index + 1}) .char`, { y: -200, opacity: 0, ease: "bounce", duration: 1.5, stagger: { each: 0.01, from: "random" } });
      },
    });
    gsap.from(`.section:nth-child(1) .char`, { y: -200, opacity: 0, ease: "bounce", duration: 1.5, stagger: { each: 0.01, from: "random" } });
  },
});
