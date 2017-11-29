$(function() {
    resizeWindow();

    // 浏览器窗口大小调整时，触发 resize 事件，之后重新调整界面高度
    $(window).resize(function() {
        resizeWindow();
    });
})

function resizeWindow() {
    // 浏览器窗口高度 - header高度 = 内容区高度
    var contentHeight = $(window).height() - 80;
    $("#left").height(contentHeight);
    $("#right").height(contentHeight);
}