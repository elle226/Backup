<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="UTF-8">
    <title>4eachBlog 掲示板</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
    
<body>
    
        <div class="logo">
            <img src="4eachblog_logo.jpg" width="300px">
        </div>

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

        <div class="main">
            <div class="left">
                <h1>プログラミングに役立つ掲示板</h1>
                <div class="form">
                <h3>入力フォーム</h3>
                <form method="post" class="form">
                    <div>
                        <label>ハンドルネーム</label>
                        <br>
                        <input type="text"class="text" size="35" name="name">
                    </div>
                    <div>
                        <label>タイトル</label>
                        <br>
                        <input type="text" class="text" size="35" name="title">
                    </div>
                    <div>
                        <label>コメント</label>
                        <br>
                        <textarea cols="35" rows="7" name="comments">
                        </textarea>
                    </div>
                    <div>
                        <input type="submit" class="submit" value="送信する">
                    </div>
                </form>
                </div>
            </div>

            <div class="right">
                <h3>人気の記事</h3>
                <ul>
                    <li>PHPオススメ本</li>
                    <li>PHP　MyAdminの使い方</li>
                    <li>いま人気のエディタTop5</li>
                    <li>HTMLの基礎</li>
                </ul>

                <h3>オススメリンク</h3>
                <ul>
                    <li>インターノウス株式会社</li>
                    <li>XAMPPのダウンロード</li>
                    <li>Eclipseのダウンロード</li>
                    <li>Braketsのダウンロード</li>
                </ul>

                <h3>カテゴリ</h3>
                <ul>
                    <li>HTML</li>
                    <li>PHP</li>
                    <li>MySQL</li>
                    <li>JavaScript</li>
                </ul>

            </div>

        </div>
    
    
    <footer>
        copyright internous | 4each blog is the one which A to Z about programming.
    </footer>
    
    
</body>

</html>