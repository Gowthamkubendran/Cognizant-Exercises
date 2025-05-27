$(document).ready(function () {
  let visible = false;

  $('#registerBtn').click(function () {
    if (!visible) {
      $('.event-card').fadeIn(500);
      console.log("📥 Events displayed with fadeIn.");
    } else {
      $('.event-card').fadeOut(500);
      console.log("📤 Events hidden with fadeOut.");
    }
    visible = !visible;
  });
});
