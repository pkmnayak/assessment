(this["webpackJsonpreact-api"]=this["webpackJsonpreact-api"]||[]).push([[0],{11:function(t,e,n){},13:function(t,e,n){},15:function(t,e,n){"use strict";n.r(e);var c=n(1),a=n.n(c),r=n(5),i=n.n(r),o=(n(11),n(3)),s=n.n(o),u=n(6),h=n(4),p=(n(13),n(0));var l=function(){var t=Object(c.useState)(),e=Object(h.a)(t,2),n=e[0],a=e[1],r=Object(c.useState)(),i=Object(h.a)(r,2),o=i[0],l=i[1],j=function(){var t=Object(u.a)(s.a.mark((function t(){return s.a.wrap((function(t){for(;;)switch(t.prev=t.next){case 0:console.log("city name"+o),fetch("http://localhost:8060/weather/city/"+o).then((function(t){return t.json()})).then((function(t){a(t)})).catch(console.log);case 2:case"end":return t.stop()}}),t)})));return function(){return t.apply(this,arguments)}}();return Object(p.jsx)("div",{className:"App",children:Object(p.jsxs)("header",{className:"App-header",children:["Enter City Name: example: Hyderabad,IN",Object(p.jsx)("input",{type:"text",onChange:function(t){l(t.target.value)}}),Object(p.jsx)("button",{onClick:j,children:" Search"}),JSON.stringify(n,void 0,2)]})})},j=function(t){t&&t instanceof Function&&n.e(3).then(n.bind(null,16)).then((function(e){var n=e.getCLS,c=e.getFID,a=e.getFCP,r=e.getLCP,i=e.getTTFB;n(t),c(t),a(t),r(t),i(t)}))};i.a.render(Object(p.jsx)(a.a.StrictMode,{children:Object(p.jsx)(l,{})}),document.getElementById("root")),j()}},[[15,1,2]]]);
//# sourceMappingURL=main.dd087fc8.chunk.js.map