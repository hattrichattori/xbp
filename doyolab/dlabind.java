// ナビゲーションバーのリンクをクリックしたときの動作
const navLinks = document.querySelectorAll('nav ul li a');
navLinks.forEach(link => {
  link.addEventListener('click', (event) => {
    event.preventDefault(); // ページ遷移をキャンセル
    const target = event.target.getAttribute('href'); // リンクのhref属性を取得
    const targetElement = document.querySelector(target); // 対象の要素を取得
    targetElement.scrollIntoView({behavior: 'smooth'}); // 対象の要素までスムーズにスクロール
  });
});

// 最近の記事のタイトルをクリックしたときの動作
const articleTitles = document.querySelectorAll('main article h2');
articleTitles.forEach(title => {
  title.addEventListener('click', () => {
    const content = title.nextElementSibling; // 親要素の次の要素を取得（記事の内容）
    content.classList.toggle('show'); // showクラスをトグルすることで表示/非表示を切り替える
  });
});
