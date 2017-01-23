# 2017-01-20

##レビュー
###B141301 坂下和司
####設計
シンプルに作ってあり、よいと感じた。  
履歴の処理も、ShopChargerにまとまっており、見やすくなっている。　　

引き出し処理を"負のチャージ"として実装しているのはわかりづらく感じた。  
Chargeという名前を、負でもおかしくないものに変えるか、
他から呼ぶための"引き出し"メソッドを設けて、内部的には"負のチャージ"を実行するような形の方がよかったのではと感じた。  

####コーディング規約
引数名には\_を頭に付ける、staticなら後ろに\_を付けるなど、うまく区別されている。  

####こちらに投票します




##レビュー（B141304	沼田輝明）
###◇ 設計
　・必要な機能を簡潔に実装してあり、各メソッドの用途がはっきりしていて分かり易いて良いと感じた。  
　・テスト用のクラスと要求された実装が分けられているのでテストしやすくて良い。  

###◇ コーディング規則
　・コーディング規則がしっかり定まっており、変数などの読みわけがしやすくて良いと感じた。  
 　（パラメータ名の頭文字に '_'を使う，等）  　
###◇ 投票について
　・こちらに投票します。  
