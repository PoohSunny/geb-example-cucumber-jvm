ASBCのセッションの準備用このプロジェクトです。cucumber-Geb-Spockを用いたTDDのデモで利用する予定です。
環境の構築のため、以下のリポジトリをフォークしています。

# cucumberテストの起動方法

```bash
# Mac
$ ./gradlew cucumber
# Windows
$ gradlew.bat cucumber
```

## ブラウザを変えて実行したい場合
下記のように、パラメータを追加してください。

```bash
# Chromeで実行する場合
$ ./gradlew cucumber -Dgeb.env=chrome
# PhantomJSで実行する場合
$ gradlew.bat cucumber -Dgeb.env=phantomjs
```
