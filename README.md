# Portfolio

Compose for Web (Kotlin/JS) で作成したポートフォリオサイトです。
GitHub Pages で公開しています: https://suzukibelltree.github.io/Portfolio_site/

## 構成

- [composeApp/src/jsMain/kotlin](./composeApp/src/jsMain/kotlin) — サイト本体
  - `section/` — ヘッダー・プロフィール・成果物・技術スタックなどの各セクション
- [composeApp/src/jsMain/resources](./composeApp/src/jsMain/resources) — 開発用の `index.html`
- [docs](./docs) — GitHub Pages 公開用のファイル(ビルド成果物と画像)

## 開発用サーバーの起動

```shell
./gradlew :composeApp:jsBrowserDevelopmentRun
```

## 公開用ビルド

```shell
./gradlew :composeApp:jsBrowserDistribution
```

`composeApp/build/dist/js/productionExecutable/composeApp.js` を `docs/` にコピーしてコミットすると、GitHub Pages に反映されます。
