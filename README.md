# mybatis-demo
Mybatisを使ったWebアプリサンプル
DBはxamppのMariaDBを使用。

## DB

```sql
-- DB作成
create database mybatis_db

-- ユーザー作成
grant all on mybatis_db.* to mybatis@localhost identified by 'mybatis';

-- テーブル作成
create table userinfo (id char(5) NOT NULL PRIMARY KEY,
--                        name varchar(255),
--                        sex char(1)); 

-- データ投入
INSERT INTO userinfo VALUES ('00001','来栖翔','男');
INSERT INTO userinfo VALUES ('00002','小野寺梓','女');
commit

-- 確認
SELECT * FROM userinfo;
```
## Docker

```
cd docker
docker-compose build
```

## 参考

### MySQL

* [MySQLでユーザーを作成する方法【初心者向け】 | TechAcademyマガジン](https://techacademy.jp/magazine/5110)
* [MySQL ::その他のMySQLドキュメント](https://dev.mysql.com/doc/index-other.html)
* [【MYSQL入門】ユーザー作成の方法を解説！8.0からの変更点も紹介 | 侍エンジニア塾ブログ（SAMURAI BLOG） - プログラミング入門者向けサイト](HTTPS://WWW.SEJUKU.NET/BLOG/82303)
* [MySQL :: Other MySQL Documentation](https://dev.mysql.com/doc/index-other.html)

### MyBatis

* [MyBatisジェネレーターコア–MyBatisジェネレーターの紹介](https://mybatis.org/generator/)

### Docker

* [Dockerイメージとコンテナの削除方法 - Qiita](https://qiita.com/tifa2chan/items/e9aa408244687a63a0ae)
* [mysql-Dockerハブ](https://hub.docker.com/_/mysql)
* [DockerでMySQLを使ってみる - Qiita](https://qiita.com/TAMIYAN/items/ed9ec892d91e5af962c6)
* [Compose ファイル・リファレンス — Docker-docs-ja 17.06 ドキュメント](http://docs.docker.jp/compose/compose-file.html)
* [docker-compose の ports 指定まとめ - Qiita](https://qiita.com/tksugimoto/items/23fcce1b067661e8aa46)
* [docker-composeでMySQLのrootパスワードを忘れた場合 - Qiita](https://qiita.com/rope19181/items/09722f9db62baf53a4b0)