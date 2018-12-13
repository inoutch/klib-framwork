# kotlin-framework
Koltinのマルチプラットフォーム向けフレームワークのサンドボックス

## 機能
- JVM, iOS, Androidでの処理の共通化(common)
- Frameworkとしてのパブリッシュとその利用(*-usage)

## 共有化
commonプロジェクトにFrameworkの共有処理を格納

## プラットフォームごとの処理
jvm, ios, androidプロジェクトに格納

## 利用方法
### Common
- dependenciesにkotlin-framework-commonを追加

### JVM
- dependenciesにkotlin-framework-jvmを追加
- main文の追加とAppの実行

### iOS
- 不明

### Android
- dependenciesにkotlin-framework-androidを追加
- AppActivityの継承と実行