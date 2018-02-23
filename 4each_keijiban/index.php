<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="UTF-8">
    <title>4eachBlog 掲示板</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
    
<body>
    <img src="4eachblog_logo.jpg">
    <header>
    <ul>
         <li>トップ</li>
         <li>プロフィール</li>
         <li>4eachについて</li>
         <li>登録フォーム</li>
         <li>問い合わせ</li>
         <li>その他</li>
    </ul>
    </header>
<main>
    <div class="main-container">
        <div class="right">
        <h1>プログラミングに役立つ掲示板</h1>
        <h4>入力フォーム</h4>
        <form method="post" action="insert.php"> 
            <div>
                <label>ハンドルネーム</label>
                <br>
                <input type="text" class="text" size="35" name="handlename">
            </div>
            <div>
                <label>タイトル</label>
                <br>
                <input type="text" class="text" size="35" name="title">
            </div>
            <div>
                <label>コメント</label>
                <br>
                <textarea cols="80" rows="7" name="comments"></textarea>
            </div>
            <div>
            <input type="submit" class="submit" value="送信する">
            </div>
        </form>
        </div>
        <div class="left">
        <h4>人気の記事</h4>

            <p>
            PHPオススメ本<br>
            PHP MyAdminの使い方<br>
            いま人気のエディタTop5<br>
            HTMLの基礎<br>
            </p>

        <h4>オススメリンク</h4>

            <p>インターノウス株式会社<br>
            XAMPPのダウンロード<br>
            Eclipseのダウンロード<br>
            Braketsのダウンロード<br>
            </p>

        <h4>カテゴリ</h4>

            <p>HTML<br>
            PHP<br>
            MySQL<br>
            Javascript
            </p>
        </div>
    </div>
    </main>
    <footer>
        copyright internous | 4each blog is the one which provodes A to Z about programming
    </footer>

</body>

</html>