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

## 参考

* [MySQLでユーザーを作成する方法【初心者向け】 | TechAcademyマガジン](https://techacademy.jp/magazine/5110)
