const bar = document.querySelector(".bar");
const nav = document.querySelector(".navbar");
const close = document.querySelector(".close");
console.log(bar)
console.log(nav)
if(bar) {
  bar.addEventListener("click", () => {
    nav.classList.add("active");
  })
}
if(close) {
  close.addEventListener("click", () => {
    nav.classList.remove("active");
  })
}

document.addEventListener("click", function(e) {
  if (!nav.contains(e.target) && !e.target.matches(".bar")) {
    nav.classList.remove("active")
  }
})
document.querySelector(".use-Avatar").addEventListener("click", function(e) {
  document.querySelector(".profile-use").classList.toggle('active-use');
});
document.querySelector(".search-product").addEventListener("click", function(e) {
  document.querySelector(".input-search").classList.add('active-use')
  document.querySelector(".input-search").style.width = "300px";
  document.querySelector(".input-search").classList.add('.active-input')
})