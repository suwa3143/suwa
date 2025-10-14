package stausPackage;

// サブクラス（スーパークラスを継承）
public class Hero extends CharacterBase {

    // コンストラクタ（親クラスのコンストラクタを呼び出す）
    public Hero(String name) {
        super(name);
        generateStatus(); // ランダムでステータスを生成
    }

    // ランダムにステータスを設定するメソッド
    public void generateStatus() {
        setHp((int)(Math.random() * 1000));       // 0〜999
        setMp((int)(Math.random() * 1000));
        setAttack((int)(Math.random() * 500));
        setSpeed((int)(Math.random() * 1000));
        setDefense((int)(Math.random() * 100));
    }
}
